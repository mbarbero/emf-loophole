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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholeFactory
 * @model kind="package"
 * @generated
 */
public interface LoopholePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "loophole"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipselabs.emf.loophole:1.0.0"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "loophole"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LoopholePackage eINSTANCE = org.eclipselabs.emf.loophole.internal.model.impl.BasicLoopholePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapModelImpl <em>Gen Gap Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapModelImpl
	 * @see org.eclipselabs.emf.loophole.internal.model.impl.BasicLoopholePackageImpl#getGenGapModel()
	 * @generated
	 */
	int GEN_GAP_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Gen Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_GAP_MODEL__GEN_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Custom Class Name Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_GAP_MODEL__CUSTOM_CLASS_NAME_PATTERN = 1;

	/**
	 * The feature id for the '<em><b>Generate Custom Classes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_GAP_MODEL__GENERATE_CUSTOM_CLASSES = 2;

	/**
	 * The feature id for the '<em><b>Custom Model Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_GAP_MODEL__CUSTOM_MODEL_DIRECTORY = 3;

	/**
	 * The feature id for the '<em><b>Clean Model Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_GAP_MODEL__CLEAN_MODEL_DIRECTORY = 4;

	/**
	 * The feature id for the '<em><b>Generate Custom Providers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_GAP_MODEL__GENERATE_CUSTOM_PROVIDERS = 5;

	/**
	 * The feature id for the '<em><b>Custom Edit Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_GAP_MODEL__CUSTOM_EDIT_DIRECTORY = 6;

	/**
	 * The feature id for the '<em><b>Clean Edit Directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_GAP_MODEL__CLEAN_EDIT_DIRECTORY = 7;

	/**
	 * The feature id for the '<em><b>Gen Gap Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_GAP_MODEL__GEN_GAP_PACKAGES = 8;

	/**
	 * The number of structural features of the '<em>Gen Gap Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_GAP_MODEL_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapPackageImpl <em>Gen Gap Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapPackageImpl
	 * @see org.eclipselabs.emf.loophole.internal.model.impl.BasicLoopholePackageImpl#getGenGapPackage()
	 * @generated
	 */
	int GEN_GAP_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Gen Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_GAP_PACKAGE__GEN_PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Custom Class Package Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_GAP_PACKAGE__CUSTOM_CLASS_PACKAGE_SUFFIX = 1;

	/**
	 * The feature id for the '<em><b>Custom Provider Package Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_GAP_PACKAGE__CUSTOM_PROVIDER_PACKAGE_SUFFIX = 2;

	/**
	 * The feature id for the '<em><b>Nested Gen Gap Packages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_GAP_PACKAGE__NESTED_GEN_GAP_PACKAGES = 3;

	/**
	 * The feature id for the '<em><b>Super Gen Gap Package</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_GAP_PACKAGE__SUPER_GEN_GAP_PACKAGE = 4;

	/**
	 * The feature id for the '<em><b>Gen Gap Model</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_GAP_PACKAGE__GEN_GAP_MODEL = 5;

	/**
	 * The number of structural features of the '<em>Gen Gap Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEN_GAP_PACKAGE_FEATURE_COUNT = 6;


	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel <em>Gen Gap Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Gap Model</em>'.
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapModel
	 * @generated
	 */
	EClass getGenGapModel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getGenModel <em>Gen Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Model</em>'.
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapModel#getGenModel()
	 * @see #getGenGapModel()
	 * @generated
	 */
	EReference getGenGapModel_GenModel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomClassNamePattern <em>Custom Class Name Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Class Name Pattern</em>'.
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomClassNamePattern()
	 * @see #getGenGapModel()
	 * @generated
	 */
	EAttribute getGenGapModel_CustomClassNamePattern();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#isGenerateCustomClasses <em>Generate Custom Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Custom Classes</em>'.
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapModel#isGenerateCustomClasses()
	 * @see #getGenGapModel()
	 * @generated
	 */
	EAttribute getGenGapModel_GenerateCustomClasses();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomModelDirectory <em>Custom Model Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Model Directory</em>'.
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomModelDirectory()
	 * @see #getGenGapModel()
	 * @generated
	 */
	EAttribute getGenGapModel_CustomModelDirectory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#isCleanModelDirectory <em>Clean Model Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clean Model Directory</em>'.
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapModel#isCleanModelDirectory()
	 * @see #getGenGapModel()
	 * @generated
	 */
	EAttribute getGenGapModel_CleanModelDirectory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#isGenerateCustomProviders <em>Generate Custom Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generate Custom Providers</em>'.
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapModel#isGenerateCustomProviders()
	 * @see #getGenGapModel()
	 * @generated
	 */
	EAttribute getGenGapModel_GenerateCustomProviders();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomEditDirectory <em>Custom Edit Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Edit Directory</em>'.
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapModel#getCustomEditDirectory()
	 * @see #getGenGapModel()
	 * @generated
	 */
	EAttribute getGenGapModel_CustomEditDirectory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#isCleanEditDirectory <em>Clean Edit Directory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clean Edit Directory</em>'.
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapModel#isCleanEditDirectory()
	 * @see #getGenGapModel()
	 * @generated
	 */
	EAttribute getGenGapModel_CleanEditDirectory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.loophole.internal.model.GenGapModel#getGenGapPackages <em>Gen Gap Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gen Gap Packages</em>'.
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapModel#getGenGapPackages()
	 * @see #getGenGapModel()
	 * @generated
	 */
	EReference getGenGapModel_GenGapPackages();

	/**
	 * Returns the meta object for class '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage <em>Gen Gap Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gen Gap Package</em>'.
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapPackage
	 * @generated
	 */
	EClass getGenGapPackage();

	/**
	 * Returns the meta object for the reference '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getGenPackage <em>Gen Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gen Package</em>'.
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getGenPackage()
	 * @see #getGenGapPackage()
	 * @generated
	 */
	EReference getGenGapPackage_GenPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getCustomClassPackageSuffix <em>Custom Class Package Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Class Package Suffix</em>'.
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getCustomClassPackageSuffix()
	 * @see #getGenGapPackage()
	 * @generated
	 */
	EAttribute getGenGapPackage_CustomClassPackageSuffix();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getCustomProviderPackageSuffix <em>Custom Provider Package Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Provider Package Suffix</em>'.
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getCustomProviderPackageSuffix()
	 * @see #getGenGapPackage()
	 * @generated
	 */
	EAttribute getGenGapPackage_CustomProviderPackageSuffix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getNestedGenGapPackages <em>Nested Gen Gap Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nested Gen Gap Packages</em>'.
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getNestedGenGapPackages()
	 * @see #getGenGapPackage()
	 * @generated
	 */
	EReference getGenGapPackage_NestedGenGapPackages();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getSuperGenGapPackage <em>Super Gen Gap Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Super Gen Gap Package</em>'.
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getSuperGenGapPackage()
	 * @see #getGenGapPackage()
	 * @generated
	 */
	EReference getGenGapPackage_SuperGenGapPackage();

	/**
	 * Returns the meta object for the container reference '{@link org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getGenGapModel <em>Gen Gap Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Gen Gap Model</em>'.
	 * @see org.eclipselabs.emf.loophole.internal.model.GenGapPackage#getGenGapModel()
	 * @see #getGenGapPackage()
	 * @generated
	 */
	EReference getGenGapPackage_GenGapModel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LoopholeFactory getLoopholeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapModelImpl <em>Gen Gap Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapModelImpl
		 * @see org.eclipselabs.emf.loophole.internal.model.impl.BasicLoopholePackageImpl#getGenGapModel()
		 * @generated
		 */
		EClass GEN_GAP_MODEL = eINSTANCE.getGenGapModel();

		/**
		 * The meta object literal for the '<em><b>Gen Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_GAP_MODEL__GEN_MODEL = eINSTANCE.getGenGapModel_GenModel();

		/**
		 * The meta object literal for the '<em><b>Custom Class Name Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_GAP_MODEL__CUSTOM_CLASS_NAME_PATTERN = eINSTANCE.getGenGapModel_CustomClassNamePattern();

		/**
		 * The meta object literal for the '<em><b>Generate Custom Classes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_GAP_MODEL__GENERATE_CUSTOM_CLASSES = eINSTANCE.getGenGapModel_GenerateCustomClasses();

		/**
		 * The meta object literal for the '<em><b>Custom Model Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_GAP_MODEL__CUSTOM_MODEL_DIRECTORY = eINSTANCE.getGenGapModel_CustomModelDirectory();

		/**
		 * The meta object literal for the '<em><b>Clean Model Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_GAP_MODEL__CLEAN_MODEL_DIRECTORY = eINSTANCE.getGenGapModel_CleanModelDirectory();

		/**
		 * The meta object literal for the '<em><b>Generate Custom Providers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_GAP_MODEL__GENERATE_CUSTOM_PROVIDERS = eINSTANCE.getGenGapModel_GenerateCustomProviders();

		/**
		 * The meta object literal for the '<em><b>Custom Edit Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_GAP_MODEL__CUSTOM_EDIT_DIRECTORY = eINSTANCE.getGenGapModel_CustomEditDirectory();

		/**
		 * The meta object literal for the '<em><b>Clean Edit Directory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_GAP_MODEL__CLEAN_EDIT_DIRECTORY = eINSTANCE.getGenGapModel_CleanEditDirectory();

		/**
		 * The meta object literal for the '<em><b>Gen Gap Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_GAP_MODEL__GEN_GAP_PACKAGES = eINSTANCE.getGenGapModel_GenGapPackages();

		/**
		 * The meta object literal for the '{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapPackageImpl <em>Gen Gap Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapPackageImpl
		 * @see org.eclipselabs.emf.loophole.internal.model.impl.BasicLoopholePackageImpl#getGenGapPackage()
		 * @generated
		 */
		EClass GEN_GAP_PACKAGE = eINSTANCE.getGenGapPackage();

		/**
		 * The meta object literal for the '<em><b>Gen Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_GAP_PACKAGE__GEN_PACKAGE = eINSTANCE.getGenGapPackage_GenPackage();

		/**
		 * The meta object literal for the '<em><b>Custom Class Package Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_GAP_PACKAGE__CUSTOM_CLASS_PACKAGE_SUFFIX = eINSTANCE.getGenGapPackage_CustomClassPackageSuffix();

		/**
		 * The meta object literal for the '<em><b>Custom Provider Package Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GEN_GAP_PACKAGE__CUSTOM_PROVIDER_PACKAGE_SUFFIX = eINSTANCE.getGenGapPackage_CustomProviderPackageSuffix();

		/**
		 * The meta object literal for the '<em><b>Nested Gen Gap Packages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_GAP_PACKAGE__NESTED_GEN_GAP_PACKAGES = eINSTANCE.getGenGapPackage_NestedGenGapPackages();

		/**
		 * The meta object literal for the '<em><b>Super Gen Gap Package</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_GAP_PACKAGE__SUPER_GEN_GAP_PACKAGE = eINSTANCE.getGenGapPackage_SuperGenGapPackage();

		/**
		 * The meta object literal for the '<em><b>Gen Gap Model</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEN_GAP_PACKAGE__GEN_GAP_MODEL = eINSTANCE.getGenGapPackage_GenGapModel();

	}

} //LoopholePackage
