/**
 */
package hu.blackbelt.judo.meta.psm.service.util;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;
import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;

import hu.blackbelt.judo.meta.psm.service.*;

import hu.blackbelt.judo.meta.psm.type.DataType;
import hu.blackbelt.judo.meta.psm.type.Type;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage
 * @generated
 */
public class ServiceSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServicePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = ServicePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case ServicePackage.TRANSFER_OBJECT_TYPE:
			{
				TransferObjectType transferObjectType = (TransferObjectType)theEObject;
				T result = caseTransferObjectType(transferObjectType);
				if (result == null) result = caseDataType(transferObjectType);
				if (result == null) result = caseType(transferObjectType);
				if (result == null) result = caseNamespaceElement(transferObjectType);
				if (result == null) result = caseNamedElement(transferObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.TRANSFER_OBJECT_RELATION:
			{
				TransferObjectRelation transferObjectRelation = (TransferObjectRelation)theEObject;
				T result = caseTransferObjectRelation(transferObjectRelation);
				if (result == null) result = caseNamedElement(transferObjectRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.TRANSFER_ATTRIBUTE:
			{
				TransferAttribute transferAttribute = (TransferAttribute)theEObject;
				T result = caseTransferAttribute(transferAttribute);
				if (result == null) result = caseNamedElement(transferAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE:
			{
				MappedTransferObjectType mappedTransferObjectType = (MappedTransferObjectType)theEObject;
				T result = caseMappedTransferObjectType(mappedTransferObjectType);
				if (result == null) result = caseTransferObjectType(mappedTransferObjectType);
				if (result == null) result = caseDataType(mappedTransferObjectType);
				if (result == null) result = caseType(mappedTransferObjectType);
				if (result == null) result = caseNamespaceElement(mappedTransferObjectType);
				if (result == null) result = caseNamedElement(mappedTransferObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.OPERATION_DECLARATION:
			{
				OperationDeclaration operationDeclaration = (OperationDeclaration)theEObject;
				T result = caseOperationDeclaration(operationDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.UNMAPPED_TRANSFER_OBJECT_TYPE:
			{
				UnmappedTransferObjectType unmappedTransferObjectType = (UnmappedTransferObjectType)theEObject;
				T result = caseUnmappedTransferObjectType(unmappedTransferObjectType);
				if (result == null) result = caseTransferObjectType(unmappedTransferObjectType);
				if (result == null) result = caseDataType(unmappedTransferObjectType);
				if (result == null) result = caseType(unmappedTransferObjectType);
				if (result == null) result = caseNamespaceElement(unmappedTransferObjectType);
				if (result == null) result = caseNamedElement(unmappedTransferObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.UNBOUND_OPERATION:
			{
				UnboundOperation unboundOperation = (UnboundOperation)theEObject;
				T result = caseUnboundOperation(unboundOperation);
				if (result == null) result = caseTransferOperation(unboundOperation);
				if (result == null) result = caseNamedElement(unboundOperation);
				if (result == null) result = caseOperationDeclaration(unboundOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.PARAMETER:
			{
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseNamedElement(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.BOUND_TRANSFER_OPERATION:
			{
				BoundTransferOperation boundTransferOperation = (BoundTransferOperation)theEObject;
				T result = caseBoundTransferOperation(boundTransferOperation);
				if (result == null) result = caseTransferOperation(boundTransferOperation);
				if (result == null) result = caseNamedElement(boundTransferOperation);
				if (result == null) result = caseOperationDeclaration(boundTransferOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.TRANSFER_OPERATION:
			{
				TransferOperation transferOperation = (TransferOperation)theEObject;
				T result = caseTransferOperation(transferOperation);
				if (result == null) result = caseNamedElement(transferOperation);
				if (result == null) result = caseOperationDeclaration(transferOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.TRANSFER_OPERATION_BEHAVIOUR:
			{
				TransferOperationBehaviour transferOperationBehaviour = (TransferOperationBehaviour)theEObject;
				T result = caseTransferOperationBehaviour(transferOperationBehaviour);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferObjectType(TransferObjectType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Object Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Object Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferObjectRelation(TransferObjectRelation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferAttribute(TransferAttribute object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapped Transfer Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapped Transfer Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappedTransferObjectType(MappedTransferObjectType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationDeclaration(OperationDeclaration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unmapped Transfer Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unmapped Transfer Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnmappedTransferObjectType(UnmappedTransferObjectType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unbound Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unbound Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnboundOperation(UnboundOperation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bound Transfer Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bound Transfer Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundTransferOperation(BoundTransferOperation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferOperation(TransferOperation object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Operation Behaviour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Operation Behaviour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferOperationBehaviour(TransferOperationBehaviour object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespaceElement(NamespaceElement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataType(DataType object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //ServiceSwitch
