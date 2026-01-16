/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

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

import hu.blackbelt.judo.meta.psm.measure.MeasurePackage;

import hu.blackbelt.judo.meta.psm.measure.impl.MeasurePackageImpl;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamespacePackageImpl;

import hu.blackbelt.judo.meta.psm.script.ScriptPackage;

import hu.blackbelt.judo.meta.psm.script.impl.ScriptPackageImpl;

import hu.blackbelt.judo.meta.psm.service.BoundTransferOperation;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.OperationDeclaration;
import hu.blackbelt.judo.meta.psm.service.Parameter;
import hu.blackbelt.judo.meta.psm.service.ServiceFactory;
import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferOperation;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.service.UnmappedTransferObjectType;

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
public class ServicePackageImpl extends EPackageImpl implements ServicePackage
{
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
	private EClass transferObjectRelationEClass = null;

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
	private EClass operationDeclarationEClass = null;

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
	private EClass unboundOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundTransferOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transferOperationBehaviourEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transferOperationBehaviourTypeEEnum = null;

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
	private ServicePackageImpl()
	{
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
	public static ServicePackage init()
	{
		if (isInited) return (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredServicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ServicePackageImpl theServicePackage = registeredServicePackage instanceof ServicePackageImpl ? (ServicePackageImpl)registeredServicePackage : new ServicePackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AccesspointPackage.eNS_URI);
		AccesspointPackageImpl theAccesspointPackage = (AccesspointPackageImpl)(registeredPackage instanceof AccesspointPackageImpl ? registeredPackage : AccesspointPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(MeasurePackage.eNS_URI);
		MeasurePackageImpl theMeasurePackage = (MeasurePackageImpl)(registeredPackage instanceof MeasurePackageImpl ? registeredPackage : MeasurePackage.eINSTANCE);

		// Create package meta-data objects
		theServicePackage.createPackageContents();
		thePsmPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theDataPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theDerivedPackage.createPackageContents();
		theAccesspointPackage.createPackageContents();
		theMeasurePackage.createPackageContents();

		// Initialize created meta-data
		theServicePackage.initializePackageContents();
		thePsmPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theDerivedPackage.initializePackageContents();
		theAccesspointPackage.initializePackageContents();
		theMeasurePackage.initializePackageContents();

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
	@Override
	public EClass getTransferObjectType()
	{
		return transferObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferObjectType_Representation()
	{
		return (EReference)transferObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferObjectType_Relations()
	{
		return (EReference)transferObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferObjectType_Attributes()
	{
		return (EReference)transferObjectTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferObjectType_Operations()
	{
		return (EReference)transferObjectTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferObjectType_ActorType()
	{
		return (EReference)transferObjectTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferObjectType_Override()
	{
		return (EReference)transferObjectTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransferObjectType_QueryCustomizer()
	{
		return (EAttribute)transferObjectTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransferObjectType__IsAccessPoint()
	{
		return transferObjectTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransferObjectRelation()
	{
		return transferObjectRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferObjectRelation_Cardinality()
	{
		return (EReference)transferObjectRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferObjectRelation_Binding()
	{
		return (EReference)transferObjectRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferObjectRelation_DefaultValue()
	{
		return (EReference)transferObjectRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferObjectRelation_Range()
	{
		return (EReference)transferObjectRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferObjectRelation_Target()
	{
		return (EReference)transferObjectRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransferObjectRelation_Embedded()
	{
		return (EAttribute)transferObjectRelationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransferObjectRelation_EmbeddedCreate()
	{
		return (EAttribute)transferObjectRelationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransferObjectRelation_EmbeddedUpdate()
	{
		return (EAttribute)transferObjectRelationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransferObjectRelation_EmbeddedDelete()
	{
		return (EAttribute)transferObjectRelationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransferObjectRelation_Access()
	{
		return (EAttribute)transferObjectRelationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransferObjectRelation__IsCollection()
	{
		return transferObjectRelationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransferObjectRelation__IsRequired()
	{
		return transferObjectRelationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransferObjectRelation__IsMutable()
	{
		return transferObjectRelationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransferObjectRelation__IsNavigable()
	{
		return transferObjectRelationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransferObjectRelation__IsExposedGraph()
	{
		return transferObjectRelationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransferAttribute()
	{
		return transferAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransferAttribute_Required()
	{
		return (EAttribute)transferAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferAttribute_DefaultValue()
	{
		return (EReference)transferAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferAttribute_DataType()
	{
		return (EReference)transferAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferAttribute_Binding()
	{
		return (EReference)transferAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransferAttribute_ClaimType()
	{
		return (EAttribute)transferAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransferAttribute__IsPrimitive()
	{
		return transferAttributeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMappedTransferObjectType()
	{
		return mappedTransferObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappedTransferObjectType_EntityType()
	{
		return (EReference)mappedTransferObjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappedTransferObjectType_Filter()
	{
		return (EReference)mappedTransferObjectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMappedTransferObjectType__IsAbstract()
	{
		return mappedTransferObjectTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getMappedTransferObjectType__IsInstantiable()
	{
		return mappedTransferObjectTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationDeclaration()
	{
		return operationDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationDeclaration_Faults()
	{
		return (EReference)operationDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationDeclaration_Output()
	{
		return (EReference)operationDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationDeclaration_Input()
	{
		return (EReference)operationDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnmappedTransferObjectType()
	{
		return unmappedTransferObjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUnboundOperation()
	{
		return unboundOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUnboundOperation_Implementation()
	{
		return (EReference)unboundOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUnboundOperation_Initializer()
	{
		return (EAttribute)unboundOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter()
	{
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Cardinality()
	{
		return (EReference)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Type()
	{
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_WrapAsOptional()
	{
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundTransferOperation()
	{
		return boundTransferOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoundTransferOperation_Binding()
	{
		return (EReference)boundTransferOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBoundTransferOperation__GetImplementation()
	{
		return boundTransferOperationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransferOperation()
	{
		return transferOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferOperation_Behaviour()
	{
		return (EReference)transferOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransferOperation_Immutable()
	{
		return (EAttribute)transferOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransferOperation_DeleteOnResult()
	{
		return (EAttribute)transferOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransferOperation_UpdateOnResult()
	{
		return (EAttribute)transferOperationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferOperation_InputRange()
	{
		return (EReference)transferOperationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTransferOperation__GetImplementation()
	{
		return transferOperationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTransferOperationBehaviour()
	{
		return transferOperationBehaviourEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTransferOperationBehaviour_BehaviourType()
	{
		return (EAttribute)transferOperationBehaviourEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferOperationBehaviour_Relation()
	{
		return (EReference)transferOperationBehaviourEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTransferOperationBehaviour_Owner()
	{
		return (EReference)transferOperationBehaviourEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTransferOperationBehaviourType()
	{
		return transferOperationBehaviourTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServiceFactory getServiceFactory()
	{
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
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		transferObjectTypeEClass = createEClass(TRANSFER_OBJECT_TYPE);
		createEReference(transferObjectTypeEClass, TRANSFER_OBJECT_TYPE__REPRESENTATION);
		createEReference(transferObjectTypeEClass, TRANSFER_OBJECT_TYPE__RELATIONS);
		createEReference(transferObjectTypeEClass, TRANSFER_OBJECT_TYPE__ATTRIBUTES);
		createEReference(transferObjectTypeEClass, TRANSFER_OBJECT_TYPE__OPERATIONS);
		createEReference(transferObjectTypeEClass, TRANSFER_OBJECT_TYPE__ACTOR_TYPE);
		createEReference(transferObjectTypeEClass, TRANSFER_OBJECT_TYPE__OVERRIDE);
		createEAttribute(transferObjectTypeEClass, TRANSFER_OBJECT_TYPE__QUERY_CUSTOMIZER);
		createEOperation(transferObjectTypeEClass, TRANSFER_OBJECT_TYPE___IS_ACCESS_POINT);

		transferObjectRelationEClass = createEClass(TRANSFER_OBJECT_RELATION);
		createEReference(transferObjectRelationEClass, TRANSFER_OBJECT_RELATION__CARDINALITY);
		createEReference(transferObjectRelationEClass, TRANSFER_OBJECT_RELATION__BINDING);
		createEReference(transferObjectRelationEClass, TRANSFER_OBJECT_RELATION__DEFAULT_VALUE);
		createEReference(transferObjectRelationEClass, TRANSFER_OBJECT_RELATION__RANGE);
		createEReference(transferObjectRelationEClass, TRANSFER_OBJECT_RELATION__TARGET);
		createEAttribute(transferObjectRelationEClass, TRANSFER_OBJECT_RELATION__EMBEDDED);
		createEAttribute(transferObjectRelationEClass, TRANSFER_OBJECT_RELATION__EMBEDDED_CREATE);
		createEAttribute(transferObjectRelationEClass, TRANSFER_OBJECT_RELATION__EMBEDDED_UPDATE);
		createEAttribute(transferObjectRelationEClass, TRANSFER_OBJECT_RELATION__EMBEDDED_DELETE);
		createEAttribute(transferObjectRelationEClass, TRANSFER_OBJECT_RELATION__ACCESS);
		createEOperation(transferObjectRelationEClass, TRANSFER_OBJECT_RELATION___IS_COLLECTION);
		createEOperation(transferObjectRelationEClass, TRANSFER_OBJECT_RELATION___IS_REQUIRED);
		createEOperation(transferObjectRelationEClass, TRANSFER_OBJECT_RELATION___IS_MUTABLE);
		createEOperation(transferObjectRelationEClass, TRANSFER_OBJECT_RELATION___IS_NAVIGABLE);
		createEOperation(transferObjectRelationEClass, TRANSFER_OBJECT_RELATION___IS_EXPOSED_GRAPH);

		transferAttributeEClass = createEClass(TRANSFER_ATTRIBUTE);
		createEAttribute(transferAttributeEClass, TRANSFER_ATTRIBUTE__REQUIRED);
		createEReference(transferAttributeEClass, TRANSFER_ATTRIBUTE__DEFAULT_VALUE);
		createEReference(transferAttributeEClass, TRANSFER_ATTRIBUTE__DATA_TYPE);
		createEReference(transferAttributeEClass, TRANSFER_ATTRIBUTE__BINDING);
		createEAttribute(transferAttributeEClass, TRANSFER_ATTRIBUTE__CLAIM_TYPE);
		createEOperation(transferAttributeEClass, TRANSFER_ATTRIBUTE___IS_PRIMITIVE);

		mappedTransferObjectTypeEClass = createEClass(MAPPED_TRANSFER_OBJECT_TYPE);
		createEReference(mappedTransferObjectTypeEClass, MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE);
		createEReference(mappedTransferObjectTypeEClass, MAPPED_TRANSFER_OBJECT_TYPE__FILTER);
		createEOperation(mappedTransferObjectTypeEClass, MAPPED_TRANSFER_OBJECT_TYPE___IS_ABSTRACT);
		createEOperation(mappedTransferObjectTypeEClass, MAPPED_TRANSFER_OBJECT_TYPE___IS_INSTANTIABLE);

		operationDeclarationEClass = createEClass(OPERATION_DECLARATION);
		createEReference(operationDeclarationEClass, OPERATION_DECLARATION__FAULTS);
		createEReference(operationDeclarationEClass, OPERATION_DECLARATION__OUTPUT);
		createEReference(operationDeclarationEClass, OPERATION_DECLARATION__INPUT);

		unmappedTransferObjectTypeEClass = createEClass(UNMAPPED_TRANSFER_OBJECT_TYPE);

		unboundOperationEClass = createEClass(UNBOUND_OPERATION);
		createEReference(unboundOperationEClass, UNBOUND_OPERATION__IMPLEMENTATION);
		createEAttribute(unboundOperationEClass, UNBOUND_OPERATION__INITIALIZER);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__CARDINALITY);
		createEReference(parameterEClass, PARAMETER__TYPE);
		createEAttribute(parameterEClass, PARAMETER__WRAP_AS_OPTIONAL);

		boundTransferOperationEClass = createEClass(BOUND_TRANSFER_OPERATION);
		createEReference(boundTransferOperationEClass, BOUND_TRANSFER_OPERATION__BINDING);
		createEOperation(boundTransferOperationEClass, BOUND_TRANSFER_OPERATION___GET_IMPLEMENTATION);

		transferOperationEClass = createEClass(TRANSFER_OPERATION);
		createEReference(transferOperationEClass, TRANSFER_OPERATION__BEHAVIOUR);
		createEAttribute(transferOperationEClass, TRANSFER_OPERATION__IMMUTABLE);
		createEAttribute(transferOperationEClass, TRANSFER_OPERATION__DELETE_ON_RESULT);
		createEAttribute(transferOperationEClass, TRANSFER_OPERATION__UPDATE_ON_RESULT);
		createEReference(transferOperationEClass, TRANSFER_OPERATION__INPUT_RANGE);
		createEOperation(transferOperationEClass, TRANSFER_OPERATION___GET_IMPLEMENTATION);

		transferOperationBehaviourEClass = createEClass(TRANSFER_OPERATION_BEHAVIOUR);
		createEAttribute(transferOperationBehaviourEClass, TRANSFER_OPERATION_BEHAVIOUR__BEHAVIOUR_TYPE);
		createEReference(transferOperationBehaviourEClass, TRANSFER_OPERATION_BEHAVIOUR__RELATION);
		createEReference(transferOperationBehaviourEClass, TRANSFER_OPERATION_BEHAVIOUR__OWNER);

		// Create enums
		transferOperationBehaviourTypeEEnum = createEEnum(TRANSFER_OPERATION_BEHAVIOUR_TYPE);
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
		TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
		AccesspointPackage theAccesspointPackage = (AccesspointPackage)EPackage.Registry.INSTANCE.getEPackage(AccesspointPackage.eNS_URI);
		NamespacePackage theNamespacePackage = (NamespacePackage)EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI);
		DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
		DerivedPackage theDerivedPackage = (DerivedPackage)EPackage.Registry.INSTANCE.getEPackage(DerivedPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		transferObjectTypeEClass.getESuperTypes().add(theTypePackage.getDataType());
		transferObjectRelationEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
		transferAttributeEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
		mappedTransferObjectTypeEClass.getESuperTypes().add(this.getTransferObjectType());
		unmappedTransferObjectTypeEClass.getESuperTypes().add(this.getTransferObjectType());
		unboundOperationEClass.getESuperTypes().add(this.getTransferOperation());
		parameterEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
		boundTransferOperationEClass.getESuperTypes().add(this.getTransferOperation());
		transferOperationEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
		transferOperationEClass.getESuperTypes().add(this.getOperationDeclaration());

		// Initialize classes, features, and operations; add parameters
		initEClass(transferObjectTypeEClass, TransferObjectType.class, "TransferObjectType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransferObjectType_Representation(), this.getTransferAttribute(), null, "representation", null, 0, 1, TransferObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferObjectType_Relations(), this.getTransferObjectRelation(), null, "relations", null, 0, -1, TransferObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferObjectType_Attributes(), this.getTransferAttribute(), null, "attributes", null, 0, -1, TransferObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferObjectType_Operations(), this.getTransferOperation(), null, "operations", null, 0, -1, TransferObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferObjectType_ActorType(), theAccesspointPackage.getAbstractActorType(), theAccesspointPackage.getAbstractActorType_TransferObjectType(), "actorType", null, 0, 1, TransferObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferObjectType_Override(), this.getTransferObjectType(), null, "override", null, 0, 1, TransferObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransferObjectType_QueryCustomizer(), ecorePackage.getEBoolean(), "queryCustomizer", "false", 1, 1, TransferObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTransferObjectType__IsAccessPoint(), ecorePackage.getEBoolean(), "isAccessPoint", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(transferObjectRelationEClass, TransferObjectRelation.class, "TransferObjectRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransferObjectRelation_Cardinality(), theTypePackage.getCardinality(), null, "cardinality", null, 1, 1, TransferObjectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferObjectRelation_Binding(), theDataPackage.getReferenceTypedElement(), null, "binding", null, 0, 1, TransferObjectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferObjectRelation_DefaultValue(), theDerivedPackage.getReferenceAccessor(), null, "defaultValue", null, 0, 1, TransferObjectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferObjectRelation_Range(), theDerivedPackage.getReferenceAccessor(), null, "range", null, 0, 1, TransferObjectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferObjectRelation_Target(), this.getTransferObjectType(), null, "target", null, 1, 1, TransferObjectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransferObjectRelation_Embedded(), ecorePackage.getEBoolean(), "embedded", "false", 1, 1, TransferObjectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransferObjectRelation_EmbeddedCreate(), ecorePackage.getEBoolean(), "embeddedCreate", null, 1, 1, TransferObjectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransferObjectRelation_EmbeddedUpdate(), ecorePackage.getEBoolean(), "embeddedUpdate", null, 1, 1, TransferObjectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransferObjectRelation_EmbeddedDelete(), ecorePackage.getEBoolean(), "embeddedDelete", "false", 1, 1, TransferObjectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransferObjectRelation_Access(), ecorePackage.getEBoolean(), "access", "false", 1, 1, TransferObjectRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTransferObjectRelation__IsCollection(), ecorePackage.getEBoolean(), "isCollection", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTransferObjectRelation__IsRequired(), ecorePackage.getEBoolean(), "isRequired", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTransferObjectRelation__IsMutable(), ecorePackage.getEBoolean(), "isMutable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTransferObjectRelation__IsNavigable(), ecorePackage.getEBoolean(), "isNavigable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTransferObjectRelation__IsExposedGraph(), ecorePackage.getEBoolean(), "isExposedGraph", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(transferAttributeEClass, TransferAttribute.class, "TransferAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransferAttribute_Required(), ecorePackage.getEBoolean(), "required", null, 1, 1, TransferAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferAttribute_DefaultValue(), theDerivedPackage.getPrimitiveAccessor(), null, "defaultValue", null, 0, 1, TransferAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferAttribute_DataType(), theTypePackage.getPrimitive(), null, "dataType", null, 1, 1, TransferAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferAttribute_Binding(), theDataPackage.getPrimitiveTypedElement(), null, "binding", null, 0, 1, TransferAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransferAttribute_ClaimType(), ecorePackage.getEString(), "claimType", null, 0, 1, TransferAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTransferAttribute__IsPrimitive(), ecorePackage.getEBoolean(), "isPrimitive", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mappedTransferObjectTypeEClass, MappedTransferObjectType.class, "MappedTransferObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappedTransferObjectType_EntityType(), theDataPackage.getEntityType(), null, "entityType", null, 1, 1, MappedTransferObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMappedTransferObjectType_Filter(), theDerivedPackage.getLogicalExpressionType(), null, "filter", null, 0, 1, MappedTransferObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMappedTransferObjectType__IsAbstract(), ecorePackage.getEBoolean(), "isAbstract", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMappedTransferObjectType__IsInstantiable(), ecorePackage.getEBoolean(), "isInstantiable", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(operationDeclarationEClass, OperationDeclaration.class, "OperationDeclaration", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationDeclaration_Faults(), this.getParameter(), null, "faults", null, 0, -1, OperationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationDeclaration_Output(), this.getParameter(), null, "output", null, 0, 1, OperationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperationDeclaration_Input(), this.getParameter(), null, "input", null, 0, 1, OperationDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unmappedTransferObjectTypeEClass, UnmappedTransferObjectType.class, "UnmappedTransferObjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unboundOperationEClass, UnboundOperation.class, "UnboundOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnboundOperation_Implementation(), theDataPackage.getOperationBody(), null, "implementation", null, 0, 1, UnboundOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnboundOperation_Initializer(), ecorePackage.getEBoolean(), "initializer", "false", 1, 1, UnboundOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_Cardinality(), theTypePackage.getCardinality(), null, "cardinality", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Type(), this.getTransferObjectType(), null, "type", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_WrapAsOptional(), ecorePackage.getEBoolean(), "wrapAsOptional", "true", 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(boundTransferOperationEClass, BoundTransferOperation.class, "BoundTransferOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoundTransferOperation_Binding(), theDataPackage.getBoundOperation(), null, "binding", null, 1, 1, BoundTransferOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBoundTransferOperation__GetImplementation(), theDataPackage.getOperationBody(), "getImplementation", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(transferOperationEClass, TransferOperation.class, "TransferOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransferOperation_Behaviour(), this.getTransferOperationBehaviour(), null, "behaviour", null, 0, 1, TransferOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransferOperation_Immutable(), ecorePackage.getEBoolean(), "immutable", "false", 1, 1, TransferOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransferOperation_DeleteOnResult(), ecorePackage.getEBoolean(), "deleteOnResult", "false", 1, 1, TransferOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransferOperation_UpdateOnResult(), ecorePackage.getEBoolean(), "updateOnResult", "false", 1, 1, TransferOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferOperation_InputRange(), this.getTransferObjectRelation(), null, "inputRange", null, 0, 1, TransferOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTransferOperation__GetImplementation(), theDataPackage.getOperationBody(), "getImplementation", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(transferOperationBehaviourEClass, TransferOperationBehaviour.class, "TransferOperationBehaviour", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransferOperationBehaviour_BehaviourType(), this.getTransferOperationBehaviourType(), "behaviourType", null, 1, 1, TransferOperationBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferOperationBehaviour_Relation(), this.getTransferObjectRelation(), null, "relation", null, 0, 1, TransferOperationBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransferOperationBehaviour_Owner(), theNamespacePackage.getNamedElement(), null, "owner", null, 1, 1, TransferOperationBehaviour.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.class, "TransferOperationBehaviourType");
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.GET_TEMPLATE);
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.GET_PRINCIPAL);
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.LIST);
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.CREATE_INSTANCE);
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.VALIDATE_CREATE);
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.REFRESH);
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.UPDATE_INSTANCE);
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.VALIDATE_UPDATE);
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.DELETE_INSTANCE);
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.SET_REFERENCE);
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.UNSET_REFERENCE);
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.ADD_REFERENCE);
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.REMOVE_REFERENCE);
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.GET_RANGE);
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.GET_METADATA);
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.GET_UPLOAD_TOKEN);
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.EXPORT);
		addEEnumLiteral(transferOperationBehaviourTypeEEnum, TransferOperationBehaviourType.VALIDATE_OPERATION_INPUT);
	}

} //ServicePackageImpl
