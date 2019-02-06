/**
 */
package hu.blackbelt.judo.meta.psm.expression.operator.impl;

import hu.blackbelt.judo.meta.psm.expression.operator.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperatorFactoryImpl extends EFactoryImpl implements OperatorFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OperatorFactory init() {
		try {
			OperatorFactory theOperatorFactory = (OperatorFactory)EPackage.Registry.INSTANCE.getEFactory(OperatorPackage.eNS_URI);
			if (theOperatorFactory != null) {
				return theOperatorFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OperatorFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OperatorPackage.STRING_COMPARATOR:
				return createStringComparatorFromString(eDataType, initialValue);
			case OperatorPackage.LOGICAL_OPERATOR:
				return createLogicalOperatorFromString(eDataType, initialValue);
			case OperatorPackage.OBJECT_SELECTOR:
				return createObjectSelectorFromString(eDataType, initialValue);
			case OperatorPackage.INTEGER_OPERATOR:
				return createIntegerOperatorFromString(eDataType, initialValue);
			case OperatorPackage.DECIMAL_OPERATOR:
				return createDecimalOperatorFromString(eDataType, initialValue);
			case OperatorPackage.INTEGER_COMPARATOR:
				return createIntegerComparatorFromString(eDataType, initialValue);
			case OperatorPackage.DECIMAL_COMPARATOR:
				return createDecimalComparatorFromString(eDataType, initialValue);
			case OperatorPackage.INTEGER_AGGREGATOR:
				return createIntegerAggregatorFromString(eDataType, initialValue);
			case OperatorPackage.DECIMAL_AGGREGATOR:
				return createDecimalAggregatorFromString(eDataType, initialValue);
			case OperatorPackage.OBJECT_COMPARATOR:
				return createObjectComparatorFromString(eDataType, initialValue);
			case OperatorPackage.TIMESTAMP_DURATION_OPERATOR:
				return createTimestampDurationOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OperatorPackage.STRING_COMPARATOR:
				return convertStringComparatorToString(eDataType, instanceValue);
			case OperatorPackage.LOGICAL_OPERATOR:
				return convertLogicalOperatorToString(eDataType, instanceValue);
			case OperatorPackage.OBJECT_SELECTOR:
				return convertObjectSelectorToString(eDataType, instanceValue);
			case OperatorPackage.INTEGER_OPERATOR:
				return convertIntegerOperatorToString(eDataType, instanceValue);
			case OperatorPackage.DECIMAL_OPERATOR:
				return convertDecimalOperatorToString(eDataType, instanceValue);
			case OperatorPackage.INTEGER_COMPARATOR:
				return convertIntegerComparatorToString(eDataType, instanceValue);
			case OperatorPackage.DECIMAL_COMPARATOR:
				return convertDecimalComparatorToString(eDataType, instanceValue);
			case OperatorPackage.INTEGER_AGGREGATOR:
				return convertIntegerAggregatorToString(eDataType, instanceValue);
			case OperatorPackage.DECIMAL_AGGREGATOR:
				return convertDecimalAggregatorToString(eDataType, instanceValue);
			case OperatorPackage.OBJECT_COMPARATOR:
				return convertObjectComparatorToString(eDataType, instanceValue);
			case OperatorPackage.TIMESTAMP_DURATION_OPERATOR:
				return convertTimestampDurationOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringComparator createStringComparator(String literal) {
		StringComparator result = StringComparator.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + OperatorPackage.Literals.STRING_COMPARATOR.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringComparator createStringComparatorFromString(EDataType eDataType, String initialValue) {
		return createStringComparator(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringComparator(StringComparator instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStringComparatorToString(EDataType eDataType, Object instanceValue) {
		return convertStringComparator((StringComparator)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperator createLogicalOperator(String literal) {
		LogicalOperator result = LogicalOperator.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + OperatorPackage.Literals.LOGICAL_OPERATOR.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperator createLogicalOperatorFromString(EDataType eDataType, String initialValue) {
		return createLogicalOperator(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperator(LogicalOperator instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperatorToString(EDataType eDataType, Object instanceValue) {
		return convertLogicalOperator((LogicalOperator)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSelector createObjectSelector(String literal) {
		ObjectSelector result = ObjectSelector.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + OperatorPackage.Literals.OBJECT_SELECTOR.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectSelector createObjectSelectorFromString(EDataType eDataType, String initialValue) {
		return createObjectSelector(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectSelector(ObjectSelector instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectSelectorToString(EDataType eDataType, Object instanceValue) {
		return convertObjectSelector((ObjectSelector)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerOperator createIntegerOperator(String literal) {
		IntegerOperator result = IntegerOperator.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + OperatorPackage.Literals.INTEGER_OPERATOR.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerOperator createIntegerOperatorFromString(EDataType eDataType, String initialValue) {
		return createIntegerOperator(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerOperator(IntegerOperator instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerOperatorToString(EDataType eDataType, Object instanceValue) {
		return convertIntegerOperator((IntegerOperator)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalOperator createDecimalOperator(String literal) {
		DecimalOperator result = DecimalOperator.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + OperatorPackage.Literals.DECIMAL_OPERATOR.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalOperator createDecimalOperatorFromString(EDataType eDataType, String initialValue) {
		return createDecimalOperator(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalOperator(DecimalOperator instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalOperatorToString(EDataType eDataType, Object instanceValue) {
		return convertDecimalOperator((DecimalOperator)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerComparator createIntegerComparator(String literal) {
		IntegerComparator result = IntegerComparator.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + OperatorPackage.Literals.INTEGER_COMPARATOR.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerComparator createIntegerComparatorFromString(EDataType eDataType, String initialValue) {
		return createIntegerComparator(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerComparator(IntegerComparator instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerComparatorToString(EDataType eDataType, Object instanceValue) {
		return convertIntegerComparator((IntegerComparator)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalComparator createDecimalComparator(String literal) {
		DecimalComparator result = DecimalComparator.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + OperatorPackage.Literals.DECIMAL_COMPARATOR.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalComparator createDecimalComparatorFromString(EDataType eDataType, String initialValue) {
		return createDecimalComparator(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalComparator(DecimalComparator instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalComparatorToString(EDataType eDataType, Object instanceValue) {
		return convertDecimalComparator((DecimalComparator)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerAggregator createIntegerAggregator(String literal) {
		IntegerAggregator result = IntegerAggregator.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + OperatorPackage.Literals.INTEGER_AGGREGATOR.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerAggregator createIntegerAggregatorFromString(EDataType eDataType, String initialValue) {
		return createIntegerAggregator(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerAggregator(IntegerAggregator instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerAggregatorToString(EDataType eDataType, Object instanceValue) {
		return convertIntegerAggregator((IntegerAggregator)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalAggregator createDecimalAggregator(String literal) {
		DecimalAggregator result = DecimalAggregator.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + OperatorPackage.Literals.DECIMAL_AGGREGATOR.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalAggregator createDecimalAggregatorFromString(EDataType eDataType, String initialValue) {
		return createDecimalAggregator(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalAggregator(DecimalAggregator instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalAggregatorToString(EDataType eDataType, Object instanceValue) {
		return convertDecimalAggregator((DecimalAggregator)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectComparator createObjectComparator(String literal) {
		ObjectComparator result = ObjectComparator.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + OperatorPackage.Literals.OBJECT_COMPARATOR.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectComparator createObjectComparatorFromString(EDataType eDataType, String initialValue) {
		return createObjectComparator(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectComparator(ObjectComparator instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectComparatorToString(EDataType eDataType, Object instanceValue) {
		return convertObjectComparator((ObjectComparator)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampDurationOperator createTimestampDurationOperator(String literal) {
		TimestampDurationOperator result = TimestampDurationOperator.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + OperatorPackage.Literals.TIMESTAMP_DURATION_OPERATOR.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampDurationOperator createTimestampDurationOperatorFromString(EDataType eDataType, String initialValue) {
		return createTimestampDurationOperator(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimestampDurationOperator(TimestampDurationOperator instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimestampDurationOperatorToString(EDataType eDataType, Object instanceValue) {
		return convertTimestampDurationOperator((TimestampDurationOperator)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorPackage getOperatorPackage() {
		return (OperatorPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OperatorPackage getPackage() {
		return OperatorPackage.eINSTANCE;
	}

} //OperatorFactoryImpl
