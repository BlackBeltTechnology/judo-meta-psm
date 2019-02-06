/**
 */
package hu.blackbelt.judo.meta.psm.expression.constant.util;

import hu.blackbelt.judo.meta.psm.expression.CustomExpression;
import hu.blackbelt.judo.meta.psm.expression.DataExpression;
import hu.blackbelt.judo.meta.psm.expression.DateExpression;
import hu.blackbelt.judo.meta.psm.expression.DecimalExpression;
import hu.blackbelt.judo.meta.psm.expression.EnumerationExpression;
import hu.blackbelt.judo.meta.psm.expression.Expression;
import hu.blackbelt.judo.meta.psm.expression.IntegerExpression;
import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;
import hu.blackbelt.judo.meta.psm.expression.NumericExpression;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;
import hu.blackbelt.judo.meta.psm.expression.ReferenceExpression;
import hu.blackbelt.judo.meta.psm.expression.StringExpression;
import hu.blackbelt.judo.meta.psm.expression.TimestampExpression;

import hu.blackbelt.judo.meta.psm.expression.constant.BooleanConstant;
import hu.blackbelt.judo.meta.psm.expression.constant.Constant;
import hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage;
import hu.blackbelt.judo.meta.psm.expression.constant.CustomData;
import hu.blackbelt.judo.meta.psm.expression.constant.DateConstant;
import hu.blackbelt.judo.meta.psm.expression.constant.DecimalConstant;
import hu.blackbelt.judo.meta.psm.expression.constant.Instance;
import hu.blackbelt.judo.meta.psm.expression.constant.IntegerConstant;
import hu.blackbelt.judo.meta.psm.expression.constant.Literal;
import hu.blackbelt.judo.meta.psm.expression.constant.MeasuredDecimal;
import hu.blackbelt.judo.meta.psm.expression.constant.MeasuredInteger;
import hu.blackbelt.judo.meta.psm.expression.constant.StringConstant;
import hu.blackbelt.judo.meta.psm.expression.constant.TimestampConstant;

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
 * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage
 * @generated
 */
public class ConstantSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConstantPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantSwitch() {
		if (modelPackage == null) {
			modelPackage = ConstantPackage.eINSTANCE;
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
			case ConstantPackage.CONSTANT: {
				Constant constant = (Constant)theEObject;
				T result = caseConstant(constant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstantPackage.NUMBER: {
				hu.blackbelt.judo.meta.psm.expression.constant.Number number = (hu.blackbelt.judo.meta.psm.expression.constant.Number)theEObject;
				T result = caseNumber(number);
				if (result == null) result = caseConstant(number);
				if (result == null) result = caseNumericExpression(number);
				if (result == null) result = caseDataExpression(number);
				if (result == null) result = caseExpression(number);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstantPackage.INTEGER_CONSTANT: {
				IntegerConstant integerConstant = (IntegerConstant)theEObject;
				T result = caseIntegerConstant(integerConstant);
				if (result == null) result = caseNumber(integerConstant);
				if (result == null) result = caseIntegerExpression(integerConstant);
				if (result == null) result = caseConstant(integerConstant);
				if (result == null) result = caseNumericExpression(integerConstant);
				if (result == null) result = caseDataExpression(integerConstant);
				if (result == null) result = caseExpression(integerConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstantPackage.DECIMAL_CONSTANT: {
				DecimalConstant decimalConstant = (DecimalConstant)theEObject;
				T result = caseDecimalConstant(decimalConstant);
				if (result == null) result = caseNumber(decimalConstant);
				if (result == null) result = caseDecimalExpression(decimalConstant);
				if (result == null) result = caseConstant(decimalConstant);
				if (result == null) result = caseNumericExpression(decimalConstant);
				if (result == null) result = caseDataExpression(decimalConstant);
				if (result == null) result = caseExpression(decimalConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstantPackage.BOOLEAN_CONSTANT: {
				BooleanConstant booleanConstant = (BooleanConstant)theEObject;
				T result = caseBooleanConstant(booleanConstant);
				if (result == null) result = caseConstant(booleanConstant);
				if (result == null) result = caseLogicalExpression(booleanConstant);
				if (result == null) result = caseDataExpression(booleanConstant);
				if (result == null) result = caseExpression(booleanConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstantPackage.STRING_CONSTANT: {
				StringConstant stringConstant = (StringConstant)theEObject;
				T result = caseStringConstant(stringConstant);
				if (result == null) result = caseConstant(stringConstant);
				if (result == null) result = caseStringExpression(stringConstant);
				if (result == null) result = caseDataExpression(stringConstant);
				if (result == null) result = caseExpression(stringConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstantPackage.LITERAL: {
				Literal literal = (Literal)theEObject;
				T result = caseLiteral(literal);
				if (result == null) result = caseConstant(literal);
				if (result == null) result = caseEnumerationExpression(literal);
				if (result == null) result = caseDataExpression(literal);
				if (result == null) result = caseExpression(literal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstantPackage.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T result = caseInstance(instance);
				if (result == null) result = caseConstant(instance);
				if (result == null) result = caseObjectExpression(instance);
				if (result == null) result = caseReferenceExpression(instance);
				if (result == null) result = caseExpression(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstantPackage.CUSTOM_DATA: {
				CustomData customData = (CustomData)theEObject;
				T result = caseCustomData(customData);
				if (result == null) result = caseConstant(customData);
				if (result == null) result = caseCustomExpression(customData);
				if (result == null) result = caseDataExpression(customData);
				if (result == null) result = caseExpression(customData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstantPackage.MEASURED_DECIMAL: {
				MeasuredDecimal measuredDecimal = (MeasuredDecimal)theEObject;
				T result = caseMeasuredDecimal(measuredDecimal);
				if (result == null) result = caseDecimalConstant(measuredDecimal);
				if (result == null) result = caseNumber(measuredDecimal);
				if (result == null) result = caseDecimalExpression(measuredDecimal);
				if (result == null) result = caseConstant(measuredDecimal);
				if (result == null) result = caseNumericExpression(measuredDecimal);
				if (result == null) result = caseDataExpression(measuredDecimal);
				if (result == null) result = caseExpression(measuredDecimal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstantPackage.MEASURED_INTEGER: {
				MeasuredInteger measuredInteger = (MeasuredInteger)theEObject;
				T result = caseMeasuredInteger(measuredInteger);
				if (result == null) result = caseIntegerConstant(measuredInteger);
				if (result == null) result = caseNumber(measuredInteger);
				if (result == null) result = caseIntegerExpression(measuredInteger);
				if (result == null) result = caseConstant(measuredInteger);
				if (result == null) result = caseNumericExpression(measuredInteger);
				if (result == null) result = caseDataExpression(measuredInteger);
				if (result == null) result = caseExpression(measuredInteger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstantPackage.DATE_CONSTANT: {
				DateConstant dateConstant = (DateConstant)theEObject;
				T result = caseDateConstant(dateConstant);
				if (result == null) result = caseConstant(dateConstant);
				if (result == null) result = caseDateExpression(dateConstant);
				if (result == null) result = caseDataExpression(dateConstant);
				if (result == null) result = caseExpression(dateConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ConstantPackage.TIMESTAMP_CONSTANT: {
				TimestampConstant timestampConstant = (TimestampConstant)theEObject;
				T result = caseTimestampConstant(timestampConstant);
				if (result == null) result = caseConstant(timestampConstant);
				if (result == null) result = caseTimestampExpression(timestampConstant);
				if (result == null) result = caseDataExpression(timestampConstant);
				if (result == null) result = caseExpression(timestampConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumber(hu.blackbelt.judo.meta.psm.expression.constant.Number object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Integer Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIntegerConstant(IntegerConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalConstant(DecimalConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooleanConstant(BooleanConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringConstant(StringConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteral(Literal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomData(CustomData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measured Decimal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measured Decimal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasuredDecimal(MeasuredDecimal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measured Integer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measured Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasuredInteger(MeasuredInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateConstant(DateConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timestamp Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timestamp Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimestampConstant(TimestampConstant object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalExpression(DecimalExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Enumeration Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enumeration Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnumerationExpression(EnumerationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceExpression(ReferenceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectExpression(ObjectExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomExpression(CustomExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateExpression(DateExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timestamp Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timestamp Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimestampExpression(TimestampExpression object) {
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

} //ConstantSwitch
