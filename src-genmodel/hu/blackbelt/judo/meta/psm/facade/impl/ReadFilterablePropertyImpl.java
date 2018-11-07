/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.facade.ReadFilterableProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Read Filterable Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.ReadFilterablePropertyImpl#isFiltareble <em>Filtareble</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.ReadFilterablePropertyImpl#getReadExpr <em>Read Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReadFilterablePropertyImpl extends ReadPropertyImpl implements ReadFilterableProperty {
    /**
     * The default value of the '{@link #isFiltareble() <em>Filtareble</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFiltareble()
     * @generated
     * @ordered
     */
    protected static final boolean FILTAREBLE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isFiltareble() <em>Filtareble</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFiltareble()
     * @generated
     * @ordered
     */
    protected boolean filtareble = FILTAREBLE_EDEFAULT;

    /**
     * The default value of the '{@link #getReadExpr() <em>Read Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadExpr()
     * @generated
     * @ordered
     */
    protected static final String READ_EXPR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReadExpr() <em>Read Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReadExpr()
     * @generated
     * @ordered
     */
    protected String readExpr = READ_EXPR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReadFilterablePropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.READ_FILTERABLE_PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isFiltareble() {
        return filtareble;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFiltareble(boolean newFiltareble) {
        boolean oldFiltareble = filtareble;
        filtareble = newFiltareble;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.READ_FILTERABLE_PROPERTY__FILTAREBLE, oldFiltareble, filtareble));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getReadExpr() {
        return readExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReadExpr(String newReadExpr) {
        String oldReadExpr = readExpr;
        readExpr = newReadExpr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.READ_FILTERABLE_PROPERTY__READ_EXPR, oldReadExpr, readExpr));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.READ_FILTERABLE_PROPERTY__FILTAREBLE:
                return isFiltareble();
            case FacadePackage.READ_FILTERABLE_PROPERTY__READ_EXPR:
                return getReadExpr();
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
            case FacadePackage.READ_FILTERABLE_PROPERTY__FILTAREBLE:
                setFiltareble((Boolean)newValue);
                return;
            case FacadePackage.READ_FILTERABLE_PROPERTY__READ_EXPR:
                setReadExpr((String)newValue);
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
            case FacadePackage.READ_FILTERABLE_PROPERTY__FILTAREBLE:
                setFiltareble(FILTAREBLE_EDEFAULT);
                return;
            case FacadePackage.READ_FILTERABLE_PROPERTY__READ_EXPR:
                setReadExpr(READ_EXPR_EDEFAULT);
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
            case FacadePackage.READ_FILTERABLE_PROPERTY__FILTAREBLE:
                return filtareble != FILTAREBLE_EDEFAULT;
            case FacadePackage.READ_FILTERABLE_PROPERTY__READ_EXPR:
                return READ_EXPR_EDEFAULT == null ? readExpr != null : !READ_EXPR_EDEFAULT.equals(readExpr);
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
        result.append(" (filtareble: ");
        result.append(filtareble);
        result.append(", readExpr: ");
        result.append(readExpr);
        result.append(')');
        return result.toString();
    }

} //ReadFilterablePropertyImpl
