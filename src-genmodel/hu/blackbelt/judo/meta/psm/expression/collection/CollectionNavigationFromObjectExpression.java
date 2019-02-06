/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection;

import hu.blackbelt.judo.meta.psm.expression.CollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;
import hu.blackbelt.judo.meta.psm.expression.ReferenceSelector;

import hu.blackbelt.judo.meta.psm.expression.variable.ObjectVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation From Object Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromObjectExpression#getObjectExpression <em>Object Expression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getCollectionNavigationFromObjectExpression()
 * @model
 * @generated
 */
public interface CollectionNavigationFromObjectExpression extends CollectionExpression, ObjectVariable, ReferenceSelector {
	/**
	 * Returns the value of the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Expression</em>' containment reference.
	 * @see #setObjectExpression(ObjectExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getCollectionNavigationFromObjectExpression_ObjectExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ObjectExpression getObjectExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromObjectExpression#getObjectExpression <em>Object Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Expression</em>' containment reference.
	 * @see #getObjectExpression()
	 * @generated
	 */
	void setObjectExpression(ObjectExpression value);

} // CollectionNavigationFromObjectExpression
