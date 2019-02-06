/**
 */
package hu.blackbelt.judo.meta.psm.expression.string.util;

import hu.blackbelt.judo.meta.psm.expression.AggregatedExpression;
import hu.blackbelt.judo.meta.psm.expression.AttributeSelector;
import hu.blackbelt.judo.meta.psm.expression.DataExpression;
import hu.blackbelt.judo.meta.psm.expression.Expression;
import hu.blackbelt.judo.meta.psm.expression.IntegerExpression;
import hu.blackbelt.judo.meta.psm.expression.NumericExpression;
import hu.blackbelt.judo.meta.psm.expression.StringExpression;
import hu.blackbelt.judo.meta.psm.expression.SwitchExpression;

import hu.blackbelt.judo.meta.psm.expression.string.*;

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
 * @see hu.blackbelt.judo.meta.psm.expression.string.StringPackage
 * @generated
 */
public class StringSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StringPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringSwitch() {
		if (modelPackage == null) {
			modelPackage = StringPackage.eINSTANCE;
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
			case StringPackage.STRING_ATTRIBUTE: {
				StringAttribute stringAttribute = (StringAttribute)theEObject;
				T result = caseStringAttribute(stringAttribute);
				if (result == null) result = caseStringExpression(stringAttribute);
				if (result == null) result = caseAttributeSelector(stringAttribute);
				if (result == null) result = caseDataExpression(stringAttribute);
				if (result == null) result = caseExpression(stringAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringPackage.CONCATENATE: {
				Concatenate concatenate = (Concatenate)theEObject;
				T result = caseConcatenate(concatenate);
				if (result == null) result = caseStringExpression(concatenate);
				if (result == null) result = caseDataExpression(concatenate);
				if (result == null) result = caseExpression(concatenate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringPackage.LOWER_CASE: {
				LowerCase lowerCase = (LowerCase)theEObject;
				T result = caseLowerCase(lowerCase);
				if (result == null) result = caseStringExpression(lowerCase);
				if (result == null) result = caseDataExpression(lowerCase);
				if (result == null) result = caseExpression(lowerCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringPackage.UPPER_CASE: {
				UpperCase upperCase = (UpperCase)theEObject;
				T result = caseUpperCase(upperCase);
				if (result == null) result = caseStringExpression(upperCase);
				if (result == null) result = caseDataExpression(upperCase);
				if (result == null) result = caseExpression(upperCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringPackage.LENGTH: {
				Length length = (Length)theEObject;
				T result = caseLength(length);
				if (result == null) result = caseIntegerExpression(length);
				if (result == null) result = caseNumericExpression(length);
				if (result == null) result = caseDataExpression(length);
				if (result == null) result = caseExpression(length);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringPackage.SUB_STRING: {
				SubString subString = (SubString)theEObject;
				T result = caseSubString(subString);
				if (result == null) result = caseStringExpression(subString);
				if (result == null) result = caseDataExpression(subString);
				if (result == null) result = caseExpression(subString);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringPackage.POSITION: {
				Position position = (Position)theEObject;
				T result = casePosition(position);
				if (result == null) result = caseIntegerExpression(position);
				if (result == null) result = caseNumericExpression(position);
				if (result == null) result = caseDataExpression(position);
				if (result == null) result = caseExpression(position);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringPackage.REPLACE: {
				Replace replace = (Replace)theEObject;
				T result = caseReplace(replace);
				if (result == null) result = caseStringExpression(replace);
				if (result == null) result = caseDataExpression(replace);
				if (result == null) result = caseExpression(replace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringPackage.TRIM: {
				Trim trim = (Trim)theEObject;
				T result = caseTrim(trim);
				if (result == null) result = caseStringExpression(trim);
				if (result == null) result = caseDataExpression(trim);
				if (result == null) result = caseExpression(trim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringPackage.STRING_SWITCH_EXPRESSION: {
				StringSwitchExpression stringSwitchExpression = (StringSwitchExpression)theEObject;
				T result = caseStringSwitchExpression(stringSwitchExpression);
				if (result == null) result = caseSwitchExpression(stringSwitchExpression);
				if (result == null) result = caseStringExpression(stringSwitchExpression);
				if (result == null) result = caseDataExpression(stringSwitchExpression);
				if (result == null) result = caseExpression(stringSwitchExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StringPackage.CONCATENATE_COLLECTION: {
				ConcatenateCollection concatenateCollection = (ConcatenateCollection)theEObject;
				T result = caseConcatenateCollection(concatenateCollection);
				if (result == null) result = caseStringExpression(concatenateCollection);
				if (result == null) result = caseAggregatedExpression(concatenateCollection);
				if (result == null) result = caseDataExpression(concatenateCollection);
				if (result == null) result = caseExpression(concatenateCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringAttribute(StringAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concatenate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concatenate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcatenate(Concatenate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowerCase(LowerCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upper Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upper Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpperCase(UpperCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Length</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLength(Length object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub String</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub String</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubString(SubString object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Position</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Position</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePosition(Position object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplace(Replace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trim</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trim</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrim(Trim object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringSwitchExpression(StringSwitchExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concatenate Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concatenate Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcatenateCollection(ConcatenateCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataExpression(DataExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringExpression(StringExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeSelector(AttributeSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumericExpression(NumericExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerExpression(IntegerExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchExpression(SwitchExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aggregated Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aggregated Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAggregatedExpression(AggregatedExpression object) {
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

} //StringSwitch
