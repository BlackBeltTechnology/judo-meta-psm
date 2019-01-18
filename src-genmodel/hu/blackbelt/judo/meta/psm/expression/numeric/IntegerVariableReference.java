/**
 */
package hu.blackbelt.judo.meta.psm.expression.numeric;

import hu.blackbelt.judo.meta.psm.expression.IntegerExpression;
import hu.blackbelt.judo.meta.psm.expression.VariableReference;

import hu.blackbelt.judo.meta.psm.expression.variable.IntegerVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Variable Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerVariableReference#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage#getIntegerVariableReference()
 * @model
 * @generated
 */
public interface IntegerVariableReference extends IntegerExpression, VariableReference {
    /**
     * Returns the value of the '<em><b>Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable</em>' reference.
     * @see #setVariable(IntegerVariable)
     * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage#getIntegerVariableReference_Variable()
     * @model required="true"
     * @generated
     */
    IntegerVariable getVariable();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerVariableReference#getVariable <em>Variable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable</em>' reference.
     * @see #getVariable()
     * @generated
     */
    void setVariable(IntegerVariable value);

} // IntegerVariableReference
