/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Relation Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferRelationBinding#getReferenceTypedElement <em>Reference Typed Element</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferRelationBinding#getTransferRelation <em>Transfer Relation</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferRelationBinding()
 * @model
 * @generated
 */
public interface TransferRelationBinding extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Typed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Typed Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Typed Element</em>' reference.
	 * @see #setReferenceTypedElement(ReferenceTypedElement)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferRelationBinding_ReferenceTypedElement()
	 * @model required="true"
	 * @generated
	 */
	ReferenceTypedElement getReferenceTypedElement();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferRelationBinding#getReferenceTypedElement <em>Reference Typed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Typed Element</em>' reference.
	 * @see #getReferenceTypedElement()
	 * @generated
	 */
	void setReferenceTypedElement(ReferenceTypedElement value);

	/**
	 * Returns the value of the '<em><b>Transfer Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transfer Relation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transfer Relation</em>' reference.
	 * @see #setTransferRelation(TransferRelation)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferRelationBinding_TransferRelation()
	 * @model required="true"
	 * @generated
	 */
	TransferRelation getTransferRelation();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferRelationBinding#getTransferRelation <em>Transfer Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transfer Relation</em>' reference.
	 * @see #getTransferRelation()
	 * @generated
	 */
	void setTransferRelation(TransferRelation value);

} // TransferRelationBinding
