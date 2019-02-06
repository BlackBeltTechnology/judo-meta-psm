/**
 */
package hu.blackbelt.judo.meta.psm.service;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.type.TypePackage;

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
 * @see hu.blackbelt.judo.meta.psm.service.ServiceFactory
 * @model kind="package"
 * @generated
 */
public interface ServicePackage extends EPackage {
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
	 * The number of structural features of the '<em>Transfer Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_TYPE_FEATURE_COUNT = TypePackage.DATA_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Transfer Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_TYPE_OPERATION_COUNT = TypePackage.DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferRelationImpl <em>Transfer Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferRelationImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferRelation()
	 * @generated
	 */
	int TRANSFER_RELATION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_RELATION__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_RELATION__CARDINALITY = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_RELATION__INIT_EXPRESSION = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transfer Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_RELATION_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transfer Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_RELATION_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectReferenceImpl <em>Transfer Object Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferObjectReferenceImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferObjectReference()
	 * @generated
	 */
	int TRANSFER_OBJECT_REFERENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_REFERENCE__NAME = TRANSFER_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_REFERENCE__CARDINALITY = TRANSFER_RELATION__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_REFERENCE__INIT_EXPRESSION = TRANSFER_RELATION__INIT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Referenced</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_REFERENCE__REFERENCED = TRANSFER_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transfer Object Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_REFERENCE_FEATURE_COUNT = TRANSFER_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transfer Object Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_REFERENCE_OPERATION_COUNT = TRANSFER_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectContainmentImpl <em>Transfer Object Containment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferObjectContainmentImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferObjectContainment()
	 * @generated
	 */
	int TRANSFER_OBJECT_CONTAINMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_CONTAINMENT__NAME = TRANSFER_RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_CONTAINMENT__CARDINALITY = TRANSFER_RELATION__CARDINALITY;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_CONTAINMENT__INIT_EXPRESSION = TRANSFER_RELATION__INIT_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Containment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_CONTAINMENT__CONTAINMENT = TRANSFER_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transfer Object Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_CONTAINMENT_FEATURE_COUNT = TRANSFER_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Transfer Object Containment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_OBJECT_CONTAINMENT_OPERATION_COUNT = TRANSFER_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeImpl <em>Transfer Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferAttribute()
	 * @generated
	 */
	int TRANSFER_ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE__DATA_TYPE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE__REQUIRED = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE__INIT_EXPRESSION = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transfer Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Transfer Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.MappedTransferObjectTypeImpl <em>Mapped Transfer Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.MappedTransferObjectTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getMappedTransferObjectType()
	 * @generated
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE__NAME = TRANSFER_OBJECT_TYPE__NAME;

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
	 * The feature id for the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE = TRANSFER_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transfer Relation Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_RELATION_BINDINGS = TRANSFER_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Transfer Attribute Bindings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_ATTRIBUTE_BINDINGS = TRANSFER_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mapped Transfer Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE_FEATURE_COUNT = TRANSFER_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Mapped Transfer Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_TRANSFER_OBJECT_TYPE_OPERATION_COUNT = TRANSFER_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeBindingImpl <em>Transfer Attribute Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeBindingImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferAttributeBinding()
	 * @generated
	 */
	int TRANSFER_ATTRIBUTE_BINDING = 6;

	/**
	 * The feature id for the '<em><b>Primitive Typed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE_BINDING__PRIMITIVE_TYPED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Transfer Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE_BINDING__TRANSFER_ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Transfer Attribute Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transfer Attribute Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_ATTRIBUTE_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferRelationBindingImpl <em>Transfer Relation Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferRelationBindingImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferRelationBinding()
	 * @generated
	 */
	int TRANSFER_RELATION_BINDING = 7;

	/**
	 * The feature id for the '<em><b>Reference Typed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_RELATION_BINDING__REFERENCE_TYPED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Transfer Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_RELATION_BINDING__TRANSFER_RELATION = 1;

	/**
	 * The number of structural features of the '<em>Transfer Relation Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_RELATION_BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transfer Relation Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFER_RELATION_BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.OperationImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__BODY = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__OUTPUT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Faults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__FAULTS = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Undefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__UNDEFINED = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.UnmappedTransferObjectTypeImpl <em>Unmapped Transfer Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.UnmappedTransferObjectTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getUnmappedTransferObjectType()
	 * @generated
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE__NAME = TRANSFER_OBJECT_TYPE__NAME;

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
	 * The number of structural features of the '<em>Unmapped Transfer Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE_FEATURE_COUNT = TRANSFER_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unmapped Transfer Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNMAPPED_TRANSFER_OBJECT_TYPE_OPERATION_COUNT = TRANSFER_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.BoundOperationImpl <em>Bound Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.BoundOperationImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getBoundOperation()
	 * @generated
	 */
	int BOUND_OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION__BODY = OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION__OUTPUT = OPERATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Faults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION__FAULTS = OPERATION__FAULTS;

	/**
	 * The feature id for the '<em><b>Undefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION__UNDEFINED = OPERATION__UNDEFINED;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION__INPUT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bound Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bound Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUND_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.service.impl.UnboundOperationImpl <em>Unbound Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.service.impl.UnboundOperationImpl
	 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getUnboundOperation()
	 * @generated
	 */
	int UNBOUND_OPERATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__NAME = OPERATION__NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__BODY = OPERATION__BODY;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__OUTPUT = OPERATION__OUTPUT;

	/**
	 * The feature id for the '<em><b>Faults</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__FAULTS = OPERATION__FAULTS;

	/**
	 * The feature id for the '<em><b>Undefined</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__UNDEFINED = OPERATION__UNDEFINED;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION__INPUT = OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unbound Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION_FEATURE_COUNT = OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unbound Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNBOUND_OPERATION_OPERATION_COUNT = OPERATION_OPERATION_COUNT + 0;


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
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.TransferRelation <em>Transfer Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Relation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferRelation
	 * @generated
	 */
	EClass getTransferRelation();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.service.TransferRelation#getCardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cardinality</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferRelation#getCardinality()
	 * @see #getTransferRelation()
	 * @generated
	 */
	EReference getTransferRelation_Cardinality();

	/**
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.service.TransferRelation#getInitExpression <em>Init Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferRelation#getInitExpression()
	 * @see #getTransferRelation()
	 * @generated
	 */
	EReference getTransferRelation_InitExpression();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectReference <em>Transfer Object Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Object Reference</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectReference
	 * @generated
	 */
	EClass getTransferObjectReference();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectReference#getReferenced <em>Referenced</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectReference#getReferenced()
	 * @see #getTransferObjectReference()
	 * @generated
	 */
	EReference getTransferObjectReference_Referenced();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectContainment <em>Transfer Object Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Object Containment</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectContainment
	 * @generated
	 */
	EClass getTransferObjectContainment();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferObjectContainment#getContainment <em>Containment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containment</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferObjectContainment#getContainment()
	 * @see #getTransferObjectContainment()
	 * @generated
	 */
	EReference getTransferObjectContainment_Containment();

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
	 * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.service.TransferAttribute#getInitExpression <em>Init Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Expression</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferAttribute#getInitExpression()
	 * @see #getTransferAttribute()
	 * @generated
	 */
	EReference getTransferAttribute_InitExpression();

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
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#getTransferRelationBindings <em>Transfer Relation Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transfer Relation Bindings</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#getTransferRelationBindings()
	 * @see #getMappedTransferObjectType()
	 * @generated
	 */
	EReference getMappedTransferObjectType_TransferRelationBindings();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#getTransferAttributeBindings <em>Transfer Attribute Bindings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transfer Attribute Bindings</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType#getTransferAttributeBindings()
	 * @see #getMappedTransferObjectType()
	 * @generated
	 */
	EReference getMappedTransferObjectType_TransferAttributeBindings();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.TransferAttributeBinding <em>Transfer Attribute Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Attribute Binding</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferAttributeBinding
	 * @generated
	 */
	EClass getTransferAttributeBinding();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferAttributeBinding#getPrimitiveTypedElement <em>Primitive Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Primitive Typed Element</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferAttributeBinding#getPrimitiveTypedElement()
	 * @see #getTransferAttributeBinding()
	 * @generated
	 */
	EReference getTransferAttributeBinding_PrimitiveTypedElement();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferAttributeBinding#getTransferAttribute <em>Transfer Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transfer Attribute</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferAttributeBinding#getTransferAttribute()
	 * @see #getTransferAttributeBinding()
	 * @generated
	 */
	EReference getTransferAttributeBinding_TransferAttribute();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.TransferRelationBinding <em>Transfer Relation Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transfer Relation Binding</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferRelationBinding
	 * @generated
	 */
	EClass getTransferRelationBinding();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferRelationBinding#getReferenceTypedElement <em>Reference Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference Typed Element</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferRelationBinding#getReferenceTypedElement()
	 * @see #getTransferRelationBinding()
	 * @generated
	 */
	EReference getTransferRelationBinding_ReferenceTypedElement();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.TransferRelationBinding#getTransferRelation <em>Transfer Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transfer Relation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.TransferRelationBinding#getTransferRelation()
	 * @see #getTransferRelationBinding()
	 * @generated
	 */
	EReference getTransferRelationBinding_TransferRelation();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.service.Operation#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.Operation#getBody()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Body();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.Operation#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.Operation#getOutput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Output();

	/**
	 * Returns the meta object for the reference list '{@link hu.blackbelt.judo.meta.psm.service.Operation#getFaults <em>Faults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Faults</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.Operation#getFaults()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Faults();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.service.Operation#isUndefined <em>Undefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Undefined</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.Operation#isUndefined()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Undefined();

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
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.service.BoundOperation <em>Bound Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bound Operation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.BoundOperation
	 * @generated
	 */
	EClass getBoundOperation();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.BoundOperation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.BoundOperation#getInput()
	 * @see #getBoundOperation()
	 * @generated
	 */
	EReference getBoundOperation_Input();

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
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.service.UnboundOperation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see hu.blackbelt.judo.meta.psm.service.UnboundOperation#getInput()
	 * @see #getUnboundOperation()
	 * @generated
	 */
	EReference getUnboundOperation_Input();

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
	interface Literals {
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
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferRelationImpl <em>Transfer Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferRelationImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferRelation()
		 * @generated
		 */
		EClass TRANSFER_RELATION = eINSTANCE.getTransferRelation();

		/**
		 * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_RELATION__CARDINALITY = eINSTANCE.getTransferRelation_Cardinality();

		/**
		 * The meta object literal for the '<em><b>Init Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_RELATION__INIT_EXPRESSION = eINSTANCE.getTransferRelation_InitExpression();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectReferenceImpl <em>Transfer Object Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferObjectReferenceImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferObjectReference()
		 * @generated
		 */
		EClass TRANSFER_OBJECT_REFERENCE = eINSTANCE.getTransferObjectReference();

		/**
		 * The meta object literal for the '<em><b>Referenced</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OBJECT_REFERENCE__REFERENCED = eINSTANCE.getTransferObjectReference_Referenced();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectContainmentImpl <em>Transfer Object Containment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferObjectContainmentImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferObjectContainment()
		 * @generated
		 */
		EClass TRANSFER_OBJECT_CONTAINMENT = eINSTANCE.getTransferObjectContainment();

		/**
		 * The meta object literal for the '<em><b>Containment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_OBJECT_CONTAINMENT__CONTAINMENT = eINSTANCE.getTransferObjectContainment_Containment();

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
		 * The meta object literal for the '<em><b>Init Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_ATTRIBUTE__INIT_EXPRESSION = eINSTANCE.getTransferAttribute_InitExpression();

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
		 * The meta object literal for the '<em><b>Transfer Relation Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_RELATION_BINDINGS = eINSTANCE.getMappedTransferObjectType_TransferRelationBindings();

		/**
		 * The meta object literal for the '<em><b>Transfer Attribute Bindings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_ATTRIBUTE_BINDINGS = eINSTANCE.getMappedTransferObjectType_TransferAttributeBindings();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeBindingImpl <em>Transfer Attribute Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferAttributeBindingImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferAttributeBinding()
		 * @generated
		 */
		EClass TRANSFER_ATTRIBUTE_BINDING = eINSTANCE.getTransferAttributeBinding();

		/**
		 * The meta object literal for the '<em><b>Primitive Typed Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_ATTRIBUTE_BINDING__PRIMITIVE_TYPED_ELEMENT = eINSTANCE.getTransferAttributeBinding_PrimitiveTypedElement();

		/**
		 * The meta object literal for the '<em><b>Transfer Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_ATTRIBUTE_BINDING__TRANSFER_ATTRIBUTE = eINSTANCE.getTransferAttributeBinding_TransferAttribute();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.TransferRelationBindingImpl <em>Transfer Relation Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.TransferRelationBindingImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getTransferRelationBinding()
		 * @generated
		 */
		EClass TRANSFER_RELATION_BINDING = eINSTANCE.getTransferRelationBinding();

		/**
		 * The meta object literal for the '<em><b>Reference Typed Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_RELATION_BINDING__REFERENCE_TYPED_ELEMENT = eINSTANCE.getTransferRelationBinding_ReferenceTypedElement();

		/**
		 * The meta object literal for the '<em><b>Transfer Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFER_RELATION_BINDING__TRANSFER_RELATION = eINSTANCE.getTransferRelationBinding_TransferRelation();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.OperationImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__BODY = eINSTANCE.getOperation_Body();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__OUTPUT = eINSTANCE.getOperation_Output();

		/**
		 * The meta object literal for the '<em><b>Faults</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__FAULTS = eINSTANCE.getOperation_Faults();

		/**
		 * The meta object literal for the '<em><b>Undefined</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__UNDEFINED = eINSTANCE.getOperation_Undefined();

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
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.service.impl.BoundOperationImpl <em>Bound Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.service.impl.BoundOperationImpl
		 * @see hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl#getBoundOperation()
		 * @generated
		 */
		EClass BOUND_OPERATION = eINSTANCE.getBoundOperation();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUND_OPERATION__INPUT = eINSTANCE.getBoundOperation_Input();

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
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNBOUND_OPERATION__INPUT = eINSTANCE.getUnboundOperation_Input();

	}

} //ServicePackage
