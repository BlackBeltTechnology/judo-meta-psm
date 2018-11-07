/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.Reference;
import hu.blackbelt.judo.meta.psm.data.ReferenceCountConstraint;

import hu.blackbelt.judo.meta.psm.type.Cardinality;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference Count Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.ReferenceCountConstraintImpl#getReferences <em>References</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.ReferenceCountConstraintImpl#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceCountConstraintImpl extends MinimalEObjectImpl.Container implements ReferenceCountConstraint {
    /**
     * The cached value of the '{@link #getReferences() <em>References</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReferences()
     * @generated
     * @ordered
     */
    protected EList<Reference> references;

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
    protected ReferenceCountConstraintImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataPackage.Literals.REFERENCE_COUNT_CONSTRAINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Reference> getReferences() {
        if (references == null) {
            references = new EObjectResolvingEList<Reference>(Reference.class, this, DataPackage.REFERENCE_COUNT_CONSTRAINT__REFERENCES);
        }
        return references;
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DataPackage.REFERENCE_COUNT_CONSTRAINT__CARDINALITY, oldCardinality, newCardinality);
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
                msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DataPackage.REFERENCE_COUNT_CONSTRAINT__CARDINALITY, null, msgs);
            if (newCardinality != null)
                msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DataPackage.REFERENCE_COUNT_CONSTRAINT__CARDINALITY, null, msgs);
            msgs = basicSetCardinality(newCardinality, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.REFERENCE_COUNT_CONSTRAINT__CARDINALITY, newCardinality, newCardinality));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DataPackage.REFERENCE_COUNT_CONSTRAINT__CARDINALITY:
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
            case DataPackage.REFERENCE_COUNT_CONSTRAINT__REFERENCES:
                return getReferences();
            case DataPackage.REFERENCE_COUNT_CONSTRAINT__CARDINALITY:
                return getCardinality();
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
            case DataPackage.REFERENCE_COUNT_CONSTRAINT__REFERENCES:
                getReferences().clear();
                getReferences().addAll((Collection<? extends Reference>)newValue);
                return;
            case DataPackage.REFERENCE_COUNT_CONSTRAINT__CARDINALITY:
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
            case DataPackage.REFERENCE_COUNT_CONSTRAINT__REFERENCES:
                getReferences().clear();
                return;
            case DataPackage.REFERENCE_COUNT_CONSTRAINT__CARDINALITY:
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
            case DataPackage.REFERENCE_COUNT_CONSTRAINT__REFERENCES:
                return references != null && !references.isEmpty();
            case DataPackage.REFERENCE_COUNT_CONSTRAINT__CARDINALITY:
                return cardinality != null;
        }
        return super.eIsSet(featureID);
    }

} //ReferenceCountConstraintImpl
