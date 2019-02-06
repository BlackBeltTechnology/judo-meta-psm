/**
 */
package hu.blackbelt.judo.meta.psm.accesspoint.impl;

import hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage;
import hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph;

import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exposed Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.ExposedGraphImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.ExposedGraphImpl#getEntryTransferObject <em>Entry Transfer Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExposedGraphImpl extends NamedElementImpl implements ExposedGraph {
	/**
	 * The cached value of the '{@link #getSelector() <em>Selector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelector()
	 * @generated
	 * @ordered
	 */
	protected StaticNavigation selector;

	/**
	 * The cached value of the '{@link #getEntryTransferObject() <em>Entry Transfer Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryTransferObject()
	 * @generated
	 * @ordered
	 */
	protected MappedTransferObjectType entryTransferObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExposedGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccesspointPackage.Literals.EXPOSED_GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticNavigation getSelector() {
		if (selector != null && selector.eIsProxy()) {
			InternalEObject oldSelector = (InternalEObject)selector;
			selector = (StaticNavigation)eResolveProxy(oldSelector);
			if (selector != oldSelector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccesspointPackage.EXPOSED_GRAPH__SELECTOR, oldSelector, selector));
			}
		}
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticNavigation basicGetSelector() {
		return selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelector(StaticNavigation newSelector) {
		StaticNavigation oldSelector = selector;
		selector = newSelector;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccesspointPackage.EXPOSED_GRAPH__SELECTOR, oldSelector, selector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedTransferObjectType getEntryTransferObject() {
		if (entryTransferObject != null && entryTransferObject.eIsProxy()) {
			InternalEObject oldEntryTransferObject = (InternalEObject)entryTransferObject;
			entryTransferObject = (MappedTransferObjectType)eResolveProxy(oldEntryTransferObject);
			if (entryTransferObject != oldEntryTransferObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, AccesspointPackage.EXPOSED_GRAPH__ENTRY_TRANSFER_OBJECT, oldEntryTransferObject, entryTransferObject));
			}
		}
		return entryTransferObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedTransferObjectType basicGetEntryTransferObject() {
		return entryTransferObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryTransferObject(MappedTransferObjectType newEntryTransferObject) {
		MappedTransferObjectType oldEntryTransferObject = entryTransferObject;
		entryTransferObject = newEntryTransferObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccesspointPackage.EXPOSED_GRAPH__ENTRY_TRANSFER_OBJECT, oldEntryTransferObject, entryTransferObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccesspointPackage.EXPOSED_GRAPH__SELECTOR:
				if (resolve) return getSelector();
				return basicGetSelector();
			case AccesspointPackage.EXPOSED_GRAPH__ENTRY_TRANSFER_OBJECT:
				if (resolve) return getEntryTransferObject();
				return basicGetEntryTransferObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AccesspointPackage.EXPOSED_GRAPH__SELECTOR:
				setSelector((StaticNavigation)newValue);
				return;
			case AccesspointPackage.EXPOSED_GRAPH__ENTRY_TRANSFER_OBJECT:
				setEntryTransferObject((MappedTransferObjectType)newValue);
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
			case AccesspointPackage.EXPOSED_GRAPH__SELECTOR:
				setSelector((StaticNavigation)null);
				return;
			case AccesspointPackage.EXPOSED_GRAPH__ENTRY_TRANSFER_OBJECT:
				setEntryTransferObject((MappedTransferObjectType)null);
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
			case AccesspointPackage.EXPOSED_GRAPH__SELECTOR:
				return selector != null;
			case AccesspointPackage.EXPOSED_GRAPH__ENTRY_TRANSFER_OBJECT:
				return entryTransferObject != null;
		}
		return super.eIsSet(featureID);
	}

} //ExposedGraphImpl
