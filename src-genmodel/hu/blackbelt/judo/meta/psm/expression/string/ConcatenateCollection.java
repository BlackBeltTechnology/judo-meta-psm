/**
 */
package hu.blackbelt.judo.meta.psm.expression.string;

import hu.blackbelt.judo.meta.psm.expression.AggregatedExpression;
import hu.blackbelt.judo.meta.psm.expression.StringExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concatenate Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.ConcatenateCollection#getExpression <em>Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.ConcatenateCollection#getSeparator <em>Separator</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getConcatenateCollection()
 * @model
 * @generated
 */
public interface ConcatenateCollection extends StringExpression, AggregatedExpression {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(StringExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getConcatenateCollection_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	StringExpression getExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.string.ConcatenateCollection#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(StringExpression value);

	/**
	 * Returns the value of the '<em><b>Separator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Separator</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Separator</em>' containment reference.
	 * @see #setSeparator(StringExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getConcatenateCollection_Separator()
	 * @model containment="true"
	 * @generated
	 */
	StringExpression getSeparator();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.string.ConcatenateCollection#getSeparator <em>Separator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Separator</em>' containment reference.
	 * @see #getSeparator()
	 * @generated
	 */
	void setSeparator(StringExpression value);

} // ConcatenateCollection
