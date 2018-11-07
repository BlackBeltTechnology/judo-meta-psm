/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.facade.WriteAttribute;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Write Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.WriteAttributeImpl#getWriteExpr <em>Write Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WriteAttributeImpl extends WritePropertyImpl implements WriteAttribute {
    /**
     * The default value of the '{@link #getWriteExpr() <em>Write Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWriteExpr()
     * @generated
     * @ordered
     */
    protected static final String WRITE_EXPR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWriteExpr() <em>Write Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWriteExpr()
     * @generated
     * @ordered
     */
    protected String writeExpr = WRITE_EXPR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WriteAttributeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.WRITE_ATTRIBUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getWriteExpr() {
        return writeExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setWriteExpr(String newWriteExpr) {
        String oldWriteExpr = writeExpr;
        writeExpr = newWriteExpr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.WRITE_ATTRIBUTE__WRITE_EXPR, oldWriteExpr, writeExpr));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.WRITE_ATTRIBUTE__WRITE_EXPR:
                return getWriteExpr();
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
            case FacadePackage.WRITE_ATTRIBUTE__WRITE_EXPR:
                setWriteExpr((String)newValue);
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
            case FacadePackage.WRITE_ATTRIBUTE__WRITE_EXPR:
                setWriteExpr(WRITE_EXPR_EDEFAULT);
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
            case FacadePackage.WRITE_ATTRIBUTE__WRITE_EXPR:
                return WRITE_EXPR_EDEFAULT == null ? writeExpr != null : !WRITE_EXPR_EDEFAULT.equals(writeExpr);
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
        result.append(" (writeExpr: ");
        result.append(writeExpr);
        result.append(')');
        return result.toString();
    }

} //WriteAttributeImpl
