/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.CustomCreateOperation;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Create Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.CustomCreateOperationImpl#getCreateOperation <em>Create Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomCreateOperationImpl extends CreateOperationImpl implements CustomCreateOperation {
    /**
     * The default value of the '{@link #getCreateOperation() <em>Create Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreateOperation()
     * @generated
     * @ordered
     */
    protected static final String CREATE_OPERATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCreateOperation() <em>Create Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCreateOperation()
     * @generated
     * @ordered
     */
    protected String createOperation = CREATE_OPERATION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CustomCreateOperationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.CUSTOM_CREATE_OPERATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getCreateOperation() {
        return createOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCreateOperation(String newCreateOperation) {
        String oldCreateOperation = createOperation;
        createOperation = newCreateOperation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.CUSTOM_CREATE_OPERATION__CREATE_OPERATION, oldCreateOperation, createOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.CUSTOM_CREATE_OPERATION__CREATE_OPERATION:
                return getCreateOperation();
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
            case FacadePackage.CUSTOM_CREATE_OPERATION__CREATE_OPERATION:
                setCreateOperation((String)newValue);
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
            case FacadePackage.CUSTOM_CREATE_OPERATION__CREATE_OPERATION:
                setCreateOperation(CREATE_OPERATION_EDEFAULT);
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
            case FacadePackage.CUSTOM_CREATE_OPERATION__CREATE_OPERATION:
                return CREATE_OPERATION_EDEFAULT == null ? createOperation != null : !CREATE_OPERATION_EDEFAULT.equals(createOperation);
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
        result.append(" (createOperation: ");
        result.append(createOperation);
        result.append(')');
        return result.toString();
    }

} //CustomCreateOperationImpl
