/**
 */
package hu.blackbelt.judo.meta.psm.derived;

import hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement;

import hu.blackbelt.judo.meta.psm.expression.ReferenceExpression;
import hu.blackbelt.judo.meta.psm.expression.ReferenceSelector;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference Accessor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getGetterExpression <em>Getter Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getSetterExpression <em>Setter Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getRangeExpression <em>Range Expression</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#getReferenceAccessor()
 * @model abstract="true"
 * @generated
 */
public interface ReferenceAccessor extends ReferenceTypedElement {
    /**
     * Returns the value of the '<em><b>Getter Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Getter Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Getter Expression</em>' containment reference.
     * @see #setGetterExpression(ReferenceExpression)
     * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#getReferenceAccessor_GetterExpression()
     * @model containment="true" required="true"
     * @generated
     */
    ReferenceExpression getGetterExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getGetterExpression <em>Getter Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Getter Expression</em>' containment reference.
     * @see #getGetterExpression()
     * @generated
     */
    void setGetterExpression(ReferenceExpression value);

    /**
     * Returns the value of the '<em><b>Setter Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Setter Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Setter Expression</em>' containment reference.
     * @see #setSetterExpression(ReferenceSelector)
     * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#getReferenceAccessor_SetterExpression()
     * @model containment="true"
     * @generated
     */
    ReferenceSelector getSetterExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getSetterExpression <em>Setter Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Setter Expression</em>' containment reference.
     * @see #getSetterExpression()
     * @generated
     */
    void setSetterExpression(ReferenceSelector value);

    /**
     * Returns the value of the '<em><b>Range Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Range Expression</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Range Expression</em>' containment reference.
     * @see #setRangeExpression(ReferenceExpression)
     * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#getReferenceAccessor_RangeExpression()
     * @model containment="true"
     * @generated
     */
    ReferenceExpression getRangeExpression();

    /**
     * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getRangeExpression <em>Range Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Range Expression</em>' containment reference.
     * @see #getRangeExpression()
     * @generated
     */
    void setRangeExpression(ReferenceExpression value);

} // ReferenceAccessor
