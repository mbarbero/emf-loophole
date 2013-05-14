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
package org.eclipselabs.emf.loophole.internal.model.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipselabs.emf.loophole.internal.LoopholePlugin;
import org.eclipselabs.emf.loophole.internal.model.GenGapPackage;
import org.eclipselabs.emf.loophole.internal.model.provider.GenGapPackageItemProvider;

/**
 * @author <a href="mailto:mikael.barbero@obeo.fr">Mikael Barbero</a>
 * 
 */
public class GenGapPackageItemProviderCustomImpl extends GenGapPackageItemProvider
		implements INotifyChangedListener {

	protected AdapterFactoryItemDelegator itemDelegator;

	protected IChangeNotifier delegateItemProvider;

	/**
	 * @param adapterFactory
	 */
	public GenGapPackageItemProviderCustomImpl(
			ComposeableAdapterFactory adapterFactory) {
		super(adapterFactory);
		itemDelegator = new AdapterFactoryItemDelegator(
				adapterFactory.getRootAdapterFactory());
	}

	@Override
	public void setTarget(Notifier target) {
		super.setTarget(target);
		if (target == null) {
			if (delegateItemProvider != null) {
				delegateItemProvider.removeListener(this);
				delegateItemProvider = null;
			}
		} else {
			GenGapPackage genGapPackage = (GenGapPackage) target;
			delegateItemProvider = (IChangeNotifier) ((ComposeableAdapterFactory) adapterFactory)
					.getRootAdapterFactory().adapt(genGapPackage.getGenPackage(),
							IItemLabelProvider.class);
			delegateItemProvider.addListener(this);
		}
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		return super.getPropertyDescriptors(object);
	}

	/**
	 * This specifies how to implement {@link #getChildren(Object) getChildren}
	 * and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in
	 * {@link #createCommand(Object, org.eclipse.emf.edit.domain.EditingDomain, Class, org.eclipse.emf.edit.command.CommandParameter)
	 * createCommand}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
		}
		return childrenFeatures;
	}

	/**
	 * This returns the parent of the GenGapPackage.
	 */
	@Override
	public Object getParent(Object object) {
		return ((EObject) object).eContainer();
	}

	@Override
	public Object getImage(Object object) {
		GenGapPackage GenGapPackage = ((GenGapPackage) object);
		Object image = itemDelegator.getImage(GenGapPackage.getGenPackage());
		if (image instanceof ComposedImage) {
			((ComposedImage) image).getImages().set(0, LoopholePlugin.INSTANCE.getImage("full/obj16/Underlay"));
		}
		return image;
	}

	@Override
	public String getText(Object object) {
		GenGapPackage GenGapPackage = ((GenGapPackage) object);
		return itemDelegator.getText(GenGapPackage.getGenPackage());
	}

	/**
	 * This handles notification by calling
	 * {@link #fireNotifyChanged(Notification) fireNotifyChanged}. This will
	 * also be called by the {@link #delegateItemProvider} when it normally
	 * fires a notification to its adapter factory; the listener method is
	 * hooked up in {@link #setTarget setTarget}. Notifications are wrapped to
	 * look like they originate from the target.
	 */
	@Override
	public void notifyChanged(final Notification notification) {
		fireNotifyChanged(ViewerNotification.wrapNotification(notification,
				target));
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object.
	 * 
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		/*
		 * super.collectNewChildDescriptors(newChildDescriptors, object);
		 */
	}

	@Override
	public void dispose() {
		super.dispose();
		if (delegateItemProvider != null) {
			delegateItemProvider.removeListener(this);
		}
	}

}
