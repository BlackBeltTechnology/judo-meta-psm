/**
 */
package hu.blackbelt.judo.meta.psm.expression.impl;

import hu.blackbelt.judo.meta.psm.expression.DataExpression;
import hu.blackbelt.judo.meta.psm.expression.ExpressionPackage;
import hu.blackbelt.judo.meta.psm.expression.SwitchCase;
import hu.blackbelt.judo.meta.psm.expression.SwitchExpression;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.impl.SwitchExpressionImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.impl.SwitchExpressionImpl#getDefaultExpression <em>Default Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SwitchExpressionImpl extends MinimalEObjectImpl.Container implements SwitchExpression {
    /**
     * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCases()
     * @generated
     * @ordered
     */
    protected EList<SwitchCase> cases;

    /**
     * The cached value of the '{@link #getDefaultExpression() <em>Default Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDefaultExpression()
     * @generated
     * @ordered
     */
    protected DataExpression defaultExpression;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ExpressionPackage.Literals.SWITCH_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SwitchCase> getCases() {
        if (cases == null) {
            cases = new EObjectContainmentEList<SwitchCase>(SwitchCase.class, this, ExpressionPackage.SWITCH_EXPRESSION__CASES);
        }
        return cases;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataExpression getDefaultExpression() {
        return defaultExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDefaultExpression(DataExpression newDefaultExpression, NotificationChain msgs) {
        DataExpression oldDefaultExpression = defaultExpression;
        defaultExpression = newDefaultExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION, oldDefaultExpression, newDefaultExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDefaultExpression(DataExpression newDefaultExpression) {
        if (newDefaultExpression != defaultExpression) {
            NotificationChain msgs = null;
            if (defaultExpression != null)
                msgs = ((InternalEObject)defaultExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION, null, msgs);
            if (newDefaultExpression != null)
                msgs = ((InternalEObject)newDefaultExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION, null, msgs);
            msgs = basicSetDefaultExpression(newDefaultExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION, newDefaultExpression, newDefaultExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ExpressionPackage.SWITCH_EXPRESSION__CASES:
                return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
            case ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION:
                return basicSetDefaultExpression(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ExpressionPackage.SWITCH_EXPRESSION__CASES:
                return getCases();
            case ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION:
                return getDefaultExpression();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case ExpressionPackage.SWITCH_EXPRESSION__CASES:
                getCases().clear();
                getCases().addAll((Collection<? extends SwitchCase>)newValue);
                return;
            case ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION:
                setDefaultExpression((DataExpression)newValue);
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
            case ExpressionPackage.SWITCH_EXPRESSION__CASES:
                getCases().clear();
                return;
            case ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION:
                setDefaultExpression((DataExpression)null);
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
            case ExpressionPackage.SWITCH_EXPRESSION__CASES:
                return cases != null && !cases.isEmpty();
            case ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION:
                return defaultExpression != null;
        }
        return super.eIsSet(featureID);
    }

} //SwitchExpressionImpl
