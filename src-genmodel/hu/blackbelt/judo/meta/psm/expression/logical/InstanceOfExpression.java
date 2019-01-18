/**
 */
package hu.blackbelt.judo.meta.psm.expression.logical;

import hu.blackbelt.judo.meta.psm.expression.ElementName;
import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Of Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.InstanceOfExpression#getObjectExpression <em>Object Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.logical.InstanceOfExpression#getElementName <em>Element Name</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getInstanceOfExpression()
 * @model
 * @generated
 */
public interface InstanceOfExpression extends LogicalExpression {
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
     * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getInstanceOfExpression_ObjectExpression()
     * @model containment="true" required="true"
     * @generated
     */
    ObjectExpression getObjectExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.logical.InstanceOfExpression#getObjectExpression <em>Object Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object Expression</em>' containment reference.
     * @see #getObjectExpression()
     * @generated
     */
    void setObjectExpression(ObjectExpression value);

    /**
     * Returns the value of the '<em><b>Element Name</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Element Name</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element Name</em>' reference.
     * @see #setElementName(ElementName)
     * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage#getInstanceOfExpression_ElementName()
     * @model required="true"
     * @generated
     */
    ElementName getElementName();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.logical.InstanceOfExpression#getElementName <em>Element Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element Name</em>' reference.
     * @see #getElementName()
     * @generated
     */
    void setElementName(ElementName value);

} // InstanceOfExpression
