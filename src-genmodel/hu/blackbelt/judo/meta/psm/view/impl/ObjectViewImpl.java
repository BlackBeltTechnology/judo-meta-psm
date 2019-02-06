/**
 */
package hu.blackbelt.judo.meta.psm.view.impl;

import hu.blackbelt.judo.meta.psm.service.TransferObjectType;

import hu.blackbelt.judo.meta.psm.view.Control;
import hu.blackbelt.judo.meta.psm.view.ObjectView;
import hu.blackbelt.judo.meta.psm.view.ViewPackage;
import hu.blackbelt.judo.meta.psm.view.ViewType;

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
 * An implementation of the model object '<em><b>Object View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.ObjectViewImpl#getTransferObject <em>Transfer Object</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.ObjectViewImpl#getViewType <em>View Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.ObjectViewImpl#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectViewImpl extends ContainerImpl implements ObjectView {
	/**
	 * The cached value of the '{@link #getTransferObject() <em>Transfer Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferObject()
	 * @generated
	 * @ordered
	 */
	protected TransferObjectType transferObject;

	/**
	 * The default value of the '{@link #getViewType() <em>View Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewType()
	 * @generated
	 * @ordered
	 */
	protected static final ViewType VIEW_TYPE_EDEFAULT = ViewType.LIST;

	/**
	 * The cached value of the '{@link #getViewType() <em>View Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewType()
	 * @generated
	 * @ordered
	 */
	protected ViewType viewType = VIEW_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControls() <em>Controls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControls()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> controls;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewPackage.Literals.OBJECT_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferObjectType getTransferObject() {
		if (transferObject != null && transferObject.eIsProxy()) {
			InternalEObject oldTransferObject = (InternalEObject)transferObject;
			transferObject = (TransferObjectType)eResolveProxy(oldTransferObject);
			if (transferObject != oldTransferObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewPackage.OBJECT_VIEW__TRANSFER_OBJECT, oldTransferObject, transferObject));
			}
		}
		return transferObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferObjectType basicGetTransferObject() {
		return transferObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferObject(TransferObjectType newTransferObject) {
		TransferObjectType oldTransferObject = transferObject;
		transferObject = newTransferObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.OBJECT_VIEW__TRANSFER_OBJECT, oldTransferObject, transferObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewType getViewType() {
		return viewType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setViewType(ViewType newViewType) {
		ViewType oldViewType = viewType;
		viewType = newViewType == null ? VIEW_TYPE_EDEFAULT : newViewType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.OBJECT_VIEW__VIEW_TYPE, oldViewType, viewType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Control> getControls() {
		if (controls == null) {
			controls = new EObjectContainmentEList<Control>(Control.class, this, ViewPackage.OBJECT_VIEW__CONTROLS);
		}
		return controls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ViewPackage.OBJECT_VIEW__CONTROLS:
				return ((InternalEList<?>)getControls()).basicRemove(otherEnd, msgs);
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
			case ViewPackage.OBJECT_VIEW__TRANSFER_OBJECT:
				if (resolve) return getTransferObject();
				return basicGetTransferObject();
			case ViewPackage.OBJECT_VIEW__VIEW_TYPE:
				return getViewType();
			case ViewPackage.OBJECT_VIEW__CONTROLS:
				return getControls();
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
			case ViewPackage.OBJECT_VIEW__TRANSFER_OBJECT:
				setTransferObject((TransferObjectType)newValue);
				return;
			case ViewPackage.OBJECT_VIEW__VIEW_TYPE:
				setViewType((ViewType)newValue);
				return;
			case ViewPackage.OBJECT_VIEW__CONTROLS:
				getControls().clear();
				getControls().addAll((Collection<? extends Control>)newValue);
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
			case ViewPackage.OBJECT_VIEW__TRANSFER_OBJECT:
				setTransferObject((TransferObjectType)null);
				return;
			case ViewPackage.OBJECT_VIEW__VIEW_TYPE:
				setViewType(VIEW_TYPE_EDEFAULT);
				return;
			case ViewPackage.OBJECT_VIEW__CONTROLS:
				getControls().clear();
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
			case ViewPackage.OBJECT_VIEW__TRANSFER_OBJECT:
				return transferObject != null;
			case ViewPackage.OBJECT_VIEW__VIEW_TYPE:
				return viewType != VIEW_TYPE_EDEFAULT;
			case ViewPackage.OBJECT_VIEW__CONTROLS:
				return controls != null && !controls.isEmpty();
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
		result.append(" (viewType: ");
		result.append(viewType);
		result.append(')');
		return result.toString();
	}

} //ObjectViewImpl
