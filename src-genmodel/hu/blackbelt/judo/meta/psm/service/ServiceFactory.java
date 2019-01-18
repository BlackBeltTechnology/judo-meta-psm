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
public interface ServiceFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ServiceFactory eINSTANCE = hu.blackbelt.judo.meta.psm.service.impl.ServiceFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Transfer Object Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transfer Object Reference</em>'.
     * @generated
     */
    TransferObjectReference createTransferObjectReference();

    /**
     * Returns a new object of class '<em>Transfer Object Containment</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transfer Object Containment</em>'.
     * @generated
     */
    TransferObjectContainment createTransferObjectContainment();

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
     * Returns a new object of class '<em>Transfer Attribute Binding</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transfer Attribute Binding</em>'.
     * @generated
     */
    TransferAttributeBinding createTransferAttributeBinding();

    /**
     * Returns a new object of class '<em>Transfer Relation Binding</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transfer Relation Binding</em>'.
     * @generated
     */
    TransferRelationBinding createTransferRelationBinding();

    /**
     * Returns a new object of class '<em>Unmapped Transfer Object Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Unmapped Transfer Object Type</em>'.
     * @generated
     */
    UnmappedTransferObjectType createUnmappedTransferObjectType();

    /**
     * Returns a new object of class '<em>Bound Operation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bound Operation</em>'.
     * @generated
     */
    BoundOperation createBoundOperation();

    /**
     * Returns a new object of class '<em>Unbound Operation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Unbound Operation</em>'.
     * @generated
     */
    UnboundOperation createUnboundOperation();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ServicePackage getServicePackage();

} //ServiceFactory
