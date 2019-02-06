/**
 */
package hu.blackbelt.judo.meta.psm.expression.temporal;

import hu.blackbelt.judo.meta.psm.expression.NumericExpression;
import hu.blackbelt.judo.meta.psm.expression.TimestampExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Timestamp Difference Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampDifferenceExpression#getStartTimestamp <em>Start Timestamp</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampDifferenceExpression#getEndTimestamp <em>End Timestamp</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TemporalPackage#getTimestampDifferenceExpression()
 * @model
 * @generated
 */
public interface TimestampDifferenceExpression extends NumericExpression {
	/**
	 * Returns the value of the '<em><b>Start Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Timestamp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Timestamp</em>' containment reference.
	 * @see #setStartTimestamp(TimestampExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TemporalPackage#getTimestampDifferenceExpression_StartTimestamp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimestampExpression getStartTimestamp();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampDifferenceExpression#getStartTimestamp <em>Start Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Timestamp</em>' containment reference.
	 * @see #getStartTimestamp()
	 * @generated
	 */
	void setStartTimestamp(TimestampExpression value);

	/**
	 * Returns the value of the '<em><b>End Timestamp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Timestamp</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Timestamp</em>' containment reference.
	 * @see #setEndTimestamp(TimestampExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TemporalPackage#getTimestampDifferenceExpression_EndTimestamp()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TimestampExpression getEndTimestamp();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampDifferenceExpression#getEndTimestamp <em>End Timestamp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Timestamp</em>' containment reference.
	 * @see #getEndTimestamp()
	 * @generated
	 */
	void setEndTimestamp(TimestampExpression value);

} // TimestampDifferenceExpression
