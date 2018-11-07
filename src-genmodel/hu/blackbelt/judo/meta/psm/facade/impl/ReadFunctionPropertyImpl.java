/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.facade.ReadFunctionProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Function Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.ReadFunctionPropertyImpl#getReadFunction <em>Read Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadFunctionPropertyImpl extends ReadPropertyImpl implements ReadFunctionProperty {
    /**
     * The default value of the '{@link #getReadFunction() <em>Read Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadFunction()
     * @generated
     * @ordered
     */
    protected static final String READ_FUNCTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReadFunction() <em>Read Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadFunction()
     * @generated
     * @ordered
     */
    protected String readFunction = READ_FUNCTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReadFunctionPropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.READ_FUNCTION_PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getReadFunction() {
        return readFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReadFunction(String newReadFunction) {
        String oldReadFunction = readFunction;
        readFunction = newReadFunction;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.READ_FUNCTION_PROPERTY__READ_FUNCTION, oldReadFunction, readFunction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.READ_FUNCTION_PROPERTY__READ_FUNCTION:
                return getReadFunction();
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
            case FacadePackage.READ_FUNCTION_PROPERTY__READ_FUNCTION:
                setReadFunction((String)newValue);
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
            case FacadePackage.READ_FUNCTION_PROPERTY__READ_FUNCTION:
                setReadFunction(READ_FUNCTION_EDEFAULT);
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
            case FacadePackage.READ_FUNCTION_PROPERTY__READ_FUNCTION:
                return READ_FUNCTION_EDEFAULT == null ? readFunction != null : !READ_FUNCTION_EDEFAULT.equals(readFunction);
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
        result.append(" (readFunction: ");
        result.append(readFunction);
        result.append(')');
        return result.toString();
    }

} //ReadFunctionPropertyImpl
