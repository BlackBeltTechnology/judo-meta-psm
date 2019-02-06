/**
 */
package hu.blackbelt.judo.meta.psm.expression;

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
 * @see hu.blackbelt.judo.meta.psm.expression.ExpressionFactory
 * @model kind="package"
 * @generated
 */
public interface ExpressionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "expression";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/expression";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "expr";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpressionPackage eINSTANCE = hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.Expression <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.Expression
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.ElementNameImpl <em>Element Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ElementNameImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getElementName()
	 * @generated
	 */
	int ELEMENT_NAME = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NAME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NAME__NAMESPACE = 1;

	/**
	 * The number of structural features of the '<em>Element Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NAME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_NAME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.DataExpression <em>Data Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.DataExpression
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getDataExpression()
	 * @generated
	 */
	int DATA_EXPRESSION = 13;

	/**
	 * The number of structural features of the '<em>Data Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.NumericExpression <em>Numeric Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.NumericExpression
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getNumericExpression()
	 * @generated
	 */
	int NUMERIC_EXPRESSION = 2;

	/**
	 * The number of structural features of the '<em>Numeric Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXPRESSION_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_EXPRESSION_OPERATION_COUNT = DATA_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.LogicalExpression <em>Logical Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.LogicalExpression
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getLogicalExpression()
	 * @generated
	 */
	int LOGICAL_EXPRESSION = 3;

	/**
	 * The number of structural features of the '<em>Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logical Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_OPERATION_COUNT = DATA_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.StringExpression <em>String Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.StringExpression
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getStringExpression()
	 * @generated
	 */
	int STRING_EXPRESSION = 4;

	/**
	 * The number of structural features of the '<em>String Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_EXPRESSION_OPERATION_COUNT = DATA_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.EnumerationExpression <em>Enumeration Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.EnumerationExpression
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getEnumerationExpression()
	 * @generated
	 */
	int ENUMERATION_EXPRESSION = 5;

	/**
	 * The number of structural features of the '<em>Enumeration Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_EXPRESSION_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Enumeration Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_EXPRESSION_OPERATION_COUNT = DATA_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.ReferenceExpression <em>Reference Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.ReferenceExpression
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getReferenceExpression()
	 * @generated
	 */
	int REFERENCE_EXPRESSION = 18;

	/**
	 * The number of structural features of the '<em>Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reference Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.ObjectExpression <em>Object Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.ObjectExpression
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getObjectExpression()
	 * @generated
	 */
	int OBJECT_EXPRESSION = 6;

	/**
	 * The number of structural features of the '<em>Object Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXPRESSION_FEATURE_COUNT = REFERENCE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_EXPRESSION_OPERATION_COUNT = REFERENCE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.CollectionExpression <em>Collection Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.CollectionExpression
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getCollectionExpression()
	 * @generated
	 */
	int COLLECTION_EXPRESSION = 7;

	/**
	 * The number of structural features of the '<em>Collection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_FEATURE_COUNT = REFERENCE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Collection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_EXPRESSION_OPERATION_COUNT = REFERENCE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.AttributeSelectorImpl <em>Attribute Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.AttributeSelectorImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getAttributeSelector()
	 * @generated
	 */
	int ATTRIBUTE_SELECTOR = 8;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTOR__OBJECT_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTOR__ATTRIBUTE_NAME = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTOR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.VariableReference <em>Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.VariableReference
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getVariableReference()
	 * @generated
	 */
	int VARIABLE_REFERENCE = 9;

	/**
	 * The number of structural features of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.IntegerExpression <em>Integer Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.IntegerExpression
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getIntegerExpression()
	 * @generated
	 */
	int INTEGER_EXPRESSION = 10;

	/**
	 * The number of structural features of the '<em>Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_FEATURE_COUNT = NUMERIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Integer Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_EXPRESSION_OPERATION_COUNT = NUMERIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.DecimalExpression <em>Decimal Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.DecimalExpression
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getDecimalExpression()
	 * @generated
	 */
	int DECIMAL_EXPRESSION = 11;

	/**
	 * The number of structural features of the '<em>Decimal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_EXPRESSION_FEATURE_COUNT = NUMERIC_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Decimal Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_EXPRESSION_OPERATION_COUNT = NUMERIC_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.OrderedCollectionExpression <em>Ordered Collection Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.OrderedCollectionExpression
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getOrderedCollectionExpression()
	 * @generated
	 */
	int ORDERED_COLLECTION_EXPRESSION = 12;

	/**
	 * The number of structural features of the '<em>Ordered Collection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION_EXPRESSION_FEATURE_COUNT = COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered Collection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_COLLECTION_EXPRESSION_OPERATION_COUNT = COLLECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.NavigationExpressionImpl <em>Navigation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.NavigationExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getNavigationExpression()
	 * @generated
	 */
	int NAVIGATION_EXPRESSION = 14;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EXPRESSION__REFERENCE_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navigation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Navigation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.SwitchExpressionImpl <em>Switch Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.SwitchExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getSwitchExpression()
	 * @generated
	 */
	int SWITCH_EXPRESSION = 15;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION__CASES = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION__DEFAULT_EXPRESSION = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.SwitchCaseImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getSwitchCase()
	 * @generated
	 */
	int SWITCH_CASE = 16;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Switch Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Switch Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.AggregatedExpressionImpl <em>Aggregated Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.AggregatedExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getAggregatedExpression()
	 * @generated
	 */
	int AGGREGATED_EXPRESSION = 17;

	/**
	 * The feature id for the '<em><b>Collection Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aggregated Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Aggregated Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATED_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.ReferenceSelectorImpl <em>Reference Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ReferenceSelectorImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getReferenceSelector()
	 * @generated
	 */
	int REFERENCE_SELECTOR = 19;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SELECTOR__REFERENCE_NAME = NAVIGATION_EXPRESSION__REFERENCE_NAME;

	/**
	 * The number of structural features of the '<em>Reference Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SELECTOR_FEATURE_COUNT = NAVIGATION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reference Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SELECTOR_OPERATION_COUNT = NAVIGATION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.CustomExpression <em>Custom Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.CustomExpression
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getCustomExpression()
	 * @generated
	 */
	int CUSTOM_EXPRESSION = 20;

	/**
	 * The number of structural features of the '<em>Custom Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXPRESSION_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Custom Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_EXPRESSION_OPERATION_COUNT = DATA_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.DateExpression <em>Date Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.DateExpression
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getDateExpression()
	 * @generated
	 */
	int DATE_EXPRESSION = 21;

	/**
	 * The number of structural features of the '<em>Date Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_EXPRESSION_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_EXPRESSION_OPERATION_COUNT = DATA_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.TimestampExpression <em>Timestamp Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.TimestampExpression
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getTimestampExpression()
	 * @generated
	 */
	int TIMESTAMP_EXPRESSION = 22;

	/**
	 * The number of structural features of the '<em>Timestamp Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_EXPRESSION_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Timestamp Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_EXPRESSION_OPERATION_COUNT = DATA_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.TypeNameImpl <em>Type Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.TypeNameImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getTypeName()
	 * @generated
	 */
	int TYPE_NAME = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME__NAME = ELEMENT_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME__NAMESPACE = ELEMENT_NAME__NAMESPACE;

	/**
	 * The number of structural features of the '<em>Type Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_FEATURE_COUNT = ELEMENT_NAME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_NAME_OPERATION_COUNT = ELEMENT_NAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.MeasureNameImpl <em>Measure Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.MeasureNameImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getMeasureName()
	 * @generated
	 */
	int MEASURE_NAME = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_NAME__NAME = ELEMENT_NAME__NAME;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_NAME__NAMESPACE = ELEMENT_NAME__NAMESPACE;

	/**
	 * The number of structural features of the '<em>Measure Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_NAME_FEATURE_COUNT = ELEMENT_NAME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Measure Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_NAME_OPERATION_COUNT = ELEMENT_NAME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.WindowingExpression <em>Windowing Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.WindowingExpression
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getWindowingExpression()
	 * @generated
	 */
	int WINDOWING_EXPRESSION = 25;

	/**
	 * The number of structural features of the '<em>Windowing Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWING_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Windowing Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOWING_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.FilteringExpression <em>Filtering Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.FilteringExpression
	 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getFilteringExpression()
	 * @generated
	 */
	int FILTERING_EXPRESSION = 26;

	/**
	 * The number of structural features of the '<em>Filtering Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Filtering Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTERING_EXPRESSION_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.ElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.ElementName
	 * @generated
	 */
	EClass getElementName();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.ElementName#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.ElementName#getName()
	 * @see #getElementName()
	 * @generated
	 */
	EAttribute getElementName_Name();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.ElementName#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.ElementName#getNamespace()
	 * @see #getElementName()
	 * @generated
	 */
	EAttribute getElementName_Namespace();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.NumericExpression <em>Numeric Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.NumericExpression
	 * @generated
	 */
	EClass getNumericExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.LogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.LogicalExpression
	 * @generated
	 */
	EClass getLogicalExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.StringExpression
	 * @generated
	 */
	EClass getStringExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.EnumerationExpression <em>Enumeration Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.EnumerationExpression
	 * @generated
	 */
	EClass getEnumerationExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.ObjectExpression <em>Object Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.ObjectExpression
	 * @generated
	 */
	EClass getObjectExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.CollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.CollectionExpression
	 * @generated
	 */
	EClass getCollectionExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.AttributeSelector <em>Attribute Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Selector</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.AttributeSelector
	 * @generated
	 */
	EClass getAttributeSelector();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.AttributeSelector#getObjectExpression <em>Object Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.AttributeSelector#getObjectExpression()
	 * @see #getAttributeSelector()
	 * @generated
	 */
	EReference getAttributeSelector_ObjectExpression();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.AttributeSelector#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.AttributeSelector#getAttributeName()
	 * @see #getAttributeSelector()
	 * @generated
	 */
	EAttribute getAttributeSelector_AttributeName();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.VariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Reference</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.VariableReference
	 * @generated
	 */
	EClass getVariableReference();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.IntegerExpression
	 * @generated
	 */
	EClass getIntegerExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.DecimalExpression <em>Decimal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.DecimalExpression
	 * @generated
	 */
	EClass getDecimalExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.OrderedCollectionExpression <em>Ordered Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Collection Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.OrderedCollectionExpression
	 * @generated
	 */
	EClass getOrderedCollectionExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.DataExpression <em>Data Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.DataExpression
	 * @generated
	 */
	EClass getDataExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.NavigationExpression <em>Navigation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.NavigationExpression
	 * @generated
	 */
	EClass getNavigationExpression();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.NavigationExpression#getReferenceName <em>Reference Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.NavigationExpression#getReferenceName()
	 * @see #getNavigationExpression()
	 * @generated
	 */
	EAttribute getNavigationExpression_ReferenceName();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.SwitchExpression <em>Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.SwitchExpression
	 * @generated
	 */
	EClass getSwitchExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.expression.SwitchExpression#getCases <em>Cases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cases</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.SwitchExpression#getCases()
	 * @see #getSwitchExpression()
	 * @generated
	 */
	EReference getSwitchExpression_Cases();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.SwitchExpression#getDefaultExpression <em>Default Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.SwitchExpression#getDefaultExpression()
	 * @see #getSwitchExpression()
	 * @generated
	 */
	EReference getSwitchExpression_DefaultExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.SwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Case</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.SwitchCase
	 * @generated
	 */
	EClass getSwitchCase();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.SwitchCase#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.SwitchCase#getCondition()
	 * @see #getSwitchCase()
	 * @generated
	 */
	EReference getSwitchCase_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.SwitchCase#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.SwitchCase#getExpression()
	 * @see #getSwitchCase()
	 * @generated
	 */
	EReference getSwitchCase_Expression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.AggregatedExpression <em>Aggregated Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregated Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.AggregatedExpression
	 * @generated
	 */
	EClass getAggregatedExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.AggregatedExpression#getCollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.AggregatedExpression#getCollectionExpression()
	 * @see #getAggregatedExpression()
	 * @generated
	 */
	EReference getAggregatedExpression_CollectionExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.ReferenceExpression <em>Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.ReferenceExpression
	 * @generated
	 */
	EClass getReferenceExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.ReferenceSelector <em>Reference Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Selector</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.ReferenceSelector
	 * @generated
	 */
	EClass getReferenceSelector();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.CustomExpression <em>Custom Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.CustomExpression
	 * @generated
	 */
	EClass getCustomExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.DateExpression <em>Date Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.DateExpression
	 * @generated
	 */
	EClass getDateExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.TimestampExpression <em>Timestamp Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timestamp Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.TimestampExpression
	 * @generated
	 */
	EClass getTimestampExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.TypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.TypeName
	 * @generated
	 */
	EClass getTypeName();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.MeasureName <em>Measure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.MeasureName
	 * @generated
	 */
	EClass getMeasureName();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.WindowingExpression <em>Windowing Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Windowing Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.WindowingExpression
	 * @generated
	 */
	EClass getWindowingExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.FilteringExpression <em>Filtering Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filtering Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.FilteringExpression
	 * @generated
	 */
	EClass getFilteringExpression();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpressionFactory getExpressionFactory();

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
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.Expression <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.Expression
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.ElementNameImpl <em>Element Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ElementNameImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getElementName()
		 * @generated
		 */
		EClass ELEMENT_NAME = eINSTANCE.getElementName();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_NAME__NAME = eINSTANCE.getElementName_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ELEMENT_NAME__NAMESPACE = eINSTANCE.getElementName_Namespace();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.NumericExpression <em>Numeric Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.NumericExpression
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getNumericExpression()
		 * @generated
		 */
		EClass NUMERIC_EXPRESSION = eINSTANCE.getNumericExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.LogicalExpression <em>Logical Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.LogicalExpression
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getLogicalExpression()
		 * @generated
		 */
		EClass LOGICAL_EXPRESSION = eINSTANCE.getLogicalExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.StringExpression <em>String Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.StringExpression
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getStringExpression()
		 * @generated
		 */
		EClass STRING_EXPRESSION = eINSTANCE.getStringExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.EnumerationExpression <em>Enumeration Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.EnumerationExpression
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getEnumerationExpression()
		 * @generated
		 */
		EClass ENUMERATION_EXPRESSION = eINSTANCE.getEnumerationExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.ObjectExpression <em>Object Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.ObjectExpression
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getObjectExpression()
		 * @generated
		 */
		EClass OBJECT_EXPRESSION = eINSTANCE.getObjectExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.CollectionExpression <em>Collection Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.CollectionExpression
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getCollectionExpression()
		 * @generated
		 */
		EClass COLLECTION_EXPRESSION = eINSTANCE.getCollectionExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.AttributeSelectorImpl <em>Attribute Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.AttributeSelectorImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getAttributeSelector()
		 * @generated
		 */
		EClass ATTRIBUTE_SELECTOR = eINSTANCE.getAttributeSelector();

		/**
		 * The meta object literal for the '<em><b>Object Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_SELECTOR__OBJECT_EXPRESSION = eINSTANCE.getAttributeSelector_ObjectExpression();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_SELECTOR__ATTRIBUTE_NAME = eINSTANCE.getAttributeSelector_AttributeName();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.VariableReference <em>Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.VariableReference
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getVariableReference()
		 * @generated
		 */
		EClass VARIABLE_REFERENCE = eINSTANCE.getVariableReference();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.IntegerExpression <em>Integer Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.IntegerExpression
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getIntegerExpression()
		 * @generated
		 */
		EClass INTEGER_EXPRESSION = eINSTANCE.getIntegerExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.DecimalExpression <em>Decimal Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.DecimalExpression
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getDecimalExpression()
		 * @generated
		 */
		EClass DECIMAL_EXPRESSION = eINSTANCE.getDecimalExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.OrderedCollectionExpression <em>Ordered Collection Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.OrderedCollectionExpression
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getOrderedCollectionExpression()
		 * @generated
		 */
		EClass ORDERED_COLLECTION_EXPRESSION = eINSTANCE.getOrderedCollectionExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.DataExpression <em>Data Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.DataExpression
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getDataExpression()
		 * @generated
		 */
		EClass DATA_EXPRESSION = eINSTANCE.getDataExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.NavigationExpressionImpl <em>Navigation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.NavigationExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getNavigationExpression()
		 * @generated
		 */
		EClass NAVIGATION_EXPRESSION = eINSTANCE.getNavigationExpression();

		/**
		 * The meta object literal for the '<em><b>Reference Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAVIGATION_EXPRESSION__REFERENCE_NAME = eINSTANCE.getNavigationExpression_ReferenceName();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.SwitchExpressionImpl <em>Switch Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.SwitchExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getSwitchExpression()
		 * @generated
		 */
		EClass SWITCH_EXPRESSION = eINSTANCE.getSwitchExpression();

		/**
		 * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_EXPRESSION__CASES = eINSTANCE.getSwitchExpression_Cases();

		/**
		 * The meta object literal for the '<em><b>Default Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_EXPRESSION__DEFAULT_EXPRESSION = eINSTANCE.getSwitchExpression_DefaultExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.SwitchCaseImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getSwitchCase()
		 * @generated
		 */
		EClass SWITCH_CASE = eINSTANCE.getSwitchCase();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CASE__CONDITION = eINSTANCE.getSwitchCase_Condition();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH_CASE__EXPRESSION = eINSTANCE.getSwitchCase_Expression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.AggregatedExpressionImpl <em>Aggregated Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.AggregatedExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getAggregatedExpression()
		 * @generated
		 */
		EClass AGGREGATED_EXPRESSION = eINSTANCE.getAggregatedExpression();

		/**
		 * The meta object literal for the '<em><b>Collection Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION = eINSTANCE.getAggregatedExpression_CollectionExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.ReferenceExpression <em>Reference Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.ReferenceExpression
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getReferenceExpression()
		 * @generated
		 */
		EClass REFERENCE_EXPRESSION = eINSTANCE.getReferenceExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.ReferenceSelectorImpl <em>Reference Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ReferenceSelectorImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getReferenceSelector()
		 * @generated
		 */
		EClass REFERENCE_SELECTOR = eINSTANCE.getReferenceSelector();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.CustomExpression <em>Custom Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.CustomExpression
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getCustomExpression()
		 * @generated
		 */
		EClass CUSTOM_EXPRESSION = eINSTANCE.getCustomExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.DateExpression <em>Date Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.DateExpression
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getDateExpression()
		 * @generated
		 */
		EClass DATE_EXPRESSION = eINSTANCE.getDateExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.TimestampExpression <em>Timestamp Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.TimestampExpression
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getTimestampExpression()
		 * @generated
		 */
		EClass TIMESTAMP_EXPRESSION = eINSTANCE.getTimestampExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.TypeNameImpl <em>Type Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.TypeNameImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getTypeName()
		 * @generated
		 */
		EClass TYPE_NAME = eINSTANCE.getTypeName();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.impl.MeasureNameImpl <em>Measure Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.MeasureNameImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getMeasureName()
		 * @generated
		 */
		EClass MEASURE_NAME = eINSTANCE.getMeasureName();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.WindowingExpression <em>Windowing Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.WindowingExpression
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getWindowingExpression()
		 * @generated
		 */
		EClass WINDOWING_EXPRESSION = eINSTANCE.getWindowingExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.FilteringExpression <em>Filtering Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.FilteringExpression
		 * @see hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl#getFilteringExpression()
		 * @generated
		 */
		EClass FILTERING_EXPRESSION = eINSTANCE.getFilteringExpression();

	}

} //ExpressionPackage
