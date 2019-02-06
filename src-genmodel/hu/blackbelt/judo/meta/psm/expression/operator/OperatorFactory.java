/**
 */
package hu.blackbelt.judo.meta.psm.expression.operator;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.operator.OperatorPackage
 * @generated
 */
public interface OperatorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OperatorFactory eINSTANCE = hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorFactoryImpl.init();

	/**
	 * Returns an instance of data type '<em>String Comparator</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	StringComparator createStringComparator(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>String Comparator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertStringComparator(StringComparator instanceValue);

	/**
	 * Returns an instance of data type '<em>Logical Operator</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	LogicalOperator createLogicalOperator(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Logical Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertLogicalOperator(LogicalOperator instanceValue);

	/**
	 * Returns an instance of data type '<em>Object Selector</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	ObjectSelector createObjectSelector(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Object Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertObjectSelector(ObjectSelector instanceValue);

	/**
	 * Returns an instance of data type '<em>Integer Operator</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	IntegerOperator createIntegerOperator(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Integer Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertIntegerOperator(IntegerOperator instanceValue);

	/**
	 * Returns an instance of data type '<em>Decimal Operator</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	DecimalOperator createDecimalOperator(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Decimal Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertDecimalOperator(DecimalOperator instanceValue);

	/**
	 * Returns an instance of data type '<em>Integer Comparator</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	IntegerComparator createIntegerComparator(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Integer Comparator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertIntegerComparator(IntegerComparator instanceValue);

	/**
	 * Returns an instance of data type '<em>Decimal Comparator</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	DecimalComparator createDecimalComparator(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Decimal Comparator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertDecimalComparator(DecimalComparator instanceValue);

	/**
	 * Returns an instance of data type '<em>Integer Aggregator</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	IntegerAggregator createIntegerAggregator(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Integer Aggregator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertIntegerAggregator(IntegerAggregator instanceValue);

	/**
	 * Returns an instance of data type '<em>Decimal Aggregator</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	DecimalAggregator createDecimalAggregator(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Decimal Aggregator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertDecimalAggregator(DecimalAggregator instanceValue);

	/**
	 * Returns an instance of data type '<em>Object Comparator</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	ObjectComparator createObjectComparator(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Object Comparator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertObjectComparator(ObjectComparator instanceValue);

	/**
	 * Returns an instance of data type '<em>Timestamp Duration Operator</em>' corresponding the given literal.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal a literal of the data type.
	 * @return a new instance value of the data type.
	 * @generated
	 */
	TimestampDurationOperator createTimestampDurationOperator(String literal);

	/**
	 * Returns a literal representation of an instance of data type '<em>Timestamp Duration Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param instanceValue an instance value of the data type.
	 * @return a literal representation of the instance value.
	 * @generated
	 */
	String convertTimestampDurationOperator(TimestampDurationOperator instanceValue);

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OperatorPackage getOperatorPackage();

} //OperatorFactory
