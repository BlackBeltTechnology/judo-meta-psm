/**
 */
package hu.blackbelt.judo.meta.psm.type.util;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;
import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;

import hu.blackbelt.judo.meta.psm.type.*;

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
 * @see hu.blackbelt.judo.meta.psm.type.TypePackage
 * @generated
 */
public class TypeSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TypePackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeSwitch() {
        if (modelPackage == null) {
            modelPackage = TypePackage.eINSTANCE;
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
            case TypePackage.PRIMITIVE: {
                Primitive primitive = (Primitive)theEObject;
                T result = casePrimitive(primitive);
                if (result == null) result = caseDataType(primitive);
                if (result == null) result = caseType(primitive);
                if (result == null) result = caseNamespaceElement(primitive);
                if (result == null) result = caseNamedElement(primitive);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.CUSTOM_TYPE: {
                CustomType customType = (CustomType)theEObject;
                T result = caseCustomType(customType);
                if (result == null) result = casePrimitive(customType);
                if (result == null) result = caseDataType(customType);
                if (result == null) result = caseType(customType);
                if (result == null) result = caseNamespaceElement(customType);
                if (result == null) result = caseNamedElement(customType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.STRING_TYPE: {
                StringType stringType = (StringType)theEObject;
                T result = caseStringType(stringType);
                if (result == null) result = casePrimitive(stringType);
                if (result == null) result = caseDataType(stringType);
                if (result == null) result = caseType(stringType);
                if (result == null) result = caseNamespaceElement(stringType);
                if (result == null) result = caseNamedElement(stringType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.NUMERIC_TYPE: {
                NumericType numericType = (NumericType)theEObject;
                T result = caseNumericType(numericType);
                if (result == null) result = casePrimitive(numericType);
                if (result == null) result = caseDataType(numericType);
                if (result == null) result = caseType(numericType);
                if (result == null) result = caseNamespaceElement(numericType);
                if (result == null) result = caseNamedElement(numericType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.BOOLEAN_TYPE: {
                BooleanType booleanType = (BooleanType)theEObject;
                T result = caseBooleanType(booleanType);
                if (result == null) result = casePrimitive(booleanType);
                if (result == null) result = caseDataType(booleanType);
                if (result == null) result = caseType(booleanType);
                if (result == null) result = caseNamespaceElement(booleanType);
                if (result == null) result = caseNamedElement(booleanType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ENUMERATION_TYPE: {
                EnumerationType enumerationType = (EnumerationType)theEObject;
                T result = caseEnumerationType(enumerationType);
                if (result == null) result = casePrimitive(enumerationType);
                if (result == null) result = caseDataType(enumerationType);
                if (result == null) result = caseType(enumerationType);
                if (result == null) result = caseNamespaceElement(enumerationType);
                if (result == null) result = caseNamedElement(enumerationType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ENUMERATION_MEMBER: {
                EnumerationMember enumerationMember = (EnumerationMember)theEObject;
                T result = caseEnumerationMember(enumerationMember);
                if (result == null) result = caseNamedElement(enumerationMember);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.TYPE: {
                Type type = (Type)theEObject;
                T result = caseType(type);
                if (result == null) result = caseNamespaceElement(type);
                if (result == null) result = caseNamedElement(type);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.DATA_TYPE: {
                DataType dataType = (DataType)theEObject;
                T result = caseDataType(dataType);
                if (result == null) result = caseType(dataType);
                if (result == null) result = caseNamespaceElement(dataType);
                if (result == null) result = caseNamedElement(dataType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.XML_TYPE: {
                XMLType xmlType = (XMLType)theEObject;
                T result = caseXMLType(xmlType);
                if (result == null) result = casePrimitive(xmlType);
                if (result == null) result = caseDataType(xmlType);
                if (result == null) result = caseType(xmlType);
                if (result == null) result = caseNamespaceElement(xmlType);
                if (result == null) result = caseNamedElement(xmlType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.CARDINALITY: {
                Cardinality cardinality = (Cardinality)theEObject;
                T result = caseCardinality(cardinality);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.PASSWORD_TYPE: {
                PasswordType passwordType = (PasswordType)theEObject;
                T result = casePasswordType(passwordType);
                if (result == null) result = casePrimitive(passwordType);
                if (result == null) result = caseDataType(passwordType);
                if (result == null) result = caseType(passwordType);
                if (result == null) result = caseNamespaceElement(passwordType);
                if (result == null) result = caseNamedElement(passwordType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.DATE_TYPE: {
                DateType dateType = (DateType)theEObject;
                T result = caseDateType(dateType);
                if (result == null) result = casePrimitive(dateType);
                if (result == null) result = caseDataType(dateType);
                if (result == null) result = caseType(dateType);
                if (result == null) result = caseNamespaceElement(dateType);
                if (result == null) result = caseNamedElement(dateType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.TIMESTAMP_TYPE: {
                TimestampType timestampType = (TimestampType)theEObject;
                T result = caseTimestampType(timestampType);
                if (result == null) result = casePrimitive(timestampType);
                if (result == null) result = caseDataType(timestampType);
                if (result == null) result = caseType(timestampType);
                if (result == null) result = caseNamespaceElement(timestampType);
                if (result == null) result = caseNamedElement(timestampType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Primitive</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Primitive</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePrimitive(Primitive object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Custom Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Custom Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCustomType(CustomType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseStringType(StringType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Numeric Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumericType(NumericType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Boolean Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBooleanType(BooleanType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumeration Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumerationType(EnumerationType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enumeration Member</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumeration Member</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumerationMember(EnumerationMember object) {
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
     * Returns the result of interpreting the object as an instance of '<em>XML Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>XML Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseXMLType(XMLType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cardinality</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cardinality</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCardinality(Cardinality object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Password Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Password Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePasswordType(PasswordType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Date Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Date Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDateType(DateType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Timestamp Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Timestamp Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTimestampType(TimestampType object) {
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

} //TypeSwitch
