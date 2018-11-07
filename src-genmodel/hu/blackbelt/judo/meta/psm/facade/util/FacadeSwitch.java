/**
 */
package hu.blackbelt.judo.meta.psm.facade.util;

import hu.blackbelt.judo.meta.psm.facade.*;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

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
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage
 * @generated
 */
public class FacadeSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static FacadePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FacadeSwitch() {
        if (modelPackage == null) {
            modelPackage = FacadePackage.eINSTANCE;
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
            case FacadePackage.PROPERTY_SET: {
                PropertySet propertySet = (PropertySet)theEObject;
                T result = casePropertySet(propertySet);
                if (result == null) result = caseNamedElement(propertySet);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.PROPERTY: {
                Property property = (Property)theEObject;
                T result = caseProperty(property);
                if (result == null) result = caseNamedElement(property);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.NAVIGATION: {
                Navigation navigation = (Navigation)theEObject;
                T result = caseNavigation(navigation);
                if (result == null) result = caseFacade(navigation);
                if (result == null) result = caseNamedElement(navigation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.SINGLE_NAVIGATION: {
                SingleNavigation singleNavigation = (SingleNavigation)theEObject;
                T result = caseSingleNavigation(singleNavigation);
                if (result == null) result = caseNavigation(singleNavigation);
                if (result == null) result = caseFacade(singleNavigation);
                if (result == null) result = caseNamedElement(singleNavigation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.LIST_NAVIGATION: {
                ListNavigation listNavigation = (ListNavigation)theEObject;
                T result = caseListNavigation(listNavigation);
                if (result == null) result = caseNavigation(listNavigation);
                if (result == null) result = caseFacade(listNavigation);
                if (result == null) result = caseNamedElement(listNavigation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.ENTITY_SET_SELECTOR: {
                EntitySetSelector entitySetSelector = (EntitySetSelector)theEObject;
                T result = caseEntitySetSelector(entitySetSelector);
                if (result == null) result = caseEntitySelector(entitySetSelector);
                if (result == null) result = caseNamedElement(entitySetSelector);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.ENTITY_SINGLE_SELECTOR: {
                EntitySingleSelector entitySingleSelector = (EntitySingleSelector)theEObject;
                T result = caseEntitySingleSelector(entitySingleSelector);
                if (result == null) result = caseEntitySelector(entitySingleSelector);
                if (result == null) result = caseNamedElement(entitySingleSelector);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.ENTITY_SELECTOR: {
                EntitySelector entitySelector = (EntitySelector)theEObject;
                T result = caseEntitySelector(entitySelector);
                if (result == null) result = caseNamedElement(entitySelector);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.FACADE: {
                Facade facade = (Facade)theEObject;
                T result = caseFacade(facade);
                if (result == null) result = caseNamedElement(facade);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.STANDALONE_FACADE: {
                StandaloneFacade standaloneFacade = (StandaloneFacade)theEObject;
                T result = caseStandaloneFacade(standaloneFacade);
                if (result == null) result = caseFacade(standaloneFacade);
                if (result == null) result = caseNamedElement(standaloneFacade);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.DELETE_OPERATION: {
                DeleteOperation deleteOperation = (DeleteOperation)theEObject;
                T result = caseDeleteOperation(deleteOperation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.READ_FILTERABLE_PROPERTY: {
                ReadFilterableProperty readFilterableProperty = (ReadFilterableProperty)theEObject;
                T result = caseReadFilterableProperty(readFilterableProperty);
                if (result == null) result = caseReadProperty(readFilterableProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.READ_FUNCTION_PROPERTY: {
                ReadFunctionProperty readFunctionProperty = (ReadFunctionProperty)theEObject;
                T result = caseReadFunctionProperty(readFunctionProperty);
                if (result == null) result = caseReadProperty(readFunctionProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.READ_PROPERTY: {
                ReadProperty readProperty = (ReadProperty)theEObject;
                T result = caseReadProperty(readProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.WRITE_PROPERTY: {
                WriteProperty writeProperty = (WriteProperty)theEObject;
                T result = caseWriteProperty(writeProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.WRITE_ATTRIBUTE: {
                WriteAttribute writeAttribute = (WriteAttribute)theEObject;
                T result = caseWriteAttribute(writeAttribute);
                if (result == null) result = caseWriteProperty(writeAttribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.WRITE_FUNCTION_PROPERTY: {
                WriteFunctionProperty writeFunctionProperty = (WriteFunctionProperty)theEObject;
                T result = caseWriteFunctionProperty(writeFunctionProperty);
                if (result == null) result = caseWriteProperty(writeFunctionProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.TRAVERSE_FUNCTION_SINGLE_NAVIGATION: {
                TraverseFunctionSingleNavigation traverseFunctionSingleNavigation = (TraverseFunctionSingleNavigation)theEObject;
                T result = caseTraverseFunctionSingleNavigation(traverseFunctionSingleNavigation);
                if (result == null) result = caseTraverseSingleNavigation(traverseFunctionSingleNavigation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.TRAVERSE_SINGLE_NAVIGATION: {
                TraverseSingleNavigation traverseSingleNavigation = (TraverseSingleNavigation)theEObject;
                T result = caseTraverseSingleNavigation(traverseSingleNavigation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.TRAVERSE_LIST_NAVIGATION: {
                TraverseListNavigation traverseListNavigation = (TraverseListNavigation)theEObject;
                T result = caseTraverseListNavigation(traverseListNavigation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.MULTI_TRAVERSE_FUNCTION_DEFINITION: {
                MultiTraverseFunctionDefinition multiTraverseFunctionDefinition = (MultiTraverseFunctionDefinition)theEObject;
                T result = caseMultiTraverseFunctionDefinition(multiTraverseFunctionDefinition);
                if (result == null) result = caseTraverseListNavigation(multiTraverseFunctionDefinition);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.CREATE_OPERATION: {
                CreateOperation createOperation = (CreateOperation)theEObject;
                T result = caseCreateOperation(createOperation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.DEFAULT_CREATE_OPERATION: {
                DefaultCreateOperation defaultCreateOperation = (DefaultCreateOperation)theEObject;
                T result = caseDefaultCreateOperation(defaultCreateOperation);
                if (result == null) result = caseCreateOperation(defaultCreateOperation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.CUSTOM_CREATE_OPERATION: {
                CustomCreateOperation customCreateOperation = (CustomCreateOperation)theEObject;
                T result = caseCustomCreateOperation(customCreateOperation);
                if (result == null) result = caseCreateOperation(customCreateOperation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.UPDATE_OPERATION: {
                UpdateOperation updateOperation = (UpdateOperation)theEObject;
                T result = caseUpdateOperation(updateOperation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.DEFAULT_UPDATE_OPERATION: {
                DefaultUpdateOperation defaultUpdateOperation = (DefaultUpdateOperation)theEObject;
                T result = caseDefaultUpdateOperation(defaultUpdateOperation);
                if (result == null) result = caseUpdateOperation(defaultUpdateOperation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.CUSTOM_UPDATE_OPERATION: {
                CustomUpdateOperation customUpdateOperation = (CustomUpdateOperation)theEObject;
                T result = caseCustomUpdateOperation(customUpdateOperation);
                if (result == null) result = caseUpdateOperation(customUpdateOperation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.BIND_SINGLE_NAVIGATION: {
                BindSingleNavigation bindSingleNavigation = (BindSingleNavigation)theEObject;
                T result = caseBindSingleNavigation(bindSingleNavigation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.BIND_SINGLE_REFERENCE: {
                BindSingleReference bindSingleReference = (BindSingleReference)theEObject;
                T result = caseBindSingleReference(bindSingleReference);
                if (result == null) result = caseBindSingleNavigation(bindSingleReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.TRAVERSE_FILTERABLE_SINGLE_NAVIGATION: {
                TraverseFilterableSingleNavigation traverseFilterableSingleNavigation = (TraverseFilterableSingleNavigation)theEObject;
                T result = caseTraverseFilterableSingleNavigation(traverseFilterableSingleNavigation);
                if (result == null) result = caseTraverseSingleNavigation(traverseFilterableSingleNavigation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.BIND_FUNCTION_SINGLE_NAVIGATION: {
                BindFunctionSingleNavigation bindFunctionSingleNavigation = (BindFunctionSingleNavigation)theEObject;
                T result = caseBindFunctionSingleNavigation(bindFunctionSingleNavigation);
                if (result == null) result = caseBindSingleNavigation(bindFunctionSingleNavigation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.TRAVERSE_FILTERABLE_LIST_NAVIGATION: {
                TraverseFilterableListNavigation traverseFilterableListNavigation = (TraverseFilterableListNavigation)theEObject;
                T result = caseTraverseFilterableListNavigation(traverseFilterableListNavigation);
                if (result == null) result = caseTraverseListNavigation(traverseFilterableListNavigation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.ATTACH_LIST_NAVIGATION: {
                AttachListNavigation attachListNavigation = (AttachListNavigation)theEObject;
                T result = caseAttachListNavigation(attachListNavigation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.DETACH_LIST_NAVIGATION: {
                DetachListNavigation detachListNavigation = (DetachListNavigation)theEObject;
                T result = caseDetachListNavigation(detachListNavigation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.ATTACH_LIST_REFERENCE: {
                AttachListReference attachListReference = (AttachListReference)theEObject;
                T result = caseAttachListReference(attachListReference);
                if (result == null) result = caseAttachListNavigation(attachListReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.ATTACH_FUNCTION_LIST_NAVIGATION: {
                AttachFunctionListNavigation attachFunctionListNavigation = (AttachFunctionListNavigation)theEObject;
                T result = caseAttachFunctionListNavigation(attachFunctionListNavigation);
                if (result == null) result = caseAttachListNavigation(attachFunctionListNavigation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.DETACH_LIST_REFERENCE: {
                DetachListReference detachListReference = (DetachListReference)theEObject;
                T result = caseDetachListReference(detachListReference);
                if (result == null) result = caseDetachListNavigation(detachListReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case FacadePackage.DETACH_FUNCTION_LIST_NAVIGATION: {
                DetachFunctionListNavigation detachFunctionListNavigation = (DetachFunctionListNavigation)theEObject;
                T result = caseDetachFunctionListNavigation(detachFunctionListNavigation);
                if (result == null) result = caseDetachListNavigation(detachFunctionListNavigation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property Set</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property Set</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePropertySet(PropertySet object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseProperty(Property object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Navigation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Navigation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNavigation(Navigation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Single Navigation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Single Navigation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSingleNavigation(SingleNavigation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>List Navigation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>List Navigation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseListNavigation(ListNavigation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Set Selector</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Set Selector</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntitySetSelector(EntitySetSelector object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Single Selector</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Single Selector</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntitySingleSelector(EntitySingleSelector object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Selector</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Selector</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntitySelector(EntitySelector object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Facade</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Facade</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFacade(Facade object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Standalone Facade</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Standalone Facade</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStandaloneFacade(StandaloneFacade object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Delete Operation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Delete Operation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDeleteOperation(DeleteOperation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Read Filterable Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Read Filterable Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReadFilterableProperty(ReadFilterableProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Read Function Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Read Function Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReadFunctionProperty(ReadFunctionProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Read Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Read Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseReadProperty(ReadProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Write Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Write Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWriteProperty(WriteProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Write Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Write Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWriteAttribute(WriteAttribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Write Function Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Write Function Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWriteFunctionProperty(WriteFunctionProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Traverse Function Single Navigation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Traverse Function Single Navigation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTraverseFunctionSingleNavigation(TraverseFunctionSingleNavigation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Traverse Single Navigation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Traverse Single Navigation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTraverseSingleNavigation(TraverseSingleNavigation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Traverse List Navigation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Traverse List Navigation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTraverseListNavigation(TraverseListNavigation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Multi Traverse Function Definition</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Multi Traverse Function Definition</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMultiTraverseFunctionDefinition(MultiTraverseFunctionDefinition object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Create Operation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Create Operation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCreateOperation(CreateOperation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Default Create Operation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Default Create Operation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDefaultCreateOperation(DefaultCreateOperation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Custom Create Operation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Custom Create Operation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCustomCreateOperation(CustomCreateOperation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Update Operation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Update Operation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUpdateOperation(UpdateOperation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Default Update Operation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Default Update Operation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDefaultUpdateOperation(DefaultUpdateOperation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Custom Update Operation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Custom Update Operation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCustomUpdateOperation(CustomUpdateOperation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bind Single Navigation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bind Single Navigation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBindSingleNavigation(BindSingleNavigation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bind Single Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bind Single Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBindSingleReference(BindSingleReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Traverse Filterable Single Navigation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Traverse Filterable Single Navigation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTraverseFilterableSingleNavigation(TraverseFilterableSingleNavigation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Bind Function Single Navigation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Bind Function Single Navigation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBindFunctionSingleNavigation(BindFunctionSingleNavigation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Traverse Filterable List Navigation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Traverse Filterable List Navigation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTraverseFilterableListNavigation(TraverseFilterableListNavigation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attach List Navigation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attach List Navigation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttachListNavigation(AttachListNavigation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Detach List Navigation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Detach List Navigation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDetachListNavigation(DetachListNavigation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attach List Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attach List Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttachListReference(AttachListReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Attach Function List Navigation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attach Function List Navigation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAttachFunctionListNavigation(AttachFunctionListNavigation object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Detach List Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Detach List Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDetachListReference(DetachListReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Detach Function List Navigation</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Detach Function List Navigation</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDetachFunctionListNavigation(DetachFunctionListNavigation object) {
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

} //FacadeSwitch
