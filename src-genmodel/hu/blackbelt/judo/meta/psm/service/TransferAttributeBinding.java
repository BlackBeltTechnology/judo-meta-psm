/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Attribute Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferAttributeBinding#getPrimitiveTypedElement <em>Primitive Typed Element</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferAttributeBinding#getTransferAttribute <em>Transfer Attribute</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferAttributeBinding()
 * @model
 * @generated
 */
public interface TransferAttributeBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Primitive Typed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Typed Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Typed Element</em>' reference.
	 * @see #setPrimitiveTypedElement(PrimitiveTypedElement)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferAttributeBinding_PrimitiveTypedElement()
	 * @model required="true"
	 * @generated
	 */
	PrimitiveTypedElement getPrimitiveTypedElement();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferAttributeBinding#getPrimitiveTypedElement <em>Primitive Typed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive Typed Element</em>' reference.
	 * @see #getPrimitiveTypedElement()
	 * @generated
	 */
	void setPrimitiveTypedElement(PrimitiveTypedElement value);

	/**
	 * Returns the value of the '<em><b>Transfer Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfer Attribute</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Attribute</em>' reference.
	 * @see #setTransferAttribute(TransferAttribute)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferAttributeBinding_TransferAttribute()
	 * @model required="true"
	 * @generated
	 */
	TransferAttribute getTransferAttribute();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferAttributeBinding#getTransferAttribute <em>Transfer Attribute</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Attribute</em>' reference.
	 * @see #getTransferAttribute()
	 * @generated
	 */
	void setTransferAttribute(TransferAttribute value);

} // TransferAttributeBinding
