/**
 */
package hu.blackbelt.judo.meta.psm.expression;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.SwitchExpression#getCases <em>Cases</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.SwitchExpression#getDefaultExpression <em>Default Expression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.ExpressionPackage#getSwitchExpression()
 * @model abstract="true"
 * @generated
 */
public interface SwitchExpression extends Expression {
    /**
     * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.expression.SwitchCase}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Cases</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Cases</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.expression.ExpressionPackage#getSwitchExpression_Cases()
     * @model containment="true" required="true"
     * @generated
     */
    EList<SwitchCase> getCases();

    /**
     * Returns the value of the '<em><b>Default Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Default Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Default Expression</em>' containment reference.
     * @see #setDefaultExpression(DataExpression)
     * @see hu.blackbelt.judo.meta.psm.expression.ExpressionPackage#getSwitchExpression_DefaultExpression()
     * @model containment="true"
     * @generated
     */
    DataExpression getDefaultExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.SwitchExpression#getDefaultExpression <em>Default Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Default Expression</em>' containment reference.
     * @see #getDefaultExpression()
     * @generated
     */
    void setDefaultExpression(DataExpression value);

} // SwitchExpression
