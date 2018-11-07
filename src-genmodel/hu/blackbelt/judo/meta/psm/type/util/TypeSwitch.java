/**
 */
package hu.blackbelt.judo.meta.psm.type.util;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import hu.blackbelt.judo.meta.psm.type.Cardinality;
import hu.blackbelt.judo.meta.psm.type.ComplexType;
import hu.blackbelt.judo.meta.psm.type.Custom;
import hu.blackbelt.judo.meta.psm.type.DataType;
import hu.blackbelt.judo.meta.psm.type.Element;
import hu.blackbelt.judo.meta.psm.type.Enumeration;
import hu.blackbelt.judo.meta.psm.type.Member;
import hu.blackbelt.judo.meta.psm.type.Numeric;
import hu.blackbelt.judo.meta.psm.type.Primitive;
import hu.blackbelt.judo.meta.psm.type.Type;
import hu.blackbelt.judo.meta.psm.type.TypePackage;
import hu.blackbelt.judo.meta.psm.type.XML;

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
                if (result == null) result = caseNamedElement(primitive);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.CUSTOM: {
                Custom custom = (Custom)theEObject;
                T result = caseCustom(custom);
                if (result == null) result = casePrimitive(custom);
                if (result == null) result = caseDataType(custom);
                if (result == null) result = caseType(custom);
                if (result == null) result = caseNamedElement(custom);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.STRING: {
                hu.blackbelt.judo.meta.psm.type.String string = (hu.blackbelt.judo.meta.psm.type.String)theEObject;
                T result = caseString(string);
                if (result == null) result = casePrimitive(string);
                if (result == null) result = caseDataType(string);
                if (result == null) result = caseType(string);
                if (result == null) result = caseNamedElement(string);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.NUMERIC: {
                Numeric numeric = (Numeric)theEObject;
                T result = caseNumeric(numeric);
                if (result == null) result = casePrimitive(numeric);
                if (result == null) result = caseDataType(numeric);
                if (result == null) result = caseType(numeric);
                if (result == null) result = caseNamedElement(numeric);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.BOOLEAN: {
                hu.blackbelt.judo.meta.psm.type.Boolean boolean_ = (hu.blackbelt.judo.meta.psm.type.Boolean)theEObject;
                T result = caseBoolean(boolean_);
                if (result == null) result = casePrimitive(boolean_);
                if (result == null) result = caseDataType(boolean_);
                if (result == null) result = caseType(boolean_);
                if (result == null) result = caseNamedElement(boolean_);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ENUMERATION: {
                Enumeration enumeration = (Enumeration)theEObject;
                T result = caseEnumeration(enumeration);
                if (result == null) result = casePrimitive(enumeration);
                if (result == null) result = caseDataType(enumeration);
                if (result == null) result = caseType(enumeration);
                if (result == null) result = caseNamedElement(enumeration);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.MEMBER: {
                Member member = (Member)theEObject;
                T result = caseMember(member);
                if (result == null) result = caseNamedElement(member);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.TYPE: {
                Type type = (Type)theEObject;
                T result = caseType(type);
                if (result == null) result = caseNamedElement(type);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.DATA_TYPE: {
                DataType dataType = (DataType)theEObject;
                T result = caseDataType(dataType);
                if (result == null) result = caseType(dataType);
                if (result == null) result = caseNamedElement(dataType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.XML: {
                XML xml = (XML)theEObject;
                T result = caseXML(xml);
                if (result == null) result = casePrimitive(xml);
                if (result == null) result = caseDataType(xml);
                if (result == null) result = caseType(xml);
                if (result == null) result = caseNamedElement(xml);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.COMPLEX_TYPE: {
                ComplexType complexType = (ComplexType)theEObject;
                T result = caseComplexType(complexType);
                if (result == null) result = caseDataType(complexType);
                if (result == null) result = caseType(complexType);
                if (result == null) result = caseNamedElement(complexType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.ELEMENT: {
                Element element = (Element)theEObject;
                T result = caseElement(element);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypePackage.CARDINALITY: {
                Cardinality cardinality = (Cardinality)theEObject;
                T result = caseCardinality(cardinality);
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
     * Returns the result of interpreting the object as an instance of '<em>Custom</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Custom</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCustom(Custom object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>String</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>String</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseString(hu.blackbelt.judo.meta.psm.type.String object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Numeric</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Numeric</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNumeric(Numeric object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBoolean(hu.blackbelt.judo.meta.psm.type.Boolean object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseEnumeration(Enumeration object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Member</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMember(Member object) {
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
     * Returns the result of interpreting the object as an instance of '<em>XML</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>XML</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseXML(XML object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Complex Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Complex Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseComplexType(ComplexType object) {
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
    public T caseElement(Element object) {
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

} //TypeSwitch
