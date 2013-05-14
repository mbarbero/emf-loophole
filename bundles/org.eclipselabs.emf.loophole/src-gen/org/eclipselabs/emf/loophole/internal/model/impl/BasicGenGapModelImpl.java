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

import java.util.Collection;

import org.eclipse.emf.codegen.ecore.genmodel.GenModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.emf.loophole.internal.model.GenGapModel;
import org.eclipselabs.emf.loophole.internal.model.GenGapPackage;

import org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Gap Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapModelImpl#getGenModel <em>Gen Model</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapModelImpl#getCustomClassNamePattern <em>Custom Class Name Pattern</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapModelImpl#isGenerateCustomClasses <em>Generate Custom Classes</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapModelImpl#getCustomModelDirectory <em>Custom Model Directory</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapModelImpl#isCleanModelDirectory <em>Clean Model Directory</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapModelImpl#isGenerateCustomProviders <em>Generate Custom Providers</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapModelImpl#getCustomEditDirectory <em>Custom Edit Directory</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapModelImpl#isCleanEditDirectory <em>Clean Edit Directory</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapModelImpl#getGenGapPackages <em>Gen Gap Packages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicGenGapModelImpl extends EObjectImpl implements GenGapModel {
	/**
	 * The cached value of the '{@link #getGenModel() <em>Gen Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenModel()
	 * @generated
	 * @ordered
	 */
	protected GenModel genModel;

	/**
	 * The default value of the '{@link #getCustomClassNamePattern() <em>Custom Class Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomClassNamePattern()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_CLASS_NAME_PATTERN_EDEFAULT = "{0}CustomImpl"; //$NON-NLS-1$

	/**
	 * The cached value of the '{@link #getCustomClassNamePattern() <em>Custom Class Name Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomClassNamePattern()
	 * @generated
	 * @ordered
	 */
	protected String customClassNamePattern = CUSTOM_CLASS_NAME_PATTERN_EDEFAULT;

	/**
	 * This is true if the Custom Class Name Pattern attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean customClassNamePatternESet;

	/**
	 * The default value of the '{@link #isGenerateCustomClasses() <em>Generate Custom Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateCustomClasses()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_CUSTOM_CLASSES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateCustomClasses() <em>Generate Custom Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateCustomClasses()
	 * @generated
	 * @ordered
	 */
	protected boolean generateCustomClasses = GENERATE_CUSTOM_CLASSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomModelDirectory() <em>Custom Model Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomModelDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_MODEL_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomModelDirectory() <em>Custom Model Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomModelDirectory()
	 * @generated
	 * @ordered
	 */
	protected String customModelDirectory = CUSTOM_MODEL_DIRECTORY_EDEFAULT;

	/**
	 * This is true if the Custom Model Directory attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean customModelDirectoryESet;

	/**
	 * The default value of the '{@link #isCleanModelDirectory() <em>Clean Model Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleanModelDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLEAN_MODEL_DIRECTORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCleanModelDirectory() <em>Clean Model Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleanModelDirectory()
	 * @generated
	 * @ordered
	 */
	protected boolean cleanModelDirectory = CLEAN_MODEL_DIRECTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isGenerateCustomProviders() <em>Generate Custom Providers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateCustomProviders()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GENERATE_CUSTOM_PROVIDERS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGenerateCustomProviders() <em>Generate Custom Providers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGenerateCustomProviders()
	 * @generated
	 * @ordered
	 */
	protected boolean generateCustomProviders = GENERATE_CUSTOM_PROVIDERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomEditDirectory() <em>Custom Edit Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomEditDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_EDIT_DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomEditDirectory() <em>Custom Edit Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomEditDirectory()
	 * @generated
	 * @ordered
	 */
	protected String customEditDirectory = CUSTOM_EDIT_DIRECTORY_EDEFAULT;

	/**
	 * This is true if the Custom Edit Directory attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean customEditDirectoryESet;

	/**
	 * The default value of the '{@link #isCleanEditDirectory() <em>Clean Edit Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleanEditDirectory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLEAN_EDIT_DIRECTORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCleanEditDirectory() <em>Clean Edit Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleanEditDirectory()
	 * @generated
	 * @ordered
	 */
	protected boolean cleanEditDirectory = CLEAN_EDIT_DIRECTORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGenGapPackages() <em>Gen Gap Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenGapPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<GenGapPackage> genGapPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicGenGapModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoopholePackage.Literals.GEN_GAP_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModel getGenModel() {
		if (genModel != null && genModel.eIsProxy()) {
			InternalEObject oldGenModel = (InternalEObject)genModel;
			genModel = (GenModel)eResolveProxy(oldGenModel);
			if (genModel != oldGenModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoopholePackage.GEN_GAP_MODEL__GEN_MODEL, oldGenModel, genModel));
			}
		}
		return genModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenModel basicGetGenModel() {
		return genModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenModel(GenModel newGenModel) {
		GenModel oldGenModel = genModel;
		genModel = newGenModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoopholePackage.GEN_GAP_MODEL__GEN_MODEL, oldGenModel, genModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomClassNamePattern() {
		return customClassNamePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomClassNamePattern(String newCustomClassNamePattern) {
		String oldCustomClassNamePattern = customClassNamePattern;
		customClassNamePattern = newCustomClassNamePattern;
		boolean oldCustomClassNamePatternESet = customClassNamePatternESet;
		customClassNamePatternESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoopholePackage.GEN_GAP_MODEL__CUSTOM_CLASS_NAME_PATTERN, oldCustomClassNamePattern, customClassNamePattern, !oldCustomClassNamePatternESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCustomClassNamePattern() {
		String oldCustomClassNamePattern = customClassNamePattern;
		boolean oldCustomClassNamePatternESet = customClassNamePatternESet;
		customClassNamePattern = CUSTOM_CLASS_NAME_PATTERN_EDEFAULT;
		customClassNamePatternESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LoopholePackage.GEN_GAP_MODEL__CUSTOM_CLASS_NAME_PATTERN, oldCustomClassNamePattern, CUSTOM_CLASS_NAME_PATTERN_EDEFAULT, oldCustomClassNamePatternESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCustomClassNamePattern() {
		return customClassNamePatternESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateCustomClasses() {
		return generateCustomClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateCustomClasses(boolean newGenerateCustomClasses) {
		boolean oldGenerateCustomClasses = generateCustomClasses;
		generateCustomClasses = newGenerateCustomClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoopholePackage.GEN_GAP_MODEL__GENERATE_CUSTOM_CLASSES, oldGenerateCustomClasses, generateCustomClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomModelDirectory() {
		return customModelDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomModelDirectory(String newCustomModelDirectory) {
		String oldCustomModelDirectory = customModelDirectory;
		customModelDirectory = newCustomModelDirectory;
		boolean oldCustomModelDirectoryESet = customModelDirectoryESet;
		customModelDirectoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoopholePackage.GEN_GAP_MODEL__CUSTOM_MODEL_DIRECTORY, oldCustomModelDirectory, customModelDirectory, !oldCustomModelDirectoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCustomModelDirectory() {
		String oldCustomModelDirectory = customModelDirectory;
		boolean oldCustomModelDirectoryESet = customModelDirectoryESet;
		customModelDirectory = CUSTOM_MODEL_DIRECTORY_EDEFAULT;
		customModelDirectoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LoopholePackage.GEN_GAP_MODEL__CUSTOM_MODEL_DIRECTORY, oldCustomModelDirectory, CUSTOM_MODEL_DIRECTORY_EDEFAULT, oldCustomModelDirectoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCustomModelDirectory() {
		return customModelDirectoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCleanModelDirectory() {
		return cleanModelDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCleanModelDirectory(boolean newCleanModelDirectory) {
		boolean oldCleanModelDirectory = cleanModelDirectory;
		cleanModelDirectory = newCleanModelDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoopholePackage.GEN_GAP_MODEL__CLEAN_MODEL_DIRECTORY, oldCleanModelDirectory, cleanModelDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGenerateCustomProviders() {
		return generateCustomProviders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateCustomProviders(boolean newGenerateCustomProviders) {
		boolean oldGenerateCustomProviders = generateCustomProviders;
		generateCustomProviders = newGenerateCustomProviders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoopholePackage.GEN_GAP_MODEL__GENERATE_CUSTOM_PROVIDERS, oldGenerateCustomProviders, generateCustomProviders));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomEditDirectory() {
		return customEditDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomEditDirectory(String newCustomEditDirectory) {
		String oldCustomEditDirectory = customEditDirectory;
		customEditDirectory = newCustomEditDirectory;
		boolean oldCustomEditDirectoryESet = customEditDirectoryESet;
		customEditDirectoryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoopholePackage.GEN_GAP_MODEL__CUSTOM_EDIT_DIRECTORY, oldCustomEditDirectory, customEditDirectory, !oldCustomEditDirectoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCustomEditDirectory() {
		String oldCustomEditDirectory = customEditDirectory;
		boolean oldCustomEditDirectoryESet = customEditDirectoryESet;
		customEditDirectory = CUSTOM_EDIT_DIRECTORY_EDEFAULT;
		customEditDirectoryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LoopholePackage.GEN_GAP_MODEL__CUSTOM_EDIT_DIRECTORY, oldCustomEditDirectory, CUSTOM_EDIT_DIRECTORY_EDEFAULT, oldCustomEditDirectoryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCustomEditDirectory() {
		return customEditDirectoryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCleanEditDirectory() {
		return cleanEditDirectory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCleanEditDirectory(boolean newCleanEditDirectory) {
		boolean oldCleanEditDirectory = cleanEditDirectory;
		cleanEditDirectory = newCleanEditDirectory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoopholePackage.GEN_GAP_MODEL__CLEAN_EDIT_DIRECTORY, oldCleanEditDirectory, cleanEditDirectory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenGapPackage> getGenGapPackages() {
		if (genGapPackages == null) {
			genGapPackages = new EObjectContainmentWithInverseEList<GenGapPackage>(GenGapPackage.class, this, LoopholePackage.GEN_GAP_MODEL__GEN_GAP_PACKAGES, LoopholePackage.GEN_GAP_PACKAGE__GEN_GAP_MODEL);
		}
		return genGapPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean reconcile() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean reconcile(GenGapModel genGapModel) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialize(GenModel genModel) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LoopholePackage.GEN_GAP_MODEL__GEN_GAP_PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGenGapPackages()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LoopholePackage.GEN_GAP_MODEL__GEN_GAP_PACKAGES:
				return ((InternalEList<?>)getGenGapPackages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LoopholePackage.GEN_GAP_MODEL__GEN_MODEL:
				if (resolve) return getGenModel();
				return basicGetGenModel();
			case LoopholePackage.GEN_GAP_MODEL__CUSTOM_CLASS_NAME_PATTERN:
				return getCustomClassNamePattern();
			case LoopholePackage.GEN_GAP_MODEL__GENERATE_CUSTOM_CLASSES:
				return isGenerateCustomClasses();
			case LoopholePackage.GEN_GAP_MODEL__CUSTOM_MODEL_DIRECTORY:
				return getCustomModelDirectory();
			case LoopholePackage.GEN_GAP_MODEL__CLEAN_MODEL_DIRECTORY:
				return isCleanModelDirectory();
			case LoopholePackage.GEN_GAP_MODEL__GENERATE_CUSTOM_PROVIDERS:
				return isGenerateCustomProviders();
			case LoopholePackage.GEN_GAP_MODEL__CUSTOM_EDIT_DIRECTORY:
				return getCustomEditDirectory();
			case LoopholePackage.GEN_GAP_MODEL__CLEAN_EDIT_DIRECTORY:
				return isCleanEditDirectory();
			case LoopholePackage.GEN_GAP_MODEL__GEN_GAP_PACKAGES:
				return getGenGapPackages();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LoopholePackage.GEN_GAP_MODEL__GEN_MODEL:
				setGenModel((GenModel)newValue);
				return;
			case LoopholePackage.GEN_GAP_MODEL__CUSTOM_CLASS_NAME_PATTERN:
				setCustomClassNamePattern((String)newValue);
				return;
			case LoopholePackage.GEN_GAP_MODEL__GENERATE_CUSTOM_CLASSES:
				setGenerateCustomClasses((Boolean)newValue);
				return;
			case LoopholePackage.GEN_GAP_MODEL__CUSTOM_MODEL_DIRECTORY:
				setCustomModelDirectory((String)newValue);
				return;
			case LoopholePackage.GEN_GAP_MODEL__CLEAN_MODEL_DIRECTORY:
				setCleanModelDirectory((Boolean)newValue);
				return;
			case LoopholePackage.GEN_GAP_MODEL__GENERATE_CUSTOM_PROVIDERS:
				setGenerateCustomProviders((Boolean)newValue);
				return;
			case LoopholePackage.GEN_GAP_MODEL__CUSTOM_EDIT_DIRECTORY:
				setCustomEditDirectory((String)newValue);
				return;
			case LoopholePackage.GEN_GAP_MODEL__CLEAN_EDIT_DIRECTORY:
				setCleanEditDirectory((Boolean)newValue);
				return;
			case LoopholePackage.GEN_GAP_MODEL__GEN_GAP_PACKAGES:
				getGenGapPackages().clear();
				getGenGapPackages().addAll((Collection<? extends GenGapPackage>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LoopholePackage.GEN_GAP_MODEL__GEN_MODEL:
				setGenModel((GenModel)null);
				return;
			case LoopholePackage.GEN_GAP_MODEL__CUSTOM_CLASS_NAME_PATTERN:
				unsetCustomClassNamePattern();
				return;
			case LoopholePackage.GEN_GAP_MODEL__GENERATE_CUSTOM_CLASSES:
				setGenerateCustomClasses(GENERATE_CUSTOM_CLASSES_EDEFAULT);
				return;
			case LoopholePackage.GEN_GAP_MODEL__CUSTOM_MODEL_DIRECTORY:
				unsetCustomModelDirectory();
				return;
			case LoopholePackage.GEN_GAP_MODEL__CLEAN_MODEL_DIRECTORY:
				setCleanModelDirectory(CLEAN_MODEL_DIRECTORY_EDEFAULT);
				return;
			case LoopholePackage.GEN_GAP_MODEL__GENERATE_CUSTOM_PROVIDERS:
				setGenerateCustomProviders(GENERATE_CUSTOM_PROVIDERS_EDEFAULT);
				return;
			case LoopholePackage.GEN_GAP_MODEL__CUSTOM_EDIT_DIRECTORY:
				unsetCustomEditDirectory();
				return;
			case LoopholePackage.GEN_GAP_MODEL__CLEAN_EDIT_DIRECTORY:
				setCleanEditDirectory(CLEAN_EDIT_DIRECTORY_EDEFAULT);
				return;
			case LoopholePackage.GEN_GAP_MODEL__GEN_GAP_PACKAGES:
				getGenGapPackages().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LoopholePackage.GEN_GAP_MODEL__GEN_MODEL:
				return genModel != null;
			case LoopholePackage.GEN_GAP_MODEL__CUSTOM_CLASS_NAME_PATTERN:
				return isSetCustomClassNamePattern();
			case LoopholePackage.GEN_GAP_MODEL__GENERATE_CUSTOM_CLASSES:
				return generateCustomClasses != GENERATE_CUSTOM_CLASSES_EDEFAULT;
			case LoopholePackage.GEN_GAP_MODEL__CUSTOM_MODEL_DIRECTORY:
				return isSetCustomModelDirectory();
			case LoopholePackage.GEN_GAP_MODEL__CLEAN_MODEL_DIRECTORY:
				return cleanModelDirectory != CLEAN_MODEL_DIRECTORY_EDEFAULT;
			case LoopholePackage.GEN_GAP_MODEL__GENERATE_CUSTOM_PROVIDERS:
				return generateCustomProviders != GENERATE_CUSTOM_PROVIDERS_EDEFAULT;
			case LoopholePackage.GEN_GAP_MODEL__CUSTOM_EDIT_DIRECTORY:
				return isSetCustomEditDirectory();
			case LoopholePackage.GEN_GAP_MODEL__CLEAN_EDIT_DIRECTORY:
				return cleanEditDirectory != CLEAN_EDIT_DIRECTORY_EDEFAULT;
			case LoopholePackage.GEN_GAP_MODEL__GEN_GAP_PACKAGES:
				return genGapPackages != null && !genGapPackages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (customClassNamePattern: "); //$NON-NLS-1$
		if (customClassNamePatternESet) result.append(customClassNamePattern); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", generateCustomClasses: "); //$NON-NLS-1$
		result.append(generateCustomClasses);
		result.append(", customModelDirectory: "); //$NON-NLS-1$
		if (customModelDirectoryESet) result.append(customModelDirectory); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", cleanModelDirectory: "); //$NON-NLS-1$
		result.append(cleanModelDirectory);
		result.append(", generateCustomProviders: "); //$NON-NLS-1$
		result.append(generateCustomProviders);
		result.append(", customEditDirectory: "); //$NON-NLS-1$
		if (customEditDirectoryESet) result.append(customEditDirectory); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", cleanEditDirectory: "); //$NON-NLS-1$
		result.append(cleanEditDirectory);
		result.append(')');
		return result.toString();
	}

} //BasicGenGapModelImpl
