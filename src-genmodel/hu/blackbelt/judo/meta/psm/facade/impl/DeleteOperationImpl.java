/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.DeleteOperation;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delete Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.DeleteOperationImpl#getDeleteOperation <em>Delete Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeleteOperationImpl extends MinimalEObjectImpl.Container implements DeleteOperation {
    /**
     * The default value of the '{@link #getDeleteOperation() <em>Delete Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeleteOperation()
     * @generated
     * @ordered
     */
    protected static final String DELETE_OPERATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDeleteOperation() <em>Delete Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeleteOperation()
     * @generated
     * @ordered
     */
    protected String deleteOperation = DELETE_OPERATION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DeleteOperationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.DELETE_OPERATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDeleteOperation() {
        return deleteOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeleteOperation(String newDeleteOperation) {
        String oldDeleteOperation = deleteOperation;
        deleteOperation = newDeleteOperation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.DELETE_OPERATION__DELETE_OPERATION, oldDeleteOperation, deleteOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.DELETE_OPERATION__DELETE_OPERATION:
                return getDeleteOperation();
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
            case FacadePackage.DELETE_OPERATION__DELETE_OPERATION:
                setDeleteOperation((String)newValue);
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
            case FacadePackage.DELETE_OPERATION__DELETE_OPERATION:
                setDeleteOperation(DELETE_OPERATION_EDEFAULT);
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
            case FacadePackage.DELETE_OPERATION__DELETE_OPERATION:
                return DELETE_OPERATION_EDEFAULT == null ? deleteOperation != null : !DELETE_OPERATION_EDEFAULT.equals(deleteOperation);
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
        result.append(" (deleteOperation: ");
        result.append(deleteOperation);
        result.append(')');
        return result.toString();
    }

} //DeleteOperationImpl
