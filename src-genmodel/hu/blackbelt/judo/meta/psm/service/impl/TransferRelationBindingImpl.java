/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement;

import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.TransferRelation;
import hu.blackbelt.judo.meta.psm.service.TransferRelationBinding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Relation Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferRelationBindingImpl#getReferenceTypedElement <em>Reference Typed Element</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferRelationBindingImpl#getTransferRelation <em>Transfer Relation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransferRelationBindingImpl extends MinimalEObjectImpl.Container implements TransferRelationBinding {
    /**
     * The cached value of the '{@link #getReferenceTypedElement() <em>Reference Typed Element</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferenceTypedElement()
     * @generated
     * @ordered
     */
    protected ReferenceTypedElement referenceTypedElement;

    /**
     * The cached value of the '{@link #getTransferRelation() <em>Transfer Relation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransferRelation()
     * @generated
     * @ordered
     */
    protected TransferRelation transferRelation;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransferRelationBindingImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ServicePackage.Literals.TRANSFER_RELATION_BINDING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferenceTypedElement getReferenceTypedElement() {
        if (referenceTypedElement != null && referenceTypedElement.eIsProxy()) {
            InternalEObject oldReferenceTypedElement = (InternalEObject)referenceTypedElement;
            referenceTypedElement = (ReferenceTypedElement)eResolveProxy(oldReferenceTypedElement);
            if (referenceTypedElement != oldReferenceTypedElement) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.TRANSFER_RELATION_BINDING__REFERENCE_TYPED_ELEMENT, oldReferenceTypedElement, referenceTypedElement));
            }
        }
        return referenceTypedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferenceTypedElement basicGetReferenceTypedElement() {
        return referenceTypedElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferenceTypedElement(ReferenceTypedElement newReferenceTypedElement) {
        ReferenceTypedElement oldReferenceTypedElement = referenceTypedElement;
        referenceTypedElement = newReferenceTypedElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.TRANSFER_RELATION_BINDING__REFERENCE_TYPED_ELEMENT, oldReferenceTypedElement, referenceTypedElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransferRelation getTransferRelation() {
        if (transferRelation != null && transferRelation.eIsProxy()) {
            InternalEObject oldTransferRelation = (InternalEObject)transferRelation;
            transferRelation = (TransferRelation)eResolveProxy(oldTransferRelation);
            if (transferRelation != oldTransferRelation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.TRANSFER_RELATION_BINDING__TRANSFER_RELATION, oldTransferRelation, transferRelation));
            }
        }
        return transferRelation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransferRelation basicGetTransferRelation() {
        return transferRelation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTransferRelation(TransferRelation newTransferRelation) {
        TransferRelation oldTransferRelation = transferRelation;
        transferRelation = newTransferRelation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.TRANSFER_RELATION_BINDING__TRANSFER_RELATION, oldTransferRelation, transferRelation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ServicePackage.TRANSFER_RELATION_BINDING__REFERENCE_TYPED_ELEMENT:
                if (resolve) return getReferenceTypedElement();
                return basicGetReferenceTypedElement();
            case ServicePackage.TRANSFER_RELATION_BINDING__TRANSFER_RELATION:
                if (resolve) return getTransferRelation();
                return basicGetTransferRelation();
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
            case ServicePackage.TRANSFER_RELATION_BINDING__REFERENCE_TYPED_ELEMENT:
                setReferenceTypedElement((ReferenceTypedElement)newValue);
                return;
            case ServicePackage.TRANSFER_RELATION_BINDING__TRANSFER_RELATION:
                setTransferRelation((TransferRelation)newValue);
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
            case ServicePackage.TRANSFER_RELATION_BINDING__REFERENCE_TYPED_ELEMENT:
                setReferenceTypedElement((ReferenceTypedElement)null);
                return;
            case ServicePackage.TRANSFER_RELATION_BINDING__TRANSFER_RELATION:
                setTransferRelation((TransferRelation)null);
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
            case ServicePackage.TRANSFER_RELATION_BINDING__REFERENCE_TYPED_ELEMENT:
                return referenceTypedElement != null;
            case ServicePackage.TRANSFER_RELATION_BINDING__TRANSFER_RELATION:
                return transferRelation != null;
        }
        return super.eIsSet(featureID);
    }

} //TransferRelationBindingImpl
