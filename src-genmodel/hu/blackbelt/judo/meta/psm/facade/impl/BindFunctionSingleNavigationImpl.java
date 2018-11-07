/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.BindFunctionSingleNavigation;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bind Function Single Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.BindFunctionSingleNavigationImpl#getBindOperation <em>Bind Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindFunctionSingleNavigationImpl extends BindSingleNavigationImpl implements BindFunctionSingleNavigation {
    /**
     * The default value of the '{@link #getBindOperation() <em>Bind Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBindOperation()
     * @generated
     * @ordered
     */
    protected static final String BIND_OPERATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBindOperation() <em>Bind Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBindOperation()
     * @generated
     * @ordered
     */
    protected String bindOperation = BIND_OPERATION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BindFunctionSingleNavigationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.BIND_FUNCTION_SINGLE_NAVIGATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBindOperation() {
        return bindOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindOperation(String newBindOperation) {
        String oldBindOperation = bindOperation;
        bindOperation = newBindOperation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.BIND_FUNCTION_SINGLE_NAVIGATION__BIND_OPERATION, oldBindOperation, bindOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.BIND_FUNCTION_SINGLE_NAVIGATION__BIND_OPERATION:
                return getBindOperation();
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
            case FacadePackage.BIND_FUNCTION_SINGLE_NAVIGATION__BIND_OPERATION:
                setBindOperation((String)newValue);
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
            case FacadePackage.BIND_FUNCTION_SINGLE_NAVIGATION__BIND_OPERATION:
                setBindOperation(BIND_OPERATION_EDEFAULT);
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
            case FacadePackage.BIND_FUNCTION_SINGLE_NAVIGATION__BIND_OPERATION:
                return BIND_OPERATION_EDEFAULT == null ? bindOperation != null : !BIND_OPERATION_EDEFAULT.equals(bindOperation);
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
        result.append(" (bindOperation: ");
        result.append(bindOperation);
        result.append(')');
        return result.toString();
    }

} //BindFunctionSingleNavigationImpl
