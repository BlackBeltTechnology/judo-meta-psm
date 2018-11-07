/**
 */
package hu.blackbelt.judo.meta.psm.action.impl;

import hu.blackbelt.judo.meta.psm.action.ActionPackage;
import hu.blackbelt.judo.meta.psm.action.ListEntityParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Entity Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.action.impl.ListEntityParameterImpl#getOnGetDefault <em>On Get Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListEntityParameterImpl extends EntityParameterImpl implements ListEntityParameter {
    /**
     * The default value of the '{@link #getOnGetDefault() <em>On Get Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnGetDefault()
     * @generated
     * @ordered
     */
    protected static final String ON_GET_DEFAULT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnGetDefault() <em>On Get Default</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnGetDefault()
     * @generated
     * @ordered
     */
    protected String onGetDefault = ON_GET_DEFAULT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ListEntityParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ActionPackage.Literals.LIST_ENTITY_PARAMETER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnGetDefault() {
        return onGetDefault;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnGetDefault(String newOnGetDefault) {
        String oldOnGetDefault = onGetDefault;
        onGetDefault = newOnGetDefault;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.LIST_ENTITY_PARAMETER__ON_GET_DEFAULT, oldOnGetDefault, onGetDefault));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ActionPackage.LIST_ENTITY_PARAMETER__ON_GET_DEFAULT:
                return getOnGetDefault();
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
            case ActionPackage.LIST_ENTITY_PARAMETER__ON_GET_DEFAULT:
                setOnGetDefault((String)newValue);
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
            case ActionPackage.LIST_ENTITY_PARAMETER__ON_GET_DEFAULT:
                setOnGetDefault(ON_GET_DEFAULT_EDEFAULT);
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
            case ActionPackage.LIST_ENTITY_PARAMETER__ON_GET_DEFAULT:
                return ON_GET_DEFAULT_EDEFAULT == null ? onGetDefault != null : !ON_GET_DEFAULT_EDEFAULT.equals(onGetDefault);
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
        result.append(" (onGetDefault: ");
        result.append(onGetDefault);
        result.append(')');
        return result.toString();
    }

} //ListEntityParameterImpl
