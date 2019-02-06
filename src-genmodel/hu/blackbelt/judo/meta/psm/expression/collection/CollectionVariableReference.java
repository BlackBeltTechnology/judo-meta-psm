/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection;

import hu.blackbelt.judo.meta.psm.expression.CollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.VariableReference;

import hu.blackbelt.judo.meta.psm.expression.variable.CollectionVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionVariableReference#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getCollectionVariableReference()
 * @model
 * @generated
 */
public interface CollectionVariableReference extends CollectionExpression, VariableReference {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(CollectionVariable)
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#getCollectionVariableReference_Variable()
	 * @model required="true"
	 * @generated
	 */
	CollectionVariable getVariable();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionVariableReference#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(CollectionVariable value);

} // CollectionVariableReference
