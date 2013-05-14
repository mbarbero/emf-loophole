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
package org.eclipselabs.emf.loophole.internal.model.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipselabs.emf.loophole.internal.LoopholePlugin;

import org.eclipselabs.emf.loophole.internal.model.GenGapModel;

import org.eclipselabs.emf.loophole.internal.model.metadata.LoopholePackage;

/**
 * This is the item provider adapter for a {@link org.eclipselabs.emf.loophole.internal.model.GenGapModel} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GenGapModelItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenGapModelItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCustomClassNamePatternPropertyDescriptor(object);
			addGenerateCustomClassesPropertyDescriptor(object);
			addCustomModelDirectoryPropertyDescriptor(object);
			addCleanModelDirectoryPropertyDescriptor(object);
			addGenerateCustomProvidersPropertyDescriptor(object);
			addCustomEditDirectoryPropertyDescriptor(object);
			addCleanEditDirectoryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Custom Class Name Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomClassNamePatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenGapModel_customClassNamePattern_feature"), //$NON-NLS-1$
				 getString("_UI_GenGapModel_customClassNamePattern_description"), //$NON-NLS-1$
				 LoopholePackage.Literals.GEN_GAP_MODEL__CUSTOM_CLASS_NAME_PATTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate Custom Classes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerateCustomClassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenGapModel_generateCustomClasses_feature"), //$NON-NLS-1$
				 getString("_UI_GenGapModel_generateCustomClasses_description"), //$NON-NLS-1$
				 LoopholePackage.Literals.GEN_GAP_MODEL__GENERATE_CUSTOM_CLASSES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Custom Model Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomModelDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenGapModel_customModelDirectory_feature"), //$NON-NLS-1$
				 getString("_UI_GenGapModel_customModelDirectory_description"), //$NON-NLS-1$
				 LoopholePackage.Literals.GEN_GAP_MODEL__CUSTOM_MODEL_DIRECTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Clean Model Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCleanModelDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenGapModel_cleanModelDirectory_feature"), //$NON-NLS-1$
				 getString("_UI_GenGapModel_cleanModelDirectory_description"), //$NON-NLS-1$
				 LoopholePackage.Literals.GEN_GAP_MODEL__CLEAN_MODEL_DIRECTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_ModelPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Generate Custom Providers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGenerateCustomProvidersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenGapModel_generateCustomProviders_feature"), //$NON-NLS-1$
				 getString("_UI_GenGapModel_generateCustomProviders_description"), //$NON-NLS-1$
				 LoopholePackage.Literals.GEN_GAP_MODEL__GENERATE_CUSTOM_PROVIDERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_EditPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Custom Edit Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCustomEditDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenGapModel_customEditDirectory_feature"), //$NON-NLS-1$
				 getString("_UI_GenGapModel_customEditDirectory_description"), //$NON-NLS-1$
				 LoopholePackage.Literals.GEN_GAP_MODEL__CUSTOM_EDIT_DIRECTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 getString("_UI_EditPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This adds a property descriptor for the Clean Edit Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCleanEditDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GenGapModel_cleanEditDirectory_feature"), //$NON-NLS-1$
				 getString("_UI_GenGapModel_cleanEditDirectory_description"), //$NON-NLS-1$
				 LoopholePackage.Literals.GEN_GAP_MODEL__CLEAN_EDIT_DIRECTORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 getString("_UI_EditPropertyCategory"), //$NON-NLS-1$
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(LoopholePackage.Literals.GEN_GAP_MODEL__GEN_GAP_PACKAGES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GenGapModel)object).getCustomClassNamePattern();
		return label == null || label.length() == 0 ?
			getString("_UI_GenGapModel_type") : //$NON-NLS-1$
			getString("_UI_GenGapModel_type") + " " + label; //$NON-NLS-1$ //$NON-NLS-2$
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(GenGapModel.class)) {
			case LoopholePackage.GEN_GAP_MODEL__CUSTOM_CLASS_NAME_PATTERN:
			case LoopholePackage.GEN_GAP_MODEL__GENERATE_CUSTOM_CLASSES:
			case LoopholePackage.GEN_GAP_MODEL__CUSTOM_MODEL_DIRECTORY:
			case LoopholePackage.GEN_GAP_MODEL__CLEAN_MODEL_DIRECTORY:
			case LoopholePackage.GEN_GAP_MODEL__GENERATE_CUSTOM_PROVIDERS:
			case LoopholePackage.GEN_GAP_MODEL__CUSTOM_EDIT_DIRECTORY:
			case LoopholePackage.GEN_GAP_MODEL__CLEAN_EDIT_DIRECTORY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LoopholePackage.GEN_GAP_MODEL__GEN_GAP_PACKAGES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return LoopholePlugin.INSTANCE;
	}

}
