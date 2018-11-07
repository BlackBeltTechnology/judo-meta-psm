/**
 */
package hu.blackbelt.judo.meta.psm.action;

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
 * @see hu.blackbelt.judo.meta.psm.action.ActionFactory
 * @model kind="package"
 * @generated
 */
public interface ActionPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "action";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://blackbelt.hu/judo/meta/psm/action";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "action";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ActionPackage eINSTANCE = hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl.init();

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.action.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.action.impl.FunctionImpl
     * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getFunction()
     * @generated
     */
    int FUNCTION = 1;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__PARAMETERS = 0;

    /**
     * The feature id for the '<em><b>Body</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION__BODY = 1;

    /**
     * The number of structural features of the '<em>Function</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Function</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FUNCTION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.action.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.action.impl.ActionImpl
     * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getAction()
     * @generated
     */
    int ACTION = 0;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__PARAMETERS = FUNCTION__PARAMETERS;

    /**
     * The feature id for the '<em><b>Body</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION__BODY = FUNCTION__BODY;

    /**
     * The number of structural features of the '<em>Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Action</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ACTION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.action.impl.QueryImpl <em>Query</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.action.impl.QueryImpl
     * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getQuery()
     * @generated
     */
    int QUERY = 2;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__PARAMETERS = FUNCTION__PARAMETERS;

    /**
     * The feature id for the '<em><b>Body</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY__BODY = FUNCTION__BODY;

    /**
     * The number of structural features of the '<em>Query</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Query</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int QUERY_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.action.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.action.impl.ParameterImpl
     * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getParameter()
     * @generated
     */
    int PARAMETER = 3;

    /**
     * The feature id for the '<em><b>Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__DIRECTION = 0;

    /**
     * The number of structural features of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.action.impl.EntityParameterImpl <em>Entity Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.action.impl.EntityParameterImpl
     * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getEntityParameter()
     * @generated
     */
    int ENTITY_PARAMETER = 4;

    /**
     * The feature id for the '<em><b>Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_PARAMETER__DIRECTION = PARAMETER__DIRECTION;

    /**
     * The feature id for the '<em><b>On Get Options</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_PARAMETER__ON_GET_OPTIONS = PARAMETER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Entity Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Entity Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENTITY_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.action.impl.PrimitiveParameterImpl <em>Primitive Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.action.impl.PrimitiveParameterImpl
     * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getPrimitiveParameter()
     * @generated
     */
    int PRIMITIVE_PARAMETER = 5;

    /**
     * The feature id for the '<em><b>Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_PARAMETER__DIRECTION = PARAMETER__DIRECTION;

    /**
     * The feature id for the '<em><b>Primitive Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_PARAMETER__PRIMITIVE_TYPE = PARAMETER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Primitive Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_PARAMETER_FEATURE_COUNT = PARAMETER_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Primitive Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_PARAMETER_OPERATION_COUNT = PARAMETER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.action.impl.SingleEntityParameterImpl <em>Single Entity Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.action.impl.SingleEntityParameterImpl
     * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getSingleEntityParameter()
     * @generated
     */
    int SINGLE_ENTITY_PARAMETER = 6;

    /**
     * The feature id for the '<em><b>Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_ENTITY_PARAMETER__DIRECTION = ENTITY_PARAMETER__DIRECTION;

    /**
     * The feature id for the '<em><b>On Get Options</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_ENTITY_PARAMETER__ON_GET_OPTIONS = ENTITY_PARAMETER__ON_GET_OPTIONS;

    /**
     * The feature id for the '<em><b>On Get Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_ENTITY_PARAMETER__ON_GET_DEFAULT = ENTITY_PARAMETER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Single Entity Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_ENTITY_PARAMETER_FEATURE_COUNT = ENTITY_PARAMETER_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Single Entity Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SINGLE_ENTITY_PARAMETER_OPERATION_COUNT = ENTITY_PARAMETER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.action.impl.ListEntityParameterImpl <em>List Entity Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.action.impl.ListEntityParameterImpl
     * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getListEntityParameter()
     * @generated
     */
    int LIST_ENTITY_PARAMETER = 7;

    /**
     * The feature id for the '<em><b>Direction</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_ENTITY_PARAMETER__DIRECTION = ENTITY_PARAMETER__DIRECTION;

    /**
     * The feature id for the '<em><b>On Get Options</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_ENTITY_PARAMETER__ON_GET_OPTIONS = ENTITY_PARAMETER__ON_GET_OPTIONS;

    /**
     * The feature id for the '<em><b>On Get Default</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_ENTITY_PARAMETER__ON_GET_DEFAULT = ENTITY_PARAMETER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>List Entity Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_ENTITY_PARAMETER_FEATURE_COUNT = ENTITY_PARAMETER_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>List Entity Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LIST_ENTITY_PARAMETER_OPERATION_COUNT = ENTITY_PARAMETER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.action.impl.DeleteOperationImpl <em>Delete Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.action.impl.DeleteOperationImpl
     * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getDeleteOperation()
     * @generated
     */
    int DELETE_OPERATION = 8;

    /**
     * The number of structural features of the '<em>Delete Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE_OPERATION_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Delete Operation</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DELETE_OPERATION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.action.Direction <em>Direction</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.action.Direction
     * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getDirection()
     * @generated
     */
    int DIRECTION = 9;


    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.action.Action <em>Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Action</em>'.
     * @see hu.blackbelt.judo.meta.psm.action.Action
     * @generated
     */
    EClass getAction();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.action.Function <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Function</em>'.
     * @see hu.blackbelt.judo.meta.psm.action.Function
     * @generated
     */
    EClass getFunction();

    /**
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.action.Function#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameters</em>'.
     * @see hu.blackbelt.judo.meta.psm.action.Function#getParameters()
     * @see #getFunction()
     * @generated
     */
    EReference getFunction_Parameters();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.action.Function#getBody <em>Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Body</em>'.
     * @see hu.blackbelt.judo.meta.psm.action.Function#getBody()
     * @see #getFunction()
     * @generated
     */
    EAttribute getFunction_Body();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.action.Query <em>Query</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Query</em>'.
     * @see hu.blackbelt.judo.meta.psm.action.Query
     * @generated
     */
    EClass getQuery();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.action.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter</em>'.
     * @see hu.blackbelt.judo.meta.psm.action.Parameter
     * @generated
     */
    EClass getParameter();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.action.Parameter#getDirection <em>Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Direction</em>'.
     * @see hu.blackbelt.judo.meta.psm.action.Parameter#getDirection()
     * @see #getParameter()
     * @generated
     */
    EAttribute getParameter_Direction();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.action.EntityParameter <em>Entity Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Entity Parameter</em>'.
     * @see hu.blackbelt.judo.meta.psm.action.EntityParameter
     * @generated
     */
    EClass getEntityParameter();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.action.EntityParameter#getOnGetOptions <em>On Get Options</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>On Get Options</em>'.
     * @see hu.blackbelt.judo.meta.psm.action.EntityParameter#getOnGetOptions()
     * @see #getEntityParameter()
     * @generated
     */
    EAttribute getEntityParameter_OnGetOptions();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.action.PrimitiveParameter <em>Primitive Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Primitive Parameter</em>'.
     * @see hu.blackbelt.judo.meta.psm.action.PrimitiveParameter
     * @generated
     */
    EClass getPrimitiveParameter();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.action.PrimitiveParameter#getPrimitiveType <em>Primitive Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Primitive Type</em>'.
     * @see hu.blackbelt.judo.meta.psm.action.PrimitiveParameter#getPrimitiveType()
     * @see #getPrimitiveParameter()
     * @generated
     */
    EReference getPrimitiveParameter_PrimitiveType();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.action.SingleEntityParameter <em>Single Entity Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Single Entity Parameter</em>'.
     * @see hu.blackbelt.judo.meta.psm.action.SingleEntityParameter
     * @generated
     */
    EClass getSingleEntityParameter();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.action.SingleEntityParameter#getOnGetDefault <em>On Get Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>On Get Default</em>'.
     * @see hu.blackbelt.judo.meta.psm.action.SingleEntityParameter#getOnGetDefault()
     * @see #getSingleEntityParameter()
     * @generated
     */
    EAttribute getSingleEntityParameter_OnGetDefault();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.action.ListEntityParameter <em>List Entity Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>List Entity Parameter</em>'.
     * @see hu.blackbelt.judo.meta.psm.action.ListEntityParameter
     * @generated
     */
    EClass getListEntityParameter();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.action.ListEntityParameter#getOnGetDefault <em>On Get Default</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>On Get Default</em>'.
     * @see hu.blackbelt.judo.meta.psm.action.ListEntityParameter#getOnGetDefault()
     * @see #getListEntityParameter()
     * @generated
     */
    EAttribute getListEntityParameter_OnGetDefault();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.action.DeleteOperation <em>Delete Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Delete Operation</em>'.
     * @see hu.blackbelt.judo.meta.psm.action.DeleteOperation
     * @generated
     */
    EClass getDeleteOperation();

    /**
     * Returns the meta object for enum '{@link hu.blackbelt.judo.meta.psm.action.Direction <em>Direction</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Direction</em>'.
     * @see hu.blackbelt.judo.meta.psm.action.Direction
     * @generated
     */
    EEnum getDirection();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    ActionFactory getActionFactory();

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
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.action.impl.ActionImpl <em>Action</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.action.impl.ActionImpl
         * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getAction()
         * @generated
         */
        EClass ACTION = eINSTANCE.getAction();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.action.impl.FunctionImpl <em>Function</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.action.impl.FunctionImpl
         * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getFunction()
         * @generated
         */
        EClass FUNCTION = eINSTANCE.getFunction();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

        /**
         * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FUNCTION__BODY = eINSTANCE.getFunction_Body();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.action.impl.QueryImpl <em>Query</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.action.impl.QueryImpl
         * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getQuery()
         * @generated
         */
        EClass QUERY = eINSTANCE.getQuery();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.action.impl.ParameterImpl <em>Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.action.impl.ParameterImpl
         * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getParameter()
         * @generated
         */
        EClass PARAMETER = eINSTANCE.getParameter();

        /**
         * The meta object literal for the '<em><b>Direction</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER__DIRECTION = eINSTANCE.getParameter_Direction();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.action.impl.EntityParameterImpl <em>Entity Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.action.impl.EntityParameterImpl
         * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getEntityParameter()
         * @generated
         */
        EClass ENTITY_PARAMETER = eINSTANCE.getEntityParameter();

        /**
         * The meta object literal for the '<em><b>On Get Options</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ENTITY_PARAMETER__ON_GET_OPTIONS = eINSTANCE.getEntityParameter_OnGetOptions();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.action.impl.PrimitiveParameterImpl <em>Primitive Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.action.impl.PrimitiveParameterImpl
         * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getPrimitiveParameter()
         * @generated
         */
        EClass PRIMITIVE_PARAMETER = eINSTANCE.getPrimitiveParameter();

        /**
         * The meta object literal for the '<em><b>Primitive Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PRIMITIVE_PARAMETER__PRIMITIVE_TYPE = eINSTANCE.getPrimitiveParameter_PrimitiveType();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.action.impl.SingleEntityParameterImpl <em>Single Entity Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.action.impl.SingleEntityParameterImpl
         * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getSingleEntityParameter()
         * @generated
         */
        EClass SINGLE_ENTITY_PARAMETER = eINSTANCE.getSingleEntityParameter();

        /**
         * The meta object literal for the '<em><b>On Get Default</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SINGLE_ENTITY_PARAMETER__ON_GET_DEFAULT = eINSTANCE.getSingleEntityParameter_OnGetDefault();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.action.impl.ListEntityParameterImpl <em>List Entity Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.action.impl.ListEntityParameterImpl
         * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getListEntityParameter()
         * @generated
         */
        EClass LIST_ENTITY_PARAMETER = eINSTANCE.getListEntityParameter();

        /**
         * The meta object literal for the '<em><b>On Get Default</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LIST_ENTITY_PARAMETER__ON_GET_DEFAULT = eINSTANCE.getListEntityParameter_OnGetDefault();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.action.impl.DeleteOperationImpl <em>Delete Operation</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.action.impl.DeleteOperationImpl
         * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getDeleteOperation()
         * @generated
         */
        EClass DELETE_OPERATION = eINSTANCE.getDeleteOperation();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.action.Direction <em>Direction</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.action.Direction
         * @see hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl#getDirection()
         * @generated
         */
        EEnum DIRECTION = eINSTANCE.getDirection();

    }

} //ActionPackage
