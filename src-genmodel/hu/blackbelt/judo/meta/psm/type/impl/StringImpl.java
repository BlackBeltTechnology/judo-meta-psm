/**
 */
package hu.blackbelt.judo.meta.psm.type.impl;

import hu.blackbelt.judo.meta.psm.type.TypePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.StringImpl#getMaxLength <em>Max Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringImpl extends PrimitiveImpl implements hu.blackbelt.judo.meta.psm.type.String {
    /**
     * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxLength()
     * @generated
     * @ordered
     */
    protected static final int MAX_LENGTH_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxLength()
     * @generated
     * @ordered
     */
    protected int maxLength = MAX_LENGTH_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StringImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.STRING;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getMaxLength() {
        return maxLength;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMaxLength(int newMaxLength) {
        int oldMaxLength = maxLength;
        maxLength = newMaxLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.STRING__MAX_LENGTH, oldMaxLength, maxLength));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TypePackage.STRING__MAX_LENGTH:
                return getMaxLength();
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
            case TypePackage.STRING__MAX_LENGTH:
                setMaxLength((Integer)newValue);
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
            case TypePackage.STRING__MAX_LENGTH:
                setMaxLength(MAX_LENGTH_EDEFAULT);
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
            case TypePackage.STRING__MAX_LENGTH:
                return maxLength != MAX_LENGTH_EDEFAULT;
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
        result.append(" (maxLength: ");
        result.append(maxLength);
        result.append(')');
        return result.toString();
    }

} //StringImpl
