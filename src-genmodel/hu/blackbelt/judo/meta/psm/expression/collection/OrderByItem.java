/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection;

import hu.blackbelt.judo.meta.psm.expression.DataExpression;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order By Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.OrderByItem#getExpression <em>Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.OrderByItem#isDescending <em>Descending</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getOrderByItem()
 * @model
 * @generated
 */
public interface OrderByItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(DataExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getOrderByItem_Expression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataExpression getExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.collection.OrderByItem#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(DataExpression value);

	/**
	 * Returns the value of the '<em><b>Descending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Descending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Descending</em>' attribute.
	 * @see #setDescending(boolean)
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getOrderByItem_Descending()
	 * @model required="true"
	 * @generated
	 */
	boolean isDescending();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.collection.OrderByItem#isDescending <em>Descending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Descending</em>' attribute.
	 * @see #isDescending()
	 * @generated
	 */
	void setDescending(boolean value);

} // OrderByItem
