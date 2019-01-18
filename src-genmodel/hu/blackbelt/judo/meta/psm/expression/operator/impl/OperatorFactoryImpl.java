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
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StringComparator createStringComparatorFromString(EDataType eDataType, String initialValue) {
        StringComparator result = StringComparator.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertStringComparatorToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogicalOperator createLogicalOperatorFromString(EDataType eDataType, String initialValue) {
        LogicalOperator result = LogicalOperator.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLogicalOperatorToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectSelector createObjectSelectorFromString(EDataType eDataType, String initialValue) {
        ObjectSelector result = ObjectSelector.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertObjectSelectorToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntegerOperator createIntegerOperatorFromString(EDataType eDataType, String initialValue) {
        IntegerOperator result = IntegerOperator.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIntegerOperatorToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DecimalOperator createDecimalOperatorFromString(EDataType eDataType, String initialValue) {
        DecimalOperator result = DecimalOperator.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDecimalOperatorToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntegerComparator createIntegerComparatorFromString(EDataType eDataType, String initialValue) {
        IntegerComparator result = IntegerComparator.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIntegerComparatorToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DecimalComparator createDecimalComparatorFromString(EDataType eDataType, String initialValue) {
        DecimalComparator result = DecimalComparator.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDecimalComparatorToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IntegerAggregator createIntegerAggregatorFromString(EDataType eDataType, String initialValue) {
        IntegerAggregator result = IntegerAggregator.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertIntegerAggregatorToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DecimalAggregator createDecimalAggregatorFromString(EDataType eDataType, String initialValue) {
        DecimalAggregator result = DecimalAggregator.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDecimalAggregatorToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectComparator createObjectComparatorFromString(EDataType eDataType, String initialValue) {
        ObjectComparator result = ObjectComparator.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertObjectComparatorToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
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
