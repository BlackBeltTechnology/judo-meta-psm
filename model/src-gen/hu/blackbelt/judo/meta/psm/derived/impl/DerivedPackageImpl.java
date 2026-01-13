/**
 */
package hu.blackbelt.judo.meta.psm.derived.impl;

import hu.blackbelt.judo.meta.psm.PsmPackage;

import hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage;

import hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl;

import hu.blackbelt.judo.meta.psm.constraint.ConstraintPackage;

import hu.blackbelt.judo.meta.psm.constraint.impl.ConstraintPackageImpl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;

import hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl;

import hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType;
import hu.blackbelt.judo.meta.psm.derived.DataExpressionType;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.DerivedFactory;
import hu.blackbelt.judo.meta.psm.derived.DerivedPackage;
import hu.blackbelt.judo.meta.psm.derived.ExpressionDialect;
import hu.blackbelt.judo.meta.psm.derived.ExpressionType;
import hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor;
import hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor;
import hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType;
import hu.blackbelt.judo.meta.psm.derived.ReferenceSelectorType;
import hu.blackbelt.judo.meta.psm.derived.StaticData;
import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;

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
public class DerivedPackageImpl extends EPackageImpl implements DerivedPackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticNavigationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveAccessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceAccessorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceExpressionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceSelectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataExpressionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeSelectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalExpressionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum expressionDialectEEnum = null;

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
	 * @see hu.blackbelt.judo.meta.psm.derived.DerivedPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DerivedPackageImpl()
	{
		super(eNS_URI, DerivedFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DerivedPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DerivedPackage init()
	{
		if (isInited) return (DerivedPackage)EPackage.Registry.INSTANCE.getEPackage(DerivedPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDerivedPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DerivedPackageImpl theDerivedPackage = registeredDerivedPackage instanceof DerivedPackageImpl ? (DerivedPackageImpl)registeredDerivedPackage : new DerivedPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(registeredPackage instanceof ServicePackageImpl ? registeredPackage : ServicePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AccesspointPackage.eNS_URI);
		AccesspointPackageImpl theAccesspointPackage = (AccesspointPackageImpl)(registeredPackage instanceof AccesspointPackageImpl ? registeredPackage : AccesspointPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MeasurePackage.eNS_URI);
		MeasurePackageImpl theMeasurePackage = (MeasurePackageImpl)(registeredPackage instanceof MeasurePackageImpl ? registeredPackage : MeasurePackage.eINSTANCE);

		// Create package meta-data objects
		theDerivedPackage.createPackageContents();
		thePsmPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theDataPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theServicePackage.createPackageContents();
		theAccesspointPackage.createPackageContents();
		theMeasurePackage.createPackageContents();

		// Initialize created meta-data
		theDerivedPackage.initializePackageContents();
		thePsmPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theAccesspointPackage.initializePackageContents();
		theMeasurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDerivedPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DerivedPackage.eNS_URI, theDerivedPackage);
		return theDerivedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataProperty()
	{
		return dataPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataProperty__IsPrimitive()
	{
		return dataPropertyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDataProperty__GetEntityType()
	{
		return dataPropertyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNavigationProperty()
	{
		return navigationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNavigationProperty__GetEntityType()
	{
		return navigationPropertyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaticNavigation()
	{
		return staticNavigationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveAccessor()
	{
		return primitiveAccessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveAccessor_GetterExpression()
	{
		return (EReference)primitiveAccessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveAccessor_SetterExpression()
	{
		return (EReference)primitiveAccessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStaticData()
	{
		return staticDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceAccessor()
	{
		return referenceAccessorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceAccessor_GetterExpression()
	{
		return (EReference)referenceAccessorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceAccessor_SetterExpression()
	{
		return (EReference)referenceAccessorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionType()
	{
		return expressionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionType_Expression()
	{
		return (EAttribute)expressionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionType_Dialect()
	{
		return (EAttribute)expressionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpressionType_ParameterType()
	{
		return (EReference)expressionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceExpressionType()
	{
		return referenceExpressionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceSelectorType()
	{
		return referenceSelectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataExpressionType()
	{
		return dataExpressionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttributeSelectorType()
	{
		return attributeSelectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLogicalExpressionType()
	{
		return logicalExpressionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExpressionDialect()
	{
		return expressionDialectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedFactory getDerivedFactory()
	{
		return (DerivedFactory)getEFactoryInstance();
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
		dataPropertyEClass = createEClass(DATA_PROPERTY);
		createEOperation(dataPropertyEClass, DATA_PROPERTY___IS_PRIMITIVE);
		createEOperation(dataPropertyEClass, DATA_PROPERTY___GET_ENTITY_TYPE);

		navigationPropertyEClass = createEClass(NAVIGATION_PROPERTY);
		createEOperation(navigationPropertyEClass, NAVIGATION_PROPERTY___GET_ENTITY_TYPE);

		staticNavigationEClass = createEClass(STATIC_NAVIGATION);

		primitiveAccessorEClass = createEClass(PRIMITIVE_ACCESSOR);
		createEReference(primitiveAccessorEClass, PRIMITIVE_ACCESSOR__GETTER_EXPRESSION);
		createEReference(primitiveAccessorEClass, PRIMITIVE_ACCESSOR__SETTER_EXPRESSION);

		staticDataEClass = createEClass(STATIC_DATA);

		referenceAccessorEClass = createEClass(REFERENCE_ACCESSOR);
		createEReference(referenceAccessorEClass, REFERENCE_ACCESSOR__GETTER_EXPRESSION);
		createEReference(referenceAccessorEClass, REFERENCE_ACCESSOR__SETTER_EXPRESSION);

		expressionTypeEClass = createEClass(EXPRESSION_TYPE);
		createEAttribute(expressionTypeEClass, EXPRESSION_TYPE__EXPRESSION);
		createEAttribute(expressionTypeEClass, EXPRESSION_TYPE__DIALECT);
		createEReference(expressionTypeEClass, EXPRESSION_TYPE__PARAMETER_TYPE);

		referenceExpressionTypeEClass = createEClass(REFERENCE_EXPRESSION_TYPE);

		referenceSelectorTypeEClass = createEClass(REFERENCE_SELECTOR_TYPE);

		dataExpressionTypeEClass = createEClass(DATA_EXPRESSION_TYPE);

		attributeSelectorTypeEClass = createEClass(ATTRIBUTE_SELECTOR_TYPE);

		logicalExpressionTypeEClass = createEClass(LOGICAL_EXPRESSION_TYPE);

		// Create enums
		expressionDialectEEnum = createEEnum(EXPRESSION_DIALECT);
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
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		NamespacePackage theNamespacePackage = (NamespacePackage)EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataPropertyEClass.getESuperTypes().add(this.getPrimitiveAccessor());
		navigationPropertyEClass.getESuperTypes().add(this.getReferenceAccessor());
		staticNavigationEClass.getESuperTypes().add(this.getReferenceAccessor());
		staticNavigationEClass.getESuperTypes().add(theNamespacePackage.getNamespaceElement());
		primitiveAccessorEClass.getESuperTypes().add(theDataPackage.getPrimitiveTypedElement());
		staticDataEClass.getESuperTypes().add(this.getPrimitiveAccessor());
		staticDataEClass.getESuperTypes().add(theNamespacePackage.getNamespaceElement());
		referenceAccessorEClass.getESuperTypes().add(theDataPackage.getReferenceTypedElement());
		referenceExpressionTypeEClass.getESuperTypes().add(this.getExpressionType());
		referenceSelectorTypeEClass.getESuperTypes().add(this.getReferenceExpressionType());
		dataExpressionTypeEClass.getESuperTypes().add(this.getExpressionType());
		attributeSelectorTypeEClass.getESuperTypes().add(this.getDataExpressionType());
		logicalExpressionTypeEClass.getESuperTypes().add(this.getDataExpressionType());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataPropertyEClass, DataProperty.class, "DataProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDataProperty__IsPrimitive(), ecorePackage.getEBoolean(), "isPrimitive", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDataProperty__GetEntityType(), theDataPackage.getEntityType(), "getEntityType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(navigationPropertyEClass, NavigationProperty.class, "NavigationProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getNavigationProperty__GetEntityType(), theDataPackage.getEntityType(), "getEntityType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(staticNavigationEClass, StaticNavigation.class, "StaticNavigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(primitiveAccessorEClass, PrimitiveAccessor.class, "PrimitiveAccessor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveAccessor_GetterExpression(), this.getDataExpressionType(), null, "getterExpression", null, 1, 1, PrimitiveAccessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrimitiveAccessor_SetterExpression(), this.getAttributeSelectorType(), null, "setterExpression", null, 0, 1, PrimitiveAccessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticDataEClass, StaticData.class, "StaticData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceAccessorEClass, ReferenceAccessor.class, "ReferenceAccessor", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceAccessor_GetterExpression(), this.getReferenceExpressionType(), null, "getterExpression", null, 1, 1, ReferenceAccessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceAccessor_SetterExpression(), this.getReferenceSelectorType(), null, "setterExpression", null, 0, 1, ReferenceAccessor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionTypeEClass, ExpressionType.class, "ExpressionType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpressionType_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, ExpressionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpressionType_Dialect(), this.getExpressionDialect(), "dialect", null, 1, 1, ExpressionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpressionType_ParameterType(), theServicePackage.getTransferObjectType(), null, "parameterType", null, 0, 1, ExpressionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceExpressionTypeEClass, ReferenceExpressionType.class, "ReferenceExpressionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceSelectorTypeEClass, ReferenceSelectorType.class, "ReferenceSelectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataExpressionTypeEClass, DataExpressionType.class, "DataExpressionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeSelectorTypeEClass, AttributeSelectorType.class, "AttributeSelectorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalExpressionTypeEClass, LogicalExpressionType.class, "LogicalExpressionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(expressionDialectEEnum, ExpressionDialect.class, "ExpressionDialect");
		addEEnumLiteral(expressionDialectEEnum, ExpressionDialect.JQL);
		addEEnumLiteral(expressionDialectEEnum, ExpressionDialect.XML);
	}

} //DerivedPackageImpl
