/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement;

import hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import hu.blackbelt.judo.meta.psm.type.Primitive;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#isRequired <em>Required</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#getDataType <em>Data Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#getBinding <em>Binding</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#getClaimType <em>Claim Type</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferAttribute()
 * @model
 * @generated
 */
public interface TransferAttribute extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferAttribute_Required()
	 * @model required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' reference.
	 * @see #setDefaultValue(PrimitiveAccessor)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferAttribute_DefaultValue()
	 * @model
	 * @generated
	 */
	PrimitiveAccessor getDefaultValue();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#getDefaultValue <em>Default Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(PrimitiveAccessor value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(Primitive)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferAttribute_DataType()
	 * @model required="true"
	 * @generated
	 */
	Primitive getDataType();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Primitive value);

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' reference.
	 * @see #setBinding(PrimitiveTypedElement)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferAttribute_Binding()
	 * @model
	 * @generated
	 */
	PrimitiveTypedElement getBinding();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#getBinding <em>Binding</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(PrimitiveTypedElement value);

	/**
	 * Returns the value of the '<em><b>Claim Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Type</em>' attribute.
	 * @see #setClaimType(String)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferAttribute_ClaimType()
	 * @model
	 * @generated
	 */
	String getClaimType();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#getClaimType <em>Claim Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Type</em>' attribute.
	 * @see #getClaimType()
	 * @generated
	 */
	void setClaimType(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	boolean isPrimitive();

} // TransferAttribute
