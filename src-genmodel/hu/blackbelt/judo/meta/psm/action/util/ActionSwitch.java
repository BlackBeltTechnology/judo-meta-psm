/**
 */
package hu.blackbelt.judo.meta.psm.action.util;

import hu.blackbelt.judo.meta.psm.action.*;

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
 * @see hu.blackbelt.judo.meta.psm.action.ActionPackage
 * @generated
 */
public class ActionSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ActionPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionSwitch() {
        if (modelPackage == null) {
            modelPackage = ActionPackage.eINSTANCE;
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
            case ActionPackage.ACTION: {
                Action action = (Action)theEObject;
                T result = caseAction(action);
                if (result == null) result = caseFunction(action);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.FUNCTION: {
                Function function = (Function)theEObject;
                T result = caseFunction(function);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.QUERY: {
                Query query = (Query)theEObject;
                T result = caseQuery(query);
                if (result == null) result = caseFunction(query);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.PARAMETER: {
                Parameter parameter = (Parameter)theEObject;
                T result = caseParameter(parameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.ENTITY_PARAMETER: {
                EntityParameter entityParameter = (EntityParameter)theEObject;
                T result = caseEntityParameter(entityParameter);
                if (result == null) result = caseParameter(entityParameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.PRIMITIVE_PARAMETER: {
                PrimitiveParameter primitiveParameter = (PrimitiveParameter)theEObject;
                T result = casePrimitiveParameter(primitiveParameter);
                if (result == null) result = caseParameter(primitiveParameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.SINGLE_ENTITY_PARAMETER: {
                SingleEntityParameter singleEntityParameter = (SingleEntityParameter)theEObject;
                T result = caseSingleEntityParameter(singleEntityParameter);
                if (result == null) result = caseEntityParameter(singleEntityParameter);
                if (result == null) result = caseParameter(singleEntityParameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.LIST_ENTITY_PARAMETER: {
                ListEntityParameter listEntityParameter = (ListEntityParameter)theEObject;
                T result = caseListEntityParameter(listEntityParameter);
                if (result == null) result = caseEntityParameter(listEntityParameter);
                if (result == null) result = caseParameter(listEntityParameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ActionPackage.DELETE_OPERATION: {
                DeleteOperation deleteOperation = (DeleteOperation)theEObject;
                T result = caseDeleteOperation(deleteOperation);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Action</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAction(Action object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunction(Function object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Query</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Query</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseQuery(Query object) {
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
    public T caseParameter(Parameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Entity Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Entity Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEntityParameter(EntityParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Primitive Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Primitive Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrimitiveParameter(PrimitiveParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Single Entity Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Single Entity Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSingleEntityParameter(SingleEntityParameter object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>List Entity Parameter</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>List Entity Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseListEntityParameter(ListEntityParameter object) {
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

} //ActionSwitch
