/**
 */
package hu.blackbelt.judo.meta.psm.script.impl;

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

import hu.blackbelt.judo.meta.psm.script.ScriptFactory;
import hu.blackbelt.judo.meta.psm.script.ScriptPackage;

import hu.blackbelt.judo.meta.psm.service.ServicePackage;

import hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl;

import hu.blackbelt.judo.meta.psm.type.TypePackage;

import hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl;

import hu.blackbelt.judo.meta.psm.view.ViewPackage;

import hu.blackbelt.judo.meta.psm.view.impl.ViewPackageImpl;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ScriptPackageImpl extends EPackageImpl implements ScriptPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scriptEDataType = null;

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
	 * @see hu.blackbelt.judo.meta.psm.script.ScriptPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ScriptPackageImpl() {
		super(eNS_URI, ScriptFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ScriptPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ScriptPackage init() {
		if (isInited) return (ScriptPackage)EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI);

		// Obtain or create and register package
		ScriptPackageImpl theScriptPackage = (ScriptPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ScriptPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ScriptPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
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
		theScriptPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theDataPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
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
		theScriptPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
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
		theScriptPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ScriptPackage.eNS_URI, theScriptPackage);
		return theScriptPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScript() {
		return scriptEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptFactory getScriptFactory() {
		return (ScriptFactory)getEFactoryInstance();
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

		// Create data types
		scriptEDataType = createEDataType(SCRIPT);
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

		// Initialize data types
		initEDataType(scriptEDataType, String.class, "Script", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ScriptPackageImpl
