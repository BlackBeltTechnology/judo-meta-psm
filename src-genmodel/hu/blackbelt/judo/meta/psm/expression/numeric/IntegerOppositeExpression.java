/**
 */
package hu.blackbelt.judo.meta.psm.expression.numeric;

import hu.blackbelt.judo.meta.psm.expression.IntegerExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Opposite Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerOppositeExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage#getIntegerOppositeExpression()
 * @model
 * @generated
 */
public interface IntegerOppositeExpression extends IntegerExpression {
    /**
     * Returns the value of the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' containment reference.
     * @see #setExpression(IntegerExpression)
     * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage#getIntegerOppositeExpression_Expression()
     * @model containment="true" required="true"
     * @generated
     */
    IntegerExpression getExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerOppositeExpression#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(IntegerExpression value);

} // IntegerOppositeExpression
