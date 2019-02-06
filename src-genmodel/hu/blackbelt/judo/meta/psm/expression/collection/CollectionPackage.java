/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection;

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
 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionFactory
 * @model kind="package"
 * @generated
 */
public interface CollectionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "collection";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/expression/collection";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "c";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CollectionPackage eINSTANCE = hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.ImmutableCollectionImpl <em>Immutable Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.ImmutableCollectionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getImmutableCollection()
	 * @generated
	 */
	int IMMUTABLE_COLLECTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUTABLE_COLLECTION__NAME = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUTABLE_COLLECTION__ELEMENT_NAME = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Immutable Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUTABLE_COLLECTION_FEATURE_COUNT = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Immutable Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMMUTABLE_COLLECTION_OPERATION_COUNT = ExpressionPackage.COLLECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionFilterExpressionImpl <em>Filter Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionFilterExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getCollectionFilterExpression()
	 * @generated
	 */
	int COLLECTION_FILTER_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Collection Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FILTER_EXPRESSION__COLLECTION_EXPRESSION = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FILTER_EXPRESSION__CONDITION = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Filter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FILTER_EXPRESSION_FEATURE_COUNT = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Filter Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FILTER_EXPRESSION_OPERATION_COUNT = ExpressionPackage.COLLECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionVariableReferenceImpl <em>Variable Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionVariableReferenceImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getCollectionVariableReference()
	 * @generated
	 */
	int COLLECTION_VARIABLE_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE_REFERENCE__VARIABLE = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE_REFERENCE_FEATURE_COUNT = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_VARIABLE_REFERENCE_OPERATION_COUNT = ExpressionPackage.COLLECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionNavigationFromObjectExpressionImpl <em>Navigation From Object Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionNavigationFromObjectExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getCollectionNavigationFromObjectExpression()
	 * @generated
	 */
	int COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__NAME = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__REFERENCE_NAME = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Object Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__OBJECT_EXPRESSION = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Navigation From Object Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION_FEATURE_COUNT = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Navigation From Object Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION_OPERATION_COUNT = ExpressionPackage.COLLECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionNavigationFromCollectionExpressionImpl <em>Navigation From Collection Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionNavigationFromCollectionExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getCollectionNavigationFromCollectionExpression()
	 * @generated
	 */
	int COLLECTION_NAVIGATION_FROM_COLLECTION_EXPRESSION = 4;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_NAVIGATION_FROM_COLLECTION_EXPRESSION__REFERENCE_NAME = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_NAVIGATION_FROM_COLLECTION_EXPRESSION__NAME = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collection Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_NAVIGATION_FROM_COLLECTION_EXPRESSION__COLLECTION_EXPRESSION = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Navigation From Collection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_NAVIGATION_FROM_COLLECTION_EXPRESSION_FEATURE_COUNT = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Navigation From Collection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_NAVIGATION_FROM_COLLECTION_EXPRESSION_OPERATION_COUNT = ExpressionPackage.COLLECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.SortExpressionImpl <em>Sort Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.SortExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getSortExpression()
	 * @generated
	 */
	int SORT_EXPRESSION = 5;

	/**
	 * The feature id for the '<em><b>Collection Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_EXPRESSION__COLLECTION_EXPRESSION = ExpressionPackage.ORDERED_COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Order By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_EXPRESSION__ORDER_BY = ExpressionPackage.ORDERED_COLLECTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sort Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_EXPRESSION_FEATURE_COUNT = ExpressionPackage.ORDERED_COLLECTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sort Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_EXPRESSION_OPERATION_COUNT = ExpressionPackage.ORDERED_COLLECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.SubCollectionExpressionImpl <em>Sub Collection Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.SubCollectionExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getSubCollectionExpression()
	 * @generated
	 */
	int SUB_COLLECTION_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Collection Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_EXPRESSION__COLLECTION_EXPRESSION = ExpressionPackage.ORDERED_COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_EXPRESSION__POSITION = ExpressionPackage.ORDERED_COLLECTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Length</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_EXPRESSION__LENGTH = ExpressionPackage.ORDERED_COLLECTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sub Collection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_EXPRESSION_FEATURE_COUNT = ExpressionPackage.ORDERED_COLLECTION_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Sub Collection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_COLLECTION_EXPRESSION_OPERATION_COUNT = ExpressionPackage.ORDERED_COLLECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.OrderByItemImpl <em>Order By Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.OrderByItemImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getOrderByItem()
	 * @generated
	 */
	int ORDER_BY_ITEM = 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_ITEM__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Descending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_ITEM__DESCENDING = 1;

	/**
	 * The number of structural features of the '<em>Order By Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Order By Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_BY_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.ObjectNavigationFromCollectionExpressionImpl <em>Object Navigation From Collection Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.ObjectNavigationFromCollectionExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getObjectNavigationFromCollectionExpression()
	 * @generated
	 */
	int OBJECT_NAVIGATION_FROM_COLLECTION_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NAVIGATION_FROM_COLLECTION_EXPRESSION__REFERENCE_NAME = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NAVIGATION_FROM_COLLECTION_EXPRESSION__NAME = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collection Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NAVIGATION_FROM_COLLECTION_EXPRESSION__COLLECTION_EXPRESSION = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object Navigation From Collection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NAVIGATION_FROM_COLLECTION_EXPRESSION_FEATURE_COUNT = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Object Navigation From Collection Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_NAVIGATION_FROM_COLLECTION_EXPRESSION_OPERATION_COUNT = ExpressionPackage.COLLECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.CastCollectionImpl <em>Cast Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CastCollectionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getCastCollection()
	 * @generated
	 */
	int CAST_COLLECTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_COLLECTION__NAME = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_COLLECTION__ELEMENT_NAME = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collection Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_COLLECTION__COLLECTION_EXPRESSION = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cast Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_COLLECTION_FEATURE_COUNT = ExpressionPackage.COLLECTION_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Cast Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_COLLECTION_OPERATION_COUNT = ExpressionPackage.COLLECTION_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionSwitchExpressionImpl <em>Switch Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionSwitchExpressionImpl
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getCollectionSwitchExpression()
	 * @generated
	 */
	int COLLECTION_SWITCH_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Cases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SWITCH_EXPRESSION__CASES = ExpressionPackage.SWITCH_EXPRESSION__CASES;

	/**
	 * The feature id for the '<em><b>Default Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SWITCH_EXPRESSION__DEFAULT_EXPRESSION = ExpressionPackage.SWITCH_EXPRESSION__DEFAULT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Element Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SWITCH_EXPRESSION__ELEMENT_NAME = ExpressionPackage.SWITCH_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SWITCH_EXPRESSION_FEATURE_COUNT = ExpressionPackage.SWITCH_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Switch Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_SWITCH_EXPRESSION_OPERATION_COUNT = ExpressionPackage.SWITCH_EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.collection.ImmutableCollection <em>Immutable Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Immutable Collection</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.ImmutableCollection
	 * @generated
	 */
	EClass getImmutableCollection();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.collection.ImmutableCollection#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.ImmutableCollection#getElementName()
	 * @see #getImmutableCollection()
	 * @generated
	 */
	EReference getImmutableCollection_ElementName();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionFilterExpression <em>Filter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionFilterExpression
	 * @generated
	 */
	EClass getCollectionFilterExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionFilterExpression#getCollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionFilterExpression#getCollectionExpression()
	 * @see #getCollectionFilterExpression()
	 * @generated
	 */
	EReference getCollectionFilterExpression_CollectionExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionFilterExpression#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionFilterExpression#getCondition()
	 * @see #getCollectionFilterExpression()
	 * @generated
	 */
	EReference getCollectionFilterExpression_Condition();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionVariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Reference</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionVariableReference
	 * @generated
	 */
	EClass getCollectionVariableReference();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionVariableReference#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionVariableReference#getVariable()
	 * @see #getCollectionVariableReference()
	 * @generated
	 */
	EReference getCollectionVariableReference_Variable();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromObjectExpression <em>Navigation From Object Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation From Object Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromObjectExpression
	 * @generated
	 */
	EClass getCollectionNavigationFromObjectExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromObjectExpression#getObjectExpression <em>Object Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromObjectExpression#getObjectExpression()
	 * @see #getCollectionNavigationFromObjectExpression()
	 * @generated
	 */
	EReference getCollectionNavigationFromObjectExpression_ObjectExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromCollectionExpression <em>Navigation From Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation From Collection Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromCollectionExpression
	 * @generated
	 */
	EClass getCollectionNavigationFromCollectionExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromCollectionExpression#getCollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromCollectionExpression#getCollectionExpression()
	 * @see #getCollectionNavigationFromCollectionExpression()
	 * @generated
	 */
	EReference getCollectionNavigationFromCollectionExpression_CollectionExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.collection.SortExpression <em>Sort Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.SortExpression
	 * @generated
	 */
	EClass getSortExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.collection.SortExpression#getCollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.SortExpression#getCollectionExpression()
	 * @see #getSortExpression()
	 * @generated
	 */
	EReference getSortExpression_CollectionExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.expression.collection.SortExpression#getOrderBy <em>Order By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Order By</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.SortExpression#getOrderBy()
	 * @see #getSortExpression()
	 * @generated
	 */
	EReference getSortExpression_OrderBy();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression <em>Sub Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Collection Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression
	 * @generated
	 */
	EClass getSubCollectionExpression();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression#getCollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Collection Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression#getCollectionExpression()
	 * @see #getSubCollectionExpression()
	 * @generated
	 */
	EReference getSubCollectionExpression_CollectionExpression();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression#getPosition()
	 * @see #getSubCollectionExpression()
	 * @generated
	 */
	EReference getSubCollectionExpression_Position();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Length</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression#getLength()
	 * @see #getSubCollectionExpression()
	 * @generated
	 */
	EReference getSubCollectionExpression_Length();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.collection.OrderByItem <em>Order By Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order By Item</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.OrderByItem
	 * @generated
	 */
	EClass getOrderByItem();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.collection.OrderByItem#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.OrderByItem#getExpression()
	 * @see #getOrderByItem()
	 * @generated
	 */
	EReference getOrderByItem_Expression();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.expression.collection.OrderByItem#isDescending <em>Descending</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Descending</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.OrderByItem#isDescending()
	 * @see #getOrderByItem()
	 * @generated
	 */
	EAttribute getOrderByItem_Descending();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.collection.ObjectNavigationFromCollectionExpression <em>Object Navigation From Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Navigation From Collection Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.ObjectNavigationFromCollectionExpression
	 * @generated
	 */
	EClass getObjectNavigationFromCollectionExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.collection.ObjectNavigationFromCollectionExpression#getCollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.ObjectNavigationFromCollectionExpression#getCollectionExpression()
	 * @see #getObjectNavigationFromCollectionExpression()
	 * @generated
	 */
	EReference getObjectNavigationFromCollectionExpression_CollectionExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.collection.CastCollection <em>Cast Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cast Collection</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CastCollection
	 * @generated
	 */
	EClass getCastCollection();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.collection.CastCollection#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CastCollection#getElementName()
	 * @see #getCastCollection()
	 * @generated
	 */
	EReference getCastCollection_ElementName();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.expression.collection.CastCollection#getCollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Collection Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CastCollection#getCollectionExpression()
	 * @see #getCastCollection()
	 * @generated
	 */
	EReference getCastCollection_CollectionExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionSwitchExpression <em>Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionSwitchExpression
	 * @generated
	 */
	EClass getCollectionSwitchExpression();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionSwitchExpression#getElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Name</em>'.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionSwitchExpression#getElementName()
	 * @see #getCollectionSwitchExpression()
	 * @generated
	 */
	EReference getCollectionSwitchExpression_ElementName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CollectionFactory getCollectionFactory();

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
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.ImmutableCollectionImpl <em>Immutable Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.ImmutableCollectionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getImmutableCollection()
		 * @generated
		 */
		EClass IMMUTABLE_COLLECTION = eINSTANCE.getImmutableCollection();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMMUTABLE_COLLECTION__ELEMENT_NAME = eINSTANCE.getImmutableCollection_ElementName();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionFilterExpressionImpl <em>Filter Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionFilterExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getCollectionFilterExpression()
		 * @generated
		 */
		EClass COLLECTION_FILTER_EXPRESSION = eINSTANCE.getCollectionFilterExpression();

		/**
		 * The meta object literal for the '<em><b>Collection Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_FILTER_EXPRESSION__COLLECTION_EXPRESSION = eINSTANCE.getCollectionFilterExpression_CollectionExpression();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_FILTER_EXPRESSION__CONDITION = eINSTANCE.getCollectionFilterExpression_Condition();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionVariableReferenceImpl <em>Variable Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionVariableReferenceImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getCollectionVariableReference()
		 * @generated
		 */
		EClass COLLECTION_VARIABLE_REFERENCE = eINSTANCE.getCollectionVariableReference();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_VARIABLE_REFERENCE__VARIABLE = eINSTANCE.getCollectionVariableReference_Variable();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionNavigationFromObjectExpressionImpl <em>Navigation From Object Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionNavigationFromObjectExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getCollectionNavigationFromObjectExpression()
		 * @generated
		 */
		EClass COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION = eINSTANCE.getCollectionNavigationFromObjectExpression();

		/**
		 * The meta object literal for the '<em><b>Object Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__OBJECT_EXPRESSION = eINSTANCE.getCollectionNavigationFromObjectExpression_ObjectExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionNavigationFromCollectionExpressionImpl <em>Navigation From Collection Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionNavigationFromCollectionExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getCollectionNavigationFromCollectionExpression()
		 * @generated
		 */
		EClass COLLECTION_NAVIGATION_FROM_COLLECTION_EXPRESSION = eINSTANCE.getCollectionNavigationFromCollectionExpression();

		/**
		 * The meta object literal for the '<em><b>Collection Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_NAVIGATION_FROM_COLLECTION_EXPRESSION__COLLECTION_EXPRESSION = eINSTANCE.getCollectionNavigationFromCollectionExpression_CollectionExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.SortExpressionImpl <em>Sort Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.SortExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getSortExpression()
		 * @generated
		 */
		EClass SORT_EXPRESSION = eINSTANCE.getSortExpression();

		/**
		 * The meta object literal for the '<em><b>Collection Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT_EXPRESSION__COLLECTION_EXPRESSION = eINSTANCE.getSortExpression_CollectionExpression();

		/**
		 * The meta object literal for the '<em><b>Order By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT_EXPRESSION__ORDER_BY = eINSTANCE.getSortExpression_OrderBy();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.SubCollectionExpressionImpl <em>Sub Collection Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.SubCollectionExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getSubCollectionExpression()
		 * @generated
		 */
		EClass SUB_COLLECTION_EXPRESSION = eINSTANCE.getSubCollectionExpression();

		/**
		 * The meta object literal for the '<em><b>Collection Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_COLLECTION_EXPRESSION__COLLECTION_EXPRESSION = eINSTANCE.getSubCollectionExpression_CollectionExpression();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_COLLECTION_EXPRESSION__POSITION = eINSTANCE.getSubCollectionExpression_Position();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_COLLECTION_EXPRESSION__LENGTH = eINSTANCE.getSubCollectionExpression_Length();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.OrderByItemImpl <em>Order By Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.OrderByItemImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getOrderByItem()
		 * @generated
		 */
		EClass ORDER_BY_ITEM = eINSTANCE.getOrderByItem();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_BY_ITEM__EXPRESSION = eINSTANCE.getOrderByItem_Expression();

		/**
		 * The meta object literal for the '<em><b>Descending</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_BY_ITEM__DESCENDING = eINSTANCE.getOrderByItem_Descending();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.ObjectNavigationFromCollectionExpressionImpl <em>Object Navigation From Collection Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.ObjectNavigationFromCollectionExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getObjectNavigationFromCollectionExpression()
		 * @generated
		 */
		EClass OBJECT_NAVIGATION_FROM_COLLECTION_EXPRESSION = eINSTANCE.getObjectNavigationFromCollectionExpression();

		/**
		 * The meta object literal for the '<em><b>Collection Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_NAVIGATION_FROM_COLLECTION_EXPRESSION__COLLECTION_EXPRESSION = eINSTANCE.getObjectNavigationFromCollectionExpression_CollectionExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.CastCollectionImpl <em>Cast Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CastCollectionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getCastCollection()
		 * @generated
		 */
		EClass CAST_COLLECTION = eINSTANCE.getCastCollection();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST_COLLECTION__ELEMENT_NAME = eINSTANCE.getCastCollection_ElementName();

		/**
		 * The meta object literal for the '<em><b>Collection Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST_COLLECTION__COLLECTION_EXPRESSION = eINSTANCE.getCastCollection_CollectionExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionSwitchExpressionImpl <em>Switch Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionSwitchExpressionImpl
		 * @see hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl#getCollectionSwitchExpression()
		 * @generated
		 */
		EClass COLLECTION_SWITCH_EXPRESSION = eINSTANCE.getCollectionSwitchExpression();

		/**
		 * The meta object literal for the '<em><b>Element Name</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_SWITCH_EXPRESSION__ELEMENT_NAME = eINSTANCE.getCollectionSwitchExpression_ElementName();

	}

} //CollectionPackage
