/**
 */
package hu.blackbelt.judo.meta.psm.expression.variable.util;

import hu.blackbelt.judo.meta.psm.expression.variable.*;

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
 * @see hu.blackbelt.judo.meta.psm.expression.variable.VariablePackage
 * @generated
 */
public class VariableSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static VariablePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariableSwitch() {
        if (modelPackage == null) {
            modelPackage = VariablePackage.eINSTANCE;
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
            case VariablePackage.VARIABLE: {
                Variable variable = (Variable)theEObject;
                T result = caseVariable(variable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.LOGICAL_VARIABLE: {
                LogicalVariable logicalVariable = (LogicalVariable)theEObject;
                T result = caseLogicalVariable(logicalVariable);
                if (result == null) result = caseVariable(logicalVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.STRING_VARIABLE: {
                StringVariable stringVariable = (StringVariable)theEObject;
                T result = caseStringVariable(stringVariable);
                if (result == null) result = caseVariable(stringVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.ENUMERATION_VARIABLE: {
                EnumerationVariable enumerationVariable = (EnumerationVariable)theEObject;
                T result = caseEnumerationVariable(enumerationVariable);
                if (result == null) result = caseVariable(enumerationVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.OBJECT_VARIABLE: {
                ObjectVariable objectVariable = (ObjectVariable)theEObject;
                T result = caseObjectVariable(objectVariable);
                if (result == null) result = caseVariable(objectVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.COLLECTION_VARIABLE: {
                CollectionVariable collectionVariable = (CollectionVariable)theEObject;
                T result = caseCollectionVariable(collectionVariable);
                if (result == null) result = caseVariable(collectionVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.INTEGER_VARIABLE: {
                IntegerVariable integerVariable = (IntegerVariable)theEObject;
                T result = caseIntegerVariable(integerVariable);
                if (result == null) result = caseVariable(integerVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.DECIMAL_VARIABLE: {
                DecimalVariable decimalVariable = (DecimalVariable)theEObject;
                T result = caseDecimalVariable(decimalVariable);
                if (result == null) result = caseVariable(decimalVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case VariablePackage.CUSTOM_VARIABLE: {
                CustomVariable customVariable = (CustomVariable)theEObject;
                T result = caseCustomVariable(customVariable);
                if (result == null) result = caseVariable(customVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariable(Variable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Logical Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Logical Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLogicalVariable(LogicalVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringVariable(StringVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enumeration Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumeration Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumerationVariable(EnumerationVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Object Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Object Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseObjectVariable(ObjectVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Collection Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Collection Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCollectionVariable(CollectionVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Integer Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Integer Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntegerVariable(IntegerVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Decimal Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Decimal Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDecimalVariable(DecimalVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Custom Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Custom Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCustomVariable(CustomVariable object) {
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

} //VariableSwitch