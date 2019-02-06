/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

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

import hu.blackbelt.judo.meta.psm.script.ScriptPackage;

import hu.blackbelt.judo.meta.psm.script.impl.ScriptPackageImpl;

import hu.blackbelt.judo.meta.psm.service.BoundOperation;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.Operation;
import hu.blackbelt.judo.meta.psm.service.ServiceFactory;
import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferAttributeBinding;
import hu.blackbelt.judo.meta.psm.service.TransferObjectContainment;
import hu.blackbelt.judo.meta.psm.service.TransferObjectReference;
import hu.blackbelt.judo.meta.psm.service.TransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferRelation;
import hu.blackbelt.judo.meta.psm.service.TransferRelationBinding;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType;

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
public class ServicePackageImpl extends EPackageImpl implements ServicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferObjectReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferObjectContainmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappedTransferObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferAttributeBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferRelationBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unmappedTransferObjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unboundOperationEClass = null;

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
	 * @see hu.blackbelt.judo.meta.psm.service.ServicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServicePackageImpl() {
		super(eNS_URI, ServiceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ServicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServicePackage init() {
		if (isInited) return (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);

		// Obtain or create and register package
		ServicePackageImpl theServicePackage = (ServicePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServicePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServicePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);
		TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
		DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
		ConstraintPackageImpl theConstraintPackage = (ConstraintPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) instanceof ConstraintPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI) : ConstraintPackage.eINSTANCE);
		ScriptPackageImpl theScriptPackage = (ScriptPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) instanceof ScriptPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI) : ScriptPackage.eINSTANCE);
		DerivedPackageImpl theDerivedPackage = (DerivedPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DerivedPackage.eNS_URI) instanceof DerivedPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DerivedPackage.eNS_URI) : DerivedPackage.eINSTANCE);
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
		theServicePackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theDataPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theDerivedPackage.createPackageContents();
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
		theServicePackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theDerivedPackage.initializePackageContents();
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
		theServicePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServicePackage.eNS_URI, theServicePackage);
		return theServicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransferObjectType() {
		return transferObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferObjectType_Representation() {
		return (EReference)transferObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferObjectType_Relations() {
		return (EReference)transferObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferObjectType_Attributes() {
		return (EReference)transferObjectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransferRelation() {
		return transferRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferRelation_Cardinality() {
		return (EReference)transferRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferRelation_InitExpression() {
		return (EReference)transferRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransferObjectReference() {
		return transferObjectReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferObjectReference_Referenced() {
		return (EReference)transferObjectReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransferObjectContainment() {
		return transferObjectContainmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferObjectContainment_Containment() {
		return (EReference)transferObjectContainmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransferAttribute() {
		return transferAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransferAttribute_Required() {
		return (EAttribute)transferAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferAttribute_InitExpression() {
		return (EReference)transferAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappedTransferObjectType() {
		return mappedTransferObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedTransferObjectType_EntityType() {
		return (EReference)mappedTransferObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedTransferObjectType_TransferRelationBindings() {
		return (EReference)mappedTransferObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappedTransferObjectType_TransferAttributeBindings() {
		return (EReference)mappedTransferObjectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransferAttributeBinding() {
		return transferAttributeBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferAttributeBinding_PrimitiveTypedElement() {
		return (EReference)transferAttributeBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferAttributeBinding_TransferAttribute() {
		return (EReference)transferAttributeBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransferRelationBinding() {
		return transferRelationBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferRelationBinding_ReferenceTypedElement() {
		return (EReference)transferRelationBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransferRelationBinding_TransferRelation() {
		return (EReference)transferRelationBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Body() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Output() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Faults() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Undefined() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnmappedTransferObjectType() {
		return unmappedTransferObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundOperation() {
		return boundOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundOperation_Input() {
		return (EReference)boundOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnboundOperation() {
		return unboundOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnboundOperation_Input() {
		return (EReference)unboundOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceFactory getServiceFactory() {
		return (ServiceFactory)getEFactoryInstance();
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
		transferObjectTypeEClass = createEClass(TRANSFER_OBJECT_TYPE);
		createEReference(transferObjectTypeEClass, TRANSFER_OBJECT_TYPE__REPRESENTATION);
		createEReference(transferObjectTypeEClass, TRANSFER_OBJECT_TYPE__RELATIONS);
		createEReference(transferObjectTypeEClass, TRANSFER_OBJECT_TYPE__ATTRIBUTES);

		transferRelationEClass = createEClass(TRANSFER_RELATION);
		createEReference(transferRelationEClass, TRANSFER_RELATION__CARDINALITY);
		createEReference(transferRelationEClass, TRANSFER_RELATION__INIT_EXPRESSION);

		transferObjectReferenceEClass = createEClass(TRANSFER_OBJECT_REFERENCE);
		createEReference(transferObjectReferenceEClass, TRANSFER_OBJECT_REFERENCE__REFERENCED);

		transferObjectContainmentEClass = createEClass(TRANSFER_OBJECT_CONTAINMENT);
		createEReference(transferObjectContainmentEClass, TRANSFER_OBJECT_CONTAINMENT__CONTAINMENT);

		transferAttributeEClass = createEClass(TRANSFER_ATTRIBUTE);
		createEAttribute(transferAttributeEClass, TRANSFER_ATTRIBUTE__REQUIRED);
		createEReference(transferAttributeEClass, TRANSFER_ATTRIBUTE__INIT_EXPRESSION);

		mappedTransferObjectTypeEClass = createEClass(MAPPED_TRANSFER_OBJECT_TYPE);
		createEReference(mappedTransferObjectTypeEClass, MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE);
		createEReference(mappedTransferObjectTypeEClass, MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_RELATION_BINDINGS);
		createEReference(mappedTransferObjectTypeEClass, MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_ATTRIBUTE_BINDINGS);

		transferAttributeBindingEClass = createEClass(TRANSFER_ATTRIBUTE_BINDING);
		createEReference(transferAttributeBindingEClass, TRANSFER_ATTRIBUTE_BINDING__PRIMITIVE_TYPED_ELEMENT);
		createEReference(transferAttributeBindingEClass, TRANSFER_ATTRIBUTE_BINDING__TRANSFER_ATTRIBUTE);

		transferRelationBindingEClass = createEClass(TRANSFER_RELATION_BINDING);
		createEReference(transferRelationBindingEClass, TRANSFER_RELATION_BINDING__REFERENCE_TYPED_ELEMENT);
		createEReference(transferRelationBindingEClass, TRANSFER_RELATION_BINDING__TRANSFER_RELATION);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__BODY);
		createEReference(operationEClass, OPERATION__OUTPUT);
		createEReference(operationEClass, OPERATION__FAULTS);
		createEAttribute(operationEClass, OPERATION__UNDEFINED);

		unmappedTransferObjectTypeEClass = createEClass(UNMAPPED_TRANSFER_OBJECT_TYPE);

		boundOperationEClass = createEClass(BOUND_OPERATION);
		createEReference(boundOperationEClass, BOUND_OPERATION__INPUT);

		unboundOperationEClass = createEClass(UNBOUND_OPERATION);
		createEReference(unboundOperationEClass, UNBOUND_OPERATION__INPUT);
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
		ExpressionPackage theExpressionPackage = (ExpressionPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionPackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		ScriptPackage theScriptPackage = (ScriptPackage)EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		transferObjectTypeEClass.getESuperTypes().add(theTypePackage.getDataType());
		transferRelationEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
		transferObjectReferenceEClass.getESuperTypes().add(this.getTransferRelation());
		transferObjectContainmentEClass.getESuperTypes().add(this.getTransferRelation());
		transferAttributeEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
		transferAttributeEClass.getESuperTypes().add(theDataPackage.getPrimitiveTypedElement());
		mappedTransferObjectTypeEClass.getESuperTypes().add(this.getTransferObjectType());
		operationEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
		unmappedTransferObjectTypeEClass.getESuperTypes().add(this.getTransferObjectType());
		boundOperationEClass.getESuperTypes().add(this.getOperation());
		unboundOperationEClass.getESuperTypes().add(this.getOperation());
		unboundOperationEClass.getESuperTypes().add(theNamespacePackage.getNamespaceElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(transferObjectTypeEClass, TransferObjectType.class, "TransferObjectType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransferObjectType_Representation(), this.getTransferAttribute(), null, "representation", null, 0, 1, TransferObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferObjectType_Relations(), this.getTransferRelation(), null, "relations", null, 0, -1, TransferObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferObjectType_Attributes(), this.getTransferAttribute(), null, "attributes", null, 0, -1, TransferObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transferRelationEClass, TransferRelation.class, "TransferRelation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransferRelation_Cardinality(), theTypePackage.getCardinality(), null, "cardinality", null, 1, 1, TransferRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferRelation_InitExpression(), theExpressionPackage.getReferenceExpression(), null, "initExpression", null, 0, 1, TransferRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transferObjectReferenceEClass, TransferObjectReference.class, "TransferObjectReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransferObjectReference_Referenced(), this.getMappedTransferObjectType(), null, "referenced", null, 1, 1, TransferObjectReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transferObjectContainmentEClass, TransferObjectContainment.class, "TransferObjectContainment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransferObjectContainment_Containment(), this.getTransferObjectType(), null, "containment", null, 1, 1, TransferObjectContainment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transferAttributeEClass, TransferAttribute.class, "TransferAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransferAttribute_Required(), ecorePackage.getEBoolean(), "required", null, 1, 1, TransferAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferAttribute_InitExpression(), theExpressionPackage.getDataExpression(), null, "initExpression", null, 0, 1, TransferAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappedTransferObjectTypeEClass, MappedTransferObjectType.class, "MappedTransferObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappedTransferObjectType_EntityType(), theDataPackage.getEntityType(), null, "entityType", null, 1, 1, MappedTransferObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedTransferObjectType_TransferRelationBindings(), this.getTransferRelationBinding(), null, "transferRelationBindings", null, 0, -1, MappedTransferObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedTransferObjectType_TransferAttributeBindings(), this.getTransferAttributeBinding(), null, "transferAttributeBindings", null, 0, -1, MappedTransferObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transferAttributeBindingEClass, TransferAttributeBinding.class, "TransferAttributeBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransferAttributeBinding_PrimitiveTypedElement(), theDataPackage.getPrimitiveTypedElement(), null, "primitiveTypedElement", null, 1, 1, TransferAttributeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferAttributeBinding_TransferAttribute(), this.getTransferAttribute(), null, "transferAttribute", null, 1, 1, TransferAttributeBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transferRelationBindingEClass, TransferRelationBinding.class, "TransferRelationBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransferRelationBinding_ReferenceTypedElement(), theDataPackage.getReferenceTypedElement(), null, "referenceTypedElement", null, 1, 1, TransferRelationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferRelationBinding_TransferRelation(), this.getTransferRelation(), null, "transferRelation", null, 1, 1, TransferRelationBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_Body(), theScriptPackage.getScript(), "body", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Output(), this.getTransferObjectType(), null, "output", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperation_Faults(), this.getTransferObjectType(), null, "faults", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_Undefined(), ecorePackage.getEBoolean(), "undefined", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unmappedTransferObjectTypeEClass, UnmappedTransferObjectType.class, "UnmappedTransferObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boundOperationEClass, BoundOperation.class, "BoundOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoundOperation_Input(), this.getMappedTransferObjectType(), null, "input", null, 1, 1, BoundOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unboundOperationEClass, UnboundOperation.class, "UnboundOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnboundOperation_Input(), this.getTransferObjectType(), null, "input", null, 0, 1, UnboundOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ServicePackageImpl
