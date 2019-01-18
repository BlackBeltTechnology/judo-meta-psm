/**
 */
package hu.blackbelt.judo.meta.psm.expression.string;

import hu.blackbelt.judo.meta.psm.expression.StringExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Replace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.Replace#getExpression <em>Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.Replace#getPattern <em>Pattern</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.string.Replace#getReplacement <em>Replacement</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getReplace()
 * @model
 * @generated
 */
public interface Replace extends StringExpression {
    /**
     * Returns the value of the '<em><b>Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Expression</em>' containment reference.
     * @see #setExpression(StringExpression)
     * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getReplace_Expression()
     * @model containment="true"
     * @generated
     */
    StringExpression getExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.string.Replace#getExpression <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Expression</em>' containment reference.
     * @see #getExpression()
     * @generated
     */
    void setExpression(StringExpression value);

    /**
     * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Pattern</em>' containment reference.
     * @see #setPattern(StringExpression)
     * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getReplace_Pattern()
     * @model containment="true" required="true"
     * @generated
     */
    StringExpression getPattern();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.string.Replace#getPattern <em>Pattern</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pattern</em>' containment reference.
     * @see #getPattern()
     * @generated
     */
    void setPattern(StringExpression value);

    /**
     * Returns the value of the '<em><b>Replacement</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Replacement</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Replacement</em>' containment reference.
     * @see #setReplacement(StringExpression)
     * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage#getReplace_Replacement()
     * @model containment="true" required="true"
     * @generated
     */
    StringExpression getReplacement();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.string.Replace#getReplacement <em>Replacement</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Replacement</em>' containment reference.
     * @see #getReplacement()
     * @generated
     */
    void setReplacement(StringExpression value);

} // Replace
