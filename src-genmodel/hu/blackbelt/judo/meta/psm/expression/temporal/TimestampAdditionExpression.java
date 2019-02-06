/**
 */
package hu.blackbelt.judo.meta.psm.expression.temporal;

import hu.blackbelt.judo.meta.psm.expression.NumericExpression;
import hu.blackbelt.judo.meta.psm.expression.TimestampExpression;

import hu.blackbelt.judo.meta.psm.expression.operator.TimestampDurationOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timestamp Addition Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAdditionExpression#getTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAdditionExpression#getDuration <em>Duration</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAdditionExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TemporalPackage#getTimestampAdditionExpression()
 * @model
 * @generated
 */
public interface TimestampAdditionExpression extends TimestampExpression {
	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' containment reference.
	 * @see #setTimestamp(TimestampExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TemporalPackage#getTimestampAdditionExpression_Timestamp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimestampExpression getTimestamp();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAdditionExpression#getTimestamp <em>Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' containment reference.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(TimestampExpression value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' containment reference.
	 * @see #setDuration(NumericExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TemporalPackage#getTimestampAdditionExpression_Duration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NumericExpression getDuration();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAdditionExpression#getDuration <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' containment reference.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(NumericExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.expression.operator.TimestampDurationOperator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.expression.operator.TimestampDurationOperator
	 * @see #setOperator(TimestampDurationOperator)
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TemporalPackage#getTimestampAdditionExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	TimestampDurationOperator getOperator();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAdditionExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.expression.operator.TimestampDurationOperator
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(TimestampDurationOperator value);

} // TimestampAdditionExpression
