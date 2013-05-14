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
package org.eclipselabs.emf.loophole.internal.model.impl;

import org.eclipse.emf.codegen.ecore.genmodel.GenModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipselabs.emf.loophole.internal.model.GenGapModel;
import org.eclipselabs.emf.loophole.internal.model.GenGapPackage;

import org.eclipselabs.emf.loophole.internal.model.metadata.LoopholeFactory;
import org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicLoopholePackageImpl extends EPackageImpl implements LoopholePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genGapModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genGapPackageEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicLoopholePackageImpl() {
		super(eNS_URI, LoopholeFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link LoopholePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LoopholePackage init() {
		if (isInited) return (LoopholePackage)EPackage.Registry.INSTANCE.getEPackage(LoopholePackage.eNS_URI);

		// Obtain or create and register package
		BasicLoopholePackageImpl theLoopholePackage = (BasicLoopholePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasicLoopholePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasicLoopholePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GenModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theLoopholePackage.createPackageContents();

		// Initialize created meta-data
		theLoopholePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLoopholePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LoopholePackage.eNS_URI, theLoopholePackage);
		return theLoopholePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenGapModel() {
		return genGapModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenGapModel_GenModel() {
		return (EReference)genGapModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenGapModel_CustomClassNamePattern() {
		return (EAttribute)genGapModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenGapModel_GenerateCustomClasses() {
		return (EAttribute)genGapModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenGapModel_CustomModelDirectory() {
		return (EAttribute)genGapModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenGapModel_CleanModelDirectory() {
		return (EAttribute)genGapModelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenGapModel_GenerateCustomProviders() {
		return (EAttribute)genGapModelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenGapModel_CustomEditDirectory() {
		return (EAttribute)genGapModelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenGapModel_CleanEditDirectory() {
		return (EAttribute)genGapModelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenGapModel_GenGapPackages() {
		return (EReference)genGapModelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenGapPackage() {
		return genGapPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenGapPackage_GenPackage() {
		return (EReference)genGapPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenGapPackage_CustomClassPackageSuffix() {
		return (EAttribute)genGapPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenGapPackage_CustomProviderPackageSuffix() {
		return (EAttribute)genGapPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenGapPackage_NestedGenGapPackages() {
		return (EReference)genGapPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenGapPackage_SuperGenGapPackage() {
		return (EReference)genGapPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenGapPackage_GenGapModel() {
		return (EReference)genGapPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopholeFactory getLoopholeFactory() {
		return (LoopholeFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		genGapModelEClass = createEClass(GEN_GAP_MODEL);
		createEReference(genGapModelEClass, GEN_GAP_MODEL__GEN_MODEL);
		createEAttribute(genGapModelEClass, GEN_GAP_MODEL__CUSTOM_CLASS_NAME_PATTERN);
		createEAttribute(genGapModelEClass, GEN_GAP_MODEL__GENERATE_CUSTOM_CLASSES);
		createEAttribute(genGapModelEClass, GEN_GAP_MODEL__CUSTOM_MODEL_DIRECTORY);
		createEAttribute(genGapModelEClass, GEN_GAP_MODEL__CLEAN_MODEL_DIRECTORY);
		createEAttribute(genGapModelEClass, GEN_GAP_MODEL__GENERATE_CUSTOM_PROVIDERS);
		createEAttribute(genGapModelEClass, GEN_GAP_MODEL__CUSTOM_EDIT_DIRECTORY);
		createEAttribute(genGapModelEClass, GEN_GAP_MODEL__CLEAN_EDIT_DIRECTORY);
		createEReference(genGapModelEClass, GEN_GAP_MODEL__GEN_GAP_PACKAGES);

		genGapPackageEClass = createEClass(GEN_GAP_PACKAGE);
		createEReference(genGapPackageEClass, GEN_GAP_PACKAGE__GEN_PACKAGE);
		createEAttribute(genGapPackageEClass, GEN_GAP_PACKAGE__CUSTOM_CLASS_PACKAGE_SUFFIX);
		createEAttribute(genGapPackageEClass, GEN_GAP_PACKAGE__CUSTOM_PROVIDER_PACKAGE_SUFFIX);
		createEReference(genGapPackageEClass, GEN_GAP_PACKAGE__NESTED_GEN_GAP_PACKAGES);
		createEReference(genGapPackageEClass, GEN_GAP_PACKAGE__SUPER_GEN_GAP_PACKAGE);
		createEReference(genGapPackageEClass, GEN_GAP_PACKAGE__GEN_GAP_MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GenModelPackage theGenModelPackage = (GenModelPackage)EPackage.Registry.INSTANCE.getEPackage(GenModelPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(genGapModelEClass, GenGapModel.class, "GenGapModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getGenGapModel_GenModel(), theGenModelPackage.getGenModel(), null, "genModel", null, 0, 1, GenGapModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGenGapModel_CustomClassNamePattern(), ecorePackage.getEString(), "customClassNamePattern", "{0}CustomImpl", 0, 1, GenGapModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getGenGapModel_GenerateCustomClasses(), ecorePackage.getEBoolean(), "generateCustomClasses", null, 0, 1, GenGapModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGenGapModel_CustomModelDirectory(), ecorePackage.getEString(), "customModelDirectory", null, 0, 1, GenGapModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGenGapModel_CleanModelDirectory(), theEcorePackage.getEBoolean(), "cleanModelDirectory", null, 0, 1, GenGapModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGenGapModel_GenerateCustomProviders(), ecorePackage.getEBoolean(), "generateCustomProviders", null, 0, 1, GenGapModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGenGapModel_CustomEditDirectory(), ecorePackage.getEString(), "customEditDirectory", null, 0, 1, GenGapModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGenGapModel_CleanEditDirectory(), theEcorePackage.getEBoolean(), "cleanEditDirectory", null, 0, 1, GenGapModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGenGapModel_GenGapPackages(), this.getGenGapPackage(), this.getGenGapPackage_GenGapModel(), "genGapPackages", null, 0, -1, GenGapModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(genGapModelEClass, theEcorePackage.getEBoolean(), "reconcile", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		EOperation op = addEOperation(genGapModelEClass, theEcorePackage.getEBoolean(), "reconcile", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getGenGapModel(), "genGapModel", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(genGapModelEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theGenModelPackage.getGenModel(), "genModel", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(genGapPackageEClass, GenGapPackage.class, "GenGapPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getGenGapPackage_GenPackage(), theGenModelPackage.getGenPackage(), null, "genPackage", null, 0, 1, GenGapPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGenGapPackage_CustomClassPackageSuffix(), ecorePackage.getEString(), "customClassPackageSuffix", null, 0, 1, GenGapPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getGenGapPackage_CustomProviderPackageSuffix(), ecorePackage.getEString(), "customProviderPackageSuffix", null, 0, 1, GenGapPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGenGapPackage_NestedGenGapPackages(), this.getGenGapPackage(), this.getGenGapPackage_SuperGenGapPackage(), "nestedGenGapPackages", null, 0, -1, GenGapPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGenGapPackage_SuperGenGapPackage(), this.getGenGapPackage(), this.getGenGapPackage_NestedGenGapPackages(), "superGenGapPackage", null, 0, 1, GenGapPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getGenGapPackage_GenGapModel(), this.getGenGapModel(), this.getGenGapModel_GenGapPackages(), "genGapModel", null, 0, 1, GenGapPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(genGapPackageEClass, theEcorePackage.getEBoolean(), "reconcile", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(genGapPackageEClass, theEcorePackage.getEBoolean(), "reconcile", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getGenGapPackage(), "genGapPackage", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(genGapPackageEClass, null, "initialize", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theGenModelPackage.getGenPackage(), "genPackage", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(genGapPackageEClass, theEcorePackage.getEString(), "getCustomQualifiedClassName", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theGenModelPackage.getGenClass(), "genClass", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(genGapPackageEClass, theEcorePackage.getEString(), "getCustomQualifiedProviderClassName", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, theGenModelPackage.getGenClass(), "genClass", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);
	}

} //BasicLoopholePackageImpl
