/**
 */
package hu.blackbelt.judo.meta.psm.expression.logical.impl;

import hu.blackbelt.judo.meta.psm.expression.NumericExpression;

import hu.blackbelt.judo.meta.psm.expression.logical.DecimalComparison;
import hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage;

import hu.blackbelt.judo.meta.psm.expression.operator.DecimalComparator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decimal Comparison</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.DecimalComparisonImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.DecimalComparisonImpl#getRight <em>Right</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.DecimalComparisonImpl#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecimalComparisonImpl extends MinimalEObjectImpl.Container implements DecimalComparison {
    /**
     * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeft()
     * @generated
     * @ordered
     */
    protected NumericExpression left;

    /**
     * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRight()
     * @generated
     * @ordered
     */
    protected NumericExpression right;

    /**
     * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected static final DecimalComparator OPERATOR_EDEFAULT = DecimalComparator.LESS_THAN;

    /**
     * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected DecimalComparator operator = OPERATOR_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DecimalComparisonImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return LogicalPackage.Literals.DECIMAL_COMPARISON;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumericExpression getLeft() {
        return left;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLeft(NumericExpression newLeft, NotificationChain msgs) {
        NumericExpression oldLeft = left;
        left = newLeft;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalPackage.DECIMAL_COMPARISON__LEFT, oldLeft, newLeft);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLeft(NumericExpression newLeft) {
        if (newLeft != left) {
            NotificationChain msgs = null;
            if (left != null)
                msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicalPackage.DECIMAL_COMPARISON__LEFT, null, msgs);
            if (newLeft != null)
                msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicalPackage.DECIMAL_COMPARISON__LEFT, null, msgs);
            msgs = basicSetLeft(newLeft, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.DECIMAL_COMPARISON__LEFT, newLeft, newLeft));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumericExpression getRight() {
        return right;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRight(NumericExpression newRight, NotificationChain msgs) {
        NumericExpression oldRight = right;
        right = newRight;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LogicalPackage.DECIMAL_COMPARISON__RIGHT, oldRight, newRight);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRight(NumericExpression newRight) {
        if (newRight != right) {
            NotificationChain msgs = null;
            if (right != null)
                msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LogicalPackage.DECIMAL_COMPARISON__RIGHT, null, msgs);
            if (newRight != null)
                msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LogicalPackage.DECIMAL_COMPARISON__RIGHT, null, msgs);
            msgs = basicSetRight(newRight, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.DECIMAL_COMPARISON__RIGHT, newRight, newRight));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DecimalComparator getOperator() {
        return operator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperator(DecimalComparator newOperator) {
        DecimalComparator oldOperator = operator;
        operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, LogicalPackage.DECIMAL_COMPARISON__OPERATOR, oldOperator, operator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case LogicalPackage.DECIMAL_COMPARISON__LEFT:
                return basicSetLeft(null, msgs);
            case LogicalPackage.DECIMAL_COMPARISON__RIGHT:
                return basicSetRight(null, msgs);
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
            case LogicalPackage.DECIMAL_COMPARISON__LEFT:
                return getLeft();
            case LogicalPackage.DECIMAL_COMPARISON__RIGHT:
                return getRight();
            case LogicalPackage.DECIMAL_COMPARISON__OPERATOR:
                return getOperator();
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
            case LogicalPackage.DECIMAL_COMPARISON__LEFT:
                setLeft((NumericExpression)newValue);
                return;
            case LogicalPackage.DECIMAL_COMPARISON__RIGHT:
                setRight((NumericExpression)newValue);
                return;
            case LogicalPackage.DECIMAL_COMPARISON__OPERATOR:
                setOperator((DecimalComparator)newValue);
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
            case LogicalPackage.DECIMAL_COMPARISON__LEFT:
                setLeft((NumericExpression)null);
                return;
            case LogicalPackage.DECIMAL_COMPARISON__RIGHT:
                setRight((NumericExpression)null);
                return;
            case LogicalPackage.DECIMAL_COMPARISON__OPERATOR:
                setOperator(OPERATOR_EDEFAULT);
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
            case LogicalPackage.DECIMAL_COMPARISON__LEFT:
                return left != null;
            case LogicalPackage.DECIMAL_COMPARISON__RIGHT:
                return right != null;
            case LogicalPackage.DECIMAL_COMPARISON__OPERATOR:
                return operator != OPERATOR_EDEFAULT;
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
        result.append(" (operator: ");
        result.append(operator);
        result.append(')');
        return result.toString();
    }

} //DecimalComparisonImpl
