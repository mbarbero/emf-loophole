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
package org.eclipselabs.emf.loophole.internal.model;

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Gap Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getGenPackage <em>Gen Package</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getCustomClassPackageSuffix <em>Custom Class Package Suffix</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getCustomProviderPackageSuffix <em>Custom Provider Package Suffix</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getNestedGenGapPackages <em>Nested Gen Gap Packages</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getSuperGenGapPackage <em>Super Gen Gap Package</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getGenGapModel <em>Gen Gap Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#getGenGapPackage()
 * @model
 * @generated
 */
public interface GenGapPackage extends EObject {
	/**
	 * Returns the value of the '<em><b>Gen Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Package</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Package</em>' reference.
	 * @see #setGenPackage(GenPackage)
	 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#getGenGapPackage_GenPackage()
	 * @model
	 * @generated
	 */
	GenPackage getGenPackage();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getGenPackage <em>Gen Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Package</em>' reference.
	 * @see #getGenPackage()
	 * @generated
	 */
	void setGenPackage(GenPackage value);

	/**
	 * Returns the value of the '<em><b>Custom Class Package Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Class Package Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Class Package Suffix</em>' attribute.
	 * @see #isSetCustomClassPackageSuffix()
	 * @see #unsetCustomClassPackageSuffix()
	 * @see #setCustomClassPackageSuffix(String)
	 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#getGenGapPackage_CustomClassPackageSuffix()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCustomClassPackageSuffix();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getCustomClassPackageSuffix <em>Custom Class Package Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Class Package Suffix</em>' attribute.
	 * @see #isSetCustomClassPackageSuffix()
	 * @see #unsetCustomClassPackageSuffix()
	 * @see #getCustomClassPackageSuffix()
	 * @generated
	 */
	void setCustomClassPackageSuffix(String value);

	/**
	 * Unsets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getCustomClassPackageSuffix <em>Custom Class Package Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCustomClassPackageSuffix()
	 * @see #getCustomClassPackageSuffix()
	 * @see #setCustomClassPackageSuffix(String)
	 * @generated
	 */
	void unsetCustomClassPackageSuffix();

	/**
	 * Returns whether the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getCustomClassPackageSuffix <em>Custom Class Package Suffix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Custom Class Package Suffix</em>' attribute is set.
	 * @see #unsetCustomClassPackageSuffix()
	 * @see #getCustomClassPackageSuffix()
	 * @see #setCustomClassPackageSuffix(String)
	 * @generated
	 */
	boolean isSetCustomClassPackageSuffix();

	/**
	 * Returns the value of the '<em><b>Custom Provider Package Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Provider Package Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Provider Package Suffix</em>' attribute.
	 * @see #isSetCustomProviderPackageSuffix()
	 * @see #unsetCustomProviderPackageSuffix()
	 * @see #setCustomProviderPackageSuffix(String)
	 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#getGenGapPackage_CustomProviderPackageSuffix()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCustomProviderPackageSuffix();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getCustomProviderPackageSuffix <em>Custom Provider Package Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Provider Package Suffix</em>' attribute.
	 * @see #isSetCustomProviderPackageSuffix()
	 * @see #unsetCustomProviderPackageSuffix()
	 * @see #getCustomProviderPackageSuffix()
	 * @generated
	 */
	void setCustomProviderPackageSuffix(String value);

	/**
	 * Unsets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getCustomProviderPackageSuffix <em>Custom Provider Package Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCustomProviderPackageSuffix()
	 * @see #getCustomProviderPackageSuffix()
	 * @see #setCustomProviderPackageSuffix(String)
	 * @generated
	 */
	void unsetCustomProviderPackageSuffix();

	/**
	 * Returns whether the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getCustomProviderPackageSuffix <em>Custom Provider Package Suffix</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Custom Provider Package Suffix</em>' attribute is set.
	 * @see #unsetCustomProviderPackageSuffix()
	 * @see #getCustomProviderPackageSuffix()
	 * @see #setCustomProviderPackageSuffix(String)
	 * @generated
	 */
	boolean isSetCustomProviderPackageSuffix();

	/**
	 * Returns the value of the '<em><b>Nested Gen Gap Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage}.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getSuperGenGapPackage <em>Super Gen Gap Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Gen Gap Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Gen Gap Packages</em>' containment reference list.
	 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#getGenGapPackage_NestedGenGapPackages()
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getSuperGenGapPackage
	 * @model opposite="superGenGapPackage" containment="true"
	 * @generated
	 */
	EList<GenGapPackage> getNestedGenGapPackages();

	/**
	 * Returns the value of the '<em><b>Super Gen Gap Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getNestedGenGapPackages <em>Nested Gen Gap Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Gen Gap Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Gen Gap Package</em>' container reference.
	 * @see #setSuperGenGapPackage(GenGapPackage)
	 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#getGenGapPackage_SuperGenGapPackage()
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getNestedGenGapPackages
	 * @model opposite="nestedGenGapPackages" transient="false"
	 * @generated
	 */
	GenGapPackage getSuperGenGapPackage();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getSuperGenGapPackage <em>Super Gen Gap Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Gen Gap Package</em>' container reference.
	 * @see #getSuperGenGapPackage()
	 * @generated
	 */
	void setSuperGenGapPackage(GenGapPackage value);

	/**
	 * Returns the value of the '<em><b>Gen Gap Model</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getGenGapPackages <em>Gen Gap Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Gap Model</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Gap Model</em>' container reference.
	 * @see #setGenGapModel(GenGapModel)
	 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#getGenGapPackage_GenGapModel()
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapModel#getGenGapPackages
	 * @model opposite="genGapPackages" transient="false"
	 * @generated
	 */
	GenGapModel getGenGapModel();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getGenGapModel <em>Gen Gap Model</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Gap Model</em>' container reference.
	 * @see #getGenGapModel()
	 * @generated
	 */
	void setGenGapModel(GenGapModel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean reconcile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean reconcile(GenGapPackage genGapPackage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize(GenPackage genPackage);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getCustomQualifiedClassName(GenClass genClass);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getCustomQualifiedProviderClassName(GenClass genClass);

} // GenGapPackage
