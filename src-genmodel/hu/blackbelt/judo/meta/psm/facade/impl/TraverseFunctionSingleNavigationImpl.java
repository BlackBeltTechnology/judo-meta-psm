/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.facade.TraverseFunctionSingleNavigation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Traverse Function Single Navigation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.TraverseFunctionSingleNavigationImpl#getTraverseFunction <em>Traverse Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TraverseFunctionSingleNavigationImpl extends TraverseSingleNavigationImpl implements TraverseFunctionSingleNavigation {
    /**
     * The default value of the '{@link #getTraverseFunction() <em>Traverse Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTraverseFunction()
     * @generated
     * @ordered
     */
    protected static final String TRAVERSE_FUNCTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTraverseFunction() <em>Traverse Function</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTraverseFunction()
     * @generated
     * @ordered
     */
    protected String traverseFunction = TRAVERSE_FUNCTION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TraverseFunctionSingleNavigationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.TRAVERSE_FUNCTION_SINGLE_NAVIGATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getTraverseFunction() {
        return traverseFunction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTraverseFunction(String newTraverseFunction) {
        String oldTraverseFunction = traverseFunction;
        traverseFunction = newTraverseFunction;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.TRAVERSE_FUNCTION_SINGLE_NAVIGATION__TRAVERSE_FUNCTION, oldTraverseFunction, traverseFunction));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.TRAVERSE_FUNCTION_SINGLE_NAVIGATION__TRAVERSE_FUNCTION:
                return getTraverseFunction();
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
            case FacadePackage.TRAVERSE_FUNCTION_SINGLE_NAVIGATION__TRAVERSE_FUNCTION:
                setTraverseFunction((String)newValue);
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
            case FacadePackage.TRAVERSE_FUNCTION_SINGLE_NAVIGATION__TRAVERSE_FUNCTION:
                setTraverseFunction(TRAVERSE_FUNCTION_EDEFAULT);
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
            case FacadePackage.TRAVERSE_FUNCTION_SINGLE_NAVIGATION__TRAVERSE_FUNCTION:
                return TRAVERSE_FUNCTION_EDEFAULT == null ? traverseFunction != null : !TRAVERSE_FUNCTION_EDEFAULT.equals(traverseFunction);
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
        result.append(" (traverseFunction: ");
        result.append(traverseFunction);
        result.append(')');
        return result.toString();
    }

} //TraverseFunctionSingleNavigationImpl
