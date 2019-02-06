/**
 */
package hu.blackbelt.judo.meta.psm.expression.string;

import hu.blackbelt.judo.meta.psm.expression.ExpressionPackage;

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
 * @see hu.blackbelt.judo.meta.psm.expression.string.StringFactory
 * @model kind="package"
 * @generated
 */
public interface StringPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "string";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/expression/string";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "str";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StringPackage eINSTANCE = hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.StringAttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringAttributeImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getStringAttribute()
	 * @generated
	 */
	int STRING_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE__OBJECT_EXPRESSION = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE__ATTRIBUTE_NAME = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_FEATURE_COUNT = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ATTRIBUTE_OPERATION_COUNT = ExpressionPackage.STRING_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.ConcatenateImpl <em>Concatenate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.ConcatenateImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getConcatenate()
	 * @generated
	 */
	int CONCATENATE = 1;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE__LEFT = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE__RIGHT = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Concatenate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE_FEATURE_COUNT = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Concatenate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE_OPERATION_COUNT = ExpressionPackage.STRING_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.LowerCaseImpl <em>Lower Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.LowerCaseImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getLowerCase()
	 * @generated
	 */
	int LOWER_CASE = 2;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_CASE__EXPRESSION = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lower Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_CASE_FEATURE_COUNT = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Lower Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_CASE_OPERATION_COUNT = ExpressionPackage.STRING_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.UpperCaseImpl <em>Upper Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.UpperCaseImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getUpperCase()
	 * @generated
	 */
	int UPPER_CASE = 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_CASE__EXPRESSION = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Upper Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_CASE_FEATURE_COUNT = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Upper Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_CASE_OPERATION_COUNT = ExpressionPackage.STRING_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.LengthImpl <em>Length</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.LengthImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 4;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH__EXPRESSION = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_FEATURE_COUNT = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Length</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LENGTH_OPERATION_COUNT = ExpressionPackage.INTEGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.SubStringImpl <em>Sub String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.SubStringImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getSubString()
	 * @generated
	 */
	int SUB_STRING = 5;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STRING__EXPRESSION = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STRING__POSITION = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STRING__LENGTH = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sub String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STRING_FEATURE_COUNT = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sub String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_STRING_OPERATION_COUNT = ExpressionPackage.STRING_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.PositionImpl <em>Position</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.PositionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getPosition()
	 * @generated
	 */
	int POSITION = 6;

	/**
	 * The feature id for the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__CONTAINER = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION__CONTAINMENT = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_FEATURE_COUNT = ExpressionPackage.INTEGER_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Position</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POSITION_OPERATION_COUNT = ExpressionPackage.INTEGER_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.ReplaceImpl <em>Replace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.ReplaceImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getReplace()
	 * @generated
	 */
	int REPLACE = 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__EXPRESSION = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__PATTERN = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Replacement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE__REPLACEMENT = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Replace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_FEATURE_COUNT = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Replace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACE_OPERATION_COUNT = ExpressionPackage.STRING_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.TrimImpl <em>Trim</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.TrimImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getTrim()
	 * @generated
	 */
	int TRIM = 8;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIM__EXPRESSION = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIM_FEATURE_COUNT = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trim</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIM_OPERATION_COUNT = ExpressionPackage.STRING_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.StringSwitchExpressionImpl <em>Switch Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringSwitchExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getStringSwitchExpression()
	 * @generated
	 */
	int STRING_SWITCH_EXPRESSION = 9;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SWITCH_EXPRESSION__CASES = ExpressionPackage.SWITCH_EXPRESSION__CASES;

	/**
	 * The feature id for the '<em><b>Default Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SWITCH_EXPRESSION__DEFAULT_EXPRESSION = ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SWITCH_EXPRESSION_FEATURE_COUNT = ExpressionPackage.SWITCH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_SWITCH_EXPRESSION_OPERATION_COUNT = ExpressionPackage.SWITCH_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.ConcatenateCollectionImpl <em>Concatenate Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.ConcatenateCollectionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getConcatenateCollection()
	 * @generated
	 */
	int CONCATENATE_COLLECTION = 10;

	/**
	 * The feature id for the '<em><b>Collection Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE_COLLECTION__COLLECTION_EXPRESSION = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE_COLLECTION__EXPRESSION = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE_COLLECTION__SEPARATOR = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Concatenate Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE_COLLECTION_FEATURE_COUNT = ExpressionPackage.STRING_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Concatenate Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCATENATE_COLLECTION_OPERATION_COUNT = ExpressionPackage.STRING_EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.string.StringAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.StringAttribute
	 * @generated
	 */
	EClass getStringAttribute();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.string.Concatenate <em>Concatenate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concatenate</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.Concatenate
	 * @generated
	 */
	EClass getConcatenate();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.string.Concatenate#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.Concatenate#getLeft()
	 * @see #getConcatenate()
	 * @generated
	 */
	EReference getConcatenate_Left();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.string.Concatenate#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.Concatenate#getRight()
	 * @see #getConcatenate()
	 * @generated
	 */
	EReference getConcatenate_Right();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.string.LowerCase <em>Lower Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Case</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.LowerCase
	 * @generated
	 */
	EClass getLowerCase();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.string.LowerCase#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.LowerCase#getExpression()
	 * @see #getLowerCase()
	 * @generated
	 */
	EReference getLowerCase_Expression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.string.UpperCase <em>Upper Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upper Case</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.UpperCase
	 * @generated
	 */
	EClass getUpperCase();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.string.UpperCase#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.UpperCase#getExpression()
	 * @see #getUpperCase()
	 * @generated
	 */
	EReference getUpperCase_Expression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.string.Length <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Length</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.Length
	 * @generated
	 */
	EClass getLength();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.string.Length#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.Length#getExpression()
	 * @see #getLength()
	 * @generated
	 */
	EReference getLength_Expression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.string.SubString <em>Sub String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub String</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.SubString
	 * @generated
	 */
	EClass getSubString();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.string.SubString#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.SubString#getExpression()
	 * @see #getSubString()
	 * @generated
	 */
	EReference getSubString_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.string.SubString#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.SubString#getPosition()
	 * @see #getSubString()
	 * @generated
	 */
	EReference getSubString_Position();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.string.SubString#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Length</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.SubString#getLength()
	 * @see #getSubString()
	 * @generated
	 */
	EReference getSubString_Length();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.string.Position <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Position</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.Position
	 * @generated
	 */
	EClass getPosition();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.string.Position#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Container</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.Position#getContainer()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_Container();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.string.Position#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containment</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.Position#getContainment()
	 * @see #getPosition()
	 * @generated
	 */
	EReference getPosition_Containment();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.string.Replace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replace</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.Replace
	 * @generated
	 */
	EClass getReplace();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.string.Replace#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.Replace#getExpression()
	 * @see #getReplace()
	 * @generated
	 */
	EReference getReplace_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.string.Replace#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.Replace#getPattern()
	 * @see #getReplace()
	 * @generated
	 */
	EReference getReplace_Pattern();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.string.Replace#getReplacement <em>Replacement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Replacement</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.Replace#getReplacement()
	 * @see #getReplace()
	 * @generated
	 */
	EReference getReplace_Replacement();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.string.Trim <em>Trim</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trim</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.Trim
	 * @generated
	 */
	EClass getTrim();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.string.Trim#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.Trim#getExpression()
	 * @see #getTrim()
	 * @generated
	 */
	EReference getTrim_Expression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.string.StringSwitchExpression <em>Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.StringSwitchExpression
	 * @generated
	 */
	EClass getStringSwitchExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.string.ConcatenateCollection <em>Concatenate Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concatenate Collection</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.ConcatenateCollection
	 * @generated
	 */
	EClass getConcatenateCollection();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.string.ConcatenateCollection#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.ConcatenateCollection#getExpression()
	 * @see #getConcatenateCollection()
	 * @generated
	 */
	EReference getConcatenateCollection_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.string.ConcatenateCollection#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Separator</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.string.ConcatenateCollection#getSeparator()
	 * @see #getConcatenateCollection()
	 * @generated
	 */
	EReference getConcatenateCollection_Separator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StringFactory getStringFactory();

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
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.StringAttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringAttributeImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getStringAttribute()
		 * @generated
		 */
		EClass STRING_ATTRIBUTE = eINSTANCE.getStringAttribute();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.ConcatenateImpl <em>Concatenate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.ConcatenateImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getConcatenate()
		 * @generated
		 */
		EClass CONCATENATE = eINSTANCE.getConcatenate();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCATENATE__LEFT = eINSTANCE.getConcatenate_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCATENATE__RIGHT = eINSTANCE.getConcatenate_Right();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.LowerCaseImpl <em>Lower Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.LowerCaseImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getLowerCase()
		 * @generated
		 */
		EClass LOWER_CASE = eINSTANCE.getLowerCase();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOWER_CASE__EXPRESSION = eINSTANCE.getLowerCase_Expression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.UpperCaseImpl <em>Upper Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.UpperCaseImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getUpperCase()
		 * @generated
		 */
		EClass UPPER_CASE = eINSTANCE.getUpperCase();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UPPER_CASE__EXPRESSION = eINSTANCE.getUpperCase_Expression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.LengthImpl <em>Length</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.LengthImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getLength()
		 * @generated
		 */
		EClass LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LENGTH__EXPRESSION = eINSTANCE.getLength_Expression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.SubStringImpl <em>Sub String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.SubStringImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getSubString()
		 * @generated
		 */
		EClass SUB_STRING = eINSTANCE.getSubString();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_STRING__EXPRESSION = eINSTANCE.getSubString_Expression();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_STRING__POSITION = eINSTANCE.getSubString_Position();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_STRING__LENGTH = eINSTANCE.getSubString_Length();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.PositionImpl <em>Position</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.PositionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getPosition()
		 * @generated
		 */
		EClass POSITION = eINSTANCE.getPosition();

		/**
		 * The meta object literal for the '<em><b>Container</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__CONTAINER = eINSTANCE.getPosition_Container();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POSITION__CONTAINMENT = eINSTANCE.getPosition_Containment();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.ReplaceImpl <em>Replace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.ReplaceImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getReplace()
		 * @generated
		 */
		EClass REPLACE = eINSTANCE.getReplace();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACE__EXPRESSION = eINSTANCE.getReplace_Expression();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACE__PATTERN = eINSTANCE.getReplace_Pattern();

		/**
		 * The meta object literal for the '<em><b>Replacement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REPLACE__REPLACEMENT = eINSTANCE.getReplace_Replacement();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.TrimImpl <em>Trim</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.TrimImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getTrim()
		 * @generated
		 */
		EClass TRIM = eINSTANCE.getTrim();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIM__EXPRESSION = eINSTANCE.getTrim_Expression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.StringSwitchExpressionImpl <em>Switch Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringSwitchExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getStringSwitchExpression()
		 * @generated
		 */
		EClass STRING_SWITCH_EXPRESSION = eINSTANCE.getStringSwitchExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.string.impl.ConcatenateCollectionImpl <em>Concatenate Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.ConcatenateCollectionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl#getConcatenateCollection()
		 * @generated
		 */
		EClass CONCATENATE_COLLECTION = eINSTANCE.getConcatenateCollection();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCATENATE_COLLECTION__EXPRESSION = eINSTANCE.getConcatenateCollection_Expression();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCATENATE_COLLECTION__SEPARATOR = eINSTANCE.getConcatenateCollection_Separator();

	}

} //StringPackage
