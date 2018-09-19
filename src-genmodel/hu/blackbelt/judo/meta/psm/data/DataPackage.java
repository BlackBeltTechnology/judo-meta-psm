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
    int ENTITY_TYPE__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__ATTRIBUTES = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Super Entity Types</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__SUPER_ENTITY_TYPES = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Abstract</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__ABSTRACT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Endpoints</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE__ENDPOINTS = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Entity Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Entity Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_TYPE_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.EndpointImpl <em>Endpoint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.data.impl.EndpointImpl
     * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getEndpoint()
     * @generated
     */
    int ENDPOINT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Composition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__COMPOSITION = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Partner</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__PARTNER = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Reference</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__REFERENCE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Lower</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__LOWER = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Upper</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT__UPPER = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of structural features of the '<em>Endpoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The number of operations of the '<em>Endpoint</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENDPOINT_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

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
     * The feature id for the '<em><b>Data Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__DATA_TYPE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__REQUIRED = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Identifier</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTRIBUTE__IDENTIFIER = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

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
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.data.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.data.impl.ReferenceImpl
     * @see hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl#getReference()
     * @generated
     */
    int REFERENCE = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE__NAME = TypePackage.TYPE__NAME;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE__TARGET = TypePackage.TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_FEATURE_COUNT = TypePackage.TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REFERENCE_OPERATION_COUNT = TypePackage.TYPE_OPERATION_COUNT + 0;


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
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.data.EntityType#getEndpoints <em>Endpoints</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Endpoints</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.EntityType#getEndpoints()
     * @see #getEntityType()
     * @generated
     */
    EReference getEntityType_Endpoints();

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
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.Endpoint#isComposition <em>Composition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Composition</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.Endpoint#isComposition()
     * @see #getEndpoint()
     * @generated
     */
    EAttribute getEndpoint_Composition();

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
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.data.Endpoint#getReference <em>Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Reference</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.Endpoint#getReference()
     * @see #getEndpoint()
     * @generated
     */
    EReference getEndpoint_Reference();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.Endpoint#getLower <em>Lower</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Lower</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.Endpoint#getLower()
     * @see #getEndpoint()
     * @generated
     */
    EAttribute getEndpoint_Lower();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.data.Endpoint#getUpper <em>Upper</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Upper</em>'.
     * @see hu.blackbelt.judo.meta.psm.data.Endpoint#getUpper()
     * @see #getEndpoint()
     * @generated
     */
    EAttribute getEndpoint_Upper();

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
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE__ATTRIBUTES = eINSTANCE.getEntityType_Attributes();

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
         * The meta object literal for the '<em><b>Endpoints</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_TYPE__ENDPOINTS = eINSTANCE.getEntityType_Endpoints();

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
         * The meta object literal for the '<em><b>Composition</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENDPOINT__COMPOSITION = eINSTANCE.getEndpoint_Composition();

        /**
         * The meta object literal for the '<em><b>Partner</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENDPOINT__PARTNER = eINSTANCE.getEndpoint_Partner();

        /**
         * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENDPOINT__REFERENCE = eINSTANCE.getEndpoint_Reference();

        /**
         * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENDPOINT__LOWER = eINSTANCE.getEndpoint_Lower();

        /**
         * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENDPOINT__UPPER = eINSTANCE.getEndpoint_Upper();

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
         * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ATTRIBUTE__DATA_TYPE = eINSTANCE.getAttribute_DataType();

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

    }

} //DataPackage
