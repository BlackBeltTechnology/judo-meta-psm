/**
 */
package hu.blackbelt.judo.meta.psm.expression.numeric.util;

import hu.blackbelt.judo.meta.psm.expression.AggregatedExpression;
import hu.blackbelt.judo.meta.psm.expression.AttributeSelector;
import hu.blackbelt.judo.meta.psm.expression.DataExpression;
import hu.blackbelt.judo.meta.psm.expression.DecimalExpression;
import hu.blackbelt.judo.meta.psm.expression.Expression;
import hu.blackbelt.judo.meta.psm.expression.IntegerExpression;
import hu.blackbelt.judo.meta.psm.expression.NumericExpression;
import hu.blackbelt.judo.meta.psm.expression.SwitchExpression;
import hu.blackbelt.judo.meta.psm.expression.VariableReference;

import hu.blackbelt.judo.meta.psm.expression.numeric.*;

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
 * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage
 * @generated
 */
public class NumericSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static NumericPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NumericSwitch() {
        if (modelPackage == null) {
            modelPackage = NumericPackage.eINSTANCE;
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
            case NumericPackage.COUNT_EXPRESSION: {
                CountExpression countExpression = (CountExpression)theEObject;
                T result = caseCountExpression(countExpression);
                if (result == null) result = caseIntegerExpression(countExpression);
                if (result == null) result = caseAggregatedExpression(countExpression);
                if (result == null) result = caseNumericExpression(countExpression);
                if (result == null) result = caseDataExpression(countExpression);
                if (result == null) result = caseExpression(countExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NumericPackage.INTEGER_ARITMETIC_EXPRESSION: {
                IntegerAritmeticExpression integerAritmeticExpression = (IntegerAritmeticExpression)theEObject;
                T result = caseIntegerAritmeticExpression(integerAritmeticExpression);
                if (result == null) result = caseIntegerExpression(integerAritmeticExpression);
                if (result == null) result = caseNumericExpression(integerAritmeticExpression);
                if (result == null) result = caseDataExpression(integerAritmeticExpression);
                if (result == null) result = caseExpression(integerAritmeticExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NumericPackage.DECIMAL_ARITMETIC_EXPRESSION: {
                DecimalAritmeticExpression decimalAritmeticExpression = (DecimalAritmeticExpression)theEObject;
                T result = caseDecimalAritmeticExpression(decimalAritmeticExpression);
                if (result == null) result = caseDecimalExpression(decimalAritmeticExpression);
                if (result == null) result = caseNumericExpression(decimalAritmeticExpression);
                if (result == null) result = caseDataExpression(decimalAritmeticExpression);
                if (result == null) result = caseExpression(decimalAritmeticExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NumericPackage.INTEGER_OPPOSITE_EXPRESSION: {
                IntegerOppositeExpression integerOppositeExpression = (IntegerOppositeExpression)theEObject;
                T result = caseIntegerOppositeExpression(integerOppositeExpression);
                if (result == null) result = caseIntegerExpression(integerOppositeExpression);
                if (result == null) result = caseNumericExpression(integerOppositeExpression);
                if (result == null) result = caseDataExpression(integerOppositeExpression);
                if (result == null) result = caseExpression(integerOppositeExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NumericPackage.DECIMAL_OPPOSITE_EXPRESSION: {
                DecimalOppositeExpression decimalOppositeExpression = (DecimalOppositeExpression)theEObject;
                T result = caseDecimalOppositeExpression(decimalOppositeExpression);
                if (result == null) result = caseDecimalExpression(decimalOppositeExpression);
                if (result == null) result = caseNumericExpression(decimalOppositeExpression);
                if (result == null) result = caseDataExpression(decimalOppositeExpression);
                if (result == null) result = caseExpression(decimalOppositeExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NumericPackage.INTEGER_ATTRIBUTE: {
                IntegerAttribute integerAttribute = (IntegerAttribute)theEObject;
                T result = caseIntegerAttribute(integerAttribute);
                if (result == null) result = caseIntegerExpression(integerAttribute);
                if (result == null) result = caseAttributeSelector(integerAttribute);
                if (result == null) result = caseNumericExpression(integerAttribute);
                if (result == null) result = caseDataExpression(integerAttribute);
                if (result == null) result = caseExpression(integerAttribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NumericPackage.DECIMAL_ATTRIBUTE: {
                DecimalAttribute decimalAttribute = (DecimalAttribute)theEObject;
                T result = caseDecimalAttribute(decimalAttribute);
                if (result == null) result = caseDecimalExpression(decimalAttribute);
                if (result == null) result = caseAttributeSelector(decimalAttribute);
                if (result == null) result = caseNumericExpression(decimalAttribute);
                if (result == null) result = caseDataExpression(decimalAttribute);
                if (result == null) result = caseExpression(decimalAttribute);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NumericPackage.INTEGER_AGGREGATED_EXPRESSION: {
                IntegerAggregatedExpression integerAggregatedExpression = (IntegerAggregatedExpression)theEObject;
                T result = caseIntegerAggregatedExpression(integerAggregatedExpression);
                if (result == null) result = caseIntegerExpression(integerAggregatedExpression);
                if (result == null) result = caseAggregatedExpression(integerAggregatedExpression);
                if (result == null) result = caseNumericExpression(integerAggregatedExpression);
                if (result == null) result = caseDataExpression(integerAggregatedExpression);
                if (result == null) result = caseExpression(integerAggregatedExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NumericPackage.INTEGER_VARIABLE_REFERENCE: {
                IntegerVariableReference integerVariableReference = (IntegerVariableReference)theEObject;
                T result = caseIntegerVariableReference(integerVariableReference);
                if (result == null) result = caseIntegerExpression(integerVariableReference);
                if (result == null) result = caseVariableReference(integerVariableReference);
                if (result == null) result = caseNumericExpression(integerVariableReference);
                if (result == null) result = caseDataExpression(integerVariableReference);
                if (result == null) result = caseExpression(integerVariableReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NumericPackage.DECIMAL_VARIABLE_REFERENCE: {
                DecimalVariableReference decimalVariableReference = (DecimalVariableReference)theEObject;
                T result = caseDecimalVariableReference(decimalVariableReference);
                if (result == null) result = caseDecimalExpression(decimalVariableReference);
                if (result == null) result = caseVariableReference(decimalVariableReference);
                if (result == null) result = caseNumericExpression(decimalVariableReference);
                if (result == null) result = caseDataExpression(decimalVariableReference);
                if (result == null) result = caseExpression(decimalVariableReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NumericPackage.DECIMAL_AGGREGATED_EXPRESSION: {
                DecimalAggregatedExpression decimalAggregatedExpression = (DecimalAggregatedExpression)theEObject;
                T result = caseDecimalAggregatedExpression(decimalAggregatedExpression);
                if (result == null) result = caseDecimalExpression(decimalAggregatedExpression);
                if (result == null) result = caseAggregatedExpression(decimalAggregatedExpression);
                if (result == null) result = caseNumericExpression(decimalAggregatedExpression);
                if (result == null) result = caseDataExpression(decimalAggregatedExpression);
                if (result == null) result = caseExpression(decimalAggregatedExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NumericPackage.ROUND_EXPRESSION: {
                RoundExpression roundExpression = (RoundExpression)theEObject;
                T result = caseRoundExpression(roundExpression);
                if (result == null) result = caseIntegerExpression(roundExpression);
                if (result == null) result = caseNumericExpression(roundExpression);
                if (result == null) result = caseDataExpression(roundExpression);
                if (result == null) result = caseExpression(roundExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NumericPackage.INTEGER_SWITCH_EXPRESSION: {
                IntegerSwitchExpression integerSwitchExpression = (IntegerSwitchExpression)theEObject;
                T result = caseIntegerSwitchExpression(integerSwitchExpression);
                if (result == null) result = caseSwitchExpression(integerSwitchExpression);
                if (result == null) result = caseIntegerExpression(integerSwitchExpression);
                if (result == null) result = caseNumericExpression(integerSwitchExpression);
                if (result == null) result = caseDataExpression(integerSwitchExpression);
                if (result == null) result = caseExpression(integerSwitchExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case NumericPackage.DECIMAL_SWITCH_EXPRESSION: {
                DecimalSwitchExpression decimalSwitchExpression = (DecimalSwitchExpression)theEObject;
                T result = caseDecimalSwitchExpression(decimalSwitchExpression);
                if (result == null) result = caseSwitchExpression(decimalSwitchExpression);
                if (result == null) result = caseDecimalExpression(decimalSwitchExpression);
                if (result == null) result = caseNumericExpression(decimalSwitchExpression);
                if (result == null) result = caseDataExpression(decimalSwitchExpression);
                if (result == null) result = caseExpression(decimalSwitchExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Count Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Count Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCountExpression(CountExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Integer Aritmetic Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Integer Aritmetic Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntegerAritmeticExpression(IntegerAritmeticExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Decimal Aritmetic Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Decimal Aritmetic Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDecimalAritmeticExpression(DecimalAritmeticExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Integer Opposite Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Integer Opposite Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntegerOppositeExpression(IntegerOppositeExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Decimal Opposite Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Decimal Opposite Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDecimalOppositeExpression(DecimalOppositeExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Integer Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Integer Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntegerAttribute(IntegerAttribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Decimal Attribute</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Decimal Attribute</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDecimalAttribute(DecimalAttribute object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Integer Aggregated Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Integer Aggregated Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntegerAggregatedExpression(IntegerAggregatedExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Integer Variable Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Integer Variable Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntegerVariableReference(IntegerVariableReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Decimal Variable Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Decimal Variable Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDecimalVariableReference(DecimalVariableReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Decimal Aggregated Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Decimal Aggregated Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDecimalAggregatedExpression(DecimalAggregatedExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Round Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Round Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRoundExpression(RoundExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Integer Switch Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Integer Switch Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIntegerSwitchExpression(IntegerSwitchExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Decimal Switch Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Decimal Switch Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseDecimalSwitchExpression(DecimalSwitchExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseVariableReference(VariableReference object) {
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

} //NumericSwitch
