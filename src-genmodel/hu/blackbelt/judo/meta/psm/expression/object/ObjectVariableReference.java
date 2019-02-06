/**
 */
package hu.blackbelt.judo.meta.psm.expression.object;

import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;
import hu.blackbelt.judo.meta.psm.expression.VariableReference;

import hu.blackbelt.judo.meta.psm.expression.variable.ObjectVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectVariableReference#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage#getObjectVariableReference()
 * @model
 * @generated
 */
public interface ObjectVariableReference extends ObjectExpression, VariableReference {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(ObjectVariable)
	 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage#getObjectVariableReference_Variable()
	 * @model required="true"
	 * @generated
	 */
	ObjectVariable getVariable();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectVariableReference#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(ObjectVariable value);

} // ObjectVariableReference
