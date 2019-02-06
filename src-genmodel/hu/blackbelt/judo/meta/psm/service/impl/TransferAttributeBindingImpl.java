/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement;

import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferAttributeBinding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Attribute Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeBindingImpl#getPrimitiveTypedElement <em>Primitive Typed Element</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeBindingImpl#getTransferAttribute <em>Transfer Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransferAttributeBindingImpl extends MinimalEObjectImpl.Container implements TransferAttributeBinding {
	/**
	 * The cached value of the '{@link #getPrimitiveTypedElement() <em>Primitive Typed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveTypedElement()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveTypedElement primitiveTypedElement;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferAttributeBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.TRANSFER_ATTRIBUTE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypedElement getPrimitiveTypedElement() {
		if (primitiveTypedElement != null && primitiveTypedElement.eIsProxy()) {
			InternalEObject oldPrimitiveTypedElement = (InternalEObject)primitiveTypedElement;
			primitiveTypedElement = (PrimitiveTypedElement)eResolveProxy(oldPrimitiveTypedElement);
			if (primitiveTypedElement != oldPrimitiveTypedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.TRANSFER_ATTRIBUTE_BINDING__PRIMITIVE_TYPED_ELEMENT, oldPrimitiveTypedElement, primitiveTypedElement));
			}
		}
		return primitiveTypedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveTypedElement basicGetPrimitiveTypedElement() {
		return primitiveTypedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveTypedElement(PrimitiveTypedElement newPrimitiveTypedElement) {
		PrimitiveTypedElement oldPrimitiveTypedElement = primitiveTypedElement;
		primitiveTypedElement = newPrimitiveTypedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.TRANSFER_ATTRIBUTE_BINDING__PRIMITIVE_TYPED_ELEMENT, oldPrimitiveTypedElement, primitiveTypedElement));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.TRANSFER_ATTRIBUTE_BINDING__TRANSFER_ATTRIBUTE, oldTransferAttribute, transferAttribute));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.TRANSFER_ATTRIBUTE_BINDING__TRANSFER_ATTRIBUTE, oldTransferAttribute, transferAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.TRANSFER_ATTRIBUTE_BINDING__PRIMITIVE_TYPED_ELEMENT:
				if (resolve) return getPrimitiveTypedElement();
				return basicGetPrimitiveTypedElement();
			case ServicePackage.TRANSFER_ATTRIBUTE_BINDING__TRANSFER_ATTRIBUTE:
				if (resolve) return getTransferAttribute();
				return basicGetTransferAttribute();
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
			case ServicePackage.TRANSFER_ATTRIBUTE_BINDING__PRIMITIVE_TYPED_ELEMENT:
				setPrimitiveTypedElement((PrimitiveTypedElement)newValue);
				return;
			case ServicePackage.TRANSFER_ATTRIBUTE_BINDING__TRANSFER_ATTRIBUTE:
				setTransferAttribute((TransferAttribute)newValue);
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
			case ServicePackage.TRANSFER_ATTRIBUTE_BINDING__PRIMITIVE_TYPED_ELEMENT:
				setPrimitiveTypedElement((PrimitiveTypedElement)null);
				return;
			case ServicePackage.TRANSFER_ATTRIBUTE_BINDING__TRANSFER_ATTRIBUTE:
				setTransferAttribute((TransferAttribute)null);
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
			case ServicePackage.TRANSFER_ATTRIBUTE_BINDING__PRIMITIVE_TYPED_ELEMENT:
				return primitiveTypedElement != null;
			case ServicePackage.TRANSFER_ATTRIBUTE_BINDING__TRANSFER_ATTRIBUTE:
				return transferAttribute != null;
		}
		return super.eIsSet(featureID);
	}

} //TransferAttributeBindingImpl
