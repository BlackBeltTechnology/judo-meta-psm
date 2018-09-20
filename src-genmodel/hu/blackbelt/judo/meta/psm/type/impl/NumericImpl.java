/**
 */
package hu.blackbelt.judo.meta.psm.type.impl;

import hu.blackbelt.judo.meta.psm.type.Numeric;
import hu.blackbelt.judo.meta.psm.type.TypePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Numeric</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.NumericImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.NumericImpl#getScale <em>Scale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NumericImpl extends PrimitiveImpl implements Numeric {
    /**
     * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrecision()
     * @generated
     * @ordered
     */
    protected static final int PRECISION_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPrecision()
     * @generated
     * @ordered
     */
    protected int precision = PRECISION_EDEFAULT;

    /**
     * The default value of the '{@link #getScale() <em>Scale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScale()
     * @generated
     * @ordered
     */
    protected static final int SCALE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getScale() <em>Scale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getScale()
     * @generated
     * @ordered
     */
    protected int scale = SCALE_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NumericImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.NUMERIC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPrecision() {
        return precision;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPrecision(int newPrecision) {
        int oldPrecision = precision;
        precision = newPrecision;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.NUMERIC__PRECISION, oldPrecision, precision));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getScale() {
        return scale;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setScale(int newScale) {
        int oldScale = scale;
        scale = newScale;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.NUMERIC__SCALE, oldScale, scale));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TypePackage.NUMERIC__PRECISION:
                return getPrecision();
            case TypePackage.NUMERIC__SCALE:
                return getScale();
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
            case TypePackage.NUMERIC__PRECISION:
                setPrecision((Integer)newValue);
                return;
            case TypePackage.NUMERIC__SCALE:
                setScale((Integer)newValue);
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
            case TypePackage.NUMERIC__PRECISION:
                setPrecision(PRECISION_EDEFAULT);
                return;
            case TypePackage.NUMERIC__SCALE:
                setScale(SCALE_EDEFAULT);
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
            case TypePackage.NUMERIC__PRECISION:
                return precision != PRECISION_EDEFAULT;
            case TypePackage.NUMERIC__SCALE:
                return scale != SCALE_EDEFAULT;
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
        result.append(" (precision: ");
        result.append(precision);
        result.append(", scale: ");
        result.append(scale);
        result.append(')');
        return result.toString();
    }

} //NumericImpl
