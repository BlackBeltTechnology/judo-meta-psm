/**
 */
package hu.blackbelt.judo.meta.psm.expression.logical;

import hu.blackbelt.judo.meta.psm.expression.IntegerExpression;
import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;

import hu.blackbelt.judo.meta.psm.expression.operator.IntegerComparator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Comparison</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.IntegerComparison#getLeft <em>Left</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.IntegerComparison#getRight <em>Right</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.IntegerComparison#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getIntegerComparison()
 * @model
 * @generated
 */
public interface IntegerComparison extends LogicalExpression {
    /**
     * Returns the value of the '<em><b>Left</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Left</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Left</em>' containment reference.
     * @see #setLeft(IntegerExpression)
     * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getIntegerComparison_Left()
     * @model containment="true" required="true"
     * @generated
     */
    IntegerExpression getLeft();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.logical.IntegerComparison#getLeft <em>Left</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Left</em>' containment reference.
     * @see #getLeft()
     * @generated
     */
    void setLeft(IntegerExpression value);

    /**
     * Returns the value of the '<em><b>Right</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Right</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Right</em>' containment reference.
     * @see #setRight(IntegerExpression)
     * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getIntegerComparison_Right()
     * @model containment="true" required="true"
     * @generated
     */
    IntegerExpression getRight();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.logical.IntegerComparison#getRight <em>Right</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Right</em>' containment reference.
     * @see #getRight()
     * @generated
     */
    void setRight(IntegerExpression value);

    /**
     * Returns the value of the '<em><b>Operator</b></em>' attribute.
     * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.expression.operator.IntegerComparator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.IntegerComparator
     * @see #setOperator(IntegerComparator)
     * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getIntegerComparison_Operator()
     * @model required="true"
     * @generated
     */
    IntegerComparator getOperator();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.logical.IntegerComparison#getOperator <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.IntegerComparator
     * @see #getOperator()
     * @generated
     */
    void setOperator(IntegerComparator value);

} // IntegerComparison
