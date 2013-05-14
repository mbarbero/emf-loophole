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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.CodeGenEcorePlugin;
import org.eclipse.emf.codegen.ecore.generator.Generator;
import org.eclipse.emf.codegen.ecore.genmodel.GenBase;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.provider.GenModelEditPlugin;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.emf.edit.ui.action.ControlAction;
import org.eclipse.emf.edit.ui.action.EditingDomainActionBarContributor;
import org.eclipse.emf.edit.ui.action.LoadResourceAction;
import org.eclipse.emf.edit.ui.action.ValidateAction;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IContributionManager;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkingSet;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipselabs.emf.loophole.internal.model.GenGapModel;
import org.eclipselabs.emf.loophole.internal.model.GenGapPackage;
import org.eclipselabs.emf.loophole.ui.internal.LoopholeUIPlugin;

/**
 * This is the action bar contributor for the Loophole model editor.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LoopholeActionBarContributor
	extends EditingDomainActionBarContributor
	implements ISelectionChangedListener {
	/**
	 * This keeps track of the active editor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IEditorPart activeEditorPart;

	/**
	 * This keeps track of the current selection provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ISelectionProvider selectionProvider;

	/**
	 * This action opens the Properties view.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IAction showPropertiesViewAction =
		new Action(LoopholeUIPlugin.INSTANCE.getString("_UI_ShowPropertiesView_menu_item")) //$NON-NLS-1$
		{
			@Override
			public void run() {
				try {
					getPage().showView("org.eclipse.ui.views.PropertySheet"); //$NON-NLS-1$
				}
				catch (PartInitException exception) {
					LoopholeUIPlugin.INSTANCE.log(exception);
				}
			}
		};

	/**
	 * This action refreshes the viewer of the current editor if the editor
	 * implements {@link org.eclipse.emf.common.ui.viewer.IViewerProvider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IAction refreshViewerAction =
		new Action(LoopholeUIPlugin.INSTANCE.getString("_UI_RefreshViewer_menu_item")) //$NON-NLS-1$
		{
			@Override
			public boolean isEnabled() {
				return activeEditorPart instanceof IViewerProvider;
			}

			@Override
			public void run() {
				if (activeEditorPart instanceof IViewerProvider) {
					Viewer viewer = ((IViewerProvider)activeEditorPart).getViewer();
					if (viewer != null) {
						viewer.refresh();
					}
				}
			}
		};

	/**
	 * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateChildAction} corresponding to each descriptor
	 * generated for the current selection by the item provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> createChildActions;

	/**
	 * This is the menu manager into which menu contribution items should be added for CreateChild actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMenuManager createChildMenuManager;

	/**
	 * This will contain one {@link org.eclipse.emf.edit.ui.action.CreateSiblingAction} corresponding to each descriptor
	 * generated for the current selection by the item provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<IAction> createSiblingActions;

	/**
	 * This is the menu manager into which menu contribution items should be added for CreateSibling actions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IMenuManager createSiblingMenuManager;

	/**
	 * This creates an instance of the contributor.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopholeActionBarContributor() {
		super(ADDITIONS_LAST_STYLE);
		loadResourceAction = new LoadResourceAction();
		validateAction = new ValidateAction();
		controlAction = new ControlAction();
	}

	/**
	 * This adds Separators for editor additions to the tool bar.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void contributeToToolBar(IToolBarManager toolBarManager) {
		toolBarManager.add(new Separator("loophole-settings")); //$NON-NLS-1$
		toolBarManager.add(new Separator("loophole-additions")); //$NON-NLS-1$
	}

	/**
	 * This adds to the menu bar a menu and some separators for editor additions,
	 * as well as the sub-menus for object creation items.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void contributeToMenu(IMenuManager menuManager) {
		super.contributeToMenu(menuManager);

		generateMenuManager =
			      new MenuManager(GenModelEditPlugin.INSTANCE.getString("_UI_Generate_menu"), "org.eclipse.emf.codegen.ecore.genmodelMenuID");
			    menuManager.insertAfter("additions", generateMenuManager);
			    generateMenuManager.add(generateModelAction);
			    generateMenuManager.add(generateEditAction);
			    generateMenuManager.add(generateEditorAction);
			    generateMenuManager.add(generateTestsAction);
			    generateMenuManager.add(generateAllAction);
		
		IMenuManager submenuManager = new MenuManager(LoopholeUIPlugin.INSTANCE.getString("_UI_LoopholeEditor_menu"), "org.eclipselabs.emf.loophole.internal.modelMenuID"); //$NON-NLS-1$ //$NON-NLS-2$
		menuManager.insertAfter("additions", submenuManager); //$NON-NLS-1$
		submenuManager.add(new Separator("settings")); //$NON-NLS-1$
		submenuManager.add(new Separator("actions")); //$NON-NLS-1$
		submenuManager.add(new Separator("additions")); //$NON-NLS-1$
		submenuManager.add(new Separator("additions-end")); //$NON-NLS-1$

		// Prepare for CreateChild item addition or removal.
		//
		createChildMenuManager = new MenuManager(LoopholeUIPlugin.INSTANCE.getString("_UI_CreateChild_menu_item")); //$NON-NLS-1$
		submenuManager.insertBefore("additions", createChildMenuManager); //$NON-NLS-1$

		// Prepare for CreateSibling item addition or removal.
		//
		createSiblingMenuManager = new MenuManager(LoopholeUIPlugin.INSTANCE.getString("_UI_CreateSibling_menu_item")); //$NON-NLS-1$
		submenuManager.insertBefore("additions", createSiblingMenuManager); //$NON-NLS-1$

		// Force an update because Eclipse hides empty menus now.
		//
		submenuManager.addMenuListener
			(new IMenuListener() {
				 public void menuAboutToShow(IMenuManager menuManager) {
					 menuManager.updateAll(true);
				 }
			 });

		addGlobalActions(submenuManager);
	}

	/**
	 * When the active editor changes, this remembers the change and registers with it as a selection provider.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiveEditor(IEditorPart part) {
		super.setActiveEditor(part);
		activeEditorPart = part;

		// Switch to the new selection provider.
		//
		if (selectionProvider != null) {
			selectionProvider.removeSelectionChangedListener(this);
		}
		if (part == null) {
			selectionProvider = null;
		}
		else {
			selectionProvider = part.getSite().getSelectionProvider();
			selectionProvider.addSelectionChangedListener(this);

			// Fake a selection changed event to update the menus.
			//
			if (selectionProvider.getSelection() != null) {
				selectionChanged(new SelectionChangedEvent(selectionProvider, selectionProvider.getSelection()));
			}
		}
	}
	
	/**
	 * This implements {@link org.eclipse.jface.viewers.ISelectionChangedListener},
	 * handling {@link org.eclipse.jface.viewers.SelectionChangedEvent}s by querying for the children and siblings
	 * that can be added to the selected object and updating the menus accordingly.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void selectionChanged(SelectionChangedEvent event) {
		IContributionItem[] items = generateMenuManager.getItems();
	    for (int i = 0, len = items.length; i < len; i++) items[i].update();

	}

	/**
	 * This populates the specified <code>manager</code> with {@link org.eclipse.jface.action.ActionContributionItem}s
	 * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection,
	 * by inserting them before the specified contribution item <code>contributionID</code>.
	 * If <code>contributionID</code> is <code>null</code>, they are simply added.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void populateManager(IContributionManager manager, Collection<? extends IAction> actions, String contributionID) {
		if (actions != null) {
			for (IAction action : actions) {
				if (contributionID != null) {
					manager.insertBefore(contributionID, action);
				}
				else {
					manager.add(action);
				}
			}
		}
	}
		
	/**
	 * This removes from the specified <code>manager</code> all {@link org.eclipse.jface.action.ActionContributionItem}s
	 * based on the {@link org.eclipse.jface.action.IAction}s contained in the <code>actions</code> collection.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void depopulateManager(IContributionManager manager, Collection<? extends IAction> actions) {
		if (actions != null) {
			IContributionItem[] items = manager.getItems();
			for (int i = 0; i < items.length; i++) {
				// Look into SubContributionItems
				//
				IContributionItem contributionItem = items[i];
				while (contributionItem instanceof SubContributionItem) {
					contributionItem = ((SubContributionItem)contributionItem).getInnerItem();
				}

				// Delete the ActionContributionItems with matching action.
				//
				if (contributionItem instanceof ActionContributionItem) {
					IAction action = ((ActionContributionItem)contributionItem).getAction();
					if (actions.contains(action)) {
						manager.remove(contributionItem);
					}
				}
			}
		}
	}

	/**
	 * This populates the pop-up menu before it appears.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void menuAboutToShow(IMenuManager menuManager) {
		
		generateAllAction.setEnabled(generateAllAction.isEnabled());
	    generateTestsAction.setEnabled(generateTestsAction.isEnabled());
	    generateEditorAction.setEnabled(generateEditorAction.isEnabled());
	    generateEditAction.setEnabled(generateEditAction.isEnabled());
	    generateModelAction.setEnabled(generateModelAction.isEnabled());
		
	    super.menuAboutToShow(menuManager);

	    menuManager.insertBefore("edit", new Separator("generate-actions"));
	    menuManager.insertAfter("generate-actions", generateAllAction);
	    menuManager.insertAfter("generate-actions", generateTestsAction);
	    menuManager.insertAfter("generate-actions", generateEditorAction);
	    menuManager.insertAfter("generate-actions", generateEditAction);
	    menuManager.insertAfter("generate-actions", generateModelAction);
	}

	/**
	 * This inserts global actions before the "additions-end" separator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void addGlobalActions(IMenuManager menuManager) {
		menuManager.insertAfter("additions-end", new Separator("ui-actions")); //$NON-NLS-1$ //$NON-NLS-2$
		menuManager.insertAfter("ui-actions", showPropertiesViewAction); //$NON-NLS-1$

		refreshViewerAction.setEnabled(refreshViewerAction.isEnabled());		
		menuManager.insertAfter("ui-actions", refreshViewerAction); //$NON-NLS-1$

		super.addGlobalActions(menuManager);
	}

	/**
	 * This ensures that a delete action will clean up all references to deleted objects.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean removeAllReferencesOnDelete() {
		return true;
	}

	/**
	   * This gets the selection from the active editor.
	   */
	  protected ISelection getActiveEditorSelection()
	  {
	    return activeEditorPart == null ? null :
	      ((ISelectionProvider)activeEditorPart).getSelection();
	  }
	
	
	/**
	   * This is the menu manager for the "Generate" menu.
	   */
	  protected IMenuManager generateMenuManager;

	  protected IAction generateModelAction = new GenerateAction
	    (GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE,
	     CodeGenEcorePlugin.INSTANCE.getString("_UI_ModelProject_name"),
	     GenModelEditPlugin.INSTANCE.getString("_UI_GenerateModel_menu_item"));

	  protected IAction generateEditAction = new GenerateAction
	    (GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE,
	     CodeGenEcorePlugin.INSTANCE.getString("_UI_EditProject_name"),
	     GenModelEditPlugin.INSTANCE.getString("_UI_GenerateEdit_menu_item"));

	  protected IAction generateEditorAction = new GenerateAction
	    (GenBaseGeneratorAdapter.EDITOR_PROJECT_TYPE,
	     CodeGenEcorePlugin.INSTANCE.getString("_UI_EditorProject_name"),
	     GenModelEditPlugin.INSTANCE.getString("_UI_GenerateEditor_menu_item"));

	  protected IAction generateTestsAction = new GenerateAction
	    (GenBaseGeneratorAdapter.TESTS_PROJECT_TYPE ,
	     CodeGenEcorePlugin.INSTANCE.getString("_UI_TestsProject_name"),
	     GenModelEditPlugin.INSTANCE.getString("_UI_GenerateTests_menu_item"));

	  protected IAction generateAllAction = new GenerateAction
	  (new ProjectType[]
	   {
	     new ProjectType(GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE, CodeGenEcorePlugin.INSTANCE.getString("_UI_ModelProject_name")),
	     new ProjectType(GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE, CodeGenEcorePlugin.INSTANCE.getString("_UI_EditProject_name")),
	     new ProjectType(GenBaseGeneratorAdapter.EDITOR_PROJECT_TYPE, CodeGenEcorePlugin.INSTANCE.getString("_UI_EditorProject_name")),
	     new ProjectType(GenBaseGeneratorAdapter.TESTS_PROJECT_TYPE, CodeGenEcorePlugin.INSTANCE.getString("_UI_TestsProject_name"))
	   },
	   GenModelEditPlugin.INSTANCE.getString("_UI_GenerateAll_menu_item"));

	  /**
	   * This implements the "Generate..." actions.
	   */
	  protected class GenerateAction extends Action
	  {
	    private final ProjectType[] projectTypes;
	    private Generator generator;

	    public GenerateAction(Object projectType, String projectTypeName, String text)
	    {
	      super(text);
	      this.projectTypes = new ProjectType[] { new ProjectType(projectType, projectTypeName) };
	    }

	    public GenerateAction(ProjectType[] projectTypes, String text)
	    {
	      super(text);
	      this.projectTypes = projectTypes;
	    }

	    @Override
	    public boolean isEnabled()
	    {
	      if (activeEditorPart instanceof LoopholeEditor)
	      {
	        generator = ((LoopholeEditor)activeEditorPart).getGenerator();
	      }

	      if (generator == null)
	      {
	        return false;
	      }

	      ISelection s = getActiveEditorSelection();
	      if (!(s instanceof IStructuredSelection))
	      {
	        return false;
	      }

	      IStructuredSelection ss = (IStructuredSelection)s;
	      if (ss.size() == 0)
	      {
	        return false;
	      }

	      for (Object object : ss.toList())
	      {
	        boolean canGenerateObject = false;
	        final Object unwrap;
			if (object instanceof GenGapModel) {
	        	unwrap = ((GenGapModel) object).getGenModel();
	        } else if (object instanceof GenGapPackage) {
	        	unwrap = ((GenGapPackage) object).getGenPackage();
	        } else {
	        	unwrap = object;
	        }

	        for (int i = 0; i < projectTypes.length; i++)
	        {
	          if (generator.canGenerate(unwrap, projectTypes[i].getType()))
	          {
	            canGenerateObject = true;
	          }
	        }

	        if (!canGenerateObject)
	        {
	          return false;
	        }
	      }
	      return true;
	    }

	    @Override
	    public void run()
	    {
	    	generator.requestInitialize();
	    	LoopholeGeneratorOperation operation =
	        new LoopholeGeneratorOperation(activeEditorPart.getSite().getShell());
	      operation.setRootDiagnosticMessage(getText());

	      GenModel genModel = null;
	      GenGapModel genGapModel = null;
	      Collection<?> selection = ((IStructuredSelection)getActiveEditorSelection()).toList();
	      for (Object object : selection)
	      {
	        for (int i = 0; i < projectTypes.length; i++)
	        {
	          GenBase genBase = null;
	          if (object instanceof GenGapModel)
	          {
	            genGapModel = (GenGapModel) object;
				genModel = genGapModel.getGenModel();
	            genBase = genModel;
	          }
	          if (object instanceof GenGapPackage)
	          {
	            genBase = ((GenGapPackage) object).getGenPackage();
	            genGapModel = ((GenGapPackage) object).getGenGapModel();
	            
				genModel = genBase.getGenModel();
	          }
	          operation.addGeneratorAndArguments(generator, genBase, projectTypes[i].getType(), projectTypes[i].getName());
	        }
	      }
	      operation.setGenGapModel(genGapModel);

	      Set<IProject> projects = new HashSet<IProject>();
	      Set<IWorkingSet> workingSets = new HashSet<IWorkingSet>();
	      if (genModel != null)
	      {
	        IProject project = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(genModel.getModelDirectory())).getProject();
	        if (project != null)
	        {
	          IWorkbench workbench = PlatformUI.getWorkbench();
	          for (IWorkingSet workingSet : workbench.getWorkingSetManager().getAllWorkingSets())
	          {
	            IAdaptable[] elements = workingSet.getElements();
	            for (IAdaptable element : elements)
	            {
	              if (project.equals(element.getAdapter(IProject.class)))
	              {
	                workingSets.add(workingSet);
	                continue;
	              }
	            }
	          }
	          if (!workingSets.isEmpty())
	          {
	            for (int i = 0; i < projectTypes.length; i++)
	            {
	              Object projectType = projectTypes[i].getType();
	              if (GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE.equals(projectType))
	              {
	                IProject editProject = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(genModel.getEditDirectory())).getProject();
	                if (!editProject.exists())
	                {
	                  projects.add(editProject);
	                }
	              }
	              if (GenBaseGeneratorAdapter.EDITOR_PROJECT_TYPE.equals(projectType))
	              {
	                IProject editorProject = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(genModel.getEditorDirectory())).getProject();
	                if (!editorProject.exists())
	                {
	                  projects.add(editorProject);
	                }
	              }
	              if (GenBaseGeneratorAdapter.TESTS_PROJECT_TYPE.equals(projectType))
	              {
	                IProject testsProject = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(genModel.getTestsDirectory())).getProject();
	                if (!testsProject.exists())
	                {
	                  projects.add(testsProject);
	                }
	              }
	            }
	          }
	        }
	      }

	      // This runs the options, and shows progress.
	      // (It appears to be a bad thing to fork this onto another thread.)
	      //
	      try
	      {
	        new ProgressMonitorDialog(activeEditorPart.getSite().getShell()).run(true, true, operation);

	        if (!projects.isEmpty())
	        {
	          for (IWorkingSet workingSet : workingSets)
	          {
	            List<IAdaptable> elements = new ArrayList<IAdaptable>(Arrays.asList(workingSet.getElements()));
	            elements.addAll(projects);
	            workingSet.setElements(workingSet.adaptElements(elements.toArray(new IAdaptable[elements.size()])));
	          }
	        }
	      }
	      catch (Exception exception)
	      {
	        // Something went wrong that shouldn't.
	        //
	        GenModelEditPlugin.INSTANCE.log(exception);
	      }
	    }
	  }

	  protected static class ProjectType
	  {
	    protected Object type;
	    protected String name;

	    public ProjectType(Object type, String name)
	    {
	      this.type = type;
	      this.name = name;
	    }

	    public Object getType()
	    {
	      return type;
	    }

	    public String getName()
	    {
	      return name;
	    }
	  }
}
