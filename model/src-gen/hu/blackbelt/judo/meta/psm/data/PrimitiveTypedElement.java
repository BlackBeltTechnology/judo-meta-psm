/**
 */
package hu.blackbelt.judo.meta.psm.data;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import hu.blackbelt.judo.meta.psm.type.Primitive;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement#getDataType <em>Data Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement#isRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getPrimitiveTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface PrimitiveTypedElement extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(Primitive)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getPrimitiveTypedElement_DataType()
	 * @model required="true"
	 * @generated
	 */
	Primitive getDataType();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Primitive value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(boolean)
	 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getPrimitiveTypedElement_Required()
	 * @model required="true"
	 * @generated
	 */
	boolean isRequired();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement#isRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #isRequired()
	 * @generated
	 */
	void setRequired(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	EntityType getEntityType();

} // PrimitiveTypedElement
