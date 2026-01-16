/**
 */
package hu.blackbelt.judo.meta.psm.service;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage
 * @generated
 */
public interface ServiceFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServiceFactory eINSTANCE = hu.blackbelt.judo.meta.psm.service.impl.ServiceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Transfer Object Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transfer Object Relation</em>'.
	 * @generated
	 */
	TransferObjectRelation createTransferObjectRelation();

	/**
	 * Returns a new object of class '<em>Transfer Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transfer Attribute</em>'.
	 * @generated
	 */
	TransferAttribute createTransferAttribute();

	/**
	 * Returns a new object of class '<em>Mapped Transfer Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapped Transfer Object Type</em>'.
	 * @generated
	 */
	MappedTransferObjectType createMappedTransferObjectType();

	/**
	 * Returns a new object of class '<em>Unmapped Transfer Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unmapped Transfer Object Type</em>'.
	 * @generated
	 */
	UnmappedTransferObjectType createUnmappedTransferObjectType();

	/**
	 * Returns a new object of class '<em>Unbound Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unbound Operation</em>'.
	 * @generated
	 */
	UnboundOperation createUnboundOperation();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Bound Transfer Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bound Transfer Operation</em>'.
	 * @generated
	 */
	BoundTransferOperation createBoundTransferOperation();

	/**
	 * Returns a new object of class '<em>Transfer Operation Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transfer Operation Behaviour</em>'.
	 * @generated
	 */
	TransferOperationBehaviour createTransferOperationBehaviour();

	/**
	 * Returns an instance of data type '<em>Transfer Operation Behaviour Type</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	TransferOperationBehaviourType createTransferOperationBehaviourType(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Transfer Operation Behaviour Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertTransferOperationBehaviourType(TransferOperationBehaviourType instanceValue);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ServicePackage getServicePackage();

} //ServiceFactory
