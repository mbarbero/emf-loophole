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
package org.eclipselabs.emf.loophole.internal.model.metadata;

import org.eclipse.emf.ecore.EFactory;

import org.eclipselabs.emf.loophole.internal.model.GenGapModel;
import org.eclipselabs.emf.loophole.internal.model.GenGapPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage
 * @generated
 */
public interface LoopholeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LoopholeFactory eINSTANCE = org.eclipselabs.emf.loophole.internal.model.impl.BasicLoopholeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gen Gap Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Gap Model</em>'.
	 * @generated
	 */
	GenGapModel createGenGapModel();

	/**
	 * Returns a new object of class '<em>Gen Gap Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gen Gap Package</em>'.
	 * @generated
	 */
	GenGapPackage createGenGapPackage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LoopholePackage getLoopholePackage();

} //LoopholeFactory
