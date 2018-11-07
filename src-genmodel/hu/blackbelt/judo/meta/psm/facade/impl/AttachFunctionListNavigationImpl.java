/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.AttachFunctionListNavigation;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attach Function List Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.AttachFunctionListNavigationImpl#getAttachFunction <em>Attach Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachFunctionListNavigationImpl extends AttachListNavigationImpl implements AttachFunctionListNavigation {
    /**
     * The default value of the '{@link #getAttachFunction() <em>Attach Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttachFunction()
     * @generated
     * @ordered
     */
    protected static final String ATTACH_FUNCTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAttachFunction() <em>Attach Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttachFunction()
     * @generated
     * @ordered
     */
    protected String attachFunction = ATTACH_FUNCTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttachFunctionListNavigationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.ATTACH_FUNCTION_LIST_NAVIGATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAttachFunction() {
        return attachFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttachFunction(String newAttachFunction) {
        String oldAttachFunction = attachFunction;
        attachFunction = newAttachFunction;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.ATTACH_FUNCTION_LIST_NAVIGATION__ATTACH_FUNCTION, oldAttachFunction, attachFunction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.ATTACH_FUNCTION_LIST_NAVIGATION__ATTACH_FUNCTION:
                return getAttachFunction();
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
            case FacadePackage.ATTACH_FUNCTION_LIST_NAVIGATION__ATTACH_FUNCTION:
                setAttachFunction((String)newValue);
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
            case FacadePackage.ATTACH_FUNCTION_LIST_NAVIGATION__ATTACH_FUNCTION:
                setAttachFunction(ATTACH_FUNCTION_EDEFAULT);
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
            case FacadePackage.ATTACH_FUNCTION_LIST_NAVIGATION__ATTACH_FUNCTION:
                return ATTACH_FUNCTION_EDEFAULT == null ? attachFunction != null : !ATTACH_FUNCTION_EDEFAULT.equals(attachFunction);
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
        result.append(" (attachFunction: ");
        result.append(attachFunction);
        result.append(')');
        return result.toString();
    }

} //AttachFunctionListNavigationImpl
