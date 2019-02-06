/**
 */
package hu.blackbelt.judo.meta.psm.expression.constant;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantFactory
 * @model kind="package"
 * @generated
 */
public interface ConstantPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "constant";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/expression/constant";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "const";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConstantPackage eINSTANCE = hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 0;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.NumberImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.IntegerConstantImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getIntegerConstant()
	 * @generated
	 */
	int INTEGER_CONSTANT = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT__VALUE = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_CONSTANT_OPERATION_COUNT = NUMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.DecimalConstantImpl <em>Decimal Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.DecimalConstantImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getDecimalConstant()
	 * @generated
	 */
	int DECIMAL_CONSTANT = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_CONSTANT__VALUE = NUMBER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decimal Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_CONSTANT_FEATURE_COUNT = NUMBER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decimal Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_CONSTANT_OPERATION_COUNT = NUMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.BooleanConstantImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getBooleanConstant()
	 * @generated
	 */
	int BOOLEAN_CONSTANT = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.StringConstantImpl <em>String Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.StringConstantImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getStringConstant()
	 * @generated
	 */
	int STRING_CONSTANT = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.LiteralImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.InstanceImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 7;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__ELEMENT_NAME = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.CustomDataImpl <em>Custom Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.CustomDataImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getCustomData()
	 * @generated
	 */
	int CUSTOM_DATA = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DATA__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DATA_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Custom Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_DATA_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.MeasuredDecimalImpl <em>Measured Decimal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.MeasuredDecimalImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getMeasuredDecimal()
	 * @generated
	 */
	int MEASURED_DECIMAL = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_DECIMAL__VALUE = DECIMAL_CONSTANT__VALUE;

	/**
	 * The feature id for the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_DECIMAL__UNIT_NAME = DECIMAL_CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_DECIMAL__MEASURE = DECIMAL_CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Measured Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_DECIMAL_FEATURE_COUNT = DECIMAL_CONSTANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Measured Decimal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_DECIMAL_OPERATION_COUNT = DECIMAL_CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.MeasuredIntegerImpl <em>Measured Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.MeasuredIntegerImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getMeasuredInteger()
	 * @generated
	 */
	int MEASURED_INTEGER = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_INTEGER__VALUE = INTEGER_CONSTANT__VALUE;

	/**
	 * The feature id for the '<em><b>Unit Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_INTEGER__UNIT_NAME = INTEGER_CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Measure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_INTEGER__MEASURE = INTEGER_CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Measured Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_INTEGER_FEATURE_COUNT = INTEGER_CONSTANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Measured Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURED_INTEGER_OPERATION_COUNT = INTEGER_CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.DateConstantImpl <em>Date Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.DateConstantImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getDateConstant()
	 * @generated
	 */
	int DATE_CONSTANT = 11;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Date Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Date Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.TimestampConstantImpl <em>Timestamp Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.TimestampConstantImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getTimestampConstant()
	 * @generated
	 */
	int TIMESTAMP_CONSTANT = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_CONSTANT__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timestamp Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_CONSTANT_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Timestamp Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_CONSTANT_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.constant.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.constant.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.constant.IntegerConstant <em>Integer Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Constant</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.IntegerConstant
	 * @generated
	 */
	EClass getIntegerConstant();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.constant.IntegerConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.IntegerConstant#getValue()
	 * @see #getIntegerConstant()
	 * @generated
	 */
	EAttribute getIntegerConstant_Value();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.constant.DecimalConstant <em>Decimal Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Constant</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.DecimalConstant
	 * @generated
	 */
	EClass getDecimalConstant();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.constant.DecimalConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.DecimalConstant#getValue()
	 * @see #getDecimalConstant()
	 * @generated
	 */
	EAttribute getDecimalConstant_Value();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.constant.BooleanConstant <em>Boolean Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Constant</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.BooleanConstant
	 * @generated
	 */
	EClass getBooleanConstant();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.constant.BooleanConstant#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.BooleanConstant#isValue()
	 * @see #getBooleanConstant()
	 * @generated
	 */
	EAttribute getBooleanConstant_Value();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.constant.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Constant</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.StringConstant
	 * @generated
	 */
	EClass getStringConstant();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.constant.StringConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.StringConstant#getValue()
	 * @see #getStringConstant()
	 * @generated
	 */
	EAttribute getStringConstant_Value();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.constant.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.constant.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.constant.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.constant.Instance#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.Instance#getElementName()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_ElementName();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.constant.CustomData <em>Custom Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Data</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.CustomData
	 * @generated
	 */
	EClass getCustomData();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.constant.CustomData#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.CustomData#getValue()
	 * @see #getCustomData()
	 * @generated
	 */
	EAttribute getCustomData_Value();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.constant.MeasuredDecimal <em>Measured Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measured Decimal</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.MeasuredDecimal
	 * @generated
	 */
	EClass getMeasuredDecimal();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.constant.MeasuredDecimal#getUnitName <em>Unit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.MeasuredDecimal#getUnitName()
	 * @see #getMeasuredDecimal()
	 * @generated
	 */
	EAttribute getMeasuredDecimal_UnitName();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.constant.MeasuredDecimal#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measure</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.MeasuredDecimal#getMeasure()
	 * @see #getMeasuredDecimal()
	 * @generated
	 */
	EReference getMeasuredDecimal_Measure();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.constant.MeasuredInteger <em>Measured Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measured Integer</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.MeasuredInteger
	 * @generated
	 */
	EClass getMeasuredInteger();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.constant.MeasuredInteger#getUnitName <em>Unit Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.MeasuredInteger#getUnitName()
	 * @see #getMeasuredInteger()
	 * @generated
	 */
	EAttribute getMeasuredInteger_UnitName();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.constant.MeasuredInteger#getMeasure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Measure</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.MeasuredInteger#getMeasure()
	 * @see #getMeasuredInteger()
	 * @generated
	 */
	EReference getMeasuredInteger_Measure();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.constant.DateConstant <em>Date Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Constant</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.DateConstant
	 * @generated
	 */
	EClass getDateConstant();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.constant.DateConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.DateConstant#getValue()
	 * @see #getDateConstant()
	 * @generated
	 */
	EAttribute getDateConstant_Value();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.constant.TimestampConstant <em>Timestamp Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timestamp Constant</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.TimestampConstant
	 * @generated
	 */
	EClass getTimestampConstant();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.constant.TimestampConstant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.TimestampConstant#getValue()
	 * @see #getTimestampConstant()
	 * @generated
	 */
	EAttribute getTimestampConstant_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConstantFactory getConstantFactory();

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
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.NumberImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.IntegerConstantImpl <em>Integer Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.IntegerConstantImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getIntegerConstant()
		 * @generated
		 */
		EClass INTEGER_CONSTANT = eINSTANCE.getIntegerConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_CONSTANT__VALUE = eINSTANCE.getIntegerConstant_Value();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.DecimalConstantImpl <em>Decimal Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.DecimalConstantImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getDecimalConstant()
		 * @generated
		 */
		EClass DECIMAL_CONSTANT = eINSTANCE.getDecimalConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_CONSTANT__VALUE = eINSTANCE.getDecimalConstant_Value();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.BooleanConstantImpl <em>Boolean Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.BooleanConstantImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getBooleanConstant()
		 * @generated
		 */
		EClass BOOLEAN_CONSTANT = eINSTANCE.getBooleanConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_CONSTANT__VALUE = eINSTANCE.getBooleanConstant_Value();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.StringConstantImpl <em>String Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.StringConstantImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getStringConstant()
		 * @generated
		 */
		EClass STRING_CONSTANT = eINSTANCE.getStringConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_CONSTANT__VALUE = eINSTANCE.getStringConstant_Value();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.LiteralImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.InstanceImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__ELEMENT_NAME = eINSTANCE.getInstance_ElementName();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.CustomDataImpl <em>Custom Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.CustomDataImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getCustomData()
		 * @generated
		 */
		EClass CUSTOM_DATA = eINSTANCE.getCustomData();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_DATA__VALUE = eINSTANCE.getCustomData_Value();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.MeasuredDecimalImpl <em>Measured Decimal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.MeasuredDecimalImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getMeasuredDecimal()
		 * @generated
		 */
		EClass MEASURED_DECIMAL = eINSTANCE.getMeasuredDecimal();

		/**
		 * The meta object literal for the '<em><b>Unit Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURED_DECIMAL__UNIT_NAME = eINSTANCE.getMeasuredDecimal_UnitName();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURED_DECIMAL__MEASURE = eINSTANCE.getMeasuredDecimal_Measure();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.MeasuredIntegerImpl <em>Measured Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.MeasuredIntegerImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getMeasuredInteger()
		 * @generated
		 */
		EClass MEASURED_INTEGER = eINSTANCE.getMeasuredInteger();

		/**
		 * The meta object literal for the '<em><b>Unit Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURED_INTEGER__UNIT_NAME = eINSTANCE.getMeasuredInteger_UnitName();

		/**
		 * The meta object literal for the '<em><b>Measure</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURED_INTEGER__MEASURE = eINSTANCE.getMeasuredInteger_Measure();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.DateConstantImpl <em>Date Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.DateConstantImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getDateConstant()
		 * @generated
		 */
		EClass DATE_CONSTANT = eINSTANCE.getDateConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_CONSTANT__VALUE = eINSTANCE.getDateConstant_Value();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.constant.impl.TimestampConstantImpl <em>Timestamp Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.TimestampConstantImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl#getTimestampConstant()
		 * @generated
		 */
		EClass TIMESTAMP_CONSTANT = eINSTANCE.getTimestampConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESTAMP_CONSTANT__VALUE = eINSTANCE.getTimestampConstant_Value();

	}

} //ConstantPackage
