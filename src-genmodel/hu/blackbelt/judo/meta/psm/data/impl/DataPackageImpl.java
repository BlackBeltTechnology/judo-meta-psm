/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.action.ActionPackage;

import hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl;

import hu.blackbelt.judo.meta.psm.behavior.BehaviorPackage;

import hu.blackbelt.judo.meta.psm.behavior.impl.BehaviorPackageImpl;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.Containment;
import hu.blackbelt.judo.meta.psm.data.DataFactory;
import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.Endpoint;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.data.Reference;
import hu.blackbelt.judo.meta.psm.data.ReferenceCountConstraint;

import hu.blackbelt.judo.meta.psm.facade.FacadePackage;

import hu.blackbelt.judo.meta.psm.facade.impl.FacadePackageImpl;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamespacePackageImpl;

import hu.blackbelt.judo.meta.psm.type.TypePackage;

import hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataPackageImpl extends EPackageImpl implements DataPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entityTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass containmentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass endpointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass referenceCountConstraintEClass = null;

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
     * @see hu.blackbelt.judo.meta.psm.data.DataPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private DataPackageImpl() {
        super(eNS_URI, DataFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link DataPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static DataPackage init() {
        if (isInited) return (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

        // Obtain or create and register package
        DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DataPackageImpl());

        isInited = true;

        // Obtain or create and register interdependencies
        NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
        FacadePackageImpl theFacadePackage = (FacadePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI) instanceof FacadePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI) : FacadePackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

        // Create package meta-data objects
        theDataPackage.createPackageContents();
        theNamespacePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theBehaviorPackage.createPackageContents();
        theFacadePackage.createPackageContents();
        theActionPackage.createPackageContents();

        // Initialize created meta-data
        theDataPackage.initializePackageContents();
        theNamespacePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theBehaviorPackage.initializePackageContents();
        theFacadePackage.initializePackageContents();
        theActionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theDataPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(DataPackage.eNS_URI, theDataPackage);
        return theDataPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntityType() {
        return entityTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityType_ReferenceCountConstraints() {
        return (EReference)entityTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityType_SuperEntityTypes() {
        return (EReference)entityTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityType_References() {
        return (EReference)entityTypeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEntityType_Abstract() {
        return (EAttribute)entityTypeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntityType_Attributes() {
        return (EReference)entityTypeEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReference() {
        return referenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getReference_Target() {
        return (EReference)referenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getReference_Cardinality() {
        return (EReference)referenceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttribute() {
        return attributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute_Required() {
        return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttribute_Identifier() {
        return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAttribute_DataType() {
        return (EReference)attributeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContainment() {
        return containmentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEndpoint() {
        return endpointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEndpoint_Partner() {
        return (EReference)endpointEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReferenceCountConstraint() {
        return referenceCountConstraintEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getReferenceCountConstraint_References() {
        return (EReference)referenceCountConstraintEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getReferenceCountConstraint_Cardinality() {
        return (EReference)referenceCountConstraintEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DataFactory getDataFactory() {
        return (DataFactory)getEFactoryInstance();
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
        entityTypeEClass = createEClass(ENTITY_TYPE);
        createEReference(entityTypeEClass, ENTITY_TYPE__REFERENCE_COUNT_CONSTRAINTS);
        createEReference(entityTypeEClass, ENTITY_TYPE__SUPER_ENTITY_TYPES);
        createEReference(entityTypeEClass, ENTITY_TYPE__REFERENCES);
        createEAttribute(entityTypeEClass, ENTITY_TYPE__ABSTRACT);
        createEReference(entityTypeEClass, ENTITY_TYPE__ATTRIBUTES);

        referenceEClass = createEClass(REFERENCE);
        createEReference(referenceEClass, REFERENCE__TARGET);
        createEReference(referenceEClass, REFERENCE__CARDINALITY);

        attributeEClass = createEClass(ATTRIBUTE);
        createEAttribute(attributeEClass, ATTRIBUTE__REQUIRED);
        createEAttribute(attributeEClass, ATTRIBUTE__IDENTIFIER);
        createEReference(attributeEClass, ATTRIBUTE__DATA_TYPE);

        containmentEClass = createEClass(CONTAINMENT);

        endpointEClass = createEClass(ENDPOINT);
        createEReference(endpointEClass, ENDPOINT__PARTNER);

        referenceCountConstraintEClass = createEClass(REFERENCE_COUNT_CONSTRAINT);
        createEReference(referenceCountConstraintEClass, REFERENCE_COUNT_CONSTRAINT__REFERENCES);
        createEReference(referenceCountConstraintEClass, REFERENCE_COUNT_CONSTRAINT__CARDINALITY);
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
        NamespacePackage theNamespacePackage = (NamespacePackage)EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        entityTypeEClass.getESuperTypes().add(theTypePackage.getType());
        referenceEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
        attributeEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
        containmentEClass.getESuperTypes().add(this.getReference());
        endpointEClass.getESuperTypes().add(this.getReference());

        // Initialize classes, features, and operations; add parameters
        initEClass(entityTypeEClass, EntityType.class, "EntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEntityType_ReferenceCountConstraints(), this.getReferenceCountConstraint(), null, "referenceCountConstraints", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityType_SuperEntityTypes(), this.getEntityType(), null, "superEntityTypes", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityType_References(), this.getReference(), null, "references", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEntityType_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 1, 1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEntityType_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(referenceEClass, Reference.class, "Reference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getReference_Target(), this.getEntityType(), null, "target", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getReference_Cardinality(), theTypePackage.getCardinality(), null, "cardinality", null, 1, 1, Reference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAttribute_Required(), ecorePackage.getEBoolean(), "required", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAttribute_Identifier(), ecorePackage.getEBoolean(), "identifier", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAttribute_DataType(), theTypePackage.getDataType(), null, "dataType", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(containmentEClass, Containment.class, "Containment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(endpointEClass, Endpoint.class, "Endpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEndpoint_Partner(), this.getEndpoint(), null, "partner", null, 0, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(referenceCountConstraintEClass, ReferenceCountConstraint.class, "ReferenceCountConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getReferenceCountConstraint_References(), this.getReference(), null, "references", null, 1, -1, ReferenceCountConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getReferenceCountConstraint_Cardinality(), theTypePackage.getCardinality(), null, "cardinality", null, 1, 1, ReferenceCountConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //DataPackageImpl
