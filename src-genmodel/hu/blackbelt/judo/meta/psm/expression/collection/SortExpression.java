/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection;

import hu.blackbelt.judo.meta.psm.expression.CollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.OrderedCollectionExpression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sort Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.SortExpression#getCollectionExpression <em>Collection Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.SortExpression#getOrderBy <em>Order By</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getSortExpression()
 * @model
 * @generated
 */
public interface SortExpression extends OrderedCollectionExpression {
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
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getSortExpression_CollectionExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CollectionExpression getCollectionExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.collection.SortExpression#getCollectionExpression <em>Collection Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Expression</em>' containment reference.
	 * @see #getCollectionExpression()
	 * @generated
	 */
	void setCollectionExpression(CollectionExpression value);

	/**
	 * Returns the value of the '<em><b>Order By</b></em>' containment reference list.
	 * The list contents are of type {@link hu.blackbelt.judo.meta.psm.expression.collection.OrderByItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Order By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order By</em>' containment reference list.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getSortExpression_OrderBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrderByItem> getOrderBy();

} // SortExpression
