/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.service.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceFactoryImpl extends EFactoryImpl implements ServiceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceFactory init() {
		try {
			ServiceFactory theServiceFactory = (ServiceFactory)EPackage.Registry.INSTANCE.getEFactory(ServicePackage.eNS_URI);
			if (theServiceFactory != null) {
				return theServiceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServiceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ServicePackage.TRANSFER_OBJECT_REFERENCE: return createTransferObjectReference();
			case ServicePackage.TRANSFER_OBJECT_CONTAINMENT: return createTransferObjectContainment();
			case ServicePackage.TRANSFER_ATTRIBUTE: return createTransferAttribute();
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE: return createMappedTransferObjectType();
			case ServicePackage.TRANSFER_ATTRIBUTE_BINDING: return createTransferAttributeBinding();
			case ServicePackage.TRANSFER_RELATION_BINDING: return createTransferRelationBinding();
			case ServicePackage.UNMAPPED_TRANSFER_OBJECT_TYPE: return createUnmappedTransferObjectType();
			case ServicePackage.BOUND_OPERATION: return createBoundOperation();
			case ServicePackage.UNBOUND_OPERATION: return createUnboundOperation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferObjectReference createTransferObjectReference() {
		TransferObjectReferenceImpl transferObjectReference = new TransferObjectReferenceImpl();
		return transferObjectReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferObjectContainment createTransferObjectContainment() {
		TransferObjectContainmentImpl transferObjectContainment = new TransferObjectContainmentImpl();
		return transferObjectContainment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferAttribute createTransferAttribute() {
		TransferAttributeImpl transferAttribute = new TransferAttributeImpl();
		return transferAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedTransferObjectType createMappedTransferObjectType() {
		MappedTransferObjectTypeImpl mappedTransferObjectType = new MappedTransferObjectTypeImpl();
		return mappedTransferObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferAttributeBinding createTransferAttributeBinding() {
		TransferAttributeBindingImpl transferAttributeBinding = new TransferAttributeBindingImpl();
		return transferAttributeBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferRelationBinding createTransferRelationBinding() {
		TransferRelationBindingImpl transferRelationBinding = new TransferRelationBindingImpl();
		return transferRelationBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnmappedTransferObjectType createUnmappedTransferObjectType() {
		UnmappedTransferObjectTypeImpl unmappedTransferObjectType = new UnmappedTransferObjectTypeImpl();
		return unmappedTransferObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundOperation createBoundOperation() {
		BoundOperationImpl boundOperation = new BoundOperationImpl();
		return boundOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnboundOperation createUnboundOperation() {
		UnboundOperationImpl unboundOperation = new UnboundOperationImpl();
		return unboundOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicePackage getServicePackage() {
		return (ServicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServicePackage getPackage() {
		return ServicePackage.eINSTANCE;
	}

} //ServiceFactoryImpl
