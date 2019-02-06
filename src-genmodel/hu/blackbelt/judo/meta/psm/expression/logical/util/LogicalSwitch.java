/**
 */
package hu.blackbelt.judo.meta.psm.expression.logical.util;

import hu.blackbelt.judo.meta.psm.expression.AttributeSelector;
import hu.blackbelt.judo.meta.psm.expression.DataExpression;
import hu.blackbelt.judo.meta.psm.expression.Expression;
import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;

import hu.blackbelt.judo.meta.psm.expression.logical.*;

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
 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage
 * @generated
 */
public class LogicalSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogicalPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalSwitch() {
		if (modelPackage == null) {
			modelPackage = LogicalPackage.eINSTANCE;
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
			case LogicalPackage.STRING_COMPARISON: {
				StringComparison stringComparison = (StringComparison)theEObject;
				T result = caseStringComparison(stringComparison);
				if (result == null) result = caseLogicalExpression(stringComparison);
				if (result == null) result = caseDataExpression(stringComparison);
				if (result == null) result = caseExpression(stringComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.ENUMERATION_COMPARISON: {
				EnumerationComparison enumerationComparison = (EnumerationComparison)theEObject;
				T result = caseEnumerationComparison(enumerationComparison);
				if (result == null) result = caseLogicalExpression(enumerationComparison);
				if (result == null) result = caseDataExpression(enumerationComparison);
				if (result == null) result = caseExpression(enumerationComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.NEGATION_EXPRESSION: {
				NegationExpression negationExpression = (NegationExpression)theEObject;
				T result = caseNegationExpression(negationExpression);
				if (result == null) result = caseLogicalExpression(negationExpression);
				if (result == null) result = caseDataExpression(negationExpression);
				if (result == null) result = caseExpression(negationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.KLEENE_EXPRESSION: {
				KleeneExpression kleeneExpression = (KleeneExpression)theEObject;
				T result = caseKleeneExpression(kleeneExpression);
				if (result == null) result = caseLogicalExpression(kleeneExpression);
				if (result == null) result = caseDataExpression(kleeneExpression);
				if (result == null) result = caseExpression(kleeneExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.INSTANCE_OF_EXPRESSION: {
				InstanceOfExpression instanceOfExpression = (InstanceOfExpression)theEObject;
				T result = caseInstanceOfExpression(instanceOfExpression);
				if (result == null) result = caseLogicalExpression(instanceOfExpression);
				if (result == null) result = caseDataExpression(instanceOfExpression);
				if (result == null) result = caseExpression(instanceOfExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.LOGICAL_ATTRIBUTE: {
				LogicalAttribute logicalAttribute = (LogicalAttribute)theEObject;
				T result = caseLogicalAttribute(logicalAttribute);
				if (result == null) result = caseLogicalExpression(logicalAttribute);
				if (result == null) result = caseAttributeSelector(logicalAttribute);
				if (result == null) result = caseDataExpression(logicalAttribute);
				if (result == null) result = caseExpression(logicalAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.UNDEFINED_ATTRIBUTE_COMPARISON: {
				UndefinedAttributeComparison undefinedAttributeComparison = (UndefinedAttributeComparison)theEObject;
				T result = caseUndefinedAttributeComparison(undefinedAttributeComparison);
				if (result == null) result = caseLogicalExpression(undefinedAttributeComparison);
				if (result == null) result = caseDataExpression(undefinedAttributeComparison);
				if (result == null) result = caseExpression(undefinedAttributeComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.UNDEFINED_NAVIGATION_COMPARISON: {
				UndefinedNavigationComparison undefinedNavigationComparison = (UndefinedNavigationComparison)theEObject;
				T result = caseUndefinedNavigationComparison(undefinedNavigationComparison);
				if (result == null) result = caseLogicalExpression(undefinedNavigationComparison);
				if (result == null) result = caseDataExpression(undefinedNavigationComparison);
				if (result == null) result = caseExpression(undefinedNavigationComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.CONTAINS_EXPRESSION: {
				ContainsExpression containsExpression = (ContainsExpression)theEObject;
				T result = caseContainsExpression(containsExpression);
				if (result == null) result = caseLogicalExpression(containsExpression);
				if (result == null) result = caseDataExpression(containsExpression);
				if (result == null) result = caseExpression(containsExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.INTEGER_COMPARISON: {
				IntegerComparison integerComparison = (IntegerComparison)theEObject;
				T result = caseIntegerComparison(integerComparison);
				if (result == null) result = caseLogicalExpression(integerComparison);
				if (result == null) result = caseDataExpression(integerComparison);
				if (result == null) result = caseExpression(integerComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.DECIMAL_COMPARISON: {
				DecimalComparison decimalComparison = (DecimalComparison)theEObject;
				T result = caseDecimalComparison(decimalComparison);
				if (result == null) result = caseLogicalExpression(decimalComparison);
				if (result == null) result = caseDataExpression(decimalComparison);
				if (result == null) result = caseExpression(decimalComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.OBJECT_COMPARISON: {
				ObjectComparison objectComparison = (ObjectComparison)theEObject;
				T result = caseObjectComparison(objectComparison);
				if (result == null) result = caseLogicalExpression(objectComparison);
				if (result == null) result = caseDataExpression(objectComparison);
				if (result == null) result = caseExpression(objectComparison);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.MEMBER_OF_EXPRESSION: {
				MemberOfExpression memberOfExpression = (MemberOfExpression)theEObject;
				T result = caseMemberOfExpression(memberOfExpression);
				if (result == null) result = caseLogicalExpression(memberOfExpression);
				if (result == null) result = caseDataExpression(memberOfExpression);
				if (result == null) result = caseExpression(memberOfExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LogicalPackage.TYPE_OF_EXPRESSION: {
				TypeOfExpression typeOfExpression = (TypeOfExpression)theEObject;
				T result = caseTypeOfExpression(typeOfExpression);
				if (result == null) result = caseLogicalExpression(typeOfExpression);
				if (result == null) result = caseDataExpression(typeOfExpression);
				if (result == null) result = caseExpression(typeOfExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringComparison(StringComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationComparison(EnumerationComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegationExpression(NegationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kleene Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kleene Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKleeneExpression(KleeneExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance Of Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance Of Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceOfExpression(InstanceOfExpression object) {
		return null;
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
	public T caseLogicalAttribute(LogicalAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undefined Attribute Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undefined Attribute Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndefinedAttributeComparison(UndefinedAttributeComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Undefined Navigation Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Undefined Navigation Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUndefinedNavigationComparison(UndefinedNavigationComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contains Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contains Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainsExpression(ContainsExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerComparison(IntegerComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalComparison(DecimalComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Comparison</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Comparison</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectComparison(ObjectComparison object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member Of Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member Of Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemberOfExpression(MemberOfExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Of Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Of Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeOfExpression(TypeOfExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalExpression(LogicalExpression object) {
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

} //LogicalSwitch
