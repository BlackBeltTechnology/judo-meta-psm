/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.data.Reference;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import hu.blackbelt.judo.meta.psm.type.Cardinality;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.ReferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.ReferenceImpl#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ReferenceImpl extends NamedElementImpl implements Reference {
    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected EntityType target;

    /**
     * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCardinality()
     * @generated
     * @ordered
     */
    protected Cardinality cardinality;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReferenceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataPackage.Literals.REFERENCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityType getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject)target;
            target = (EntityType)eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.REFERENCE__TARGET, oldTarget, target));
            }
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntityType basicGetTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(EntityType newTarget) {
        EntityType oldTarget = target;
        target = newTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.REFERENCE__TARGET, oldTarget, target));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Cardinality getCardinality() {
        return cardinality;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs) {
        Cardinality oldCardinality = cardinality;
        cardinality = newCardinality;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.REFERENCE__CARDINALITY, oldCardinality, newCardinality);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCardinality(Cardinality newCardinality) {
        if (newCardinality != cardinality) {
            NotificationChain msgs = null;
            if (cardinality != null)
                msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataPackage.REFERENCE__CARDINALITY, null, msgs);
            if (newCardinality != null)
                msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataPackage.REFERENCE__CARDINALITY, null, msgs);
            msgs = basicSetCardinality(newCardinality, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.REFERENCE__CARDINALITY, newCardinality, newCardinality));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DataPackage.REFERENCE__CARDINALITY:
                return basicSetCardinality(null, msgs);
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
            case DataPackage.REFERENCE__TARGET:
                if (resolve) return getTarget();
                return basicGetTarget();
            case DataPackage.REFERENCE__CARDINALITY:
                return getCardinality();
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
            case DataPackage.REFERENCE__TARGET:
                setTarget((EntityType)newValue);
                return;
            case DataPackage.REFERENCE__CARDINALITY:
                setCardinality((Cardinality)newValue);
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
            case DataPackage.REFERENCE__TARGET:
                setTarget((EntityType)null);
                return;
            case DataPackage.REFERENCE__CARDINALITY:
                setCardinality((Cardinality)null);
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
            case DataPackage.REFERENCE__TARGET:
                return target != null;
            case DataPackage.REFERENCE__CARDINALITY:
                return cardinality != null;
        }
        return super.eIsSet(featureID);
    }

} //ReferenceImpl
