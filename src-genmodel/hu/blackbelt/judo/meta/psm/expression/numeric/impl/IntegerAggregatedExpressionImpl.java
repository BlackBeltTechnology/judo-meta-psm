/**
 */
package hu.blackbelt.judo.meta.psm.expression.numeric.impl;

import hu.blackbelt.judo.meta.psm.expression.AggregatedExpression;
import hu.blackbelt.judo.meta.psm.expression.CollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.ExpressionPackage;
import hu.blackbelt.judo.meta.psm.expression.IntegerExpression;

import hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAggregatedExpression;
import hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage;

import hu.blackbelt.judo.meta.psm.expression.operator.IntegerAggregator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Integer Aggregated Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerAggregatedExpressionImpl#getCollectionExpression <em>Collection Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerAggregatedExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerAggregatedExpressionImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntegerAggregatedExpressionImpl extends MinimalEObjectImpl.Container implements IntegerAggregatedExpression {
    /**
     * The cached value of the '{@link #getCollectionExpression() <em>Collection Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCollectionExpression()
     * @generated
     * @ordered
     */
    protected CollectionExpression collectionExpression;

    /**
     * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected static final IntegerAggregator OPERATOR_EDEFAULT = IntegerAggregator.MIN;

    /**
     * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperator()
     * @generated
     * @ordered
     */
    protected IntegerAggregator operator = OPERATOR_EDEFAULT;

    /**
     * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
    protected IntegerExpression expression;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IntegerAggregatedExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return NumericPackage.Literals.INTEGER_AGGREGATED_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CollectionExpression getCollectionExpression() {
        return collectionExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCollectionExpression(CollectionExpression newCollectionExpression, NotificationChain msgs) {
        CollectionExpression oldCollectionExpression = collectionExpression;
        collectionExpression = newCollectionExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NumericPackage.INTEGER_AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION, oldCollectionExpression, newCollectionExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCollectionExpression(CollectionExpression newCollectionExpression) {
        if (newCollectionExpression != collectionExpression) {
            NotificationChain msgs = null;
            if (collectionExpression != null)
                msgs = ((InternalEObject)collectionExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NumericPackage.INTEGER_AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION, null, msgs);
            if (newCollectionExpression != null)
                msgs = ((InternalEObject)newCollectionExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NumericPackage.INTEGER_AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION, null, msgs);
            msgs = basicSetCollectionExpression(newCollectionExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NumericPackage.INTEGER_AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION, newCollectionExpression, newCollectionExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntegerAggregator getOperator() {
        return operator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperator(IntegerAggregator newOperator) {
        IntegerAggregator oldOperator = operator;
        operator = newOperator == null ? OPERATOR_EDEFAULT : newOperator;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NumericPackage.INTEGER_AGGREGATED_EXPRESSION__OPERATOR, oldOperator, operator));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntegerExpression getExpression() {
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpression(IntegerExpression newExpression, NotificationChain msgs) {
        IntegerExpression oldExpression = expression;
        expression = newExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, NumericPackage.INTEGER_AGGREGATED_EXPRESSION__EXPRESSION, oldExpression, newExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpression(IntegerExpression newExpression) {
        if (newExpression != expression) {
            NotificationChain msgs = null;
            if (expression != null)
                msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - NumericPackage.INTEGER_AGGREGATED_EXPRESSION__EXPRESSION, null, msgs);
            if (newExpression != null)
                msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - NumericPackage.INTEGER_AGGREGATED_EXPRESSION__EXPRESSION, null, msgs);
            msgs = basicSetExpression(newExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, NumericPackage.INTEGER_AGGREGATED_EXPRESSION__EXPRESSION, newExpression, newExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case NumericPackage.INTEGER_AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION:
                return basicSetCollectionExpression(null, msgs);
            case NumericPackage.INTEGER_AGGREGATED_EXPRESSION__EXPRESSION:
                return basicSetExpression(null, msgs);
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
            case NumericPackage.INTEGER_AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION:
                return getCollectionExpression();
            case NumericPackage.INTEGER_AGGREGATED_EXPRESSION__OPERATOR:
                return getOperator();
            case NumericPackage.INTEGER_AGGREGATED_EXPRESSION__EXPRESSION:
                return getExpression();
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
            case NumericPackage.INTEGER_AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION:
                setCollectionExpression((CollectionExpression)newValue);
                return;
            case NumericPackage.INTEGER_AGGREGATED_EXPRESSION__OPERATOR:
                setOperator((IntegerAggregator)newValue);
                return;
            case NumericPackage.INTEGER_AGGREGATED_EXPRESSION__EXPRESSION:
                setExpression((IntegerExpression)newValue);
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
            case NumericPackage.INTEGER_AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION:
                setCollectionExpression((CollectionExpression)null);
                return;
            case NumericPackage.INTEGER_AGGREGATED_EXPRESSION__OPERATOR:
                setOperator(OPERATOR_EDEFAULT);
                return;
            case NumericPackage.INTEGER_AGGREGATED_EXPRESSION__EXPRESSION:
                setExpression((IntegerExpression)null);
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
            case NumericPackage.INTEGER_AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION:
                return collectionExpression != null;
            case NumericPackage.INTEGER_AGGREGATED_EXPRESSION__OPERATOR:
                return operator != OPERATOR_EDEFAULT;
            case NumericPackage.INTEGER_AGGREGATED_EXPRESSION__EXPRESSION:
                return expression != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == AggregatedExpression.class) {
            switch (derivedFeatureID) {
                case NumericPackage.INTEGER_AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION: return ExpressionPackage.AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == AggregatedExpression.class) {
            switch (baseFeatureID) {
                case ExpressionPackage.AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION: return NumericPackage.INTEGER_AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //IntegerAggregatedExpressionImpl
