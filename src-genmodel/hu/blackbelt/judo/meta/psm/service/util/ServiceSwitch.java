/**
 */
package hu.blackbelt.judo.meta.psm.service.util;

import hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement;

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
public class ServiceSwitch<T> extends Switch<T> {
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
	public ServiceSwitch() {
		if (modelPackage == null) {
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
	protected boolean isSwitchFor(EPackage ePackage) {
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
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ServicePackage.TRANSFER_OBJECT_TYPE: {
				TransferObjectType transferObjectType = (TransferObjectType)theEObject;
				T result = caseTransferObjectType(transferObjectType);
				if (result == null) result = caseDataType(transferObjectType);
				if (result == null) result = caseType(transferObjectType);
				if (result == null) result = caseNamespaceElement(transferObjectType);
				if (result == null) result = caseNamedElement(transferObjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.TRANSFER_RELATION: {
				TransferRelation transferRelation = (TransferRelation)theEObject;
				T result = caseTransferRelation(transferRelation);
				if (result == null) result = caseNamedElement(transferRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.TRANSFER_OBJECT_REFERENCE: {
				TransferObjectReference transferObjectReference = (TransferObjectReference)theEObject;
				T result = caseTransferObjectReference(transferObjectReference);
				if (result == null) result = caseTransferRelation(transferObjectReference);
				if (result == null) result = caseNamedElement(transferObjectReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.TRANSFER_OBJECT_CONTAINMENT: {
				TransferObjectContainment transferObjectContainment = (TransferObjectContainment)theEObject;
				T result = caseTransferObjectContainment(transferObjectContainment);
				if (result == null) result = caseTransferRelation(transferObjectContainment);
				if (result == null) result = caseNamedElement(transferObjectContainment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.TRANSFER_ATTRIBUTE: {
				TransferAttribute transferAttribute = (TransferAttribute)theEObject;
				T result = caseTransferAttribute(transferAttribute);
				if (result == null) result = casePrimitiveTypedElement(transferAttribute);
				if (result == null) result = caseNamedElement(transferAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE: {
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
			case ServicePackage.TRANSFER_ATTRIBUTE_BINDING: {
				TransferAttributeBinding transferAttributeBinding = (TransferAttributeBinding)theEObject;
				T result = caseTransferAttributeBinding(transferAttributeBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.TRANSFER_RELATION_BINDING: {
				TransferRelationBinding transferRelationBinding = (TransferRelationBinding)theEObject;
				T result = caseTransferRelationBinding(transferRelationBinding);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseNamedElement(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.UNMAPPED_TRANSFER_OBJECT_TYPE: {
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
			case ServicePackage.BOUND_OPERATION: {
				BoundOperation boundOperation = (BoundOperation)theEObject;
				T result = caseBoundOperation(boundOperation);
				if (result == null) result = caseOperation(boundOperation);
				if (result == null) result = caseNamedElement(boundOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServicePackage.UNBOUND_OPERATION: {
				UnboundOperation unboundOperation = (UnboundOperation)theEObject;
				T result = caseUnboundOperation(unboundOperation);
				if (result == null) result = caseOperation(unboundOperation);
				if (result == null) result = caseNamespaceElement(unboundOperation);
				if (result == null) result = caseNamedElement(unboundOperation);
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
	public T caseTransferObjectType(TransferObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferRelation(TransferRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Object Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Object Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferObjectReference(TransferObjectReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Object Containment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Object Containment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferObjectContainment(TransferObjectContainment object) {
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
	public T caseTransferAttribute(TransferAttribute object) {
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
	public T caseMappedTransferObjectType(MappedTransferObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Attribute Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Attribute Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferAttributeBinding(TransferAttributeBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transfer Relation Binding</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transfer Relation Binding</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransferRelationBinding(TransferRelationBinding object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
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
	public T caseUnmappedTransferObjectType(UnmappedTransferObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bound Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bound Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoundOperation(BoundOperation object) {
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
	public T caseUnboundOperation(UnboundOperation object) {
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
	public T caseNamedElement(NamedElement object) {
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
	public T caseNamespaceElement(NamespaceElement object) {
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
	public T caseType(Type object) {
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
	public T caseDataType(DataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveTypedElement(PrimitiveTypedElement object) {
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
	public T defaultCase(EObject object) {
		return null;
	}

} //ServiceSwitch
