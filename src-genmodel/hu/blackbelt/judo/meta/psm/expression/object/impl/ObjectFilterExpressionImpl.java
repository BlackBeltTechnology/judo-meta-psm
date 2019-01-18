/**
 */
package hu.blackbelt.judo.meta.psm.expression.object.impl;

import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;

import hu.blackbelt.judo.meta.psm.expression.object.ObjectFilterExpression;
import hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage;

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
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectFilterExpressionImpl#getObjectExpression <em>Object Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectFilterExpressionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectFilterExpressionImpl extends MinimalEObjectImpl.Container implements ObjectFilterExpression {
    /**
     * The cached value of the '{@link #getObjectExpression() <em>Object Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getObjectExpression()
     * @generated
     * @ordered
     */
    protected ObjectExpression objectExpression;

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
    protected ObjectFilterExpressionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ObjectPackage.Literals.OBJECT_FILTER_EXPRESSION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectExpression getObjectExpression() {
        return objectExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetObjectExpression(ObjectExpression newObjectExpression, NotificationChain msgs) {
        ObjectExpression oldObjectExpression = objectExpression;
        objectExpression = newObjectExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ObjectPackage.OBJECT_FILTER_EXPRESSION__OBJECT_EXPRESSION, oldObjectExpression, newObjectExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setObjectExpression(ObjectExpression newObjectExpression) {
        if (newObjectExpression != objectExpression) {
            NotificationChain msgs = null;
            if (objectExpression != null)
                msgs = ((InternalEObject)objectExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ObjectPackage.OBJECT_FILTER_EXPRESSION__OBJECT_EXPRESSION, null, msgs);
            if (newObjectExpression != null)
                msgs = ((InternalEObject)newObjectExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ObjectPackage.OBJECT_FILTER_EXPRESSION__OBJECT_EXPRESSION, null, msgs);
            msgs = basicSetObjectExpression(newObjectExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ObjectPackage.OBJECT_FILTER_EXPRESSION__OBJECT_EXPRESSION, newObjectExpression, newObjectExpression));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ObjectPackage.OBJECT_FILTER_EXPRESSION__CONDITION, oldCondition, newCondition);
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
                msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ObjectPackage.OBJECT_FILTER_EXPRESSION__CONDITION, null, msgs);
            if (newCondition != null)
                msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ObjectPackage.OBJECT_FILTER_EXPRESSION__CONDITION, null, msgs);
            msgs = basicSetCondition(newCondition, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ObjectPackage.OBJECT_FILTER_EXPRESSION__CONDITION, newCondition, newCondition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ObjectPackage.OBJECT_FILTER_EXPRESSION__OBJECT_EXPRESSION:
                return basicSetObjectExpression(null, msgs);
            case ObjectPackage.OBJECT_FILTER_EXPRESSION__CONDITION:
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
            case ObjectPackage.OBJECT_FILTER_EXPRESSION__OBJECT_EXPRESSION:
                return getObjectExpression();
            case ObjectPackage.OBJECT_FILTER_EXPRESSION__CONDITION:
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
            case ObjectPackage.OBJECT_FILTER_EXPRESSION__OBJECT_EXPRESSION:
                setObjectExpression((ObjectExpression)newValue);
                return;
            case ObjectPackage.OBJECT_FILTER_EXPRESSION__CONDITION:
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
            case ObjectPackage.OBJECT_FILTER_EXPRESSION__OBJECT_EXPRESSION:
                setObjectExpression((ObjectExpression)null);
                return;
            case ObjectPackage.OBJECT_FILTER_EXPRESSION__CONDITION:
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
            case ObjectPackage.OBJECT_FILTER_EXPRESSION__OBJECT_EXPRESSION:
                return objectExpression != null;
            case ObjectPackage.OBJECT_FILTER_EXPRESSION__CONDITION:
                return condition != null;
        }
        return super.eIsSet(featureID);
    }

} //ObjectFilterExpressionImpl
