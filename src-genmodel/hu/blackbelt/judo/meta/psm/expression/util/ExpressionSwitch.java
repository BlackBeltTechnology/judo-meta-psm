/**
 */
package hu.blackbelt.judo.meta.psm.expression.util;

import hu.blackbelt.judo.meta.psm.expression.*;

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
 * @see hu.blackbelt.judo.meta.psm.expression.ExpressionPackage
 * @generated
 */
public class ExpressionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpressionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionSwitch() {
		if (modelPackage == null) {
			modelPackage = ExpressionPackage.eINSTANCE;
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
			case ExpressionPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.ELEMENT_NAME: {
				ElementName elementName = (ElementName)theEObject;
				T result = caseElementName(elementName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.NUMERIC_EXPRESSION: {
				NumericExpression numericExpression = (NumericExpression)theEObject;
				T result = caseNumericExpression(numericExpression);
				if (result == null) result = caseDataExpression(numericExpression);
				if (result == null) result = caseExpression(numericExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.LOGICAL_EXPRESSION: {
				LogicalExpression logicalExpression = (LogicalExpression)theEObject;
				T result = caseLogicalExpression(logicalExpression);
				if (result == null) result = caseDataExpression(logicalExpression);
				if (result == null) result = caseExpression(logicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.STRING_EXPRESSION: {
				StringExpression stringExpression = (StringExpression)theEObject;
				T result = caseStringExpression(stringExpression);
				if (result == null) result = caseDataExpression(stringExpression);
				if (result == null) result = caseExpression(stringExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.ENUMERATION_EXPRESSION: {
				EnumerationExpression enumerationExpression = (EnumerationExpression)theEObject;
				T result = caseEnumerationExpression(enumerationExpression);
				if (result == null) result = caseDataExpression(enumerationExpression);
				if (result == null) result = caseExpression(enumerationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.OBJECT_EXPRESSION: {
				ObjectExpression objectExpression = (ObjectExpression)theEObject;
				T result = caseObjectExpression(objectExpression);
				if (result == null) result = caseReferenceExpression(objectExpression);
				if (result == null) result = caseExpression(objectExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.COLLECTION_EXPRESSION: {
				CollectionExpression collectionExpression = (CollectionExpression)theEObject;
				T result = caseCollectionExpression(collectionExpression);
				if (result == null) result = caseReferenceExpression(collectionExpression);
				if (result == null) result = caseExpression(collectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.ATTRIBUTE_SELECTOR: {
				AttributeSelector attributeSelector = (AttributeSelector)theEObject;
				T result = caseAttributeSelector(attributeSelector);
				if (result == null) result = caseExpression(attributeSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.VARIABLE_REFERENCE: {
				VariableReference variableReference = (VariableReference)theEObject;
				T result = caseVariableReference(variableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.INTEGER_EXPRESSION: {
				IntegerExpression integerExpression = (IntegerExpression)theEObject;
				T result = caseIntegerExpression(integerExpression);
				if (result == null) result = caseNumericExpression(integerExpression);
				if (result == null) result = caseDataExpression(integerExpression);
				if (result == null) result = caseExpression(integerExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.DECIMAL_EXPRESSION: {
				DecimalExpression decimalExpression = (DecimalExpression)theEObject;
				T result = caseDecimalExpression(decimalExpression);
				if (result == null) result = caseNumericExpression(decimalExpression);
				if (result == null) result = caseDataExpression(decimalExpression);
				if (result == null) result = caseExpression(decimalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.ORDERED_COLLECTION_EXPRESSION: {
				OrderedCollectionExpression orderedCollectionExpression = (OrderedCollectionExpression)theEObject;
				T result = caseOrderedCollectionExpression(orderedCollectionExpression);
				if (result == null) result = caseCollectionExpression(orderedCollectionExpression);
				if (result == null) result = caseReferenceExpression(orderedCollectionExpression);
				if (result == null) result = caseExpression(orderedCollectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.DATA_EXPRESSION: {
				DataExpression dataExpression = (DataExpression)theEObject;
				T result = caseDataExpression(dataExpression);
				if (result == null) result = caseExpression(dataExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.NAVIGATION_EXPRESSION: {
				NavigationExpression navigationExpression = (NavigationExpression)theEObject;
				T result = caseNavigationExpression(navigationExpression);
				if (result == null) result = caseExpression(navigationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.SWITCH_EXPRESSION: {
				SwitchExpression switchExpression = (SwitchExpression)theEObject;
				T result = caseSwitchExpression(switchExpression);
				if (result == null) result = caseExpression(switchExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.SWITCH_CASE: {
				SwitchCase switchCase = (SwitchCase)theEObject;
				T result = caseSwitchCase(switchCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.AGGREGATED_EXPRESSION: {
				AggregatedExpression aggregatedExpression = (AggregatedExpression)theEObject;
				T result = caseAggregatedExpression(aggregatedExpression);
				if (result == null) result = caseExpression(aggregatedExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.REFERENCE_EXPRESSION: {
				ReferenceExpression referenceExpression = (ReferenceExpression)theEObject;
				T result = caseReferenceExpression(referenceExpression);
				if (result == null) result = caseExpression(referenceExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.REFERENCE_SELECTOR: {
				ReferenceSelector referenceSelector = (ReferenceSelector)theEObject;
				T result = caseReferenceSelector(referenceSelector);
				if (result == null) result = caseNavigationExpression(referenceSelector);
				if (result == null) result = caseExpression(referenceSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.CUSTOM_EXPRESSION: {
				CustomExpression customExpression = (CustomExpression)theEObject;
				T result = caseCustomExpression(customExpression);
				if (result == null) result = caseDataExpression(customExpression);
				if (result == null) result = caseExpression(customExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.DATE_EXPRESSION: {
				DateExpression dateExpression = (DateExpression)theEObject;
				T result = caseDateExpression(dateExpression);
				if (result == null) result = caseDataExpression(dateExpression);
				if (result == null) result = caseExpression(dateExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.TIMESTAMP_EXPRESSION: {
				TimestampExpression timestampExpression = (TimestampExpression)theEObject;
				T result = caseTimestampExpression(timestampExpression);
				if (result == null) result = caseDataExpression(timestampExpression);
				if (result == null) result = caseExpression(timestampExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.TYPE_NAME: {
				TypeName typeName = (TypeName)theEObject;
				T result = caseTypeName(typeName);
				if (result == null) result = caseElementName(typeName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.MEASURE_NAME: {
				MeasureName measureName = (MeasureName)theEObject;
				T result = caseMeasureName(measureName);
				if (result == null) result = caseElementName(measureName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.WINDOWING_EXPRESSION: {
				WindowingExpression windowingExpression = (WindowingExpression)theEObject;
				T result = caseWindowingExpression(windowingExpression);
				if (result == null) result = caseExpression(windowingExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExpressionPackage.FILTERING_EXPRESSION: {
				FilteringExpression filteringExpression = (FilteringExpression)theEObject;
				T result = caseFilteringExpression(filteringExpression);
				if (result == null) result = caseExpression(filteringExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Element Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementName(ElementName object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionExpression(CollectionExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Collection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Collection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedCollectionExpression(OrderedCollectionExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationExpression(NavigationExpression object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Switch Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchCase(SwitchCase object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Reference Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceSelector(ReferenceSelector object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Type Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeName(TypeName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Measure Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Measure Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMeasureName(MeasureName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Windowing Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Windowing Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindowingExpression(WindowingExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtering Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtering Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilteringExpression(FilteringExpression object) {
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

} //ExpressionSwitch
