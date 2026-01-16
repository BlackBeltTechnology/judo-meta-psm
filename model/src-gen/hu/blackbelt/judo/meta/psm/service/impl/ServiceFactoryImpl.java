/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.service.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class ServiceFactoryImpl extends EFactoryImpl implements ServiceFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServiceFactory init()
	{
		try
		{
			ServiceFactory theServiceFactory = (ServiceFactory)EPackage.Registry.INSTANCE.getEFactory(ServicePackage.eNS_URI);
			if (theServiceFactory != null)
			{
				return theServiceFactory;
			}
		}
		catch (Exception exception)
		{
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
	public ServiceFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case ServicePackage.TRANSFER_OBJECT_RELATION: return createTransferObjectRelation();
			case ServicePackage.TRANSFER_ATTRIBUTE: return createTransferAttribute();
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE: return createMappedTransferObjectType();
			case ServicePackage.UNMAPPED_TRANSFER_OBJECT_TYPE: return createUnmappedTransferObjectType();
			case ServicePackage.UNBOUND_OPERATION: return createUnboundOperation();
			case ServicePackage.PARAMETER: return createParameter();
			case ServicePackage.BOUND_TRANSFER_OPERATION: return createBoundTransferOperation();
			case ServicePackage.TRANSFER_OPERATION_BEHAVIOUR: return createTransferOperationBehaviour();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case ServicePackage.TRANSFER_OPERATION_BEHAVIOUR_TYPE:
				return createTransferOperationBehaviourTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case ServicePackage.TRANSFER_OPERATION_BEHAVIOUR_TYPE:
				return convertTransferOperationBehaviourTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferObjectRelation createTransferObjectRelation()
	{
		TransferObjectRelationImpl transferObjectRelation = new TransferObjectRelationImpl();
		return transferObjectRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferAttribute createTransferAttribute()
	{
		TransferAttributeImpl transferAttribute = new TransferAttributeImpl();
		return transferAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappedTransferObjectType createMappedTransferObjectType()
	{
		MappedTransferObjectTypeImpl mappedTransferObjectType = new MappedTransferObjectTypeImpl();
		return mappedTransferObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnmappedTransferObjectType createUnmappedTransferObjectType()
	{
		UnmappedTransferObjectTypeImpl unmappedTransferObjectType = new UnmappedTransferObjectTypeImpl();
		return unmappedTransferObjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnboundOperation createUnboundOperation()
	{
		UnboundOperationImpl unboundOperation = new UnboundOperationImpl();
		return unboundOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter createParameter()
	{
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoundTransferOperation createBoundTransferOperation()
	{
		BoundTransferOperationImpl boundTransferOperation = new BoundTransferOperationImpl();
		return boundTransferOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferOperationBehaviour createTransferOperationBehaviour()
	{
		TransferOperationBehaviourImpl transferOperationBehaviour = new TransferOperationBehaviourImpl();
		return transferOperationBehaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferOperationBehaviourType createTransferOperationBehaviourType(String literal)
	{
		TransferOperationBehaviourType result = TransferOperationBehaviourType.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + ServicePackage.Literals.TRANSFER_OPERATION_BEHAVIOUR_TYPE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferOperationBehaviourType createTransferOperationBehaviourTypeFromString(EDataType eDataType, String initialValue)
	{
		return createTransferOperationBehaviourType(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertTransferOperationBehaviourType(TransferOperationBehaviourType instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransferOperationBehaviourTypeToString(EDataType eDataType, Object instanceValue)
	{
		return convertTransferOperationBehaviourType((TransferOperationBehaviourType)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServicePackage getServicePackage()
	{
		return (ServicePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServicePackage getPackage()
	{
		return ServicePackage.eINSTANCE;
	}

} //ServiceFactoryImpl
