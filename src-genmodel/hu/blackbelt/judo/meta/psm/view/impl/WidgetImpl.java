/**
 */
package hu.blackbelt.judo.meta.psm.view.impl;

import hu.blackbelt.judo.meta.psm.service.TransferAttribute;

import hu.blackbelt.judo.meta.psm.view.Event;
import hu.blackbelt.judo.meta.psm.view.ViewPackage;
import hu.blackbelt.judo.meta.psm.view.Widget;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Widget</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.WidgetImpl#getTransferAttribute <em>Transfer Attribute</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.WidgetImpl#getEmittedEvents <em>Emitted Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WidgetImpl extends ComponentImpl implements Widget {
	/**
	 * The cached value of the '{@link #getTransferAttribute() <em>Transfer Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferAttribute()
	 * @generated
	 * @ordered
	 */
	protected TransferAttribute transferAttribute;

	/**
	 * The cached value of the '{@link #getEmittedEvents() <em>Emitted Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmittedEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> emittedEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewPackage.Literals.WIDGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferAttribute getTransferAttribute() {
		if (transferAttribute != null && transferAttribute.eIsProxy()) {
			InternalEObject oldTransferAttribute = (InternalEObject)transferAttribute;
			transferAttribute = (TransferAttribute)eResolveProxy(oldTransferAttribute);
			if (transferAttribute != oldTransferAttribute) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewPackage.WIDGET__TRANSFER_ATTRIBUTE, oldTransferAttribute, transferAttribute));
			}
		}
		return transferAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferAttribute basicGetTransferAttribute() {
		return transferAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferAttribute(TransferAttribute newTransferAttribute) {
		TransferAttribute oldTransferAttribute = transferAttribute;
		transferAttribute = newTransferAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.WIDGET__TRANSFER_ATTRIBUTE, oldTransferAttribute, transferAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEmittedEvents() {
		if (emittedEvents == null) {
			emittedEvents = new EObjectContainmentEList<Event>(Event.class, this, ViewPackage.WIDGET__EMITTED_EVENTS);
		}
		return emittedEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewPackage.WIDGET__EMITTED_EVENTS:
				return ((InternalEList<?>)getEmittedEvents()).basicRemove(otherEnd, msgs);
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
			case ViewPackage.WIDGET__TRANSFER_ATTRIBUTE:
				if (resolve) return getTransferAttribute();
				return basicGetTransferAttribute();
			case ViewPackage.WIDGET__EMITTED_EVENTS:
				return getEmittedEvents();
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
			case ViewPackage.WIDGET__TRANSFER_ATTRIBUTE:
				setTransferAttribute((TransferAttribute)newValue);
				return;
			case ViewPackage.WIDGET__EMITTED_EVENTS:
				getEmittedEvents().clear();
				getEmittedEvents().addAll((Collection<? extends Event>)newValue);
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
			case ViewPackage.WIDGET__TRANSFER_ATTRIBUTE:
				setTransferAttribute((TransferAttribute)null);
				return;
			case ViewPackage.WIDGET__EMITTED_EVENTS:
				getEmittedEvents().clear();
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
			case ViewPackage.WIDGET__TRANSFER_ATTRIBUTE:
				return transferAttribute != null;
			case ViewPackage.WIDGET__EMITTED_EVENTS:
				return emittedEvents != null && !emittedEvents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WidgetImpl
