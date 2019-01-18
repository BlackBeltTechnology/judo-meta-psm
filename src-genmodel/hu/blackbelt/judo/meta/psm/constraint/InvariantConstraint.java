/**
 */
package hu.blackbelt.judo.meta.psm.constraint;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invariant Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint#getExpression <em>Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint#getConstrained <em>Constrained</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.constraint.ConstraintPackage#getInvariantConstraint()
 * @model
 * @generated
 */
public interface InvariantConstraint extends NamedElement {
    /**
     * Returns the value of the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' containment reference.
     * @see #setExpression(LogicalExpression)
     * @see hu.blackbelt.judo.meta.psm.constraint.ConstraintPackage#getInvariantConstraint_Expression()
     * @model containment="true" required="true"
     * @generated
     */
    LogicalExpression getExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(LogicalExpression value);

    /**
     * Returns the value of the '<em><b>Constrained</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Constrained</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Constrained</em>' reference.
     * @see #setConstrained(EntityType)
     * @see hu.blackbelt.judo.meta.psm.constraint.ConstraintPackage#getInvariantConstraint_Constrained()
     * @model required="true"
     * @generated
     */
    EntityType getConstrained();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint#getConstrained <em>Constrained</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Constrained</em>' reference.
     * @see #getConstrained()
     * @generated
     */
    void setConstrained(EntityType value);

} // InvariantConstraint
