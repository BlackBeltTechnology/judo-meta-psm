/**
 */
package hu.blackbelt.judo.meta.psm.accesspoint.impl;

import hu.blackbelt.judo.meta.psm.PsmPackage;

import hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType;
import hu.blackbelt.judo.meta.psm.accesspoint.AccesspointFactory;
import hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage;
import hu.blackbelt.judo.meta.psm.accesspoint.ActorType;
import hu.blackbelt.judo.meta.psm.accesspoint.MappedActorType;

import hu.blackbelt.judo.meta.psm.constraint.ConstraintPackage;

import hu.blackbelt.judo.meta.psm.constraint.impl.ConstraintPackageImpl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;

import hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl;

import hu.blackbelt.judo.meta.psm.derived.DerivedPackage;

import hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl;

import hu.blackbelt.judo.meta.psm.impl.PsmPackageImpl;

import hu.blackbelt.judo.meta.psm.measure.MeasurePackage;

import hu.blackbelt.judo.meta.psm.measure.impl.MeasurePackageImpl;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamespacePackageImpl;

import hu.blackbelt.judo.meta.psm.script.ScriptPackage;

import hu.blackbelt.judo.meta.psm.script.impl.ScriptPackageImpl;

import hu.blackbelt.judo.meta.psm.service.ServicePackage;

import hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl;

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
public class AccesspointPackageImpl extends EPackageImpl implements AccesspointPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractActorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappedActorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorTypeEClass = null;

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
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AccesspointPackageImpl()
	{
		super(eNS_URI, AccesspointFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AccesspointPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AccesspointPackage init()
	{
		if (isInited) return (AccesspointPackage)EPackage.Registry.INSTANCE.getEPackage(AccesspointPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAccesspointPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AccesspointPackageImpl theAccesspointPackage = registeredAccesspointPackage instanceof AccesspointPackageImpl ? (AccesspointPackageImpl)registeredAccesspointPackage : new AccesspointPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI);
		PsmPackageImpl thePsmPackage = (PsmPackageImpl)(registeredPackage instanceof PsmPackageImpl ? registeredPackage : PsmPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI);
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(registeredPackage instanceof NamespacePackageImpl ? registeredPackage : NamespacePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
		TypePackageImpl theTypePackage = (TypePackageImpl)(registeredPackage instanceof TypePackageImpl ? registeredPackage : TypePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		DataPackageImpl theDataPackage = (DataPackageImpl)(registeredPackage instanceof DataPackageImpl ? registeredPackage : DataPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(registeredPackage instanceof ConstraintPackageImpl ? registeredPackage : ConstraintPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI);
		ScriptPackageImpl theScriptPackage = (ScriptPackageImpl)(registeredPackage instanceof ScriptPackageImpl ? registeredPackage : ScriptPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DerivedPackage.eNS_URI);
		DerivedPackageImpl theDerivedPackage = (DerivedPackageImpl)(registeredPackage instanceof DerivedPackageImpl ? registeredPackage : DerivedPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(registeredPackage instanceof ServicePackageImpl ? registeredPackage : ServicePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MeasurePackage.eNS_URI);
		MeasurePackageImpl theMeasurePackage = (MeasurePackageImpl)(registeredPackage instanceof MeasurePackageImpl ? registeredPackage : MeasurePackage.eINSTANCE);

		// Create package meta-data objects
		theAccesspointPackage.createPackageContents();
		thePsmPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theDataPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theDerivedPackage.createPackageContents();
		theServicePackage.createPackageContents();
		theMeasurePackage.createPackageContents();

		// Initialize created meta-data
		theAccesspointPackage.initializePackageContents();
		thePsmPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theDerivedPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theMeasurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAccesspointPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AccesspointPackage.eNS_URI, theAccesspointPackage);
		return theAccesspointPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractActorType()
	{
		return abstractActorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAbstractActorType_TransferObjectType()
	{
		return (EReference)abstractActorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractActorType_Realm()
	{
		return (EAttribute)abstractActorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractActorType_Kind()
	{
		return (EAttribute)abstractActorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMappedActorType()
	{
		return mappedActorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMappedActorType_Managed()
	{
		return (EAttribute)mappedActorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActorType()
	{
		return actorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccesspointFactory getAccesspointFactory()
	{
		return (AccesspointFactory)getEFactoryInstance();
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
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractActorTypeEClass = createEClass(ABSTRACT_ACTOR_TYPE);
		createEReference(abstractActorTypeEClass, ABSTRACT_ACTOR_TYPE__TRANSFER_OBJECT_TYPE);
		createEAttribute(abstractActorTypeEClass, ABSTRACT_ACTOR_TYPE__REALM);
		createEAttribute(abstractActorTypeEClass, ABSTRACT_ACTOR_TYPE__KIND);

		mappedActorTypeEClass = createEClass(MAPPED_ACTOR_TYPE);
		createEAttribute(mappedActorTypeEClass, MAPPED_ACTOR_TYPE__MANAGED);

		actorTypeEClass = createEClass(ACTOR_TYPE);
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
	public void initializePackageContents()
	{
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractActorTypeEClass.getESuperTypes().add(theServicePackage.getTransferObjectType());
		mappedActorTypeEClass.getESuperTypes().add(this.getAbstractActorType());
		mappedActorTypeEClass.getESuperTypes().add(theServicePackage.getMappedTransferObjectType());
		actorTypeEClass.getESuperTypes().add(this.getAbstractActorType());
		actorTypeEClass.getESuperTypes().add(theServicePackage.getUnmappedTransferObjectType());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractActorTypeEClass, AbstractActorType.class, "AbstractActorType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractActorType_TransferObjectType(), theServicePackage.getTransferObjectType(), theServicePackage.getTransferObjectType_ActorType(), "transferObjectType", null, 0, 1, AbstractActorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractActorType_Realm(), ecorePackage.getEString(), "realm", null, 0, 1, AbstractActorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractActorType_Kind(), ecorePackage.getEString(), "kind", null, 0, 1, AbstractActorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappedActorTypeEClass, MappedActorType.class, "MappedActorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMappedActorType_Managed(), ecorePackage.getEBoolean(), "managed", "false", 1, 1, MappedActorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorTypeEClass, ActorType.class, "ActorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
	}

} //AccesspointPackageImpl
