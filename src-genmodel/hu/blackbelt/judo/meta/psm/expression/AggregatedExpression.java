/**
 */
package hu.blackbelt.judo.meta.psm.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aggregated Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.AggregatedExpression#getCollectionExpression <em>Collection Expression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.ExpressionPackage#getAggregatedExpression()
 * @model abstract="true"
 * @generated
 */
public interface AggregatedExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Collection Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Expression</em>' containment reference.
	 * @see #setCollectionExpression(CollectionExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.ExpressionPackage#getAggregatedExpression_CollectionExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CollectionExpression getCollectionExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.AggregatedExpression#getCollectionExpression <em>Collection Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Expression</em>' containment reference.
	 * @see #getCollectionExpression()
	 * @generated
	 */
	void setCollectionExpression(CollectionExpression value);

} // AggregatedExpression
