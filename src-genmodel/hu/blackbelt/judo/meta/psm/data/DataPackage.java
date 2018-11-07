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
     * The feature id for the '<em><b>Reference Count Constraints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__REFERENCE_COUNT_CONSTRAINTS = TypePackage.TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Super Entity Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__SUPER_ENTITY_TYPES = TypePackage.TYPE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>References</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__REFERENCES = TypePackage.TYPE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__ABSTRACT = TypePackage.TYPE_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__ATTRIBUTES = TypePackage.TYPE_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Entity Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_FEATURE_COUNT = TypePackage.TYPE_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Entity Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_OPERATION_COUNT = TypePackage.TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.data.impl.ReferenceImpl
     * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getReference()
     * @generated
     */
    int REFERENCE = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE__TARGET = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE__CARDINALITY = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

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
    int ATTRIBUTE__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__REQUIRED = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Identifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__IDENTIFIER = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__DATA_TYPE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.ContainmentImpl <em>Containment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.data.impl.ContainmentImpl
     * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getContainment()
     * @generated
     */
    int CONTAINMENT = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINMENT__NAME = REFERENCE__NAME;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINMENT__TARGET = REFERENCE__TARGET;

    /**
     * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINMENT__CARDINALITY = REFERENCE__CARDINALITY;

    /**
     * The number of structural features of the '<em>Containment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINMENT_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Containment</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINMENT_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.EndpointImpl <em>Endpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.data.impl.EndpointImpl
     * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getEndpoint()
     * @generated
     */
    int ENDPOINT = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__NAME = REFERENCE__NAME;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__TARGET = REFERENCE__TARGET;

    /**
     * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__CARDINALITY = REFERENCE__CARDINALITY;

    /**
     * The feature id for the '<em><b>Partner</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__PARTNER = REFERENCE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Endpoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Endpoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.ReferenceCountConstraintImpl <em>Reference Count Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.data.impl.ReferenceCountConstraintImpl
     * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getReferenceCountConstraint()
     * @generated
     */
    int REFERENCE_COUNT_CONSTRAINT = 5;

    /**
     * The feature id for the '<em><b>References</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_COUNT_CONSTRAINT__REFERENCES = 0;

    /**
     * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_COUNT_CONSTRAINT__CARDINALITY = 1;

    /**
     * The number of structural features of the '<em>Reference Count Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_COUNT_CONSTRAINT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Reference Count Constraint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_COUNT_CONSTRAINT_OPERATION_COUNT = 0;


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
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getReferenceCountConstraints <em>Reference Count Constraints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Reference Count Constraints</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.EntityType#getReferenceCountConstraints()
     * @see #getEntityType()
     * @generated
     */
    EReference getEntityType_ReferenceCountConstraints();

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
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getReferences <em>References</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>References</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.EntityType#getReferences()
     * @see #getEntityType()
     * @generated
     */
    EReference getEntityType_References();

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
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.Reference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.Reference
     * @generated
     */
    EClass getReference();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.data.Reference#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.Reference#getTarget()
     * @see #getReference()
     * @generated
     */
    EReference getReference_Target();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.data.Reference#getCardinality <em>Cardinality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Cardinality</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.Reference#getCardinality()
     * @see #getReference()
     * @generated
     */
    EReference getReference_Cardinality();

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
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.data.Attribute#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Type</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.Attribute#getDataType()
     * @see #getAttribute()
     * @generated
     */
    EReference getAttribute_DataType();

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
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.data.ReferenceCountConstraint <em>Reference Count Constraint</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Reference Count Constraint</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.ReferenceCountConstraint
     * @generated
     */
    EClass getReferenceCountConstraint();

    /**
     * Returns the meta object for the reference list '{@link hu.blackbelt.judo.meta.psm.data.ReferenceCountConstraint#getReferences <em>References</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>References</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.ReferenceCountConstraint#getReferences()
     * @see #getReferenceCountConstraint()
     * @generated
     */
    EReference getReferenceCountConstraint_References();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.data.ReferenceCountConstraint#getCardinality <em>Cardinality</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Cardinality</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.ReferenceCountConstraint#getCardinality()
     * @see #getReferenceCountConstraint()
     * @generated
     */
    EReference getReferenceCountConstraint_Cardinality();

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
         * The meta object literal for the '<em><b>Reference Count Constraints</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE__REFERENCE_COUNT_CONSTRAINTS = eINSTANCE.getEntityType_ReferenceCountConstraints();

        /**
         * The meta object literal for the '<em><b>Super Entity Types</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE__SUPER_ENTITY_TYPES = eINSTANCE.getEntityType_SuperEntityTypes();

        /**
         * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE__REFERENCES = eINSTANCE.getEntityType_References();

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
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.impl.ReferenceImpl <em>Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.data.impl.ReferenceImpl
         * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getReference()
         * @generated
         */
        EClass REFERENCE = eINSTANCE.getReference();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERENCE__TARGET = eINSTANCE.getReference_Target();

        /**
         * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERENCE__CARDINALITY = eINSTANCE.getReference_Cardinality();

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
         * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE__DATA_TYPE = eINSTANCE.getAttribute_DataType();

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
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.data.impl.ReferenceCountConstraintImpl <em>Reference Count Constraint</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.data.impl.ReferenceCountConstraintImpl
         * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getReferenceCountConstraint()
         * @generated
         */
        EClass REFERENCE_COUNT_CONSTRAINT = eINSTANCE.getReferenceCountConstraint();

        /**
         * The meta object literal for the '<em><b>References</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERENCE_COUNT_CONSTRAINT__REFERENCES = eINSTANCE.getReferenceCountConstraint_References();

        /**
         * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REFERENCE_COUNT_CONSTRAINT__CARDINALITY = eINSTANCE.getReferenceCountConstraint_Cardinality();

    }

} //DataPackage
