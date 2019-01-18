/**
 */
package hu.blackbelt.judo.meta.psm.data;

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
 * @see hu.blackbelt.judo.meta.psm.data.DataFactory
 * @model kind="package"
 * @generated
 */
public interface DataPackage extends EPackage {
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
     * The feature id for the '<em><b>Relation Count Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__RELATION_COUNT_CONSTRAINTS = TypePackage.TYPE_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Data Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__DATA_PROPERTIES = TypePackage.TYPE_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Navigation Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__NAVIGATION_PROPERTIES = TypePackage.TYPE_FEATURE_COUNT + 6;

    /**
     * The feature id for the '<em><b>Operations</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__OPERATIONS = TypePackage.TYPE_FEATURE_COUNT + 7;

    /**
     * The number of structural features of the '<em>Entity Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_FEATURE_COUNT = TypePackage.TYPE_FEATURE_COUNT + 8;

    /**
     * The number of operations of the '<em>Entity Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_OPERATION_COUNT = TypePackage.TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.ReferenceTypedElementImpl <em>Reference Typed Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.data.impl.ReferenceTypedElementImpl
     * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getReferenceTypedElement()
     * @generated
     */
    int REFERENCE_TYPED_ELEMENT = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_TYPED_ELEMENT__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

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
     * The number of operations of the '<em>Reference Typed Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_TYPED_ELEMENT_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

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
     * The feature id for the '<em><b>Cascade Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION__CASCADE_DELETE = REFERENCE_TYPED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_FEATURE_COUNT = REFERENCE_TYPED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Relation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_OPERATION_COUNT = REFERENCE_TYPED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.PrimitiveTypedElementImpl <em>Primitive Typed Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.data.impl.PrimitiveTypedElementImpl
     * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getPrimitiveTypedElement()
     * @generated
     */
    int PRIMITIVE_TYPED_ELEMENT = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPED_ELEMENT__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPED_ELEMENT__DATA_TYPE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Primitive Typed Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPED_ELEMENT_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Primitive Typed Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_TYPED_ELEMENT_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

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
    int ATTRIBUTE__REQUIRED = PRIMITIVE_TYPED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Identifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__IDENTIFIER = PRIMITIVE_TYPED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_FEATURE_COUNT = PRIMITIVE_TYPED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_OPERATION_COUNT = PRIMITIVE_TYPED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.EndpointImpl <em>Endpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.data.impl.EndpointImpl
     * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getEndpoint()
     * @generated
     */
    int ENDPOINT = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__NAME = RELATION__NAME;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__TARGET = RELATION__TARGET;

    /**
     * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__CARDINALITY = RELATION__CARDINALITY;

    /**
     * The feature id for the '<em><b>Cascade Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__CASCADE_DELETE = RELATION__CASCADE_DELETE;

    /**
     * The feature id for the '<em><b>Partner</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__PARTNER = RELATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Endpoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT_FEATURE_COUNT = RELATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Endpoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.RelationCountConstraintImpl <em>Relation Count Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.data.impl.RelationCountConstraintImpl
     * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getRelationCountConstraint()
     * @generated
     */
    int RELATION_COUNT_CONSTRAINT = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_COUNT_CONSTRAINT__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Relations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_COUNT_CONSTRAINT__RELATIONS = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_COUNT_CONSTRAINT__CARDINALITY = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Relation Count Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_COUNT_CONSTRAINT_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Relation Count Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATION_COUNT_CONSTRAINT_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.ContainmentImpl <em>Containment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.data.impl.ContainmentImpl
     * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getContainment()
     * @generated
     */
    int CONTAINMENT = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINMENT__NAME = RELATION__NAME;

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
     * The feature id for the '<em><b>Cascade Delete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINMENT__CASCADE_DELETE = RELATION__CASCADE_DELETE;

    /**
     * The number of structural features of the '<em>Containment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINMENT_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Containment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINMENT_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;


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
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getRelationCountConstraints <em>Relation Count Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Relation Count Constraints</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.EntityType#getRelationCountConstraints()
     * @see #getEntityType()
     * @generated
     */
    EReference getEntityType_RelationCountConstraints();

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
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.Relation <em>Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relation</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.Relation
     * @generated
     */
    EClass getRelation();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.Relation#isCascadeDelete <em>Cascade Delete</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Cascade Delete</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.Relation#isCascadeDelete()
     * @see #getRelation()
     * @generated
     */
    EAttribute getRelation_CascadeDelete();

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
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.Attribute#isRequired <em>Required</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Required</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.Attribute#isRequired()
     * @see #getAttribute()
     * @generated
     */
    EAttribute getAttribute_Required();

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
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.Endpoint <em>Endpoint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Endpoint</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.Endpoint
     * @generated
     */
    EClass getEndpoint();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.data.Endpoint#getPartner <em>Partner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Partner</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.Endpoint#getPartner()
     * @see #getEndpoint()
     * @generated
     */
    EReference getEndpoint_Partner();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.RelationCountConstraint <em>Relation Count Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relation Count Constraint</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.RelationCountConstraint
     * @generated
     */
    EClass getRelationCountConstraint();

    /**
     * Returns the meta object for the reference list '{@link hu.blackbelt.judo.meta.psm.data.RelationCountConstraint#getRelations <em>Relations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Relations</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.RelationCountConstraint#getRelations()
     * @see #getRelationCountConstraint()
     * @generated
     */
    EReference getRelationCountConstraint_Relations();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.data.RelationCountConstraint#getCardinality <em>Cardinality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Cardinality</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.RelationCountConstraint#getCardinality()
     * @see #getRelationCountConstraint()
     * @generated
     */
    EReference getRelationCountConstraint_Cardinality();

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
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.Containment <em>Containment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Containment</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.Containment
     * @generated
     */
    EClass getContainment();

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
    interface Literals {
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
         * The meta object literal for the '<em><b>Relation Count Constraints</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE__RELATION_COUNT_CONSTRAINTS = eINSTANCE.getEntityType_RelationCountConstraints();

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
         * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE__OPERATIONS = eINSTANCE.getEntityType_Operations();

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
         * The meta object literal for the '<em><b>Cascade Delete</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RELATION__CASCADE_DELETE = eINSTANCE.getRelation_CascadeDelete();

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
         * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__REQUIRED = eINSTANCE.getAttribute_Required();

        /**
         * The meta object literal for the '<em><b>Identifier</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTRIBUTE__IDENTIFIER = eINSTANCE.getAttribute_Identifier();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.impl.EndpointImpl <em>Endpoint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.data.impl.EndpointImpl
         * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getEndpoint()
         * @generated
         */
        EClass ENDPOINT = eINSTANCE.getEndpoint();

        /**
         * The meta object literal for the '<em><b>Partner</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENDPOINT__PARTNER = eINSTANCE.getEndpoint_Partner();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.impl.RelationCountConstraintImpl <em>Relation Count Constraint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.data.impl.RelationCountConstraintImpl
         * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getRelationCountConstraint()
         * @generated
         */
        EClass RELATION_COUNT_CONSTRAINT = eINSTANCE.getRelationCountConstraint();

        /**
         * The meta object literal for the '<em><b>Relations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATION_COUNT_CONSTRAINT__RELATIONS = eINSTANCE.getRelationCountConstraint_Relations();

        /**
         * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATION_COUNT_CONSTRAINT__CARDINALITY = eINSTANCE.getRelationCountConstraint_Cardinality();

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
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.impl.ContainmentImpl <em>Containment</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.data.impl.ContainmentImpl
         * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getContainment()
         * @generated
         */
        EClass CONTAINMENT = eINSTANCE.getContainment();

    }

} //DataPackage
