/**
 */
package hu.blackbelt.judo.meta.psm.namespace;

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
 * @see hu.blackbelt.judo.meta.psm.namespace.NamespaceFactory
 * @model kind="package"
 * @generated
 */
public interface NamespacePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "namespace";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://blackbelt.hu/judo/meta/psm/namespace";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "namespace";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    NamespacePackage eINSTANCE = hu.blackbelt.judo.meta.psm.namespace.impl.NamespacePackageImpl.init();

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl
     * @see hu.blackbelt.judo.meta.psm.namespace.impl.NamespacePackageImpl#getNamedElement()
     * @generated
     */
    int NAMED_ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT__NAME = 0;

    /**
     * The number of structural features of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceImpl <em>Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceImpl
     * @see hu.blackbelt.judo.meta.psm.namespace.impl.NamespacePackageImpl#getNamespace()
     * @generated
     */
    int NAMESPACE = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE__NAME = NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE__PACKAGES = NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE__TYPES = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Entity Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE__ENTITY_TYPES = NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Facades</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE__FACADES = NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Namespace</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Namespace</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMESPACE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.namespace.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.namespace.impl.ModelImpl
     * @see hu.blackbelt.judo.meta.psm.namespace.impl.NamespacePackageImpl#getModel()
     * @generated
     */
    int MODEL = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__NAME = NAMESPACE__NAME;

    /**
     * The feature id for the '<em><b>Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__PACKAGES = NAMESPACE__PACKAGES;

    /**
     * The feature id for the '<em><b>Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__TYPES = NAMESPACE__TYPES;

    /**
     * The feature id for the '<em><b>Entity Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__ENTITY_TYPES = NAMESPACE__ENTITY_TYPES;

    /**
     * The feature id for the '<em><b>Facades</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL__FACADES = NAMESPACE__FACADES;

    /**
     * The number of structural features of the '<em>Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_FEATURE_COUNT = NAMESPACE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MODEL_OPERATION_COUNT = NAMESPACE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.namespace.impl.PackageImpl <em>Package</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.namespace.impl.PackageImpl
     * @see hu.blackbelt.judo.meta.psm.namespace.impl.NamespacePackageImpl#getPackage()
     * @generated
     */
    int PACKAGE = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__NAME = NAMESPACE__NAME;

    /**
     * The feature id for the '<em><b>Packages</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__PACKAGES = NAMESPACE__PACKAGES;

    /**
     * The feature id for the '<em><b>Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__TYPES = NAMESPACE__TYPES;

    /**
     * The feature id for the '<em><b>Entity Types</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__ENTITY_TYPES = NAMESPACE__ENTITY_TYPES;

    /**
     * The feature id for the '<em><b>Facades</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE__FACADES = NAMESPACE__FACADES;

    /**
     * The number of structural features of the '<em>Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_FEATURE_COUNT = NAMESPACE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Package</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PACKAGE_OPERATION_COUNT = NAMESPACE_OPERATION_COUNT + 0;


    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.namespace.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named Element</em>'.
     * @see hu.blackbelt.judo.meta.psm.namespace.NamedElement
     * @generated
     */
    EClass getNamedElement();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.namespace.NamedElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see hu.blackbelt.judo.meta.psm.namespace.NamedElement#getName()
     * @see #getNamedElement()
     * @generated
     */
    EAttribute getNamedElement_Name();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.namespace.Namespace <em>Namespace</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Namespace</em>'.
     * @see hu.blackbelt.judo.meta.psm.namespace.Namespace
     * @generated
     */
    EClass getNamespace();

    /**
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.namespace.Namespace#getPackages <em>Packages</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Packages</em>'.
     * @see hu.blackbelt.judo.meta.psm.namespace.Namespace#getPackages()
     * @see #getNamespace()
     * @generated
     */
    EReference getNamespace_Packages();

    /**
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.namespace.Namespace#getTypes <em>Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Types</em>'.
     * @see hu.blackbelt.judo.meta.psm.namespace.Namespace#getTypes()
     * @see #getNamespace()
     * @generated
     */
    EReference getNamespace_Types();

    /**
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.namespace.Namespace#getEntityTypes <em>Entity Types</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Entity Types</em>'.
     * @see hu.blackbelt.judo.meta.psm.namespace.Namespace#getEntityTypes()
     * @see #getNamespace()
     * @generated
     */
    EReference getNamespace_EntityTypes();

    /**
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.namespace.Namespace#getFacades <em>Facades</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Facades</em>'.
     * @see hu.blackbelt.judo.meta.psm.namespace.Namespace#getFacades()
     * @see #getNamespace()
     * @generated
     */
    EReference getNamespace_Facades();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.namespace.Model <em>Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Model</em>'.
     * @see hu.blackbelt.judo.meta.psm.namespace.Model
     * @generated
     */
    EClass getModel();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.namespace.Package <em>Package</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Package</em>'.
     * @see hu.blackbelt.judo.meta.psm.namespace.Package
     * @generated
     */
    EClass getPackage();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    NamespaceFactory getNamespaceFactory();

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
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl <em>Named Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl
         * @see hu.blackbelt.judo.meta.psm.namespace.impl.NamespacePackageImpl#getNamedElement()
         * @generated
         */
        EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceImpl <em>Namespace</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceImpl
         * @see hu.blackbelt.judo.meta.psm.namespace.impl.NamespacePackageImpl#getNamespace()
         * @generated
         */
        EClass NAMESPACE = eINSTANCE.getNamespace();

        /**
         * The meta object literal for the '<em><b>Packages</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NAMESPACE__PACKAGES = eINSTANCE.getNamespace_Packages();

        /**
         * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NAMESPACE__TYPES = eINSTANCE.getNamespace_Types();

        /**
         * The meta object literal for the '<em><b>Entity Types</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NAMESPACE__ENTITY_TYPES = eINSTANCE.getNamespace_EntityTypes();

        /**
         * The meta object literal for the '<em><b>Facades</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NAMESPACE__FACADES = eINSTANCE.getNamespace_Facades();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.namespace.impl.ModelImpl <em>Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.namespace.impl.ModelImpl
         * @see hu.blackbelt.judo.meta.psm.namespace.impl.NamespacePackageImpl#getModel()
         * @generated
         */
        EClass MODEL = eINSTANCE.getModel();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.namespace.impl.PackageImpl <em>Package</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.namespace.impl.PackageImpl
         * @see hu.blackbelt.judo.meta.psm.namespace.impl.NamespacePackageImpl#getPackage()
         * @generated
         */
        EClass PACKAGE = eINSTANCE.getPackage();

    }

} //NamespacePackage
