/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection;

import hu.blackbelt.judo.meta.psm.expression.CollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.TypeName;

import hu.blackbelt.judo.meta.psm.expression.variable.ObjectVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Immutable Collection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.ImmutableCollection#getElementName <em>Element Name</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getImmutableCollection()
 * @model
 * @generated
 */
public interface ImmutableCollection extends CollectionExpression, ObjectVariable {
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
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getImmutableCollection_ElementName()
	 * @model required="true"
	 * @generated
	 */
	TypeName getElementName();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.collection.ImmutableCollection#getElementName <em>Element Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Name</em>' reference.
	 * @see #getElementName()
	 * @generated
	 */
	void setElementName(TypeName value);

} // ImmutableCollection
