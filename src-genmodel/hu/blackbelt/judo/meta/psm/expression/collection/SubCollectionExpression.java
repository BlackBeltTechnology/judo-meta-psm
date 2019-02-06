/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection;

import hu.blackbelt.judo.meta.psm.expression.IntegerExpression;
import hu.blackbelt.judo.meta.psm.expression.OrderedCollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.WindowingExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Collection Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression#getCollectionExpression <em>Collection Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression#getLength <em>Length</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getSubCollectionExpression()
 * @model
 * @generated
 */
public interface SubCollectionExpression extends OrderedCollectionExpression, WindowingExpression {
	/**
	 * Returns the value of the '<em><b>Collection Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Expression</em>' reference.
	 * @see #setCollectionExpression(OrderedCollectionExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getSubCollectionExpression_CollectionExpression()
	 * @model required="true"
	 * @generated
	 */
	OrderedCollectionExpression getCollectionExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression#getCollectionExpression <em>Collection Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Expression</em>' reference.
	 * @see #getCollectionExpression()
	 * @generated
	 */
	void setCollectionExpression(OrderedCollectionExpression value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(IntegerExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getSubCollectionExpression_Position()
	 * @model
	 * @generated
	 */
	IntegerExpression getPosition();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(IntegerExpression value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' reference.
	 * @see #setLength(IntegerExpression)
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getSubCollectionExpression_Length()
	 * @model
	 * @generated
	 */
	IntegerExpression getLength();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression#getLength <em>Length</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' reference.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(IntegerExpression value);

} // SubCollectionExpression
