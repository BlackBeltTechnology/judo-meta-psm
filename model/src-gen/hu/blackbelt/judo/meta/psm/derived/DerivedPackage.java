/**
 */
package hu.blackbelt.judo.meta.psm.derived;

import hu.blackbelt.judo.meta.psm.data.DataPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see hu.blackbelt.judo.meta.psm.derived.DerivedFactory
 * @model kind="package"
 * @generated
 */
public interface DerivedPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "derived";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/psm/derived";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "derived";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DerivedPackage eINSTANCE = hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.PrimitiveAccessorImpl <em>Primitive Accessor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.PrimitiveAccessorImpl
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getPrimitiveAccessor()
	 * @generated
	 */
	int PRIMITIVE_ACCESSOR = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ACCESSOR__NAME = DataPackage.PRIMITIVE_TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ACCESSOR__DOCUMENTATION = DataPackage.PRIMITIVE_TYPED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ACCESSOR__ANNOTATIONS = DataPackage.PRIMITIVE_TYPED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ACCESSOR__DATA_TYPE = DataPackage.PRIMITIVE_TYPED_ELEMENT__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ACCESSOR__REQUIRED = DataPackage.PRIMITIVE_TYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Getter Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ACCESSOR__GETTER_EXPRESSION = DataPackage.PRIMITIVE_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Setter Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ACCESSOR__SETTER_EXPRESSION = DataPackage.PRIMITIVE_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ACCESSOR_FEATURE_COUNT = DataPackage.PRIMITIVE_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Entity Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ACCESSOR___GET_ENTITY_TYPE = DataPackage.PRIMITIVE_TYPED_ELEMENT___GET_ENTITY_TYPE;

	/**
	 * The number of operations of the '<em>Primitive Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ACCESSOR_OPERATION_COUNT = DataPackage.PRIMITIVE_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.DataPropertyImpl <em>Data Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.DataPropertyImpl
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getDataProperty()
	 * @generated
	 */
	int DATA_PROPERTY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__NAME = PRIMITIVE_ACCESSOR__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__DOCUMENTATION = PRIMITIVE_ACCESSOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__ANNOTATIONS = PRIMITIVE_ACCESSOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__DATA_TYPE = PRIMITIVE_ACCESSOR__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__REQUIRED = PRIMITIVE_ACCESSOR__REQUIRED;

	/**
	 * The feature id for the '<em><b>Getter Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__GETTER_EXPRESSION = PRIMITIVE_ACCESSOR__GETTER_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Setter Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY__SETTER_EXPRESSION = PRIMITIVE_ACCESSOR__SETTER_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_FEATURE_COUNT = PRIMITIVE_ACCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY___IS_PRIMITIVE = PRIMITIVE_ACCESSOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Entity Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY___GET_ENTITY_TYPE = PRIMITIVE_ACCESSOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Data Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PROPERTY_OPERATION_COUNT = PRIMITIVE_ACCESSOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.ReferenceAccessorImpl <em>Reference Accessor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.ReferenceAccessorImpl
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getReferenceAccessor()
	 * @generated
	 */
	int REFERENCE_ACCESSOR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ACCESSOR__NAME = DataPackage.REFERENCE_TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ACCESSOR__DOCUMENTATION = DataPackage.REFERENCE_TYPED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ACCESSOR__ANNOTATIONS = DataPackage.REFERENCE_TYPED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ACCESSOR__TARGET = DataPackage.REFERENCE_TYPED_ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ACCESSOR__CARDINALITY = DataPackage.REFERENCE_TYPED_ELEMENT__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Getter Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ACCESSOR__GETTER_EXPRESSION = DataPackage.REFERENCE_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Setter Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ACCESSOR__SETTER_EXPRESSION = DataPackage.REFERENCE_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ACCESSOR_FEATURE_COUNT = DataPackage.REFERENCE_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ACCESSOR___IS_COLLECTION = DataPackage.REFERENCE_TYPED_ELEMENT___IS_COLLECTION;

	/**
	 * The operation id for the '<em>Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ACCESSOR___IS_REQUIRED = DataPackage.REFERENCE_TYPED_ELEMENT___IS_REQUIRED;

	/**
	 * The operation id for the '<em>Get Entity Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ACCESSOR___GET_ENTITY_TYPE = DataPackage.REFERENCE_TYPED_ELEMENT___GET_ENTITY_TYPE;

	/**
	 * The number of operations of the '<em>Reference Accessor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_ACCESSOR_OPERATION_COUNT = DataPackage.REFERENCE_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.NavigationPropertyImpl <em>Navigation Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.NavigationPropertyImpl
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getNavigationProperty()
	 * @generated
	 */
	int NAVIGATION_PROPERTY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROPERTY__NAME = REFERENCE_ACCESSOR__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROPERTY__DOCUMENTATION = REFERENCE_ACCESSOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROPERTY__ANNOTATIONS = REFERENCE_ACCESSOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROPERTY__TARGET = REFERENCE_ACCESSOR__TARGET;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROPERTY__CARDINALITY = REFERENCE_ACCESSOR__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Getter Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROPERTY__GETTER_EXPRESSION = REFERENCE_ACCESSOR__GETTER_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Setter Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROPERTY__SETTER_EXPRESSION = REFERENCE_ACCESSOR__SETTER_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Navigation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROPERTY_FEATURE_COUNT = REFERENCE_ACCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROPERTY___IS_COLLECTION = REFERENCE_ACCESSOR___IS_COLLECTION;

	/**
	 * The operation id for the '<em>Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROPERTY___IS_REQUIRED = REFERENCE_ACCESSOR___IS_REQUIRED;

	/**
	 * The operation id for the '<em>Get Entity Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROPERTY___GET_ENTITY_TYPE = REFERENCE_ACCESSOR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Navigation Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_PROPERTY_OPERATION_COUNT = REFERENCE_ACCESSOR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.StaticNavigationImpl <em>Static Navigation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.StaticNavigationImpl
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getStaticNavigation()
	 * @generated
	 */
	int STATIC_NAVIGATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION__NAME = REFERENCE_ACCESSOR__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION__DOCUMENTATION = REFERENCE_ACCESSOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION__ANNOTATIONS = REFERENCE_ACCESSOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION__TARGET = REFERENCE_ACCESSOR__TARGET;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION__CARDINALITY = REFERENCE_ACCESSOR__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Getter Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION__GETTER_EXPRESSION = REFERENCE_ACCESSOR__GETTER_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Setter Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION__SETTER_EXPRESSION = REFERENCE_ACCESSOR__SETTER_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Static Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION_FEATURE_COUNT = REFERENCE_ACCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION___IS_COLLECTION = REFERENCE_ACCESSOR___IS_COLLECTION;

	/**
	 * The operation id for the '<em>Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION___IS_REQUIRED = REFERENCE_ACCESSOR___IS_REQUIRED;

	/**
	 * The operation id for the '<em>Get Entity Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION___GET_ENTITY_TYPE = REFERENCE_ACCESSOR___GET_ENTITY_TYPE;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION___TO_STRING = REFERENCE_ACCESSOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION___GET_NAMESPACE = REFERENCE_ACCESSOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Static Navigation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_NAVIGATION_OPERATION_COUNT = REFERENCE_ACCESSOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.StaticDataImpl <em>Static Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.StaticDataImpl
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getStaticData()
	 * @generated
	 */
	int STATIC_DATA = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_DATA__NAME = PRIMITIVE_ACCESSOR__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_DATA__DOCUMENTATION = PRIMITIVE_ACCESSOR__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_DATA__ANNOTATIONS = PRIMITIVE_ACCESSOR__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_DATA__DATA_TYPE = PRIMITIVE_ACCESSOR__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_DATA__REQUIRED = PRIMITIVE_ACCESSOR__REQUIRED;

	/**
	 * The feature id for the '<em><b>Getter Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_DATA__GETTER_EXPRESSION = PRIMITIVE_ACCESSOR__GETTER_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Setter Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_DATA__SETTER_EXPRESSION = PRIMITIVE_ACCESSOR__SETTER_EXPRESSION;

	/**
	 * The number of structural features of the '<em>Static Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_DATA_FEATURE_COUNT = PRIMITIVE_ACCESSOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Entity Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_DATA___GET_ENTITY_TYPE = PRIMITIVE_ACCESSOR___GET_ENTITY_TYPE;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_DATA___TO_STRING = PRIMITIVE_ACCESSOR_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_DATA___GET_NAMESPACE = PRIMITIVE_ACCESSOR_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Static Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_DATA_OPERATION_COUNT = PRIMITIVE_ACCESSOR_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.ExpressionTypeImpl <em>Expression Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.ExpressionTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getExpressionType()
	 * @generated
	 */
	int EXPRESSION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Dialect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__DIALECT = 1;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE__PARAMETER_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.ReferenceExpressionTypeImpl <em>Reference Expression Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.ReferenceExpressionTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getReferenceExpressionType()
	 * @generated
	 */
	int REFERENCE_EXPRESSION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXPRESSION_TYPE__EXPRESSION = EXPRESSION_TYPE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Dialect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXPRESSION_TYPE__DIALECT = EXPRESSION_TYPE__DIALECT;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXPRESSION_TYPE__PARAMETER_TYPE = EXPRESSION_TYPE__PARAMETER_TYPE;

	/**
	 * The number of structural features of the '<em>Reference Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXPRESSION_TYPE_FEATURE_COUNT = EXPRESSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reference Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_EXPRESSION_TYPE_OPERATION_COUNT = EXPRESSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.ReferenceSelectorTypeImpl <em>Reference Selector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.ReferenceSelectorTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getReferenceSelectorType()
	 * @generated
	 */
	int REFERENCE_SELECTOR_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SELECTOR_TYPE__EXPRESSION = REFERENCE_EXPRESSION_TYPE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Dialect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SELECTOR_TYPE__DIALECT = REFERENCE_EXPRESSION_TYPE__DIALECT;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SELECTOR_TYPE__PARAMETER_TYPE = REFERENCE_EXPRESSION_TYPE__PARAMETER_TYPE;

	/**
	 * The number of structural features of the '<em>Reference Selector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SELECTOR_TYPE_FEATURE_COUNT = REFERENCE_EXPRESSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reference Selector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_SELECTOR_TYPE_OPERATION_COUNT = REFERENCE_EXPRESSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.DataExpressionTypeImpl <em>Data Expression Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.DataExpressionTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getDataExpressionType()
	 * @generated
	 */
	int DATA_EXPRESSION_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXPRESSION_TYPE__EXPRESSION = EXPRESSION_TYPE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Dialect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXPRESSION_TYPE__DIALECT = EXPRESSION_TYPE__DIALECT;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXPRESSION_TYPE__PARAMETER_TYPE = EXPRESSION_TYPE__PARAMETER_TYPE;

	/**
	 * The number of structural features of the '<em>Data Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXPRESSION_TYPE_FEATURE_COUNT = EXPRESSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXPRESSION_TYPE_OPERATION_COUNT = EXPRESSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.AttributeSelectorTypeImpl <em>Attribute Selector Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.AttributeSelectorTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getAttributeSelectorType()
	 * @generated
	 */
	int ATTRIBUTE_SELECTOR_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTOR_TYPE__EXPRESSION = DATA_EXPRESSION_TYPE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Dialect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTOR_TYPE__DIALECT = DATA_EXPRESSION_TYPE__DIALECT;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTOR_TYPE__PARAMETER_TYPE = DATA_EXPRESSION_TYPE__PARAMETER_TYPE;

	/**
	 * The number of structural features of the '<em>Attribute Selector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTOR_TYPE_FEATURE_COUNT = DATA_EXPRESSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute Selector Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_SELECTOR_TYPE_OPERATION_COUNT = DATA_EXPRESSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.LogicalExpressionTypeImpl <em>Logical Expression Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.LogicalExpressionTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getLogicalExpressionType()
	 * @generated
	 */
	int LOGICAL_EXPRESSION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_TYPE__EXPRESSION = DATA_EXPRESSION_TYPE__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Dialect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_TYPE__DIALECT = DATA_EXPRESSION_TYPE__DIALECT;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_TYPE__PARAMETER_TYPE = DATA_EXPRESSION_TYPE__PARAMETER_TYPE;

	/**
	 * The number of structural features of the '<em>Logical Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_TYPE_FEATURE_COUNT = DATA_EXPRESSION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Logical Expression Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_EXPRESSION_TYPE_OPERATION_COUNT = DATA_EXPRESSION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.derived.ExpressionDialect <em>Expression Dialect</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.derived.ExpressionDialect
	 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getExpressionDialect()
	 * @generated
	 */
	int EXPRESSION_DIALECT = 12;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.DataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Property</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.DataProperty
	 * @generated
	 */
	EClass getDataProperty();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.derived.DataProperty#isPrimitive() <em>Is Primitive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Primitive</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.derived.DataProperty#isPrimitive()
	 * @generated
	 */
	EOperation getDataProperty__IsPrimitive();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.derived.DataProperty#getEntityType() <em>Get Entity Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entity Type</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.derived.DataProperty#getEntityType()
	 * @generated
	 */
	EOperation getDataProperty__GetEntityType();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.NavigationProperty <em>Navigation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Property</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.NavigationProperty
	 * @generated
	 */
	EClass getNavigationProperty();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.derived.NavigationProperty#getEntityType() <em>Get Entity Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entity Type</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.derived.NavigationProperty#getEntityType()
	 * @generated
	 */
	EOperation getNavigationProperty__GetEntityType();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.StaticNavigation <em>Static Navigation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Navigation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.StaticNavigation
	 * @generated
	 */
	EClass getStaticNavigation();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor <em>Primitive Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Accessor</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor
	 * @generated
	 */
	EClass getPrimitiveAccessor();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor#getGetterExpression <em>Getter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Getter Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor#getGetterExpression()
	 * @see #getPrimitiveAccessor()
	 * @generated
	 */
	EReference getPrimitiveAccessor_GetterExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor#getSetterExpression <em>Setter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Setter Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor#getSetterExpression()
	 * @see #getPrimitiveAccessor()
	 * @generated
	 */
	EReference getPrimitiveAccessor_SetterExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.StaticData <em>Static Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Data</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.StaticData
	 * @generated
	 */
	EClass getStaticData();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor <em>Reference Accessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Accessor</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor
	 * @generated
	 */
	EClass getReferenceAccessor();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getGetterExpression <em>Getter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Getter Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getGetterExpression()
	 * @see #getReferenceAccessor()
	 * @generated
	 */
	EReference getReferenceAccessor_GetterExpression();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getSetterExpression <em>Setter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Setter Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor#getSetterExpression()
	 * @see #getReferenceAccessor()
	 * @generated
	 */
	EReference getReferenceAccessor_SetterExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.ExpressionType <em>Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.ExpressionType
	 * @generated
	 */
	EClass getExpressionType();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.derived.ExpressionType#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.ExpressionType#getExpression()
	 * @see #getExpressionType()
	 * @generated
	 */
	EAttribute getExpressionType_Expression();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.derived.ExpressionType#getDialect <em>Dialect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dialect</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.ExpressionType#getDialect()
	 * @see #getExpressionType()
	 * @generated
	 */
	EAttribute getExpressionType_Dialect();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.derived.ExpressionType#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parameter Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.ExpressionType#getParameterType()
	 * @see #getExpressionType()
	 * @generated
	 */
	EReference getExpressionType_ParameterType();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType <em>Reference Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Expression Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType
	 * @generated
	 */
	EClass getReferenceExpressionType();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.ReferenceSelectorType <em>Reference Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Selector Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.ReferenceSelectorType
	 * @generated
	 */
	EClass getReferenceSelectorType();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.DataExpressionType <em>Data Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Expression Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.DataExpressionType
	 * @generated
	 */
	EClass getDataExpressionType();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType <em>Attribute Selector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Selector Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType
	 * @generated
	 */
	EClass getAttributeSelectorType();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType <em>Logical Expression Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logical Expression Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType
	 * @generated
	 */
	EClass getLogicalExpressionType();

	/**
	 * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.derived.ExpressionDialect <em>Expression Dialect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expression Dialect</em>'.
	 * @see hu.blackbelt.judo.meta.psm.derived.ExpressionDialect
	 * @generated
	 */
	EEnum getExpressionDialect();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DerivedFactory getDerivedFactory();

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
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.DataPropertyImpl <em>Data Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.DataPropertyImpl
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getDataProperty()
		 * @generated
		 */
		EClass DATA_PROPERTY = eINSTANCE.getDataProperty();

		/**
		 * The meta object literal for the '<em><b>Is Primitive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PROPERTY___IS_PRIMITIVE = eINSTANCE.getDataProperty__IsPrimitive();

		/**
		 * The meta object literal for the '<em><b>Get Entity Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATA_PROPERTY___GET_ENTITY_TYPE = eINSTANCE.getDataProperty__GetEntityType();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.NavigationPropertyImpl <em>Navigation Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.NavigationPropertyImpl
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getNavigationProperty()
		 * @generated
		 */
		EClass NAVIGATION_PROPERTY = eINSTANCE.getNavigationProperty();

		/**
		 * The meta object literal for the '<em><b>Get Entity Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NAVIGATION_PROPERTY___GET_ENTITY_TYPE = eINSTANCE.getNavigationProperty__GetEntityType();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.StaticNavigationImpl <em>Static Navigation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.StaticNavigationImpl
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getStaticNavigation()
		 * @generated
		 */
		EClass STATIC_NAVIGATION = eINSTANCE.getStaticNavigation();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.PrimitiveAccessorImpl <em>Primitive Accessor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.PrimitiveAccessorImpl
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getPrimitiveAccessor()
		 * @generated
		 */
		EClass PRIMITIVE_ACCESSOR = eINSTANCE.getPrimitiveAccessor();

		/**
		 * The meta object literal for the '<em><b>Getter Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_ACCESSOR__GETTER_EXPRESSION = eINSTANCE.getPrimitiveAccessor_GetterExpression();

		/**
		 * The meta object literal for the '<em><b>Setter Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_ACCESSOR__SETTER_EXPRESSION = eINSTANCE.getPrimitiveAccessor_SetterExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.StaticDataImpl <em>Static Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.StaticDataImpl
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getStaticData()
		 * @generated
		 */
		EClass STATIC_DATA = eINSTANCE.getStaticData();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.ReferenceAccessorImpl <em>Reference Accessor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.ReferenceAccessorImpl
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getReferenceAccessor()
		 * @generated
		 */
		EClass REFERENCE_ACCESSOR = eINSTANCE.getReferenceAccessor();

		/**
		 * The meta object literal for the '<em><b>Getter Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_ACCESSOR__GETTER_EXPRESSION = eINSTANCE.getReferenceAccessor_GetterExpression();

		/**
		 * The meta object literal for the '<em><b>Setter Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_ACCESSOR__SETTER_EXPRESSION = eINSTANCE.getReferenceAccessor_SetterExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.ExpressionTypeImpl <em>Expression Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.ExpressionTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getExpressionType()
		 * @generated
		 */
		EClass EXPRESSION_TYPE = eINSTANCE.getExpressionType();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_TYPE__EXPRESSION = eINSTANCE.getExpressionType_Expression();

		/**
		 * The meta object literal for the '<em><b>Dialect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION_TYPE__DIALECT = eINSTANCE.getExpressionType_Dialect();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_TYPE__PARAMETER_TYPE = eINSTANCE.getExpressionType_ParameterType();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.ReferenceExpressionTypeImpl <em>Reference Expression Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.ReferenceExpressionTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getReferenceExpressionType()
		 * @generated
		 */
		EClass REFERENCE_EXPRESSION_TYPE = eINSTANCE.getReferenceExpressionType();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.ReferenceSelectorTypeImpl <em>Reference Selector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.ReferenceSelectorTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getReferenceSelectorType()
		 * @generated
		 */
		EClass REFERENCE_SELECTOR_TYPE = eINSTANCE.getReferenceSelectorType();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.DataExpressionTypeImpl <em>Data Expression Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.DataExpressionTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getDataExpressionType()
		 * @generated
		 */
		EClass DATA_EXPRESSION_TYPE = eINSTANCE.getDataExpressionType();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.AttributeSelectorTypeImpl <em>Attribute Selector Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.AttributeSelectorTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getAttributeSelectorType()
		 * @generated
		 */
		EClass ATTRIBUTE_SELECTOR_TYPE = eINSTANCE.getAttributeSelectorType();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.impl.LogicalExpressionTypeImpl <em>Logical Expression Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.LogicalExpressionTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getLogicalExpressionType()
		 * @generated
		 */
		EClass LOGICAL_EXPRESSION_TYPE = eINSTANCE.getLogicalExpressionType();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.derived.ExpressionDialect <em>Expression Dialect</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.derived.ExpressionDialect
		 * @see hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl#getExpressionDialect()
		 * @generated
		 */
		EEnum EXPRESSION_DIALECT = eINSTANCE.getExpressionDialect();

	}

} //DerivedPackage
