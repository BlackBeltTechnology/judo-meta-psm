/**
 */
package hu.blackbelt.judo.meta.psm.derived.impl;

import hu.blackbelt.judo.meta.psm.data.impl.ReferenceTypedElementImpl;

import hu.blackbelt.judo.meta.psm.derived.DerivedPackage;
import hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor;

import hu.blackbelt.judo.meta.psm.expression.ReferenceExpression;
import hu.blackbelt.judo.meta.psm.expression.ReferenceSelector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Accessor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.impl.ReferenceAccessorImpl#getGetterExpression <em>Getter Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.impl.ReferenceAccessorImpl#getSetterExpression <em>Setter Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.impl.ReferenceAccessorImpl#getRangeExpression <em>Range Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReferenceAccessorImpl extends ReferenceTypedElementImpl implements ReferenceAccessor {
    /**
     * The cached value of the '{@link #getGetterExpression() <em>Getter Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGetterExpression()
     * @generated
     * @ordered
     */
    protected ReferenceExpression getterExpression;

    /**
     * The cached value of the '{@link #getSetterExpression() <em>Setter Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSetterExpression()
     * @generated
     * @ordered
     */
    protected ReferenceSelector setterExpression;

    /**
     * The cached value of the '{@link #getRangeExpression() <em>Range Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRangeExpression()
     * @generated
     * @ordered
     */
    protected ReferenceExpression rangeExpression;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReferenceAccessorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DerivedPackage.Literals.REFERENCE_ACCESSOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferenceExpression getGetterExpression() {
        return getterExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGetterExpression(ReferenceExpression newGetterExpression, NotificationChain msgs) {
        ReferenceExpression oldGetterExpression = getterExpression;
        getterExpression = newGetterExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DerivedPackage.REFERENCE_ACCESSOR__GETTER_EXPRESSION, oldGetterExpression, newGetterExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGetterExpression(ReferenceExpression newGetterExpression) {
        if (newGetterExpression != getterExpression) {
            NotificationChain msgs = null;
            if (getterExpression != null)
                msgs = ((InternalEObject)getterExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DerivedPackage.REFERENCE_ACCESSOR__GETTER_EXPRESSION, null, msgs);
            if (newGetterExpression != null)
                msgs = ((InternalEObject)newGetterExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DerivedPackage.REFERENCE_ACCESSOR__GETTER_EXPRESSION, null, msgs);
            msgs = basicSetGetterExpression(newGetterExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DerivedPackage.REFERENCE_ACCESSOR__GETTER_EXPRESSION, newGetterExpression, newGetterExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferenceSelector getSetterExpression() {
        return setterExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSetterExpression(ReferenceSelector newSetterExpression, NotificationChain msgs) {
        ReferenceSelector oldSetterExpression = setterExpression;
        setterExpression = newSetterExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DerivedPackage.REFERENCE_ACCESSOR__SETTER_EXPRESSION, oldSetterExpression, newSetterExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSetterExpression(ReferenceSelector newSetterExpression) {
        if (newSetterExpression != setterExpression) {
            NotificationChain msgs = null;
            if (setterExpression != null)
                msgs = ((InternalEObject)setterExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DerivedPackage.REFERENCE_ACCESSOR__SETTER_EXPRESSION, null, msgs);
            if (newSetterExpression != null)
                msgs = ((InternalEObject)newSetterExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DerivedPackage.REFERENCE_ACCESSOR__SETTER_EXPRESSION, null, msgs);
            msgs = basicSetSetterExpression(newSetterExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DerivedPackage.REFERENCE_ACCESSOR__SETTER_EXPRESSION, newSetterExpression, newSetterExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReferenceExpression getRangeExpression() {
        return rangeExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRangeExpression(ReferenceExpression newRangeExpression, NotificationChain msgs) {
        ReferenceExpression oldRangeExpression = rangeExpression;
        rangeExpression = newRangeExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DerivedPackage.REFERENCE_ACCESSOR__RANGE_EXPRESSION, oldRangeExpression, newRangeExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRangeExpression(ReferenceExpression newRangeExpression) {
        if (newRangeExpression != rangeExpression) {
            NotificationChain msgs = null;
            if (rangeExpression != null)
                msgs = ((InternalEObject)rangeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DerivedPackage.REFERENCE_ACCESSOR__RANGE_EXPRESSION, null, msgs);
            if (newRangeExpression != null)
                msgs = ((InternalEObject)newRangeExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DerivedPackage.REFERENCE_ACCESSOR__RANGE_EXPRESSION, null, msgs);
            msgs = basicSetRangeExpression(newRangeExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DerivedPackage.REFERENCE_ACCESSOR__RANGE_EXPRESSION, newRangeExpression, newRangeExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DerivedPackage.REFERENCE_ACCESSOR__GETTER_EXPRESSION:
                return basicSetGetterExpression(null, msgs);
            case DerivedPackage.REFERENCE_ACCESSOR__SETTER_EXPRESSION:
                return basicSetSetterExpression(null, msgs);
            case DerivedPackage.REFERENCE_ACCESSOR__RANGE_EXPRESSION:
                return basicSetRangeExpression(null, msgs);
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
            case DerivedPackage.REFERENCE_ACCESSOR__GETTER_EXPRESSION:
                return getGetterExpression();
            case DerivedPackage.REFERENCE_ACCESSOR__SETTER_EXPRESSION:
                return getSetterExpression();
            case DerivedPackage.REFERENCE_ACCESSOR__RANGE_EXPRESSION:
                return getRangeExpression();
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
            case DerivedPackage.REFERENCE_ACCESSOR__GETTER_EXPRESSION:
                setGetterExpression((ReferenceExpression)newValue);
                return;
            case DerivedPackage.REFERENCE_ACCESSOR__SETTER_EXPRESSION:
                setSetterExpression((ReferenceSelector)newValue);
                return;
            case DerivedPackage.REFERENCE_ACCESSOR__RANGE_EXPRESSION:
                setRangeExpression((ReferenceExpression)newValue);
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
            case DerivedPackage.REFERENCE_ACCESSOR__GETTER_EXPRESSION:
                setGetterExpression((ReferenceExpression)null);
                return;
            case DerivedPackage.REFERENCE_ACCESSOR__SETTER_EXPRESSION:
                setSetterExpression((ReferenceSelector)null);
                return;
            case DerivedPackage.REFERENCE_ACCESSOR__RANGE_EXPRESSION:
                setRangeExpression((ReferenceExpression)null);
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
            case DerivedPackage.REFERENCE_ACCESSOR__GETTER_EXPRESSION:
                return getterExpression != null;
            case DerivedPackage.REFERENCE_ACCESSOR__SETTER_EXPRESSION:
                return setterExpression != null;
            case DerivedPackage.REFERENCE_ACCESSOR__RANGE_EXPRESSION:
                return rangeExpression != null;
        }
        return super.eIsSet(featureID);
    }

} //ReferenceAccessorImpl
