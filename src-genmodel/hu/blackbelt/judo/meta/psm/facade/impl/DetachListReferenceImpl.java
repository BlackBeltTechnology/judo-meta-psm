/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.DetachListReference;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Detach List Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.DetachListReferenceImpl#getDetachExpr <em>Detach Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DetachListReferenceImpl extends DetachListNavigationImpl implements DetachListReference {
    /**
     * The default value of the '{@link #getDetachExpr() <em>Detach Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDetachExpr()
     * @generated
     * @ordered
     */
    protected static final String DETACH_EXPR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDetachExpr() <em>Detach Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDetachExpr()
     * @generated
     * @ordered
     */
    protected String detachExpr = DETACH_EXPR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DetachListReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.DETACH_LIST_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDetachExpr() {
        return detachExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDetachExpr(String newDetachExpr) {
        String oldDetachExpr = detachExpr;
        detachExpr = newDetachExpr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.DETACH_LIST_REFERENCE__DETACH_EXPR, oldDetachExpr, detachExpr));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.DETACH_LIST_REFERENCE__DETACH_EXPR:
                return getDetachExpr();
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
            case FacadePackage.DETACH_LIST_REFERENCE__DETACH_EXPR:
                setDetachExpr((String)newValue);
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
            case FacadePackage.DETACH_LIST_REFERENCE__DETACH_EXPR:
                setDetachExpr(DETACH_EXPR_EDEFAULT);
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
            case FacadePackage.DETACH_LIST_REFERENCE__DETACH_EXPR:
                return DETACH_EXPR_EDEFAULT == null ? detachExpr != null : !DETACH_EXPR_EDEFAULT.equals(detachExpr);
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
        result.append(" (detachExpr: ");
        result.append(detachExpr);
        result.append(')');
        return result.toString();
    }

} //DetachListReferenceImpl
