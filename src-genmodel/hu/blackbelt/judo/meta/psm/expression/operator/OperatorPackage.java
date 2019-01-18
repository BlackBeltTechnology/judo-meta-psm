/**
 */
package hu.blackbelt.judo.meta.psm.expression.operator;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.operator.OperatorFactory
 * @model kind="package"
 * @generated
 */
public interface OperatorPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "operator";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://blackbelt.hu/judo/meta/expression/operator";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "op";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    OperatorPackage eINSTANCE = hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl.init();

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.StringComparator <em>String Comparator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.operator.StringComparator
     * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getStringComparator()
     * @generated
     */
    int STRING_COMPARATOR = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.LogicalOperator <em>Logical Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.operator.LogicalOperator
     * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getLogicalOperator()
     * @generated
     */
    int LOGICAL_OPERATOR = 1;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.ObjectSelector <em>Object Selector</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.operator.ObjectSelector
     * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getObjectSelector()
     * @generated
     */
    int OBJECT_SELECTOR = 2;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.IntegerOperator <em>Integer Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.operator.IntegerOperator
     * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getIntegerOperator()
     * @generated
     */
    int INTEGER_OPERATOR = 3;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.DecimalOperator <em>Decimal Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.operator.DecimalOperator
     * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getDecimalOperator()
     * @generated
     */
    int DECIMAL_OPERATOR = 4;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.IntegerComparator <em>Integer Comparator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.operator.IntegerComparator
     * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getIntegerComparator()
     * @generated
     */
    int INTEGER_COMPARATOR = 5;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.DecimalComparator <em>Decimal Comparator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.operator.DecimalComparator
     * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getDecimalComparator()
     * @generated
     */
    int DECIMAL_COMPARATOR = 6;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.IntegerAggregator <em>Integer Aggregator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.operator.IntegerAggregator
     * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getIntegerAggregator()
     * @generated
     */
    int INTEGER_AGGREGATOR = 7;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.DecimalAggregator <em>Decimal Aggregator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.operator.DecimalAggregator
     * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getDecimalAggregator()
     * @generated
     */
    int DECIMAL_AGGREGATOR = 8;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.ObjectComparator <em>Object Comparator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.expression.operator.ObjectComparator
     * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getObjectComparator()
     * @generated
     */
    int OBJECT_COMPARATOR = 9;


    /**
     * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.expression.operator.StringComparator <em>String Comparator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>String Comparator</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.StringComparator
     * @generated
     */
    EEnum getStringComparator();

    /**
     * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.expression.operator.LogicalOperator <em>Logical Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Logical Operator</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.LogicalOperator
     * @generated
     */
    EEnum getLogicalOperator();

    /**
     * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.expression.operator.ObjectSelector <em>Object Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Object Selector</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.ObjectSelector
     * @generated
     */
    EEnum getObjectSelector();

    /**
     * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.expression.operator.IntegerOperator <em>Integer Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Integer Operator</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.IntegerOperator
     * @generated
     */
    EEnum getIntegerOperator();

    /**
     * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.expression.operator.DecimalOperator <em>Decimal Operator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Decimal Operator</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.DecimalOperator
     * @generated
     */
    EEnum getDecimalOperator();

    /**
     * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.expression.operator.IntegerComparator <em>Integer Comparator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Integer Comparator</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.IntegerComparator
     * @generated
     */
    EEnum getIntegerComparator();

    /**
     * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.expression.operator.DecimalComparator <em>Decimal Comparator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Decimal Comparator</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.DecimalComparator
     * @generated
     */
    EEnum getDecimalComparator();

    /**
     * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.expression.operator.IntegerAggregator <em>Integer Aggregator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Integer Aggregator</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.IntegerAggregator
     * @generated
     */
    EEnum getIntegerAggregator();

    /**
     * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.expression.operator.DecimalAggregator <em>Decimal Aggregator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Decimal Aggregator</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.DecimalAggregator
     * @generated
     */
    EEnum getDecimalAggregator();

    /**
     * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.expression.operator.ObjectComparator <em>Object Comparator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Object Comparator</em>'.
     * @see hu.blackbelt.judo.meta.psm.expression.operator.ObjectComparator
     * @generated
     */
    EEnum getObjectComparator();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    OperatorFactory getOperatorFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.StringComparator <em>String Comparator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.operator.StringComparator
         * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getStringComparator()
         * @generated
         */
        EEnum STRING_COMPARATOR = eINSTANCE.getStringComparator();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.LogicalOperator <em>Logical Operator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.operator.LogicalOperator
         * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getLogicalOperator()
         * @generated
         */
        EEnum LOGICAL_OPERATOR = eINSTANCE.getLogicalOperator();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.ObjectSelector <em>Object Selector</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.operator.ObjectSelector
         * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getObjectSelector()
         * @generated
         */
        EEnum OBJECT_SELECTOR = eINSTANCE.getObjectSelector();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.IntegerOperator <em>Integer Operator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.operator.IntegerOperator
         * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getIntegerOperator()
         * @generated
         */
        EEnum INTEGER_OPERATOR = eINSTANCE.getIntegerOperator();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.DecimalOperator <em>Decimal Operator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.operator.DecimalOperator
         * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getDecimalOperator()
         * @generated
         */
        EEnum DECIMAL_OPERATOR = eINSTANCE.getDecimalOperator();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.IntegerComparator <em>Integer Comparator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.operator.IntegerComparator
         * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getIntegerComparator()
         * @generated
         */
        EEnum INTEGER_COMPARATOR = eINSTANCE.getIntegerComparator();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.DecimalComparator <em>Decimal Comparator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.operator.DecimalComparator
         * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getDecimalComparator()
         * @generated
         */
        EEnum DECIMAL_COMPARATOR = eINSTANCE.getDecimalComparator();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.IntegerAggregator <em>Integer Aggregator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.operator.IntegerAggregator
         * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getIntegerAggregator()
         * @generated
         */
        EEnum INTEGER_AGGREGATOR = eINSTANCE.getIntegerAggregator();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.DecimalAggregator <em>Decimal Aggregator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.operator.DecimalAggregator
         * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getDecimalAggregator()
         * @generated
         */
        EEnum DECIMAL_AGGREGATOR = eINSTANCE.getDecimalAggregator();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.operator.ObjectComparator <em>Object Comparator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.expression.operator.ObjectComparator
         * @see hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl#getObjectComparator()
         * @generated
         */
        EEnum OBJECT_COMPARATOR = eINSTANCE.getObjectComparator();

    }

} //OperatorPackage
