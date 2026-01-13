/**
 */
package hu.blackbelt.judo.meta.psm.measure.impl;

import hu.blackbelt.judo.meta.psm.PsmPackage;

import hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage;

import hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl;

import hu.blackbelt.judo.meta.psm.constraint.ConstraintPackage;

import hu.blackbelt.judo.meta.psm.constraint.impl.ConstraintPackageImpl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;

import hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl;

import hu.blackbelt.judo.meta.psm.derived.DerivedPackage;

import hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl;

import hu.blackbelt.judo.meta.psm.impl.PsmPackageImpl;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.DurationType;
import hu.blackbelt.judo.meta.psm.measure.DurationUnit;
import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm;
import hu.blackbelt.judo.meta.psm.measure.MeasureFactory;
import hu.blackbelt.judo.meta.psm.measure.MeasurePackage;
import hu.blackbelt.judo.meta.psm.measure.MeasuredType;
import hu.blackbelt.judo.meta.psm.measure.Unit;

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
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MeasurePackageImpl extends EPackageImpl implements MeasurePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measuredTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureDefinitionTermEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedMeasureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durationTypeEEnum = null;

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
	 * @see hu.blackbelt.judo.meta.psm.measure.MeasurePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MeasurePackageImpl()
	{
		super(eNS_URI, MeasureFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MeasurePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MeasurePackage init()
	{
		if (isInited) return (MeasurePackage)EPackage.Registry.INSTANCE.getEPackage(MeasurePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMeasurePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MeasurePackageImpl theMeasurePackage = registeredMeasurePackage instanceof MeasurePackageImpl ? (MeasurePackageImpl)registeredMeasurePackage : new MeasurePackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AccesspointPackage.eNS_URI);
		AccesspointPackageImpl theAccesspointPackage = (AccesspointPackageImpl)(registeredPackage instanceof AccesspointPackageImpl ? registeredPackage : AccesspointPackage.eINSTANCE);

		// Create package meta-data objects
		theMeasurePackage.createPackageContents();
		thePsmPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theDataPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theDerivedPackage.createPackageContents();
		theServicePackage.createPackageContents();
		theAccesspointPackage.createPackageContents();

		// Initialize created meta-data
		theMeasurePackage.initializePackageContents();
		thePsmPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theDerivedPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theAccesspointPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMeasurePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MeasurePackage.eNS_URI, theMeasurePackage);
		return theMeasurePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasure()
	{
		return measureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasure_Units()
	{
		return (EReference)measureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasure_Symbol()
	{
		return (EAttribute)measureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasuredType()
	{
		return measuredTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasuredType_StoreUnit()
	{
		return (EReference)measuredTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnit()
	{
		return unitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnit_RateDividend()
	{
		return (EAttribute)unitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnit_RateDivisor()
	{
		return (EAttribute)unitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnit_Symbol()
	{
		return (EAttribute)unitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnit__ToString()
	{
		return unitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getUnit__GetMeasure()
	{
		return unitEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasureDefinitionTerm()
	{
		return measureDefinitionTermEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasureDefinitionTerm_Exponent()
	{
		return (EAttribute)measureDefinitionTermEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasureDefinitionTerm_Unit()
	{
		return (EReference)measureDefinitionTermEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDurationUnit()
	{
		return durationUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDurationUnit_UnitType()
	{
		return (EAttribute)durationUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDerivedMeasure()
	{
		return derivedMeasureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDerivedMeasure_Terms()
	{
		return (EReference)derivedMeasureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDerivedMeasure__GetAllTermMeasures()
	{
		return derivedMeasureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDurationType()
	{
		return durationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MeasureFactory getMeasureFactory()
	{
		return (MeasureFactory)getEFactoryInstance();
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
		measureEClass = createEClass(MEASURE);
		createEReference(measureEClass, MEASURE__UNITS);
		createEAttribute(measureEClass, MEASURE__SYMBOL);

		measuredTypeEClass = createEClass(MEASURED_TYPE);
		createEReference(measuredTypeEClass, MEASURED_TYPE__STORE_UNIT);

		unitEClass = createEClass(UNIT);
		createEAttribute(unitEClass, UNIT__RATE_DIVIDEND);
		createEAttribute(unitEClass, UNIT__RATE_DIVISOR);
		createEAttribute(unitEClass, UNIT__SYMBOL);
		createEOperation(unitEClass, UNIT___TO_STRING);
		createEOperation(unitEClass, UNIT___GET_MEASURE);

		measureDefinitionTermEClass = createEClass(MEASURE_DEFINITION_TERM);
		createEAttribute(measureDefinitionTermEClass, MEASURE_DEFINITION_TERM__EXPONENT);
		createEReference(measureDefinitionTermEClass, MEASURE_DEFINITION_TERM__UNIT);

		durationUnitEClass = createEClass(DURATION_UNIT);
		createEAttribute(durationUnitEClass, DURATION_UNIT__UNIT_TYPE);

		derivedMeasureEClass = createEClass(DERIVED_MEASURE);
		createEReference(derivedMeasureEClass, DERIVED_MEASURE__TERMS);
		createEOperation(derivedMeasureEClass, DERIVED_MEASURE___GET_ALL_TERM_MEASURES);

		// Create enums
		durationTypeEEnum = createEEnum(DURATION_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		measureEClass.getESuperTypes().add(theNamespacePackage.getNamespaceElement());
		measuredTypeEClass.getESuperTypes().add(theTypePackage.getNumericType());
		unitEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
		durationUnitEClass.getESuperTypes().add(this.getUnit());
		derivedMeasureEClass.getESuperTypes().add(this.getMeasure());

		// Initialize classes, features, and operations; add parameters
		initEClass(measureEClass, Measure.class, "Measure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasure_Units(), this.getUnit(), null, "units", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measuredTypeEClass, MeasuredType.class, "MeasuredType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMeasuredType_StoreUnit(), this.getUnit(), null, "storeUnit", null, 1, 1, MeasuredType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unitEClass, Unit.class, "Unit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnit_RateDividend(), ecorePackage.getEDouble(), "rateDividend", "1", 1, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_RateDivisor(), ecorePackage.getEDouble(), "rateDivisor", "1", 1, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnit_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, Unit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUnit__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUnit__GetMeasure(), this.getMeasure(), "getMeasure", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(measureDefinitionTermEClass, MeasureDefinitionTerm.class, "MeasureDefinitionTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasureDefinitionTerm_Exponent(), ecorePackage.getEInt(), "exponent", "1", 1, 1, MeasureDefinitionTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasureDefinitionTerm_Unit(), this.getUnit(), null, "unit", null, 1, 1, MeasureDefinitionTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(durationUnitEClass, DurationUnit.class, "DurationUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDurationUnit_UnitType(), this.getDurationType(), "unitType", null, 1, 1, DurationUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(derivedMeasureEClass, DerivedMeasure.class, "DerivedMeasure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDerivedMeasure_Terms(), this.getMeasureDefinitionTerm(), null, "terms", null, 1, -1, DerivedMeasure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDerivedMeasure__GetAllTermMeasures(), this.getMeasure(), "getAllTermMeasures", 1, -1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(durationTypeEEnum, DurationType.class, "DurationType");
		addEEnumLiteral(durationTypeEEnum, DurationType.NANOSECOND);
		addEEnumLiteral(durationTypeEEnum, DurationType.MICROSECOND);
		addEEnumLiteral(durationTypeEEnum, DurationType.MILLISECOND);
		addEEnumLiteral(durationTypeEEnum, DurationType.SECOND);
		addEEnumLiteral(durationTypeEEnum, DurationType.MINUTE);
		addEEnumLiteral(durationTypeEEnum, DurationType.HOUR);
		addEEnumLiteral(durationTypeEEnum, DurationType.DAY);
		addEEnumLiteral(durationTypeEEnum, DurationType.WEEK);
		addEEnumLiteral(durationTypeEEnum, DurationType.MONTH);
		addEEnumLiteral(durationTypeEEnum, DurationType.YEAR);
	}

} //MeasurePackageImpl
