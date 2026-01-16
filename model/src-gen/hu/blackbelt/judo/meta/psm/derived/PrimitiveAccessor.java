/**
 */
package hu.blackbelt.judo.meta.psm.derived;

import hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement;

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
public interface PrimitiveAccessor extends PrimitiveTypedElement
{
	/**
	 * Returns the value of the '<em><b>Getter Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Getter Expression</em>' containment reference.
	 * @see #setGetterExpression(DataExpressionType)
	 * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#getPrimitiveAccessor_GetterExpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DataExpressionType getGetterExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor#getGetterExpression <em>Getter Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Getter Expression</em>' containment reference.
	 * @see #getGetterExpression()
	 * @generated
	 */
	void setGetterExpression(DataExpressionType value);

	/**
	 * Returns the value of the '<em><b>Setter Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Setter Expression</em>' containment reference.
	 * @see #setSetterExpression(AttributeSelectorType)
	 * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#getPrimitiveAccessor_SetterExpression()
	 * @model containment="true"
	 * @generated
	 */
	AttributeSelectorType getSetterExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor#getSetterExpression <em>Setter Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setter Expression</em>' containment reference.
	 * @see #getSetterExpression()
	 * @generated
	 */
	void setSetterExpression(AttributeSelectorType value);

} // PrimitiveAccessor
