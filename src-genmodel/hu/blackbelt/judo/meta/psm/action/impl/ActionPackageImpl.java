/**
 */
package hu.blackbelt.judo.meta.psm.action.impl;

import hu.blackbelt.judo.meta.psm.action.Action;
import hu.blackbelt.judo.meta.psm.action.ActionFactory;
import hu.blackbelt.judo.meta.psm.action.ActionPackage;
import hu.blackbelt.judo.meta.psm.action.DeleteOperation;
import hu.blackbelt.judo.meta.psm.action.Direction;
import hu.blackbelt.judo.meta.psm.action.EntityParameter;
import hu.blackbelt.judo.meta.psm.action.Function;
import hu.blackbelt.judo.meta.psm.action.ListEntityParameter;
import hu.blackbelt.judo.meta.psm.action.Parameter;
import hu.blackbelt.judo.meta.psm.action.PrimitiveParameter;
import hu.blackbelt.judo.meta.psm.action.Query;
import hu.blackbelt.judo.meta.psm.action.SingleEntityParameter;

import hu.blackbelt.judo.meta.psm.behavior.BehaviorPackage;

import hu.blackbelt.judo.meta.psm.behavior.impl.BehaviorPackageImpl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;

import hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl;

import hu.blackbelt.judo.meta.psm.facade.FacadePackage;

import hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamespacePackageImpl;

import hu.blackbelt.judo.meta.psm.type.TypePackage;

import hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ActionPackageImpl extends EPackageImpl implements ActionPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass actionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass functionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass queryEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityParameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass primitiveParameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass singleEntityParameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass listEntityParameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass deleteOperationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum directionEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see hu.blackbelt.judo.meta.psm.action.ActionPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private ActionPackageImpl() {
        super(eNS_URI, ActionFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link ActionPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static ActionPackage init() {
        if (isInited) return (ActionPackage)EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI);

        // Obtain or create and register package
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ActionPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
        BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
        FacadePackageImpl theFacadePackage = (FacadePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI) instanceof FacadePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI) : FacadePackage.eINSTANCE);

        // Create package meta-data objects
        theActionPackage.createPackageContents();
        theNamespacePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theDataPackage.createPackageContents();
        theBehaviorPackage.createPackageContents();
        theFacadePackage.createPackageContents();

        // Initialize created meta-data
        theActionPackage.initializePackageContents();
        theNamespacePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theDataPackage.initializePackageContents();
        theBehaviorPackage.initializePackageContents();
        theFacadePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theActionPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(ActionPackage.eNS_URI, theActionPackage);
        return theActionPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAction() {
        return actionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFunction() {
        return functionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFunction_Parameters() {
        return (EReference)functionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getFunction_Body() {
        return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getQuery() {
        return queryEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getParameter() {
        return parameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getParameter_Direction() {
        return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityParameter() {
        return entityParameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEntityParameter_OnGetOptions() {
        return (EAttribute)entityParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPrimitiveParameter() {
        return primitiveParameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPrimitiveParameter_PrimitiveType() {
        return (EReference)primitiveParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSingleEntityParameter() {
        return singleEntityParameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getSingleEntityParameter_OnGetDefault() {
        return (EAttribute)singleEntityParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getListEntityParameter() {
        return listEntityParameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getListEntityParameter_OnGetDefault() {
        return (EAttribute)listEntityParameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDeleteOperation() {
        return deleteOperationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getDirection() {
        return directionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionFactory getActionFactory() {
        return (ActionFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        actionEClass = createEClass(ACTION);

        functionEClass = createEClass(FUNCTION);
        createEReference(functionEClass, FUNCTION__PARAMETERS);
        createEAttribute(functionEClass, FUNCTION__BODY);

        queryEClass = createEClass(QUERY);

        parameterEClass = createEClass(PARAMETER);
        createEAttribute(parameterEClass, PARAMETER__DIRECTION);

        entityParameterEClass = createEClass(ENTITY_PARAMETER);
        createEAttribute(entityParameterEClass, ENTITY_PARAMETER__ON_GET_OPTIONS);

        primitiveParameterEClass = createEClass(PRIMITIVE_PARAMETER);
        createEReference(primitiveParameterEClass, PRIMITIVE_PARAMETER__PRIMITIVE_TYPE);

        singleEntityParameterEClass = createEClass(SINGLE_ENTITY_PARAMETER);
        createEAttribute(singleEntityParameterEClass, SINGLE_ENTITY_PARAMETER__ON_GET_DEFAULT);

        listEntityParameterEClass = createEClass(LIST_ENTITY_PARAMETER);
        createEAttribute(listEntityParameterEClass, LIST_ENTITY_PARAMETER__ON_GET_DEFAULT);

        deleteOperationEClass = createEClass(DELETE_OPERATION);

        // Create enums
        directionEEnum = createEEnum(DIRECTION);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
        FacadePackage theFacadePackage = (FacadePackage)EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        actionEClass.getESuperTypes().add(this.getFunction());
        queryEClass.getESuperTypes().add(this.getFunction());
        entityParameterEClass.getESuperTypes().add(this.getParameter());
        primitiveParameterEClass.getESuperTypes().add(this.getParameter());
        singleEntityParameterEClass.getESuperTypes().add(this.getEntityParameter());
        listEntityParameterEClass.getESuperTypes().add(this.getEntityParameter());

        // Initialize classes, features, and operations; add parameters
        initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(functionEClass, Function.class, "Function", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFunction_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getFunction_Body(), theTypePackage.getScript(), "body", null, 1, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(queryEClass, Query.class, "Query", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(parameterEClass, Parameter.class, "Parameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getParameter_Direction(), this.getDirection(), "direction", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entityParameterEClass, EntityParameter.class, "EntityParameter", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEntityParameter_OnGetOptions(), theFacadePackage.getEntitySetExpr(), "onGetOptions", null, 0, 1, EntityParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(primitiveParameterEClass, PrimitiveParameter.class, "PrimitiveParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPrimitiveParameter_PrimitiveType(), theTypePackage.getPrimitive(), null, "primitiveType", null, 1, 1, PrimitiveParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(singleEntityParameterEClass, SingleEntityParameter.class, "SingleEntityParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSingleEntityParameter_OnGetDefault(), theFacadePackage.getEntityExpr(), "onGetDefault", null, 0, 1, SingleEntityParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(listEntityParameterEClass, ListEntityParameter.class, "ListEntityParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getListEntityParameter_OnGetDefault(), theFacadePackage.getEntitySetExpr(), "onGetDefault", null, 0, 1, ListEntityParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(deleteOperationEClass, DeleteOperation.class, "DeleteOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(directionEEnum, Direction.class, "Direction");
        addEEnumLiteral(directionEEnum, Direction.IN);
        addEEnumLiteral(directionEEnum, Direction.OUT);

        // Create resource
        createResource(eNS_URI);
    }

} //ActionPackageImpl
