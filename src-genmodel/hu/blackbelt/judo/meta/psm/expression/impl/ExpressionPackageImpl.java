/**
 */
package hu.blackbelt.judo.meta.psm.expression.impl;

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

import hu.blackbelt.judo.meta.psm.expression.AggregatedExpression;
import hu.blackbelt.judo.meta.psm.expression.AttributeSelector;
import hu.blackbelt.judo.meta.psm.expression.CollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.CustomExpression;
import hu.blackbelt.judo.meta.psm.expression.DataExpression;
import hu.blackbelt.judo.meta.psm.expression.DateExpression;
import hu.blackbelt.judo.meta.psm.expression.DecimalExpression;
import hu.blackbelt.judo.meta.psm.expression.ElementName;
import hu.blackbelt.judo.meta.psm.expression.EnumerationExpression;
import hu.blackbelt.judo.meta.psm.expression.Expression;
import hu.blackbelt.judo.meta.psm.expression.ExpressionFactory;
import hu.blackbelt.judo.meta.psm.expression.ExpressionPackage;
import hu.blackbelt.judo.meta.psm.expression.FilteringExpression;
import hu.blackbelt.judo.meta.psm.expression.IntegerExpression;
import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;
import hu.blackbelt.judo.meta.psm.expression.MeasureName;
import hu.blackbelt.judo.meta.psm.expression.NavigationExpression;
import hu.blackbelt.judo.meta.psm.expression.NumericExpression;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;
import hu.blackbelt.judo.meta.psm.expression.OrderedCollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.ReferenceExpression;
import hu.blackbelt.judo.meta.psm.expression.ReferenceSelector;
import hu.blackbelt.judo.meta.psm.expression.StringExpression;
import hu.blackbelt.judo.meta.psm.expression.SwitchCase;
import hu.blackbelt.judo.meta.psm.expression.SwitchExpression;
import hu.blackbelt.judo.meta.psm.expression.TimestampExpression;
import hu.blackbelt.judo.meta.psm.expression.TypeName;
import hu.blackbelt.judo.meta.psm.expression.VariableReference;
import hu.blackbelt.judo.meta.psm.expression.WindowingExpression;

import hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage;

import hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage;

import hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.custom.CustomPackage;

import hu.blackbelt.judo.meta.psm.expression.custom.impl.CustomPackageImpl;

import hu.blackbelt.judo.meta.psm.expression.enumeration.EnumerationPackage;

import hu.blackbelt.judo.meta.psm.expression.enumeration.impl.EnumerationPackageImpl;

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
public class ExpressionPackageImpl extends EPackageImpl implements ExpressionPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedCollectionExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregatedExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timestampExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowingExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filteringExpressionEClass = null;

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
	 * @see hu.blackbelt.judo.meta.psm.expression.ExpressionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpressionPackageImpl() {
		super(eNS_URI, ExpressionFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExpressionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpressionPackage init() {
		if (isInited) return (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);

		// Obtain or create and register package
		ExpressionPackageImpl theExpressionPackage = (ExpressionPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExpressionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExpressionPackageImpl());

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
		theExpressionPackage.createPackageContents();
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
		theExpressionPackage.initializePackageContents();
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
		theExpressionPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpressionPackage.eNS_URI, theExpressionPackage);
		return theExpressionPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementName() {
		return elementNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementName_Name() {
		return (EAttribute)elementNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementName_Namespace() {
		return (EAttribute)elementNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumericExpression() {
		return numericExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicalExpression() {
		return logicalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringExpression() {
		return stringExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationExpression() {
		return enumerationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectExpression() {
		return objectExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionExpression() {
		return collectionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeSelector() {
		return attributeSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeSelector_ObjectExpression() {
		return (EReference)attributeSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeSelector_AttributeName() {
		return (EAttribute)attributeSelectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableReference() {
		return variableReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerExpression() {
		return integerExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalExpression() {
		return decimalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderedCollectionExpression() {
		return orderedCollectionExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataExpression() {
		return dataExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationExpression() {
		return navigationExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNavigationExpression_ReferenceName() {
		return (EAttribute)navigationExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchExpression() {
		return switchExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchExpression_Cases() {
		return (EReference)switchExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchExpression_DefaultExpression() {
		return (EReference)switchExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchCase() {
		return switchCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchCase_Condition() {
		return (EReference)switchCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchCase_Expression() {
		return (EReference)switchCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregatedExpression() {
		return aggregatedExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregatedExpression_CollectionExpression() {
		return (EReference)aggregatedExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceExpression() {
		return referenceExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceSelector() {
		return referenceSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomExpression() {
		return customExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateExpression() {
		return dateExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimestampExpression() {
		return timestampExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeName() {
		return typeNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMeasureName() {
		return measureNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindowingExpression() {
		return windowingExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilteringExpression() {
		return filteringExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionFactory getExpressionFactory() {
		return (ExpressionFactory)getEFactoryInstance();
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
		expressionEClass = createEClass(EXPRESSION);

		elementNameEClass = createEClass(ELEMENT_NAME);
		createEAttribute(elementNameEClass, ELEMENT_NAME__NAME);
		createEAttribute(elementNameEClass, ELEMENT_NAME__NAMESPACE);

		numericExpressionEClass = createEClass(NUMERIC_EXPRESSION);

		logicalExpressionEClass = createEClass(LOGICAL_EXPRESSION);

		stringExpressionEClass = createEClass(STRING_EXPRESSION);

		enumerationExpressionEClass = createEClass(ENUMERATION_EXPRESSION);

		objectExpressionEClass = createEClass(OBJECT_EXPRESSION);

		collectionExpressionEClass = createEClass(COLLECTION_EXPRESSION);

		attributeSelectorEClass = createEClass(ATTRIBUTE_SELECTOR);
		createEReference(attributeSelectorEClass, ATTRIBUTE_SELECTOR__OBJECT_EXPRESSION);
		createEAttribute(attributeSelectorEClass, ATTRIBUTE_SELECTOR__ATTRIBUTE_NAME);

		variableReferenceEClass = createEClass(VARIABLE_REFERENCE);

		integerExpressionEClass = createEClass(INTEGER_EXPRESSION);

		decimalExpressionEClass = createEClass(DECIMAL_EXPRESSION);

		orderedCollectionExpressionEClass = createEClass(ORDERED_COLLECTION_EXPRESSION);

		dataExpressionEClass = createEClass(DATA_EXPRESSION);

		navigationExpressionEClass = createEClass(NAVIGATION_EXPRESSION);
		createEAttribute(navigationExpressionEClass, NAVIGATION_EXPRESSION__REFERENCE_NAME);

		switchExpressionEClass = createEClass(SWITCH_EXPRESSION);
		createEReference(switchExpressionEClass, SWITCH_EXPRESSION__CASES);
		createEReference(switchExpressionEClass, SWITCH_EXPRESSION__DEFAULT_EXPRESSION);

		switchCaseEClass = createEClass(SWITCH_CASE);
		createEReference(switchCaseEClass, SWITCH_CASE__CONDITION);
		createEReference(switchCaseEClass, SWITCH_CASE__EXPRESSION);

		aggregatedExpressionEClass = createEClass(AGGREGATED_EXPRESSION);
		createEReference(aggregatedExpressionEClass, AGGREGATED_EXPRESSION__COLLECTION_EXPRESSION);

		referenceExpressionEClass = createEClass(REFERENCE_EXPRESSION);

		referenceSelectorEClass = createEClass(REFERENCE_SELECTOR);

		customExpressionEClass = createEClass(CUSTOM_EXPRESSION);

		dateExpressionEClass = createEClass(DATE_EXPRESSION);

		timestampExpressionEClass = createEClass(TIMESTAMP_EXPRESSION);

		typeNameEClass = createEClass(TYPE_NAME);

		measureNameEClass = createEClass(MEASURE_NAME);

		windowingExpressionEClass = createEClass(WINDOWING_EXPRESSION);

		filteringExpressionEClass = createEClass(FILTERING_EXPRESSION);
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
		ConstantPackage theConstantPackage = (ConstantPackage)EPackage.Registry.INSTANCE.getEPackage(ConstantPackage.eNS_URI);
		VariablePackage theVariablePackage = (VariablePackage)EPackage.Registry.INSTANCE.getEPackage(VariablePackage.eNS_URI);
		OperatorPackage theOperatorPackage = (OperatorPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorPackage.eNS_URI);
		NumericPackage theNumericPackage = (NumericPackage)EPackage.Registry.INSTANCE.getEPackage(NumericPackage.eNS_URI);
		LogicalPackage theLogicalPackage = (LogicalPackage)EPackage.Registry.INSTANCE.getEPackage(LogicalPackage.eNS_URI);
		StringPackage theStringPackage = (StringPackage)EPackage.Registry.INSTANCE.getEPackage(StringPackage.eNS_URI);
		EnumerationPackage theEnumerationPackage = (EnumerationPackage)EPackage.Registry.INSTANCE.getEPackage(EnumerationPackage.eNS_URI);
		ObjectPackage theObjectPackage = (ObjectPackage)EPackage.Registry.INSTANCE.getEPackage(ObjectPackage.eNS_URI);
		CollectionPackage theCollectionPackage = (CollectionPackage)EPackage.Registry.INSTANCE.getEPackage(CollectionPackage.eNS_URI);
		CustomPackage theCustomPackage = (CustomPackage)EPackage.Registry.INSTANCE.getEPackage(CustomPackage.eNS_URI);
		TemporalPackage theTemporalPackage = (TemporalPackage)EPackage.Registry.INSTANCE.getEPackage(TemporalPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theConstantPackage);
		getESubpackages().add(theVariablePackage);
		getESubpackages().add(theOperatorPackage);
		getESubpackages().add(theNumericPackage);
		getESubpackages().add(theLogicalPackage);
		getESubpackages().add(theStringPackage);
		getESubpackages().add(theEnumerationPackage);
		getESubpackages().add(theObjectPackage);
		getESubpackages().add(theCollectionPackage);
		getESubpackages().add(theCustomPackage);
		getESubpackages().add(theTemporalPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		numericExpressionEClass.getESuperTypes().add(this.getDataExpression());
		logicalExpressionEClass.getESuperTypes().add(this.getDataExpression());
		stringExpressionEClass.getESuperTypes().add(this.getDataExpression());
		enumerationExpressionEClass.getESuperTypes().add(this.getDataExpression());
		objectExpressionEClass.getESuperTypes().add(this.getReferenceExpression());
		collectionExpressionEClass.getESuperTypes().add(this.getReferenceExpression());
		attributeSelectorEClass.getESuperTypes().add(this.getExpression());
		integerExpressionEClass.getESuperTypes().add(this.getNumericExpression());
		decimalExpressionEClass.getESuperTypes().add(this.getNumericExpression());
		orderedCollectionExpressionEClass.getESuperTypes().add(this.getCollectionExpression());
		dataExpressionEClass.getESuperTypes().add(this.getExpression());
		navigationExpressionEClass.getESuperTypes().add(this.getExpression());
		switchExpressionEClass.getESuperTypes().add(this.getExpression());
		aggregatedExpressionEClass.getESuperTypes().add(this.getExpression());
		referenceExpressionEClass.getESuperTypes().add(this.getExpression());
		referenceSelectorEClass.getESuperTypes().add(this.getNavigationExpression());
		customExpressionEClass.getESuperTypes().add(this.getDataExpression());
		dateExpressionEClass.getESuperTypes().add(this.getDataExpression());
		timestampExpressionEClass.getESuperTypes().add(this.getDataExpression());
		typeNameEClass.getESuperTypes().add(this.getElementName());
		measureNameEClass.getESuperTypes().add(this.getElementName());
		windowingExpressionEClass.getESuperTypes().add(this.getExpression());
		filteringExpressionEClass.getESuperTypes().add(this.getExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(expressionEClass, Expression.class, "Expression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementNameEClass, ElementName.class, "ElementName", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementName_Name(), ecorePackage.getEString(), "name", null, 1, 1, ElementName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementName_Namespace(), ecorePackage.getEString(), "namespace", null, 1, 1, ElementName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numericExpressionEClass, NumericExpression.class, "NumericExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(logicalExpressionEClass, LogicalExpression.class, "LogicalExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringExpressionEClass, StringExpression.class, "StringExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(enumerationExpressionEClass, EnumerationExpression.class, "EnumerationExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectExpressionEClass, ObjectExpression.class, "ObjectExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(collectionExpressionEClass, CollectionExpression.class, "CollectionExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeSelectorEClass, AttributeSelector.class, "AttributeSelector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAttributeSelector_ObjectExpression(), this.getObjectExpression(), null, "objectExpression", null, 1, 1, AttributeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttributeSelector_AttributeName(), ecorePackage.getEString(), "attributeName", null, 1, 1, AttributeSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableReferenceEClass, VariableReference.class, "VariableReference", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(integerExpressionEClass, IntegerExpression.class, "IntegerExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decimalExpressionEClass, DecimalExpression.class, "DecimalExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderedCollectionExpressionEClass, OrderedCollectionExpression.class, "OrderedCollectionExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataExpressionEClass, DataExpression.class, "DataExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationExpressionEClass, NavigationExpression.class, "NavigationExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNavigationExpression_ReferenceName(), ecorePackage.getEString(), "referenceName", null, 1, 1, NavigationExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchExpressionEClass, SwitchExpression.class, "SwitchExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwitchExpression_Cases(), this.getSwitchCase(), null, "cases", null, 1, -1, SwitchExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchExpression_DefaultExpression(), this.getDataExpression(), null, "defaultExpression", null, 0, 1, SwitchExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchCaseEClass, SwitchCase.class, "SwitchCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwitchCase_Condition(), this.getLogicalExpression(), null, "condition", null, 1, 1, SwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitchCase_Expression(), this.getDataExpression(), null, "expression", null, 1, 1, SwitchCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregatedExpressionEClass, AggregatedExpression.class, "AggregatedExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAggregatedExpression_CollectionExpression(), this.getCollectionExpression(), null, "collectionExpression", null, 1, 1, AggregatedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceExpressionEClass, ReferenceExpression.class, "ReferenceExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(referenceSelectorEClass, ReferenceSelector.class, "ReferenceSelector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(customExpressionEClass, CustomExpression.class, "CustomExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dateExpressionEClass, DateExpression.class, "DateExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timestampExpressionEClass, TimestampExpression.class, "TimestampExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeNameEClass, TypeName.class, "TypeName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(measureNameEClass, MeasureName.class, "MeasureName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(windowingExpressionEClass, WindowingExpression.class, "WindowingExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(filteringExpressionEClass, FilteringExpression.class, "FilteringExpression", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ExpressionPackageImpl
