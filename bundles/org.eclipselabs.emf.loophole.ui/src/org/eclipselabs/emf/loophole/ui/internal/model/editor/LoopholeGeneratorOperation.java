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

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.generator.GenBaseGeneratorAdapter;
import org.eclipse.emf.codegen.ecore.genmodel.presentation.GeneratorUIUtil.GeneratorOperation;
import org.eclipse.swt.widgets.Shell;
import org.eclipselabs.emf.loophole.internal.model.GenGapModel;

public class LoopholeGeneratorOperation extends GeneratorOperation {

	private GenGapModel genGapModel;

	public LoopholeGeneratorOperation(Shell arg0, List<Object[]> arg1) {
		super(arg0, arg1);
	}

	public LoopholeGeneratorOperation(Shell arg0) {
		super(arg0);
	}
	
	@Override
	protected void execute(IProgressMonitor progressMonitor) throws CoreException, InvocationTargetException, InterruptedException {
		SubMonitor subMonitor = SubMonitor.convert(progressMonitor, 100);
		if (genGapModel != null) {
			GenModel genModel = genGapModel.getGenModel();
			for (Object[] generatorAndArguments : generatorAndArgumentsList) {
				if (genGapModel.isCleanModelDirectory() && GenBaseGeneratorAdapter.MODEL_PROJECT_TYPE.equals(generatorAndArguments[2])) {
					IFolder modelFolder = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(genModel.getModelDirectory()));
					modelFolder.delete(true, subMonitor.newChild(10));
				}
				if (genGapModel.isCleanEditDirectory() && GenBaseGeneratorAdapter.EDIT_PROJECT_TYPE.equals(generatorAndArguments[2])) {
					IFolder editFolder = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(genModel.getEditDirectory()));
					editFolder.delete(true, subMonitor.newChild(10));
				} 
			}
		}
		subMonitor.setWorkRemaining(80);
		super.execute(subMonitor.newChild(80));
	}
	
	public void setGenGapModel(GenGapModel genGapModel) {
		this.genGapModel = genGapModel;
	}

}
