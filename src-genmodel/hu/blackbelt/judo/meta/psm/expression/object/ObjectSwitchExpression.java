/**
 */
package hu.blackbelt.judo.meta.psm.expression.object;

import hu.blackbelt.judo.meta.psm.expression.ElementName;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;
import hu.blackbelt.judo.meta.psm.expression.SwitchExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectSwitchExpression#getElementName <em>Element Name</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage#getObjectSwitchExpression()
 * @model
 * @generated
 */
public interface ObjectSwitchExpression extends SwitchExpression, ObjectExpression {
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
     * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage#getObjectSwitchExpression_ElementName()
     * @model required="true"
     * @generated
     */
    ElementName getElementName();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.object.ObjectSwitchExpression#getElementName <em>Element Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element Name</em>' reference.
     * @see #getElementName()
     * @generated
     */
    void setElementName(ElementName value);

} // ObjectSwitchExpression
