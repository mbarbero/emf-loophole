/**
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *      Obeo - initial API and implementation
 */
package org.eclipselabs.emf.loophole.ui.internal.model.editor;

import java.io.File;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class GenModelURIPage extends WizardPage implements Listener {
	protected Text uriText;
	protected Button browseFileSystemButton;
	protected Button browseWorkspaceButton;
	private URI fileURI;

	public GenModelURIPage(String pageName) {
		super(pageName);
		setPageComplete(false);
	}

	@Override
	public void dispose() {
		if (uriText != null) {
			uriText.removeListener(SWT.Modify, this);
			uriText = null;
		}
		if (browseFileSystemButton != null) {
			browseFileSystemButton.removeListener(SWT.Selection, this);
			browseFileSystemButton = null;
		}
		if (browseWorkspaceButton != null) {
			browseWorkspaceButton.removeListener(SWT.Selection, this);
			browseWorkspaceButton = null;
		}

		super.dispose();
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH
				| GridData.GRAB_VERTICAL));

		GridLayout layout = new GridLayout();
		layout.verticalSpacing = 8;
		composite.setLayout(layout);

		createURIControl(composite);
		addControl(composite);
		setControl(composite);
	}

	public URI getGenModelURI() {
		return fileURI;
	}

	protected void createURIControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL
				| GridData.GRAB_HORIZONTAL));
		{
			FormLayout layout = new FormLayout();
			layout.marginTop = 10;
			layout.spacing = 10;
			composite.setLayout(layout);
		}

		Label uriLabel = new Label(composite, SWT.LEFT);
		{
			FormData data = new FormData();
			data.left = new FormAttachment(0);
			uriLabel.setLayoutData(data);
		}
		uriLabel.setText(getURITextLabel());

		Composite uriComposite = new Composite(composite, SWT.NONE);
		{
			FormData data = new FormData();
			data.top = new FormAttachment(uriLabel, 5);
			data.left = new FormAttachment(0);
			data.right = new FormAttachment(100);
			uriComposite.setLayoutData(data);

			GridLayout layout = new GridLayout(2, false);
			layout.marginTop = -5;
			layout.marginLeft = -5;
			layout.marginRight = -5;
			uriComposite.setLayout(layout);
		}

		Composite buttonComposite = new Composite(composite, SWT.NONE);
		{
			FormData data = new FormData();
			data.top = new FormAttachment(uriLabel, 0, SWT.CENTER);
			data.left = new FormAttachment(uriLabel, 0);
			data.right = new FormAttachment(100);
			buttonComposite.setLayoutData(data);

			FormLayout layout = new FormLayout();
			layout.marginTop = 0;
			layout.marginBottom = 0;
			layout.marginLeft = 0;
			layout.marginRight = 0;
			layout.spacing = 5;
			buttonComposite.setLayout(layout);
		}

		browseFileSystemButton = new Button(buttonComposite, SWT.PUSH);
		browseFileSystemButton.setText(getBrowseFileSystemButtonLabel());
		browseFileSystemButton.addListener(SWT.Selection, this);

		browseWorkspaceButton = new Button(buttonComposite, SWT.PUSH);
		browseWorkspaceButton.setText(getBrowseWorkspaceButtonLabel());
		browseWorkspaceButton.addListener(SWT.Selection, this);

		{
			FormData data = new FormData();
			data.right = new FormAttachment(browseWorkspaceButton);
			browseFileSystemButton.setLayoutData(data);
		}

		{
			FormData data = new FormData();
			data.right = new FormAttachment(100);
			browseWorkspaceButton.setLayoutData(data);
		}

		uriText = new Text(uriComposite, SWT.SINGLE | SWT.BORDER);
		setURIText(getURITextInitialValue());
		if (uriText.getText().length() > 0) {
			uriText.selectAll();
		}
		uriText.addListener(SWT.Modify, this);

		addURIControl(uriComposite);

		{
			GridData gridData = new GridData(GridData.FILL_HORIZONTAL
					| GridData.GRAB_HORIZONTAL);
			if (uriComposite.getChildren().length == 1) {
				gridData.horizontalSpan = 2;
			}
			uriText.setLayoutData(gridData);
		}
	}

	protected String getURITextLabel() {
		return "";
	}

	protected String getBrowseFileSystemButtonLabel() {
		return "Browse File System...";
	}

	protected String getBrowseWorkspaceButtonLabel() {
		return "Browse Workspace...";
	}

	protected String getURITextInitialValue() {
		return "";
	}

	protected void addURIControl(Composite parent) {
		// Subclasses may override
	}

	protected void addControl(Composite parent) {
		// Subclasses may override
	}

	public void handleEvent(Event event) {
		if (event.type == SWT.Modify && event.widget == uriText) {
			uriTextModified(uriText.getText().trim());
		} else if (event.type == SWT.Selection
				&& event.widget == browseFileSystemButton) {
			browseFileSystem();
		} else if (event.type == SWT.Selection
				&& event.widget == browseWorkspaceButton) {
			browseWorkspace();
		}

		getContainer().updateButtons();
	}

	protected void uriTextModified(String text) {
		setErrorMessage(null);
		setMessage(null);
		fileURI = URI.createURI(text);
		setPageComplete(URIConverter.INSTANCE.exists(fileURI, null));
	}

	protected void setURIText(String uri) {
		uri = uri.trim();
		StringBuffer text = new StringBuffer(uriText.getText());
		if (!uri.equals(text)) {
			uriText.setText(uri.trim());
		}
	}

	protected boolean browseFileSystem() {
		FileDialog fileDialog = new FileDialog(getShell(), SWT.OPEN | SWT.SINGLE);
		fileDialog.setFilterExtensions(getFilterExtensions());

		if (fileDialog.open() != null && fileDialog.getFileNames().length > 0) {
			String[] fileNames = fileDialog.getFileNames();
			StringBuffer text = new StringBuffer();
			for (int i = 0; i < fileNames.length; ++i) {
				String filePath = fileDialog.getFilterPath() + File.separator
						+ fileNames[i];
				text.append(URI.createFileURI(filePath).toString());
				text.append(" ");
			}
			setURIText(text.toString());
			return true;
		}
		return false;
	}

	private String[] getFilterExtensions() {
		return new String[] { "*.genmodel" };
	}

	protected boolean browseWorkspace() {
		ViewerFilter extensionFilter = new ViewerFilter() {
			@Override
			public boolean select(Viewer viewer, Object parentElement,
					Object element) {
				return !(element instanceof IFile)
						|| "genmodel".contains(((IFile) element)
								.getFileExtension());
			}
		};

		IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(),
				null, null, false, null,
				Collections.singletonList(extensionFilter));
		if (files.length > 0) {
			StringBuffer text = new StringBuffer();
			for (int i = 0; i < files.length; ++i) {
				if (isValidWorkspaceResource(files[i])) {
					text.append(URI.createPlatformResourceURI(files[i]
							.getFullPath().toString(), true));
					text.append(" ");
				}
			}
			setURIText(text.toString());
			return true;
		}
		return false;
	}

	protected boolean isValidWorkspaceResource(IResource resource) {
		if (resource.getType() == IResource.FILE) {
			String[] filterExtensions = getFilterExtensions();
			if (filterExtensions.length > 0) {
				for (int i = 0; i < filterExtensions.length; i++) {
					if (filterExtensions[i].endsWith(".*")
							|| filterExtensions[i].endsWith("."
									+ resource.getFileExtension())) {
						return true;
					}
				}
			}

		}
		return false;
	}

}
