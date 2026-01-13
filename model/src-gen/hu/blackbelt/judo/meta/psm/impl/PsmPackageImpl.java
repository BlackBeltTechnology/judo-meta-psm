/**
 */
package hu.blackbelt.judo.meta.psm.impl;

import hu.blackbelt.judo.meta.psm.PlaceHolder;
import hu.blackbelt.judo.meta.psm.PsmFactory;
import hu.blackbelt.judo.meta.psm.PsmPackage;

import hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage;

import hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl;

import hu.blackbelt.judo.meta.psm.constraint.ConstraintPackage;

import hu.blackbelt.judo.meta.psm.constraint.impl.ConstraintPackageImpl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;

import hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl;

import hu.blackbelt.judo.meta.psm.derived.DerivedPackage;

import hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl;

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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PsmPackageImpl extends EPackageImpl implements PsmPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeHolderEClass = null;

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
	 * @see hu.blackbelt.judo.meta.psm.PsmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PsmPackageImpl()
	{
		super(eNS_URI, PsmFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PsmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PsmPackage init()
	{
		if (isInited) return (PsmPackage)EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPsmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PsmPackageImpl thePsmPackage = registeredPsmPackage instanceof PsmPackageImpl ? (PsmPackageImpl)registeredPsmPackage : new PsmPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AccesspointPackage.eNS_URI);
		AccesspointPackageImpl theAccesspointPackage = (AccesspointPackageImpl)(registeredPackage instanceof AccesspointPackageImpl ? registeredPackage : AccesspointPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MeasurePackage.eNS_URI);
		MeasurePackageImpl theMeasurePackage = (MeasurePackageImpl)(registeredPackage instanceof MeasurePackageImpl ? registeredPackage : MeasurePackage.eINSTANCE);

		// Create package meta-data objects
		thePsmPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theDataPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theDerivedPackage.createPackageContents();
		theServicePackage.createPackageContents();
		theAccesspointPackage.createPackageContents();
		theMeasurePackage.createPackageContents();

		// Initialize created meta-data
		thePsmPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theDerivedPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theAccesspointPackage.initializePackageContents();
		theMeasurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePsmPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PsmPackage.eNS_URI, thePsmPackage);
		return thePsmPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlaceHolder()
	{
		return placeHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PsmFactory getPsmFactory()
	{
		return (PsmFactory)getEFactoryInstance();
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
		placeHolderEClass = createEClass(PLACE_HOLDER);
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
		NamespacePackage theNamespacePackage = (NamespacePackage)EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI);
		TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		ConstraintPackage theConstraintPackage = (ConstraintPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI);
		ScriptPackage theScriptPackage = (ScriptPackage)EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI);
		DerivedPackage theDerivedPackage = (DerivedPackage)EPackage.Registry.INSTANCE.getEPackage(DerivedPackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		AccesspointPackage theAccesspointPackage = (AccesspointPackage)EPackage.Registry.INSTANCE.getEPackage(AccesspointPackage.eNS_URI);
		MeasurePackage theMeasurePackage = (MeasurePackage)EPackage.Registry.INSTANCE.getEPackage(MeasurePackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theNamespacePackage);
		getESubpackages().add(theTypePackage);
		getESubpackages().add(theDataPackage);
		getESubpackages().add(theConstraintPackage);
		getESubpackages().add(theScriptPackage);
		getESubpackages().add(theDerivedPackage);
		getESubpackages().add(theServicePackage);
		getESubpackages().add(theAccesspointPackage);
		getESubpackages().add(theMeasurePackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(placeHolderEClass, PlaceHolder.class, "PlaceHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PsmPackageImpl
