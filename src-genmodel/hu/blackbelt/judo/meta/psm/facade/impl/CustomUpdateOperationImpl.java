/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.CustomUpdateOperation;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Update Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.CustomUpdateOperationImpl#getUpdateOperation <em>Update Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomUpdateOperationImpl extends UpdateOperationImpl implements CustomUpdateOperation {
    /**
     * The default value of the '{@link #getUpdateOperation() <em>Update Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpdateOperation()
     * @generated
     * @ordered
     */
    protected static final String UPDATE_OPERATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUpdateOperation() <em>Update Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpdateOperation()
     * @generated
     * @ordered
     */
    protected String updateOperation = UPDATE_OPERATION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CustomUpdateOperationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.CUSTOM_UPDATE_OPERATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getUpdateOperation() {
        return updateOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUpdateOperation(String newUpdateOperation) {
        String oldUpdateOperation = updateOperation;
        updateOperation = newUpdateOperation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.CUSTOM_UPDATE_OPERATION__UPDATE_OPERATION, oldUpdateOperation, updateOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.CUSTOM_UPDATE_OPERATION__UPDATE_OPERATION:
                return getUpdateOperation();
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
            case FacadePackage.CUSTOM_UPDATE_OPERATION__UPDATE_OPERATION:
                setUpdateOperation((String)newValue);
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
            case FacadePackage.CUSTOM_UPDATE_OPERATION__UPDATE_OPERATION:
                setUpdateOperation(UPDATE_OPERATION_EDEFAULT);
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
            case FacadePackage.CUSTOM_UPDATE_OPERATION__UPDATE_OPERATION:
                return UPDATE_OPERATION_EDEFAULT == null ? updateOperation != null : !UPDATE_OPERATION_EDEFAULT.equals(updateOperation);
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
        result.append(" (updateOperation: ");
        result.append(updateOperation);
        result.append(')');
        return result.toString();
    }

} //CustomUpdateOperationImpl
