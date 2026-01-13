/**
 */
package hu.blackbelt.judo.meta.psm.data;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.type.TypePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see hu.blackbelt.judo.meta.psm.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "data";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/psm/data";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "data";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DataPackage eINSTANCE = hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl <em>Entity Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getEntityType()
	 * @generated
	 */
	int ENTITY_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__NAME = TypePackage.TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__DOCUMENTATION = TypePackage.TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ANNOTATIONS = TypePackage.TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Super Entity Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__SUPER_ENTITY_TYPES = TypePackage.TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ABSTRACT = TypePackage.TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__ATTRIBUTES = TypePackage.TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__RELATIONS = TypePackage.TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Data Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__DATA_PROPERTIES = TypePackage.TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Navigation Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__NAVIGATION_PROPERTIES = TypePackage.TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Sequences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__SEQUENCES = TypePackage.TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__OPERATIONS = TypePackage.TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__CONSTRAINTS = TypePackage.TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Default Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE__DEFAULT_REPRESENTATION = TypePackage.TYPE_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_FEATURE_COUNT = TypePackage.TYPE_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_NAMESPACE = TypePackage.TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Get All Super Entity Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_ALL_SUPER_ENTITY_TYPES = TypePackage.TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_ATTRIBUTE__STRING = TypePackage.TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Reference</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_REFERENCE__STRING = TypePackage.TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Attribute Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_ATTRIBUTE_TYPE__STRING = TypePackage.TYPE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___TO_STRING = TypePackage.TYPE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Container</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___IS_CONTAINER = TypePackage.TYPE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Containment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___IS_CONTAINMENT = TypePackage.TYPE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Get All Relations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_ALL_RELATIONS = TypePackage.TYPE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Get All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_ALL_ATTRIBUTES = TypePackage.TYPE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Get All Data Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_ALL_DATA_PROPERTIES = TypePackage.TYPE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Get All Navigation Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_ALL_NAVIGATION_PROPERTIES = TypePackage.TYPE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Get All Sequences</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_ALL_SEQUENCES = TypePackage.TYPE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Get Inherited Operation Implementation By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_INHERITED_OPERATION_IMPLEMENTATION_BY_NAME__STRING = TypePackage.TYPE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Get Inherited Operation Implementations By Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_INHERITED_OPERATION_IMPLEMENTATIONS_BY_NAME__STRING = TypePackage.TYPE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Get Inherited Operation Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_INHERITED_OPERATION_NAMES = TypePackage.TYPE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Get All Operation Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE___GET_ALL_OPERATION_NAMES = TypePackage.TYPE_OPERATION_COUNT + 15;

	/**
	 * The number of operations of the '<em>Entity Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_TYPE_OPERATION_COUNT = TypePackage.TYPE_OPERATION_COUNT + 16;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.ReferenceTypedElementImpl <em>Reference Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.data.impl.ReferenceTypedElementImpl
	 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getReferenceTypedElement()
	 * @generated
	 */
	int REFERENCE_TYPED_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPED_ELEMENT__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPED_ELEMENT__DOCUMENTATION = NamespacePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPED_ELEMENT__ANNOTATIONS = NamespacePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPED_ELEMENT__TARGET = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPED_ELEMENT__CARDINALITY = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Reference Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPED_ELEMENT_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPED_ELEMENT___IS_COLLECTION = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPED_ELEMENT___IS_REQUIRED = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Entity Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPED_ELEMENT___GET_ENTITY_TYPE = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Reference Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPED_ELEMENT_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.data.impl.RelationImpl
	 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = REFERENCE_TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__DOCUMENTATION = REFERENCE_TYPED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ANNOTATIONS = REFERENCE_TYPED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__TARGET = REFERENCE_TYPED_ELEMENT__TARGET;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__CARDINALITY = REFERENCE_TYPED_ELEMENT__CARDINALITY;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = REFERENCE_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___IS_COLLECTION = REFERENCE_TYPED_ELEMENT___IS_COLLECTION;

	/**
	 * The operation id for the '<em>Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___IS_REQUIRED = REFERENCE_TYPED_ELEMENT___IS_REQUIRED;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___TO_STRING = REFERENCE_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Entity Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION___GET_ENTITY_TYPE = REFERENCE_TYPED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = REFERENCE_TYPED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.PrimitiveTypedElementImpl <em>Primitive Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.data.impl.PrimitiveTypedElementImpl
	 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getPrimitiveTypedElement()
	 * @generated
	 */
	int PRIMITIVE_TYPED_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPED_ELEMENT__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPED_ELEMENT__DOCUMENTATION = NamespacePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPED_ELEMENT__ANNOTATIONS = NamespacePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPED_ELEMENT__DATA_TYPE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPED_ELEMENT__REQUIRED = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primitive Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPED_ELEMENT_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Entity Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPED_ELEMENT___GET_ENTITY_TYPE = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPED_ELEMENT_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.data.impl.AttributeImpl
	 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = PRIMITIVE_TYPED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DOCUMENTATION = PRIMITIVE_TYPED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ANNOTATIONS = PRIMITIVE_TYPED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATA_TYPE = PRIMITIVE_TYPED_ELEMENT__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__REQUIRED = PRIMITIVE_TYPED_ELEMENT__REQUIRED;

	/**
	 * The feature id for the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IDENTIFIER = PRIMITIVE_TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unmapped Default Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__UNMAPPED_DEFAULT_ONLY = PRIMITIVE_TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = PRIMITIVE_TYPED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___TO_STRING = PRIMITIVE_TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___IS_PRIMITIVE = PRIMITIVE_TYPED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Entity Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE___GET_ENTITY_TYPE = PRIMITIVE_TYPED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = PRIMITIVE_TYPED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.AssociationEndImpl <em>Association End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.data.impl.AssociationEndImpl
	 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getAssociationEnd()
	 * @generated
	 */
	int ASSOCIATION_END = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__DOCUMENTATION = RELATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__ANNOTATIONS = RELATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__TARGET = RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__CARDINALITY = RELATION__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Partner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__PARTNER = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reverse Cascade Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__REVERSE_CASCADE_DELETE = RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Unmapped Default Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END__UNMAPPED_DEFAULT_ONLY = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Association End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END_FEATURE_COUNT = RELATION_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END___IS_COLLECTION = RELATION___IS_COLLECTION;

	/**
	 * The operation id for the '<em>Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END___IS_REQUIRED = RELATION___IS_REQUIRED;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END___TO_STRING = RELATION___TO_STRING;

	/**
	 * The operation id for the '<em>Get Entity Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END___GET_ENTITY_TYPE = RELATION___GET_ENTITY_TYPE;

	/**
	 * The operation id for the '<em>Get Opposite</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END___GET_OPPOSITE = RELATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Association End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_END_OPERATION_COUNT = RELATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.ContainmentImpl <em>Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.data.impl.ContainmentImpl
	 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getContainment()
	 * @generated
	 */
	int CONTAINMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT__DOCUMENTATION = RELATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT__ANNOTATIONS = RELATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT__TARGET = RELATION__TARGET;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT__CARDINALITY = RELATION__CARDINALITY;

	/**
	 * The number of structural features of the '<em>Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT___IS_COLLECTION = RELATION___IS_COLLECTION;

	/**
	 * The operation id for the '<em>Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT___IS_REQUIRED = RELATION___IS_REQUIRED;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT___TO_STRING = RELATION___TO_STRING;

	/**
	 * The operation id for the '<em>Get Entity Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT___GET_ENTITY_TYPE = RELATION___GET_ENTITY_TYPE;

	/**
	 * The number of operations of the '<em>Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINMENT_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.EntityMember <em>Entity Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.data.EntityMember
	 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getEntityMember()
	 * @generated
	 */
	int ENTITY_MEMBER = 7;

	/**
	 * The number of structural features of the '<em>Entity Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MEMBER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Entity Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_MEMBER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.data.impl.SequenceImpl
	 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__DOCUMENTATION = NamespacePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ANNOTATIONS = NamespacePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__INITIAL_VALUE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__INCREMENT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__MAXIMUM_VALUE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cyclic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__CYCLIC = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.EntitySequenceImpl <em>Entity Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.data.impl.EntitySequenceImpl
	 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getEntitySequence()
	 * @generated
	 */
	int ENTITY_SEQUENCE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SEQUENCE__NAME = ENTITY_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SEQUENCE__DOCUMENTATION = ENTITY_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SEQUENCE__ANNOTATIONS = ENTITY_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SEQUENCE__INITIAL_VALUE = ENTITY_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SEQUENCE__INCREMENT = ENTITY_MEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Maximum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SEQUENCE__MAXIMUM_VALUE = ENTITY_MEMBER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Cyclic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SEQUENCE__CYCLIC = ENTITY_MEMBER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Entity Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SEQUENCE_FEATURE_COUNT = ENTITY_MEMBER_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Entity Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_SEQUENCE_OPERATION_COUNT = ENTITY_MEMBER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.NamespaceSequenceImpl <em>Namespace Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.data.impl.NamespaceSequenceImpl
	 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getNamespaceSequence()
	 * @generated
	 */
	int NAMESPACE_SEQUENCE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SEQUENCE__NAME = SEQUENCE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SEQUENCE__DOCUMENTATION = SEQUENCE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SEQUENCE__ANNOTATIONS = SEQUENCE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SEQUENCE__INITIAL_VALUE = SEQUENCE__INITIAL_VALUE;

	/**
	 * The feature id for the '<em><b>Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SEQUENCE__INCREMENT = SEQUENCE__INCREMENT;

	/**
	 * The feature id for the '<em><b>Maximum Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SEQUENCE__MAXIMUM_VALUE = SEQUENCE__MAXIMUM_VALUE;

	/**
	 * The feature id for the '<em><b>Cyclic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SEQUENCE__CYCLIC = SEQUENCE__CYCLIC;

	/**
	 * The number of structural features of the '<em>Namespace Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SEQUENCE_FEATURE_COUNT = SEQUENCE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SEQUENCE___TO_STRING = SEQUENCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SEQUENCE___GET_NAMESPACE = SEQUENCE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Namespace Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMESPACE_SEQUENCE_OPERATION_COUNT = SEQUENCE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.BoundOperationImpl <em>Bound Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.data.impl.BoundOperationImpl
	 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getBoundOperation()
	 * @generated
	 */
	int BOUND_OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION__DOCUMENTATION = NamespacePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION__ANNOTATIONS = NamespacePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Faults</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION__FAULTS = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION__OUTPUT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION__INPUT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION__IMPLEMENTATION = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Instance Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION__INSTANCE_REPRESENTATION = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION__ABSTRACT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Bound Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Bound Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.OperationBodyImpl <em>Operation Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.data.impl.OperationBodyImpl
	 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getOperationBody()
	 * @generated
	 */
	int OPERATION_BODY = 12;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY__STATEFUL = 0;

	/**
	 * The feature id for the '<em><b>Custom Implementation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY__CUSTOM_IMPLEMENTATION = 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY__BODY = 2;

	/**
	 * The number of structural features of the '<em>Operation Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_BODY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType
	 * @generated
	 */
	EClass getEntityType();

	/**
	 * Returns the meta object for the reference list '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getSuperEntityTypes <em>Super Entity Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Entity Types</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getSuperEntityTypes()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_SuperEntityTypes();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.EntityType#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#isAbstract()
	 * @see #getEntityType()
	 * @generated
	 */
	EAttribute getEntityType_Abstract();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getAttributes()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getRelations()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Relations();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getDataProperties <em>Data Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Properties</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getDataProperties()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_DataProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getNavigationProperties <em>Navigation Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Navigation Properties</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getNavigationProperties()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_NavigationProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getSequences <em>Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequences</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getSequences()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Sequences();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getOperations()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getConstraints()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_Constraints();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getDefaultRepresentation <em>Default Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Representation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getDefaultRepresentation()
	 * @see #getEntityType()
	 * @generated
	 */
	EReference getEntityType_DefaultRepresentation();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getAllSuperEntityTypes() <em>Get All Super Entity Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Super Entity Types</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getAllSuperEntityTypes()
	 * @generated
	 */
	EOperation getEntityType__GetAllSuperEntityTypes();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getAttribute(java.lang.String) <em>Get Attribute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getAttribute(java.lang.String)
	 * @generated
	 */
	EOperation getEntityType__GetAttribute__String();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getReference(java.lang.String) <em>Get Reference</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reference</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getReference(java.lang.String)
	 * @generated
	 */
	EOperation getEntityType__GetReference__String();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getAttributeType(java.lang.String) <em>Get Attribute Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Attribute Type</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getAttributeType(java.lang.String)
	 * @generated
	 */
	EOperation getEntityType__GetAttributeType__String();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#toString()
	 * @generated
	 */
	EOperation getEntityType__ToString();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#isContainer() <em>Is Container</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Container</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#isContainer()
	 * @generated
	 */
	EOperation getEntityType__IsContainer();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#isContainment() <em>Is Containment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Containment</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#isContainment()
	 * @generated
	 */
	EOperation getEntityType__IsContainment();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getAllRelations() <em>Get All Relations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Relations</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getAllRelations()
	 * @generated
	 */
	EOperation getEntityType__GetAllRelations();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getAllAttributes() <em>Get All Attributes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Attributes</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getAllAttributes()
	 * @generated
	 */
	EOperation getEntityType__GetAllAttributes();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getAllDataProperties() <em>Get All Data Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Data Properties</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getAllDataProperties()
	 * @generated
	 */
	EOperation getEntityType__GetAllDataProperties();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getAllNavigationProperties() <em>Get All Navigation Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Navigation Properties</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getAllNavigationProperties()
	 * @generated
	 */
	EOperation getEntityType__GetAllNavigationProperties();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getAllSequences() <em>Get All Sequences</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Sequences</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getAllSequences()
	 * @generated
	 */
	EOperation getEntityType__GetAllSequences();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getInheritedOperationImplementationByName(java.lang.String) <em>Get Inherited Operation Implementation By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inherited Operation Implementation By Name</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getInheritedOperationImplementationByName(java.lang.String)
	 * @generated
	 */
	EOperation getEntityType__GetInheritedOperationImplementationByName__String();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getInheritedOperationImplementationsByName(java.lang.String) <em>Get Inherited Operation Implementations By Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inherited Operation Implementations By Name</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getInheritedOperationImplementationsByName(java.lang.String)
	 * @generated
	 */
	EOperation getEntityType__GetInheritedOperationImplementationsByName__String();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getInheritedOperationNames() <em>Get Inherited Operation Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Inherited Operation Names</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getInheritedOperationNames()
	 * @generated
	 */
	EOperation getEntityType__GetInheritedOperationNames();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getAllOperationNames() <em>Get All Operation Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Operation Names</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityType#getAllOperationNames()
	 * @generated
	 */
	EOperation getEntityType__GetAllOperationNames();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.Relation#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.Relation#toString()
	 * @generated
	 */
	EOperation getRelation__ToString();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.Relation#getEntityType() <em>Get Entity Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entity Type</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.Relation#getEntityType()
	 * @generated
	 */
	EOperation getRelation__GetEntityType();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.Attribute#isIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identifier</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.Attribute#isIdentifier()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Identifier();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.Attribute#isUnmappedDefaultOnly <em>Unmapped Default Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unmapped Default Only</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.Attribute#isUnmappedDefaultOnly()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_UnmappedDefaultOnly();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.Attribute#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.Attribute#toString()
	 * @generated
	 */
	EOperation getAttribute__ToString();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.Attribute#isPrimitive() <em>Is Primitive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Primitive</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.Attribute#isPrimitive()
	 * @generated
	 */
	EOperation getAttribute__IsPrimitive();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.Attribute#getEntityType() <em>Get Entity Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entity Type</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.Attribute#getEntityType()
	 * @generated
	 */
	EOperation getAttribute__GetEntityType();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.AssociationEnd <em>Association End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association End</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.AssociationEnd
	 * @generated
	 */
	EClass getAssociationEnd();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.data.AssociationEnd#getPartner <em>Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partner</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.AssociationEnd#getPartner()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EReference getAssociationEnd_Partner();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.AssociationEnd#isReverseCascadeDelete <em>Reverse Cascade Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse Cascade Delete</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.AssociationEnd#isReverseCascadeDelete()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EAttribute getAssociationEnd_ReverseCascadeDelete();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.AssociationEnd#isUnmappedDefaultOnly <em>Unmapped Default Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unmapped Default Only</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.AssociationEnd#isUnmappedDefaultOnly()
	 * @see #getAssociationEnd()
	 * @generated
	 */
	EAttribute getAssociationEnd_UnmappedDefaultOnly();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.AssociationEnd#getOpposite() <em>Get Opposite</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Opposite</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.AssociationEnd#getOpposite()
	 * @generated
	 */
	EOperation getAssociationEnd__GetOpposite();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement <em>Reference Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Typed Element</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement
	 * @generated
	 */
	EClass getReferenceTypedElement();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement#getTarget()
	 * @see #getReferenceTypedElement()
	 * @generated
	 */
	EReference getReferenceTypedElement_Target();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement#getCardinality()
	 * @see #getReferenceTypedElement()
	 * @generated
	 */
	EReference getReferenceTypedElement_Cardinality();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement#isCollection() <em>Is Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Collection</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement#isCollection()
	 * @generated
	 */
	EOperation getReferenceTypedElement__IsCollection();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement#isRequired() <em>Is Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Required</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement#isRequired()
	 * @generated
	 */
	EOperation getReferenceTypedElement__IsRequired();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement#getEntityType() <em>Get Entity Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entity Type</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement#getEntityType()
	 * @generated
	 */
	EOperation getReferenceTypedElement__GetEntityType();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement <em>Primitive Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Typed Element</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement
	 * @generated
	 */
	EClass getPrimitiveTypedElement();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement#getDataType()
	 * @see #getPrimitiveTypedElement()
	 * @generated
	 */
	EReference getPrimitiveTypedElement_DataType();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement#isRequired()
	 * @see #getPrimitiveTypedElement()
	 * @generated
	 */
	EAttribute getPrimitiveTypedElement_Required();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement#getEntityType() <em>Get Entity Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entity Type</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement#getEntityType()
	 * @generated
	 */
	EOperation getPrimitiveTypedElement__GetEntityType();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.Containment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containment</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.Containment
	 * @generated
	 */
	EClass getContainment();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.EntityMember <em>Entity Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Member</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.EntityMember
	 * @generated
	 */
	EClass getEntityMember();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.Sequence#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initial Value</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.Sequence#getInitialValue()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_InitialValue();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.Sequence#getIncrement <em>Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increment</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.Sequence#getIncrement()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Increment();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.Sequence#getMaximumValue <em>Maximum Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Value</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.Sequence#getMaximumValue()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_MaximumValue();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.Sequence#isCyclic <em>Cyclic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cyclic</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.Sequence#isCyclic()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Cyclic();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.EntitySequence <em>Entity Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Sequence</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.EntitySequence
	 * @generated
	 */
	EClass getEntitySequence();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.NamespaceSequence <em>Namespace Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace Sequence</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.NamespaceSequence
	 * @generated
	 */
	EClass getNamespaceSequence();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.BoundOperation <em>Bound Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound Operation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.BoundOperation
	 * @generated
	 */
	EClass getBoundOperation();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.data.BoundOperation#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.BoundOperation#getImplementation()
	 * @see #getBoundOperation()
	 * @generated
	 */
	EReference getBoundOperation_Implementation();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.data.BoundOperation#getInstanceRepresentation <em>Instance Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instance Representation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.BoundOperation#getInstanceRepresentation()
	 * @see #getBoundOperation()
	 * @generated
	 */
	EReference getBoundOperation_InstanceRepresentation();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.BoundOperation#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.BoundOperation#isAbstract()
	 * @see #getBoundOperation()
	 * @generated
	 */
	EAttribute getBoundOperation_Abstract();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.OperationBody <em>Operation Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Body</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.OperationBody
	 * @generated
	 */
	EClass getOperationBody();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.OperationBody#isStateful <em>Stateful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stateful</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.OperationBody#isStateful()
	 * @see #getOperationBody()
	 * @generated
	 */
	EAttribute getOperationBody_Stateful();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.OperationBody#isCustomImplementation <em>Custom Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Implementation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.OperationBody#isCustomImplementation()
	 * @see #getOperationBody()
	 * @generated
	 */
	EAttribute getOperationBody_CustomImplementation();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.OperationBody#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see hu.blackbelt.judo.meta.psm.data.OperationBody#getBody()
	 * @see #getOperationBody()
	 * @generated
	 */
	EAttribute getOperationBody_Body();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DataFactory getDataFactory();

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
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl <em>Entity Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getEntityType()
		 * @generated
		 */
		EClass ENTITY_TYPE = eINSTANCE.getEntityType();

		/**
		 * The meta object literal for the '<em><b>Super Entity Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__SUPER_ENTITY_TYPES = eINSTANCE.getEntityType_SuperEntityTypes();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY_TYPE__ABSTRACT = eINSTANCE.getEntityType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__ATTRIBUTES = eINSTANCE.getEntityType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__RELATIONS = eINSTANCE.getEntityType_Relations();

		/**
		 * The meta object literal for the '<em><b>Data Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__DATA_PROPERTIES = eINSTANCE.getEntityType_DataProperties();

		/**
		 * The meta object literal for the '<em><b>Navigation Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__NAVIGATION_PROPERTIES = eINSTANCE.getEntityType_NavigationProperties();

		/**
		 * The meta object literal for the '<em><b>Sequences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__SEQUENCES = eINSTANCE.getEntityType_Sequences();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__OPERATIONS = eINSTANCE.getEntityType_Operations();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__CONSTRAINTS = eINSTANCE.getEntityType_Constraints();

		/**
		 * The meta object literal for the '<em><b>Default Representation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY_TYPE__DEFAULT_REPRESENTATION = eINSTANCE.getEntityType_DefaultRepresentation();

		/**
		 * The meta object literal for the '<em><b>Get All Super Entity Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___GET_ALL_SUPER_ENTITY_TYPES = eINSTANCE.getEntityType__GetAllSuperEntityTypes();

		/**
		 * The meta object literal for the '<em><b>Get Attribute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___GET_ATTRIBUTE__STRING = eINSTANCE.getEntityType__GetAttribute__String();

		/**
		 * The meta object literal for the '<em><b>Get Reference</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___GET_REFERENCE__STRING = eINSTANCE.getEntityType__GetReference__String();

		/**
		 * The meta object literal for the '<em><b>Get Attribute Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___GET_ATTRIBUTE_TYPE__STRING = eINSTANCE.getEntityType__GetAttributeType__String();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___TO_STRING = eINSTANCE.getEntityType__ToString();

		/**
		 * The meta object literal for the '<em><b>Is Container</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___IS_CONTAINER = eINSTANCE.getEntityType__IsContainer();

		/**
		 * The meta object literal for the '<em><b>Is Containment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___IS_CONTAINMENT = eINSTANCE.getEntityType__IsContainment();

		/**
		 * The meta object literal for the '<em><b>Get All Relations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___GET_ALL_RELATIONS = eINSTANCE.getEntityType__GetAllRelations();

		/**
		 * The meta object literal for the '<em><b>Get All Attributes</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___GET_ALL_ATTRIBUTES = eINSTANCE.getEntityType__GetAllAttributes();

		/**
		 * The meta object literal for the '<em><b>Get All Data Properties</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___GET_ALL_DATA_PROPERTIES = eINSTANCE.getEntityType__GetAllDataProperties();

		/**
		 * The meta object literal for the '<em><b>Get All Navigation Properties</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___GET_ALL_NAVIGATION_PROPERTIES = eINSTANCE.getEntityType__GetAllNavigationProperties();

		/**
		 * The meta object literal for the '<em><b>Get All Sequences</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___GET_ALL_SEQUENCES = eINSTANCE.getEntityType__GetAllSequences();

		/**
		 * The meta object literal for the '<em><b>Get Inherited Operation Implementation By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___GET_INHERITED_OPERATION_IMPLEMENTATION_BY_NAME__STRING = eINSTANCE.getEntityType__GetInheritedOperationImplementationByName__String();

		/**
		 * The meta object literal for the '<em><b>Get Inherited Operation Implementations By Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___GET_INHERITED_OPERATION_IMPLEMENTATIONS_BY_NAME__STRING = eINSTANCE.getEntityType__GetInheritedOperationImplementationsByName__String();

		/**
		 * The meta object literal for the '<em><b>Get Inherited Operation Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___GET_INHERITED_OPERATION_NAMES = eINSTANCE.getEntityType__GetInheritedOperationNames();

		/**
		 * The meta object literal for the '<em><b>Get All Operation Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTITY_TYPE___GET_ALL_OPERATION_NAMES = eINSTANCE.getEntityType__GetAllOperationNames();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.data.impl.RelationImpl
		 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___TO_STRING = eINSTANCE.getRelation__ToString();

		/**
		 * The meta object literal for the '<em><b>Get Entity Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RELATION___GET_ENTITY_TYPE = eINSTANCE.getRelation__GetEntityType();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.data.impl.AttributeImpl
		 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IDENTIFIER = eINSTANCE.getAttribute_Identifier();

		/**
		 * The meta object literal for the '<em><b>Unmapped Default Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__UNMAPPED_DEFAULT_ONLY = eINSTANCE.getAttribute_UnmappedDefaultOnly();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE___TO_STRING = eINSTANCE.getAttribute__ToString();

		/**
		 * The meta object literal for the '<em><b>Is Primitive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE___IS_PRIMITIVE = eINSTANCE.getAttribute__IsPrimitive();

		/**
		 * The meta object literal for the '<em><b>Get Entity Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE___GET_ENTITY_TYPE = eINSTANCE.getAttribute__GetEntityType();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.impl.AssociationEndImpl <em>Association End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.data.impl.AssociationEndImpl
		 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getAssociationEnd()
		 * @generated
		 */
		EClass ASSOCIATION_END = eINSTANCE.getAssociationEnd();

		/**
		 * The meta object literal for the '<em><b>Partner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_END__PARTNER = eINSTANCE.getAssociationEnd_Partner();

		/**
		 * The meta object literal for the '<em><b>Reverse Cascade Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_END__REVERSE_CASCADE_DELETE = eINSTANCE.getAssociationEnd_ReverseCascadeDelete();

		/**
		 * The meta object literal for the '<em><b>Unmapped Default Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION_END__UNMAPPED_DEFAULT_ONLY = eINSTANCE.getAssociationEnd_UnmappedDefaultOnly();

		/**
		 * The meta object literal for the '<em><b>Get Opposite</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ASSOCIATION_END___GET_OPPOSITE = eINSTANCE.getAssociationEnd__GetOpposite();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.impl.ReferenceTypedElementImpl <em>Reference Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.data.impl.ReferenceTypedElementImpl
		 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getReferenceTypedElement()
		 * @generated
		 */
		EClass REFERENCE_TYPED_ELEMENT = eINSTANCE.getReferenceTypedElement();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPED_ELEMENT__TARGET = eINSTANCE.getReferenceTypedElement_Target();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPED_ELEMENT__CARDINALITY = eINSTANCE.getReferenceTypedElement_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Is Collection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERENCE_TYPED_ELEMENT___IS_COLLECTION = eINSTANCE.getReferenceTypedElement__IsCollection();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERENCE_TYPED_ELEMENT___IS_REQUIRED = eINSTANCE.getReferenceTypedElement__IsRequired();

		/**
		 * The meta object literal for the '<em><b>Get Entity Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REFERENCE_TYPED_ELEMENT___GET_ENTITY_TYPE = eINSTANCE.getReferenceTypedElement__GetEntityType();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.impl.PrimitiveTypedElementImpl <em>Primitive Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.data.impl.PrimitiveTypedElementImpl
		 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getPrimitiveTypedElement()
		 * @generated
		 */
		EClass PRIMITIVE_TYPED_ELEMENT = eINSTANCE.getPrimitiveTypedElement();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMITIVE_TYPED_ELEMENT__DATA_TYPE = eINSTANCE.getPrimitiveTypedElement_DataType();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_TYPED_ELEMENT__REQUIRED = eINSTANCE.getPrimitiveTypedElement_Required();

		/**
		 * The meta object literal for the '<em><b>Get Entity Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE_TYPED_ELEMENT___GET_ENTITY_TYPE = eINSTANCE.getPrimitiveTypedElement__GetEntityType();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.impl.ContainmentImpl <em>Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.data.impl.ContainmentImpl
		 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getContainment()
		 * @generated
		 */
		EClass CONTAINMENT = eINSTANCE.getContainment();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.EntityMember <em>Entity Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.data.EntityMember
		 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getEntityMember()
		 * @generated
		 */
		EClass ENTITY_MEMBER = eINSTANCE.getEntityMember();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.data.impl.SequenceImpl
		 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__INITIAL_VALUE = eINSTANCE.getSequence_InitialValue();

		/**
		 * The meta object literal for the '<em><b>Increment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__INCREMENT = eINSTANCE.getSequence_Increment();

		/**
		 * The meta object literal for the '<em><b>Maximum Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__MAXIMUM_VALUE = eINSTANCE.getSequence_MaximumValue();

		/**
		 * The meta object literal for the '<em><b>Cyclic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__CYCLIC = eINSTANCE.getSequence_Cyclic();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.impl.EntitySequenceImpl <em>Entity Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.data.impl.EntitySequenceImpl
		 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getEntitySequence()
		 * @generated
		 */
		EClass ENTITY_SEQUENCE = eINSTANCE.getEntitySequence();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.impl.NamespaceSequenceImpl <em>Namespace Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.data.impl.NamespaceSequenceImpl
		 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getNamespaceSequence()
		 * @generated
		 */
		EClass NAMESPACE_SEQUENCE = eINSTANCE.getNamespaceSequence();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.impl.BoundOperationImpl <em>Bound Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.data.impl.BoundOperationImpl
		 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getBoundOperation()
		 * @generated
		 */
		EClass BOUND_OPERATION = eINSTANCE.getBoundOperation();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUND_OPERATION__IMPLEMENTATION = eINSTANCE.getBoundOperation_Implementation();

		/**
		 * The meta object literal for the '<em><b>Instance Representation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUND_OPERATION__INSTANCE_REPRESENTATION = eINSTANCE.getBoundOperation_InstanceRepresentation();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUND_OPERATION__ABSTRACT = eINSTANCE.getBoundOperation_Abstract();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.impl.OperationBodyImpl <em>Operation Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.data.impl.OperationBodyImpl
		 * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getOperationBody()
		 * @generated
		 */
		EClass OPERATION_BODY = eINSTANCE.getOperationBody();

		/**
		 * The meta object literal for the '<em><b>Stateful</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_BODY__STATEFUL = eINSTANCE.getOperationBody_Stateful();

		/**
		 * The meta object literal for the '<em><b>Custom Implementation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_BODY__CUSTOM_IMPLEMENTATION = eINSTANCE.getOperationBody_CustomImplementation();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_BODY__BODY = eINSTANCE.getOperationBody_Body();

	}

} //DataPackage
