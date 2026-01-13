/**
 */
package hu.blackbelt.judo.meta.psm.derived;

import hu.blackbelt.judo.meta.psm.service.TransferObjectType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.ExpressionType#getExpression <em>Expression</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.ExpressionType#getDialect <em>Dialect</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.derived.ExpressionType#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#getExpressionType()
 * @model abstract="true"
 * @generated
 */
public interface ExpressionType extends EObject
{
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#getExpressionType_Expression()
	 * @model required="true"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.derived.ExpressionType#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Dialect</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.derived.ExpressionDialect}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialect</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.derived.ExpressionDialect
	 * @see #setDialect(ExpressionDialect)
	 * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#getExpressionType_Dialect()
	 * @model required="true"
	 * @generated
	 */
	ExpressionDialect getDialect();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.derived.ExpressionType#getDialect <em>Dialect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialect</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.derived.ExpressionDialect
	 * @see #getDialect()
	 * @generated
	 */
	void setDialect(ExpressionDialect value);

	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' reference.
	 * @see #setParameterType(TransferObjectType)
	 * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#getExpressionType_ParameterType()
	 * @model
	 * @generated
	 */
	TransferObjectType getParameterType();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.derived.ExpressionType#getParameterType <em>Parameter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' reference.
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(TransferObjectType value);

} // ExpressionType
