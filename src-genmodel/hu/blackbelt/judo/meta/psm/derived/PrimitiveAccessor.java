/**
 */
package hu.blackbelt.judo.meta.psm.derived;

import hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement;

import hu.blackbelt.judo.meta.psm.expression.AttributeSelector;
import hu.blackbelt.judo.meta.psm.expression.DataExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Accessor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor#getGetterExpression <em>Getter Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor#getSetterExpression <em>Setter Expression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#getPrimitiveAccessor()
 * @model abstract="true"
 * @generated
 */
public interface PrimitiveAccessor extends PrimitiveTypedElement {
    /**
     * Returns the value of the '<em><b>Getter Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Getter Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Getter Expression</em>' containment reference.
     * @see #setGetterExpression(DataExpression)
     * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#getPrimitiveAccessor_GetterExpression()
     * @model containment="true" required="true"
     * @generated
     */
    DataExpression getGetterExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor#getGetterExpression <em>Getter Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Getter Expression</em>' containment reference.
     * @see #getGetterExpression()
     * @generated
     */
    void setGetterExpression(DataExpression value);

    /**
     * Returns the value of the '<em><b>Setter Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Setter Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Setter Expression</em>' containment reference.
     * @see #setSetterExpression(AttributeSelector)
     * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#getPrimitiveAccessor_SetterExpression()
     * @model containment="true"
     * @generated
     */
    AttributeSelector getSetterExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor#getSetterExpression <em>Setter Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Setter Expression</em>' containment reference.
     * @see #getSetterExpression()
     * @generated
     */
    void setSetterExpression(AttributeSelector value);

} // PrimitiveAccessor
