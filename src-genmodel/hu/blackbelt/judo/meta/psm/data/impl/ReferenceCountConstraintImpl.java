/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.Reference;
import hu.blackbelt.judo.meta.psm.data.ReferenceCountConstraint;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

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
 * </ul>
 *
 * @generated
 */
public class ReferenceCountConstraintImpl extends CardinalityImpl implements ReferenceCountConstraint {
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
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DataPackage.REFERENCE_COUNT_CONSTRAINT__REFERENCES:
                return getReferences();
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
        }
        return super.eIsSet(featureID);
    }

} //ReferenceCountConstraintImpl
