/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transfer Operation Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour#getBehaviourType <em>Behaviour Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour#getRelation <em>Relation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferOperationBehaviour()
 * @model
 * @generated
 */
public interface TransferOperationBehaviour extends EObject
{
	/**
	 * Returns the value of the '<em><b>Behaviour Type</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Behaviour Type</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType
	 * @see #setBehaviourType(TransferOperationBehaviourType)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferOperationBehaviour_BehaviourType()
	 * @model required="true"
	 * @generated
	 */
	TransferOperationBehaviourType getBehaviourType();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour#getBehaviourType <em>Behaviour Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behaviour Type</em>' attribute.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType
	 * @see #getBehaviourType()
	 * @generated
	 */
	void setBehaviourType(TransferOperationBehaviourType value);

	/**
	 * Returns the value of the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation</em>' reference.
	 * @see #setRelation(TransferObjectRelation)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferOperationBehaviour_Relation()
	 * @model
	 * @generated
	 */
	TransferObjectRelation getRelation();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour#getRelation <em>Relation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation</em>' reference.
	 * @see #getRelation()
	 * @generated
	 */
	void setRelation(TransferObjectRelation value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(NamedElement)
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#getTransferOperationBehaviour_Owner()
	 * @model required="true"
	 * @generated
	 */
	NamedElement getOwner();

	/**
	 * Sets the value of the '{@link hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(NamedElement value);

} // TransferOperationBehaviour
