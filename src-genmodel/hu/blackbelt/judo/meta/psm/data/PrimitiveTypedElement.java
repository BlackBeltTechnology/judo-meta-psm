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
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.data.DataPackage#getPrimitiveTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface PrimitiveTypedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
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

} // PrimitiveTypedElement
