/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import hu.blackbelt.judo.meta.psm.type.Cardinality;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.Parameter#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.Parameter#isWrapAsOptional <em>Wrap As Optional</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardinality</em>' containment reference.
	 * @see #setCardinality(Cardinality)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getParameter_Cardinality()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Cardinality getCardinality();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.Parameter#getCardinality <em>Cardinality</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cardinality</em>' containment reference.
	 * @see #getCardinality()
	 * @generated
	 */
	void setCardinality(Cardinality value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(TransferObjectType)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	TransferObjectType getType();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.Parameter#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TransferObjectType value);

	/**
	 * Returns the value of the '<em><b>Wrap As Optional</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrap As Optional</em>' attribute.
	 * @see #setWrapAsOptional(boolean)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getParameter_WrapAsOptional()
	 * @model default="true"
	 * @generated
	 */
	boolean isWrapAsOptional();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.Parameter#isWrapAsOptional <em>Wrap As Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrap As Optional</em>' attribute.
	 * @see #isWrapAsOptional()
	 * @generated
	 */
	void setWrapAsOptional(boolean value);

} // Parameter
