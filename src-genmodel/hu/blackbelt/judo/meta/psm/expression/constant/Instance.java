/**
 */
package hu.blackbelt.judo.meta.psm.expression.constant;

import hu.blackbelt.judo.meta.psm.expression.ElementName;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.constant.Instance#getElementName <em>Element Name</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends Constant, ObjectExpression {
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
     * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage#getInstance_ElementName()
     * @model required="true"
     * @generated
     */
    ElementName getElementName();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.constant.Instance#getElementName <em>Element Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element Name</em>' reference.
     * @see #getElementName()
     * @generated
     */
    void setElementName(ElementName value);

} // Instance
