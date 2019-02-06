/**
 */
package hu.blackbelt.judo.meta.psm.expression.numeric;

import hu.blackbelt.judo.meta.psm.expression.ExpressionPackage;

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
 * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericFactory
 * @model kind="package"
 * @generated
 */
public interface NumericPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "numeric";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/expression/numeric";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "n";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NumericPackage eINSTANCE = hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.CountExpressionImpl <em>Count Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.CountExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getCountExpression()
	 * @generated
	 */
	int COUNT_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Collection Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_EXPRESSION__COLLECTION_EXPRESSION = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Count Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_EXPRESSION_FEATURE_COUNT = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Count Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_EXPRESSION_OPERATION_COUNT = ExpressionPackage.INTEGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerAritmeticExpressionImpl <em>Integer Aritmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerAritmeticExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getIntegerAritmeticExpression()
	 * @generated
	 */
	int INTEGER_ARITMETIC_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARITMETIC_EXPRESSION__LEFT = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARITMETIC_EXPRESSION__RIGHT = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARITMETIC_EXPRESSION__OPERATOR = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integer Aritmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARITMETIC_EXPRESSION_FEATURE_COUNT = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Integer Aritmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ARITMETIC_EXPRESSION_OPERATION_COUNT = ExpressionPackage.INTEGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalAritmeticExpressionImpl <em>Decimal Aritmetic Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalAritmeticExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getDecimalAritmeticExpression()
	 * @generated
	 */
	int DECIMAL_ARITMETIC_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_ARITMETIC_EXPRESSION__LEFT = ExpressionPackage.DECIMAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_ARITMETIC_EXPRESSION__RIGHT = ExpressionPackage.DECIMAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_ARITMETIC_EXPRESSION__OPERATOR = ExpressionPackage.DECIMAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Decimal Aritmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_ARITMETIC_EXPRESSION_FEATURE_COUNT = ExpressionPackage.DECIMAL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Decimal Aritmetic Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_ARITMETIC_EXPRESSION_OPERATION_COUNT = ExpressionPackage.DECIMAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerOppositeExpressionImpl <em>Integer Opposite Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerOppositeExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getIntegerOppositeExpression()
	 * @generated
	 */
	int INTEGER_OPPOSITE_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPPOSITE_EXPRESSION__EXPRESSION = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Opposite Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPPOSITE_EXPRESSION_FEATURE_COUNT = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Opposite Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_OPPOSITE_EXPRESSION_OPERATION_COUNT = ExpressionPackage.INTEGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalOppositeExpressionImpl <em>Decimal Opposite Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalOppositeExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getDecimalOppositeExpression()
	 * @generated
	 */
	int DECIMAL_OPPOSITE_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_OPPOSITE_EXPRESSION__EXPRESSION = ExpressionPackage.DECIMAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Decimal Opposite Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_OPPOSITE_EXPRESSION_FEATURE_COUNT = ExpressionPackage.DECIMAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Decimal Opposite Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_OPPOSITE_EXPRESSION_OPERATION_COUNT = ExpressionPackage.DECIMAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerAttributeImpl <em>Integer Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerAttributeImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getIntegerAttribute()
	 * @generated
	 */
	int INTEGER_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE__OBJECT_EXPRESSION = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE__ATTRIBUTE_NAME = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Integer Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE_FEATURE_COUNT = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Integer Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ATTRIBUTE_OPERATION_COUNT = ExpressionPackage.INTEGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalAttributeImpl <em>Decimal Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalAttributeImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getDecimalAttribute()
	 * @generated
	 */
	int DECIMAL_ATTRIBUTE = 6;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_ATTRIBUTE__OBJECT_EXPRESSION = ExpressionPackage.DECIMAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_ATTRIBUTE__ATTRIBUTE_NAME = ExpressionPackage.DECIMAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Decimal Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_ATTRIBUTE_FEATURE_COUNT = ExpressionPackage.DECIMAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Decimal Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_ATTRIBUTE_OPERATION_COUNT = ExpressionPackage.DECIMAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerAggregatedExpressionImpl <em>Integer Aggregated Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerAggregatedExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getIntegerAggregatedExpression()
	 * @generated
	 */
	int INTEGER_AGGREGATED_EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Collection Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AGGREGATED_EXPRESSION__OPERATOR = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AGGREGATED_EXPRESSION__EXPRESSION = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integer Aggregated Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AGGREGATED_EXPRESSION_FEATURE_COUNT = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Integer Aggregated Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_AGGREGATED_EXPRESSION_OPERATION_COUNT = ExpressionPackage.INTEGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalAggregatedExpressionImpl <em>Decimal Aggregated Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalAggregatedExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getDecimalAggregatedExpression()
	 * @generated
	 */
	int DECIMAL_AGGREGATED_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Collection Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION = ExpressionPackage.DECIMAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_AGGREGATED_EXPRESSION__OPERATOR = ExpressionPackage.DECIMAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_AGGREGATED_EXPRESSION__EXPRESSION = ExpressionPackage.DECIMAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Decimal Aggregated Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_AGGREGATED_EXPRESSION_FEATURE_COUNT = ExpressionPackage.DECIMAL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Decimal Aggregated Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_AGGREGATED_EXPRESSION_OPERATION_COUNT = ExpressionPackage.DECIMAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.RoundExpressionImpl <em>Round Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.RoundExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getRoundExpression()
	 * @generated
	 */
	int ROUND_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_EXPRESSION__EXPRESSION = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Round Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_EXPRESSION_FEATURE_COUNT = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Round Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUND_EXPRESSION_OPERATION_COUNT = ExpressionPackage.INTEGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerSwitchExpressionImpl <em>Integer Switch Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerSwitchExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getIntegerSwitchExpression()
	 * @generated
	 */
	int INTEGER_SWITCH_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SWITCH_EXPRESSION__CASES = ExpressionPackage.SWITCH_EXPRESSION__CASES;

	/**
	 * The feature id for the '<em><b>Default Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SWITCH_EXPRESSION__DEFAULT_EXPRESSION = ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Integer Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SWITCH_EXPRESSION_FEATURE_COUNT = ExpressionPackage.SWITCH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_SWITCH_EXPRESSION_OPERATION_COUNT = ExpressionPackage.SWITCH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalSwitchExpressionImpl <em>Decimal Switch Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalSwitchExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getDecimalSwitchExpression()
	 * @generated
	 */
	int DECIMAL_SWITCH_EXPRESSION = 11;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_SWITCH_EXPRESSION__CASES = ExpressionPackage.SWITCH_EXPRESSION__CASES;

	/**
	 * The feature id for the '<em><b>Default Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_SWITCH_EXPRESSION__DEFAULT_EXPRESSION = ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Decimal Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_SWITCH_EXPRESSION_FEATURE_COUNT = ExpressionPackage.SWITCH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decimal Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_SWITCH_EXPRESSION_OPERATION_COUNT = ExpressionPackage.SWITCH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericAttributeImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getNumericAttribute()
	 * @generated
	 */
	int NUMERIC_ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_ATTRIBUTE__OBJECT_EXPRESSION = ExpressionPackage.ATTRIBUTE_SELECTOR__OBJECT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_ATTRIBUTE__ATTRIBUTE_NAME = ExpressionPackage.ATTRIBUTE_SELECTOR__ATTRIBUTE_NAME;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_ATTRIBUTE_FEATURE_COUNT = ExpressionPackage.ATTRIBUTE_SELECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_ATTRIBUTE_OPERATION_COUNT = ExpressionPackage.ATTRIBUTE_SELECTOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.numeric.CountExpression <em>Count Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.CountExpression
	 * @generated
	 */
	EClass getCountExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAritmeticExpression <em>Integer Aritmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Aritmetic Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAritmeticExpression
	 * @generated
	 */
	EClass getIntegerAritmeticExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAritmeticExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAritmeticExpression#getLeft()
	 * @see #getIntegerAritmeticExpression()
	 * @generated
	 */
	EReference getIntegerAritmeticExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAritmeticExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAritmeticExpression#getRight()
	 * @see #getIntegerAritmeticExpression()
	 * @generated
	 */
	EReference getIntegerAritmeticExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAritmeticExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAritmeticExpression#getOperator()
	 * @see #getIntegerAritmeticExpression()
	 * @generated
	 */
	EAttribute getIntegerAritmeticExpression_Operator();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAritmeticExpression <em>Decimal Aritmetic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Aritmetic Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAritmeticExpression
	 * @generated
	 */
	EClass getDecimalAritmeticExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAritmeticExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAritmeticExpression#getLeft()
	 * @see #getDecimalAritmeticExpression()
	 * @generated
	 */
	EReference getDecimalAritmeticExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAritmeticExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAritmeticExpression#getRight()
	 * @see #getDecimalAritmeticExpression()
	 * @generated
	 */
	EReference getDecimalAritmeticExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAritmeticExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAritmeticExpression#getOperator()
	 * @see #getDecimalAritmeticExpression()
	 * @generated
	 */
	EAttribute getDecimalAritmeticExpression_Operator();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerOppositeExpression <em>Integer Opposite Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Opposite Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.IntegerOppositeExpression
	 * @generated
	 */
	EClass getIntegerOppositeExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerOppositeExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.IntegerOppositeExpression#getExpression()
	 * @see #getIntegerOppositeExpression()
	 * @generated
	 */
	EReference getIntegerOppositeExpression_Expression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.numeric.DecimalOppositeExpression <em>Decimal Opposite Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Opposite Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.DecimalOppositeExpression
	 * @generated
	 */
	EClass getDecimalOppositeExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.numeric.DecimalOppositeExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.DecimalOppositeExpression#getExpression()
	 * @see #getDecimalOppositeExpression()
	 * @generated
	 */
	EReference getDecimalOppositeExpression_Expression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAttribute <em>Integer Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Attribute</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAttribute
	 * @generated
	 */
	EClass getIntegerAttribute();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAttribute <em>Decimal Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Attribute</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAttribute
	 * @generated
	 */
	EClass getDecimalAttribute();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAggregatedExpression <em>Integer Aggregated Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Aggregated Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAggregatedExpression
	 * @generated
	 */
	EClass getIntegerAggregatedExpression();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAggregatedExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAggregatedExpression#getOperator()
	 * @see #getIntegerAggregatedExpression()
	 * @generated
	 */
	EAttribute getIntegerAggregatedExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAggregatedExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.IntegerAggregatedExpression#getExpression()
	 * @see #getIntegerAggregatedExpression()
	 * @generated
	 */
	EReference getIntegerAggregatedExpression_Expression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAggregatedExpression <em>Decimal Aggregated Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Aggregated Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAggregatedExpression
	 * @generated
	 */
	EClass getDecimalAggregatedExpression();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAggregatedExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAggregatedExpression#getOperator()
	 * @see #getDecimalAggregatedExpression()
	 * @generated
	 */
	EAttribute getDecimalAggregatedExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAggregatedExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.DecimalAggregatedExpression#getExpression()
	 * @see #getDecimalAggregatedExpression()
	 * @generated
	 */
	EReference getDecimalAggregatedExpression_Expression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.numeric.RoundExpression <em>Round Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Round Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.RoundExpression
	 * @generated
	 */
	EClass getRoundExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.numeric.RoundExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.RoundExpression#getExpression()
	 * @see #getRoundExpression()
	 * @generated
	 */
	EReference getRoundExpression_Expression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.numeric.IntegerSwitchExpression <em>Integer Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Switch Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.IntegerSwitchExpression
	 * @generated
	 */
	EClass getIntegerSwitchExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.numeric.DecimalSwitchExpression <em>Decimal Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Switch Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.DecimalSwitchExpression
	 * @generated
	 */
	EClass getDecimalSwitchExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.numeric.NumericAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.numeric.NumericAttribute
	 * @generated
	 */
	EClass getNumericAttribute();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NumericFactory getNumericFactory();

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
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.CountExpressionImpl <em>Count Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.CountExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getCountExpression()
		 * @generated
		 */
		EClass COUNT_EXPRESSION = eINSTANCE.getCountExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerAritmeticExpressionImpl <em>Integer Aritmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerAritmeticExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getIntegerAritmeticExpression()
		 * @generated
		 */
		EClass INTEGER_ARITMETIC_EXPRESSION = eINSTANCE.getIntegerAritmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_ARITMETIC_EXPRESSION__LEFT = eINSTANCE.getIntegerAritmeticExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_ARITMETIC_EXPRESSION__RIGHT = eINSTANCE.getIntegerAritmeticExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_ARITMETIC_EXPRESSION__OPERATOR = eINSTANCE.getIntegerAritmeticExpression_Operator();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalAritmeticExpressionImpl <em>Decimal Aritmetic Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalAritmeticExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getDecimalAritmeticExpression()
		 * @generated
		 */
		EClass DECIMAL_ARITMETIC_EXPRESSION = eINSTANCE.getDecimalAritmeticExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECIMAL_ARITMETIC_EXPRESSION__LEFT = eINSTANCE.getDecimalAritmeticExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECIMAL_ARITMETIC_EXPRESSION__RIGHT = eINSTANCE.getDecimalAritmeticExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_ARITMETIC_EXPRESSION__OPERATOR = eINSTANCE.getDecimalAritmeticExpression_Operator();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerOppositeExpressionImpl <em>Integer Opposite Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerOppositeExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getIntegerOppositeExpression()
		 * @generated
		 */
		EClass INTEGER_OPPOSITE_EXPRESSION = eINSTANCE.getIntegerOppositeExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_OPPOSITE_EXPRESSION__EXPRESSION = eINSTANCE.getIntegerOppositeExpression_Expression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalOppositeExpressionImpl <em>Decimal Opposite Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalOppositeExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getDecimalOppositeExpression()
		 * @generated
		 */
		EClass DECIMAL_OPPOSITE_EXPRESSION = eINSTANCE.getDecimalOppositeExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECIMAL_OPPOSITE_EXPRESSION__EXPRESSION = eINSTANCE.getDecimalOppositeExpression_Expression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerAttributeImpl <em>Integer Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerAttributeImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getIntegerAttribute()
		 * @generated
		 */
		EClass INTEGER_ATTRIBUTE = eINSTANCE.getIntegerAttribute();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalAttributeImpl <em>Decimal Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalAttributeImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getDecimalAttribute()
		 * @generated
		 */
		EClass DECIMAL_ATTRIBUTE = eINSTANCE.getDecimalAttribute();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerAggregatedExpressionImpl <em>Integer Aggregated Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerAggregatedExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getIntegerAggregatedExpression()
		 * @generated
		 */
		EClass INTEGER_AGGREGATED_EXPRESSION = eINSTANCE.getIntegerAggregatedExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_AGGREGATED_EXPRESSION__OPERATOR = eINSTANCE.getIntegerAggregatedExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_AGGREGATED_EXPRESSION__EXPRESSION = eINSTANCE.getIntegerAggregatedExpression_Expression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalAggregatedExpressionImpl <em>Decimal Aggregated Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalAggregatedExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getDecimalAggregatedExpression()
		 * @generated
		 */
		EClass DECIMAL_AGGREGATED_EXPRESSION = eINSTANCE.getDecimalAggregatedExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_AGGREGATED_EXPRESSION__OPERATOR = eINSTANCE.getDecimalAggregatedExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECIMAL_AGGREGATED_EXPRESSION__EXPRESSION = eINSTANCE.getDecimalAggregatedExpression_Expression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.RoundExpressionImpl <em>Round Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.RoundExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getRoundExpression()
		 * @generated
		 */
		EClass ROUND_EXPRESSION = eINSTANCE.getRoundExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUND_EXPRESSION__EXPRESSION = eINSTANCE.getRoundExpression_Expression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerSwitchExpressionImpl <em>Integer Switch Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.IntegerSwitchExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getIntegerSwitchExpression()
		 * @generated
		 */
		EClass INTEGER_SWITCH_EXPRESSION = eINSTANCE.getIntegerSwitchExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalSwitchExpressionImpl <em>Decimal Switch Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.DecimalSwitchExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getDecimalSwitchExpression()
		 * @generated
		 */
		EClass DECIMAL_SWITCH_EXPRESSION = eINSTANCE.getDecimalSwitchExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericAttributeImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl#getNumericAttribute()
		 * @generated
		 */
		EClass NUMERIC_ATTRIBUTE = eINSTANCE.getNumericAttribute();

	}

} //NumericPackage
