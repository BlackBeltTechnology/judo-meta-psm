/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection.impl;

import hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage;

import hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl;

import hu.blackbelt.judo.meta.psm.authentication.AuthenticationPackage;

import hu.blackbelt.judo.meta.psm.authentication.impl.AuthenticationPackageImpl;

import hu.blackbelt.judo.meta.psm.authorization.AuthorizationPackage;

import hu.blackbelt.judo.meta.psm.authorization.impl.AuthorizationPackageImpl;

import hu.blackbelt.judo.meta.psm.constraint.ConstraintPackage;

import hu.blackbelt.judo.meta.psm.constraint.impl.ConstraintPackageImpl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;

import hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl;

import hu.blackbelt.judo.meta.psm.derived.DerivedPackage;

import hu.blackbelt.judo.meta.psm.derived.impl.DerivedPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.ExpressionPackage;

import hu.blackbelt.judo.meta.psm.expression.collection.CastCollection;
import hu.blackbelt.judo.meta.psm.expression.collection.CollectionFactory;
import hu.blackbelt.judo.meta.psm.expression.collection.CollectionFilterExpression;
import hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromCollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromObjectExpression;
import hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage;
import hu.blackbelt.judo.meta.psm.expression.collection.CollectionSwitchExpression;
import hu.blackbelt.judo.meta.psm.expression.collection.CollectionVariableReference;
import hu.blackbelt.judo.meta.psm.expression.collection.ImmutableCollection;
import hu.blackbelt.judo.meta.psm.expression.collection.ObjectNavigationFromCollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.collection.OrderByItem;
import hu.blackbelt.judo.meta.psm.expression.collection.SortExpression;
import hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression;

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
public class CollectionPackageImpl extends EPackageImpl implements CollectionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immutableCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionFilterExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionVariableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionNavigationFromObjectExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionNavigationFromCollectionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subCollectionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderByItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectNavigationFromCollectionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass castCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionSwitchExpressionEClass = null;

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
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CollectionPackageImpl() {
		super(eNS_URI, CollectionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CollectionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CollectionPackage init() {
		if (isInited) return (CollectionPackage)EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI);

		// Obtain or create and register package
		CollectionPackageImpl theCollectionPackage = (CollectionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CollectionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CollectionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
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
		CustomPackageImpl theCustomPackage = (CustomPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomPackage.eNS_URI) instanceof CustomPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomPackage.eNS_URI) : CustomPackage.eINSTANCE);
		TemporalPackageImpl theTemporalPackage = (TemporalPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) instanceof TemporalPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI) : TemporalPackage.eINSTANCE);

		// Create package meta-data objects
		theCollectionPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theDataPackage.createPackageContents();
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
		theCustomPackage.createPackageContents();
		theTemporalPackage.createPackageContents();

		// Initialize created meta-data
		theCollectionPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theDataPackage.initializePackageContents();
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
		theCustomPackage.initializePackageContents();
		theTemporalPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCollectionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CollectionPackage.eNS_URI, theCollectionPackage);
		return theCollectionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImmutableCollection() {
		return immutableCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImmutableCollection_ElementName() {
		return (EReference)immutableCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionFilterExpression() {
		return collectionFilterExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionFilterExpression_CollectionExpression() {
		return (EReference)collectionFilterExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionFilterExpression_Condition() {
		return (EReference)collectionFilterExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionVariableReference() {
		return collectionVariableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionVariableReference_Variable() {
		return (EReference)collectionVariableReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionNavigationFromObjectExpression() {
		return collectionNavigationFromObjectExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionNavigationFromObjectExpression_ObjectExpression() {
		return (EReference)collectionNavigationFromObjectExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionNavigationFromCollectionExpression() {
		return collectionNavigationFromCollectionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionNavigationFromCollectionExpression_CollectionExpression() {
		return (EReference)collectionNavigationFromCollectionExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortExpression() {
		return sortExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortExpression_CollectionExpression() {
		return (EReference)sortExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortExpression_OrderBy() {
		return (EReference)sortExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubCollectionExpression() {
		return subCollectionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubCollectionExpression_CollectionExpression() {
		return (EReference)subCollectionExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubCollectionExpression_Position() {
		return (EReference)subCollectionExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubCollectionExpression_Length() {
		return (EReference)subCollectionExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderByItem() {
		return orderByItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOrderByItem_Expression() {
		return (EReference)orderByItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderByItem_Descending() {
		return (EAttribute)orderByItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectNavigationFromCollectionExpression() {
		return objectNavigationFromCollectionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectNavigationFromCollectionExpression_CollectionExpression() {
		return (EReference)objectNavigationFromCollectionExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCastCollection() {
		return castCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCastCollection_ElementName() {
		return (EReference)castCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCastCollection_CollectionExpression() {
		return (EReference)castCollectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionSwitchExpression() {
		return collectionSwitchExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionSwitchExpression_ElementName() {
		return (EReference)collectionSwitchExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionFactory getCollectionFactory() {
		return (CollectionFactory)getEFactoryInstance();
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
		immutableCollectionEClass = createEClass(IMMUTABLE_COLLECTION);
		createEReference(immutableCollectionEClass, IMMUTABLE_COLLECTION__ELEMENT_NAME);

		collectionFilterExpressionEClass = createEClass(COLLECTION_FILTER_EXPRESSION);
		createEReference(collectionFilterExpressionEClass, COLLECTION_FILTER_EXPRESSION__COLLECTION_EXPRESSION);
		createEReference(collectionFilterExpressionEClass, COLLECTION_FILTER_EXPRESSION__CONDITION);

		collectionVariableReferenceEClass = createEClass(COLLECTION_VARIABLE_REFERENCE);
		createEReference(collectionVariableReferenceEClass, COLLECTION_VARIABLE_REFERENCE__VARIABLE);

		collectionNavigationFromObjectExpressionEClass = createEClass(COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION);
		createEReference(collectionNavigationFromObjectExpressionEClass, COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION__OBJECT_EXPRESSION);

		collectionNavigationFromCollectionExpressionEClass = createEClass(COLLECTION_NAVIGATION_FROM_COLLECTION_EXPRESSION);
		createEReference(collectionNavigationFromCollectionExpressionEClass, COLLECTION_NAVIGATION_FROM_COLLECTION_EXPRESSION__COLLECTION_EXPRESSION);

		sortExpressionEClass = createEClass(SORT_EXPRESSION);
		createEReference(sortExpressionEClass, SORT_EXPRESSION__COLLECTION_EXPRESSION);
		createEReference(sortExpressionEClass, SORT_EXPRESSION__ORDER_BY);

		subCollectionExpressionEClass = createEClass(SUB_COLLECTION_EXPRESSION);
		createEReference(subCollectionExpressionEClass, SUB_COLLECTION_EXPRESSION__COLLECTION_EXPRESSION);
		createEReference(subCollectionExpressionEClass, SUB_COLLECTION_EXPRESSION__POSITION);
		createEReference(subCollectionExpressionEClass, SUB_COLLECTION_EXPRESSION__LENGTH);

		orderByItemEClass = createEClass(ORDER_BY_ITEM);
		createEReference(orderByItemEClass, ORDER_BY_ITEM__EXPRESSION);
		createEAttribute(orderByItemEClass, ORDER_BY_ITEM__DESCENDING);

		objectNavigationFromCollectionExpressionEClass = createEClass(OBJECT_NAVIGATION_FROM_COLLECTION_EXPRESSION);
		createEReference(objectNavigationFromCollectionExpressionEClass, OBJECT_NAVIGATION_FROM_COLLECTION_EXPRESSION__COLLECTION_EXPRESSION);

		castCollectionEClass = createEClass(CAST_COLLECTION);
		createEReference(castCollectionEClass, CAST_COLLECTION__ELEMENT_NAME);
		createEReference(castCollectionEClass, CAST_COLLECTION__COLLECTION_EXPRESSION);

		collectionSwitchExpressionEClass = createEClass(COLLECTION_SWITCH_EXPRESSION);
		createEReference(collectionSwitchExpressionEClass, COLLECTION_SWITCH_EXPRESSION__ELEMENT_NAME);
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
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
		VariablePackage theVariablePackage = (VariablePackage)EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		immutableCollectionEClass.getESuperTypes().add(theExpressionPackage.getCollectionExpression());
		immutableCollectionEClass.getESuperTypes().add(theVariablePackage.getObjectVariable());
		collectionFilterExpressionEClass.getESuperTypes().add(theExpressionPackage.getCollectionExpression());
		collectionFilterExpressionEClass.getESuperTypes().add(theExpressionPackage.getFilteringExpression());
		collectionVariableReferenceEClass.getESuperTypes().add(theExpressionPackage.getCollectionExpression());
		collectionVariableReferenceEClass.getESuperTypes().add(theExpressionPackage.getVariableReference());
		collectionNavigationFromObjectExpressionEClass.getESuperTypes().add(theExpressionPackage.getCollectionExpression());
		collectionNavigationFromObjectExpressionEClass.getESuperTypes().add(theVariablePackage.getObjectVariable());
		collectionNavigationFromObjectExpressionEClass.getESuperTypes().add(theExpressionPackage.getReferenceSelector());
		collectionNavigationFromCollectionExpressionEClass.getESuperTypes().add(theExpressionPackage.getCollectionExpression());
		collectionNavigationFromCollectionExpressionEClass.getESuperTypes().add(theExpressionPackage.getNavigationExpression());
		collectionNavigationFromCollectionExpressionEClass.getESuperTypes().add(theVariablePackage.getObjectVariable());
		sortExpressionEClass.getESuperTypes().add(theExpressionPackage.getOrderedCollectionExpression());
		subCollectionExpressionEClass.getESuperTypes().add(theExpressionPackage.getOrderedCollectionExpression());
		subCollectionExpressionEClass.getESuperTypes().add(theExpressionPackage.getWindowingExpression());
		objectNavigationFromCollectionExpressionEClass.getESuperTypes().add(theExpressionPackage.getCollectionExpression());
		objectNavigationFromCollectionExpressionEClass.getESuperTypes().add(theExpressionPackage.getNavigationExpression());
		objectNavigationFromCollectionExpressionEClass.getESuperTypes().add(theVariablePackage.getObjectVariable());
		castCollectionEClass.getESuperTypes().add(theExpressionPackage.getCollectionExpression());
		castCollectionEClass.getESuperTypes().add(theVariablePackage.getObjectVariable());
		collectionSwitchExpressionEClass.getESuperTypes().add(theExpressionPackage.getSwitchExpression());
		collectionSwitchExpressionEClass.getESuperTypes().add(theExpressionPackage.getObjectExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(immutableCollectionEClass, ImmutableCollection.class, "ImmutableCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImmutableCollection_ElementName(), theExpressionPackage.getTypeName(), null, "elementName", null, 1, 1, ImmutableCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionFilterExpressionEClass, CollectionFilterExpression.class, "CollectionFilterExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionFilterExpression_CollectionExpression(), theExpressionPackage.getCollectionExpression(), null, "collectionExpression", null, 1, 1, CollectionFilterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCollectionFilterExpression_Condition(), theExpressionPackage.getLogicalExpression(), null, "condition", null, 1, 1, CollectionFilterExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionVariableReferenceEClass, CollectionVariableReference.class, "CollectionVariableReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionVariableReference_Variable(), theVariablePackage.getCollectionVariable(), null, "variable", null, 1, 1, CollectionVariableReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionNavigationFromObjectExpressionEClass, CollectionNavigationFromObjectExpression.class, "CollectionNavigationFromObjectExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionNavigationFromObjectExpression_ObjectExpression(), theExpressionPackage.getObjectExpression(), null, "objectExpression", null, 1, 1, CollectionNavigationFromObjectExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionNavigationFromCollectionExpressionEClass, CollectionNavigationFromCollectionExpression.class, "CollectionNavigationFromCollectionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionNavigationFromCollectionExpression_CollectionExpression(), theExpressionPackage.getCollectionExpression(), null, "collectionExpression", null, 1, 1, CollectionNavigationFromCollectionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortExpressionEClass, SortExpression.class, "SortExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortExpression_CollectionExpression(), theExpressionPackage.getCollectionExpression(), null, "collectionExpression", null, 1, 1, SortExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortExpression_OrderBy(), this.getOrderByItem(), null, "orderBy", null, 0, -1, SortExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subCollectionExpressionEClass, SubCollectionExpression.class, "SubCollectionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubCollectionExpression_CollectionExpression(), theExpressionPackage.getOrderedCollectionExpression(), null, "collectionExpression", null, 1, 1, SubCollectionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubCollectionExpression_Position(), theExpressionPackage.getIntegerExpression(), null, "position", null, 0, 1, SubCollectionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubCollectionExpression_Length(), theExpressionPackage.getIntegerExpression(), null, "length", null, 0, 1, SubCollectionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderByItemEClass, OrderByItem.class, "OrderByItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOrderByItem_Expression(), theExpressionPackage.getDataExpression(), null, "expression", null, 1, 1, OrderByItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderByItem_Descending(), ecorePackage.getEBoolean(), "descending", null, 1, 1, OrderByItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectNavigationFromCollectionExpressionEClass, ObjectNavigationFromCollectionExpression.class, "ObjectNavigationFromCollectionExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectNavigationFromCollectionExpression_CollectionExpression(), theExpressionPackage.getCollectionExpression(), null, "collectionExpression", null, 1, 1, ObjectNavigationFromCollectionExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(castCollectionEClass, CastCollection.class, "CastCollection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCastCollection_ElementName(), theExpressionPackage.getTypeName(), null, "elementName", null, 1, 1, CastCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCastCollection_CollectionExpression(), theExpressionPackage.getCollectionExpression(), null, "collectionExpression", null, 1, 1, CastCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collectionSwitchExpressionEClass, CollectionSwitchExpression.class, "CollectionSwitchExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollectionSwitchExpression_ElementName(), theExpressionPackage.getTypeName(), null, "elementName", null, 1, 1, CollectionSwitchExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //CollectionPackageImpl
