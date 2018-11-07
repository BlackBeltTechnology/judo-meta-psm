/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.AttachListReference;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attach List Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.AttachListReferenceImpl#getAttachExpr <em>Attach Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttachListReferenceImpl extends AttachListNavigationImpl implements AttachListReference {
    /**
     * The default value of the '{@link #getAttachExpr() <em>Attach Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttachExpr()
     * @generated
     * @ordered
     */
    protected static final String ATTACH_EXPR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAttachExpr() <em>Attach Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAttachExpr()
     * @generated
     * @ordered
     */
    protected String attachExpr = ATTACH_EXPR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AttachListReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.ATTACH_LIST_REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAttachExpr() {
        return attachExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAttachExpr(String newAttachExpr) {
        String oldAttachExpr = attachExpr;
        attachExpr = newAttachExpr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.ATTACH_LIST_REFERENCE__ATTACH_EXPR, oldAttachExpr, attachExpr));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.ATTACH_LIST_REFERENCE__ATTACH_EXPR:
                return getAttachExpr();
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
            case FacadePackage.ATTACH_LIST_REFERENCE__ATTACH_EXPR:
                setAttachExpr((String)newValue);
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
            case FacadePackage.ATTACH_LIST_REFERENCE__ATTACH_EXPR:
                setAttachExpr(ATTACH_EXPR_EDEFAULT);
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
            case FacadePackage.ATTACH_LIST_REFERENCE__ATTACH_EXPR:
                return ATTACH_EXPR_EDEFAULT == null ? attachExpr != null : !ATTACH_EXPR_EDEFAULT.equals(attachExpr);
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
        result.append(" (attachExpr: ");
        result.append(attachExpr);
        result.append(')');
        return result.toString();
    }

} //AttachListReferenceImpl
