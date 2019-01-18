/**
 */
package hu.blackbelt.judo.meta.psm.data;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import hu.blackbelt.judo.meta.psm.type.Cardinality;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Count Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.RelationCountConstraint#getRelations <em>Relations</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.RelationCountConstraint#getCardinality <em>Cardinality</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getRelationCountConstraint()
 * @model
 * @generated
 */
public interface RelationCountConstraint extends NamedElement {
    /**
     * Returns the value of the '<em><b>Relations</b></em>' reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.data.Relation}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relations</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relations</em>' reference list.
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getRelationCountConstraint_Relations()
     * @model lower="2"
     * @generated
     */
    EList<Relation> getRelations();

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
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getRelationCountConstraint_Cardinality()
     * @model containment="true" required="true"
     * @generated
     */
    Cardinality getCardinality();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.RelationCountConstraint#getCardinality <em>Cardinality</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Cardinality</em>' containment reference.
     * @see #getCardinality()
     * @generated
     */
    void setCardinality(Cardinality value);

} // RelationCountConstraint
