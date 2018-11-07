/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.BindSingleReference;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bind Single Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.BindSingleReferenceImpl#getBindExpr <em>Bind Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindSingleReferenceImpl extends BindSingleNavigationImpl implements BindSingleReference {
    /**
     * The default value of the '{@link #getBindExpr() <em>Bind Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBindExpr()
     * @generated
     * @ordered
     */
    protected static final String BIND_EXPR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBindExpr() <em>Bind Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBindExpr()
     * @generated
     * @ordered
     */
    protected String bindExpr = BIND_EXPR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BindSingleReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.BIND_SINGLE_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getBindExpr() {
        return bindExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setBindExpr(String newBindExpr) {
        String oldBindExpr = bindExpr;
        bindExpr = newBindExpr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.BIND_SINGLE_REFERENCE__BIND_EXPR, oldBindExpr, bindExpr));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.BIND_SINGLE_REFERENCE__BIND_EXPR:
                return getBindExpr();
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
            case FacadePackage.BIND_SINGLE_REFERENCE__BIND_EXPR:
                setBindExpr((String)newValue);
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
            case FacadePackage.BIND_SINGLE_REFERENCE__BIND_EXPR:
                setBindExpr(BIND_EXPR_EDEFAULT);
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
            case FacadePackage.BIND_SINGLE_REFERENCE__BIND_EXPR:
                return BIND_EXPR_EDEFAULT == null ? bindExpr != null : !BIND_EXPR_EDEFAULT.equals(bindExpr);
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
        result.append(" (bindExpr: ");
        result.append(bindExpr);
        result.append(')');
        return result.toString();
    }

} //BindSingleReferenceImpl
