/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection.impl;

import hu.blackbelt.judo.meta.psm.expression.CollectionExpression;

import hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage;
import hu.blackbelt.judo.meta.psm.expression.collection.OrderByItem;
import hu.blackbelt.judo.meta.psm.expression.collection.SortExpression;

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
 * An implementation of the model object '<em><b>Sort Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.SortExpressionImpl#getCollectionExpression <em>Collection Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.SortExpressionImpl#getOrderBy <em>Order By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortExpressionImpl extends MinimalEObjectImpl.Container implements SortExpression {
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
     * The cached value of the '{@link #getOrderBy() <em>Order By</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOrderBy()
     * @generated
     * @ordered
     */
    protected EList<OrderByItem> orderBy;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SortExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CollectionPackage.Literals.SORT_EXPRESSION;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CollectionPackage.SORT_EXPRESSION__COLLECTION_EXPRESSION, oldCollectionExpression, newCollectionExpression);
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
                msgs = ((InternalEObject)collectionExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CollectionPackage.SORT_EXPRESSION__COLLECTION_EXPRESSION, null, msgs);
            if (newCollectionExpression != null)
                msgs = ((InternalEObject)newCollectionExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CollectionPackage.SORT_EXPRESSION__COLLECTION_EXPRESSION, null, msgs);
            msgs = basicSetCollectionExpression(newCollectionExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.SORT_EXPRESSION__COLLECTION_EXPRESSION, newCollectionExpression, newCollectionExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OrderByItem> getOrderBy() {
        if (orderBy == null) {
            orderBy = new EObjectContainmentEList<OrderByItem>(OrderByItem.class, this, CollectionPackage.SORT_EXPRESSION__ORDER_BY);
        }
        return orderBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case CollectionPackage.SORT_EXPRESSION__COLLECTION_EXPRESSION:
                return basicSetCollectionExpression(null, msgs);
            case CollectionPackage.SORT_EXPRESSION__ORDER_BY:
                return ((InternalEList<?>)getOrderBy()).basicRemove(otherEnd, msgs);
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
            case CollectionPackage.SORT_EXPRESSION__COLLECTION_EXPRESSION:
                return getCollectionExpression();
            case CollectionPackage.SORT_EXPRESSION__ORDER_BY:
                return getOrderBy();
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
            case CollectionPackage.SORT_EXPRESSION__COLLECTION_EXPRESSION:
                setCollectionExpression((CollectionExpression)newValue);
                return;
            case CollectionPackage.SORT_EXPRESSION__ORDER_BY:
                getOrderBy().clear();
                getOrderBy().addAll((Collection<? extends OrderByItem>)newValue);
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
            case CollectionPackage.SORT_EXPRESSION__COLLECTION_EXPRESSION:
                setCollectionExpression((CollectionExpression)null);
                return;
            case CollectionPackage.SORT_EXPRESSION__ORDER_BY:
                getOrderBy().clear();
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
            case CollectionPackage.SORT_EXPRESSION__COLLECTION_EXPRESSION:
                return collectionExpression != null;
            case CollectionPackage.SORT_EXPRESSION__ORDER_BY:
                return orderBy != null && !orderBy.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //SortExpressionImpl
