/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection;

import hu.blackbelt.judo.meta.psm.expression.CollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.NavigationExpression;

import hu.blackbelt.judo.meta.psm.expression.variable.ObjectVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation From Collection Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromCollectionExpression#getCollectionExpression <em>Collection Expression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getCollectionNavigationFromCollectionExpression()
 * @model
 * @generated
 */
public interface CollectionNavigationFromCollectionExpression extends CollectionExpression, NavigationExpression, ObjectVariable {
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
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getCollectionNavigationFromCollectionExpression_CollectionExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CollectionExpression getCollectionExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromCollectionExpression#getCollectionExpression <em>Collection Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Expression</em>' containment reference.
	 * @see #getCollectionExpression()
	 * @generated
	 */
	void setCollectionExpression(CollectionExpression value);

} // CollectionNavigationFromCollectionExpression
