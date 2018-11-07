/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.facade.WriteFunctionProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write Function Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.WriteFunctionPropertyImpl#getWriteOperation <em>Write Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WriteFunctionPropertyImpl extends WritePropertyImpl implements WriteFunctionProperty {
    /**
     * The default value of the '{@link #getWriteOperation() <em>Write Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWriteOperation()
     * @generated
     * @ordered
     */
    protected static final String WRITE_OPERATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWriteOperation() <em>Write Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWriteOperation()
     * @generated
     * @ordered
     */
    protected String writeOperation = WRITE_OPERATION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WriteFunctionPropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.WRITE_FUNCTION_PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getWriteOperation() {
        return writeOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWriteOperation(String newWriteOperation) {
        String oldWriteOperation = writeOperation;
        writeOperation = newWriteOperation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.WRITE_FUNCTION_PROPERTY__WRITE_OPERATION, oldWriteOperation, writeOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.WRITE_FUNCTION_PROPERTY__WRITE_OPERATION:
                return getWriteOperation();
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
            case FacadePackage.WRITE_FUNCTION_PROPERTY__WRITE_OPERATION:
                setWriteOperation((String)newValue);
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
            case FacadePackage.WRITE_FUNCTION_PROPERTY__WRITE_OPERATION:
                setWriteOperation(WRITE_OPERATION_EDEFAULT);
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
            case FacadePackage.WRITE_FUNCTION_PROPERTY__WRITE_OPERATION:
                return WRITE_OPERATION_EDEFAULT == null ? writeOperation != null : !WRITE_OPERATION_EDEFAULT.equals(writeOperation);
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
        result.append(" (writeOperation: ");
        result.append(writeOperation);
        result.append(')');
        return result.toString();
    }

} //WriteFunctionPropertyImpl
