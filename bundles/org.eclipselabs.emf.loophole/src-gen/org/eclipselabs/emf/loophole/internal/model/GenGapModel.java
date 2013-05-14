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

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gen Gap Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getGenModel <em>Gen Model</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomClassNamePattern <em>Custom Class Name Pattern</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#isGenerateCustomClasses <em>Generate Custom Classes</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomModelDirectory <em>Custom Model Directory</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#isCleanModelDirectory <em>Clean Model Directory</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#isGenerateCustomProviders <em>Generate Custom Providers</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomEditDirectory <em>Custom Edit Directory</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#isCleanEditDirectory <em>Clean Edit Directory</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getGenGapPackages <em>Gen Gap Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#getGenGapModel()
 * @model
 * @generated
 */
public interface GenGapModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Gen Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Model</em>' reference.
	 * @see #setGenModel(GenModel)
	 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#getGenGapModel_GenModel()
	 * @model
	 * @generated
	 */
	GenModel getGenModel();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getGenModel <em>Gen Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gen Model</em>' reference.
	 * @see #getGenModel()
	 * @generated
	 */
	void setGenModel(GenModel value);

	/**
	 * Returns the value of the '<em><b>Custom Class Name Pattern</b></em>' attribute.
	 * The default value is <code>"{0}CustomImpl"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Class Name Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Class Name Pattern</em>' attribute.
	 * @see #isSetCustomClassNamePattern()
	 * @see #unsetCustomClassNamePattern()
	 * @see #setCustomClassNamePattern(String)
	 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#getGenGapModel_CustomClassNamePattern()
	 * @model default="{0}CustomImpl" unsettable="true"
	 * @generated
	 */
	String getCustomClassNamePattern();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomClassNamePattern <em>Custom Class Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Class Name Pattern</em>' attribute.
	 * @see #isSetCustomClassNamePattern()
	 * @see #unsetCustomClassNamePattern()
	 * @see #getCustomClassNamePattern()
	 * @generated
	 */
	void setCustomClassNamePattern(String value);

	/**
	 * Unsets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomClassNamePattern <em>Custom Class Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCustomClassNamePattern()
	 * @see #getCustomClassNamePattern()
	 * @see #setCustomClassNamePattern(String)
	 * @generated
	 */
	void unsetCustomClassNamePattern();

	/**
	 * Returns whether the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomClassNamePattern <em>Custom Class Name Pattern</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Custom Class Name Pattern</em>' attribute is set.
	 * @see #unsetCustomClassNamePattern()
	 * @see #getCustomClassNamePattern()
	 * @see #setCustomClassNamePattern(String)
	 * @generated
	 */
	boolean isSetCustomClassNamePattern();

	/**
	 * Returns the value of the '<em><b>Generate Custom Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Custom Classes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Custom Classes</em>' attribute.
	 * @see #setGenerateCustomClasses(boolean)
	 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#getGenGapModel_GenerateCustomClasses()
	 * @model
	 * @generated
	 */
	boolean isGenerateCustomClasses();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#isGenerateCustomClasses <em>Generate Custom Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Custom Classes</em>' attribute.
	 * @see #isGenerateCustomClasses()
	 * @generated
	 */
	void setGenerateCustomClasses(boolean value);

	/**
	 * Returns the value of the '<em><b>Custom Model Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Model Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Model Directory</em>' attribute.
	 * @see #isSetCustomModelDirectory()
	 * @see #unsetCustomModelDirectory()
	 * @see #setCustomModelDirectory(String)
	 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#getGenGapModel_CustomModelDirectory()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCustomModelDirectory();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomModelDirectory <em>Custom Model Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Model Directory</em>' attribute.
	 * @see #isSetCustomModelDirectory()
	 * @see #unsetCustomModelDirectory()
	 * @see #getCustomModelDirectory()
	 * @generated
	 */
	void setCustomModelDirectory(String value);

	/**
	 * Unsets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomModelDirectory <em>Custom Model Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCustomModelDirectory()
	 * @see #getCustomModelDirectory()
	 * @see #setCustomModelDirectory(String)
	 * @generated
	 */
	void unsetCustomModelDirectory();

	/**
	 * Returns whether the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomModelDirectory <em>Custom Model Directory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Custom Model Directory</em>' attribute is set.
	 * @see #unsetCustomModelDirectory()
	 * @see #getCustomModelDirectory()
	 * @see #setCustomModelDirectory(String)
	 * @generated
	 */
	boolean isSetCustomModelDirectory();

	/**
	 * Returns the value of the '<em><b>Clean Model Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clean Model Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clean Model Directory</em>' attribute.
	 * @see #setCleanModelDirectory(boolean)
	 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#getGenGapModel_CleanModelDirectory()
	 * @model
	 * @generated
	 */
	boolean isCleanModelDirectory();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#isCleanModelDirectory <em>Clean Model Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clean Model Directory</em>' attribute.
	 * @see #isCleanModelDirectory()
	 * @generated
	 */
	void setCleanModelDirectory(boolean value);

	/**
	 * Returns the value of the '<em><b>Generate Custom Providers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generate Custom Providers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generate Custom Providers</em>' attribute.
	 * @see #setGenerateCustomProviders(boolean)
	 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#getGenGapModel_GenerateCustomProviders()
	 * @model
	 * @generated
	 */
	boolean isGenerateCustomProviders();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#isGenerateCustomProviders <em>Generate Custom Providers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generate Custom Providers</em>' attribute.
	 * @see #isGenerateCustomProviders()
	 * @generated
	 */
	void setGenerateCustomProviders(boolean value);

	/**
	 * Returns the value of the '<em><b>Custom Edit Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Edit Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Edit Directory</em>' attribute.
	 * @see #isSetCustomEditDirectory()
	 * @see #unsetCustomEditDirectory()
	 * @see #setCustomEditDirectory(String)
	 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#getGenGapModel_CustomEditDirectory()
	 * @model unsettable="true"
	 * @generated
	 */
	String getCustomEditDirectory();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomEditDirectory <em>Custom Edit Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Edit Directory</em>' attribute.
	 * @see #isSetCustomEditDirectory()
	 * @see #unsetCustomEditDirectory()
	 * @see #getCustomEditDirectory()
	 * @generated
	 */
	void setCustomEditDirectory(String value);

	/**
	 * Unsets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomEditDirectory <em>Custom Edit Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCustomEditDirectory()
	 * @see #getCustomEditDirectory()
	 * @see #setCustomEditDirectory(String)
	 * @generated
	 */
	void unsetCustomEditDirectory();

	/**
	 * Returns whether the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomEditDirectory <em>Custom Edit Directory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Custom Edit Directory</em>' attribute is set.
	 * @see #unsetCustomEditDirectory()
	 * @see #getCustomEditDirectory()
	 * @see #setCustomEditDirectory(String)
	 * @generated
	 */
	boolean isSetCustomEditDirectory();

	/**
	 * Returns the value of the '<em><b>Clean Edit Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clean Edit Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clean Edit Directory</em>' attribute.
	 * @see #setCleanEditDirectory(boolean)
	 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#getGenGapModel_CleanEditDirectory()
	 * @model
	 * @generated
	 */
	boolean isCleanEditDirectory();

	/**
	 * Sets the value of the '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#isCleanEditDirectory <em>Clean Edit Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clean Edit Directory</em>' attribute.
	 * @see #isCleanEditDirectory()
	 * @generated
	 */
	void setCleanEditDirectory(boolean value);

	/**
	 * Returns the value of the '<em><b>Gen Gap Packages</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage}.
	 * It is bidirectional and its opposite is '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getGenGapModel <em>Gen Gap Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gen Gap Packages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gen Gap Packages</em>' containment reference list.
	 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#getGenGapModel_GenGapPackages()
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getGenGapModel
	 * @model opposite="genGapModel" containment="true"
	 * @generated
	 */
	EList<GenGapPackage> getGenGapPackages();

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
	boolean reconcile(GenGapModel genGapModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialize(GenModel genModel);

} // GenGapModel
