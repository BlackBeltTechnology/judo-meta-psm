/**
 */
package hu.blackbelt.judo.meta.psm.type.impl;

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

import hu.blackbelt.judo.meta.psm.service.ServicePackage;

import hu.blackbelt.judo.meta.psm.service.impl.ServicePackageImpl;

import hu.blackbelt.judo.meta.psm.type.BinaryType;
import hu.blackbelt.judo.meta.psm.type.BooleanType;
import hu.blackbelt.judo.meta.psm.type.Cardinality;
import hu.blackbelt.judo.meta.psm.type.CustomType;
import hu.blackbelt.judo.meta.psm.type.DataType;
import hu.blackbelt.judo.meta.psm.type.DateType;
import hu.blackbelt.judo.meta.psm.type.EnumerationMember;
import hu.blackbelt.judo.meta.psm.type.EnumerationType;
import hu.blackbelt.judo.meta.psm.type.FlatPrimitiveType;
import hu.blackbelt.judo.meta.psm.type.NumericType;
import hu.blackbelt.judo.meta.psm.type.PasswordType;
import hu.blackbelt.judo.meta.psm.type.Primitive;
import hu.blackbelt.judo.meta.psm.type.StringType;
import hu.blackbelt.judo.meta.psm.type.TimeType;
import hu.blackbelt.judo.meta.psm.type.TimestampType;
import hu.blackbelt.judo.meta.psm.type.Type;
import hu.blackbelt.judo.meta.psm.type.TypeFactory;
import hu.blackbelt.judo.meta.psm.type.TypePackage;
import hu.blackbelt.judo.meta.psm.type.XMLType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class TypePackageImpl extends EPackageImpl implements TypePackage
{
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numericTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passwordTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timestampTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flatPrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType regExpEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType xmlNamespaceEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType xmlElementEDataType = null;

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
	 * @see hu.blackbelt.judo.meta.psm.type.TypePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypePackageImpl()
	{
		super(eNS_URI, TypeFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TypePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypePackage init()
	{
		if (isInited) return (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTypePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TypePackageImpl theTypePackage = registeredTypePackage instanceof TypePackageImpl ? (TypePackageImpl)registeredTypePackage : new TypePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PsmPackage.eNS_URI);
		PsmPackageImpl thePsmPackage = (PsmPackageImpl)(registeredPackage instanceof PsmPackageImpl ? registeredPackage : PsmPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI);
		NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(registeredPackage instanceof NamespacePackageImpl ? registeredPackage : NamespacePackage.eINSTANCE);
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
		theTypePackage.createPackageContents();
		thePsmPackage.createPackageContents();
		theNamespacePackage.createPackageContents();
		theDataPackage.createPackageContents();
		theConstraintPackage.createPackageContents();
		theScriptPackage.createPackageContents();
		theDerivedPackage.createPackageContents();
		theServicePackage.createPackageContents();
		theAccesspointPackage.createPackageContents();
		theMeasurePackage.createPackageContents();

		// Initialize created meta-data
		theTypePackage.initializePackageContents();
		thePsmPackage.initializePackageContents();
		theNamespacePackage.initializePackageContents();
		theDataPackage.initializePackageContents();
		theConstraintPackage.initializePackageContents();
		theScriptPackage.initializePackageContents();
		theDerivedPackage.initializePackageContents();
		theServicePackage.initializePackageContents();
		theAccesspointPackage.initializePackageContents();
		theMeasurePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypePackage.eNS_URI, theTypePackage);
		return theTypePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitive()
	{
		return primitiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitive__IsNumeric()
	{
		return primitiveEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitive__IsInteger()
	{
		return primitiveEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitive__IsDecimal()
	{
		return primitiveEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitive__IsString()
	{
		return primitiveEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitive__IsBoolean()
	{
		return primitiveEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitive__IsDate()
	{
		return primitiveEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitive__IsTimestamp()
	{
		return primitiveEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitive__IsEnumeration()
	{
		return primitiveEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitive__IsMeasured()
	{
		return primitiveEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPrimitive__IsTime()
	{
		return primitiveEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCustomType()
	{
		return customTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCustomType__ToString()
	{
		return customTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringType()
	{
		return stringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringType_MaxLength()
	{
		return (EAttribute)stringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringType_RegExp()
	{
		return (EAttribute)stringTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStringType__ToString()
	{
		return stringTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNumericType()
	{
		return numericTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumericType_Precision()
	{
		return (EAttribute)numericTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNumericType_Scale()
	{
		return (EAttribute)numericTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNumericType__ToString()
	{
		return numericTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanType()
	{
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBooleanType__ToString()
	{
		return booleanTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerationType()
	{
		return enumerationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnumerationType_Members()
	{
		return (EReference)enumerationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumerationType__Contains__String()
	{
		return enumerationTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnumerationType__ToString()
	{
		return enumerationTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnumerationMember()
	{
		return enumerationMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnumerationMember_Ordinal()
	{
		return (EAttribute)enumerationMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType()
	{
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataType()
	{
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getXMLType()
	{
		return xmlTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMLType_XmlNamespace()
	{
		return (EAttribute)xmlTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getXMLType_XmlElement()
	{
		return (EAttribute)xmlTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getXMLType__ToString()
	{
		return xmlTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCardinality()
	{
		return cardinalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardinality_Lower()
	{
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCardinality_Upper()
	{
		return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPasswordType()
	{
		return passwordTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPasswordType__ToString()
	{
		return passwordTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDateType()
	{
		return dateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDateType__ToString()
	{
		return dateTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimestampType()
	{
		return timestampTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimestampType_BaseUnit()
	{
		return (EAttribute)timestampTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTimestampType__ToString()
	{
		return timestampTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFlatPrimitiveType()
	{
		return flatPrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinaryType()
	{
		return binaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryType_MimeTypes()
	{
		return (EAttribute)binaryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinaryType_MaxFileSize()
	{
		return (EAttribute)binaryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBinaryType__ToString()
	{
		return binaryTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimeType()
	{
		return timeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimeType_BaseUnit()
	{
		return (EAttribute)timeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTimeType__ToString()
	{
		return timeTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRegExp()
	{
		return regExpEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getXmlNamespace()
	{
		return xmlNamespaceEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getXmlElement()
	{
		return xmlElementEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeFactory getTypeFactory()
	{
		return (TypeFactory)getEFactoryInstance();
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
		primitiveEClass = createEClass(PRIMITIVE);
		createEOperation(primitiveEClass, PRIMITIVE___IS_NUMERIC);
		createEOperation(primitiveEClass, PRIMITIVE___IS_INTEGER);
		createEOperation(primitiveEClass, PRIMITIVE___IS_DECIMAL);
		createEOperation(primitiveEClass, PRIMITIVE___IS_STRING);
		createEOperation(primitiveEClass, PRIMITIVE___IS_BOOLEAN);
		createEOperation(primitiveEClass, PRIMITIVE___IS_DATE);
		createEOperation(primitiveEClass, PRIMITIVE___IS_TIMESTAMP);
		createEOperation(primitiveEClass, PRIMITIVE___IS_ENUMERATION);
		createEOperation(primitiveEClass, PRIMITIVE___IS_MEASURED);
		createEOperation(primitiveEClass, PRIMITIVE___IS_TIME);

		customTypeEClass = createEClass(CUSTOM_TYPE);
		createEOperation(customTypeEClass, CUSTOM_TYPE___TO_STRING);

		stringTypeEClass = createEClass(STRING_TYPE);
		createEAttribute(stringTypeEClass, STRING_TYPE__MAX_LENGTH);
		createEAttribute(stringTypeEClass, STRING_TYPE__REG_EXP);
		createEOperation(stringTypeEClass, STRING_TYPE___TO_STRING);

		numericTypeEClass = createEClass(NUMERIC_TYPE);
		createEAttribute(numericTypeEClass, NUMERIC_TYPE__PRECISION);
		createEAttribute(numericTypeEClass, NUMERIC_TYPE__SCALE);
		createEOperation(numericTypeEClass, NUMERIC_TYPE___TO_STRING);

		booleanTypeEClass = createEClass(BOOLEAN_TYPE);
		createEOperation(booleanTypeEClass, BOOLEAN_TYPE___TO_STRING);

		enumerationTypeEClass = createEClass(ENUMERATION_TYPE);
		createEReference(enumerationTypeEClass, ENUMERATION_TYPE__MEMBERS);
		createEOperation(enumerationTypeEClass, ENUMERATION_TYPE___CONTAINS__STRING);
		createEOperation(enumerationTypeEClass, ENUMERATION_TYPE___TO_STRING);

		enumerationMemberEClass = createEClass(ENUMERATION_MEMBER);
		createEAttribute(enumerationMemberEClass, ENUMERATION_MEMBER__ORDINAL);

		typeEClass = createEClass(TYPE);

		dataTypeEClass = createEClass(DATA_TYPE);

		xmlTypeEClass = createEClass(XML_TYPE);
		createEAttribute(xmlTypeEClass, XML_TYPE__XML_NAMESPACE);
		createEAttribute(xmlTypeEClass, XML_TYPE__XML_ELEMENT);
		createEOperation(xmlTypeEClass, XML_TYPE___TO_STRING);

		cardinalityEClass = createEClass(CARDINALITY);
		createEAttribute(cardinalityEClass, CARDINALITY__LOWER);
		createEAttribute(cardinalityEClass, CARDINALITY__UPPER);

		passwordTypeEClass = createEClass(PASSWORD_TYPE);
		createEOperation(passwordTypeEClass, PASSWORD_TYPE___TO_STRING);

		dateTypeEClass = createEClass(DATE_TYPE);
		createEOperation(dateTypeEClass, DATE_TYPE___TO_STRING);

		timestampTypeEClass = createEClass(TIMESTAMP_TYPE);
		createEAttribute(timestampTypeEClass, TIMESTAMP_TYPE__BASE_UNIT);
		createEOperation(timestampTypeEClass, TIMESTAMP_TYPE___TO_STRING);

		flatPrimitiveTypeEClass = createEClass(FLAT_PRIMITIVE_TYPE);

		binaryTypeEClass = createEClass(BINARY_TYPE);
		createEAttribute(binaryTypeEClass, BINARY_TYPE__MIME_TYPES);
		createEAttribute(binaryTypeEClass, BINARY_TYPE__MAX_FILE_SIZE);
		createEOperation(binaryTypeEClass, BINARY_TYPE___TO_STRING);

		timeTypeEClass = createEClass(TIME_TYPE);
		createEAttribute(timeTypeEClass, TIME_TYPE__BASE_UNIT);
		createEOperation(timeTypeEClass, TIME_TYPE___TO_STRING);

		// Create data types
		regExpEDataType = createEDataType(REG_EXP);
		xmlNamespaceEDataType = createEDataType(XML_NAMESPACE);
		xmlElementEDataType = createEDataType(XML_ELEMENT);
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
		MeasurePackage theMeasurePackage = (MeasurePackage)EPackage.Registry.INSTANCE.getEPackage(MeasurePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		primitiveEClass.getESuperTypes().add(this.getDataType());
		customTypeEClass.getESuperTypes().add(this.getFlatPrimitiveType());
		stringTypeEClass.getESuperTypes().add(this.getFlatPrimitiveType());
		numericTypeEClass.getESuperTypes().add(this.getFlatPrimitiveType());
		booleanTypeEClass.getESuperTypes().add(this.getFlatPrimitiveType());
		enumerationTypeEClass.getESuperTypes().add(this.getPrimitive());
		enumerationMemberEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
		typeEClass.getESuperTypes().add(theNamespacePackage.getNamespaceElement());
		dataTypeEClass.getESuperTypes().add(this.getType());
		xmlTypeEClass.getESuperTypes().add(this.getFlatPrimitiveType());
		passwordTypeEClass.getESuperTypes().add(this.getFlatPrimitiveType());
		dateTypeEClass.getESuperTypes().add(this.getFlatPrimitiveType());
		timestampTypeEClass.getESuperTypes().add(this.getFlatPrimitiveType());
		flatPrimitiveTypeEClass.getESuperTypes().add(this.getPrimitive());
		binaryTypeEClass.getESuperTypes().add(this.getFlatPrimitiveType());
		timeTypeEClass.getESuperTypes().add(this.getFlatPrimitiveType());

		// Initialize classes, features, and operations; add parameters
		initEClass(primitiveEClass, Primitive.class, "Primitive", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPrimitive__IsNumeric(), ecorePackage.getEBoolean(), "isNumeric", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPrimitive__IsInteger(), ecorePackage.getEBoolean(), "isInteger", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPrimitive__IsDecimal(), ecorePackage.getEBoolean(), "isDecimal", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPrimitive__IsString(), ecorePackage.getEBoolean(), "isString", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPrimitive__IsBoolean(), ecorePackage.getEBoolean(), "isBoolean", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPrimitive__IsDate(), ecorePackage.getEBoolean(), "isDate", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPrimitive__IsTimestamp(), ecorePackage.getEBoolean(), "isTimestamp", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPrimitive__IsEnumeration(), ecorePackage.getEBoolean(), "isEnumeration", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPrimitive__IsMeasured(), ecorePackage.getEBoolean(), "isMeasured", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPrimitive__IsTime(), ecorePackage.getEBoolean(), "isTime", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(customTypeEClass, CustomType.class, "CustomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getCustomType__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringType_MaxLength(), ecorePackage.getEInt(), "maxLength", null, 1, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringType_RegExp(), this.getRegExp(), "regExp", null, 0, 1, StringType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getStringType__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(numericTypeEClass, NumericType.class, "NumericType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumericType_Precision(), ecorePackage.getEInt(), "precision", null, 1, 1, NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumericType_Scale(), ecorePackage.getEInt(), "scale", null, 1, 1, NumericType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNumericType__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getBooleanType__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(enumerationTypeEClass, EnumerationType.class, "EnumerationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationType_Members(), this.getEnumerationMember(), null, "members", null, 1, -1, EnumerationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getEnumerationType__Contains__String(), ecorePackage.getEBoolean(), "contains", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getEnumerationType__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(enumerationMemberEClass, EnumerationMember.class, "EnumerationMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnumerationMember_Ordinal(), ecorePackage.getEInt(), "ordinal", null, 1, 1, EnumerationMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataTypeEClass, DataType.class, "DataType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlTypeEClass, XMLType.class, "XMLType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXMLType_XmlNamespace(), this.getXmlNamespace(), "xmlNamespace", null, 1, 1, XMLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXMLType_XmlElement(), this.getXmlElement(), "xmlElement", null, 1, 1, XMLType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getXMLType__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardinality_Lower(), ecorePackage.getEInt(), "lower", "0", 1, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardinality_Upper(), ecorePackage.getEInt(), "upper", "1", 1, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(passwordTypeEClass, PasswordType.class, "PasswordType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getPasswordType__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dateTypeEClass, DateType.class, "DateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getDateType__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timestampTypeEClass, TimestampType.class, "TimestampType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimestampType_BaseUnit(), theMeasurePackage.getDurationType(), "baseUnit", "second", 1, 1, TimestampType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTimestampType__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(flatPrimitiveTypeEClass, FlatPrimitiveType.class, "FlatPrimitiveType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(binaryTypeEClass, BinaryType.class, "BinaryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinaryType_MimeTypes(), ecorePackage.getEString(), "mimeTypes", null, 0, -1, BinaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBinaryType_MaxFileSize(), ecorePackage.getELong(), "maxFileSize", null, 0, 1, BinaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBinaryType__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timeTypeEClass, TimeType.class, "TimeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeType_BaseUnit(), theMeasurePackage.getDurationType(), "baseUnit", "second", 1, 1, TimeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTimeType__ToString(), ecorePackage.getEString(), "toString", 1, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize data types
		initEDataType(regExpEDataType, String.class, "RegExp", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(xmlNamespaceEDataType, String.class, "XmlNamespace", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(xmlElementEDataType, String.class, "XmlElement", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
	}

} //TypePackageImpl
