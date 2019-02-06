/**
 */
package hu.blackbelt.judo.meta.psm.expression.object;

import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;
import hu.blackbelt.judo.meta.psm.expression.OrderedCollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.WindowingExpression;

import hu.blackbelt.judo.meta.psm.expression.operator.ObjectSelector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selector Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectSelectorExpression#getCollectionExpression <em>Collection Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectSelectorExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage#getObjectSelectorExpression()
 * @model
 * @generated
 */
public interface ObjectSelectorExpression extends ObjectExpression, WindowingExpression {
	/**
	 * Returns the value of the '<em><b>Collection Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Expression</em>' containment reference.
	 * @see #setCollectionExpression(OrderedCollectionExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage#getObjectSelectorExpression_CollectionExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	OrderedCollectionExpression getCollectionExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectSelectorExpression#getCollectionExpression <em>Collection Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Expression</em>' containment reference.
	 * @see #getCollectionExpression()
	 * @generated
	 */
	void setCollectionExpression(OrderedCollectionExpression value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.expression.operator.ObjectSelector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.expression.operator.ObjectSelector
	 * @see #setOperator(ObjectSelector)
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage#getObjectSelectorExpression_Operator()
	 * @model required="true"
	 * @generated
	 */
	ObjectSelector getOperator();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectSelectorExpression#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.expression.operator.ObjectSelector
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(ObjectSelector value);

} // ObjectSelectorExpression
