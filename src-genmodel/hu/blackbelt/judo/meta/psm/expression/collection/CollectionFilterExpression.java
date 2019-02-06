/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection;

import hu.blackbelt.judo.meta.psm.expression.CollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.FilteringExpression;
import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionFilterExpression#getCollectionExpression <em>Collection Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionFilterExpression#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getCollectionFilterExpression()
 * @model
 * @generated
 */
public interface CollectionFilterExpression extends CollectionExpression, FilteringExpression {
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
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getCollectionFilterExpression_CollectionExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CollectionExpression getCollectionExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionFilterExpression#getCollectionExpression <em>Collection Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Expression</em>' containment reference.
	 * @see #getCollectionExpression()
	 * @generated
	 */
	void setCollectionExpression(CollectionExpression value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(LogicalExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getCollectionFilterExpression_Condition()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LogicalExpression getCondition();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionFilterExpression#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(LogicalExpression value);

} // CollectionFilterExpression
