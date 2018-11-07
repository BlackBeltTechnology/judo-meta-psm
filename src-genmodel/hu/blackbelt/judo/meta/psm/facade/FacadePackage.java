/**
 */
package hu.blackbelt.judo.meta.psm.facade;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see hu.blackbelt.judo.meta.psm.facade.FacadeFactory
 * @model kind="package"
 * @generated
 */
public interface FacadePackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "facade";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://blackbelt.hu/judo/meta/psm/facade";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "facade";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    FacadePackage eINSTANCE = hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl.init();

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.PropertySetImpl <em>Property Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.PropertySetImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getPropertySet()
     * @generated
     */
    int PROPERTY_SET = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_SET__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_SET__PROPERTIES = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Navigation Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_SET__NAVIGATION_PROPERTIES = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_SET__ENTITY_TYPE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Property Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_SET_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Property Set</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_SET_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.PropertyImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Data Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__DATA_TYPE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Read Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__READ_DEFINITION = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Write Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__WRITE_DEFINITION = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.FacadeImpl <em>Facade</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadeImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getFacade()
     * @generated
     */
    int FACADE = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACADE__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Property Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACADE__PROPERTY_SET = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Update Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACADE__UPDATE_OPERATION = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Create Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACADE__CREATE_OPERATION = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Delete Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACADE__DELETE_OPERATION = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Facade</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACADE_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Facade</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACADE_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.NavigationImpl <em>Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.NavigationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getNavigation()
     * @generated
     */
    int NAVIGATION = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION__NAME = FACADE__NAME;

    /**
     * The feature id for the '<em><b>Property Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION__PROPERTY_SET = FACADE__PROPERTY_SET;

    /**
     * The feature id for the '<em><b>Update Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION__UPDATE_OPERATION = FACADE__UPDATE_OPERATION;

    /**
     * The feature id for the '<em><b>Create Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION__CREATE_OPERATION = FACADE__CREATE_OPERATION;

    /**
     * The feature id for the '<em><b>Delete Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION__DELETE_OPERATION = FACADE__DELETE_OPERATION;

    /**
     * The number of structural features of the '<em>Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION_FEATURE_COUNT = FACADE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION_OPERATION_COUNT = FACADE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.SingleNavigationImpl <em>Single Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.SingleNavigationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getSingleNavigation()
     * @generated
     */
    int SINGLE_NAVIGATION = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_NAVIGATION__NAME = NAVIGATION__NAME;

    /**
     * The feature id for the '<em><b>Property Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_NAVIGATION__PROPERTY_SET = NAVIGATION__PROPERTY_SET;

    /**
     * The feature id for the '<em><b>Update Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_NAVIGATION__UPDATE_OPERATION = NAVIGATION__UPDATE_OPERATION;

    /**
     * The feature id for the '<em><b>Create Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_NAVIGATION__CREATE_OPERATION = NAVIGATION__CREATE_OPERATION;

    /**
     * The feature id for the '<em><b>Delete Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_NAVIGATION__DELETE_OPERATION = NAVIGATION__DELETE_OPERATION;

    /**
     * The feature id for the '<em><b>Traverse Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_NAVIGATION__TRAVERSE_DEFINITION = NAVIGATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Bind Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_NAVIGATION__BIND_DEFINITION = NAVIGATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Single Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_NAVIGATION_FEATURE_COUNT = NAVIGATION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Single Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_NAVIGATION_OPERATION_COUNT = NAVIGATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.ListNavigationImpl <em>List Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.ListNavigationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getListNavigation()
     * @generated
     */
    int LIST_NAVIGATION = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_NAVIGATION__NAME = NAVIGATION__NAME;

    /**
     * The feature id for the '<em><b>Property Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_NAVIGATION__PROPERTY_SET = NAVIGATION__PROPERTY_SET;

    /**
     * The feature id for the '<em><b>Update Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_NAVIGATION__UPDATE_OPERATION = NAVIGATION__UPDATE_OPERATION;

    /**
     * The feature id for the '<em><b>Create Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_NAVIGATION__CREATE_OPERATION = NAVIGATION__CREATE_OPERATION;

    /**
     * The feature id for the '<em><b>Delete Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_NAVIGATION__DELETE_OPERATION = NAVIGATION__DELETE_OPERATION;

    /**
     * The feature id for the '<em><b>Traverse Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_NAVIGATION__TRAVERSE_DEFINITION = NAVIGATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Attach Definition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_NAVIGATION__ATTACH_DEFINITION = NAVIGATION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Detach Navigation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_NAVIGATION__DETACH_NAVIGATION = NAVIGATION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>List Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_NAVIGATION_FEATURE_COUNT = NAVIGATION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>List Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_NAVIGATION_OPERATION_COUNT = NAVIGATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.EntitySelectorImpl <em>Entity Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.EntitySelectorImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getEntitySelector()
     * @generated
     */
    int ENTITY_SELECTOR = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_SELECTOR__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_SELECTOR__ENTITY_TYPE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Entity Selector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_SELECTOR_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Entity Selector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_SELECTOR_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.EntitySetSelectorImpl <em>Entity Set Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.EntitySetSelectorImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getEntitySetSelector()
     * @generated
     */
    int ENTITY_SET_SELECTOR = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_SET_SELECTOR__NAME = ENTITY_SELECTOR__NAME;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_SET_SELECTOR__ENTITY_TYPE = ENTITY_SELECTOR__ENTITY_TYPE;

    /**
     * The feature id for the '<em><b>Get Expr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_SET_SELECTOR__GET_EXPR = ENTITY_SELECTOR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Entity Set Selector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_SET_SELECTOR_FEATURE_COUNT = ENTITY_SELECTOR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Entity Set Selector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_SET_SELECTOR_OPERATION_COUNT = ENTITY_SELECTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.EntitySingleSelectorImpl <em>Entity Single Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.EntitySingleSelectorImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getEntitySingleSelector()
     * @generated
     */
    int ENTITY_SINGLE_SELECTOR = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_SINGLE_SELECTOR__NAME = ENTITY_SELECTOR__NAME;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_SINGLE_SELECTOR__ENTITY_TYPE = ENTITY_SELECTOR__ENTITY_TYPE;

    /**
     * The feature id for the '<em><b>Get Expr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_SINGLE_SELECTOR__GET_EXPR = ENTITY_SELECTOR_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Entity Single Selector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_SINGLE_SELECTOR_FEATURE_COUNT = ENTITY_SELECTOR_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Entity Single Selector</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_SINGLE_SELECTOR_OPERATION_COUNT = ENTITY_SELECTOR_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.StandaloneFacadeImpl <em>Standalone Facade</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.StandaloneFacadeImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getStandaloneFacade()
     * @generated
     */
    int STANDALONE_FACADE = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STANDALONE_FACADE__NAME = FACADE__NAME;

    /**
     * The feature id for the '<em><b>Property Set</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STANDALONE_FACADE__PROPERTY_SET = FACADE__PROPERTY_SET;

    /**
     * The feature id for the '<em><b>Update Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STANDALONE_FACADE__UPDATE_OPERATION = FACADE__UPDATE_OPERATION;

    /**
     * The feature id for the '<em><b>Create Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STANDALONE_FACADE__CREATE_OPERATION = FACADE__CREATE_OPERATION;

    /**
     * The feature id for the '<em><b>Delete Operation</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STANDALONE_FACADE__DELETE_OPERATION = FACADE__DELETE_OPERATION;

    /**
     * The feature id for the '<em><b>Entity Selector</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STANDALONE_FACADE__ENTITY_SELECTOR = FACADE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Standalone Facade</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STANDALONE_FACADE_FEATURE_COUNT = FACADE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Standalone Facade</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STANDALONE_FACADE_OPERATION_COUNT = FACADE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.DeleteOperationImpl <em>Delete Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.DeleteOperationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getDeleteOperation()
     * @generated
     */
    int DELETE_OPERATION = 10;

    /**
     * The feature id for the '<em><b>Delete Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE_OPERATION__DELETE_OPERATION = 0;

    /**
     * The number of structural features of the '<em>Delete Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE_OPERATION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Delete Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE_OPERATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.ReadPropertyImpl <em>Read Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.ReadPropertyImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getReadProperty()
     * @generated
     */
    int READ_PROPERTY = 13;

    /**
     * The number of structural features of the '<em>Read Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_PROPERTY_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Read Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_PROPERTY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.ReadFilterablePropertyImpl <em>Read Filterable Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.ReadFilterablePropertyImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getReadFilterableProperty()
     * @generated
     */
    int READ_FILTERABLE_PROPERTY = 11;

    /**
     * The feature id for the '<em><b>Filtareble</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_FILTERABLE_PROPERTY__FILTAREBLE = READ_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Read Expr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_FILTERABLE_PROPERTY__READ_EXPR = READ_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Read Filterable Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_FILTERABLE_PROPERTY_FEATURE_COUNT = READ_PROPERTY_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Read Filterable Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_FILTERABLE_PROPERTY_OPERATION_COUNT = READ_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.ReadFunctionPropertyImpl <em>Read Function Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.ReadFunctionPropertyImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getReadFunctionProperty()
     * @generated
     */
    int READ_FUNCTION_PROPERTY = 12;

    /**
     * The feature id for the '<em><b>Read Function</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_FUNCTION_PROPERTY__READ_FUNCTION = READ_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Read Function Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_FUNCTION_PROPERTY_FEATURE_COUNT = READ_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Read Function Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int READ_FUNCTION_PROPERTY_OPERATION_COUNT = READ_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.WritePropertyImpl <em>Write Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.WritePropertyImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getWriteProperty()
     * @generated
     */
    int WRITE_PROPERTY = 14;

    /**
     * The number of structural features of the '<em>Write Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_PROPERTY_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Write Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_PROPERTY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.WriteAttributeImpl <em>Write Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.WriteAttributeImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getWriteAttribute()
     * @generated
     */
    int WRITE_ATTRIBUTE = 15;

    /**
     * The feature id for the '<em><b>Write Expr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_ATTRIBUTE__WRITE_EXPR = WRITE_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Write Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_ATTRIBUTE_FEATURE_COUNT = WRITE_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Write Attribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_ATTRIBUTE_OPERATION_COUNT = WRITE_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.WriteFunctionPropertyImpl <em>Write Function Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.WriteFunctionPropertyImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getWriteFunctionProperty()
     * @generated
     */
    int WRITE_FUNCTION_PROPERTY = 16;

    /**
     * The feature id for the '<em><b>Write Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_FUNCTION_PROPERTY__WRITE_OPERATION = WRITE_PROPERTY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Write Function Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_FUNCTION_PROPERTY_FEATURE_COUNT = WRITE_PROPERTY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Write Function Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WRITE_FUNCTION_PROPERTY_OPERATION_COUNT = WRITE_PROPERTY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.TraverseSingleNavigationImpl <em>Traverse Single Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.TraverseSingleNavigationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getTraverseSingleNavigation()
     * @generated
     */
    int TRAVERSE_SINGLE_NAVIGATION = 18;

    /**
     * The number of structural features of the '<em>Traverse Single Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAVERSE_SINGLE_NAVIGATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Traverse Single Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAVERSE_SINGLE_NAVIGATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.TraverseFunctionSingleNavigationImpl <em>Traverse Function Single Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.TraverseFunctionSingleNavigationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getTraverseFunctionSingleNavigation()
     * @generated
     */
    int TRAVERSE_FUNCTION_SINGLE_NAVIGATION = 17;

    /**
     * The feature id for the '<em><b>Traverse Function</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAVERSE_FUNCTION_SINGLE_NAVIGATION__TRAVERSE_FUNCTION = TRAVERSE_SINGLE_NAVIGATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Traverse Function Single Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAVERSE_FUNCTION_SINGLE_NAVIGATION_FEATURE_COUNT = TRAVERSE_SINGLE_NAVIGATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Traverse Function Single Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAVERSE_FUNCTION_SINGLE_NAVIGATION_OPERATION_COUNT = TRAVERSE_SINGLE_NAVIGATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.TraverseListNavigationImpl <em>Traverse List Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.TraverseListNavigationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getTraverseListNavigation()
     * @generated
     */
    int TRAVERSE_LIST_NAVIGATION = 19;

    /**
     * The number of structural features of the '<em>Traverse List Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAVERSE_LIST_NAVIGATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Traverse List Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAVERSE_LIST_NAVIGATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.MultiTraverseFunctionDefinitionImpl <em>Multi Traverse Function Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.MultiTraverseFunctionDefinitionImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getMultiTraverseFunctionDefinition()
     * @generated
     */
    int MULTI_TRAVERSE_FUNCTION_DEFINITION = 20;

    /**
     * The feature id for the '<em><b>Traverse Function</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_TRAVERSE_FUNCTION_DEFINITION__TRAVERSE_FUNCTION = TRAVERSE_LIST_NAVIGATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Multi Traverse Function Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_TRAVERSE_FUNCTION_DEFINITION_FEATURE_COUNT = TRAVERSE_LIST_NAVIGATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Multi Traverse Function Definition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MULTI_TRAVERSE_FUNCTION_DEFINITION_OPERATION_COUNT = TRAVERSE_LIST_NAVIGATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.CreateOperationImpl <em>Create Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.CreateOperationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getCreateOperation()
     * @generated
     */
    int CREATE_OPERATION = 21;

    /**
     * The number of structural features of the '<em>Create Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREATE_OPERATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Create Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CREATE_OPERATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.DefaultCreateOperationImpl <em>Default Create Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.DefaultCreateOperationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getDefaultCreateOperation()
     * @generated
     */
    int DEFAULT_CREATE_OPERATION = 22;

    /**
     * The feature id for the '<em><b>Pre Create Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_CREATE_OPERATION__PRE_CREATE_OPERATION = CREATE_OPERATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Post Create Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_CREATE_OPERATION__POST_CREATE_OPERATION = CREATE_OPERATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Default Create Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_CREATE_OPERATION_FEATURE_COUNT = CREATE_OPERATION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Default Create Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_CREATE_OPERATION_OPERATION_COUNT = CREATE_OPERATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.CustomCreateOperationImpl <em>Custom Create Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.CustomCreateOperationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getCustomCreateOperation()
     * @generated
     */
    int CUSTOM_CREATE_OPERATION = 23;

    /**
     * The feature id for the '<em><b>Create Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_CREATE_OPERATION__CREATE_OPERATION = CREATE_OPERATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Custom Create Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_CREATE_OPERATION_FEATURE_COUNT = CREATE_OPERATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Custom Create Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_CREATE_OPERATION_OPERATION_COUNT = CREATE_OPERATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.UpdateOperationImpl <em>Update Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.UpdateOperationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getUpdateOperation()
     * @generated
     */
    int UPDATE_OPERATION = 24;

    /**
     * The number of structural features of the '<em>Update Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPDATE_OPERATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Update Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UPDATE_OPERATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.DefaultUpdateOperationImpl <em>Default Update Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.DefaultUpdateOperationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getDefaultUpdateOperation()
     * @generated
     */
    int DEFAULT_UPDATE_OPERATION = 25;

    /**
     * The feature id for the '<em><b>Pre Update Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_UPDATE_OPERATION__PRE_UPDATE_OPERATION = UPDATE_OPERATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Post Update Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_UPDATE_OPERATION__POST_UPDATE_OPERATION = UPDATE_OPERATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Default Update Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_UPDATE_OPERATION_FEATURE_COUNT = UPDATE_OPERATION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Default Update Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DEFAULT_UPDATE_OPERATION_OPERATION_COUNT = UPDATE_OPERATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.CustomUpdateOperationImpl <em>Custom Update Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.CustomUpdateOperationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getCustomUpdateOperation()
     * @generated
     */
    int CUSTOM_UPDATE_OPERATION = 26;

    /**
     * The feature id for the '<em><b>Update Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_UPDATE_OPERATION__UPDATE_OPERATION = UPDATE_OPERATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Custom Update Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_UPDATE_OPERATION_FEATURE_COUNT = UPDATE_OPERATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Custom Update Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_UPDATE_OPERATION_OPERATION_COUNT = UPDATE_OPERATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.BindSingleNavigationImpl <em>Bind Single Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.BindSingleNavigationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getBindSingleNavigation()
     * @generated
     */
    int BIND_SINGLE_NAVIGATION = 27;

    /**
     * The number of structural features of the '<em>Bind Single Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIND_SINGLE_NAVIGATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Bind Single Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIND_SINGLE_NAVIGATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.BindSingleReferenceImpl <em>Bind Single Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.BindSingleReferenceImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getBindSingleReference()
     * @generated
     */
    int BIND_SINGLE_REFERENCE = 28;

    /**
     * The feature id for the '<em><b>Bind Expr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIND_SINGLE_REFERENCE__BIND_EXPR = BIND_SINGLE_NAVIGATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Bind Single Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIND_SINGLE_REFERENCE_FEATURE_COUNT = BIND_SINGLE_NAVIGATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Bind Single Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIND_SINGLE_REFERENCE_OPERATION_COUNT = BIND_SINGLE_NAVIGATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.TraverseFilterableSingleNavigationImpl <em>Traverse Filterable Single Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.TraverseFilterableSingleNavigationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getTraverseFilterableSingleNavigation()
     * @generated
     */
    int TRAVERSE_FILTERABLE_SINGLE_NAVIGATION = 29;

    /**
     * The feature id for the '<em><b>Filterable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAVERSE_FILTERABLE_SINGLE_NAVIGATION__FILTERABLE = TRAVERSE_SINGLE_NAVIGATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Traverse Expr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAVERSE_FILTERABLE_SINGLE_NAVIGATION__TRAVERSE_EXPR = TRAVERSE_SINGLE_NAVIGATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Traverse Filterable Single Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAVERSE_FILTERABLE_SINGLE_NAVIGATION_FEATURE_COUNT = TRAVERSE_SINGLE_NAVIGATION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Traverse Filterable Single Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAVERSE_FILTERABLE_SINGLE_NAVIGATION_OPERATION_COUNT = TRAVERSE_SINGLE_NAVIGATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.BindFunctionSingleNavigationImpl <em>Bind Function Single Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.BindFunctionSingleNavigationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getBindFunctionSingleNavigation()
     * @generated
     */
    int BIND_FUNCTION_SINGLE_NAVIGATION = 30;

    /**
     * The feature id for the '<em><b>Bind Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIND_FUNCTION_SINGLE_NAVIGATION__BIND_OPERATION = BIND_SINGLE_NAVIGATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Bind Function Single Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIND_FUNCTION_SINGLE_NAVIGATION_FEATURE_COUNT = BIND_SINGLE_NAVIGATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Bind Function Single Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BIND_FUNCTION_SINGLE_NAVIGATION_OPERATION_COUNT = BIND_SINGLE_NAVIGATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.TraverseFilterableListNavigationImpl <em>Traverse Filterable List Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.TraverseFilterableListNavigationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getTraverseFilterableListNavigation()
     * @generated
     */
    int TRAVERSE_FILTERABLE_LIST_NAVIGATION = 31;

    /**
     * The feature id for the '<em><b>Filterable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAVERSE_FILTERABLE_LIST_NAVIGATION__FILTERABLE = TRAVERSE_LIST_NAVIGATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Traverse Expr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAVERSE_FILTERABLE_LIST_NAVIGATION__TRAVERSE_EXPR = TRAVERSE_LIST_NAVIGATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Traverse Filterable List Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAVERSE_FILTERABLE_LIST_NAVIGATION_FEATURE_COUNT = TRAVERSE_LIST_NAVIGATION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Traverse Filterable List Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRAVERSE_FILTERABLE_LIST_NAVIGATION_OPERATION_COUNT = TRAVERSE_LIST_NAVIGATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.AttachListNavigationImpl <em>Attach List Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.AttachListNavigationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getAttachListNavigation()
     * @generated
     */
    int ATTACH_LIST_NAVIGATION = 32;

    /**
     * The number of structural features of the '<em>Attach List Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACH_LIST_NAVIGATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Attach List Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACH_LIST_NAVIGATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.DetachListNavigationImpl <em>Detach List Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.DetachListNavigationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getDetachListNavigation()
     * @generated
     */
    int DETACH_LIST_NAVIGATION = 33;

    /**
     * The number of structural features of the '<em>Detach List Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DETACH_LIST_NAVIGATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Detach List Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DETACH_LIST_NAVIGATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.AttachListReferenceImpl <em>Attach List Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.AttachListReferenceImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getAttachListReference()
     * @generated
     */
    int ATTACH_LIST_REFERENCE = 34;

    /**
     * The feature id for the '<em><b>Attach Expr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACH_LIST_REFERENCE__ATTACH_EXPR = ATTACH_LIST_NAVIGATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Attach List Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACH_LIST_REFERENCE_FEATURE_COUNT = ATTACH_LIST_NAVIGATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Attach List Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACH_LIST_REFERENCE_OPERATION_COUNT = ATTACH_LIST_NAVIGATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.AttachFunctionListNavigationImpl <em>Attach Function List Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.AttachFunctionListNavigationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getAttachFunctionListNavigation()
     * @generated
     */
    int ATTACH_FUNCTION_LIST_NAVIGATION = 35;

    /**
     * The feature id for the '<em><b>Attach Function</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACH_FUNCTION_LIST_NAVIGATION__ATTACH_FUNCTION = ATTACH_LIST_NAVIGATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Attach Function List Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACH_FUNCTION_LIST_NAVIGATION_FEATURE_COUNT = ATTACH_LIST_NAVIGATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Attach Function List Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ATTACH_FUNCTION_LIST_NAVIGATION_OPERATION_COUNT = ATTACH_LIST_NAVIGATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.DetachListReferenceImpl <em>Detach List Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.DetachListReferenceImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getDetachListReference()
     * @generated
     */
    int DETACH_LIST_REFERENCE = 36;

    /**
     * The feature id for the '<em><b>Detach Expr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DETACH_LIST_REFERENCE__DETACH_EXPR = DETACH_LIST_NAVIGATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Detach List Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DETACH_LIST_REFERENCE_FEATURE_COUNT = DETACH_LIST_NAVIGATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Detach List Reference</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DETACH_LIST_REFERENCE_OPERATION_COUNT = DETACH_LIST_NAVIGATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.DetachFunctionListNavigationImpl <em>Detach Function List Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.DetachFunctionListNavigationImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getDetachFunctionListNavigation()
     * @generated
     */
    int DETACH_FUNCTION_LIST_NAVIGATION = 37;

    /**
     * The feature id for the '<em><b>Detach Function</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DETACH_FUNCTION_LIST_NAVIGATION__DETACH_FUNCTION = DETACH_LIST_NAVIGATION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Detach Function List Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DETACH_FUNCTION_LIST_NAVIGATION_FEATURE_COUNT = DETACH_LIST_NAVIGATION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Detach Function List Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DETACH_FUNCTION_LIST_NAVIGATION_OPERATION_COUNT = DETACH_LIST_NAVIGATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '<em>Entity Set Expr</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getEntitySetExpr()
     * @generated
     */
    int ENTITY_SET_EXPR = 38;

    /**
     * The meta object id for the '<em>Single Attribute Expr</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getSingleAttributeExpr()
     * @generated
     */
    int SINGLE_ATTRIBUTE_EXPR = 39;

    /**
     * The meta object id for the '<em>Single Data Expr</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getSingleDataExpr()
     * @generated
     */
    int SINGLE_DATA_EXPR = 40;

    /**
     * The meta object id for the '<em>Entity Expr</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getEntityExpr()
     * @generated
     */
    int ENTITY_EXPR = 41;

    /**
     * The meta object id for the '<em>Single Reference Expr</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getSingleReferenceExpr()
     * @generated
     */
    int SINGLE_REFERENCE_EXPR = 42;

    /**
     * The meta object id for the '<em>List Reference Expr</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getListReferenceExpr()
     * @generated
     */
    int LIST_REFERENCE_EXPR = 43;


    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.PropertySet <em>Property Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property Set</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.PropertySet
     * @generated
     */
    EClass getPropertySet();

    /**
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.facade.PropertySet#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.PropertySet#getProperties()
     * @see #getPropertySet()
     * @generated
     */
    EReference getPropertySet_Properties();

    /**
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.facade.PropertySet#getNavigationProperties <em>Navigation Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Navigation Properties</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.PropertySet#getNavigationProperties()
     * @see #getPropertySet()
     * @generated
     */
    EReference getPropertySet_NavigationProperties();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.facade.PropertySet#getEntityType <em>Entity Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entity Type</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.PropertySet#getEntityType()
     * @see #getPropertySet()
     * @generated
     */
    EReference getPropertySet_EntityType();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.facade.Property#getDataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Data Type</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Property#getDataType()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_DataType();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.facade.Property#getReadDefinition <em>Read Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Read Definition</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Property#getReadDefinition()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_ReadDefinition();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.facade.Property#getWriteDefinition <em>Write Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Write Definition</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Property#getWriteDefinition()
     * @see #getProperty()
     * @generated
     */
    EReference getProperty_WriteDefinition();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.Navigation <em>Navigation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Navigation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Navigation
     * @generated
     */
    EClass getNavigation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.SingleNavigation <em>Single Navigation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Single Navigation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.SingleNavigation
     * @generated
     */
    EClass getSingleNavigation();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.facade.SingleNavigation#getTraverseDefinition <em>Traverse Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Traverse Definition</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.SingleNavigation#getTraverseDefinition()
     * @see #getSingleNavigation()
     * @generated
     */
    EReference getSingleNavigation_TraverseDefinition();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.facade.SingleNavigation#getBindDefinition <em>Bind Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Bind Definition</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.SingleNavigation#getBindDefinition()
     * @see #getSingleNavigation()
     * @generated
     */
    EReference getSingleNavigation_BindDefinition();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.ListNavigation <em>List Navigation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>List Navigation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.ListNavigation
     * @generated
     */
    EClass getListNavigation();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.facade.ListNavigation#getTraverseDefinition <em>Traverse Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Traverse Definition</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.ListNavigation#getTraverseDefinition()
     * @see #getListNavigation()
     * @generated
     */
    EReference getListNavigation_TraverseDefinition();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.facade.ListNavigation#getAttachDefinition <em>Attach Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Attach Definition</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.ListNavigation#getAttachDefinition()
     * @see #getListNavigation()
     * @generated
     */
    EReference getListNavigation_AttachDefinition();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.facade.ListNavigation#getDetachNavigation <em>Detach Navigation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Detach Navigation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.ListNavigation#getDetachNavigation()
     * @see #getListNavigation()
     * @generated
     */
    EReference getListNavigation_DetachNavigation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.EntitySetSelector <em>Entity Set Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Set Selector</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.EntitySetSelector
     * @generated
     */
    EClass getEntitySetSelector();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.EntitySetSelector#getGetExpr <em>Get Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Get Expr</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.EntitySetSelector#getGetExpr()
     * @see #getEntitySetSelector()
     * @generated
     */
    EAttribute getEntitySetSelector_GetExpr();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.EntitySingleSelector <em>Entity Single Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Single Selector</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.EntitySingleSelector
     * @generated
     */
    EClass getEntitySingleSelector();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.EntitySingleSelector#getGetExpr <em>Get Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Get Expr</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.EntitySingleSelector#getGetExpr()
     * @see #getEntitySingleSelector()
     * @generated
     */
    EAttribute getEntitySingleSelector_GetExpr();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.EntitySelector <em>Entity Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Selector</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.EntitySelector
     * @generated
     */
    EClass getEntitySelector();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.facade.EntitySelector#getEntityType <em>Entity Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entity Type</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.EntitySelector#getEntityType()
     * @see #getEntitySelector()
     * @generated
     */
    EReference getEntitySelector_EntityType();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.Facade <em>Facade</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Facade</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Facade
     * @generated
     */
    EClass getFacade();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.facade.Facade#getPropertySet <em>Property Set</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Property Set</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Facade#getPropertySet()
     * @see #getFacade()
     * @generated
     */
    EReference getFacade_PropertySet();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.facade.Facade#getUpdateOperation <em>Update Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Update Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Facade#getUpdateOperation()
     * @see #getFacade()
     * @generated
     */
    EReference getFacade_UpdateOperation();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.facade.Facade#getCreateOperation <em>Create Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Create Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Facade#getCreateOperation()
     * @see #getFacade()
     * @generated
     */
    EReference getFacade_CreateOperation();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.facade.Facade#getDeleteOperation <em>Delete Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Delete Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Facade#getDeleteOperation()
     * @see #getFacade()
     * @generated
     */
    EReference getFacade_DeleteOperation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.StandaloneFacade <em>Standalone Facade</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Standalone Facade</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.StandaloneFacade
     * @generated
     */
    EClass getStandaloneFacade();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.facade.StandaloneFacade#getEntitySelector <em>Entity Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entity Selector</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.StandaloneFacade#getEntitySelector()
     * @see #getStandaloneFacade()
     * @generated
     */
    EReference getStandaloneFacade_EntitySelector();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.DeleteOperation <em>Delete Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Delete Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.DeleteOperation
     * @generated
     */
    EClass getDeleteOperation();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.DeleteOperation#getDeleteOperation <em>Delete Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Delete Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.DeleteOperation#getDeleteOperation()
     * @see #getDeleteOperation()
     * @generated
     */
    EAttribute getDeleteOperation_DeleteOperation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.ReadFilterableProperty <em>Read Filterable Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Read Filterable Property</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.ReadFilterableProperty
     * @generated
     */
    EClass getReadFilterableProperty();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.ReadFilterableProperty#isFiltareble <em>Filtareble</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filtareble</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.ReadFilterableProperty#isFiltareble()
     * @see #getReadFilterableProperty()
     * @generated
     */
    EAttribute getReadFilterableProperty_Filtareble();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.ReadFilterableProperty#getReadExpr <em>Read Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Expr</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.ReadFilterableProperty#getReadExpr()
     * @see #getReadFilterableProperty()
     * @generated
     */
    EAttribute getReadFilterableProperty_ReadExpr();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.ReadFunctionProperty <em>Read Function Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Read Function Property</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.ReadFunctionProperty
     * @generated
     */
    EClass getReadFunctionProperty();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.ReadFunctionProperty#getReadFunction <em>Read Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Function</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.ReadFunctionProperty#getReadFunction()
     * @see #getReadFunctionProperty()
     * @generated
     */
    EAttribute getReadFunctionProperty_ReadFunction();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.ReadProperty <em>Read Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Read Property</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.ReadProperty
     * @generated
     */
    EClass getReadProperty();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.WriteProperty <em>Write Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Write Property</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.WriteProperty
     * @generated
     */
    EClass getWriteProperty();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.WriteAttribute <em>Write Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Write Attribute</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.WriteAttribute
     * @generated
     */
    EClass getWriteAttribute();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.WriteAttribute#getWriteExpr <em>Write Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Write Expr</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.WriteAttribute#getWriteExpr()
     * @see #getWriteAttribute()
     * @generated
     */
    EAttribute getWriteAttribute_WriteExpr();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.WriteFunctionProperty <em>Write Function Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Write Function Property</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.WriteFunctionProperty
     * @generated
     */
    EClass getWriteFunctionProperty();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.WriteFunctionProperty#getWriteOperation <em>Write Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Write Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.WriteFunctionProperty#getWriteOperation()
     * @see #getWriteFunctionProperty()
     * @generated
     */
    EAttribute getWriteFunctionProperty_WriteOperation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.TraverseFunctionSingleNavigation <em>Traverse Function Single Navigation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Traverse Function Single Navigation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.TraverseFunctionSingleNavigation
     * @generated
     */
    EClass getTraverseFunctionSingleNavigation();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.TraverseFunctionSingleNavigation#getTraverseFunction <em>Traverse Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Traverse Function</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.TraverseFunctionSingleNavigation#getTraverseFunction()
     * @see #getTraverseFunctionSingleNavigation()
     * @generated
     */
    EAttribute getTraverseFunctionSingleNavigation_TraverseFunction();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.TraverseSingleNavigation <em>Traverse Single Navigation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Traverse Single Navigation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.TraverseSingleNavigation
     * @generated
     */
    EClass getTraverseSingleNavigation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.TraverseListNavigation <em>Traverse List Navigation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Traverse List Navigation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.TraverseListNavigation
     * @generated
     */
    EClass getTraverseListNavigation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.MultiTraverseFunctionDefinition <em>Multi Traverse Function Definition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Multi Traverse Function Definition</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.MultiTraverseFunctionDefinition
     * @generated
     */
    EClass getMultiTraverseFunctionDefinition();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.MultiTraverseFunctionDefinition#getTraverseFunction <em>Traverse Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Traverse Function</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.MultiTraverseFunctionDefinition#getTraverseFunction()
     * @see #getMultiTraverseFunctionDefinition()
     * @generated
     */
    EAttribute getMultiTraverseFunctionDefinition_TraverseFunction();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.CreateOperation <em>Create Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Create Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.CreateOperation
     * @generated
     */
    EClass getCreateOperation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.DefaultCreateOperation <em>Default Create Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Default Create Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.DefaultCreateOperation
     * @generated
     */
    EClass getDefaultCreateOperation();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.DefaultCreateOperation#getPreCreateOperation <em>Pre Create Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pre Create Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.DefaultCreateOperation#getPreCreateOperation()
     * @see #getDefaultCreateOperation()
     * @generated
     */
    EAttribute getDefaultCreateOperation_PreCreateOperation();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.DefaultCreateOperation#getPostCreateOperation <em>Post Create Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Post Create Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.DefaultCreateOperation#getPostCreateOperation()
     * @see #getDefaultCreateOperation()
     * @generated
     */
    EAttribute getDefaultCreateOperation_PostCreateOperation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.CustomCreateOperation <em>Custom Create Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Custom Create Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.CustomCreateOperation
     * @generated
     */
    EClass getCustomCreateOperation();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.CustomCreateOperation#getCreateOperation <em>Create Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Create Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.CustomCreateOperation#getCreateOperation()
     * @see #getCustomCreateOperation()
     * @generated
     */
    EAttribute getCustomCreateOperation_CreateOperation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.UpdateOperation <em>Update Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Update Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.UpdateOperation
     * @generated
     */
    EClass getUpdateOperation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.DefaultUpdateOperation <em>Default Update Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Default Update Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.DefaultUpdateOperation
     * @generated
     */
    EClass getDefaultUpdateOperation();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.DefaultUpdateOperation#getPreUpdateOperation <em>Pre Update Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pre Update Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.DefaultUpdateOperation#getPreUpdateOperation()
     * @see #getDefaultUpdateOperation()
     * @generated
     */
    EAttribute getDefaultUpdateOperation_PreUpdateOperation();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.DefaultUpdateOperation#getPostUpdateOperation <em>Post Update Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Post Update Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.DefaultUpdateOperation#getPostUpdateOperation()
     * @see #getDefaultUpdateOperation()
     * @generated
     */
    EAttribute getDefaultUpdateOperation_PostUpdateOperation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.CustomUpdateOperation <em>Custom Update Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Custom Update Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.CustomUpdateOperation
     * @generated
     */
    EClass getCustomUpdateOperation();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.CustomUpdateOperation#getUpdateOperation <em>Update Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Update Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.CustomUpdateOperation#getUpdateOperation()
     * @see #getCustomUpdateOperation()
     * @generated
     */
    EAttribute getCustomUpdateOperation_UpdateOperation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.BindSingleNavigation <em>Bind Single Navigation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bind Single Navigation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.BindSingleNavigation
     * @generated
     */
    EClass getBindSingleNavigation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.BindSingleReference <em>Bind Single Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bind Single Reference</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.BindSingleReference
     * @generated
     */
    EClass getBindSingleReference();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.BindSingleReference#getBindExpr <em>Bind Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Bind Expr</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.BindSingleReference#getBindExpr()
     * @see #getBindSingleReference()
     * @generated
     */
    EAttribute getBindSingleReference_BindExpr();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.TraverseFilterableSingleNavigation <em>Traverse Filterable Single Navigation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Traverse Filterable Single Navigation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.TraverseFilterableSingleNavigation
     * @generated
     */
    EClass getTraverseFilterableSingleNavigation();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.TraverseFilterableSingleNavigation#isFilterable <em>Filterable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filterable</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.TraverseFilterableSingleNavigation#isFilterable()
     * @see #getTraverseFilterableSingleNavigation()
     * @generated
     */
    EAttribute getTraverseFilterableSingleNavigation_Filterable();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.TraverseFilterableSingleNavigation#getTraverseExpr <em>Traverse Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Traverse Expr</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.TraverseFilterableSingleNavigation#getTraverseExpr()
     * @see #getTraverseFilterableSingleNavigation()
     * @generated
     */
    EAttribute getTraverseFilterableSingleNavigation_TraverseExpr();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.BindFunctionSingleNavigation <em>Bind Function Single Navigation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Bind Function Single Navigation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.BindFunctionSingleNavigation
     * @generated
     */
    EClass getBindFunctionSingleNavigation();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.BindFunctionSingleNavigation#getBindOperation <em>Bind Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Bind Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.BindFunctionSingleNavigation#getBindOperation()
     * @see #getBindFunctionSingleNavigation()
     * @generated
     */
    EAttribute getBindFunctionSingleNavigation_BindOperation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.TraverseFilterableListNavigation <em>Traverse Filterable List Navigation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Traverse Filterable List Navigation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.TraverseFilterableListNavigation
     * @generated
     */
    EClass getTraverseFilterableListNavigation();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.TraverseFilterableListNavigation#isFilterable <em>Filterable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filterable</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.TraverseFilterableListNavigation#isFilterable()
     * @see #getTraverseFilterableListNavigation()
     * @generated
     */
    EAttribute getTraverseFilterableListNavigation_Filterable();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.TraverseFilterableListNavigation#getTraverseExpr <em>Traverse Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Traverse Expr</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.TraverseFilterableListNavigation#getTraverseExpr()
     * @see #getTraverseFilterableListNavigation()
     * @generated
     */
    EAttribute getTraverseFilterableListNavigation_TraverseExpr();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.AttachListNavigation <em>Attach List Navigation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attach List Navigation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.AttachListNavigation
     * @generated
     */
    EClass getAttachListNavigation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.DetachListNavigation <em>Detach List Navigation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Detach List Navigation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.DetachListNavigation
     * @generated
     */
    EClass getDetachListNavigation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.AttachListReference <em>Attach List Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attach List Reference</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.AttachListReference
     * @generated
     */
    EClass getAttachListReference();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.AttachListReference#getAttachExpr <em>Attach Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attach Expr</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.AttachListReference#getAttachExpr()
     * @see #getAttachListReference()
     * @generated
     */
    EAttribute getAttachListReference_AttachExpr();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.AttachFunctionListNavigation <em>Attach Function List Navigation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attach Function List Navigation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.AttachFunctionListNavigation
     * @generated
     */
    EClass getAttachFunctionListNavigation();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.AttachFunctionListNavigation#getAttachFunction <em>Attach Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Attach Function</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.AttachFunctionListNavigation#getAttachFunction()
     * @see #getAttachFunctionListNavigation()
     * @generated
     */
    EAttribute getAttachFunctionListNavigation_AttachFunction();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.DetachListReference <em>Detach List Reference</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Detach List Reference</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.DetachListReference
     * @generated
     */
    EClass getDetachListReference();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.DetachListReference#getDetachExpr <em>Detach Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Detach Expr</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.DetachListReference#getDetachExpr()
     * @see #getDetachListReference()
     * @generated
     */
    EAttribute getDetachListReference_DetachExpr();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.DetachFunctionListNavigation <em>Detach Function List Navigation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Detach Function List Navigation</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.DetachFunctionListNavigation
     * @generated
     */
    EClass getDetachFunctionListNavigation();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.DetachFunctionListNavigation#getDetachFunction <em>Detach Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Detach Function</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.DetachFunctionListNavigation#getDetachFunction()
     * @see #getDetachFunctionListNavigation()
     * @generated
     */
    EAttribute getDetachFunctionListNavigation_DetachFunction();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Entity Set Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Entity Set Expr</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     * @generated
     */
    EDataType getEntitySetExpr();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Single Attribute Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Single Attribute Expr</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     * @generated
     */
    EDataType getSingleAttributeExpr();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Single Data Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Single Data Expr</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     * @generated
     */
    EDataType getSingleDataExpr();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Entity Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Entity Expr</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     * @generated
     */
    EDataType getEntityExpr();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Single Reference Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Single Reference Expr</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     * @generated
     */
    EDataType getSingleReferenceExpr();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>List Reference Expr</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>List Reference Expr</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     * @generated
     */
    EDataType getListReferenceExpr();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    FacadeFactory getFacadeFactory();

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
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.PropertySetImpl <em>Property Set</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.PropertySetImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getPropertySet()
         * @generated
         */
        EClass PROPERTY_SET = eINSTANCE.getPropertySet();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY_SET__PROPERTIES = eINSTANCE.getPropertySet_Properties();

        /**
         * The meta object literal for the '<em><b>Navigation Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY_SET__NAVIGATION_PROPERTIES = eINSTANCE.getPropertySet_NavigationProperties();

        /**
         * The meta object literal for the '<em><b>Entity Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY_SET__ENTITY_TYPE = eINSTANCE.getPropertySet_EntityType();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.PropertyImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '<em><b>Data Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__DATA_TYPE = eINSTANCE.getProperty_DataType();

        /**
         * The meta object literal for the '<em><b>Read Definition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__READ_DEFINITION = eINSTANCE.getProperty_ReadDefinition();

        /**
         * The meta object literal for the '<em><b>Write Definition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROPERTY__WRITE_DEFINITION = eINSTANCE.getProperty_WriteDefinition();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.NavigationImpl <em>Navigation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.NavigationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getNavigation()
         * @generated
         */
        EClass NAVIGATION = eINSTANCE.getNavigation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.SingleNavigationImpl <em>Single Navigation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.SingleNavigationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getSingleNavigation()
         * @generated
         */
        EClass SINGLE_NAVIGATION = eINSTANCE.getSingleNavigation();

        /**
         * The meta object literal for the '<em><b>Traverse Definition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SINGLE_NAVIGATION__TRAVERSE_DEFINITION = eINSTANCE.getSingleNavigation_TraverseDefinition();

        /**
         * The meta object literal for the '<em><b>Bind Definition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SINGLE_NAVIGATION__BIND_DEFINITION = eINSTANCE.getSingleNavigation_BindDefinition();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.ListNavigationImpl <em>List Navigation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.ListNavigationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getListNavigation()
         * @generated
         */
        EClass LIST_NAVIGATION = eINSTANCE.getListNavigation();

        /**
         * The meta object literal for the '<em><b>Traverse Definition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LIST_NAVIGATION__TRAVERSE_DEFINITION = eINSTANCE.getListNavigation_TraverseDefinition();

        /**
         * The meta object literal for the '<em><b>Attach Definition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LIST_NAVIGATION__ATTACH_DEFINITION = eINSTANCE.getListNavigation_AttachDefinition();

        /**
         * The meta object literal for the '<em><b>Detach Navigation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LIST_NAVIGATION__DETACH_NAVIGATION = eINSTANCE.getListNavigation_DetachNavigation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.EntitySetSelectorImpl <em>Entity Set Selector</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.EntitySetSelectorImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getEntitySetSelector()
         * @generated
         */
        EClass ENTITY_SET_SELECTOR = eINSTANCE.getEntitySetSelector();

        /**
         * The meta object literal for the '<em><b>Get Expr</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENTITY_SET_SELECTOR__GET_EXPR = eINSTANCE.getEntitySetSelector_GetExpr();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.EntitySingleSelectorImpl <em>Entity Single Selector</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.EntitySingleSelectorImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getEntitySingleSelector()
         * @generated
         */
        EClass ENTITY_SINGLE_SELECTOR = eINSTANCE.getEntitySingleSelector();

        /**
         * The meta object literal for the '<em><b>Get Expr</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENTITY_SINGLE_SELECTOR__GET_EXPR = eINSTANCE.getEntitySingleSelector_GetExpr();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.EntitySelectorImpl <em>Entity Selector</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.EntitySelectorImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getEntitySelector()
         * @generated
         */
        EClass ENTITY_SELECTOR = eINSTANCE.getEntitySelector();

        /**
         * The meta object literal for the '<em><b>Entity Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTITY_SELECTOR__ENTITY_TYPE = eINSTANCE.getEntitySelector_EntityType();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.FacadeImpl <em>Facade</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadeImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getFacade()
         * @generated
         */
        EClass FACADE = eINSTANCE.getFacade();

        /**
         * The meta object literal for the '<em><b>Property Set</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FACADE__PROPERTY_SET = eINSTANCE.getFacade_PropertySet();

        /**
         * The meta object literal for the '<em><b>Update Operation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FACADE__UPDATE_OPERATION = eINSTANCE.getFacade_UpdateOperation();

        /**
         * The meta object literal for the '<em><b>Create Operation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FACADE__CREATE_OPERATION = eINSTANCE.getFacade_CreateOperation();

        /**
         * The meta object literal for the '<em><b>Delete Operation</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FACADE__DELETE_OPERATION = eINSTANCE.getFacade_DeleteOperation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.StandaloneFacadeImpl <em>Standalone Facade</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.StandaloneFacadeImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getStandaloneFacade()
         * @generated
         */
        EClass STANDALONE_FACADE = eINSTANCE.getStandaloneFacade();

        /**
         * The meta object literal for the '<em><b>Entity Selector</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STANDALONE_FACADE__ENTITY_SELECTOR = eINSTANCE.getStandaloneFacade_EntitySelector();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.DeleteOperationImpl <em>Delete Operation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.DeleteOperationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getDeleteOperation()
         * @generated
         */
        EClass DELETE_OPERATION = eINSTANCE.getDeleteOperation();

        /**
         * The meta object literal for the '<em><b>Delete Operation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DELETE_OPERATION__DELETE_OPERATION = eINSTANCE.getDeleteOperation_DeleteOperation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.ReadFilterablePropertyImpl <em>Read Filterable Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.ReadFilterablePropertyImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getReadFilterableProperty()
         * @generated
         */
        EClass READ_FILTERABLE_PROPERTY = eINSTANCE.getReadFilterableProperty();

        /**
         * The meta object literal for the '<em><b>Filtareble</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute READ_FILTERABLE_PROPERTY__FILTAREBLE = eINSTANCE.getReadFilterableProperty_Filtareble();

        /**
         * The meta object literal for the '<em><b>Read Expr</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute READ_FILTERABLE_PROPERTY__READ_EXPR = eINSTANCE.getReadFilterableProperty_ReadExpr();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.ReadFunctionPropertyImpl <em>Read Function Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.ReadFunctionPropertyImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getReadFunctionProperty()
         * @generated
         */
        EClass READ_FUNCTION_PROPERTY = eINSTANCE.getReadFunctionProperty();

        /**
         * The meta object literal for the '<em><b>Read Function</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute READ_FUNCTION_PROPERTY__READ_FUNCTION = eINSTANCE.getReadFunctionProperty_ReadFunction();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.ReadPropertyImpl <em>Read Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.ReadPropertyImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getReadProperty()
         * @generated
         */
        EClass READ_PROPERTY = eINSTANCE.getReadProperty();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.WritePropertyImpl <em>Write Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.WritePropertyImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getWriteProperty()
         * @generated
         */
        EClass WRITE_PROPERTY = eINSTANCE.getWriteProperty();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.WriteAttributeImpl <em>Write Attribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.WriteAttributeImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getWriteAttribute()
         * @generated
         */
        EClass WRITE_ATTRIBUTE = eINSTANCE.getWriteAttribute();

        /**
         * The meta object literal for the '<em><b>Write Expr</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WRITE_ATTRIBUTE__WRITE_EXPR = eINSTANCE.getWriteAttribute_WriteExpr();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.WriteFunctionPropertyImpl <em>Write Function Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.WriteFunctionPropertyImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getWriteFunctionProperty()
         * @generated
         */
        EClass WRITE_FUNCTION_PROPERTY = eINSTANCE.getWriteFunctionProperty();

        /**
         * The meta object literal for the '<em><b>Write Operation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WRITE_FUNCTION_PROPERTY__WRITE_OPERATION = eINSTANCE.getWriteFunctionProperty_WriteOperation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.TraverseFunctionSingleNavigationImpl <em>Traverse Function Single Navigation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.TraverseFunctionSingleNavigationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getTraverseFunctionSingleNavigation()
         * @generated
         */
        EClass TRAVERSE_FUNCTION_SINGLE_NAVIGATION = eINSTANCE.getTraverseFunctionSingleNavigation();

        /**
         * The meta object literal for the '<em><b>Traverse Function</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRAVERSE_FUNCTION_SINGLE_NAVIGATION__TRAVERSE_FUNCTION = eINSTANCE.getTraverseFunctionSingleNavigation_TraverseFunction();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.TraverseSingleNavigationImpl <em>Traverse Single Navigation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.TraverseSingleNavigationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getTraverseSingleNavigation()
         * @generated
         */
        EClass TRAVERSE_SINGLE_NAVIGATION = eINSTANCE.getTraverseSingleNavigation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.TraverseListNavigationImpl <em>Traverse List Navigation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.TraverseListNavigationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getTraverseListNavigation()
         * @generated
         */
        EClass TRAVERSE_LIST_NAVIGATION = eINSTANCE.getTraverseListNavigation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.MultiTraverseFunctionDefinitionImpl <em>Multi Traverse Function Definition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.MultiTraverseFunctionDefinitionImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getMultiTraverseFunctionDefinition()
         * @generated
         */
        EClass MULTI_TRAVERSE_FUNCTION_DEFINITION = eINSTANCE.getMultiTraverseFunctionDefinition();

        /**
         * The meta object literal for the '<em><b>Traverse Function</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MULTI_TRAVERSE_FUNCTION_DEFINITION__TRAVERSE_FUNCTION = eINSTANCE.getMultiTraverseFunctionDefinition_TraverseFunction();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.CreateOperationImpl <em>Create Operation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.CreateOperationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getCreateOperation()
         * @generated
         */
        EClass CREATE_OPERATION = eINSTANCE.getCreateOperation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.DefaultCreateOperationImpl <em>Default Create Operation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.DefaultCreateOperationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getDefaultCreateOperation()
         * @generated
         */
        EClass DEFAULT_CREATE_OPERATION = eINSTANCE.getDefaultCreateOperation();

        /**
         * The meta object literal for the '<em><b>Pre Create Operation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFAULT_CREATE_OPERATION__PRE_CREATE_OPERATION = eINSTANCE.getDefaultCreateOperation_PreCreateOperation();

        /**
         * The meta object literal for the '<em><b>Post Create Operation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFAULT_CREATE_OPERATION__POST_CREATE_OPERATION = eINSTANCE.getDefaultCreateOperation_PostCreateOperation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.CustomCreateOperationImpl <em>Custom Create Operation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.CustomCreateOperationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getCustomCreateOperation()
         * @generated
         */
        EClass CUSTOM_CREATE_OPERATION = eINSTANCE.getCustomCreateOperation();

        /**
         * The meta object literal for the '<em><b>Create Operation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CUSTOM_CREATE_OPERATION__CREATE_OPERATION = eINSTANCE.getCustomCreateOperation_CreateOperation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.UpdateOperationImpl <em>Update Operation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.UpdateOperationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getUpdateOperation()
         * @generated
         */
        EClass UPDATE_OPERATION = eINSTANCE.getUpdateOperation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.DefaultUpdateOperationImpl <em>Default Update Operation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.DefaultUpdateOperationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getDefaultUpdateOperation()
         * @generated
         */
        EClass DEFAULT_UPDATE_OPERATION = eINSTANCE.getDefaultUpdateOperation();

        /**
         * The meta object literal for the '<em><b>Pre Update Operation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFAULT_UPDATE_OPERATION__PRE_UPDATE_OPERATION = eINSTANCE.getDefaultUpdateOperation_PreUpdateOperation();

        /**
         * The meta object literal for the '<em><b>Post Update Operation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DEFAULT_UPDATE_OPERATION__POST_UPDATE_OPERATION = eINSTANCE.getDefaultUpdateOperation_PostUpdateOperation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.CustomUpdateOperationImpl <em>Custom Update Operation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.CustomUpdateOperationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getCustomUpdateOperation()
         * @generated
         */
        EClass CUSTOM_UPDATE_OPERATION = eINSTANCE.getCustomUpdateOperation();

        /**
         * The meta object literal for the '<em><b>Update Operation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CUSTOM_UPDATE_OPERATION__UPDATE_OPERATION = eINSTANCE.getCustomUpdateOperation_UpdateOperation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.BindSingleNavigationImpl <em>Bind Single Navigation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.BindSingleNavigationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getBindSingleNavigation()
         * @generated
         */
        EClass BIND_SINGLE_NAVIGATION = eINSTANCE.getBindSingleNavigation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.BindSingleReferenceImpl <em>Bind Single Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.BindSingleReferenceImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getBindSingleReference()
         * @generated
         */
        EClass BIND_SINGLE_REFERENCE = eINSTANCE.getBindSingleReference();

        /**
         * The meta object literal for the '<em><b>Bind Expr</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BIND_SINGLE_REFERENCE__BIND_EXPR = eINSTANCE.getBindSingleReference_BindExpr();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.TraverseFilterableSingleNavigationImpl <em>Traverse Filterable Single Navigation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.TraverseFilterableSingleNavigationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getTraverseFilterableSingleNavigation()
         * @generated
         */
        EClass TRAVERSE_FILTERABLE_SINGLE_NAVIGATION = eINSTANCE.getTraverseFilterableSingleNavigation();

        /**
         * The meta object literal for the '<em><b>Filterable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRAVERSE_FILTERABLE_SINGLE_NAVIGATION__FILTERABLE = eINSTANCE.getTraverseFilterableSingleNavigation_Filterable();

        /**
         * The meta object literal for the '<em><b>Traverse Expr</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRAVERSE_FILTERABLE_SINGLE_NAVIGATION__TRAVERSE_EXPR = eINSTANCE.getTraverseFilterableSingleNavigation_TraverseExpr();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.BindFunctionSingleNavigationImpl <em>Bind Function Single Navigation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.BindFunctionSingleNavigationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getBindFunctionSingleNavigation()
         * @generated
         */
        EClass BIND_FUNCTION_SINGLE_NAVIGATION = eINSTANCE.getBindFunctionSingleNavigation();

        /**
         * The meta object literal for the '<em><b>Bind Operation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BIND_FUNCTION_SINGLE_NAVIGATION__BIND_OPERATION = eINSTANCE.getBindFunctionSingleNavigation_BindOperation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.TraverseFilterableListNavigationImpl <em>Traverse Filterable List Navigation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.TraverseFilterableListNavigationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getTraverseFilterableListNavigation()
         * @generated
         */
        EClass TRAVERSE_FILTERABLE_LIST_NAVIGATION = eINSTANCE.getTraverseFilterableListNavigation();

        /**
         * The meta object literal for the '<em><b>Filterable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRAVERSE_FILTERABLE_LIST_NAVIGATION__FILTERABLE = eINSTANCE.getTraverseFilterableListNavigation_Filterable();

        /**
         * The meta object literal for the '<em><b>Traverse Expr</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRAVERSE_FILTERABLE_LIST_NAVIGATION__TRAVERSE_EXPR = eINSTANCE.getTraverseFilterableListNavigation_TraverseExpr();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.AttachListNavigationImpl <em>Attach List Navigation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.AttachListNavigationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getAttachListNavigation()
         * @generated
         */
        EClass ATTACH_LIST_NAVIGATION = eINSTANCE.getAttachListNavigation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.DetachListNavigationImpl <em>Detach List Navigation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.DetachListNavigationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getDetachListNavigation()
         * @generated
         */
        EClass DETACH_LIST_NAVIGATION = eINSTANCE.getDetachListNavigation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.AttachListReferenceImpl <em>Attach List Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.AttachListReferenceImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getAttachListReference()
         * @generated
         */
        EClass ATTACH_LIST_REFERENCE = eINSTANCE.getAttachListReference();

        /**
         * The meta object literal for the '<em><b>Attach Expr</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTACH_LIST_REFERENCE__ATTACH_EXPR = eINSTANCE.getAttachListReference_AttachExpr();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.AttachFunctionListNavigationImpl <em>Attach Function List Navigation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.AttachFunctionListNavigationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getAttachFunctionListNavigation()
         * @generated
         */
        EClass ATTACH_FUNCTION_LIST_NAVIGATION = eINSTANCE.getAttachFunctionListNavigation();

        /**
         * The meta object literal for the '<em><b>Attach Function</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ATTACH_FUNCTION_LIST_NAVIGATION__ATTACH_FUNCTION = eINSTANCE.getAttachFunctionListNavigation_AttachFunction();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.DetachListReferenceImpl <em>Detach List Reference</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.DetachListReferenceImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getDetachListReference()
         * @generated
         */
        EClass DETACH_LIST_REFERENCE = eINSTANCE.getDetachListReference();

        /**
         * The meta object literal for the '<em><b>Detach Expr</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DETACH_LIST_REFERENCE__DETACH_EXPR = eINSTANCE.getDetachListReference_DetachExpr();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.DetachFunctionListNavigationImpl <em>Detach Function List Navigation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.DetachFunctionListNavigationImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getDetachFunctionListNavigation()
         * @generated
         */
        EClass DETACH_FUNCTION_LIST_NAVIGATION = eINSTANCE.getDetachFunctionListNavigation();

        /**
         * The meta object literal for the '<em><b>Detach Function</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute DETACH_FUNCTION_LIST_NAVIGATION__DETACH_FUNCTION = eINSTANCE.getDetachFunctionListNavigation_DetachFunction();

        /**
         * The meta object literal for the '<em>Entity Set Expr</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getEntitySetExpr()
         * @generated
         */
        EDataType ENTITY_SET_EXPR = eINSTANCE.getEntitySetExpr();

        /**
         * The meta object literal for the '<em>Single Attribute Expr</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getSingleAttributeExpr()
         * @generated
         */
        EDataType SINGLE_ATTRIBUTE_EXPR = eINSTANCE.getSingleAttributeExpr();

        /**
         * The meta object literal for the '<em>Single Data Expr</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getSingleDataExpr()
         * @generated
         */
        EDataType SINGLE_DATA_EXPR = eINSTANCE.getSingleDataExpr();

        /**
         * The meta object literal for the '<em>Entity Expr</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getEntityExpr()
         * @generated
         */
        EDataType ENTITY_EXPR = eINSTANCE.getEntityExpr();

        /**
         * The meta object literal for the '<em>Single Reference Expr</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getSingleReferenceExpr()
         * @generated
         */
        EDataType SINGLE_REFERENCE_EXPR = eINSTANCE.getSingleReferenceExpr();

        /**
         * The meta object literal for the '<em>List Reference Expr</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getListReferenceExpr()
         * @generated
         */
        EDataType LIST_REFERENCE_EXPR = eINSTANCE.getListReferenceExpr();

    }

} //FacadePackage
