/**
 */
package hu.blackbelt.judo.meta.psm.data;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import hu.blackbelt.judo.meta.psm.type.Cardinality;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Reference#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.Reference#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getReference()
 * @model abstract="true"
 * @generated
 */
public interface Reference extends NamedElement {
    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(EntityType)
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getReference_Target()
     * @model required="true"
     * @generated
     */
    EntityType getTarget();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Reference#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(EntityType value);

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
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getReference_Cardinality()
     * @model containment="true" required="true"
     * @generated
     */
    Cardinality getCardinality();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.Reference#getCardinality <em>Cardinality</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cardinality</em>' containment reference.
     * @see #getCardinality()
     * @generated
     */
    void setCardinality(Cardinality value);

} // Reference
