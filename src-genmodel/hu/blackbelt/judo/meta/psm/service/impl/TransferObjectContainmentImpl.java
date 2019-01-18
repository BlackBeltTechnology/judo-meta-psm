/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.TransferObjectContainment;
import hu.blackbelt.judo.meta.psm.service.TransferObjectType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Object Containment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectContainmentImpl#getContainment <em>Containment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransferObjectContainmentImpl extends TransferRelationImpl implements TransferObjectContainment {
    /**
     * The cached value of the '{@link #getContainment() <em>Containment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getContainment()
     * @generated
     * @ordered
     */
    protected TransferObjectType containment;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransferObjectContainmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ServicePackage.Literals.TRANSFER_OBJECT_CONTAINMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransferObjectType getContainment() {
        if (containment != null && containment.eIsProxy()) {
            InternalEObject oldContainment = (InternalEObject)containment;
            containment = (TransferObjectType)eResolveProxy(oldContainment);
            if (containment != oldContainment) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.TRANSFER_OBJECT_CONTAINMENT__CONTAINMENT, oldContainment, containment));
            }
        }
        return containment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TransferObjectType basicGetContainment() {
        return containment;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setContainment(TransferObjectType newContainment) {
        TransferObjectType oldContainment = containment;
        containment = newContainment;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.TRANSFER_OBJECT_CONTAINMENT__CONTAINMENT, oldContainment, containment));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ServicePackage.TRANSFER_OBJECT_CONTAINMENT__CONTAINMENT:
                if (resolve) return getContainment();
                return basicGetContainment();
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
            case ServicePackage.TRANSFER_OBJECT_CONTAINMENT__CONTAINMENT:
                setContainment((TransferObjectType)newValue);
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
            case ServicePackage.TRANSFER_OBJECT_CONTAINMENT__CONTAINMENT:
                setContainment((TransferObjectType)null);
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
            case ServicePackage.TRANSFER_OBJECT_CONTAINMENT__CONTAINMENT:
                return containment != null;
        }
        return super.eIsSet(featureID);
    }

} //TransferObjectContainmentImpl
