/**
 */
package hu.blackbelt.judo.meta.psm.expression.numeric;

import hu.blackbelt.judo.meta.psm.expression.AggregatedExpression;
import hu.blackbelt.judo.meta.psm.expression.IntegerExpression;

import hu.blackbelt.judo.meta.psm.expression.operator.IntegerAggregator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Aggregated Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAggregatedExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAggregatedExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage#getIntegerAggregatedExpression()
 * @model
 * @generated
 */
public interface IntegerAggregatedExpression extends IntegerExpression, AggregatedExpression {
    /**
     * Returns the value of the '<em><b>Operator</b></em>' attribute.
     * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.expression.operator.IntegerAggregator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.IntegerAggregator
     * @see #setOperator(IntegerAggregator)
     * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage#getIntegerAggregatedExpression_Operator()
     * @model required="true"
     * @generated
     */
    IntegerAggregator getOperator();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAggregatedExpression#getOperator <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.IntegerAggregator
     * @see #getOperator()
     * @generated
     */
    void setOperator(IntegerAggregator value);

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
     * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage#getIntegerAggregatedExpression_Expression()
     * @model containment="true" required="true"
     * @generated
     */
    IntegerExpression getExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAggregatedExpression#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(IntegerExpression value);

} // IntegerAggregatedExpression
