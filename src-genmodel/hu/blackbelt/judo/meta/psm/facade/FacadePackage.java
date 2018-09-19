/**
 */
package hu.blackbelt.judo.meta.psm.facade;

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
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.FacadeImpl <em>Facade</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadeImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getFacade()
     * @generated
     */
    int FACADE = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACADE__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACADE__PROPERTIES = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACADE__LINKS = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACADE__ENTITY_TYPE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Facade</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACADE_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>Facade</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FACADE_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

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
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__PATH = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Function</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__FUNCTION = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Order Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__ORDER_INDEX = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Order Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__ORDER_DIRECTION = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Filterable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__FILTERABLE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 5;

    /**
     * The feature id for the '<em><b>Viewable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__VIEWABLE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 6;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 7;

    /**
     * The number of operations of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.LinkImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getLink()
     * @generated
     */
    int LINK = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__TARGET = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Path</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__PATH = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.ViewImpl <em>View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.ViewImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getView()
     * @generated
     */
    int VIEW = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW__NAME = FACADE__NAME;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW__PROPERTIES = FACADE__PROPERTIES;

    /**
     * The feature id for the '<em><b>Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW__LINKS = FACADE__LINKS;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW__ENTITY_TYPE = FACADE__ENTITY_TYPE;

    /**
     * The number of structural features of the '<em>View</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_FEATURE_COUNT = FACADE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>View</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int VIEW_OPERATION_COUNT = FACADE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.impl.ActionImpl
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getAction()
     * @generated
     */
    int ACTION = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__NAME = FACADE__NAME;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__PROPERTIES = FACADE__PROPERTIES;

    /**
     * The feature id for the '<em><b>Links</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__LINKS = FACADE__LINKS;

    /**
     * The feature id for the '<em><b>Entity Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__ENTITY_TYPE = FACADE__ENTITY_TYPE;

    /**
     * The feature id for the '<em><b>Result</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__RESULT = FACADE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Body</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__BODY = FACADE_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>List</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__LIST = FACADE_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>External</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__EXTERNAL = FACADE_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_FEATURE_COUNT = FACADE_FEATURE_COUNT + 4;

    /**
     * The number of operations of the '<em>Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_OPERATION_COUNT = FACADE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.Function <em>Function</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.Function
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getFunction()
     * @generated
     */
    int FUNCTION = 5;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.facade.OrderDirection <em>Order Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.facade.OrderDirection
     * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getOrderDirection()
     * @generated
     */
    int ORDER_DIRECTION = 6;


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
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.facade.Facade#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Facade#getProperties()
     * @see #getFacade()
     * @generated
     */
    EReference getFacade_Properties();

    /**
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.facade.Facade#getLinks <em>Links</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Links</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Facade#getLinks()
     * @see #getFacade()
     * @generated
     */
    EReference getFacade_Links();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.facade.Facade#getEntityType <em>Entity Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Entity Type</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Facade#getEntityType()
     * @see #getFacade()
     * @generated
     */
    EReference getFacade_EntityType();

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
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.Property#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Property#getPath()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Path();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.Property#getFunction <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Function</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Property#getFunction()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Function();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.Property#getOrderIndex <em>Order Index</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Order Index</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Property#getOrderIndex()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_OrderIndex();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.Property#getOrderDirection <em>Order Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Order Direction</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Property#getOrderDirection()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_OrderDirection();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.Property#isFilterable <em>Filterable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filterable</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Property#isFilterable()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Filterable();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.Property#isViewable <em>Viewable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Viewable</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Property#isViewable()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Viewable();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.Link <em>Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Link</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Link
     * @generated
     */
    EClass getLink();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.facade.Link#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Link#getTarget()
     * @see #getLink()
     * @generated
     */
    EReference getLink_Target();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.Link#getPath <em>Path</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Path</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Link#getPath()
     * @see #getLink()
     * @generated
     */
    EAttribute getLink_Path();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.View <em>View</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>View</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.View
     * @generated
     */
    EClass getView();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.facade.Action <em>Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Action
     * @generated
     */
    EClass getAction();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.facade.Action#getResult <em>Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Result</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Action#getResult()
     * @see #getAction()
     * @generated
     */
    EReference getAction_Result();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.Action#getBody <em>Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Body</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Action#getBody()
     * @see #getAction()
     * @generated
     */
    EAttribute getAction_Body();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.Action#isList <em>List</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>List</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Action#isList()
     * @see #getAction()
     * @generated
     */
    EAttribute getAction_List();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.facade.Action#isExternal <em>External</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>External</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Action#isExternal()
     * @see #getAction()
     * @generated
     */
    EAttribute getAction_External();

    /**
     * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.facade.Function <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Function</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.Function
     * @generated
     */
    EEnum getFunction();

    /**
     * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.facade.OrderDirection <em>Order Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Order Direction</em>'.
     * @see hu.blackbelt.judo.meta.psm.facade.OrderDirection
     * @generated
     */
    EEnum getOrderDirection();

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
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.FacadeImpl <em>Facade</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadeImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getFacade()
         * @generated
         */
        EClass FACADE = eINSTANCE.getFacade();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FACADE__PROPERTIES = eINSTANCE.getFacade_Properties();

        /**
         * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FACADE__LINKS = eINSTANCE.getFacade_Links();

        /**
         * The meta object literal for the '<em><b>Entity Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FACADE__ENTITY_TYPE = eINSTANCE.getFacade_EntityType();

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
         * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__PATH = eINSTANCE.getProperty_Path();

        /**
         * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__FUNCTION = eINSTANCE.getProperty_Function();

        /**
         * The meta object literal for the '<em><b>Order Index</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__ORDER_INDEX = eINSTANCE.getProperty_OrderIndex();

        /**
         * The meta object literal for the '<em><b>Order Direction</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__ORDER_DIRECTION = eINSTANCE.getProperty_OrderDirection();

        /**
         * The meta object literal for the '<em><b>Filterable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__FILTERABLE = eINSTANCE.getProperty_Filterable();

        /**
         * The meta object literal for the '<em><b>Viewable</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__VIEWABLE = eINSTANCE.getProperty_Viewable();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.LinkImpl <em>Link</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.LinkImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getLink()
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
         * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINK__PATH = eINSTANCE.getLink_Path();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.ViewImpl <em>View</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.ViewImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getView()
         * @generated
         */
        EClass VIEW = eINSTANCE.getView();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.impl.ActionImpl <em>Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.impl.ActionImpl
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getAction()
         * @generated
         */
        EClass ACTION = eINSTANCE.getAction();

        /**
         * The meta object literal for the '<em><b>Result</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ACTION__RESULT = eINSTANCE.getAction_Result();

        /**
         * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION__BODY = eINSTANCE.getAction_Body();

        /**
         * The meta object literal for the '<em><b>List</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION__LIST = eINSTANCE.getAction_List();

        /**
         * The meta object literal for the '<em><b>External</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ACTION__EXTERNAL = eINSTANCE.getAction_External();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.Function <em>Function</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.Function
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getFunction()
         * @generated
         */
        EEnum FUNCTION = eINSTANCE.getFunction();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.facade.OrderDirection <em>Order Direction</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.facade.OrderDirection
         * @see hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl#getOrderDirection()
         * @generated
         */
        EEnum ORDER_DIRECTION = eINSTANCE.getOrderDirection();

    }

} //FacadePackage
