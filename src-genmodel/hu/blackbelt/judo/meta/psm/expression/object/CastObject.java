/**
 */
package hu.blackbelt.judo.meta.psm.expression.object;

import hu.blackbelt.judo.meta.psm.expression.ElementName;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;

import hu.blackbelt.judo.meta.psm.expression.variable.ObjectVariable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.object.CastObject#getElementName <em>Element Name</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.object.CastObject#getObjectExpression <em>Object Expression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage#getCastObject()
 * @model
 * @generated
 */
public interface CastObject extends ObjectExpression, ObjectVariable {
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
     * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage#getCastObject_ElementName()
     * @model required="true"
     * @generated
     */
    ElementName getElementName();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.object.CastObject#getElementName <em>Element Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element Name</em>' reference.
     * @see #getElementName()
     * @generated
     */
    void setElementName(ElementName value);

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
     * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage#getCastObject_ObjectExpression()
     * @model containment="true" required="true"
     * @generated
     */
    ObjectExpression getObjectExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.expression.object.CastObject#getObjectExpression <em>Object Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Object Expression</em>' containment reference.
     * @see #getObjectExpression()
     * @generated
     */
    void setObjectExpression(ObjectExpression value);

} // CastObject
