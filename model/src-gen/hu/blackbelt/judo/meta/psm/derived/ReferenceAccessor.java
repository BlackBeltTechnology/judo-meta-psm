/**
 */
package hu.blackbelt.judo.meta.psm.derived;

import hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement;

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
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#getReferenceAccessor()
 * @model abstract="true"
 * @generated
 */
public interface ReferenceAccessor extends ReferenceTypedElement
{
	/**
	 * Returns the value of the '<em><b>Getter Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter Expression</em>' containment reference.
	 * @see #setGetterExpression(ReferenceExpressionType)
	 * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#getReferenceAccessor_GetterExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ReferenceExpressionType getGetterExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getGetterExpression <em>Getter Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter Expression</em>' containment reference.
	 * @see #getGetterExpression()
	 * @generated
	 */
	void setGetterExpression(ReferenceExpressionType value);

	/**
	 * Returns the value of the '<em><b>Setter Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter Expression</em>' containment reference.
	 * @see #setSetterExpression(ReferenceSelectorType)
	 * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#getReferenceAccessor_SetterExpression()
	 * @model containment="true"
	 * @generated
	 */
	ReferenceSelectorType getSetterExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getSetterExpression <em>Setter Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter Expression</em>' containment reference.
	 * @see #getSetterExpression()
	 * @generated
	 */
	void setSetterExpression(ReferenceSelectorType value);

} // ReferenceAccessor
