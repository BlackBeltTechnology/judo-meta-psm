/**
 */
package hu.blackbelt.judo.meta.psm.data;

import hu.blackbelt.judo.meta.psm.type.Cardinality;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Count Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.ReferenceCountConstraint#getReferences <em>References</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.ReferenceCountConstraint#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getReferenceCountConstraint()
 * @model
 * @generated
 */
public interface ReferenceCountConstraint extends EObject {
    /**
     * Returns the value of the '<em><b>References</b></em>' reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.data.Reference}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>References</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>References</em>' reference list.
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getReferenceCountConstraint_References()
     * @model required="true"
     * @generated
     */
    EList<Reference> getReferences();

    /**
     * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cardinality</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cardinality</em>' containment reference.
     * @see #setCardinality(Cardinality)
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getReferenceCountConstraint_Cardinality()
     * @model containment="true" required="true"
     * @generated
     */
    Cardinality getCardinality();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.ReferenceCountConstraint#getCardinality <em>Cardinality</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cardinality</em>' containment reference.
     * @see #getCardinality()
     * @generated
     */
    void setCardinality(Cardinality value);

} // ReferenceCountConstraint
