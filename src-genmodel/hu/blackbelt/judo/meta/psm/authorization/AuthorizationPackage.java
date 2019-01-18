/**
 */
package hu.blackbelt.judo.meta.psm.authorization;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

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
 * @see hu.blackbelt.judo.meta.psm.authorization.AuthorizationFactory
 * @model kind="package"
 * @generated
 */
public interface AuthorizationPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "authorization";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://blackbelt.hu/judo/meta/psm/authorization";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "authorization";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AuthorizationPackage eINSTANCE = hu.blackbelt.judo.meta.psm.authorization.impl.AuthorizationPackageImpl.init();

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.authorization.impl.AuthorizationResourceImpl <em>Resource</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.authorization.impl.AuthorizationResourceImpl
     * @see hu.blackbelt.judo.meta.psm.authorization.impl.AuthorizationPackageImpl#getAuthorizationResource()
     * @generated
     */
    int AUTHORIZATION_RESOURCE = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZATION_RESOURCE__NAME = NamespacePackage.NAMESPACE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Reference Typed Elements</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZATION_RESOURCE__REFERENCE_TYPED_ELEMENTS = NamespacePackage.NAMESPACE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operations</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZATION_RESOURCE__OPERATIONS = NamespacePackage.NAMESPACE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Included Authorization Resources</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZATION_RESOURCE__INCLUDED_AUTHORIZATION_RESOURCES = NamespacePackage.NAMESPACE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZATION_RESOURCE_FEATURE_COUNT = NamespacePackage.NAMESPACE_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Resource</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int AUTHORIZATION_RESOURCE_OPERATION_COUNT = NamespacePackage.NAMESPACE_ELEMENT_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.authorization.AuthorizationResource <em>Resource</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Resource</em>'.
     * @see hu.blackbelt.judo.meta.psm.authorization.AuthorizationResource
     * @generated
     */
    EClass getAuthorizationResource();

    /**
     * Returns the meta object for the reference list '{@link hu.blackbelt.judo.meta.psm.authorization.AuthorizationResource#getReferenceTypedElements <em>Reference Typed Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Reference Typed Elements</em>'.
     * @see hu.blackbelt.judo.meta.psm.authorization.AuthorizationResource#getReferenceTypedElements()
     * @see #getAuthorizationResource()
     * @generated
     */
    EReference getAuthorizationResource_ReferenceTypedElements();

    /**
     * Returns the meta object for the reference list '{@link hu.blackbelt.judo.meta.psm.authorization.AuthorizationResource#getOperations <em>Operations</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Operations</em>'.
     * @see hu.blackbelt.judo.meta.psm.authorization.AuthorizationResource#getOperations()
     * @see #getAuthorizationResource()
     * @generated
     */
    EReference getAuthorizationResource_Operations();

    /**
     * Returns the meta object for the reference list '{@link hu.blackbelt.judo.meta.psm.authorization.AuthorizationResource#getIncludedAuthorizationResources <em>Included Authorization Resources</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Included Authorization Resources</em>'.
     * @see hu.blackbelt.judo.meta.psm.authorization.AuthorizationResource#getIncludedAuthorizationResources()
     * @see #getAuthorizationResource()
     * @generated
     */
    EReference getAuthorizationResource_IncludedAuthorizationResources();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    AuthorizationFactory getAuthorizationFactory();

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
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.authorization.impl.AuthorizationResourceImpl <em>Resource</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.authorization.impl.AuthorizationResourceImpl
         * @see hu.blackbelt.judo.meta.psm.authorization.impl.AuthorizationPackageImpl#getAuthorizationResource()
         * @generated
         */
        EClass AUTHORIZATION_RESOURCE = eINSTANCE.getAuthorizationResource();

        /**
         * The meta object literal for the '<em><b>Reference Typed Elements</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AUTHORIZATION_RESOURCE__REFERENCE_TYPED_ELEMENTS = eINSTANCE.getAuthorizationResource_ReferenceTypedElements();

        /**
         * The meta object literal for the '<em><b>Operations</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AUTHORIZATION_RESOURCE__OPERATIONS = eINSTANCE.getAuthorizationResource_Operations();

        /**
         * The meta object literal for the '<em><b>Included Authorization Resources</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference AUTHORIZATION_RESOURCE__INCLUDED_AUTHORIZATION_RESOURCES = eINSTANCE.getAuthorizationResource_IncludedAuthorizationResources();

    }

} //AuthorizationPackage
