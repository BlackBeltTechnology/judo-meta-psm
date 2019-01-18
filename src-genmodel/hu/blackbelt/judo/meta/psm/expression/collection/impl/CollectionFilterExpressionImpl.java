/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection.impl;

import hu.blackbelt.judo.meta.psm.expression.CollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;

import hu.blackbelt.judo.meta.psm.expression.collection.CollectionFilterExpression;
import hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionFilterExpressionImpl#getCollectionExpression <em>Collection Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionFilterExpressionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionFilterExpressionImpl extends MinimalEObjectImpl.Container implements CollectionFilterExpression {
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
     * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCondition()
     * @generated
     * @ordered
     */
    protected LogicalExpression condition;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CollectionFilterExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CollectionPackage.Literals.COLLECTION_FILTER_EXPRESSION;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollectionPackage.COLLECTION_FILTER_EXPRESSION__COLLECTION_EXPRESSION, oldCollectionExpression, newCollectionExpression);
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
                msgs = ((InternalEObject)collectionExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CollectionPackage.COLLECTION_FILTER_EXPRESSION__COLLECTION_EXPRESSION, null, msgs);
            if (newCollectionExpression != null)
                msgs = ((InternalEObject)newCollectionExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CollectionPackage.COLLECTION_FILTER_EXPRESSION__COLLECTION_EXPRESSION, null, msgs);
            msgs = basicSetCollectionExpression(newCollectionExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.COLLECTION_FILTER_EXPRESSION__COLLECTION_EXPRESSION, newCollectionExpression, newCollectionExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogicalExpression getCondition() {
        return condition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCondition(LogicalExpression newCondition, NotificationChain msgs) {
        LogicalExpression oldCondition = condition;
        condition = newCondition;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollectionPackage.COLLECTION_FILTER_EXPRESSION__CONDITION, oldCondition, newCondition);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCondition(LogicalExpression newCondition) {
        if (newCondition != condition) {
            NotificationChain msgs = null;
            if (condition != null)
                msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CollectionPackage.COLLECTION_FILTER_EXPRESSION__CONDITION, null, msgs);
            if (newCondition != null)
                msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CollectionPackage.COLLECTION_FILTER_EXPRESSION__CONDITION, null, msgs);
            msgs = basicSetCondition(newCondition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.COLLECTION_FILTER_EXPRESSION__CONDITION, newCondition, newCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CollectionPackage.COLLECTION_FILTER_EXPRESSION__COLLECTION_EXPRESSION:
                return basicSetCollectionExpression(null, msgs);
            case CollectionPackage.COLLECTION_FILTER_EXPRESSION__CONDITION:
                return basicSetCondition(null, msgs);
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
            case CollectionPackage.COLLECTION_FILTER_EXPRESSION__COLLECTION_EXPRESSION:
                return getCollectionExpression();
            case CollectionPackage.COLLECTION_FILTER_EXPRESSION__CONDITION:
                return getCondition();
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
            case CollectionPackage.COLLECTION_FILTER_EXPRESSION__COLLECTION_EXPRESSION:
                setCollectionExpression((CollectionExpression)newValue);
                return;
            case CollectionPackage.COLLECTION_FILTER_EXPRESSION__CONDITION:
                setCondition((LogicalExpression)newValue);
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
            case CollectionPackage.COLLECTION_FILTER_EXPRESSION__COLLECTION_EXPRESSION:
                setCollectionExpression((CollectionExpression)null);
                return;
            case CollectionPackage.COLLECTION_FILTER_EXPRESSION__CONDITION:
                setCondition((LogicalExpression)null);
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
            case CollectionPackage.COLLECTION_FILTER_EXPRESSION__COLLECTION_EXPRESSION:
                return collectionExpression != null;
            case CollectionPackage.COLLECTION_FILTER_EXPRESSION__CONDITION:
                return condition != null;
        }
        return super.eIsSet(featureID);
    }

} //CollectionFilterExpressionImpl
