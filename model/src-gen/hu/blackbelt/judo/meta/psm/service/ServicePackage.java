/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.type.TypePackage;

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
 * @see hu.blackbelt.judo.meta.psm.service.ServiceFactory
 * @model kind="package"
 * @generated
 */
public interface ServicePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "service";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/psm/service";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "service";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicePackage eINSTANCE = hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectTypeImpl <em>Transfer Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferObjectTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferObjectType()
	 * @generated
	 */
	int TRANSFER_OBJECT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_TYPE__NAME = TypePackage.DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_TYPE__DOCUMENTATION = TypePackage.DATA_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_TYPE__ANNOTATIONS = TypePackage.DATA_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_TYPE__REPRESENTATION = TypePackage.DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_TYPE__RELATIONS = TypePackage.DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_TYPE__ATTRIBUTES = TypePackage.DATA_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_TYPE__OPERATIONS = TypePackage.DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Actor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_TYPE__ACTOR_TYPE = TypePackage.DATA_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Override</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_TYPE__OVERRIDE = TypePackage.DATA_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Query Customizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_TYPE__QUERY_CUSTOMIZER = TypePackage.DATA_TYPE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Transfer Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_TYPE_FEATURE_COUNT = TypePackage.DATA_TYPE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_TYPE___TO_STRING = TypePackage.DATA_TYPE___TO_STRING;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_TYPE___GET_NAMESPACE = TypePackage.DATA_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Access Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_TYPE___IS_ACCESS_POINT = TypePackage.DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transfer Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_TYPE_OPERATION_COUNT = TypePackage.DATA_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectRelationImpl <em>Transfer Object Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferObjectRelationImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferObjectRelation()
	 * @generated
	 */
	int TRANSFER_OBJECT_RELATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION__DOCUMENTATION = NamespacePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION__ANNOTATIONS = NamespacePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION__CARDINALITY = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION__BINDING = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION__DEFAULT_VALUE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION__RANGE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION__TARGET = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION__EMBEDDED = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Embedded Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION__EMBEDDED_CREATE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Embedded Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION__EMBEDDED_UPDATE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Embedded Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION__EMBEDDED_DELETE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Access</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION__ACCESS = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Transfer Object Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 10;

	/**
	 * The operation id for the '<em>Is Collection</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION___IS_COLLECTION = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION___IS_REQUIRED = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Mutable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION___IS_MUTABLE = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is Navigable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION___IS_NAVIGABLE = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Exposed Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION___IS_EXPOSED_GRAPH = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Transfer Object Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_RELATION_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeImpl <em>Transfer Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferAttribute()
	 * @generated
	 */
	int TRANSFER_ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE__DOCUMENTATION = NamespacePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE__ANNOTATIONS = NamespacePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE__REQUIRED = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE__DEFAULT_VALUE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE__DATA_TYPE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE__BINDING = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Claim Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE__CLAIM_TYPE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Transfer Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Primitive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE___IS_PRIMITIVE = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transfer Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.MappedTransferObjectTypeImpl <em>Mapped Transfer Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.MappedTransferObjectTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getMappedTransferObjectType()
	 * @generated
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE__NAME = TRANSFER_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE__DOCUMENTATION = TRANSFER_OBJECT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE__ANNOTATIONS = TRANSFER_OBJECT_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE__REPRESENTATION = TRANSFER_OBJECT_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE__RELATIONS = TRANSFER_OBJECT_TYPE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE__ATTRIBUTES = TRANSFER_OBJECT_TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE__OPERATIONS = TRANSFER_OBJECT_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Actor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE__ACTOR_TYPE = TRANSFER_OBJECT_TYPE__ACTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Override</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE__OVERRIDE = TRANSFER_OBJECT_TYPE__OVERRIDE;

	/**
	 * The feature id for the '<em><b>Query Customizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE__QUERY_CUSTOMIZER = TRANSFER_OBJECT_TYPE__QUERY_CUSTOMIZER;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE = TRANSFER_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE__FILTER = TRANSFER_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Mapped Transfer Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE_FEATURE_COUNT = TRANSFER_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE___TO_STRING = TRANSFER_OBJECT_TYPE___TO_STRING;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE___GET_NAMESPACE = TRANSFER_OBJECT_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Access Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE___IS_ACCESS_POINT = TRANSFER_OBJECT_TYPE___IS_ACCESS_POINT;

	/**
	 * The operation id for the '<em>Is Abstract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE___IS_ABSTRACT = TRANSFER_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Instantiable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE___IS_INSTANTIABLE = TRANSFER_OBJECT_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mapped Transfer Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE_OPERATION_COUNT = TRANSFER_OBJECT_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.OperationDeclarationImpl <em>Operation Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.OperationDeclarationImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getOperationDeclaration()
	 * @generated
	 */
	int OPERATION_DECLARATION = 4;

	/**
	 * The feature id for the '<em><b>Faults</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DECLARATION__FAULTS = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DECLARATION__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DECLARATION__INPUT = 2;

	/**
	 * The number of structural features of the '<em>Operation Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DECLARATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_DECLARATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.UnmappedTransferObjectTypeImpl <em>Unmapped Transfer Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.UnmappedTransferObjectTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getUnmappedTransferObjectType()
	 * @generated
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE__NAME = TRANSFER_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE__DOCUMENTATION = TRANSFER_OBJECT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE__ANNOTATIONS = TRANSFER_OBJECT_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE__REPRESENTATION = TRANSFER_OBJECT_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE__RELATIONS = TRANSFER_OBJECT_TYPE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE__ATTRIBUTES = TRANSFER_OBJECT_TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE__OPERATIONS = TRANSFER_OBJECT_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Actor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE__ACTOR_TYPE = TRANSFER_OBJECT_TYPE__ACTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Override</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE__OVERRIDE = TRANSFER_OBJECT_TYPE__OVERRIDE;

	/**
	 * The feature id for the '<em><b>Query Customizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE__QUERY_CUSTOMIZER = TRANSFER_OBJECT_TYPE__QUERY_CUSTOMIZER;

	/**
	 * The number of structural features of the '<em>Unmapped Transfer Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE_FEATURE_COUNT = TRANSFER_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE___TO_STRING = TRANSFER_OBJECT_TYPE___TO_STRING;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE___GET_NAMESPACE = TRANSFER_OBJECT_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Access Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE___IS_ACCESS_POINT = TRANSFER_OBJECT_TYPE___IS_ACCESS_POINT;

	/**
	 * The number of operations of the '<em>Unmapped Transfer Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE_OPERATION_COUNT = TRANSFER_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferOperationImpl <em>Transfer Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferOperationImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferOperation()
	 * @generated
	 */
	int TRANSFER_OPERATION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION__DOCUMENTATION = NamespacePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION__ANNOTATIONS = NamespacePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Faults</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION__FAULTS = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION__OUTPUT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION__INPUT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION__BEHAVIOUR = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION__IMMUTABLE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Delete On Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION__DELETE_ON_RESULT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Update On Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION__UPDATE_ON_RESULT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Input Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION__INPUT_RANGE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Transfer Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION___GET_IMPLEMENTATION = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Transfer Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.UnboundOperationImpl <em>Unbound Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.UnboundOperationImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getUnboundOperation()
	 * @generated
	 */
	int UNBOUND_OPERATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__NAME = TRANSFER_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__DOCUMENTATION = TRANSFER_OPERATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__ANNOTATIONS = TRANSFER_OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Faults</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__FAULTS = TRANSFER_OPERATION__FAULTS;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__OUTPUT = TRANSFER_OPERATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__INPUT = TRANSFER_OPERATION__INPUT;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__BEHAVIOUR = TRANSFER_OPERATION__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__IMMUTABLE = TRANSFER_OPERATION__IMMUTABLE;

	/**
	 * The feature id for the '<em><b>Delete On Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__DELETE_ON_RESULT = TRANSFER_OPERATION__DELETE_ON_RESULT;

	/**
	 * The feature id for the '<em><b>Update On Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__UPDATE_ON_RESULT = TRANSFER_OPERATION__UPDATE_ON_RESULT;

	/**
	 * The feature id for the '<em><b>Input Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__INPUT_RANGE = TRANSFER_OPERATION__INPUT_RANGE;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__IMPLEMENTATION = TRANSFER_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initializer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__INITIALIZER = TRANSFER_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unbound Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION_FEATURE_COUNT = TRANSFER_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION___GET_IMPLEMENTATION = TRANSFER_OPERATION___GET_IMPLEMENTATION;

	/**
	 * The number of operations of the '<em>Unbound Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION_OPERATION_COUNT = TRANSFER_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ParameterImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__DOCUMENTATION = NamespacePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ANNOTATIONS = NamespacePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__CARDINALITY = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wrap As Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__WRAP_AS_OPTIONAL = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.BoundTransferOperationImpl <em>Bound Transfer Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.BoundTransferOperationImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getBoundTransferOperation()
	 * @generated
	 */
	int BOUND_TRANSFER_OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TRANSFER_OPERATION__NAME = TRANSFER_OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TRANSFER_OPERATION__DOCUMENTATION = TRANSFER_OPERATION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TRANSFER_OPERATION__ANNOTATIONS = TRANSFER_OPERATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Faults</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TRANSFER_OPERATION__FAULTS = TRANSFER_OPERATION__FAULTS;

	/**
	 * The feature id for the '<em><b>Output</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TRANSFER_OPERATION__OUTPUT = TRANSFER_OPERATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TRANSFER_OPERATION__INPUT = TRANSFER_OPERATION__INPUT;

	/**
	 * The feature id for the '<em><b>Behaviour</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TRANSFER_OPERATION__BEHAVIOUR = TRANSFER_OPERATION__BEHAVIOUR;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TRANSFER_OPERATION__IMMUTABLE = TRANSFER_OPERATION__IMMUTABLE;

	/**
	 * The feature id for the '<em><b>Delete On Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TRANSFER_OPERATION__DELETE_ON_RESULT = TRANSFER_OPERATION__DELETE_ON_RESULT;

	/**
	 * The feature id for the '<em><b>Update On Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TRANSFER_OPERATION__UPDATE_ON_RESULT = TRANSFER_OPERATION__UPDATE_ON_RESULT;

	/**
	 * The feature id for the '<em><b>Input Range</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TRANSFER_OPERATION__INPUT_RANGE = TRANSFER_OPERATION__INPUT_RANGE;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TRANSFER_OPERATION__BINDING = TRANSFER_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bound Transfer Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TRANSFER_OPERATION_FEATURE_COUNT = TRANSFER_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Implementation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TRANSFER_OPERATION___GET_IMPLEMENTATION = TRANSFER_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bound Transfer Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_TRANSFER_OPERATION_OPERATION_COUNT = TRANSFER_OPERATION_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferOperationBehaviourImpl <em>Transfer Operation Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferOperationBehaviourImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferOperationBehaviour()
	 * @generated
	 */
	int TRANSFER_OPERATION_BEHAVIOUR = 10;

	/**
	 * The feature id for the '<em><b>Behaviour Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION_BEHAVIOUR__BEHAVIOUR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION_BEHAVIOUR__RELATION = 1;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION_BEHAVIOUR__OWNER = 2;

	/**
	 * The number of structural features of the '<em>Transfer Operation Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION_BEHAVIOUR_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transfer Operation Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OPERATION_BEHAVIOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType <em>Transfer Operation Behaviour Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferOperationBehaviourType()
	 * @generated
	 */
	int TRANSFER_OPERATION_BEHAVIOUR_TYPE = 11;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType <em>Transfer Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Object Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectType
	 * @generated
	 */
	EClass getTransferObjectType();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getRepresentation <em>Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Representation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectType#getRepresentation()
	 * @see #getTransferObjectType()
	 * @generated
	 */
	EReference getTransferObjectType_Representation();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectType#getRelations()
	 * @see #getTransferObjectType()
	 * @generated
	 */
	EReference getTransferObjectType_Relations();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectType#getAttributes()
	 * @see #getTransferObjectType()
	 * @generated
	 */
	EReference getTransferObjectType_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectType#getOperations()
	 * @see #getTransferObjectType()
	 * @generated
	 */
	EReference getTransferObjectType_Operations();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getActorType <em>Actor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Actor Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectType#getActorType()
	 * @see #getTransferObjectType()
	 * @generated
	 */
	EReference getTransferObjectType_ActorType();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#getOverride <em>Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Override</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectType#getOverride()
	 * @see #getTransferObjectType()
	 * @generated
	 */
	EReference getTransferObjectType_Override();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#isQueryCustomizer <em>Query Customizer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Query Customizer</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectType#isQueryCustomizer()
	 * @see #getTransferObjectType()
	 * @generated
	 */
	EAttribute getTransferObjectType_QueryCustomizer();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectType#isAccessPoint() <em>Is Access Point</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Access Point</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectType#isAccessPoint()
	 * @generated
	 */
	EOperation getTransferObjectType__IsAccessPoint();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation <em>Transfer Object Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Object Relation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectRelation
	 * @generated
	 */
	EClass getTransferObjectRelation();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getCardinality()
	 * @see #getTransferObjectRelation()
	 * @generated
	 */
	EReference getTransferObjectRelation_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getBinding()
	 * @see #getTransferObjectRelation()
	 * @generated
	 */
	EReference getTransferObjectRelation_Binding();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Value</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getDefaultValue()
	 * @see #getTransferObjectRelation()
	 * @generated
	 */
	EReference getTransferObjectRelation_DefaultValue();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Range</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getRange()
	 * @see #getTransferObjectRelation()
	 * @generated
	 */
	EReference getTransferObjectRelation_Range();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#getTarget()
	 * @see #getTransferObjectRelation()
	 * @generated
	 */
	EReference getTransferObjectRelation_Target();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isEmbedded <em>Embedded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embedded</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isEmbedded()
	 * @see #getTransferObjectRelation()
	 * @generated
	 */
	EAttribute getTransferObjectRelation_Embedded();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isEmbeddedCreate <em>Embedded Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embedded Create</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isEmbeddedCreate()
	 * @see #getTransferObjectRelation()
	 * @generated
	 */
	EAttribute getTransferObjectRelation_EmbeddedCreate();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isEmbeddedUpdate <em>Embedded Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embedded Update</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isEmbeddedUpdate()
	 * @see #getTransferObjectRelation()
	 * @generated
	 */
	EAttribute getTransferObjectRelation_EmbeddedUpdate();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isEmbeddedDelete <em>Embedded Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Embedded Delete</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isEmbeddedDelete()
	 * @see #getTransferObjectRelation()
	 * @generated
	 */
	EAttribute getTransferObjectRelation_EmbeddedDelete();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isAccess <em>Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Access</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isAccess()
	 * @see #getTransferObjectRelation()
	 * @generated
	 */
	EAttribute getTransferObjectRelation_Access();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isCollection() <em>Is Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Collection</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isCollection()
	 * @generated
	 */
	EOperation getTransferObjectRelation__IsCollection();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isRequired() <em>Is Required</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Required</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isRequired()
	 * @generated
	 */
	EOperation getTransferObjectRelation__IsRequired();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isMutable() <em>Is Mutable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Mutable</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isMutable()
	 * @generated
	 */
	EOperation getTransferObjectRelation__IsMutable();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isNavigable() <em>Is Navigable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Navigable</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isNavigable()
	 * @generated
	 */
	EOperation getTransferObjectRelation__IsNavigable();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isExposedGraph() <em>Is Exposed Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Exposed Graph</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectRelation#isExposedGraph()
	 * @generated
	 */
	EOperation getTransferObjectRelation__IsExposedGraph();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute <em>Transfer Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Attribute</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferAttribute
	 * @generated
	 */
	EClass getTransferAttribute();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#isRequired <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferAttribute#isRequired()
	 * @see #getTransferAttribute()
	 * @generated
	 */
	EAttribute getTransferAttribute_Required();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Value</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferAttribute#getDefaultValue()
	 * @see #getTransferAttribute()
	 * @generated
	 */
	EReference getTransferAttribute_DefaultValue();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Data Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferAttribute#getDataType()
	 * @see #getTransferAttribute()
	 * @generated
	 */
	EReference getTransferAttribute_DataType();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferAttribute#getBinding()
	 * @see #getTransferAttribute()
	 * @generated
	 */
	EReference getTransferAttribute_Binding();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#getClaimType <em>Claim Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Claim Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferAttribute#getClaimType()
	 * @see #getTransferAttribute()
	 * @generated
	 */
	EAttribute getTransferAttribute_ClaimType();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#isPrimitive() <em>Is Primitive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Primitive</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferAttribute#isPrimitive()
	 * @generated
	 */
	EOperation getTransferAttribute__IsPrimitive();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType <em>Mapped Transfer Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapped Transfer Object Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType
	 * @generated
	 */
	EClass getMappedTransferObjectType();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#getEntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#getEntityType()
	 * @see #getMappedTransferObjectType()
	 * @generated
	 */
	EReference getMappedTransferObjectType_EntityType();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filter</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#getFilter()
	 * @see #getMappedTransferObjectType()
	 * @generated
	 */
	EReference getMappedTransferObjectType_Filter();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#isAbstract() <em>Is Abstract</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Abstract</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#isAbstract()
	 * @generated
	 */
	EOperation getMappedTransferObjectType__IsAbstract();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#isInstantiable() <em>Is Instantiable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Instantiable</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#isInstantiable()
	 * @generated
	 */
	EOperation getMappedTransferObjectType__IsInstantiable();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.OperationDeclaration <em>Operation Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Declaration</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.OperationDeclaration
	 * @generated
	 */
	EClass getOperationDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.service.OperationDeclaration#getFaults <em>Faults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Faults</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.OperationDeclaration#getFaults()
	 * @see #getOperationDeclaration()
	 * @generated
	 */
	EReference getOperationDeclaration_Faults();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.service.OperationDeclaration#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.OperationDeclaration#getOutput()
	 * @see #getOperationDeclaration()
	 * @generated
	 */
	EReference getOperationDeclaration_Output();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.service.OperationDeclaration#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.OperationDeclaration#getInput()
	 * @see #getOperationDeclaration()
	 * @generated
	 */
	EReference getOperationDeclaration_Input();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType <em>Unmapped Transfer Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unmapped Transfer Object Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType
	 * @generated
	 */
	EClass getUnmappedTransferObjectType();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.UnboundOperation <em>Unbound Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unbound Operation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.UnboundOperation
	 * @generated
	 */
	EClass getUnboundOperation();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.service.UnboundOperation#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.UnboundOperation#getImplementation()
	 * @see #getUnboundOperation()
	 * @generated
	 */
	EReference getUnboundOperation_Implementation();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.service.UnboundOperation#isInitializer <em>Initializer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initializer</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.UnboundOperation#isInitializer()
	 * @see #getUnboundOperation()
	 * @generated
	 */
	EAttribute getUnboundOperation_Initializer();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.service.Parameter#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.Parameter#getCardinality()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Cardinality();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EReference getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.service.Parameter#isWrapAsOptional <em>Wrap As Optional</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrap As Optional</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.Parameter#isWrapAsOptional()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_WrapAsOptional();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.BoundTransferOperation <em>Bound Transfer Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound Transfer Operation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.BoundTransferOperation
	 * @generated
	 */
	EClass getBoundTransferOperation();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.BoundTransferOperation#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Binding</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.BoundTransferOperation#getBinding()
	 * @see #getBoundTransferOperation()
	 * @generated
	 */
	EReference getBoundTransferOperation_Binding();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.service.BoundTransferOperation#getImplementation() <em>Get Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Implementation</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.service.BoundTransferOperation#getImplementation()
	 * @generated
	 */
	EOperation getBoundTransferOperation__GetImplementation();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.TransferOperation <em>Transfer Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Operation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferOperation
	 * @generated
	 */
	EClass getTransferOperation();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.service.TransferOperation#getBehaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Behaviour</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferOperation#getBehaviour()
	 * @see #getTransferOperation()
	 * @generated
	 */
	EReference getTransferOperation_Behaviour();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.service.TransferOperation#isImmutable <em>Immutable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immutable</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferOperation#isImmutable()
	 * @see #getTransferOperation()
	 * @generated
	 */
	EAttribute getTransferOperation_Immutable();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.service.TransferOperation#isDeleteOnResult <em>Delete On Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete On Result</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferOperation#isDeleteOnResult()
	 * @see #getTransferOperation()
	 * @generated
	 */
	EAttribute getTransferOperation_DeleteOnResult();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.service.TransferOperation#isUpdateOnResult <em>Update On Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update On Result</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferOperation#isUpdateOnResult()
	 * @see #getTransferOperation()
	 * @generated
	 */
	EAttribute getTransferOperation_UpdateOnResult();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferOperation#getInputRange <em>Input Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input Range</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferOperation#getInputRange()
	 * @see #getTransferOperation()
	 * @generated
	 */
	EReference getTransferOperation_InputRange();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.service.TransferOperation#getImplementation() <em>Get Implementation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Implementation</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferOperation#getImplementation()
	 * @generated
	 */
	EOperation getTransferOperation__GetImplementation();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour <em>Transfer Operation Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Operation Behaviour</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour
	 * @generated
	 */
	EClass getTransferOperationBehaviour();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour#getBehaviourType <em>Behaviour Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Behaviour Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour#getBehaviourType()
	 * @see #getTransferOperationBehaviour()
	 * @generated
	 */
	EAttribute getTransferOperationBehaviour_BehaviourType();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour#getRelation()
	 * @see #getTransferOperationBehaviour()
	 * @generated
	 */
	EReference getTransferOperationBehaviour_Relation();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour#getOwner()
	 * @see #getTransferOperationBehaviour()
	 * @generated
	 */
	EReference getTransferOperationBehaviour_Owner();

	/**
	 * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType <em>Transfer Operation Behaviour Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Transfer Operation Behaviour Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType
	 * @generated
	 */
	EEnum getTransferOperationBehaviourType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceFactory getServiceFactory();

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
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectTypeImpl <em>Transfer Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferObjectTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferObjectType()
		 * @generated
		 */
		EClass TRANSFER_OBJECT_TYPE = eINSTANCE.getTransferObjectType();

		/**
		 * The meta object literal for the '<em><b>Representation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OBJECT_TYPE__REPRESENTATION = eINSTANCE.getTransferObjectType_Representation();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OBJECT_TYPE__RELATIONS = eINSTANCE.getTransferObjectType_Relations();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OBJECT_TYPE__ATTRIBUTES = eINSTANCE.getTransferObjectType_Attributes();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OBJECT_TYPE__OPERATIONS = eINSTANCE.getTransferObjectType_Operations();

		/**
		 * The meta object literal for the '<em><b>Actor Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OBJECT_TYPE__ACTOR_TYPE = eINSTANCE.getTransferObjectType_ActorType();

		/**
		 * The meta object literal for the '<em><b>Override</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OBJECT_TYPE__OVERRIDE = eINSTANCE.getTransferObjectType_Override();

		/**
		 * The meta object literal for the '<em><b>Query Customizer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_OBJECT_TYPE__QUERY_CUSTOMIZER = eINSTANCE.getTransferObjectType_QueryCustomizer();

		/**
		 * The meta object literal for the '<em><b>Is Access Point</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFER_OBJECT_TYPE___IS_ACCESS_POINT = eINSTANCE.getTransferObjectType__IsAccessPoint();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectRelationImpl <em>Transfer Object Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferObjectRelationImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferObjectRelation()
		 * @generated
		 */
		EClass TRANSFER_OBJECT_RELATION = eINSTANCE.getTransferObjectRelation();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OBJECT_RELATION__CARDINALITY = eINSTANCE.getTransferObjectRelation_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OBJECT_RELATION__BINDING = eINSTANCE.getTransferObjectRelation_Binding();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OBJECT_RELATION__DEFAULT_VALUE = eINSTANCE.getTransferObjectRelation_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OBJECT_RELATION__RANGE = eINSTANCE.getTransferObjectRelation_Range();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OBJECT_RELATION__TARGET = eINSTANCE.getTransferObjectRelation_Target();

		/**
		 * The meta object literal for the '<em><b>Embedded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_OBJECT_RELATION__EMBEDDED = eINSTANCE.getTransferObjectRelation_Embedded();

		/**
		 * The meta object literal for the '<em><b>Embedded Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_OBJECT_RELATION__EMBEDDED_CREATE = eINSTANCE.getTransferObjectRelation_EmbeddedCreate();

		/**
		 * The meta object literal for the '<em><b>Embedded Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_OBJECT_RELATION__EMBEDDED_UPDATE = eINSTANCE.getTransferObjectRelation_EmbeddedUpdate();

		/**
		 * The meta object literal for the '<em><b>Embedded Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_OBJECT_RELATION__EMBEDDED_DELETE = eINSTANCE.getTransferObjectRelation_EmbeddedDelete();

		/**
		 * The meta object literal for the '<em><b>Access</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_OBJECT_RELATION__ACCESS = eINSTANCE.getTransferObjectRelation_Access();

		/**
		 * The meta object literal for the '<em><b>Is Collection</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFER_OBJECT_RELATION___IS_COLLECTION = eINSTANCE.getTransferObjectRelation__IsCollection();

		/**
		 * The meta object literal for the '<em><b>Is Required</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFER_OBJECT_RELATION___IS_REQUIRED = eINSTANCE.getTransferObjectRelation__IsRequired();

		/**
		 * The meta object literal for the '<em><b>Is Mutable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFER_OBJECT_RELATION___IS_MUTABLE = eINSTANCE.getTransferObjectRelation__IsMutable();

		/**
		 * The meta object literal for the '<em><b>Is Navigable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFER_OBJECT_RELATION___IS_NAVIGABLE = eINSTANCE.getTransferObjectRelation__IsNavigable();

		/**
		 * The meta object literal for the '<em><b>Is Exposed Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFER_OBJECT_RELATION___IS_EXPOSED_GRAPH = eINSTANCE.getTransferObjectRelation__IsExposedGraph();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeImpl <em>Transfer Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferAttribute()
		 * @generated
		 */
		EClass TRANSFER_ATTRIBUTE = eINSTANCE.getTransferAttribute();

		/**
		 * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_ATTRIBUTE__REQUIRED = eINSTANCE.getTransferAttribute_Required();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getTransferAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_ATTRIBUTE__DATA_TYPE = eINSTANCE.getTransferAttribute_DataType();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_ATTRIBUTE__BINDING = eINSTANCE.getTransferAttribute_Binding();

		/**
		 * The meta object literal for the '<em><b>Claim Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_ATTRIBUTE__CLAIM_TYPE = eINSTANCE.getTransferAttribute_ClaimType();

		/**
		 * The meta object literal for the '<em><b>Is Primitive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFER_ATTRIBUTE___IS_PRIMITIVE = eINSTANCE.getTransferAttribute__IsPrimitive();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.MappedTransferObjectTypeImpl <em>Mapped Transfer Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.MappedTransferObjectTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getMappedTransferObjectType()
		 * @generated
		 */
		EClass MAPPED_TRANSFER_OBJECT_TYPE = eINSTANCE.getMappedTransferObjectType();

		/**
		 * The meta object literal for the '<em><b>Entity Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE = eINSTANCE.getMappedTransferObjectType_EntityType();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_TRANSFER_OBJECT_TYPE__FILTER = eINSTANCE.getMappedTransferObjectType_Filter();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAPPED_TRANSFER_OBJECT_TYPE___IS_ABSTRACT = eINSTANCE.getMappedTransferObjectType__IsAbstract();

		/**
		 * The meta object literal for the '<em><b>Is Instantiable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MAPPED_TRANSFER_OBJECT_TYPE___IS_INSTANTIABLE = eINSTANCE.getMappedTransferObjectType__IsInstantiable();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.OperationDeclarationImpl <em>Operation Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.OperationDeclarationImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getOperationDeclaration()
		 * @generated
		 */
		EClass OPERATION_DECLARATION = eINSTANCE.getOperationDeclaration();

		/**
		 * The meta object literal for the '<em><b>Faults</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DECLARATION__FAULTS = eINSTANCE.getOperationDeclaration_Faults();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DECLARATION__OUTPUT = eINSTANCE.getOperationDeclaration_Output();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_DECLARATION__INPUT = eINSTANCE.getOperationDeclaration_Input();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.UnmappedTransferObjectTypeImpl <em>Unmapped Transfer Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.UnmappedTransferObjectTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getUnmappedTransferObjectType()
		 * @generated
		 */
		EClass UNMAPPED_TRANSFER_OBJECT_TYPE = eINSTANCE.getUnmappedTransferObjectType();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.UnboundOperationImpl <em>Unbound Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.UnboundOperationImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getUnboundOperation()
		 * @generated
		 */
		EClass UNBOUND_OPERATION = eINSTANCE.getUnboundOperation();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNBOUND_OPERATION__IMPLEMENTATION = eINSTANCE.getUnboundOperation_Implementation();

		/**
		 * The meta object literal for the '<em><b>Initializer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNBOUND_OPERATION__INITIALIZER = eINSTANCE.getUnboundOperation_Initializer();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ParameterImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__CARDINALITY = eINSTANCE.getParameter_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Wrap As Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__WRAP_AS_OPTIONAL = eINSTANCE.getParameter_WrapAsOptional();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.BoundTransferOperationImpl <em>Bound Transfer Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.BoundTransferOperationImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getBoundTransferOperation()
		 * @generated
		 */
		EClass BOUND_TRANSFER_OPERATION = eINSTANCE.getBoundTransferOperation();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUND_TRANSFER_OPERATION__BINDING = eINSTANCE.getBoundTransferOperation_Binding();

		/**
		 * The meta object literal for the '<em><b>Get Implementation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOUND_TRANSFER_OPERATION___GET_IMPLEMENTATION = eINSTANCE.getBoundTransferOperation__GetImplementation();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferOperationImpl <em>Transfer Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferOperationImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferOperation()
		 * @generated
		 */
		EClass TRANSFER_OPERATION = eINSTANCE.getTransferOperation();

		/**
		 * The meta object literal for the '<em><b>Behaviour</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OPERATION__BEHAVIOUR = eINSTANCE.getTransferOperation_Behaviour();

		/**
		 * The meta object literal for the '<em><b>Immutable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_OPERATION__IMMUTABLE = eINSTANCE.getTransferOperation_Immutable();

		/**
		 * The meta object literal for the '<em><b>Delete On Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_OPERATION__DELETE_ON_RESULT = eINSTANCE.getTransferOperation_DeleteOnResult();

		/**
		 * The meta object literal for the '<em><b>Update On Result</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_OPERATION__UPDATE_ON_RESULT = eINSTANCE.getTransferOperation_UpdateOnResult();

		/**
		 * The meta object literal for the '<em><b>Input Range</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OPERATION__INPUT_RANGE = eINSTANCE.getTransferOperation_InputRange();

		/**
		 * The meta object literal for the '<em><b>Get Implementation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFER_OPERATION___GET_IMPLEMENTATION = eINSTANCE.getTransferOperation__GetImplementation();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferOperationBehaviourImpl <em>Transfer Operation Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferOperationBehaviourImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferOperationBehaviour()
		 * @generated
		 */
		EClass TRANSFER_OPERATION_BEHAVIOUR = eINSTANCE.getTransferOperationBehaviour();

		/**
		 * The meta object literal for the '<em><b>Behaviour Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFER_OPERATION_BEHAVIOUR__BEHAVIOUR_TYPE = eINSTANCE.getTransferOperationBehaviour_BehaviourType();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OPERATION_BEHAVIOUR__RELATION = eINSTANCE.getTransferOperationBehaviour_Relation();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OPERATION_BEHAVIOUR__OWNER = eINSTANCE.getTransferOperationBehaviour_Owner();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType <em>Transfer Operation Behaviour Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferOperationBehaviourType()
		 * @generated
		 */
		EEnum TRANSFER_OPERATION_BEHAVIOUR_TYPE = eINSTANCE.getTransferOperationBehaviourType();

	}

} //ServicePackage
