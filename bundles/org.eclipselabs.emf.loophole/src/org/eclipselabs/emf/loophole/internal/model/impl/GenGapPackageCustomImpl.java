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

import java.text.MessageFormat;
import java.util.Iterator;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipselabs.emf.loophole.internal.model.GenGapPackage;
import org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapPackageImpl;
import org.eclipselabs.emf.loophole.internal.model.metadata.LoopholeFactory;

/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikael Barbero</a>
 * 
 */
public class GenGapPackageCustomImpl extends BasicGenGapPackageImpl {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapPackageImpl#reconcile()
	 */
	@Override
	public boolean reconcile() {
		GenPackage genPackage = getGenPackage();
		if (genPackage == null || genPackage.eIsProxy() || genPackage.eResource() == null) {
			return false;
		} else {
			for (Iterator<GenGapPackage> i = getNestedGenGapPackages().iterator(); i.hasNext();) {
				GenGapPackage nestedGenGapPackage = i.next();
				if (!nestedGenGapPackage.reconcile()) {
					i.remove();
				}
			}

			initialize(genPackage);
			return true;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapPackageImpl#reconcile(org.eclipselabs.emf.loophole.internal.model.GenGapPackage)
	 */
	@Override
	public boolean reconcile(GenGapPackage oldGenGapPackage) {
		if (genPackage != null) {
			if (genPackage.getEcorePackage().getNsURI() == null?
					genPackage.getEcorePackage().getName().equals(oldGenGapPackage.getGenPackage().getEcorePackage().getName()) :
					genPackage.getEcorePackage().getNsURI().equals(oldGenGapPackage.getGenPackage().getEcorePackage().getNsURI())) {
				for (GenGapPackage nestedGenGapPackage : getNestedGenGapPackages()) {
			        for (GenGapPackage oldNestedGenGapPackage : oldGenGapPackage.getNestedGenGapPackages()) {
			          if (nestedGenGapPackage.reconcile(oldNestedGenGapPackage)) {
			            break;
			          }
			        }
			      }
				reconcileSettings(oldGenGapPackage);
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * @param oldGenGapPackage
	 */
	public void reconcileSettings(GenGapPackage oldGenGapPackage) {
		setCustomClassPackageSuffix(oldGenGapPackage.getCustomClassPackageSuffix());
		setCustomProviderPackageSuffix(oldGenGapPackage.getCustomProviderPackageSuffix());
	}

	/**
	 * @param ePackage
	 */
	public void initialize(GenPackage genPackage) {
		if (genPackage != getGenPackage()) {
			setGenPackage(genPackage);
			
			setCustomClassPackageSuffix(genPackage.getClassPackageSuffix());
			setCustomProviderPackageSuffix(genPackage.getProviderPackageSuffix());
		}
		
		for (GenPackage nestedGenPackage : genPackage.getNestedGenPackages()) {
			GenGapPackage nestedGenGapPackage = LoopholeFactory.eINSTANCE.createGenGapPackage();
			getNestedGenGapPackages().add(nestedGenGapPackage);
			((GenGapPackageCustomImpl) nestedGenGapPackage).initialize(nestedGenPackage);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapPackageImpl#findGenGapPackage(org.eclipse.emf.codegen.ecore.genmodel.GenPackage)
	 */
	public GenGapPackage findGenGapPackage(GenPackage genPackage) {
		for (GenGapPackage genGapPackage : getNestedGenGapPackages()) {
			if (genGapPackage.getGenPackage() == genPackage) {
				return genGapPackage;
			}
		}
		return null;
	}
	
	protected String getCustomClassName(GenClass genClass) {
	    return MessageFormat.format(getGenGapModel().getCustomClassNamePattern(), genClass.getName());
	}
	
	/** 
	 * {@inheritDoc}
	 * @see org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapPackageImpl#getCustomQualifiedClassName(org.eclipse.emf.codegen.ecore.genmodel.GenClass)
	 */
	@Override
	public String getCustomQualifiedClassName(GenClass genClass) {
		if (getCustomClassPackageSuffix() != null) {
			return genClass.getGenPackage().getQualifiedPackageName() + "." + getCustomClassPackageSuffix() + "." + getCustomClassName(genClass);
		} else {
			return genClass.getGenPackage().getClassPackageName() + "." + getCustomClassName(genClass);
		}
	}
	
	protected String getCustomProviderClassName(GenClass genClass) {
	    return MessageFormat.format(getGenGapModel().getCustomClassNamePattern(), genClass.getProviderClassName());
	}
	
	/** 
	 * {@inheritDoc}
	 * @see org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapPackageImpl#getCustomQualifiedProviderClassName(org.eclipse.emf.codegen.ecore.genmodel.GenClass)
	 */
	@Override
	public String getCustomQualifiedProviderClassName(GenClass genClass) {
		if (getCustomProviderPackageSuffix() != null) {
			return genClass.getGenPackage().getQualifiedPackageName() + "." + getCustomProviderPackageSuffix() + "." + getCustomProviderClassName(genClass);
		} else {
			return genPackage.getProviderPackageName() + "." + getCustomProviderClassName(genClass);
		}
	}
}
