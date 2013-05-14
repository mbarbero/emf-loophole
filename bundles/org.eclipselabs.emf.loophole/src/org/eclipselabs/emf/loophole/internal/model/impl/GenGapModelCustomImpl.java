/*******************************************************************************
 * Copyright (c) 2013 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipselabs.emf.loophole.internal.model.impl;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipselabs.emf.loophole.internal.model.GenGapModel;
import org.eclipselabs.emf.loophole.internal.model.GenGapPackage;
import org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapModelImpl;
import org.eclipselabs.emf.loophole.internal.model.metadata.LoopholeFactory;

/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikael Barbero</a>
 * 
 */
public class GenGapModelCustomImpl extends BasicGenGapModelImpl {

	@Override
	public boolean reconcile() {
		
		GenModel genModel = getGenModel();
	    if (genModel == null || genModel.eIsProxy() || genModel.eResource() == null)
	    {
	      return false;
	    } else {
		    genModel.reconcile();
			for (Iterator<GenGapPackage> i = getGenGapPackages().iterator(); i.hasNext();) {
				GenGapPackage genPackage = i.next();
				if (!genPackage.reconcile()) {
					i.remove();
				}
			}
			
			for (GenPackage genPackage : getMissingGenPackages()) {
		        GenGapPackage genGapPackage = LoopholeFactory.eINSTANCE.createGenGapPackage();
		        genGapPackage.setGenPackage(genPackage);
		        getGenGapPackages().add(genGapPackage);
		        if (!genGapPackage.reconcile())
		        {
		          getGenGapPackages().remove(genPackage);
		        }
		      }

		      return !getGenGapPackages().isEmpty();
	    }
	}

	protected List<GenPackage> getMissingGenPackages() {
		List<GenPackage> missingGenPackages = new UniqueEList<GenPackage>();
		for (GenPackage genPackage : getGenModel().getGenPackages()) {
			if (findGenGapPackage(genPackage) == null) {
				missingGenPackages.add(genPackage);
			}
		}
		return missingGenPackages;
	}
	
	public GenGapPackage findGenGapPackage(GenPackage genPackage) {
		for (GenGapPackage genGapPackage : getGenGapPackages()) {
			if (genGapPackage.getGenPackage() == genPackage) {
				return genGapPackage;
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapModelImpl#reconcile(org.eclipselabs.emf.loophole.internal.model.GenGapModel)
	 */
	@Override
	public boolean reconcile(GenGapModel oldGenGapModel) {
		boolean result = false;
	    if (oldGenGapModel != null)
	    {
	      setGenModel(oldGenGapModel.getGenModel());
	    	
	      for (GenGapPackage genGapPackage : getGenGapPackages())
	      {
	        for (GenGapPackage oldGenGapPackage : oldGenGapModel.getGenGapPackages())
	        {
	          if (genGapPackage.reconcile(oldGenGapPackage))
	          {
	            result = true;
	            break;
	          }
	        }
	      }

	      reconcileSettings(oldGenGapModel);
	    }

	    return result;
	}

	/**
	 * @param oldGenGapModel
	 */
	public void reconcileSettings(GenGapModel oldGenGapModel) {
		setCleanEditDirectory(oldGenGapModel.isCleanEditDirectory());
		setCleanModelDirectory(oldGenGapModel.isCleanModelDirectory());
		
		setCustomClassNamePattern(oldGenGapModel.getCustomClassNamePattern());
		
		setCustomEditDirectory(oldGenGapModel.getCustomEditDirectory());
		setCustomModelDirectory(oldGenGapModel.getCustomModelDirectory());
		
		setGenerateCustomClasses(oldGenGapModel.isGenerateCustomClasses());
		setGenerateCustomProviders(oldGenGapModel.isGenerateCustomProviders());
	}
	
	public void initialize(GenModel genModel) {
		if (genModel != getGenModel()) {
			setGenModel(genModel);
		}
		
		String modelDirectory = genModel.getModelDirectory();
		if (modelDirectory != null && modelDirectory.trim().length() > 0) {
			setCustomModelDirectory(manualDirectory(modelDirectory));
		}
		
		String editDirectory = genModel.getEditDirectory();
		if (editDirectory != null && editDirectory.trim().length() > 0) {
			setCustomEditDirectory(manualDirectory(editDirectory));
		}
		
		for (GenPackage genPackage : genModel.getGenPackages()) {
			GenGapPackage genGapPackage = LoopholeFactory.eINSTANCE.createGenGapPackage();
			getGenGapPackages().add(genGapPackage);
			((GenGapPackageCustomImpl) genGapPackage).initialize(genPackage);
		}
	}

	private String manualDirectory(String directory) {
		int lastIndexOf = directory.lastIndexOf("/");
		String manualDirectory = directory.substring(0, lastIndexOf) + "/src-man";
		return manualDirectory;
	}

}
