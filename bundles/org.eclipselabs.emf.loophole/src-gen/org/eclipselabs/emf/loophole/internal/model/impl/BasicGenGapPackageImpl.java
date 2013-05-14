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

import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipselabs.emf.loophole.internal.model.GenGapModel;
import org.eclipselabs.emf.loophole.internal.model.GenGapPackage;

import org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gen Gap Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapPackageImpl#getGenPackage <em>Gen Package</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapPackageImpl#getCustomClassPackageSuffix <em>Custom Class Package Suffix</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapPackageImpl#getCustomProviderPackageSuffix <em>Custom Provider Package Suffix</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapPackageImpl#getNestedGenGapPackages <em>Nested Gen Gap Packages</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapPackageImpl#getSuperGenGapPackage <em>Super Gen Gap Package</em>}</li>
 *   <li>{@link org.eclipselabs.emf.loophole.internal.model.impl.BasicGenGapPackageImpl#getGenGapModel <em>Gen Gap Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicGenGapPackageImpl extends EObjectImpl implements GenGapPackage {
	/**
	 * The cached value of the '{@link #getGenPackage() <em>Gen Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenPackage()
	 * @generated
	 * @ordered
	 */
	protected GenPackage genPackage;

	/**
	 * The default value of the '{@link #getCustomClassPackageSuffix() <em>Custom Class Package Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomClassPackageSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_CLASS_PACKAGE_SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomClassPackageSuffix() <em>Custom Class Package Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomClassPackageSuffix()
	 * @generated
	 * @ordered
	 */
	protected String customClassPackageSuffix = CUSTOM_CLASS_PACKAGE_SUFFIX_EDEFAULT;

	/**
	 * This is true if the Custom Class Package Suffix attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean customClassPackageSuffixESet;

	/**
	 * The default value of the '{@link #getCustomProviderPackageSuffix() <em>Custom Provider Package Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomProviderPackageSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_PROVIDER_PACKAGE_SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomProviderPackageSuffix() <em>Custom Provider Package Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomProviderPackageSuffix()
	 * @generated
	 * @ordered
	 */
	protected String customProviderPackageSuffix = CUSTOM_PROVIDER_PACKAGE_SUFFIX_EDEFAULT;

	/**
	 * This is true if the Custom Provider Package Suffix attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean customProviderPackageSuffixESet;

	/**
	 * The cached value of the '{@link #getNestedGenGapPackages() <em>Nested Gen Gap Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedGenGapPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<GenGapPackage> nestedGenGapPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicGenGapPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LoopholePackage.Literals.GEN_GAP_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPackage getGenPackage() {
		if (genPackage != null && genPackage.eIsProxy()) {
			InternalEObject oldGenPackage = (InternalEObject)genPackage;
			genPackage = (GenPackage)eResolveProxy(oldGenPackage);
			if (genPackage != oldGenPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LoopholePackage.GEN_GAP_PACKAGE__GEN_PACKAGE, oldGenPackage, genPackage));
			}
		}
		return genPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenPackage basicGetGenPackage() {
		return genPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenPackage(GenPackage newGenPackage) {
		GenPackage oldGenPackage = genPackage;
		genPackage = newGenPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoopholePackage.GEN_GAP_PACKAGE__GEN_PACKAGE, oldGenPackage, genPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomClassPackageSuffix() {
		return customClassPackageSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomClassPackageSuffix(String newCustomClassPackageSuffix) {
		String oldCustomClassPackageSuffix = customClassPackageSuffix;
		customClassPackageSuffix = newCustomClassPackageSuffix;
		boolean oldCustomClassPackageSuffixESet = customClassPackageSuffixESet;
		customClassPackageSuffixESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoopholePackage.GEN_GAP_PACKAGE__CUSTOM_CLASS_PACKAGE_SUFFIX, oldCustomClassPackageSuffix, customClassPackageSuffix, !oldCustomClassPackageSuffixESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCustomClassPackageSuffix() {
		String oldCustomClassPackageSuffix = customClassPackageSuffix;
		boolean oldCustomClassPackageSuffixESet = customClassPackageSuffixESet;
		customClassPackageSuffix = CUSTOM_CLASS_PACKAGE_SUFFIX_EDEFAULT;
		customClassPackageSuffixESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LoopholePackage.GEN_GAP_PACKAGE__CUSTOM_CLASS_PACKAGE_SUFFIX, oldCustomClassPackageSuffix, CUSTOM_CLASS_PACKAGE_SUFFIX_EDEFAULT, oldCustomClassPackageSuffixESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCustomClassPackageSuffix() {
		return customClassPackageSuffixESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomProviderPackageSuffix() {
		return customProviderPackageSuffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomProviderPackageSuffix(String newCustomProviderPackageSuffix) {
		String oldCustomProviderPackageSuffix = customProviderPackageSuffix;
		customProviderPackageSuffix = newCustomProviderPackageSuffix;
		boolean oldCustomProviderPackageSuffixESet = customProviderPackageSuffixESet;
		customProviderPackageSuffixESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoopholePackage.GEN_GAP_PACKAGE__CUSTOM_PROVIDER_PACKAGE_SUFFIX, oldCustomProviderPackageSuffix, customProviderPackageSuffix, !oldCustomProviderPackageSuffixESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCustomProviderPackageSuffix() {
		String oldCustomProviderPackageSuffix = customProviderPackageSuffix;
		boolean oldCustomProviderPackageSuffixESet = customProviderPackageSuffixESet;
		customProviderPackageSuffix = CUSTOM_PROVIDER_PACKAGE_SUFFIX_EDEFAULT;
		customProviderPackageSuffixESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, LoopholePackage.GEN_GAP_PACKAGE__CUSTOM_PROVIDER_PACKAGE_SUFFIX, oldCustomProviderPackageSuffix, CUSTOM_PROVIDER_PACKAGE_SUFFIX_EDEFAULT, oldCustomProviderPackageSuffixESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCustomProviderPackageSuffix() {
		return customProviderPackageSuffixESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenGapPackage> getNestedGenGapPackages() {
		if (nestedGenGapPackages == null) {
			nestedGenGapPackages = new EObjectContainmentWithInverseEList<GenGapPackage>(GenGapPackage.class, this, LoopholePackage.GEN_GAP_PACKAGE__NESTED_GEN_GAP_PACKAGES, LoopholePackage.GEN_GAP_PACKAGE__SUPER_GEN_GAP_PACKAGE);
		}
		return nestedGenGapPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenGapPackage getSuperGenGapPackage() {
		if (eContainerFeatureID() != LoopholePackage.GEN_GAP_PACKAGE__SUPER_GEN_GAP_PACKAGE) return null;
		return (GenGapPackage)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuperGenGapPackage(GenGapPackage newSuperGenGapPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSuperGenGapPackage, LoopholePackage.GEN_GAP_PACKAGE__SUPER_GEN_GAP_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperGenGapPackage(GenGapPackage newSuperGenGapPackage) {
		if (newSuperGenGapPackage != eInternalContainer() || (eContainerFeatureID() != LoopholePackage.GEN_GAP_PACKAGE__SUPER_GEN_GAP_PACKAGE && newSuperGenGapPackage != null)) {
			if (EcoreUtil.isAncestor(this, newSuperGenGapPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSuperGenGapPackage != null)
				msgs = ((InternalEObject)newSuperGenGapPackage).eInverseAdd(this, LoopholePackage.GEN_GAP_PACKAGE__NESTED_GEN_GAP_PACKAGES, GenGapPackage.class, msgs);
			msgs = basicSetSuperGenGapPackage(newSuperGenGapPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoopholePackage.GEN_GAP_PACKAGE__SUPER_GEN_GAP_PACKAGE, newSuperGenGapPackage, newSuperGenGapPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenGapModel getGenGapModel() {
		if (eContainerFeatureID() != LoopholePackage.GEN_GAP_PACKAGE__GEN_GAP_MODEL) return null;
		return (GenGapModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenGapModel(GenGapModel newGenGapModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGenGapModel, LoopholePackage.GEN_GAP_PACKAGE__GEN_GAP_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenGapModel(GenGapModel newGenGapModel) {
		if (newGenGapModel != eInternalContainer() || (eContainerFeatureID() != LoopholePackage.GEN_GAP_PACKAGE__GEN_GAP_MODEL && newGenGapModel != null)) {
			if (EcoreUtil.isAncestor(this, newGenGapModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString()); //$NON-NLS-1$
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGenGapModel != null)
				msgs = ((InternalEObject)newGenGapModel).eInverseAdd(this, LoopholePackage.GEN_GAP_MODEL__GEN_GAP_PACKAGES, GenGapModel.class, msgs);
			msgs = basicSetGenGapModel(newGenGapModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LoopholePackage.GEN_GAP_PACKAGE__GEN_GAP_MODEL, newGenGapModel, newGenGapModel));
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
	public boolean reconcile(GenGapPackage genGapPackage) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialize(GenPackage genPackage) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomQualifiedClassName(GenClass genClass) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomQualifiedProviderClassName(GenClass genClass) {
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
			case LoopholePackage.GEN_GAP_PACKAGE__NESTED_GEN_GAP_PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedGenGapPackages()).basicAdd(otherEnd, msgs);
			case LoopholePackage.GEN_GAP_PACKAGE__SUPER_GEN_GAP_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSuperGenGapPackage((GenGapPackage)otherEnd, msgs);
			case LoopholePackage.GEN_GAP_PACKAGE__GEN_GAP_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGenGapModel((GenGapModel)otherEnd, msgs);
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
			case LoopholePackage.GEN_GAP_PACKAGE__NESTED_GEN_GAP_PACKAGES:
				return ((InternalEList<?>)getNestedGenGapPackages()).basicRemove(otherEnd, msgs);
			case LoopholePackage.GEN_GAP_PACKAGE__SUPER_GEN_GAP_PACKAGE:
				return basicSetSuperGenGapPackage(null, msgs);
			case LoopholePackage.GEN_GAP_PACKAGE__GEN_GAP_MODEL:
				return basicSetGenGapModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case LoopholePackage.GEN_GAP_PACKAGE__SUPER_GEN_GAP_PACKAGE:
				return eInternalContainer().eInverseRemove(this, LoopholePackage.GEN_GAP_PACKAGE__NESTED_GEN_GAP_PACKAGES, GenGapPackage.class, msgs);
			case LoopholePackage.GEN_GAP_PACKAGE__GEN_GAP_MODEL:
				return eInternalContainer().eInverseRemove(this, LoopholePackage.GEN_GAP_MODEL__GEN_GAP_PACKAGES, GenGapModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LoopholePackage.GEN_GAP_PACKAGE__GEN_PACKAGE:
				if (resolve) return getGenPackage();
				return basicGetGenPackage();
			case LoopholePackage.GEN_GAP_PACKAGE__CUSTOM_CLASS_PACKAGE_SUFFIX:
				return getCustomClassPackageSuffix();
			case LoopholePackage.GEN_GAP_PACKAGE__CUSTOM_PROVIDER_PACKAGE_SUFFIX:
				return getCustomProviderPackageSuffix();
			case LoopholePackage.GEN_GAP_PACKAGE__NESTED_GEN_GAP_PACKAGES:
				return getNestedGenGapPackages();
			case LoopholePackage.GEN_GAP_PACKAGE__SUPER_GEN_GAP_PACKAGE:
				return getSuperGenGapPackage();
			case LoopholePackage.GEN_GAP_PACKAGE__GEN_GAP_MODEL:
				return getGenGapModel();
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
			case LoopholePackage.GEN_GAP_PACKAGE__GEN_PACKAGE:
				setGenPackage((GenPackage)newValue);
				return;
			case LoopholePackage.GEN_GAP_PACKAGE__CUSTOM_CLASS_PACKAGE_SUFFIX:
				setCustomClassPackageSuffix((String)newValue);
				return;
			case LoopholePackage.GEN_GAP_PACKAGE__CUSTOM_PROVIDER_PACKAGE_SUFFIX:
				setCustomProviderPackageSuffix((String)newValue);
				return;
			case LoopholePackage.GEN_GAP_PACKAGE__NESTED_GEN_GAP_PACKAGES:
				getNestedGenGapPackages().clear();
				getNestedGenGapPackages().addAll((Collection<? extends GenGapPackage>)newValue);
				return;
			case LoopholePackage.GEN_GAP_PACKAGE__SUPER_GEN_GAP_PACKAGE:
				setSuperGenGapPackage((GenGapPackage)newValue);
				return;
			case LoopholePackage.GEN_GAP_PACKAGE__GEN_GAP_MODEL:
				setGenGapModel((GenGapModel)newValue);
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
			case LoopholePackage.GEN_GAP_PACKAGE__GEN_PACKAGE:
				setGenPackage((GenPackage)null);
				return;
			case LoopholePackage.GEN_GAP_PACKAGE__CUSTOM_CLASS_PACKAGE_SUFFIX:
				unsetCustomClassPackageSuffix();
				return;
			case LoopholePackage.GEN_GAP_PACKAGE__CUSTOM_PROVIDER_PACKAGE_SUFFIX:
				unsetCustomProviderPackageSuffix();
				return;
			case LoopholePackage.GEN_GAP_PACKAGE__NESTED_GEN_GAP_PACKAGES:
				getNestedGenGapPackages().clear();
				return;
			case LoopholePackage.GEN_GAP_PACKAGE__SUPER_GEN_GAP_PACKAGE:
				setSuperGenGapPackage((GenGapPackage)null);
				return;
			case LoopholePackage.GEN_GAP_PACKAGE__GEN_GAP_MODEL:
				setGenGapModel((GenGapModel)null);
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
			case LoopholePackage.GEN_GAP_PACKAGE__GEN_PACKAGE:
				return genPackage != null;
			case LoopholePackage.GEN_GAP_PACKAGE__CUSTOM_CLASS_PACKAGE_SUFFIX:
				return isSetCustomClassPackageSuffix();
			case LoopholePackage.GEN_GAP_PACKAGE__CUSTOM_PROVIDER_PACKAGE_SUFFIX:
				return isSetCustomProviderPackageSuffix();
			case LoopholePackage.GEN_GAP_PACKAGE__NESTED_GEN_GAP_PACKAGES:
				return nestedGenGapPackages != null && !nestedGenGapPackages.isEmpty();
			case LoopholePackage.GEN_GAP_PACKAGE__SUPER_GEN_GAP_PACKAGE:
				return getSuperGenGapPackage() != null;
			case LoopholePackage.GEN_GAP_PACKAGE__GEN_GAP_MODEL:
				return getGenGapModel() != null;
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
		result.append(" (customClassPackageSuffix: "); //$NON-NLS-1$
		if (customClassPackageSuffixESet) result.append(customClassPackageSuffix); else result.append("<unset>"); //$NON-NLS-1$
		result.append(", customProviderPackageSuffix: "); //$NON-NLS-1$
		if (customProviderPackageSuffixESet) result.append(customProviderPackageSuffix); else result.append("<unset>"); //$NON-NLS-1$
		result.append(')');
		return result.toString();
	}

} //BasicGenGapPackageImpl
