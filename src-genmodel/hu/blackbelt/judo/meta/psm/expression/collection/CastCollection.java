/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection;

import hu.blackbelt.judo.meta.psm.expression.CollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.TypeName;

import hu.blackbelt.judo.meta.psm.expression.variable.ObjectVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.CastCollection#getElementName <em>Element Name</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.CastCollection#getCollectionExpression <em>Collection Expression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getCastCollection()
 * @model
 * @generated
 */
public interface CastCollection extends CollectionExpression, ObjectVariable {
	/**
	 * Returns the value of the '<em><b>Element Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Name</em>' reference.
	 * @see #setElementName(TypeName)
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getCastCollection_ElementName()
	 * @model required="true"
	 * @generated
	 */
	TypeName getElementName();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.collection.CastCollection#getElementName <em>Element Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' reference.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(TypeName value);

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
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getCastCollection_CollectionExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	CollectionExpression getCollectionExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.collection.CastCollection#getCollectionExpression <em>Collection Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Expression</em>' containment reference.
	 * @see #getCollectionExpression()
	 * @generated
	 */
	void setCollectionExpression(CollectionExpression value);

} // CastCollection
