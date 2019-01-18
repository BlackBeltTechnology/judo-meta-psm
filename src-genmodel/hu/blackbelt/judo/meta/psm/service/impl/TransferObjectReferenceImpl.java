/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.TransferObjectReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Object Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectReferenceImpl#getReferenced <em>Referenced</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransferObjectReferenceImpl extends TransferRelationImpl implements TransferObjectReference {
    /**
     * The cached value of the '{@link #getReferenced() <em>Referenced</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferenced()
     * @generated
     * @ordered
     */
    protected MappedTransferObjectType referenced;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransferObjectReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ServicePackage.Literals.TRANSFER_OBJECT_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MappedTransferObjectType getReferenced() {
        if (referenced != null && referenced.eIsProxy()) {
            InternalEObject oldReferenced = (InternalEObject)referenced;
            referenced = (MappedTransferObjectType)eResolveProxy(oldReferenced);
            if (referenced != oldReferenced) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.TRANSFER_OBJECT_REFERENCE__REFERENCED, oldReferenced, referenced));
            }
        }
        return referenced;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MappedTransferObjectType basicGetReferenced() {
        return referenced;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReferenced(MappedTransferObjectType newReferenced) {
        MappedTransferObjectType oldReferenced = referenced;
        referenced = newReferenced;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.TRANSFER_OBJECT_REFERENCE__REFERENCED, oldReferenced, referenced));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ServicePackage.TRANSFER_OBJECT_REFERENCE__REFERENCED:
                if (resolve) return getReferenced();
                return basicGetReferenced();
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
            case ServicePackage.TRANSFER_OBJECT_REFERENCE__REFERENCED:
                setReferenced((MappedTransferObjectType)newValue);
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
            case ServicePackage.TRANSFER_OBJECT_REFERENCE__REFERENCED:
                setReferenced((MappedTransferObjectType)null);
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
            case ServicePackage.TRANSFER_OBJECT_REFERENCE__REFERENCED:
                return referenced != null;
        }
        return super.eIsSet(featureID);
    }

} //TransferObjectReferenceImpl
