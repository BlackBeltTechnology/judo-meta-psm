/**
 */
package hu.blackbelt.judo.meta.psm.expression.logical;

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
 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalFactory
 * @model kind="package"
 * @generated
 */
public interface LogicalPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logical";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/expression/logical";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "l";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogicalPackage eINSTANCE = hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.StringComparisonImpl <em>String Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.StringComparisonImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getStringComparison()
	 * @generated
	 */
	int STRING_COMPARISON = 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPARISON__LEFT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPARISON__RIGHT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPARISON__OPERATOR = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>String Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPARISON_FEATURE_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>String Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_COMPARISON_OPERATION_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.EnumerationComparisonImpl <em>Enumeration Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.EnumerationComparisonImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getEnumerationComparison()
	 * @generated
	 */
	int ENUMERATION_COMPARISON = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_COMPARISON__LEFT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_COMPARISON__RIGHT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_COMPARISON__OPERATOR = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enumeration Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_COMPARISON_FEATURE_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Enumeration Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_COMPARISON_OPERATION_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.NegationExpressionImpl <em>Negation Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.NegationExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getNegationExpression()
	 * @generated
	 */
	int NEGATION_EXPRESSION = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_EXPRESSION__EXPRESSION = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_EXPRESSION_FEATURE_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Negation Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATION_EXPRESSION_OPERATION_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.KleeneExpressionImpl <em>Kleene Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.KleeneExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getKleeneExpression()
	 * @generated
	 */
	int KLEENE_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEENE_EXPRESSION__LEFT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEENE_EXPRESSION__RIGHT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEENE_EXPRESSION__OPERATOR = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Kleene Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEENE_EXPRESSION_FEATURE_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Kleene Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KLEENE_EXPRESSION_OPERATION_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.InstanceOfExpressionImpl <em>Instance Of Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.InstanceOfExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getInstanceOfExpression()
	 * @generated
	 */
	int INSTANCE_OF_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF_EXPRESSION__OBJECT_EXPRESSION = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF_EXPRESSION__ELEMENT_NAME = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Of Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF_EXPRESSION_FEATURE_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instance Of Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF_EXPRESSION_OPERATION_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalAttributeImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getLogicalAttribute()
	 * @generated
	 */
	int LOGICAL_ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__OBJECT_EXPRESSION = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE__ATTRIBUTE_NAME = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE_FEATURE_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_ATTRIBUTE_OPERATION_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.UndefinedAttributeComparisonImpl <em>Undefined Attribute Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.UndefinedAttributeComparisonImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getUndefinedAttributeComparison()
	 * @generated
	 */
	int UNDEFINED_ATTRIBUTE_COMPARISON = 6;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_ATTRIBUTE_COMPARISON__OBJECT_EXPRESSION = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_ATTRIBUTE_COMPARISON__ATTRIBUTE_NAME = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Undefined Attribute Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_ATTRIBUTE_COMPARISON_FEATURE_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Undefined Attribute Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_ATTRIBUTE_COMPARISON_OPERATION_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.UndefinedNavigationComparisonImpl <em>Undefined Navigation Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.UndefinedNavigationComparisonImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getUndefinedNavigationComparison()
	 * @generated
	 */
	int UNDEFINED_NAVIGATION_COMPARISON = 7;

	/**
	 * The feature id for the '<em><b>Object Exression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_NAVIGATION_COMPARISON__OBJECT_EXRESSION = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Undefined Navigation Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_NAVIGATION_COMPARISON_FEATURE_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Undefined Navigation Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNDEFINED_NAVIGATION_COMPARISON_OPERATION_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.ContainsExpressionImpl <em>Contains Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.ContainsExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getContainsExpression()
	 * @generated
	 */
	int CONTAINS_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Collection Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_EXPRESSION__COLLECTION_EXPRESSION = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_EXPRESSION__OBJECT_EXPRESSION = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Contains Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_EXPRESSION_FEATURE_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Contains Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINS_EXPRESSION_OPERATION_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.IntegerComparisonImpl <em>Integer Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.IntegerComparisonImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getIntegerComparison()
	 * @generated
	 */
	int INTEGER_COMPARISON = 9;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON__LEFT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON__RIGHT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON__OPERATOR = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Integer Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_FEATURE_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Integer Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_COMPARISON_OPERATION_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.DecimalComparisonImpl <em>Decimal Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.DecimalComparisonImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getDecimalComparison()
	 * @generated
	 */
	int DECIMAL_COMPARISON = 10;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_COMPARISON__LEFT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_COMPARISON__RIGHT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_COMPARISON__OPERATOR = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Decimal Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_COMPARISON_FEATURE_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Decimal Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECIMAL_COMPARISON_OPERATION_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.ObjectComparisonImpl <em>Object Comparison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.ObjectComparisonImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getObjectComparison()
	 * @generated
	 */
	int OBJECT_COMPARISON = 11;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARISON__LEFT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARISON__RIGHT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARISON__OPERATOR = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARISON_FEATURE_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Object Comparison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_COMPARISON_OPERATION_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.MemberOfExpressionImpl <em>Member Of Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.MemberOfExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getMemberOfExpression()
	 * @generated
	 */
	int MEMBER_OF_EXPRESSION = 12;

	/**
	 * The feature id for the '<em><b>Collection Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF_EXPRESSION__COLLECTION_EXPRESSION = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF_EXPRESSION__OBJECT_EXPRESSION = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Member Of Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF_EXPRESSION_FEATURE_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Member Of Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMBER_OF_EXPRESSION_OPERATION_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.TypeOfExpressionImpl <em>Type Of Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.TypeOfExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getTypeOfExpression()
	 * @generated
	 */
	int TYPE_OF_EXPRESSION = 13;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_EXPRESSION__OBJECT_EXPRESSION = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_EXPRESSION__ELEMENT_NAME = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Of Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_EXPRESSION_FEATURE_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type Of Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OF_EXPRESSION_OPERATION_COUNT = ExpressionPackage.LOGICAL_EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.logical.StringComparison <em>String Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Comparison</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.StringComparison
	 * @generated
	 */
	EClass getStringComparison();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.StringComparison#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.StringComparison#getLeft()
	 * @see #getStringComparison()
	 * @generated
	 */
	EReference getStringComparison_Left();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.StringComparison#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.StringComparison#getRight()
	 * @see #getStringComparison()
	 * @generated
	 */
	EReference getStringComparison_Right();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.logical.StringComparison#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.StringComparison#getOperator()
	 * @see #getStringComparison()
	 * @generated
	 */
	EAttribute getStringComparison_Operator();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.logical.EnumerationComparison <em>Enumeration Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Comparison</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.EnumerationComparison
	 * @generated
	 */
	EClass getEnumerationComparison();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.EnumerationComparison#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.EnumerationComparison#getLeft()
	 * @see #getEnumerationComparison()
	 * @generated
	 */
	EReference getEnumerationComparison_Left();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.EnumerationComparison#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.EnumerationComparison#getRight()
	 * @see #getEnumerationComparison()
	 * @generated
	 */
	EReference getEnumerationComparison_Right();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.logical.EnumerationComparison#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.EnumerationComparison#getOperator()
	 * @see #getEnumerationComparison()
	 * @generated
	 */
	EAttribute getEnumerationComparison_Operator();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.logical.NegationExpression <em>Negation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negation Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.NegationExpression
	 * @generated
	 */
	EClass getNegationExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.NegationExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.NegationExpression#getExpression()
	 * @see #getNegationExpression()
	 * @generated
	 */
	EReference getNegationExpression_Expression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.logical.KleeneExpression <em>Kleene Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kleene Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.KleeneExpression
	 * @generated
	 */
	EClass getKleeneExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.KleeneExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.KleeneExpression#getLeft()
	 * @see #getKleeneExpression()
	 * @generated
	 */
	EReference getKleeneExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.KleeneExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.KleeneExpression#getRight()
	 * @see #getKleeneExpression()
	 * @generated
	 */
	EReference getKleeneExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.logical.KleeneExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.KleeneExpression#getOperator()
	 * @see #getKleeneExpression()
	 * @generated
	 */
	EAttribute getKleeneExpression_Operator();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.logical.InstanceOfExpression <em>Instance Of Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Of Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.InstanceOfExpression
	 * @generated
	 */
	EClass getInstanceOfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.InstanceOfExpression#getObjectExpression <em>Object Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.InstanceOfExpression#getObjectExpression()
	 * @see #getInstanceOfExpression()
	 * @generated
	 */
	EReference getInstanceOfExpression_ObjectExpression();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.InstanceOfExpression#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.InstanceOfExpression#getElementName()
	 * @see #getInstanceOfExpression()
	 * @generated
	 */
	EReference getInstanceOfExpression_ElementName();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.logical.LogicalAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalAttribute
	 * @generated
	 */
	EClass getLogicalAttribute();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.logical.UndefinedAttributeComparison <em>Undefined Attribute Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undefined Attribute Comparison</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.UndefinedAttributeComparison
	 * @generated
	 */
	EClass getUndefinedAttributeComparison();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.UndefinedAttributeComparison#getObjectExpression <em>Object Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.UndefinedAttributeComparison#getObjectExpression()
	 * @see #getUndefinedAttributeComparison()
	 * @generated
	 */
	EReference getUndefinedAttributeComparison_ObjectExpression();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.logical.UndefinedAttributeComparison#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.UndefinedAttributeComparison#getAttributeName()
	 * @see #getUndefinedAttributeComparison()
	 * @generated
	 */
	EAttribute getUndefinedAttributeComparison_AttributeName();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.logical.UndefinedNavigationComparison <em>Undefined Navigation Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Undefined Navigation Comparison</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.UndefinedNavigationComparison
	 * @generated
	 */
	EClass getUndefinedNavigationComparison();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.UndefinedNavigationComparison#getObjectExression <em>Object Exression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Exression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.UndefinedNavigationComparison#getObjectExression()
	 * @see #getUndefinedNavigationComparison()
	 * @generated
	 */
	EReference getUndefinedNavigationComparison_ObjectExression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.logical.ContainsExpression <em>Contains Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contains Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.ContainsExpression
	 * @generated
	 */
	EClass getContainsExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.ContainsExpression#getCollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.ContainsExpression#getCollectionExpression()
	 * @see #getContainsExpression()
	 * @generated
	 */
	EReference getContainsExpression_CollectionExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.ContainsExpression#getObjectExpression <em>Object Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.ContainsExpression#getObjectExpression()
	 * @see #getContainsExpression()
	 * @generated
	 */
	EReference getContainsExpression_ObjectExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.logical.IntegerComparison <em>Integer Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Comparison</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.IntegerComparison
	 * @generated
	 */
	EClass getIntegerComparison();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.IntegerComparison#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.IntegerComparison#getLeft()
	 * @see #getIntegerComparison()
	 * @generated
	 */
	EReference getIntegerComparison_Left();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.IntegerComparison#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.IntegerComparison#getRight()
	 * @see #getIntegerComparison()
	 * @generated
	 */
	EReference getIntegerComparison_Right();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.logical.IntegerComparison#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.IntegerComparison#getOperator()
	 * @see #getIntegerComparison()
	 * @generated
	 */
	EAttribute getIntegerComparison_Operator();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.logical.DecimalComparison <em>Decimal Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decimal Comparison</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.DecimalComparison
	 * @generated
	 */
	EClass getDecimalComparison();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.DecimalComparison#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.DecimalComparison#getLeft()
	 * @see #getDecimalComparison()
	 * @generated
	 */
	EReference getDecimalComparison_Left();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.DecimalComparison#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.DecimalComparison#getRight()
	 * @see #getDecimalComparison()
	 * @generated
	 */
	EReference getDecimalComparison_Right();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.logical.DecimalComparison#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.DecimalComparison#getOperator()
	 * @see #getDecimalComparison()
	 * @generated
	 */
	EAttribute getDecimalComparison_Operator();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.logical.ObjectComparison <em>Object Comparison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Comparison</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.ObjectComparison
	 * @generated
	 */
	EClass getObjectComparison();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.ObjectComparison#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.ObjectComparison#getLeft()
	 * @see #getObjectComparison()
	 * @generated
	 */
	EReference getObjectComparison_Left();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.ObjectComparison#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.ObjectComparison#getRight()
	 * @see #getObjectComparison()
	 * @generated
	 */
	EReference getObjectComparison_Right();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.logical.ObjectComparison#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.ObjectComparison#getOperator()
	 * @see #getObjectComparison()
	 * @generated
	 */
	EAttribute getObjectComparison_Operator();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.logical.MemberOfExpression <em>Member Of Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member Of Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.MemberOfExpression
	 * @generated
	 */
	EClass getMemberOfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.MemberOfExpression#getCollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.MemberOfExpression#getCollectionExpression()
	 * @see #getMemberOfExpression()
	 * @generated
	 */
	EReference getMemberOfExpression_CollectionExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.MemberOfExpression#getObjectExpression <em>Object Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.MemberOfExpression#getObjectExpression()
	 * @see #getMemberOfExpression()
	 * @generated
	 */
	EReference getMemberOfExpression_ObjectExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.logical.TypeOfExpression <em>Type Of Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Of Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.TypeOfExpression
	 * @generated
	 */
	EClass getTypeOfExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.TypeOfExpression#getObjectExpression <em>Object Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.TypeOfExpression#getObjectExpression()
	 * @see #getTypeOfExpression()
	 * @generated
	 */
	EReference getTypeOfExpression_ObjectExpression();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.logical.TypeOfExpression#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.logical.TypeOfExpression#getElementName()
	 * @see #getTypeOfExpression()
	 * @generated
	 */
	EReference getTypeOfExpression_ElementName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogicalFactory getLogicalFactory();

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
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.StringComparisonImpl <em>String Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.StringComparisonImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getStringComparison()
		 * @generated
		 */
		EClass STRING_COMPARISON = eINSTANCE.getStringComparison();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_COMPARISON__LEFT = eINSTANCE.getStringComparison_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRING_COMPARISON__RIGHT = eINSTANCE.getStringComparison_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_COMPARISON__OPERATOR = eINSTANCE.getStringComparison_Operator();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.EnumerationComparisonImpl <em>Enumeration Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.EnumerationComparisonImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getEnumerationComparison()
		 * @generated
		 */
		EClass ENUMERATION_COMPARISON = eINSTANCE.getEnumerationComparison();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_COMPARISON__LEFT = eINSTANCE.getEnumerationComparison_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_COMPARISON__RIGHT = eINSTANCE.getEnumerationComparison_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_COMPARISON__OPERATOR = eINSTANCE.getEnumerationComparison_Operator();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.NegationExpressionImpl <em>Negation Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.NegationExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getNegationExpression()
		 * @generated
		 */
		EClass NEGATION_EXPRESSION = eINSTANCE.getNegationExpression();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEGATION_EXPRESSION__EXPRESSION = eINSTANCE.getNegationExpression_Expression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.KleeneExpressionImpl <em>Kleene Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.KleeneExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getKleeneExpression()
		 * @generated
		 */
		EClass KLEENE_EXPRESSION = eINSTANCE.getKleeneExpression();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KLEENE_EXPRESSION__LEFT = eINSTANCE.getKleeneExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KLEENE_EXPRESSION__RIGHT = eINSTANCE.getKleeneExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KLEENE_EXPRESSION__OPERATOR = eINSTANCE.getKleeneExpression_Operator();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.InstanceOfExpressionImpl <em>Instance Of Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.InstanceOfExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getInstanceOfExpression()
		 * @generated
		 */
		EClass INSTANCE_OF_EXPRESSION = eINSTANCE.getInstanceOfExpression();

		/**
		 * The meta object literal for the '<em><b>Object Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_OF_EXPRESSION__OBJECT_EXPRESSION = eINSTANCE.getInstanceOfExpression_ObjectExpression();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_OF_EXPRESSION__ELEMENT_NAME = eINSTANCE.getInstanceOfExpression_ElementName();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalAttributeImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getLogicalAttribute()
		 * @generated
		 */
		EClass LOGICAL_ATTRIBUTE = eINSTANCE.getLogicalAttribute();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.UndefinedAttributeComparisonImpl <em>Undefined Attribute Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.UndefinedAttributeComparisonImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getUndefinedAttributeComparison()
		 * @generated
		 */
		EClass UNDEFINED_ATTRIBUTE_COMPARISON = eINSTANCE.getUndefinedAttributeComparison();

		/**
		 * The meta object literal for the '<em><b>Object Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNDEFINED_ATTRIBUTE_COMPARISON__OBJECT_EXPRESSION = eINSTANCE.getUndefinedAttributeComparison_ObjectExpression();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNDEFINED_ATTRIBUTE_COMPARISON__ATTRIBUTE_NAME = eINSTANCE.getUndefinedAttributeComparison_AttributeName();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.UndefinedNavigationComparisonImpl <em>Undefined Navigation Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.UndefinedNavigationComparisonImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getUndefinedNavigationComparison()
		 * @generated
		 */
		EClass UNDEFINED_NAVIGATION_COMPARISON = eINSTANCE.getUndefinedNavigationComparison();

		/**
		 * The meta object literal for the '<em><b>Object Exression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNDEFINED_NAVIGATION_COMPARISON__OBJECT_EXRESSION = eINSTANCE.getUndefinedNavigationComparison_ObjectExression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.ContainsExpressionImpl <em>Contains Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.ContainsExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getContainsExpression()
		 * @generated
		 */
		EClass CONTAINS_EXPRESSION = eINSTANCE.getContainsExpression();

		/**
		 * The meta object literal for the '<em><b>Collection Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINS_EXPRESSION__COLLECTION_EXPRESSION = eINSTANCE.getContainsExpression_CollectionExpression();

		/**
		 * The meta object literal for the '<em><b>Object Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINS_EXPRESSION__OBJECT_EXPRESSION = eINSTANCE.getContainsExpression_ObjectExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.IntegerComparisonImpl <em>Integer Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.IntegerComparisonImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getIntegerComparison()
		 * @generated
		 */
		EClass INTEGER_COMPARISON = eINSTANCE.getIntegerComparison();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_COMPARISON__LEFT = eINSTANCE.getIntegerComparison_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTEGER_COMPARISON__RIGHT = eINSTANCE.getIntegerComparison_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_COMPARISON__OPERATOR = eINSTANCE.getIntegerComparison_Operator();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.DecimalComparisonImpl <em>Decimal Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.DecimalComparisonImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getDecimalComparison()
		 * @generated
		 */
		EClass DECIMAL_COMPARISON = eINSTANCE.getDecimalComparison();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECIMAL_COMPARISON__LEFT = eINSTANCE.getDecimalComparison_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECIMAL_COMPARISON__RIGHT = eINSTANCE.getDecimalComparison_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECIMAL_COMPARISON__OPERATOR = eINSTANCE.getDecimalComparison_Operator();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.ObjectComparisonImpl <em>Object Comparison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.ObjectComparisonImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getObjectComparison()
		 * @generated
		 */
		EClass OBJECT_COMPARISON = eINSTANCE.getObjectComparison();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_COMPARISON__LEFT = eINSTANCE.getObjectComparison_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_COMPARISON__RIGHT = eINSTANCE.getObjectComparison_Right();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_COMPARISON__OPERATOR = eINSTANCE.getObjectComparison_Operator();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.MemberOfExpressionImpl <em>Member Of Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.MemberOfExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getMemberOfExpression()
		 * @generated
		 */
		EClass MEMBER_OF_EXPRESSION = eINSTANCE.getMemberOfExpression();

		/**
		 * The meta object literal for the '<em><b>Collection Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_OF_EXPRESSION__COLLECTION_EXPRESSION = eINSTANCE.getMemberOfExpression_CollectionExpression();

		/**
		 * The meta object literal for the '<em><b>Object Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMBER_OF_EXPRESSION__OBJECT_EXPRESSION = eINSTANCE.getMemberOfExpression_ObjectExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.logical.impl.TypeOfExpressionImpl <em>Type Of Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.TypeOfExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl#getTypeOfExpression()
		 * @generated
		 */
		EClass TYPE_OF_EXPRESSION = eINSTANCE.getTypeOfExpression();

		/**
		 * The meta object literal for the '<em><b>Object Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_OF_EXPRESSION__OBJECT_EXPRESSION = eINSTANCE.getTypeOfExpression_ObjectExpression();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_OF_EXPRESSION__ELEMENT_NAME = eINSTANCE.getTypeOfExpression_ElementName();

	}

} //LogicalPackage
