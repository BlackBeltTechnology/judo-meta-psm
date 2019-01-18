/**
 */
package hu.blackbelt.judo.meta.psm.expression.numeric;

import hu.blackbelt.judo.meta.psm.expression.AggregatedExpression;
import hu.blackbelt.judo.meta.psm.expression.DecimalExpression;
import hu.blackbelt.judo.meta.psm.expression.NumericExpression;

import hu.blackbelt.judo.meta.psm.expression.operator.DecimalAggregator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Aggregated Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAggregatedExpression#getOperator <em>Operator</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAggregatedExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage#getDecimalAggregatedExpression()
 * @model
 * @generated
 */
public interface DecimalAggregatedExpression extends DecimalExpression, AggregatedExpression {
    /**
     * Returns the value of the '<em><b>Operator</b></em>' attribute.
     * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.expression.operator.DecimalAggregator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.DecimalAggregator
     * @see #setOperator(DecimalAggregator)
     * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage#getDecimalAggregatedExpression_Operator()
     * @model required="true"
     * @generated
     */
    DecimalAggregator getOperator();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAggregatedExpression#getOperator <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.DecimalAggregator
     * @see #getOperator()
     * @generated
     */
    void setOperator(DecimalAggregator value);

    /**
     * Returns the value of the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' containment reference.
     * @see #setExpression(NumericExpression)
     * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage#getDecimalAggregatedExpression_Expression()
     * @model containment="true" required="true"
     * @generated
     */
    NumericExpression getExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAggregatedExpression#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(NumericExpression value);

} // DecimalAggregatedExpression
