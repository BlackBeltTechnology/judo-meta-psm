/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.EntitySetSelector;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Set Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.EntitySetSelectorImpl#getGetExpr <em>Get Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntitySetSelectorImpl extends EntitySelectorImpl implements EntitySetSelector {
    /**
     * The default value of the '{@link #getGetExpr() <em>Get Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGetExpr()
     * @generated
     * @ordered
     */
    protected static final String GET_EXPR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGetExpr() <em>Get Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGetExpr()
     * @generated
     * @ordered
     */
    protected String getExpr = GET_EXPR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EntitySetSelectorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.ENTITY_SET_SELECTOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getGetExpr() {
        return getExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGetExpr(String newGetExpr) {
        String oldGetExpr = getExpr;
        getExpr = newGetExpr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.ENTITY_SET_SELECTOR__GET_EXPR, oldGetExpr, getExpr));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.ENTITY_SET_SELECTOR__GET_EXPR:
                return getGetExpr();
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
            case FacadePackage.ENTITY_SET_SELECTOR__GET_EXPR:
                setGetExpr((String)newValue);
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
            case FacadePackage.ENTITY_SET_SELECTOR__GET_EXPR:
                setGetExpr(GET_EXPR_EDEFAULT);
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
            case FacadePackage.ENTITY_SET_SELECTOR__GET_EXPR:
                return GET_EXPR_EDEFAULT == null ? getExpr != null : !GET_EXPR_EDEFAULT.equals(getExpr);
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
        result.append(" (getExpr: ");
        result.append(getExpr);
        result.append(')');
        return result.toString();
    }

} //EntitySetSelectorImpl
