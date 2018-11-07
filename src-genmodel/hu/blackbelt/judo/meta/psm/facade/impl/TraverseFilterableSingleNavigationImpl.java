/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.facade.TraverseFilterableSingleNavigation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traverse Filterable Single Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.TraverseFilterableSingleNavigationImpl#isFilterable <em>Filterable</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.TraverseFilterableSingleNavigationImpl#getTraverseExpr <em>Traverse Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraverseFilterableSingleNavigationImpl extends TraverseSingleNavigationImpl implements TraverseFilterableSingleNavigation {
    /**
     * The default value of the '{@link #isFilterable() <em>Filterable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFilterable()
     * @generated
     * @ordered
     */
    protected static final boolean FILTERABLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isFilterable() <em>Filterable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isFilterable()
     * @generated
     * @ordered
     */
    protected boolean filterable = FILTERABLE_EDEFAULT;

    /**
     * The default value of the '{@link #getTraverseExpr() <em>Traverse Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTraverseExpr()
     * @generated
     * @ordered
     */
    protected static final String TRAVERSE_EXPR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTraverseExpr() <em>Traverse Expr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTraverseExpr()
     * @generated
     * @ordered
     */
    protected String traverseExpr = TRAVERSE_EXPR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TraverseFilterableSingleNavigationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.TRAVERSE_FILTERABLE_SINGLE_NAVIGATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isFilterable() {
        return filterable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFilterable(boolean newFilterable) {
        boolean oldFilterable = filterable;
        filterable = newFilterable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.TRAVERSE_FILTERABLE_SINGLE_NAVIGATION__FILTERABLE, oldFilterable, filterable));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTraverseExpr() {
        return traverseExpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTraverseExpr(String newTraverseExpr) {
        String oldTraverseExpr = traverseExpr;
        traverseExpr = newTraverseExpr;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.TRAVERSE_FILTERABLE_SINGLE_NAVIGATION__TRAVERSE_EXPR, oldTraverseExpr, traverseExpr));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.TRAVERSE_FILTERABLE_SINGLE_NAVIGATION__FILTERABLE:
                return isFilterable();
            case FacadePackage.TRAVERSE_FILTERABLE_SINGLE_NAVIGATION__TRAVERSE_EXPR:
                return getTraverseExpr();
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
            case FacadePackage.TRAVERSE_FILTERABLE_SINGLE_NAVIGATION__FILTERABLE:
                setFilterable((Boolean)newValue);
                return;
            case FacadePackage.TRAVERSE_FILTERABLE_SINGLE_NAVIGATION__TRAVERSE_EXPR:
                setTraverseExpr((String)newValue);
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
            case FacadePackage.TRAVERSE_FILTERABLE_SINGLE_NAVIGATION__FILTERABLE:
                setFilterable(FILTERABLE_EDEFAULT);
                return;
            case FacadePackage.TRAVERSE_FILTERABLE_SINGLE_NAVIGATION__TRAVERSE_EXPR:
                setTraverseExpr(TRAVERSE_EXPR_EDEFAULT);
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
            case FacadePackage.TRAVERSE_FILTERABLE_SINGLE_NAVIGATION__FILTERABLE:
                return filterable != FILTERABLE_EDEFAULT;
            case FacadePackage.TRAVERSE_FILTERABLE_SINGLE_NAVIGATION__TRAVERSE_EXPR:
                return TRAVERSE_EXPR_EDEFAULT == null ? traverseExpr != null : !TRAVERSE_EXPR_EDEFAULT.equals(traverseExpr);
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
        result.append(" (filterable: ");
        result.append(filterable);
        result.append(", traverseExpr: ");
        result.append(traverseExpr);
        result.append(')');
        return result.toString();
    }

} //TraverseFilterableSingleNavigationImpl
