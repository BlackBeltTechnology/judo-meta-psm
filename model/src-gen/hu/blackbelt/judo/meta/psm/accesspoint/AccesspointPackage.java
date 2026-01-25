/**
 */
package hu.blackbelt.judo.meta.psm.accesspoint;

import hu.blackbelt.judo.meta.psm.service.ServicePackage;

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
 * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointFactory
 * @model kind="package"
 * @generated
 */
public interface AccesspointPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "accesspoint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/psm/accesspoint";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "accesspoint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccesspointPackage eINSTANCE = hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.AbstractActorTypeImpl <em>Abstract Actor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.AbstractActorTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl#getAbstractActorType()
	 * @generated
	 */
	int ABSTRACT_ACTOR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE__NAME = ServicePackage.TRANSFER_OBJECT_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE__DOCUMENTATION = ServicePackage.TRANSFER_OBJECT_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE__ANNOTATIONS = ServicePackage.TRANSFER_OBJECT_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE__REPRESENTATION = ServicePackage.TRANSFER_OBJECT_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE__RELATIONS = ServicePackage.TRANSFER_OBJECT_TYPE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE__ATTRIBUTES = ServicePackage.TRANSFER_OBJECT_TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE__OPERATIONS = ServicePackage.TRANSFER_OBJECT_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Actor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE__ACTOR_TYPE = ServicePackage.TRANSFER_OBJECT_TYPE__ACTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Override</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE__OVERRIDE = ServicePackage.TRANSFER_OBJECT_TYPE__OVERRIDE;

	/**
	 * The feature id for the '<em><b>Query Customizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE__QUERY_CUSTOMIZER = ServicePackage.TRANSFER_OBJECT_TYPE__QUERY_CUSTOMIZER;

	/**
	 * The feature id for the '<em><b>Transfer Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE = ServicePackage.TRANSFER_OBJECT_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Realm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE__REALM = ServicePackage.TRANSFER_OBJECT_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE__KIND = ServicePackage.TRANSFER_OBJECT_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Abstract Actor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE_FEATURE_COUNT = ServicePackage.TRANSFER_OBJECT_TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE___TO_STRING = ServicePackage.TRANSFER_OBJECT_TYPE___TO_STRING;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE___GET_NAMESPACE = ServicePackage.TRANSFER_OBJECT_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Access Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE___IS_ACCESS_POINT = ServicePackage.TRANSFER_OBJECT_TYPE___IS_ACCESS_POINT;

	/**
	 * The number of operations of the '<em>Abstract Actor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ACTOR_TYPE_OPERATION_COUNT = ServicePackage.TRANSFER_OBJECT_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.MappedActorTypeImpl <em>Mapped Actor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.MappedActorTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl#getMappedActorType()
	 * @generated
	 */
	int MAPPED_ACTOR_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE__NAME = ABSTRACT_ACTOR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE__DOCUMENTATION = ABSTRACT_ACTOR_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE__ANNOTATIONS = ABSTRACT_ACTOR_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE__REPRESENTATION = ABSTRACT_ACTOR_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE__RELATIONS = ABSTRACT_ACTOR_TYPE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE__ATTRIBUTES = ABSTRACT_ACTOR_TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE__OPERATIONS = ABSTRACT_ACTOR_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Actor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE__ACTOR_TYPE = ABSTRACT_ACTOR_TYPE__ACTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Override</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE__OVERRIDE = ABSTRACT_ACTOR_TYPE__OVERRIDE;

	/**
	 * The feature id for the '<em><b>Query Customizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE__QUERY_CUSTOMIZER = ABSTRACT_ACTOR_TYPE__QUERY_CUSTOMIZER;

	/**
	 * The feature id for the '<em><b>Transfer Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE__TRANSFER_OBJECT_TYPE = ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Realm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE__REALM = ABSTRACT_ACTOR_TYPE__REALM;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE__KIND = ABSTRACT_ACTOR_TYPE__KIND;

	/**
	 * The feature id for the '<em><b>Entity Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE__ENTITY_TYPE = ABSTRACT_ACTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE__FILTER = ABSTRACT_ACTOR_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Managed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE__MANAGED = ABSTRACT_ACTOR_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Mapped Actor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE_FEATURE_COUNT = ABSTRACT_ACTOR_TYPE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE___TO_STRING = ABSTRACT_ACTOR_TYPE___TO_STRING;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE___GET_NAMESPACE = ABSTRACT_ACTOR_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Access Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE___IS_ACCESS_POINT = ABSTRACT_ACTOR_TYPE___IS_ACCESS_POINT;

	/**
	 * The operation id for the '<em>Is Abstract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE___IS_ABSTRACT = ABSTRACT_ACTOR_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Instantiable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE___IS_INSTANTIABLE = ABSTRACT_ACTOR_TYPE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Mapped Actor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPED_ACTOR_TYPE_OPERATION_COUNT = ABSTRACT_ACTOR_TYPE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.ActorTypeImpl <em>Actor Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.ActorTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl#getActorType()
	 * @generated
	 */
	int ACTOR_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE__NAME = ABSTRACT_ACTOR_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE__DOCUMENTATION = ABSTRACT_ACTOR_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE__ANNOTATIONS = ABSTRACT_ACTOR_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE__REPRESENTATION = ABSTRACT_ACTOR_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE__RELATIONS = ABSTRACT_ACTOR_TYPE__RELATIONS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE__ATTRIBUTES = ABSTRACT_ACTOR_TYPE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE__OPERATIONS = ABSTRACT_ACTOR_TYPE__OPERATIONS;

	/**
	 * The feature id for the '<em><b>Actor Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE__ACTOR_TYPE = ABSTRACT_ACTOR_TYPE__ACTOR_TYPE;

	/**
	 * The feature id for the '<em><b>Override</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE__OVERRIDE = ABSTRACT_ACTOR_TYPE__OVERRIDE;

	/**
	 * The feature id for the '<em><b>Query Customizer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE__QUERY_CUSTOMIZER = ABSTRACT_ACTOR_TYPE__QUERY_CUSTOMIZER;

	/**
	 * The feature id for the '<em><b>Transfer Object Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE__TRANSFER_OBJECT_TYPE = ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE;

	/**
	 * The feature id for the '<em><b>Realm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE__REALM = ABSTRACT_ACTOR_TYPE__REALM;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE__KIND = ABSTRACT_ACTOR_TYPE__KIND;

	/**
	 * The number of structural features of the '<em>Actor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE_FEATURE_COUNT = ABSTRACT_ACTOR_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE___TO_STRING = ABSTRACT_ACTOR_TYPE___TO_STRING;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE___GET_NAMESPACE = ABSTRACT_ACTOR_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Access Point</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE___IS_ACCESS_POINT = ABSTRACT_ACTOR_TYPE___IS_ACCESS_POINT;

	/**
	 * The number of operations of the '<em>Actor Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTOR_TYPE_OPERATION_COUNT = ABSTRACT_ACTOR_TYPE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType <em>Abstract Actor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Actor Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType
	 * @generated
	 */
	EClass getAbstractActorType();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType#getTransferObjectType <em>Transfer Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transfer Object Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType#getTransferObjectType()
	 * @see #getAbstractActorType()
	 * @generated
	 */
	EReference getAbstractActorType_TransferObjectType();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType#getRealm <em>Realm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Realm</em>'.
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType#getRealm()
	 * @see #getAbstractActorType()
	 * @generated
	 */
	EAttribute getAbstractActorType_Realm();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType#getKind()
	 * @see #getAbstractActorType()
	 * @generated
	 */
	EAttribute getAbstractActorType_Kind();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.accesspoint.MappedActorType <em>Mapped Actor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapped Actor Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.MappedActorType
	 * @generated
	 */
	EClass getMappedActorType();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.accesspoint.MappedActorType#isManaged <em>Managed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Managed</em>'.
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.MappedActorType#isManaged()
	 * @see #getMappedActorType()
	 * @generated
	 */
	EAttribute getMappedActorType_Managed();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.accesspoint.ActorType <em>Actor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Actor Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.ActorType
	 * @generated
	 */
	EClass getActorType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AccesspointFactory getAccesspointFactory();

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
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.AbstractActorTypeImpl <em>Abstract Actor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.AbstractActorTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl#getAbstractActorType()
		 * @generated
		 */
		EClass ABSTRACT_ACTOR_TYPE = eINSTANCE.getAbstractActorType();

		/**
		 * The meta object literal for the '<em><b>Transfer Object Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE = eINSTANCE.getAbstractActorType_TransferObjectType();

		/**
		 * The meta object literal for the '<em><b>Realm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ACTOR_TYPE__REALM = eINSTANCE.getAbstractActorType_Realm();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_ACTOR_TYPE__KIND = eINSTANCE.getAbstractActorType_Kind();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.MappedActorTypeImpl <em>Mapped Actor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.MappedActorTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl#getMappedActorType()
		 * @generated
		 */
		EClass MAPPED_ACTOR_TYPE = eINSTANCE.getMappedActorType();

		/**
		 * The meta object literal for the '<em><b>Managed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPED_ACTOR_TYPE__MANAGED = eINSTANCE.getMappedActorType_Managed();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.ActorTypeImpl <em>Actor Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.ActorTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl#getActorType()
		 * @generated
		 */
		EClass ACTOR_TYPE = eINSTANCE.getActorType();

	}

} //AccesspointPackage
