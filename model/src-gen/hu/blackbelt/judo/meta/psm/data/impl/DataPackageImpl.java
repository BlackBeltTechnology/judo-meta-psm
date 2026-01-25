/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.PsmPackage;

import hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage;

import hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl;

import hu.blackbelt.judo.meta.psm.constraint.ConstraintPackage;

import hu.blackbelt.judo.meta.psm.constraint.impl.ConstraintPackageImpl;

import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.data.Containment;
import hu.blackbelt.judo.meta.psm.data.DataFactory;
import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.EntityMember;
import hu.blackbelt.judo.meta.psm.data.EntitySequence;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.data.NamespaceSequence;
import hu.blackbelt.judo.meta.psm.data.OperationBody;
import hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement;
import hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement;
import hu.blackbelt.judo.meta.psm.data.Relation;
import hu.blackbelt.judo.meta.psm.data.Sequence;

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
public class DataPackageImpl extends EPackageImpl implements DataPackage
{
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
	private EClass associationEndEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entityMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entitySequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceSequenceEClass = null;

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
	private EClass operationBodyEClass = null;

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
	private DataPackageImpl()
	{
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
	public static DataPackage init()
	{
		if (isInited) return (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDataPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DataPackageImpl theDataPackage = registeredDataPackage instanceof DataPackageImpl ? (DataPackageImpl)registeredDataPackage : new DataPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI);
		PsmPackageImpl thePsmPackage = (PsmPackageImpl)(registeredPackage instanceof PsmPackageImpl ? registeredPackage : PsmPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI);
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(registeredPackage instanceof NamespacePackageImpl ? registeredPackage : NamespacePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
		TypePackageImpl theTypePackage = (TypePackageImpl)(registeredPackage instanceof TypePackageImpl ? registeredPackage : TypePackage.eINSTANCE);
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
		theDataPackage.createPackageContents();
		thePsmPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		theTypePackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theDerivedPackage.createPackageContents();
		theServicePackage.createPackageContents();
		theAccesspointPackage.createPackageContents();
		theMeasurePackage.createPackageContents();

		// Initialize created meta-data
		theDataPackage.initializePackageContents();
		thePsmPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		theTypePackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theDerivedPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theAccesspointPackage.initializePackageContents();
		theMeasurePackage.initializePackageContents();

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
	@Override
	public EClass getEntityType()
	{
		return entityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityType_SuperEntityTypes()
	{
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntityType_Abstract()
	{
		return (EAttribute)entityTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityType_Attributes()
	{
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityType_Relations()
	{
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityType_DataProperties()
	{
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityType_NavigationProperties()
	{
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityType_Sequences()
	{
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityType_Operations()
	{
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityType_Constraints()
	{
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEntityType_DefaultRepresentation()
	{
		return (EReference)entityTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityType__GetAllSuperEntityTypes()
	{
		return entityTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityType__GetAttribute__String()
	{
		return entityTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityType__GetReference__String()
	{
		return entityTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityType__GetAttributeType__String()
	{
		return entityTypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityType__ToString()
	{
		return entityTypeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityType__IsContainer()
	{
		return entityTypeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityType__IsContainment()
	{
		return entityTypeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityType__GetAllRelations()
	{
		return entityTypeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityType__GetAllAttributes()
	{
		return entityTypeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityType__GetAllDataProperties()
	{
		return entityTypeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityType__GetAllNavigationProperties()
	{
		return entityTypeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityType__GetAllSequences()
	{
		return entityTypeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityType__GetInheritedOperationImplementationByName__String()
	{
		return entityTypeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityType__GetInheritedOperationImplementationsByName__String()
	{
		return entityTypeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityType__GetInheritedOperationNames()
	{
		return entityTypeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEntityType__GetAllOperationNames()
	{
		return entityTypeEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRelation()
	{
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__ToString()
	{
		return relationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRelation__GetEntityType()
	{
		return relationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute()
	{
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Identifier()
	{
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_UnmappedDefaultOnly()
	{
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAttribute__ToString()
	{
		return attributeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAttribute__IsPrimitive()
	{
		return attributeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAttribute__GetEntityType()
	{
		return attributeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociationEnd()
	{
		return associationEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationEnd_Partner()
	{
		return (EReference)associationEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociationEnd_ReverseCascadeDelete()
	{
		return (EAttribute)associationEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssociationEnd_UnmappedDefaultOnly()
	{
		return (EAttribute)associationEndEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getAssociationEnd__GetOpposite()
	{
		return associationEndEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceTypedElement()
	{
		return referenceTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceTypedElement_Target()
	{
		return (EReference)referenceTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReferenceTypedElement_Cardinality()
	{
		return (EReference)referenceTypedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReferenceTypedElement__IsCollection()
	{
		return referenceTypedElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReferenceTypedElement__IsRequired()
	{
		return referenceTypedElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReferenceTypedElement__GetEntityType()
	{
		return referenceTypedElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveTypedElement()
	{
		return primitiveTypedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPrimitiveTypedElement_DataType()
	{
		return (EReference)primitiveTypedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimitiveTypedElement_Required()
	{
		return (EAttribute)primitiveTypedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitiveTypedElement__GetEntityType()
	{
		return primitiveTypedElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainment()
	{
		return containmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntityMember()
	{
		return entityMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequence()
	{
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSequence_InitialValue()
	{
		return (EAttribute)sequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSequence_Increment()
	{
		return (EAttribute)sequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSequence_MaximumValue()
	{
		return (EAttribute)sequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSequence_Cyclic()
	{
		return (EAttribute)sequenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntitySequence()
	{
		return entitySequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamespaceSequence()
	{
		return namespaceSequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoundOperation()
	{
		return boundOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoundOperation_Implementation()
	{
		return (EReference)boundOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoundOperation_InstanceRepresentation()
	{
		return (EReference)boundOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoundOperation_Abstract()
	{
		return (EAttribute)boundOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationBody()
	{
		return operationBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationBody_Stateful()
	{
		return (EAttribute)operationBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationBody_CustomImplementation()
	{
		return (EAttribute)operationBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationBody_Body()
	{
		return (EAttribute)operationBodyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataFactory getDataFactory()
	{
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
	public void createPackageContents()
	{
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		entityTypeEClass = createEClass(ENTITY_TYPE);
		createEReference(entityTypeEClass, ENTITY_TYPE__SUPER_ENTITY_TYPES);
		createEAttribute(entityTypeEClass, ENTITY_TYPE__ABSTRACT);
		createEReference(entityTypeEClass, ENTITY_TYPE__ATTRIBUTES);
		createEReference(entityTypeEClass, ENTITY_TYPE__RELATIONS);
		createEReference(entityTypeEClass, ENTITY_TYPE__DATA_PROPERTIES);
		createEReference(entityTypeEClass, ENTITY_TYPE__NAVIGATION_PROPERTIES);
		createEReference(entityTypeEClass, ENTITY_TYPE__SEQUENCES);
		createEReference(entityTypeEClass, ENTITY_TYPE__OPERATIONS);
		createEReference(entityTypeEClass, ENTITY_TYPE__CONSTRAINTS);
		createEReference(entityTypeEClass, ENTITY_TYPE__DEFAULT_REPRESENTATION);
		createEOperation(entityTypeEClass, ENTITY_TYPE___GET_ALL_SUPER_ENTITY_TYPES);
		createEOperation(entityTypeEClass, ENTITY_TYPE___GET_ATTRIBUTE__STRING);
		createEOperation(entityTypeEClass, ENTITY_TYPE___GET_REFERENCE__STRING);
		createEOperation(entityTypeEClass, ENTITY_TYPE___GET_ATTRIBUTE_TYPE__STRING);
		createEOperation(entityTypeEClass, ENTITY_TYPE___TO_STRING);
		createEOperation(entityTypeEClass, ENTITY_TYPE___IS_CONTAINER);
		createEOperation(entityTypeEClass, ENTITY_TYPE___IS_CONTAINMENT);
		createEOperation(entityTypeEClass, ENTITY_TYPE___GET_ALL_RELATIONS);
		createEOperation(entityTypeEClass, ENTITY_TYPE___GET_ALL_ATTRIBUTES);
		createEOperation(entityTypeEClass, ENTITY_TYPE___GET_ALL_DATA_PROPERTIES);
		createEOperation(entityTypeEClass, ENTITY_TYPE___GET_ALL_NAVIGATION_PROPERTIES);
		createEOperation(entityTypeEClass, ENTITY_TYPE___GET_ALL_SEQUENCES);
		createEOperation(entityTypeEClass, ENTITY_TYPE___GET_INHERITED_OPERATION_IMPLEMENTATION_BY_NAME__STRING);
		createEOperation(entityTypeEClass, ENTITY_TYPE___GET_INHERITED_OPERATION_IMPLEMENTATIONS_BY_NAME__STRING);
		createEOperation(entityTypeEClass, ENTITY_TYPE___GET_INHERITED_OPERATION_NAMES);
		createEOperation(entityTypeEClass, ENTITY_TYPE___GET_ALL_OPERATION_NAMES);

		relationEClass = createEClass(RELATION);
		createEOperation(relationEClass, RELATION___TO_STRING);
		createEOperation(relationEClass, RELATION___GET_ENTITY_TYPE);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__IDENTIFIER);
		createEAttribute(attributeEClass, ATTRIBUTE__UNMAPPED_DEFAULT_ONLY);
		createEOperation(attributeEClass, ATTRIBUTE___TO_STRING);
		createEOperation(attributeEClass, ATTRIBUTE___IS_PRIMITIVE);
		createEOperation(attributeEClass, ATTRIBUTE___GET_ENTITY_TYPE);

		associationEndEClass = createEClass(ASSOCIATION_END);
		createEReference(associationEndEClass, ASSOCIATION_END__PARTNER);
		createEAttribute(associationEndEClass, ASSOCIATION_END__REVERSE_CASCADE_DELETE);
		createEAttribute(associationEndEClass, ASSOCIATION_END__UNMAPPED_DEFAULT_ONLY);
		createEOperation(associationEndEClass, ASSOCIATION_END___GET_OPPOSITE);

		referenceTypedElementEClass = createEClass(REFERENCE_TYPED_ELEMENT);
		createEReference(referenceTypedElementEClass, REFERENCE_TYPED_ELEMENT__TARGET);
		createEReference(referenceTypedElementEClass, REFERENCE_TYPED_ELEMENT__CARDINALITY);
		createEOperation(referenceTypedElementEClass, REFERENCE_TYPED_ELEMENT___IS_COLLECTION);
		createEOperation(referenceTypedElementEClass, REFERENCE_TYPED_ELEMENT___IS_REQUIRED);
		createEOperation(referenceTypedElementEClass, REFERENCE_TYPED_ELEMENT___GET_ENTITY_TYPE);

		primitiveTypedElementEClass = createEClass(PRIMITIVE_TYPED_ELEMENT);
		createEReference(primitiveTypedElementEClass, PRIMITIVE_TYPED_ELEMENT__DATA_TYPE);
		createEAttribute(primitiveTypedElementEClass, PRIMITIVE_TYPED_ELEMENT__REQUIRED);
		createEOperation(primitiveTypedElementEClass, PRIMITIVE_TYPED_ELEMENT___GET_ENTITY_TYPE);

		containmentEClass = createEClass(CONTAINMENT);

		entityMemberEClass = createEClass(ENTITY_MEMBER);

		sequenceEClass = createEClass(SEQUENCE);
		createEAttribute(sequenceEClass, SEQUENCE__INITIAL_VALUE);
		createEAttribute(sequenceEClass, SEQUENCE__INCREMENT);
		createEAttribute(sequenceEClass, SEQUENCE__MAXIMUM_VALUE);
		createEAttribute(sequenceEClass, SEQUENCE__CYCLIC);

		entitySequenceEClass = createEClass(ENTITY_SEQUENCE);

		namespaceSequenceEClass = createEClass(NAMESPACE_SEQUENCE);

		boundOperationEClass = createEClass(BOUND_OPERATION);
		createEReference(boundOperationEClass, BOUND_OPERATION__IMPLEMENTATION);
		createEReference(boundOperationEClass, BOUND_OPERATION__INSTANCE_REPRESENTATION);
		createEAttribute(boundOperationEClass, BOUND_OPERATION__ABSTRACT);

		operationBodyEClass = createEClass(OPERATION_BODY);
		createEAttribute(operationBodyEClass, OPERATION_BODY__STATEFUL);
		createEAttribute(operationBodyEClass, OPERATION_BODY__CUSTOM_IMPLEMENTATION);
		createEAttribute(operationBodyEClass, OPERATION_BODY__BODY);
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
		DerivedPackage theDerivedPackage = (DerivedPackage)EPackage.Registry.INSTANCE.getEPackage(DerivedPackage.eNS_URI);
		ConstraintPackage theConstraintPackage = (ConstraintPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintPackage.eNS_URI);
		ServicePackage theServicePackage = (ServicePackage)EPackage.Registry.INSTANCE.getEPackage(ServicePackage.eNS_URI);
		NamespacePackage theNamespacePackage = (NamespacePackage)EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI);
		ScriptPackage theScriptPackage = (ScriptPackage)EPackage.Registry.INSTANCE.getEPackage(ScriptPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		entityTypeEClass.getESuperTypes().add(theTypePackage.getType());
		relationEClass.getESuperTypes().add(this.getReferenceTypedElement());
		relationEClass.getESuperTypes().add(this.getEntityMember());
		attributeEClass.getESuperTypes().add(this.getPrimitiveTypedElement());
		attributeEClass.getESuperTypes().add(this.getEntityMember());
		associationEndEClass.getESuperTypes().add(this.getRelation());
		referenceTypedElementEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
		primitiveTypedElementEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
		containmentEClass.getESuperTypes().add(this.getRelation());
		sequenceEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
		entitySequenceEClass.getESuperTypes().add(this.getEntityMember());
		entitySequenceEClass.getESuperTypes().add(this.getSequence());
		namespaceSequenceEClass.getESuperTypes().add(this.getSequence());
		namespaceSequenceEClass.getESuperTypes().add(theNamespacePackage.getNamespaceElement());
		boundOperationEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
		boundOperationEClass.getESuperTypes().add(theServicePackage.getOperationDeclaration());

		// Initialize classes, features, and operations; add parameters
		initEClass(entityTypeEClass, EntityType.class, "EntityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntityType_SuperEntityTypes(), this.getEntityType(), null, "superEntityTypes", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntityType_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 1, 1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_Relations(), this.getRelation(), null, "relations", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_DataProperties(), theDerivedPackage.getDataProperty(), null, "dataProperties", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_NavigationProperties(), theDerivedPackage.getNavigationProperty(), null, "navigationProperties", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_Sequences(), this.getEntitySequence(), null, "sequences", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_Operations(), this.getBoundOperation(), null, "operations", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_Constraints(), theConstraintPackage.getInvariantConstraint(), null, "constraints", null, 0, -1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntityType_DefaultRepresentation(), theServicePackage.getMappedTransferObjectType(), null, "defaultRepresentation", null, 0, 1, EntityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEntityType__GetAllSuperEntityTypes(), this.getEntityType(), "getAllSuperEntityTypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getEntityType__GetAttribute__String(), this.getPrimitiveTypedElement(), "getAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getEntityType__GetReference__String(), this.getReferenceTypedElement(), "getReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getEntityType__GetAttributeType__String(), theTypePackage.getPrimitive(), "getAttributeType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEntityType__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEntityType__IsContainer(), ecorePackage.getEBoolean(), "isContainer", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEntityType__IsContainment(), ecorePackage.getEBoolean(), "isContainment", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEntityType__GetAllRelations(), this.getRelation(), "getAllRelations", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEntityType__GetAllAttributes(), this.getAttribute(), "getAllAttributes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEntityType__GetAllDataProperties(), theDerivedPackage.getDataProperty(), "getAllDataProperties", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEntityType__GetAllNavigationProperties(), theDerivedPackage.getNavigationProperty(), "getAllNavigationProperties", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEntityType__GetAllSequences(), this.getEntitySequence(), "getAllSequences", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getEntityType__GetInheritedOperationImplementationByName__String(), this.getOperationBody(), "getInheritedOperationImplementationByName", 1, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEntityType__GetInheritedOperationImplementationsByName__String(), this.getOperationBody(), "getInheritedOperationImplementationsByName", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEntityType__GetInheritedOperationNames(), ecorePackage.getEString(), "getInheritedOperationNames", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEntityType__GetAllOperationNames(), ecorePackage.getEString(), "getAllOperationNames", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getRelation__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRelation__GetEntityType(), this.getEntityType(), "getEntityType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Identifier(), ecorePackage.getEBoolean(), "identifier", null, 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAttribute_UnmappedDefaultOnly(), ecorePackage.getEBoolean(), "unmappedDefaultOnly", "false", 1, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAttribute__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAttribute__IsPrimitive(), ecorePackage.getEBoolean(), "isPrimitive", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAttribute__GetEntityType(), this.getEntityType(), "getEntityType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(associationEndEClass, AssociationEnd.class, "AssociationEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationEnd_Partner(), this.getAssociationEnd(), null, "partner", null, 0, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationEnd_ReverseCascadeDelete(), ecorePackage.getEBoolean(), "reverseCascadeDelete", "false", 1, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociationEnd_UnmappedDefaultOnly(), ecorePackage.getEBoolean(), "unmappedDefaultOnly", "false", 1, 1, AssociationEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAssociationEnd__GetOpposite(), this.getRelation(), "getOpposite", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(referenceTypedElementEClass, ReferenceTypedElement.class, "ReferenceTypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceTypedElement_Target(), this.getEntityType(), null, "target", null, 1, 1, ReferenceTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceTypedElement_Cardinality(), theTypePackage.getCardinality(), null, "cardinality", null, 1, 1, ReferenceTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getReferenceTypedElement__IsCollection(), ecorePackage.getEBoolean(), "isCollection", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReferenceTypedElement__IsRequired(), ecorePackage.getEBoolean(), "isRequired", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getReferenceTypedElement__GetEntityType(), this.getEntityType(), "getEntityType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(primitiveTypedElementEClass, PrimitiveTypedElement.class, "PrimitiveTypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrimitiveTypedElement_DataType(), theTypePackage.getPrimitive(), null, "dataType", null, 1, 1, PrimitiveTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrimitiveTypedElement_Required(), ecorePackage.getEBoolean(), "required", null, 1, 1, PrimitiveTypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPrimitiveTypedElement__GetEntityType(), this.getEntityType(), "getEntityType", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(containmentEClass, Containment.class, "Containment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(entityMemberEClass, EntityMember.class, "EntityMember", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceEClass, Sequence.class, "Sequence", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequence_InitialValue(), ecorePackage.getELong(), "initialValue", "0", 1, 1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequence_Increment(), ecorePackage.getELong(), "increment", "1", 1, 1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequence_MaximumValue(), ecorePackage.getELong(), "maximumValue", null, 0, 1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequence_Cyclic(), ecorePackage.getEBoolean(), "cyclic", "false", 1, 1, Sequence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entitySequenceEClass, EntitySequence.class, "EntitySequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namespaceSequenceEClass, NamespaceSequence.class, "NamespaceSequence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(boundOperationEClass, BoundOperation.class, "BoundOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBoundOperation_Implementation(), this.getOperationBody(), null, "implementation", null, 0, 1, BoundOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoundOperation_InstanceRepresentation(), theServicePackage.getMappedTransferObjectType(), null, "instanceRepresentation", null, 1, 1, BoundOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBoundOperation_Abstract(), ecorePackage.getEBoolean(), "abstract", "false", 1, 1, BoundOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationBodyEClass, OperationBody.class, "OperationBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperationBody_Stateful(), ecorePackage.getEBoolean(), "stateful", null, 1, 1, OperationBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationBody_CustomImplementation(), ecorePackage.getEBoolean(), "customImplementation", null, 1, 1, OperationBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationBody_Body(), theScriptPackage.getScript(), "body", null, 0, 1, OperationBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //DataPackageImpl
