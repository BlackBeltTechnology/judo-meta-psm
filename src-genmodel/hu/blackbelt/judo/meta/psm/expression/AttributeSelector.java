/**
 */
package hu.blackbelt.judo.meta.psm.expression;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.AttributeSelector#getObjectExpression <em>Object Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.AttributeSelector#getAttributeName <em>Attribute Name</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.ExpressionPackage#getAttributeSelector()
 * @model abstract="true"
 * @generated
 */
public interface AttributeSelector extends Expression {
    /**
     * Returns the value of the '<em><b>Object Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Object Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Object Expression</em>' containment reference.
     * @see #setObjectExpression(ObjectExpression)
     * @see hu.blackbelt.judo.meta.psm.expression.ExpressionPackage#getAttributeSelector_ObjectExpression()
     * @model containment="true" required="true"
     * @generated
     */
    ObjectExpression getObjectExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.AttributeSelector#getObjectExpression <em>Object Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object Expression</em>' containment reference.
     * @see #getObjectExpression()
     * @generated
     */
    void setObjectExpression(ObjectExpression value);

    /**
     * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Attribute Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attribute Name</em>' attribute.
     * @see #setAttributeName(String)
     * @see hu.blackbelt.judo.meta.psm.expression.ExpressionPackage#getAttributeSelector_AttributeName()
     * @model required="true"
     * @generated
     */
    String getAttributeName();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.AttributeSelector#getAttributeName <em>Attribute Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Attribute Name</em>' attribute.
     * @see #getAttributeName()
     * @generated
     */
    void setAttributeName(String value);

} // AttributeSelector
