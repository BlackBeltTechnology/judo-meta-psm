/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage;

import hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl;

import hu.blackbelt.judo.meta.psm.authentication.AuthenticationPackage;

import hu.blackbelt.judo.meta.psm.authentication.impl.AuthenticationPackageImpl;

import hu.blackbelt.judo.meta.psm.authorization.AuthorizationPackage;

import hu.blackbelt.judo.meta.psm.authorization.impl.AuthorizationPackageImpl;

import hu.blackbelt.judo.meta.psm.constraint.ConstraintPackage;

import hu.blackbelt.judo.meta.psm.constraint.impl.ConstraintPackageImpl;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.Containment;
import hu.blackbelt.judo.meta.psm.data.DataFactory;
import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.Endpoint;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement;
import hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement;
import hu.blackbelt.judo.meta.psm.data.Relation;
import hu.blackbelt.judo.meta.psm.data.RelationCountConstraint;

import hu.blackbelt.judo.meta.psm.derived.DerivedPackage;

import hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.ExpressionPackage;

import hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage;

import hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage;

import hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.custom.CustomPackage;

import hu.blackbelt.judo.meta.psm.expression.custom.impl.CustomPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationPackage;

import hu.blackbelt.judo.meta.psm.expression.enumeration.impl.EnumerationPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.impl.ExpressionPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage;

import hu.blackbelt.judo.meta.psm.expression.logical.impl.LogicalPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.numeric.NumericPackage;

import hu.blackbelt.judo.meta.psm.expression.numeric.impl.NumericPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage;

import hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.operator.OperatorPackage;

import hu.blackbelt.judo.meta.psm.expression.operator.impl.OperatorPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.string.StringPackage;

import hu.blackbelt.judo.meta.psm.expression.string.impl.StringPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.temporal.TemporalPackage;

import hu.blackbelt.judo.meta.psm.expression.temporal.impl.TemporalPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.variable.VariablePackage;

import hu.blackbelt.judo.meta.psm.expression.variable.impl.VariablePackageImpl;

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

import hu.blackbelt.judo.meta.psm.view.ViewPackage;

import hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl;

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
	private EClass relationEClass = null;

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
	private EClass endpointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationCountConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containmentEClass = null;

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
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		ScriptPackageImpl theScriptPackage = (ScriptPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) instanceof ScriptPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) : ScriptPackage.eINSTANCE);
		DerivedPackageImpl theDerivedPackage = (DerivedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DerivedPackage.eNS_URI) instanceof DerivedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DerivedPackage.eNS_URI) : DerivedPackage.eINSTANCE);
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) instanceof ServicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI) : ServicePackage.eINSTANCE);
		AccesspointPackageImpl theAccesspointPackage = (AccesspointPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AccesspointPackage.eNS_URI) instanceof AccesspointPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AccesspointPackage.eNS_URI) : AccesspointPackage.eINSTANCE);
		ViewPackageImpl theViewPackage = (ViewPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) instanceof ViewPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ViewPackage.eNS_URI) : ViewPackage.eINSTANCE);
		AuthenticationPackageImpl theAuthenticationPackage = (AuthenticationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuthenticationPackage.eNS_URI) instanceof AuthenticationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuthenticationPackage.eNS_URI) : AuthenticationPackage.eINSTANCE);
		AuthorizationPackageImpl theAuthorizationPackage = (AuthorizationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AuthorizationPackage.eNS_URI) instanceof AuthorizationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AuthorizationPackage.eNS_URI) : AuthorizationPackage.eINSTANCE);
		MeasurePackageImpl theMeasurePackage = (MeasurePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MeasurePackage.eNS_URI) instanceof MeasurePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MeasurePackage.eNS_URI) : MeasurePackage.eINSTANCE);
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI) : ExpressionPackage.eINSTANCE);
		ConstantPackageImpl theConstantPackage = (ConstantPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstantPackage.eNS_URI) instanceof ConstantPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstantPackage.eNS_URI) : ConstantPackage.eINSTANCE);
		VariablePackageImpl theVariablePackage = (VariablePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) instanceof VariablePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI) : VariablePackage.eINSTANCE);
		OperatorPackageImpl theOperatorPackage = (OperatorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OperatorPackage.eNS_URI) instanceof OperatorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OperatorPackage.eNS_URI) : OperatorPackage.eINSTANCE);
		NumericPackageImpl theNumericPackage = (NumericPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NumericPackage.eNS_URI) instanceof NumericPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NumericPackage.eNS_URI) : NumericPackage.eINSTANCE);
		LogicalPackageImpl theLogicalPackage = (LogicalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LogicalPackage.eNS_URI) instanceof LogicalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LogicalPackage.eNS_URI) : LogicalPackage.eINSTANCE);
		StringPackageImpl theStringPackage = (StringPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StringPackage.eNS_URI) instanceof StringPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StringPackage.eNS_URI) : StringPackage.eINSTANCE);
		EnumerationPackageImpl theEnumerationPackage = (EnumerationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EnumerationPackage.eNS_URI) instanceof EnumerationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EnumerationPackage.eNS_URI) : EnumerationPackage.eINSTANCE);
		ObjectPackageImpl theObjectPackage = (ObjectPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ObjectPackage.eNS_URI) instanceof ObjectPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ObjectPackage.eNS_URI) : ObjectPackage.eINSTANCE);
		CollectionPackageImpl theCollectionPackage = (CollectionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI) instanceof CollectionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI) : CollectionPackage.eINSTANCE);
		CustomPackageImpl theCustomPackage = (CustomPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomPackage.eNS_URI) instanceof CustomPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomPackage.eNS_URI) : CustomPackage.eINSTANCE);
		TemporalPackageImpl theTemporalPackage = (TemporalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) instanceof TemporalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) : TemporalPackage.eINSTANCE);

		// Create package meta-data objects
		theDataPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theDerivedPackage.createPackageContents();
		theServicePackage.createPackageContents();
		theAccesspointPackage.createPackageContents();
		theViewPackage.createPackageContents();
		theAuthenticationPackage.createPackageContents();
		theAuthorizationPackage.createPackageContents();
		theMeasurePackage.createPackageContents();
		theExpressionPackage.createPackageContents();
		theConstantPackage.createPackageContents();
		theVariablePackage.createPackageContents();
		theOperatorPackage.createPackageContents();
		theNumericPackage.createPackageContents();
		theLogicalPackage.createPackageContents();
		theStringPackage.createPackageContents();
		theEnumerationPackage.createPackageContents();
		theObjectPackage.createPackageContents();
		theCollectionPackage.createPackageContents();
		theCustomPackage.createPackageContents();
		theTemporalPackage.createPackageContents();

		// Initialize created meta-data
		theDataPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theDerivedPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theAccesspointPackage.initializePackageContents();
		theViewPackage.initializePackageContents();
		theAuthenticationPackage.initializePackageContents();
		theAuthorizationPackage.initializePackageContents();
		theMeasurePackage.initializePackageContents();
		theExpressionPackage.initializePackageContents();
		theConstantPackage.initializePackageContents();
		theVariablePackage.initializePackageContents();
		theOperatorPackage.initializePackageContents();
		theNumericPackage.initializePackageContents();
		theLogicalPackage.initializePackageContents();
		theStringPackage.initializePackageContents();
		theEnumerationPackage.initializePackageContents();
		theObjectPackage.initializePackageContents();
		theCollectionPackage.initializePackageContents();
		theCustomPackage.initializePackageContents();
		theTemporalPackage.initializePackageContents();

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
	public EReference getEntityType_SuperEntityTypes() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntityType_Abstract() {
		return (EAttribute)entityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_Attributes() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_Relations() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_RelationCountConstraints() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_DataProperties() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_NavigationProperties() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_Operations() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntityType_ElementName() {
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRelation_CascadeDelete() {
		return (EAttribute)relationEClass.getEStructuralFeatures().get(0);
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
	public EClass getRelationCountConstraint() {
		return relationCountConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationCountConstraint_Relations() {
		return (EReference)relationCountConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationCountConstraint_Cardinality() {
		return (EReference)relationCountConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceTypedElement() {
		return referenceTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceTypedElement_Target() {
		return (EReference)referenceTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceTypedElement_Cardinality() {
		return (EReference)referenceTypedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveTypedElement() {
		return primitiveTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrimitiveTypedElement_DataType() {
		return (EReference)primitiveTypedElementEClass.getEStructuralFeatures().get(0);
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
		createEReference(entityTypeEClass, ENTITY_TYPE__SUPER_ENTITY_TYPES);
		createEAttribute(entityTypeEClass, ENTITY_TYPE__ABSTRACT);
		createEReference(entityTypeEClass, ENTITY_TYPE__ATTRIBUTES);
		createEReference(entityTypeEClass, ENTITY_TYPE__RELATIONS);
		createEReference(entityTypeEClass, ENTITY_TYPE__RELATION_COUNT_CONSTRAINTS);
		createEReference(entityTypeEClass, ENTITY_TYPE__DATA_PROPERTIES);
		createEReference(entityTypeEClass, ENTITY_TYPE__NAVIGATION_PROPERTIES);
		createEReference(entityTypeEClass, ENTITY_TYPE__OPERATIONS);
		createEReference(entityTypeEClass, ENTITY_TYPE__ELEMENT_NAME);

		relationEClass = createEClass(RELATION);
		createEAttribute(relationEClass, RELATION__CASCADE_DELETE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__REQUIRED);
		createEAttribute(attributeEClass, ATTRIBUTE__IDENTIFIER);

		endpointEClass = createEClass(ENDPOINT);
		createEReference(endpointEClass, ENDPOINT__PARTNER);

		relationCountConstraintEClass = createEClass(RELATION_COUNT_CONSTRAINT);
		createEReference(relationCountConstraintEClass, RELATION_COUNT_CONSTRAINT__RELATIONS);
		createEReference(relationCountConstraintEClass, RELATION_COUNT_CONSTRAINT__CARDINALITY);

		referenceTypedElementEClass = createEClass(REFERENCE_TYPED_ELEMENT);
		createEReference(referenceTypedElementEClass, REFERENCE_TYPED_ELEMENT__TARGET);
		createEReference(referenceTypedElementEClass, REFERENCE_TYPED_ELEMENT__CARDINALITY);

		primitiveTypedElementEClass = createEClass(PRIMITIVE_TYPED_ELEMENT);
		createEReference(primitiveTypedElementEClass, PRIMITIVE_TYPED_ELEMENT__DATA_TYPE);

		containmentEClass = createEClass(CONTAINMENT);
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
		DerivedPackage theDerivedPackage = (DerivedPackage)EPackage.Registry.INSTANCE.getEPackage(DerivedPackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
		NamespacePackage theNamespacePackage = (NamespacePackage)EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityTypeEClass.getESuperTypes().add(theTypePackage.getType());
		relationEClass.getESuperTypes().add(this.getReferenceTypedElement());
		attributeEClass.getESuperTypes().add(this.getPrimitiveTypedElement());
		endpointEClass.getESuperTypes().add(this.getRelation());
		relationCountConstraintEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
		referenceTypedElementEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
		primitiveTypedElementEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
		containmentEClass.getESuperTypes().add(this.getRelation());

		// Initialize classes, features, and operations; add parameters
		initEClass(entityTypeEClass, EntityType.class, "EntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityType_SuperEntityTypes(), this.getEntityType(), null, "superEntityTypes", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityType_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 1, 1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_Relations(), this.getRelation(), null, "relations", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_RelationCountConstraints(), this.getRelationCountConstraint(), null, "relationCountConstraints", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_DataProperties(), theDerivedPackage.getDataProperty(), null, "dataProperties", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_NavigationProperties(), theDerivedPackage.getNavigationProperty(), null, "navigationProperties", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_Operations(), theServicePackage.getBoundOperation(), null, "operations", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_ElementName(), theExpressionPackage.getElementName(), null, "elementName", null, 0, 1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRelation_CascadeDelete(), ecorePackage.getEBoolean(), "cascadeDelete", "false", 1, 1, Relation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Required(), ecorePackage.getEBoolean(), "required", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_Identifier(), ecorePackage.getEBoolean(), "identifier", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(endpointEClass, Endpoint.class, "Endpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEndpoint_Partner(), this.getEndpoint(), null, "partner", null, 0, 1, Endpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationCountConstraintEClass, RelationCountConstraint.class, "RelationCountConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationCountConstraint_Relations(), this.getRelation(), null, "relations", null, 2, -1, RelationCountConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRelationCountConstraint_Cardinality(), theTypePackage.getCardinality(), null, "cardinality", null, 1, 1, RelationCountConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceTypedElementEClass, ReferenceTypedElement.class, "ReferenceTypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceTypedElement_Target(), this.getEntityType(), null, "target", null, 1, 1, ReferenceTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceTypedElement_Cardinality(), theTypePackage.getCardinality(), null, "cardinality", null, 1, 1, ReferenceTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypedElementEClass, PrimitiveTypedElement.class, "PrimitiveTypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveTypedElement_DataType(), theTypePackage.getPrimitive(), null, "dataType", null, 1, 1, PrimitiveTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containmentEClass, Containment.class, "Containment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DataPackageImpl
