/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.behavior.BehaviorPackage;

import hu.blackbelt.judo.meta.psm.behavior.impl.BehaviorPackageImpl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;

import hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl;

import hu.blackbelt.judo.meta.psm.facade.Action;
import hu.blackbelt.judo.meta.psm.facade.Facade;
import hu.blackbelt.judo.meta.psm.facade.FacadeFactory;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.facade.Function;
import hu.blackbelt.judo.meta.psm.facade.Link;
import hu.blackbelt.judo.meta.psm.facade.OrderDirection;
import hu.blackbelt.judo.meta.psm.facade.Property;
import hu.blackbelt.judo.meta.psm.facade.View;

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
public class FacadePackageImpl extends EPackageImpl implements FacadePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass facadeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass linkEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass viewEClass = null;

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
    private EEnum functionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum orderDirectionEEnum = null;

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
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private FacadePackageImpl() {
        super(eNS_URI, FacadeFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link FacadePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static FacadePackage init() {
        if (isInited) return (FacadePackage)EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI);

        // Obtain or create and register package
        FacadePackageImpl theFacadePackage = (FacadePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FacadePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FacadePackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
        BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);

        // Create package meta-data objects
        theFacadePackage.createPackageContents();
        theNamespacePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theDataPackage.createPackageContents();
        theBehaviorPackage.createPackageContents();

        // Initialize created meta-data
        theFacadePackage.initializePackageContents();
        theNamespacePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theDataPackage.initializePackageContents();
        theBehaviorPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theFacadePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(FacadePackage.eNS_URI, theFacadePackage);
        return theFacadePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFacade() {
        return facadeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFacade_Properties() {
        return (EReference)facadeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFacade_Links() {
        return (EReference)facadeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFacade_EntityType() {
        return (EReference)facadeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProperty() {
        return propertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_Path() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_Function() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_OrderIndex() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_OrderDirection() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_Filterable() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProperty_Viewable() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProperty_Type() {
        return (EReference)propertyEClass.getEStructuralFeatures().get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLink() {
        return linkEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getLink_Target() {
        return (EReference)linkEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLink_Path() {
        return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLink_Expand() {
        return (EAttribute)linkEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getView() {
        return viewEClass;
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
    public EReference getAction_Result() {
        return (EReference)actionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAction_Body() {
        return (EAttribute)actionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAction_List() {
        return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAction_External() {
        return (EAttribute)actionEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getFunction() {
        return functionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getOrderDirection() {
        return orderDirectionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FacadeFactory getFacadeFactory() {
        return (FacadeFactory)getEFactoryInstance();
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
        facadeEClass = createEClass(FACADE);
        createEReference(facadeEClass, FACADE__PROPERTIES);
        createEReference(facadeEClass, FACADE__LINKS);
        createEReference(facadeEClass, FACADE__ENTITY_TYPE);

        propertyEClass = createEClass(PROPERTY);
        createEAttribute(propertyEClass, PROPERTY__PATH);
        createEAttribute(propertyEClass, PROPERTY__FUNCTION);
        createEAttribute(propertyEClass, PROPERTY__ORDER_INDEX);
        createEAttribute(propertyEClass, PROPERTY__ORDER_DIRECTION);
        createEAttribute(propertyEClass, PROPERTY__FILTERABLE);
        createEAttribute(propertyEClass, PROPERTY__VIEWABLE);
        createEReference(propertyEClass, PROPERTY__TYPE);

        linkEClass = createEClass(LINK);
        createEReference(linkEClass, LINK__TARGET);
        createEAttribute(linkEClass, LINK__PATH);
        createEAttribute(linkEClass, LINK__EXPAND);

        viewEClass = createEClass(VIEW);

        actionEClass = createEClass(ACTION);
        createEReference(actionEClass, ACTION__RESULT);
        createEAttribute(actionEClass, ACTION__BODY);
        createEAttribute(actionEClass, ACTION__LIST);
        createEAttribute(actionEClass, ACTION__EXTERNAL);

        // Create enums
        functionEEnum = createEEnum(FUNCTION);
        orderDirectionEEnum = createEEnum(ORDER_DIRECTION);
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
        NamespacePackage theNamespacePackage = (NamespacePackage)EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI);
        DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        facadeEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
        propertyEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
        linkEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
        viewEClass.getESuperTypes().add(this.getFacade());
        actionEClass.getESuperTypes().add(this.getFacade());

        // Initialize classes, features, and operations; add parameters
        initEClass(facadeEClass, Facade.class, "Facade", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFacade_Properties(), this.getProperty(), null, "properties", null, 0, -1, Facade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFacade_Links(), this.getLink(), null, "links", null, 0, -1, Facade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFacade_EntityType(), theDataPackage.getEntityType(), null, "entityType", null, 0, 1, Facade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProperty_Path(), theTypePackage.getNavigationExpression(), "path", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_Function(), this.getFunction(), "function", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_OrderIndex(), ecorePackage.getEInt(), "orderIndex", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_OrderDirection(), this.getOrderDirection(), "orderDirection", "ASC", 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_Filterable(), ecorePackage.getEBoolean(), "filterable", "true", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_Viewable(), ecorePackage.getEBoolean(), "viewable", "true", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProperty_Type(), theTypePackage.getType(), null, "type", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getLink_Target(), this.getView(), null, "target", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLink_Path(), theTypePackage.getNavigationExpression(), "path", null, 1, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getLink_Expand(), ecorePackage.getEBoolean(), "expand", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(viewEClass, View.class, "View", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAction_Result(), this.getView(), null, "result", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAction_Body(), theTypePackage.getScript(), "body", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAction_List(), ecorePackage.getEBoolean(), "list", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAction_External(), ecorePackage.getEBoolean(), "external", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(functionEEnum, Function.class, "Function");
        addEEnumLiteral(functionEEnum, Function.VALUE);
        addEEnumLiteral(functionEEnum, Function.AVG);
        addEEnumLiteral(functionEEnum, Function.COUNT);
        addEEnumLiteral(functionEEnum, Function.MIN);
        addEEnumLiteral(functionEEnum, Function.MAX);
        addEEnumLiteral(functionEEnum, Function.SUM);

        initEEnum(orderDirectionEEnum, OrderDirection.class, "OrderDirection");
        addEEnumLiteral(orderDirectionEEnum, OrderDirection.ASC);
        addEEnumLiteral(orderDirectionEEnum, OrderDirection.DESC);

        // Create resource
        createResource(eNS_URI);
    }

} //FacadePackageImpl
