/**
 */
package hu.blackbelt.judo.meta.psm.view;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see hu.blackbelt.judo.meta.psm.view.ViewFactory
 * @model kind="package"
 * @generated
 */
public interface ViewPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "view";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://blackbelt.hu/judo/meta/psm/view";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "view";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ViewPackage eINSTANCE = hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl.init();

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.ContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.ContainerImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getContainer()
     * @generated
     */
    int CONTAINER = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Components</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__COMPONENTS = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Layout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__LAYOUT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__TITLE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Alignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER__ALIGNMENT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Container</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTAINER_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.ComponentImpl <em>Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.ComponentImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getComponent()
     * @generated
     */
    int COMPONENT = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__LABEL = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT__PARENT_VIEW = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int COMPONENT_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.WidgetImpl <em>Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.WidgetImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getWidget()
     * @generated
     */
    int WIDGET = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIDGET__NAME = COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIDGET__LABEL = COMPONENT__LABEL;

    /**
     * The feature id for the '<em><b>Parent View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIDGET__PARENT_VIEW = COMPONENT__PARENT_VIEW;

    /**
     * The feature id for the '<em><b>Transfer Attribute</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIDGET__TRANSFER_ATTRIBUTE = COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Emitted Events</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIDGET__EMITTED_EVENTS = COMPONENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Widget</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIDGET_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Widget</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WIDGET_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.ObjectViewImpl <em>Object View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.ObjectViewImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getObjectView()
     * @generated
     */
    int OBJECT_VIEW = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VIEW__NAME = CONTAINER__NAME;

    /**
     * The feature id for the '<em><b>Components</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VIEW__COMPONENTS = CONTAINER__COMPONENTS;

    /**
     * The feature id for the '<em><b>Layout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VIEW__LAYOUT = CONTAINER__LAYOUT;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VIEW__TITLE = CONTAINER__TITLE;

    /**
     * The feature id for the '<em><b>Alignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VIEW__ALIGNMENT = CONTAINER__ALIGNMENT;

    /**
     * The feature id for the '<em><b>Transfer Object</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VIEW__TRANSFER_OBJECT = CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>View Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VIEW__VIEW_TYPE = CONTAINER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Controls</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VIEW__CONTROLS = CONTAINER_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Object View</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VIEW_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Object View</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int OBJECT_VIEW_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.GroupboxImpl <em>Groupbox</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.GroupboxImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getGroupbox()
     * @generated
     */
    int GROUPBOX = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUPBOX__NAME = CONTAINER__NAME;

    /**
     * The feature id for the '<em><b>Components</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUPBOX__COMPONENTS = CONTAINER__COMPONENTS;

    /**
     * The feature id for the '<em><b>Layout</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUPBOX__LAYOUT = CONTAINER__LAYOUT;

    /**
     * The feature id for the '<em><b>Title</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUPBOX__TITLE = CONTAINER__TITLE;

    /**
     * The feature id for the '<em><b>Alignment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUPBOX__ALIGNMENT = CONTAINER__ALIGNMENT;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUPBOX__LABEL = CONTAINER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parent View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUPBOX__PARENT_VIEW = CONTAINER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Groupbox</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUPBOX_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Groupbox</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int GROUPBOX_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.PlaceholderImpl <em>Placeholder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.PlaceholderImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getPlaceholder()
     * @generated
     */
    int PLACEHOLDER = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEHOLDER__NAME = COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEHOLDER__LABEL = COMPONENT__LABEL;

    /**
     * The feature id for the '<em><b>Parent View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEHOLDER__PARENT_VIEW = COMPONENT__PARENT_VIEW;

    /**
     * The feature id for the '<em><b>Popup</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEHOLDER__POPUP = COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Placeholder</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEHOLDER_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Placeholder</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PLACEHOLDER_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.NavigationImpl <em>Navigation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.NavigationImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getNavigation()
     * @generated
     */
    int NAVIGATION = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION__NAME = COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION__LABEL = COMPONENT__LABEL;

    /**
     * The feature id for the '<em><b>Parent View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION__PARENT_VIEW = COMPONENT__PARENT_VIEW;

    /**
     * The feature id for the '<em><b>Navigation View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION__NAVIGATION_VIEW = COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Range View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION__RANGE_VIEW = COMPONENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Transfer Relation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION__TRANSFER_RELATION = COMPONENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Navigation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAVIGATION_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.LinkImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getLink()
     * @generated
     */
    int LINK = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__NAME = NAVIGATION__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__LABEL = NAVIGATION__LABEL;

    /**
     * The feature id for the '<em><b>Parent View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__PARENT_VIEW = NAVIGATION__PARENT_VIEW;

    /**
     * The feature id for the '<em><b>Navigation View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__NAVIGATION_VIEW = NAVIGATION__NAVIGATION_VIEW;

    /**
     * The feature id for the '<em><b>Range View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__RANGE_VIEW = NAVIGATION__RANGE_VIEW;

    /**
     * The feature id for the '<em><b>Transfer Relation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__TRANSFER_RELATION = NAVIGATION__TRANSFER_RELATION;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__TARGET = NAVIGATION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__TEXT = NAVIGATION_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FEATURE_COUNT = NAVIGATION_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_OPERATION_COUNT = NAVIGATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.EmbeddedImpl <em>Embedded</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.EmbeddedImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getEmbedded()
     * @generated
     */
    int EMBEDDED = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMBEDDED__NAME = NAVIGATION__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMBEDDED__LABEL = NAVIGATION__LABEL;

    /**
     * The feature id for the '<em><b>Parent View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMBEDDED__PARENT_VIEW = NAVIGATION__PARENT_VIEW;

    /**
     * The feature id for the '<em><b>Navigation View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMBEDDED__NAVIGATION_VIEW = NAVIGATION__NAVIGATION_VIEW;

    /**
     * The feature id for the '<em><b>Range View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMBEDDED__RANGE_VIEW = NAVIGATION__RANGE_VIEW;

    /**
     * The feature id for the '<em><b>Transfer Relation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMBEDDED__TRANSFER_RELATION = NAVIGATION__TRANSFER_RELATION;

    /**
     * The number of structural features of the '<em>Embedded</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMBEDDED_FEATURE_COUNT = NAVIGATION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Embedded</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMBEDDED_OPERATION_COUNT = NAVIGATION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.ActionImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getAction()
     * @generated
     */
    int ACTION = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__NAME = COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__LABEL = COMPONENT__LABEL;

    /**
     * The feature id for the '<em><b>Parent View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__PARENT_VIEW = COMPONENT__PARENT_VIEW;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__TARGET = COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Operation</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__OPERATION = COMPONENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Result View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__RESULT_VIEW = COMPONENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Fault Views</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__FAULT_VIEWS = COMPONENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.ControlImpl <em>Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.ControlImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getControl()
     * @generated
     */
    int CONTROL = 10;

    /**
     * The feature id for the '<em><b>Controller</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL__CONTROLLER = 0;

    /**
     * The feature id for the '<em><b>Components</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL__COMPONENTS = 1;

    /**
     * The number of structural features of the '<em>Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONTROL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.VisibleControlImpl <em>Visible Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.VisibleControlImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getVisibleControl()
     * @generated
     */
    int VISIBLE_CONTROL = 11;

    /**
     * The feature id for the '<em><b>Controller</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIBLE_CONTROL__CONTROLLER = CONTROL__CONTROLLER;

    /**
     * The feature id for the '<em><b>Components</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIBLE_CONTROL__COMPONENTS = CONTROL__COMPONENTS;

    /**
     * The number of structural features of the '<em>Visible Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIBLE_CONTROL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Visible Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VISIBLE_CONTROL_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.EnabledControlImpl <em>Enabled Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.EnabledControlImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getEnabledControl()
     * @generated
     */
    int ENABLED_CONTROL = 12;

    /**
     * The feature id for the '<em><b>Controller</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENABLED_CONTROL__CONTROLLER = CONTROL__CONTROLLER;

    /**
     * The feature id for the '<em><b>Components</b></em>' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENABLED_CONTROL__COMPONENTS = CONTROL__COMPONENTS;

    /**
     * The number of structural features of the '<em>Enabled Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENABLED_CONTROL_FEATURE_COUNT = CONTROL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Enabled Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENABLED_CONTROL_OPERATION_COUNT = CONTROL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.ViewControlImpl <em>Control</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewControlImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getViewControl()
     * @generated
     */
    int VIEW_CONTROL = 13;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_CONTROL__NAME = COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_CONTROL__LABEL = COMPONENT__LABEL;

    /**
     * The feature id for the '<em><b>Parent View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_CONTROL__PARENT_VIEW = COMPONENT__PARENT_VIEW;

    /**
     * The number of structural features of the '<em>Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_CONTROL_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Control</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_CONTROL_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.EventImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getEvent()
     * @generated
     */
    int EVENT = 14;

    /**
     * The feature id for the '<em><b>Event Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__EVENT_TYPE = 0;

    /**
     * The feature id for the '<em><b>Triggered</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT__TRIGGERED = 1;

    /**
     * The number of structural features of the '<em>Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Event</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVENT_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.MenuComponentImpl <em>Menu Component</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.MenuComponentImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getMenuComponent()
     * @generated
     */
    int MENU_COMPONENT = 15;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_COMPONENT__NAME = COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_COMPONENT__LABEL = COMPONENT__LABEL;

    /**
     * The feature id for the '<em><b>Parent View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_COMPONENT__PARENT_VIEW = COMPONENT__PARENT_VIEW;

    /**
     * The feature id for the '<em><b>Sub Menus</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_COMPONENT__SUB_MENUS = COMPONENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Menu Items</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_COMPONENT__MENU_ITEMS = COMPONENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Menu Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_COMPONENT_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Menu Component</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_COMPONENT_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.MenuBarImpl <em>Menu Bar</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.MenuBarImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getMenuBar()
     * @generated
     */
    int MENU_BAR = 16;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_BAR__NAME = MENU_COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_BAR__LABEL = MENU_COMPONENT__LABEL;

    /**
     * The feature id for the '<em><b>Parent View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_BAR__PARENT_VIEW = MENU_COMPONENT__PARENT_VIEW;

    /**
     * The feature id for the '<em><b>Sub Menus</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_BAR__SUB_MENUS = MENU_COMPONENT__SUB_MENUS;

    /**
     * The feature id for the '<em><b>Menu Items</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_BAR__MENU_ITEMS = MENU_COMPONENT__MENU_ITEMS;

    /**
     * The number of structural features of the '<em>Menu Bar</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_BAR_FEATURE_COUNT = MENU_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Menu Bar</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_BAR_OPERATION_COUNT = MENU_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.MenuImpl <em>Menu</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.MenuImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getMenu()
     * @generated
     */
    int MENU = 17;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU__NAME = MENU_COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU__LABEL = MENU_COMPONENT__LABEL;

    /**
     * The feature id for the '<em><b>Parent View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU__PARENT_VIEW = MENU_COMPONENT__PARENT_VIEW;

    /**
     * The feature id for the '<em><b>Sub Menus</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU__SUB_MENUS = MENU_COMPONENT__SUB_MENUS;

    /**
     * The feature id for the '<em><b>Menu Items</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU__MENU_ITEMS = MENU_COMPONENT__MENU_ITEMS;

    /**
     * The number of structural features of the '<em>Menu</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_FEATURE_COUNT = MENU_COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Menu</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_OPERATION_COUNT = MENU_COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.MenuItemImpl <em>Menu Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.MenuItemImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getMenuItem()
     * @generated
     */
    int MENU_ITEM = 18;

    /**
     * The feature id for the '<em><b>View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_ITEM__VIEW = 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_ITEM__TARGET = 1;

    /**
     * The number of structural features of the '<em>Menu Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_ITEM_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Menu Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MENU_ITEM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.EntryMenuItemImpl <em>Entry Menu Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.EntryMenuItemImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getEntryMenuItem()
     * @generated
     */
    int ENTRY_MENU_ITEM = 19;

    /**
     * The feature id for the '<em><b>View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_MENU_ITEM__VIEW = MENU_ITEM__VIEW;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_MENU_ITEM__TARGET = MENU_ITEM__TARGET;

    /**
     * The feature id for the '<em><b>Selector</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_MENU_ITEM__SELECTOR = MENU_ITEM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Entry Menu Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_MENU_ITEM_FEATURE_COUNT = MENU_ITEM_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Entry Menu Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTRY_MENU_ITEM_OPERATION_COUNT = MENU_ITEM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.ActionMenuItemImpl <em>Action Menu Item</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.ActionMenuItemImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getActionMenuItem()
     * @generated
     */
    int ACTION_MENU_ITEM = 20;

    /**
     * The feature id for the '<em><b>View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_MENU_ITEM__VIEW = MENU_ITEM__VIEW;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_MENU_ITEM__TARGET = MENU_ITEM__TARGET;

    /**
     * The feature id for the '<em><b>Exposed Service</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_MENU_ITEM__EXPOSED_SERVICE = MENU_ITEM_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Action Menu Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_MENU_ITEM_FEATURE_COUNT = MENU_ITEM_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Action Menu Item</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_MENU_ITEM_OPERATION_COUNT = MENU_ITEM_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.UserInterfaceImpl <em>User Interface</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.UserInterfaceImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getUserInterface()
     * @generated
     */
    int USER_INTERFACE = 21;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_INTERFACE__NAME = NamespacePackage.NAMESPACE_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Main View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_INTERFACE__MAIN_VIEW = NamespacePackage.NAMESPACE_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Selector</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_INTERFACE__SELECTOR = NamespacePackage.NAMESPACE_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>User Interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_INTERFACE_FEATURE_COUNT = NamespacePackage.NAMESPACE_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>User Interface</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int USER_INTERFACE_OPERATION_COUNT = NamespacePackage.NAMESPACE_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.RendererImpl <em>Renderer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.RendererImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getRenderer()
     * @generated
     */
    int RENDERER = 22;

    /**
     * The number of structural features of the '<em>Renderer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENDERER_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Renderer</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RENDERER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.BackImpl <em>Back</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.BackImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getBack()
     * @generated
     */
    int BACK = 23;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BACK__NAME = VIEW_CONTROL__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BACK__LABEL = VIEW_CONTROL__LABEL;

    /**
     * The feature id for the '<em><b>Parent View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BACK__PARENT_VIEW = VIEW_CONTROL__PARENT_VIEW;

    /**
     * The number of structural features of the '<em>Back</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BACK_FEATURE_COUNT = VIEW_CONTROL_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Back</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BACK_OPERATION_COUNT = VIEW_CONTROL_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.impl.UnboundActionLinkImpl <em>Unbound Action Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.impl.UnboundActionLinkImpl
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getUnboundActionLink()
     * @generated
     */
    int UNBOUND_ACTION_LINK = 24;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNBOUND_ACTION_LINK__NAME = COMPONENT__NAME;

    /**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNBOUND_ACTION_LINK__LABEL = COMPONENT__LABEL;

    /**
     * The feature id for the '<em><b>Parent View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNBOUND_ACTION_LINK__PARENT_VIEW = COMPONENT__PARENT_VIEW;

    /**
     * The feature id for the '<em><b>Action View</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNBOUND_ACTION_LINK__ACTION_VIEW = COMPONENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Unbound Action Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNBOUND_ACTION_LINK_FEATURE_COUNT = COMPONENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Unbound Action Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int UNBOUND_ACTION_LINK_OPERATION_COUNT = COMPONENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.EventType <em>Event Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.EventType
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getEventType()
     * @generated
     */
    int EVENT_TYPE = 25;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.ViewType <em>Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.ViewType
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getViewType()
     * @generated
     */
    int VIEW_TYPE = 26;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.LayoutType <em>Layout Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.LayoutType
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getLayoutType()
     * @generated
     */
    int LAYOUT_TYPE = 27;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.view.AlignmentType <em>Alignment Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.view.AlignmentType
     * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getAlignmentType()
     * @generated
     */
    int ALIGNMENT_TYPE = 28;


    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.Container <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Container</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Container
     * @generated
     */
    EClass getContainer();

    /**
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.view.Container#getComponents <em>Components</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Components</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Container#getComponents()
     * @see #getContainer()
     * @generated
     */
    EReference getContainer_Components();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.view.Container#getLayout <em>Layout</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Layout</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Container#getLayout()
     * @see #getContainer()
     * @generated
     */
    EAttribute getContainer_Layout();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.view.Container#getTitle <em>Title</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Title</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Container#getTitle()
     * @see #getContainer()
     * @generated
     */
    EAttribute getContainer_Title();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.view.Container#getAlignment <em>Alignment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Alignment</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Container#getAlignment()
     * @see #getContainer()
     * @generated
     */
    EAttribute getContainer_Alignment();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.Component <em>Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Component</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Component
     * @generated
     */
    EClass getComponent();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.view.Component#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Component#getLabel()
     * @see #getComponent()
     * @generated
     */
    EAttribute getComponent_Label();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.Component#getParentView <em>Parent View</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Parent View</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Component#getParentView()
     * @see #getComponent()
     * @generated
     */
    EReference getComponent_ParentView();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.Widget <em>Widget</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Widget</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Widget
     * @generated
     */
    EClass getWidget();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.Widget#getTransferAttribute <em>Transfer Attribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Transfer Attribute</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Widget#getTransferAttribute()
     * @see #getWidget()
     * @generated
     */
    EReference getWidget_TransferAttribute();

    /**
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.view.Widget#getEmittedEvents <em>Emitted Events</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Emitted Events</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Widget#getEmittedEvents()
     * @see #getWidget()
     * @generated
     */
    EReference getWidget_EmittedEvents();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.ObjectView <em>Object View</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Object View</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.ObjectView
     * @generated
     */
    EClass getObjectView();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.ObjectView#getTransferObject <em>Transfer Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Transfer Object</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.ObjectView#getTransferObject()
     * @see #getObjectView()
     * @generated
     */
    EReference getObjectView_TransferObject();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.view.ObjectView#getViewType <em>View Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>View Type</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.ObjectView#getViewType()
     * @see #getObjectView()
     * @generated
     */
    EAttribute getObjectView_ViewType();

    /**
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.view.ObjectView#getControls <em>Controls</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Controls</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.ObjectView#getControls()
     * @see #getObjectView()
     * @generated
     */
    EReference getObjectView_Controls();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.Groupbox <em>Groupbox</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Groupbox</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Groupbox
     * @generated
     */
    EClass getGroupbox();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.Placeholder <em>Placeholder</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Placeholder</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Placeholder
     * @generated
     */
    EClass getPlaceholder();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.view.Placeholder#isPopup <em>Popup</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Popup</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Placeholder#isPopup()
     * @see #getPlaceholder()
     * @generated
     */
    EAttribute getPlaceholder_Popup();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.Navigation <em>Navigation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Navigation</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Navigation
     * @generated
     */
    EClass getNavigation();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.Navigation#getNavigationView <em>Navigation View</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Navigation View</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Navigation#getNavigationView()
     * @see #getNavigation()
     * @generated
     */
    EReference getNavigation_NavigationView();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.Navigation#getRangeView <em>Range View</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Range View</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Navigation#getRangeView()
     * @see #getNavigation()
     * @generated
     */
    EReference getNavigation_RangeView();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.Navigation#getTransferRelation <em>Transfer Relation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Transfer Relation</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Navigation#getTransferRelation()
     * @see #getNavigation()
     * @generated
     */
    EReference getNavigation_TransferRelation();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.Link <em>Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Link</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Link
     * @generated
     */
    EClass getLink();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.Link#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Link#getTarget()
     * @see #getLink()
     * @generated
     */
    EReference getLink_Target();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.view.Link#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Text</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Link#getText()
     * @see #getLink()
     * @generated
     */
    EAttribute getLink_Text();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.Embedded <em>Embedded</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Embedded</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Embedded
     * @generated
     */
    EClass getEmbedded();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.Action <em>Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Action
     * @generated
     */
    EClass getAction();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.Action#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Action#getTarget()
     * @see #getAction()
     * @generated
     */
    EReference getAction_Target();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.Action#getOperation <em>Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Action#getOperation()
     * @see #getAction()
     * @generated
     */
    EReference getAction_Operation();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.Action#getResultView <em>Result View</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Result View</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Action#getResultView()
     * @see #getAction()
     * @generated
     */
    EReference getAction_ResultView();

    /**
     * Returns the meta object for the reference list '{@link hu.blackbelt.judo.meta.psm.view.Action#getFaultViews <em>Fault Views</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Fault Views</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Action#getFaultViews()
     * @see #getAction()
     * @generated
     */
    EReference getAction_FaultViews();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.Control <em>Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Control</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Control
     * @generated
     */
    EClass getControl();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.Control#getController <em>Controller</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Controller</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Control#getController()
     * @see #getControl()
     * @generated
     */
    EReference getControl_Controller();

    /**
     * Returns the meta object for the reference list '{@link hu.blackbelt.judo.meta.psm.view.Control#getComponents <em>Components</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference list '<em>Components</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Control#getComponents()
     * @see #getControl()
     * @generated
     */
    EReference getControl_Components();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.VisibleControl <em>Visible Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Visible Control</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.VisibleControl
     * @generated
     */
    EClass getVisibleControl();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.EnabledControl <em>Enabled Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enabled Control</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.EnabledControl
     * @generated
     */
    EClass getEnabledControl();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.ViewControl <em>Control</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Control</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.ViewControl
     * @generated
     */
    EClass getViewControl();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.Event <em>Event</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Event</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Event
     * @generated
     */
    EClass getEvent();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.view.Event#getEventType <em>Event Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Event Type</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Event#getEventType()
     * @see #getEvent()
     * @generated
     */
    EAttribute getEvent_EventType();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.Event#getTriggered <em>Triggered</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Triggered</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Event#getTriggered()
     * @see #getEvent()
     * @generated
     */
    EReference getEvent_Triggered();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.MenuComponent <em>Menu Component</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Menu Component</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.MenuComponent
     * @generated
     */
    EClass getMenuComponent();

    /**
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.view.MenuComponent#getSubMenus <em>Sub Menus</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Sub Menus</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.MenuComponent#getSubMenus()
     * @see #getMenuComponent()
     * @generated
     */
    EReference getMenuComponent_SubMenus();

    /**
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.view.MenuComponent#getMenuItems <em>Menu Items</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Menu Items</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.MenuComponent#getMenuItems()
     * @see #getMenuComponent()
     * @generated
     */
    EReference getMenuComponent_MenuItems();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.MenuBar <em>Menu Bar</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Menu Bar</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.MenuBar
     * @generated
     */
    EClass getMenuBar();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.Menu <em>Menu</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Menu</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Menu
     * @generated
     */
    EClass getMenu();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.MenuItem <em>Menu Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Menu Item</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.MenuItem
     * @generated
     */
    EClass getMenuItem();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.MenuItem#getView <em>View</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>View</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.MenuItem#getView()
     * @see #getMenuItem()
     * @generated
     */
    EReference getMenuItem_View();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.MenuItem#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.MenuItem#getTarget()
     * @see #getMenuItem()
     * @generated
     */
    EReference getMenuItem_Target();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.EntryMenuItem <em>Entry Menu Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entry Menu Item</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.EntryMenuItem
     * @generated
     */
    EClass getEntryMenuItem();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.EntryMenuItem#getSelector <em>Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Selector</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.EntryMenuItem#getSelector()
     * @see #getEntryMenuItem()
     * @generated
     */
    EReference getEntryMenuItem_Selector();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.ActionMenuItem <em>Action Menu Item</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action Menu Item</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.ActionMenuItem
     * @generated
     */
    EClass getActionMenuItem();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.ActionMenuItem#getExposedService <em>Exposed Service</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Exposed Service</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.ActionMenuItem#getExposedService()
     * @see #getActionMenuItem()
     * @generated
     */
    EReference getActionMenuItem_ExposedService();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.UserInterface <em>User Interface</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>User Interface</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.UserInterface
     * @generated
     */
    EClass getUserInterface();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.UserInterface#getMainView <em>Main View</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Main View</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.UserInterface#getMainView()
     * @see #getUserInterface()
     * @generated
     */
    EReference getUserInterface_MainView();

    /**
     * Returns the meta object for the containment reference '{@link hu.blackbelt.judo.meta.psm.view.UserInterface#getSelector <em>Selector</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Selector</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.UserInterface#getSelector()
     * @see #getUserInterface()
     * @generated
     */
    EReference getUserInterface_Selector();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.Renderer <em>Renderer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Renderer</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Renderer
     * @generated
     */
    EClass getRenderer();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.Back <em>Back</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Back</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.Back
     * @generated
     */
    EClass getBack();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.view.UnboundActionLink <em>Unbound Action Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Unbound Action Link</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.UnboundActionLink
     * @generated
     */
    EClass getUnboundActionLink();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.view.UnboundActionLink#getActionView <em>Action View</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Action View</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.UnboundActionLink#getActionView()
     * @see #getUnboundActionLink()
     * @generated
     */
    EReference getUnboundActionLink_ActionView();

    /**
     * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.view.EventType <em>Event Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Event Type</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.EventType
     * @generated
     */
    EEnum getEventType();

    /**
     * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.view.ViewType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Type</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.ViewType
     * @generated
     */
    EEnum getViewType();

    /**
     * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.view.LayoutType <em>Layout Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Layout Type</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.LayoutType
     * @generated
     */
    EEnum getLayoutType();

    /**
     * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.view.AlignmentType <em>Alignment Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Alignment Type</em>'.
     * @see hu.blackbelt.judo.meta.psm.view.AlignmentType
     * @generated
     */
    EEnum getAlignmentType();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ViewFactory getViewFactory();

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
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.ContainerImpl <em>Container</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.ContainerImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getContainer()
         * @generated
         */
        EClass CONTAINER = eINSTANCE.getContainer();

        /**
         * The meta object literal for the '<em><b>Components</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTAINER__COMPONENTS = eINSTANCE.getContainer_Components();

        /**
         * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTAINER__LAYOUT = eINSTANCE.getContainer_Layout();

        /**
         * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTAINER__TITLE = eINSTANCE.getContainer_Title();

        /**
         * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONTAINER__ALIGNMENT = eINSTANCE.getContainer_Alignment();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.ComponentImpl <em>Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.ComponentImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getComponent()
         * @generated
         */
        EClass COMPONENT = eINSTANCE.getComponent();

        /**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute COMPONENT__LABEL = eINSTANCE.getComponent_Label();

        /**
         * The meta object literal for the '<em><b>Parent View</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference COMPONENT__PARENT_VIEW = eINSTANCE.getComponent_ParentView();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.WidgetImpl <em>Widget</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.WidgetImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getWidget()
         * @generated
         */
        EClass WIDGET = eINSTANCE.getWidget();

        /**
         * The meta object literal for the '<em><b>Transfer Attribute</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WIDGET__TRANSFER_ATTRIBUTE = eINSTANCE.getWidget_TransferAttribute();

        /**
         * The meta object literal for the '<em><b>Emitted Events</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WIDGET__EMITTED_EVENTS = eINSTANCE.getWidget_EmittedEvents();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.ObjectViewImpl <em>Object View</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.ObjectViewImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getObjectView()
         * @generated
         */
        EClass OBJECT_VIEW = eINSTANCE.getObjectView();

        /**
         * The meta object literal for the '<em><b>Transfer Object</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OBJECT_VIEW__TRANSFER_OBJECT = eINSTANCE.getObjectView_TransferObject();

        /**
         * The meta object literal for the '<em><b>View Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute OBJECT_VIEW__VIEW_TYPE = eINSTANCE.getObjectView_ViewType();

        /**
         * The meta object literal for the '<em><b>Controls</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference OBJECT_VIEW__CONTROLS = eINSTANCE.getObjectView_Controls();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.GroupboxImpl <em>Groupbox</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.GroupboxImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getGroupbox()
         * @generated
         */
        EClass GROUPBOX = eINSTANCE.getGroupbox();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.PlaceholderImpl <em>Placeholder</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.PlaceholderImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getPlaceholder()
         * @generated
         */
        EClass PLACEHOLDER = eINSTANCE.getPlaceholder();

        /**
         * The meta object literal for the '<em><b>Popup</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PLACEHOLDER__POPUP = eINSTANCE.getPlaceholder_Popup();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.NavigationImpl <em>Navigation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.NavigationImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getNavigation()
         * @generated
         */
        EClass NAVIGATION = eINSTANCE.getNavigation();

        /**
         * The meta object literal for the '<em><b>Navigation View</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NAVIGATION__NAVIGATION_VIEW = eINSTANCE.getNavigation_NavigationView();

        /**
         * The meta object literal for the '<em><b>Range View</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NAVIGATION__RANGE_VIEW = eINSTANCE.getNavigation_RangeView();

        /**
         * The meta object literal for the '<em><b>Transfer Relation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference NAVIGATION__TRANSFER_RELATION = eINSTANCE.getNavigation_TransferRelation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.LinkImpl <em>Link</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.LinkImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getLink()
         * @generated
         */
        EClass LINK = eINSTANCE.getLink();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINK__TARGET = eINSTANCE.getLink_Target();

        /**
         * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINK__TEXT = eINSTANCE.getLink_Text();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.EmbeddedImpl <em>Embedded</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.EmbeddedImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getEmbedded()
         * @generated
         */
        EClass EMBEDDED = eINSTANCE.getEmbedded();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.ActionImpl <em>Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.ActionImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getAction()
         * @generated
         */
        EClass ACTION = eINSTANCE.getAction();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION__TARGET = eINSTANCE.getAction_Target();

        /**
         * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION__OPERATION = eINSTANCE.getAction_Operation();

        /**
         * The meta object literal for the '<em><b>Result View</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION__RESULT_VIEW = eINSTANCE.getAction_ResultView();

        /**
         * The meta object literal for the '<em><b>Fault Views</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION__FAULT_VIEWS = eINSTANCE.getAction_FaultViews();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.ControlImpl <em>Control</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.ControlImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getControl()
         * @generated
         */
        EClass CONTROL = eINSTANCE.getControl();

        /**
         * The meta object literal for the '<em><b>Controller</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTROL__CONTROLLER = eINSTANCE.getControl_Controller();

        /**
         * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference CONTROL__COMPONENTS = eINSTANCE.getControl_Components();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.VisibleControlImpl <em>Visible Control</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.VisibleControlImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getVisibleControl()
         * @generated
         */
        EClass VISIBLE_CONTROL = eINSTANCE.getVisibleControl();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.EnabledControlImpl <em>Enabled Control</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.EnabledControlImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getEnabledControl()
         * @generated
         */
        EClass ENABLED_CONTROL = eINSTANCE.getEnabledControl();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.ViewControlImpl <em>Control</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewControlImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getViewControl()
         * @generated
         */
        EClass VIEW_CONTROL = eINSTANCE.getViewControl();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.EventImpl <em>Event</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.EventImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getEvent()
         * @generated
         */
        EClass EVENT = eINSTANCE.getEvent();

        /**
         * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EVENT__EVENT_TYPE = eINSTANCE.getEvent_EventType();

        /**
         * The meta object literal for the '<em><b>Triggered</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVENT__TRIGGERED = eINSTANCE.getEvent_Triggered();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.MenuComponentImpl <em>Menu Component</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.MenuComponentImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getMenuComponent()
         * @generated
         */
        EClass MENU_COMPONENT = eINSTANCE.getMenuComponent();

        /**
         * The meta object literal for the '<em><b>Sub Menus</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MENU_COMPONENT__SUB_MENUS = eINSTANCE.getMenuComponent_SubMenus();

        /**
         * The meta object literal for the '<em><b>Menu Items</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MENU_COMPONENT__MENU_ITEMS = eINSTANCE.getMenuComponent_MenuItems();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.MenuBarImpl <em>Menu Bar</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.MenuBarImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getMenuBar()
         * @generated
         */
        EClass MENU_BAR = eINSTANCE.getMenuBar();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.MenuImpl <em>Menu</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.MenuImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getMenu()
         * @generated
         */
        EClass MENU = eINSTANCE.getMenu();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.MenuItemImpl <em>Menu Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.MenuItemImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getMenuItem()
         * @generated
         */
        EClass MENU_ITEM = eINSTANCE.getMenuItem();

        /**
         * The meta object literal for the '<em><b>View</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MENU_ITEM__VIEW = eINSTANCE.getMenuItem_View();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MENU_ITEM__TARGET = eINSTANCE.getMenuItem_Target();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.EntryMenuItemImpl <em>Entry Menu Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.EntryMenuItemImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getEntryMenuItem()
         * @generated
         */
        EClass ENTRY_MENU_ITEM = eINSTANCE.getEntryMenuItem();

        /**
         * The meta object literal for the '<em><b>Selector</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENTRY_MENU_ITEM__SELECTOR = eINSTANCE.getEntryMenuItem_Selector();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.ActionMenuItemImpl <em>Action Menu Item</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.ActionMenuItemImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getActionMenuItem()
         * @generated
         */
        EClass ACTION_MENU_ITEM = eINSTANCE.getActionMenuItem();

        /**
         * The meta object literal for the '<em><b>Exposed Service</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION_MENU_ITEM__EXPOSED_SERVICE = eINSTANCE.getActionMenuItem_ExposedService();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.UserInterfaceImpl <em>User Interface</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.UserInterfaceImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getUserInterface()
         * @generated
         */
        EClass USER_INTERFACE = eINSTANCE.getUserInterface();

        /**
         * The meta object literal for the '<em><b>Main View</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference USER_INTERFACE__MAIN_VIEW = eINSTANCE.getUserInterface_MainView();

        /**
         * The meta object literal for the '<em><b>Selector</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference USER_INTERFACE__SELECTOR = eINSTANCE.getUserInterface_Selector();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.RendererImpl <em>Renderer</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.RendererImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getRenderer()
         * @generated
         */
        EClass RENDERER = eINSTANCE.getRenderer();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.BackImpl <em>Back</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.BackImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getBack()
         * @generated
         */
        EClass BACK = eINSTANCE.getBack();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.impl.UnboundActionLinkImpl <em>Unbound Action Link</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.impl.UnboundActionLinkImpl
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getUnboundActionLink()
         * @generated
         */
        EClass UNBOUND_ACTION_LINK = eINSTANCE.getUnboundActionLink();

        /**
         * The meta object literal for the '<em><b>Action View</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference UNBOUND_ACTION_LINK__ACTION_VIEW = eINSTANCE.getUnboundActionLink_ActionView();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.EventType <em>Event Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.EventType
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getEventType()
         * @generated
         */
        EEnum EVENT_TYPE = eINSTANCE.getEventType();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.ViewType <em>Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.ViewType
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getViewType()
         * @generated
         */
        EEnum VIEW_TYPE = eINSTANCE.getViewType();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.LayoutType <em>Layout Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.LayoutType
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getLayoutType()
         * @generated
         */
        EEnum LAYOUT_TYPE = eINSTANCE.getLayoutType();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.view.AlignmentType <em>Alignment Type</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.view.AlignmentType
         * @see hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl#getAlignmentType()
         * @generated
         */
        EEnum ALIGNMENT_TYPE = eINSTANCE.getAlignmentType();

    }

} //ViewPackage
