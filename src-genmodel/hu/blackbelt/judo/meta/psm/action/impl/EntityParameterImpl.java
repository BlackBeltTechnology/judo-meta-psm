/**
 */
package hu.blackbelt.judo.meta.psm.action.impl;

import hu.blackbelt.judo.meta.psm.action.ActionPackage;
import hu.blackbelt.judo.meta.psm.action.EntityParameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.action.impl.EntityParameterImpl#getOnGetOptions <em>On Get Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EntityParameterImpl extends ParameterImpl implements EntityParameter {
    /**
     * The default value of the '{@link #getOnGetOptions() <em>On Get Options</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnGetOptions()
     * @generated
     * @ordered
     */
    protected static final String ON_GET_OPTIONS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOnGetOptions() <em>On Get Options</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnGetOptions()
     * @generated
     * @ordered
     */
    protected String onGetOptions = ON_GET_OPTIONS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntityParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ActionPackage.Literals.ENTITY_PARAMETER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getOnGetOptions() {
        return onGetOptions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnGetOptions(String newOnGetOptions) {
        String oldOnGetOptions = onGetOptions;
        onGetOptions = newOnGetOptions;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ActionPackage.ENTITY_PARAMETER__ON_GET_OPTIONS, oldOnGetOptions, onGetOptions));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ActionPackage.ENTITY_PARAMETER__ON_GET_OPTIONS:
                return getOnGetOptions();
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
            case ActionPackage.ENTITY_PARAMETER__ON_GET_OPTIONS:
                setOnGetOptions((String)newValue);
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
            case ActionPackage.ENTITY_PARAMETER__ON_GET_OPTIONS:
                setOnGetOptions(ON_GET_OPTIONS_EDEFAULT);
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
            case ActionPackage.ENTITY_PARAMETER__ON_GET_OPTIONS:
                return ON_GET_OPTIONS_EDEFAULT == null ? onGetOptions != null : !ON_GET_OPTIONS_EDEFAULT.equals(onGetOptions);
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
        result.append(" (onGetOptions: ");
        result.append(onGetOptions);
        result.append(')');
        return result.toString();
    }

} //EntityParameterImpl
