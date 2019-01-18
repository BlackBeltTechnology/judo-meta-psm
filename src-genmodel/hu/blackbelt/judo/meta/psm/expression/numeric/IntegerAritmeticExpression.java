/**
 */
package hu.blackbelt.judo.meta.psm.expression.numeric;

import hu.blackbelt.judo.meta.psm.expression.IntegerExpression;

import hu.blackbelt.judo.meta.psm.expression.operator.IntegerOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Aritmetic Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAritmeticExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAritmeticExpression#getRight <em>Right</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAritmeticExpression#getOperator <em>Operator</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage#getIntegerAritmeticExpression()
 * @model
 * @generated
 */
public interface IntegerAritmeticExpression extends IntegerExpression {
    /**
     * Returns the value of the '<em><b>Left</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Left</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Left</em>' containment reference.
     * @see #setLeft(IntegerExpression)
     * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage#getIntegerAritmeticExpression_Left()
     * @model containment="true" required="true"
     * @generated
     */
    IntegerExpression getLeft();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAritmeticExpression#getLeft <em>Left</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Left</em>' containment reference.
     * @see #getLeft()
     * @generated
     */
    void setLeft(IntegerExpression value);

    /**
     * Returns the value of the '<em><b>Right</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Right</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Right</em>' containment reference.
     * @see #setRight(IntegerExpression)
     * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage#getIntegerAritmeticExpression_Right()
     * @model containment="true" required="true"
     * @generated
     */
    IntegerExpression getRight();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAritmeticExpression#getRight <em>Right</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Right</em>' containment reference.
     * @see #getRight()
     * @generated
     */
    void setRight(IntegerExpression value);

    /**
     * Returns the value of the '<em><b>Operator</b></em>' attribute.
     * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.expression.operator.IntegerOperator}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operator</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operator</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.IntegerOperator
     * @see #setOperator(IntegerOperator)
     * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage#getIntegerAritmeticExpression_Operator()
     * @model required="true"
     * @generated
     */
    IntegerOperator getOperator();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAritmeticExpression#getOperator <em>Operator</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operator</em>' attribute.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.IntegerOperator
     * @see #getOperator()
     * @generated
     */
    void setOperator(IntegerOperator value);

} // IntegerAritmeticExpression
