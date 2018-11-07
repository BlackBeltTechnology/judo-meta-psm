/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.DetachFunctionListNavigation;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detach Function List Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.DetachFunctionListNavigationImpl#getDetachFunction <em>Detach Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetachFunctionListNavigationImpl extends DetachListNavigationImpl implements DetachFunctionListNavigation {
    /**
     * The default value of the '{@link #getDetachFunction() <em>Detach Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDetachFunction()
     * @generated
     * @ordered
     */
    protected static final String DETACH_FUNCTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDetachFunction() <em>Detach Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDetachFunction()
     * @generated
     * @ordered
     */
    protected String detachFunction = DETACH_FUNCTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DetachFunctionListNavigationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.DETACH_FUNCTION_LIST_NAVIGATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDetachFunction() {
        return detachFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDetachFunction(String newDetachFunction) {
        String oldDetachFunction = detachFunction;
        detachFunction = newDetachFunction;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.DETACH_FUNCTION_LIST_NAVIGATION__DETACH_FUNCTION, oldDetachFunction, detachFunction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.DETACH_FUNCTION_LIST_NAVIGATION__DETACH_FUNCTION:
                return getDetachFunction();
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
            case FacadePackage.DETACH_FUNCTION_LIST_NAVIGATION__DETACH_FUNCTION:
                setDetachFunction((String)newValue);
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
            case FacadePackage.DETACH_FUNCTION_LIST_NAVIGATION__DETACH_FUNCTION:
                setDetachFunction(DETACH_FUNCTION_EDEFAULT);
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
            case FacadePackage.DETACH_FUNCTION_LIST_NAVIGATION__DETACH_FUNCTION:
                return DETACH_FUNCTION_EDEFAULT == null ? detachFunction != null : !DETACH_FUNCTION_EDEFAULT.equals(detachFunction);
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
        result.append(" (detachFunction: ");
        result.append(detachFunction);
        result.append(')');
        return result.toString();
    }

} //DetachFunctionListNavigationImpl
