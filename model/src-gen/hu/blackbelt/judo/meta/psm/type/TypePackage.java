/**
 */
package hu.blackbelt.judo.meta.psm.type;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.type.TypeFactory
 * @model kind="package"
 * @generated
 */
public interface TypePackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "type";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/psm/type";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "type";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypePackage eINSTANCE = hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypeImpl
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NamespacePackage.NAMESPACE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__DOCUMENTATION = NamespacePackage.NAMESPACE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__ANNOTATIONS = NamespacePackage.NAMESPACE_ELEMENT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NamespacePackage.NAMESPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___TO_STRING = NamespacePackage.NAMESPACE_ELEMENT___TO_STRING;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE___GET_NAMESPACE = NamespacePackage.NAMESPACE_ELEMENT___GET_NAMESPACE;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = NamespacePackage.NAMESPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.type.impl.DataTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__DOCUMENTATION = TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___TO_STRING = TYPE___TO_STRING;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE___GET_NAMESPACE = TYPE___GET_NAMESPACE;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.PrimitiveImpl <em>Primitive</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.type.impl.PrimitiveImpl
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getPrimitive()
	 * @generated
	 */
	int PRIMITIVE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__NAME = DATA_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__DOCUMENTATION = DATA_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE__ANNOTATIONS = DATA_TYPE__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE___TO_STRING = DATA_TYPE___TO_STRING;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE___GET_NAMESPACE = DATA_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Numeric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE___IS_NUMERIC = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE___IS_INTEGER = DATA_TYPE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Decimal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE___IS_DECIMAL = DATA_TYPE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Is String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE___IS_STRING = DATA_TYPE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Is Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE___IS_BOOLEAN = DATA_TYPE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Is Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE___IS_DATE = DATA_TYPE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Is Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE___IS_TIMESTAMP = DATA_TYPE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Enumeration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE___IS_ENUMERATION = DATA_TYPE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Is Measured</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE___IS_MEASURED = DATA_TYPE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Is Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE___IS_TIME = DATA_TYPE_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>Primitive</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.FlatPrimitiveTypeImpl <em>Flat Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.type.impl.FlatPrimitiveTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getFlatPrimitiveType()
	 * @generated
	 */
	int FLAT_PRIMITIVE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_PRIMITIVE_TYPE__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_PRIMITIVE_TYPE__DOCUMENTATION = PRIMITIVE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_PRIMITIVE_TYPE__ANNOTATIONS = PRIMITIVE__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Flat Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_PRIMITIVE_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_PRIMITIVE_TYPE___TO_STRING = PRIMITIVE___TO_STRING;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_PRIMITIVE_TYPE___GET_NAMESPACE = PRIMITIVE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Numeric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_PRIMITIVE_TYPE___IS_NUMERIC = PRIMITIVE___IS_NUMERIC;

	/**
	 * The operation id for the '<em>Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_PRIMITIVE_TYPE___IS_INTEGER = PRIMITIVE___IS_INTEGER;

	/**
	 * The operation id for the '<em>Is Decimal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_PRIMITIVE_TYPE___IS_DECIMAL = PRIMITIVE___IS_DECIMAL;

	/**
	 * The operation id for the '<em>Is String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_PRIMITIVE_TYPE___IS_STRING = PRIMITIVE___IS_STRING;

	/**
	 * The operation id for the '<em>Is Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_PRIMITIVE_TYPE___IS_BOOLEAN = PRIMITIVE___IS_BOOLEAN;

	/**
	 * The operation id for the '<em>Is Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_PRIMITIVE_TYPE___IS_DATE = PRIMITIVE___IS_DATE;

	/**
	 * The operation id for the '<em>Is Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_PRIMITIVE_TYPE___IS_TIMESTAMP = PRIMITIVE___IS_TIMESTAMP;

	/**
	 * The operation id for the '<em>Is Enumeration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_PRIMITIVE_TYPE___IS_ENUMERATION = PRIMITIVE___IS_ENUMERATION;

	/**
	 * The operation id for the '<em>Is Measured</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_PRIMITIVE_TYPE___IS_MEASURED = PRIMITIVE___IS_MEASURED;

	/**
	 * The operation id for the '<em>Is Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_PRIMITIVE_TYPE___IS_TIME = PRIMITIVE___IS_TIME;

	/**
	 * The number of operations of the '<em>Flat Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLAT_PRIMITIVE_TYPE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.CustomTypeImpl <em>Custom Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.type.impl.CustomTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getCustomType()
	 * @generated
	 */
	int CUSTOM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE__NAME = FLAT_PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE__DOCUMENTATION = FLAT_PRIMITIVE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE__ANNOTATIONS = FLAT_PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Custom Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE_FEATURE_COUNT = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE___GET_NAMESPACE = FLAT_PRIMITIVE_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Numeric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE___IS_NUMERIC = FLAT_PRIMITIVE_TYPE___IS_NUMERIC;

	/**
	 * The operation id for the '<em>Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE___IS_INTEGER = FLAT_PRIMITIVE_TYPE___IS_INTEGER;

	/**
	 * The operation id for the '<em>Is Decimal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE___IS_DECIMAL = FLAT_PRIMITIVE_TYPE___IS_DECIMAL;

	/**
	 * The operation id for the '<em>Is String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE___IS_STRING = FLAT_PRIMITIVE_TYPE___IS_STRING;

	/**
	 * The operation id for the '<em>Is Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE___IS_BOOLEAN = FLAT_PRIMITIVE_TYPE___IS_BOOLEAN;

	/**
	 * The operation id for the '<em>Is Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE___IS_DATE = FLAT_PRIMITIVE_TYPE___IS_DATE;

	/**
	 * The operation id for the '<em>Is Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE___IS_TIMESTAMP = FLAT_PRIMITIVE_TYPE___IS_TIMESTAMP;

	/**
	 * The operation id for the '<em>Is Enumeration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE___IS_ENUMERATION = FLAT_PRIMITIVE_TYPE___IS_ENUMERATION;

	/**
	 * The operation id for the '<em>Is Measured</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE___IS_MEASURED = FLAT_PRIMITIVE_TYPE___IS_MEASURED;

	/**
	 * The operation id for the '<em>Is Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE___IS_TIME = FLAT_PRIMITIVE_TYPE___IS_TIME;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE___TO_STRING = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Custom Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_TYPE_OPERATION_COUNT = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.StringTypeImpl <em>String Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.type.impl.StringTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getStringType()
	 * @generated
	 */
	int STRING_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__NAME = FLAT_PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__DOCUMENTATION = FLAT_PRIMITIVE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__ANNOTATIONS = FLAT_PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__MAX_LENGTH = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Reg Exp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE__REG_EXP = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_FEATURE_COUNT = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE___GET_NAMESPACE = FLAT_PRIMITIVE_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Numeric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE___IS_NUMERIC = FLAT_PRIMITIVE_TYPE___IS_NUMERIC;

	/**
	 * The operation id for the '<em>Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE___IS_INTEGER = FLAT_PRIMITIVE_TYPE___IS_INTEGER;

	/**
	 * The operation id for the '<em>Is Decimal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE___IS_DECIMAL = FLAT_PRIMITIVE_TYPE___IS_DECIMAL;

	/**
	 * The operation id for the '<em>Is String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE___IS_STRING = FLAT_PRIMITIVE_TYPE___IS_STRING;

	/**
	 * The operation id for the '<em>Is Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE___IS_BOOLEAN = FLAT_PRIMITIVE_TYPE___IS_BOOLEAN;

	/**
	 * The operation id for the '<em>Is Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE___IS_DATE = FLAT_PRIMITIVE_TYPE___IS_DATE;

	/**
	 * The operation id for the '<em>Is Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE___IS_TIMESTAMP = FLAT_PRIMITIVE_TYPE___IS_TIMESTAMP;

	/**
	 * The operation id for the '<em>Is Enumeration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE___IS_ENUMERATION = FLAT_PRIMITIVE_TYPE___IS_ENUMERATION;

	/**
	 * The operation id for the '<em>Is Measured</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE___IS_MEASURED = FLAT_PRIMITIVE_TYPE___IS_MEASURED;

	/**
	 * The operation id for the '<em>Is Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE___IS_TIME = FLAT_PRIMITIVE_TYPE___IS_TIME;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE___TO_STRING = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_OPERATION_COUNT = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.type.impl.NumericTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getNumericType()
	 * @generated
	 */
	int NUMERIC_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__NAME = FLAT_PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__DOCUMENTATION = FLAT_PRIMITIVE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__ANNOTATIONS = FLAT_PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__PRECISION = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE__SCALE = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_FEATURE_COUNT = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE___GET_NAMESPACE = FLAT_PRIMITIVE_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Numeric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE___IS_NUMERIC = FLAT_PRIMITIVE_TYPE___IS_NUMERIC;

	/**
	 * The operation id for the '<em>Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE___IS_INTEGER = FLAT_PRIMITIVE_TYPE___IS_INTEGER;

	/**
	 * The operation id for the '<em>Is Decimal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE___IS_DECIMAL = FLAT_PRIMITIVE_TYPE___IS_DECIMAL;

	/**
	 * The operation id for the '<em>Is String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE___IS_STRING = FLAT_PRIMITIVE_TYPE___IS_STRING;

	/**
	 * The operation id for the '<em>Is Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE___IS_BOOLEAN = FLAT_PRIMITIVE_TYPE___IS_BOOLEAN;

	/**
	 * The operation id for the '<em>Is Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE___IS_DATE = FLAT_PRIMITIVE_TYPE___IS_DATE;

	/**
	 * The operation id for the '<em>Is Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE___IS_TIMESTAMP = FLAT_PRIMITIVE_TYPE___IS_TIMESTAMP;

	/**
	 * The operation id for the '<em>Is Enumeration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE___IS_ENUMERATION = FLAT_PRIMITIVE_TYPE___IS_ENUMERATION;

	/**
	 * The operation id for the '<em>Is Measured</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE___IS_MEASURED = FLAT_PRIMITIVE_TYPE___IS_MEASURED;

	/**
	 * The operation id for the '<em>Is Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE___IS_TIME = FLAT_PRIMITIVE_TYPE___IS_TIME;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE___TO_STRING = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_TYPE_OPERATION_COUNT = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.type.impl.BooleanTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getBooleanType()
	 * @generated
	 */
	int BOOLEAN_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__NAME = FLAT_PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__DOCUMENTATION = FLAT_PRIMITIVE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE__ANNOTATIONS = FLAT_PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_FEATURE_COUNT = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE___GET_NAMESPACE = FLAT_PRIMITIVE_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Numeric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE___IS_NUMERIC = FLAT_PRIMITIVE_TYPE___IS_NUMERIC;

	/**
	 * The operation id for the '<em>Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE___IS_INTEGER = FLAT_PRIMITIVE_TYPE___IS_INTEGER;

	/**
	 * The operation id for the '<em>Is Decimal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE___IS_DECIMAL = FLAT_PRIMITIVE_TYPE___IS_DECIMAL;

	/**
	 * The operation id for the '<em>Is String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE___IS_STRING = FLAT_PRIMITIVE_TYPE___IS_STRING;

	/**
	 * The operation id for the '<em>Is Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE___IS_BOOLEAN = FLAT_PRIMITIVE_TYPE___IS_BOOLEAN;

	/**
	 * The operation id for the '<em>Is Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE___IS_DATE = FLAT_PRIMITIVE_TYPE___IS_DATE;

	/**
	 * The operation id for the '<em>Is Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE___IS_TIMESTAMP = FLAT_PRIMITIVE_TYPE___IS_TIMESTAMP;

	/**
	 * The operation id for the '<em>Is Enumeration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE___IS_ENUMERATION = FLAT_PRIMITIVE_TYPE___IS_ENUMERATION;

	/**
	 * The operation id for the '<em>Is Measured</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE___IS_MEASURED = FLAT_PRIMITIVE_TYPE___IS_MEASURED;

	/**
	 * The operation id for the '<em>Is Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE___IS_TIME = FLAT_PRIMITIVE_TYPE___IS_TIME;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE___TO_STRING = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Boolean Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_TYPE_OPERATION_COUNT = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.type.impl.EnumerationTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getEnumerationType()
	 * @generated
	 */
	int ENUMERATION_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__NAME = PRIMITIVE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__DOCUMENTATION = PRIMITIVE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__ANNOTATIONS = PRIMITIVE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE__MEMBERS = PRIMITIVE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___GET_NAMESPACE = PRIMITIVE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Numeric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___IS_NUMERIC = PRIMITIVE___IS_NUMERIC;

	/**
	 * The operation id for the '<em>Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___IS_INTEGER = PRIMITIVE___IS_INTEGER;

	/**
	 * The operation id for the '<em>Is Decimal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___IS_DECIMAL = PRIMITIVE___IS_DECIMAL;

	/**
	 * The operation id for the '<em>Is String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___IS_STRING = PRIMITIVE___IS_STRING;

	/**
	 * The operation id for the '<em>Is Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___IS_BOOLEAN = PRIMITIVE___IS_BOOLEAN;

	/**
	 * The operation id for the '<em>Is Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___IS_DATE = PRIMITIVE___IS_DATE;

	/**
	 * The operation id for the '<em>Is Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___IS_TIMESTAMP = PRIMITIVE___IS_TIMESTAMP;

	/**
	 * The operation id for the '<em>Is Enumeration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___IS_ENUMERATION = PRIMITIVE___IS_ENUMERATION;

	/**
	 * The operation id for the '<em>Is Measured</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___IS_MEASURED = PRIMITIVE___IS_MEASURED;

	/**
	 * The operation id for the '<em>Is Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___IS_TIME = PRIMITIVE___IS_TIME;

	/**
	 * The operation id for the '<em>Contains</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___CONTAINS__STRING = PRIMITIVE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE___TO_STRING = PRIMITIVE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_TYPE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.EnumerationMemberImpl <em>Enumeration Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.type.impl.EnumerationMemberImpl
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getEnumerationMember()
	 * @generated
	 */
	int ENUMERATION_MEMBER = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_MEMBER__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_MEMBER__DOCUMENTATION = NamespacePackage.NAMED_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_MEMBER__ANNOTATIONS = NamespacePackage.NAMED_ELEMENT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Ordinal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_MEMBER__ORDINAL = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Enumeration Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_MEMBER_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Enumeration Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_MEMBER_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.XMLTypeImpl <em>XML Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.type.impl.XMLTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getXMLType()
	 * @generated
	 */
	int XML_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE__NAME = FLAT_PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE__DOCUMENTATION = FLAT_PRIMITIVE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE__ANNOTATIONS = FLAT_PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Xml Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE__XML_NAMESPACE = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Xml Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE__XML_ELEMENT = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XML Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE_FEATURE_COUNT = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE___GET_NAMESPACE = FLAT_PRIMITIVE_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Numeric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE___IS_NUMERIC = FLAT_PRIMITIVE_TYPE___IS_NUMERIC;

	/**
	 * The operation id for the '<em>Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE___IS_INTEGER = FLAT_PRIMITIVE_TYPE___IS_INTEGER;

	/**
	 * The operation id for the '<em>Is Decimal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE___IS_DECIMAL = FLAT_PRIMITIVE_TYPE___IS_DECIMAL;

	/**
	 * The operation id for the '<em>Is String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE___IS_STRING = FLAT_PRIMITIVE_TYPE___IS_STRING;

	/**
	 * The operation id for the '<em>Is Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE___IS_BOOLEAN = FLAT_PRIMITIVE_TYPE___IS_BOOLEAN;

	/**
	 * The operation id for the '<em>Is Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE___IS_DATE = FLAT_PRIMITIVE_TYPE___IS_DATE;

	/**
	 * The operation id for the '<em>Is Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE___IS_TIMESTAMP = FLAT_PRIMITIVE_TYPE___IS_TIMESTAMP;

	/**
	 * The operation id for the '<em>Is Enumeration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE___IS_ENUMERATION = FLAT_PRIMITIVE_TYPE___IS_ENUMERATION;

	/**
	 * The operation id for the '<em>Is Measured</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE___IS_MEASURED = FLAT_PRIMITIVE_TYPE___IS_MEASURED;

	/**
	 * The operation id for the '<em>Is Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE___IS_TIME = FLAT_PRIMITIVE_TYPE___IS_TIME;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE___TO_STRING = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>XML Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TYPE_OPERATION_COUNT = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.CardinalityImpl <em>Cardinality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.type.impl.CardinalityImpl
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getCardinality()
	 * @generated
	 */
	int CARDINALITY = 10;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__LOWER = 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY__UPPER = 1;

	/**
	 * The number of structural features of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cardinality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDINALITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.PasswordTypeImpl <em>Password Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.type.impl.PasswordTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getPasswordType()
	 * @generated
	 */
	int PASSWORD_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__NAME = FLAT_PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__DOCUMENTATION = FLAT_PRIMITIVE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE__ANNOTATIONS = FLAT_PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Password Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE_FEATURE_COUNT = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE___GET_NAMESPACE = FLAT_PRIMITIVE_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Numeric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE___IS_NUMERIC = FLAT_PRIMITIVE_TYPE___IS_NUMERIC;

	/**
	 * The operation id for the '<em>Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE___IS_INTEGER = FLAT_PRIMITIVE_TYPE___IS_INTEGER;

	/**
	 * The operation id for the '<em>Is Decimal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE___IS_DECIMAL = FLAT_PRIMITIVE_TYPE___IS_DECIMAL;

	/**
	 * The operation id for the '<em>Is String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE___IS_STRING = FLAT_PRIMITIVE_TYPE___IS_STRING;

	/**
	 * The operation id for the '<em>Is Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE___IS_BOOLEAN = FLAT_PRIMITIVE_TYPE___IS_BOOLEAN;

	/**
	 * The operation id for the '<em>Is Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE___IS_DATE = FLAT_PRIMITIVE_TYPE___IS_DATE;

	/**
	 * The operation id for the '<em>Is Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE___IS_TIMESTAMP = FLAT_PRIMITIVE_TYPE___IS_TIMESTAMP;

	/**
	 * The operation id for the '<em>Is Enumeration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE___IS_ENUMERATION = FLAT_PRIMITIVE_TYPE___IS_ENUMERATION;

	/**
	 * The operation id for the '<em>Is Measured</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE___IS_MEASURED = FLAT_PRIMITIVE_TYPE___IS_MEASURED;

	/**
	 * The operation id for the '<em>Is Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE___IS_TIME = FLAT_PRIMITIVE_TYPE___IS_TIME;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE___TO_STRING = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Password Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PASSWORD_TYPE_OPERATION_COUNT = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.DateTypeImpl <em>Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.type.impl.DateTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getDateType()
	 * @generated
	 */
	int DATE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__NAME = FLAT_PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__DOCUMENTATION = FLAT_PRIMITIVE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__ANNOTATIONS = FLAT_PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE_FEATURE_COUNT = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE___GET_NAMESPACE = FLAT_PRIMITIVE_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Numeric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE___IS_NUMERIC = FLAT_PRIMITIVE_TYPE___IS_NUMERIC;

	/**
	 * The operation id for the '<em>Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE___IS_INTEGER = FLAT_PRIMITIVE_TYPE___IS_INTEGER;

	/**
	 * The operation id for the '<em>Is Decimal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE___IS_DECIMAL = FLAT_PRIMITIVE_TYPE___IS_DECIMAL;

	/**
	 * The operation id for the '<em>Is String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE___IS_STRING = FLAT_PRIMITIVE_TYPE___IS_STRING;

	/**
	 * The operation id for the '<em>Is Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE___IS_BOOLEAN = FLAT_PRIMITIVE_TYPE___IS_BOOLEAN;

	/**
	 * The operation id for the '<em>Is Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE___IS_DATE = FLAT_PRIMITIVE_TYPE___IS_DATE;

	/**
	 * The operation id for the '<em>Is Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE___IS_TIMESTAMP = FLAT_PRIMITIVE_TYPE___IS_TIMESTAMP;

	/**
	 * The operation id for the '<em>Is Enumeration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE___IS_ENUMERATION = FLAT_PRIMITIVE_TYPE___IS_ENUMERATION;

	/**
	 * The operation id for the '<em>Is Measured</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE___IS_MEASURED = FLAT_PRIMITIVE_TYPE___IS_MEASURED;

	/**
	 * The operation id for the '<em>Is Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE___IS_TIME = FLAT_PRIMITIVE_TYPE___IS_TIME;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE___TO_STRING = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE_OPERATION_COUNT = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.TimestampTypeImpl <em>Timestamp Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TimestampTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getTimestampType()
	 * @generated
	 */
	int TIMESTAMP_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE__NAME = FLAT_PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE__DOCUMENTATION = FLAT_PRIMITIVE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE__ANNOTATIONS = FLAT_PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Base Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE__BASE_UNIT = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timestamp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE_FEATURE_COUNT = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE___GET_NAMESPACE = FLAT_PRIMITIVE_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Numeric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE___IS_NUMERIC = FLAT_PRIMITIVE_TYPE___IS_NUMERIC;

	/**
	 * The operation id for the '<em>Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE___IS_INTEGER = FLAT_PRIMITIVE_TYPE___IS_INTEGER;

	/**
	 * The operation id for the '<em>Is Decimal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE___IS_DECIMAL = FLAT_PRIMITIVE_TYPE___IS_DECIMAL;

	/**
	 * The operation id for the '<em>Is String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE___IS_STRING = FLAT_PRIMITIVE_TYPE___IS_STRING;

	/**
	 * The operation id for the '<em>Is Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE___IS_BOOLEAN = FLAT_PRIMITIVE_TYPE___IS_BOOLEAN;

	/**
	 * The operation id for the '<em>Is Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE___IS_DATE = FLAT_PRIMITIVE_TYPE___IS_DATE;

	/**
	 * The operation id for the '<em>Is Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE___IS_TIMESTAMP = FLAT_PRIMITIVE_TYPE___IS_TIMESTAMP;

	/**
	 * The operation id for the '<em>Is Enumeration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE___IS_ENUMERATION = FLAT_PRIMITIVE_TYPE___IS_ENUMERATION;

	/**
	 * The operation id for the '<em>Is Measured</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE___IS_MEASURED = FLAT_PRIMITIVE_TYPE___IS_MEASURED;

	/**
	 * The operation id for the '<em>Is Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE___IS_TIME = FLAT_PRIMITIVE_TYPE___IS_TIME;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE___TO_STRING = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Timestamp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMESTAMP_TYPE_OPERATION_COUNT = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.BinaryTypeImpl <em>Binary Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.type.impl.BinaryTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getBinaryType()
	 * @generated
	 */
	int BINARY_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE__NAME = FLAT_PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE__DOCUMENTATION = FLAT_PRIMITIVE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE__ANNOTATIONS = FLAT_PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Mime Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE__MIME_TYPES = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max File Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE__MAX_FILE_SIZE = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE_FEATURE_COUNT = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE___GET_NAMESPACE = FLAT_PRIMITIVE_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Numeric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE___IS_NUMERIC = FLAT_PRIMITIVE_TYPE___IS_NUMERIC;

	/**
	 * The operation id for the '<em>Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE___IS_INTEGER = FLAT_PRIMITIVE_TYPE___IS_INTEGER;

	/**
	 * The operation id for the '<em>Is Decimal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE___IS_DECIMAL = FLAT_PRIMITIVE_TYPE___IS_DECIMAL;

	/**
	 * The operation id for the '<em>Is String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE___IS_STRING = FLAT_PRIMITIVE_TYPE___IS_STRING;

	/**
	 * The operation id for the '<em>Is Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE___IS_BOOLEAN = FLAT_PRIMITIVE_TYPE___IS_BOOLEAN;

	/**
	 * The operation id for the '<em>Is Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE___IS_DATE = FLAT_PRIMITIVE_TYPE___IS_DATE;

	/**
	 * The operation id for the '<em>Is Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE___IS_TIMESTAMP = FLAT_PRIMITIVE_TYPE___IS_TIMESTAMP;

	/**
	 * The operation id for the '<em>Is Enumeration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE___IS_ENUMERATION = FLAT_PRIMITIVE_TYPE___IS_ENUMERATION;

	/**
	 * The operation id for the '<em>Is Measured</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE___IS_MEASURED = FLAT_PRIMITIVE_TYPE___IS_MEASURED;

	/**
	 * The operation id for the '<em>Is Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE___IS_TIME = FLAT_PRIMITIVE_TYPE___IS_TIME;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE___TO_STRING = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Binary Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_TYPE_OPERATION_COUNT = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.TimeTypeImpl <em>Time Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TimeTypeImpl
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getTimeType()
	 * @generated
	 */
	int TIME_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__NAME = FLAT_PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__DOCUMENTATION = FLAT_PRIMITIVE_TYPE__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__ANNOTATIONS = FLAT_PRIMITIVE_TYPE__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Base Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE__BASE_UNIT = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE_FEATURE_COUNT = FLAT_PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE___GET_NAMESPACE = FLAT_PRIMITIVE_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>Is Numeric</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE___IS_NUMERIC = FLAT_PRIMITIVE_TYPE___IS_NUMERIC;

	/**
	 * The operation id for the '<em>Is Integer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE___IS_INTEGER = FLAT_PRIMITIVE_TYPE___IS_INTEGER;

	/**
	 * The operation id for the '<em>Is Decimal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE___IS_DECIMAL = FLAT_PRIMITIVE_TYPE___IS_DECIMAL;

	/**
	 * The operation id for the '<em>Is String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE___IS_STRING = FLAT_PRIMITIVE_TYPE___IS_STRING;

	/**
	 * The operation id for the '<em>Is Boolean</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE___IS_BOOLEAN = FLAT_PRIMITIVE_TYPE___IS_BOOLEAN;

	/**
	 * The operation id for the '<em>Is Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE___IS_DATE = FLAT_PRIMITIVE_TYPE___IS_DATE;

	/**
	 * The operation id for the '<em>Is Timestamp</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE___IS_TIMESTAMP = FLAT_PRIMITIVE_TYPE___IS_TIMESTAMP;

	/**
	 * The operation id for the '<em>Is Enumeration</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE___IS_ENUMERATION = FLAT_PRIMITIVE_TYPE___IS_ENUMERATION;

	/**
	 * The operation id for the '<em>Is Measured</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE___IS_MEASURED = FLAT_PRIMITIVE_TYPE___IS_MEASURED;

	/**
	 * The operation id for the '<em>Is Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE___IS_TIME = FLAT_PRIMITIVE_TYPE___IS_TIME;

	/**
	 * The operation id for the '<em>To String</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE___TO_STRING = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Time Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_TYPE_OPERATION_COUNT = FLAT_PRIMITIVE_TYPE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '<em>Reg Exp</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getRegExp()
	 * @generated
	 */
	int REG_EXP = 17;

	/**
	 * The meta object id for the '<em>Xml Namespace</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getXmlNamespace()
	 * @generated
	 */
	int XML_NAMESPACE = 18;

	/**
	 * The meta object id for the '<em>Xml Element</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getXmlElement()
	 * @generated
	 */
	int XML_ELEMENT = 19;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.Primitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.Primitive
	 * @generated
	 */
	EClass getPrimitive();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.Primitive#isNumeric() <em>Is Numeric</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Numeric</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.Primitive#isNumeric()
	 * @generated
	 */
	EOperation getPrimitive__IsNumeric();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.Primitive#isInteger() <em>Is Integer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Integer</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.Primitive#isInteger()
	 * @generated
	 */
	EOperation getPrimitive__IsInteger();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.Primitive#isDecimal() <em>Is Decimal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Decimal</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.Primitive#isDecimal()
	 * @generated
	 */
	EOperation getPrimitive__IsDecimal();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.Primitive#isString() <em>Is String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is String</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.Primitive#isString()
	 * @generated
	 */
	EOperation getPrimitive__IsString();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.Primitive#isBoolean() <em>Is Boolean</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Boolean</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.Primitive#isBoolean()
	 * @generated
	 */
	EOperation getPrimitive__IsBoolean();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.Primitive#isDate() <em>Is Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Date</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.Primitive#isDate()
	 * @generated
	 */
	EOperation getPrimitive__IsDate();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.Primitive#isTimestamp() <em>Is Timestamp</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Timestamp</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.Primitive#isTimestamp()
	 * @generated
	 */
	EOperation getPrimitive__IsTimestamp();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.Primitive#isEnumeration() <em>Is Enumeration</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Enumeration</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.Primitive#isEnumeration()
	 * @generated
	 */
	EOperation getPrimitive__IsEnumeration();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.Primitive#isMeasured() <em>Is Measured</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Measured</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.Primitive#isMeasured()
	 * @generated
	 */
	EOperation getPrimitive__IsMeasured();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.Primitive#isTime() <em>Is Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Time</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.Primitive#isTime()
	 * @generated
	 */
	EOperation getPrimitive__IsTime();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.CustomType <em>Custom Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.CustomType
	 * @generated
	 */
	EClass getCustomType();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.CustomType#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.CustomType#toString()
	 * @generated
	 */
	EOperation getCustomType__ToString();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.StringType <em>String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.StringType
	 * @generated
	 */
	EClass getStringType();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.type.StringType#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.StringType#getMaxLength()
	 * @see #getStringType()
	 * @generated
	 */
	EAttribute getStringType_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.type.StringType#getRegExp <em>Reg Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg Exp</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.StringType#getRegExp()
	 * @see #getStringType()
	 * @generated
	 */
	EAttribute getStringType_RegExp();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.StringType#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.StringType#toString()
	 * @generated
	 */
	EOperation getStringType__ToString();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.NumericType <em>Numeric Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.NumericType
	 * @generated
	 */
	EClass getNumericType();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.type.NumericType#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.NumericType#getPrecision()
	 * @see #getNumericType()
	 * @generated
	 */
	EAttribute getNumericType_Precision();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.type.NumericType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.NumericType#getScale()
	 * @see #getNumericType()
	 * @generated
	 */
	EAttribute getNumericType_Scale();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.NumericType#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.NumericType#toString()
	 * @generated
	 */
	EOperation getNumericType__ToString();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.BooleanType <em>Boolean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.BooleanType
	 * @generated
	 */
	EClass getBooleanType();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.BooleanType#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.BooleanType#toString()
	 * @generated
	 */
	EOperation getBooleanType__ToString();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.EnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.EnumerationType
	 * @generated
	 */
	EClass getEnumerationType();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.type.EnumerationType#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.EnumerationType#getMembers()
	 * @see #getEnumerationType()
	 * @generated
	 */
	EReference getEnumerationType_Members();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.EnumerationType#contains(java.lang.String) <em>Contains</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Contains</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.EnumerationType#contains(java.lang.String)
	 * @generated
	 */
	EOperation getEnumerationType__Contains__String();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.EnumerationType#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.EnumerationType#toString()
	 * @generated
	 */
	EOperation getEnumerationType__ToString();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.EnumerationMember <em>Enumeration Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration Member</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.EnumerationMember
	 * @generated
	 */
	EClass getEnumerationMember();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.type.EnumerationMember#getOrdinal <em>Ordinal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordinal</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.EnumerationMember#getOrdinal()
	 * @see #getEnumerationMember()
	 * @generated
	 */
	EAttribute getEnumerationMember_Ordinal();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.XMLType <em>XML Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.XMLType
	 * @generated
	 */
	EClass getXMLType();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.type.XMLType#getXmlNamespace <em>Xml Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml Namespace</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.XMLType#getXmlNamespace()
	 * @see #getXMLType()
	 * @generated
	 */
	EAttribute getXMLType_XmlNamespace();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.type.XMLType#getXmlElement <em>Xml Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Xml Element</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.XMLType#getXmlElement()
	 * @see #getXMLType()
	 * @generated
	 */
	EAttribute getXMLType_XmlElement();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.XMLType#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.XMLType#toString()
	 * @generated
	 */
	EOperation getXMLType__ToString();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.Cardinality <em>Cardinality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cardinality</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.Cardinality
	 * @generated
	 */
	EClass getCardinality();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.type.Cardinality#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.Cardinality#getLower()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_Lower();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.type.Cardinality#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.Cardinality#getUpper()
	 * @see #getCardinality()
	 * @generated
	 */
	EAttribute getCardinality_Upper();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.PasswordType <em>Password Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Password Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.PasswordType
	 * @generated
	 */
	EClass getPasswordType();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.PasswordType#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.PasswordType#toString()
	 * @generated
	 */
	EOperation getPasswordType__ToString();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.DateType
	 * @generated
	 */
	EClass getDateType();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.DateType#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.DateType#toString()
	 * @generated
	 */
	EOperation getDateType__ToString();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.TimestampType <em>Timestamp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timestamp Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.TimestampType
	 * @generated
	 */
	EClass getTimestampType();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.type.TimestampType#getBaseUnit <em>Base Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Unit</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.TimestampType#getBaseUnit()
	 * @see #getTimestampType()
	 * @generated
	 */
	EAttribute getTimestampType_BaseUnit();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.TimestampType#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.TimestampType#toString()
	 * @generated
	 */
	EOperation getTimestampType__ToString();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.FlatPrimitiveType <em>Flat Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flat Primitive Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.FlatPrimitiveType
	 * @generated
	 */
	EClass getFlatPrimitiveType();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.BinaryType <em>Binary Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.BinaryType
	 * @generated
	 */
	EClass getBinaryType();

	/**
	 * Returns the meta object for the attribute list '{@link hu.blackbelt.judo.meta.psm.type.BinaryType#getMimeTypes <em>Mime Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mime Types</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.BinaryType#getMimeTypes()
	 * @see #getBinaryType()
	 * @generated
	 */
	EAttribute getBinaryType_MimeTypes();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.type.BinaryType#getMaxFileSize <em>Max File Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max File Size</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.BinaryType#getMaxFileSize()
	 * @see #getBinaryType()
	 * @generated
	 */
	EAttribute getBinaryType_MaxFileSize();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.BinaryType#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.BinaryType#toString()
	 * @generated
	 */
	EOperation getBinaryType__ToString();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Type</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.TimeType
	 * @generated
	 */
	EClass getTimeType();

	/**
	 * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.type.TimeType#getBaseUnit <em>Base Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Unit</em>'.
	 * @see hu.blackbelt.judo.meta.psm.type.TimeType#getBaseUnit()
	 * @see #getTimeType()
	 * @generated
	 */
	EAttribute getTimeType_BaseUnit();

	/**
	 * Returns the meta object for the '{@link hu.blackbelt.judo.meta.psm.type.TimeType#toString() <em>To String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>To String</em>' operation.
	 * @see hu.blackbelt.judo.meta.psm.type.TimeType#toString()
	 * @generated
	 */
	EOperation getTimeType__ToString();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Reg Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Reg Exp</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getRegExp();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Xml Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Xml Namespace</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getXmlNamespace();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Xml Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Xml Element</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getXmlElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypeFactory getTypeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.PrimitiveImpl <em>Primitive</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.type.impl.PrimitiveImpl
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getPrimitive()
		 * @generated
		 */
		EClass PRIMITIVE = eINSTANCE.getPrimitive();

		/**
		 * The meta object literal for the '<em><b>Is Numeric</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE___IS_NUMERIC = eINSTANCE.getPrimitive__IsNumeric();

		/**
		 * The meta object literal for the '<em><b>Is Integer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE___IS_INTEGER = eINSTANCE.getPrimitive__IsInteger();

		/**
		 * The meta object literal for the '<em><b>Is Decimal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE___IS_DECIMAL = eINSTANCE.getPrimitive__IsDecimal();

		/**
		 * The meta object literal for the '<em><b>Is String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE___IS_STRING = eINSTANCE.getPrimitive__IsString();

		/**
		 * The meta object literal for the '<em><b>Is Boolean</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE___IS_BOOLEAN = eINSTANCE.getPrimitive__IsBoolean();

		/**
		 * The meta object literal for the '<em><b>Is Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE___IS_DATE = eINSTANCE.getPrimitive__IsDate();

		/**
		 * The meta object literal for the '<em><b>Is Timestamp</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE___IS_TIMESTAMP = eINSTANCE.getPrimitive__IsTimestamp();

		/**
		 * The meta object literal for the '<em><b>Is Enumeration</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE___IS_ENUMERATION = eINSTANCE.getPrimitive__IsEnumeration();

		/**
		 * The meta object literal for the '<em><b>Is Measured</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE___IS_MEASURED = eINSTANCE.getPrimitive__IsMeasured();

		/**
		 * The meta object literal for the '<em><b>Is Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PRIMITIVE___IS_TIME = eINSTANCE.getPrimitive__IsTime();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.CustomTypeImpl <em>Custom Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.type.impl.CustomTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getCustomType()
		 * @generated
		 */
		EClass CUSTOM_TYPE = eINSTANCE.getCustomType();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOM_TYPE___TO_STRING = eINSTANCE.getCustomType__ToString();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.StringTypeImpl <em>String Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.type.impl.StringTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getStringType()
		 * @generated
		 */
		EClass STRING_TYPE = eINSTANCE.getStringType();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TYPE__MAX_LENGTH = eINSTANCE.getStringType_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Reg Exp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_TYPE__REG_EXP = eINSTANCE.getStringType_RegExp();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STRING_TYPE___TO_STRING = eINSTANCE.getStringType__ToString();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.NumericTypeImpl <em>Numeric Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.type.impl.NumericTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getNumericType()
		 * @generated
		 */
		EClass NUMERIC_TYPE = eINSTANCE.getNumericType();

		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_TYPE__PRECISION = eINSTANCE.getNumericType_Precision();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERIC_TYPE__SCALE = eINSTANCE.getNumericType_Scale();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NUMERIC_TYPE___TO_STRING = eINSTANCE.getNumericType__ToString();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.type.impl.BooleanTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getBooleanType()
		 * @generated
		 */
		EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOLEAN_TYPE___TO_STRING = eINSTANCE.getBooleanType__ToString();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.EnumerationTypeImpl <em>Enumeration Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.type.impl.EnumerationTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getEnumerationType()
		 * @generated
		 */
		EClass ENUMERATION_TYPE = eINSTANCE.getEnumerationType();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION_TYPE__MEMBERS = eINSTANCE.getEnumerationType_Members();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION_TYPE___CONTAINS__STRING = eINSTANCE.getEnumerationType__Contains__String();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENUMERATION_TYPE___TO_STRING = eINSTANCE.getEnumerationType__ToString();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.EnumerationMemberImpl <em>Enumeration Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.type.impl.EnumerationMemberImpl
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getEnumerationMember()
		 * @generated
		 */
		EClass ENUMERATION_MEMBER = eINSTANCE.getEnumerationMember();

		/**
		 * The meta object literal for the '<em><b>Ordinal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION_MEMBER__ORDINAL = eINSTANCE.getEnumerationMember_Ordinal();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypeImpl
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.type.impl.DataTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.XMLTypeImpl <em>XML Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.type.impl.XMLTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getXMLType()
		 * @generated
		 */
		EClass XML_TYPE = eINSTANCE.getXMLType();

		/**
		 * The meta object literal for the '<em><b>Xml Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_TYPE__XML_NAMESPACE = eINSTANCE.getXMLType_XmlNamespace();

		/**
		 * The meta object literal for the '<em><b>Xml Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_TYPE__XML_ELEMENT = eINSTANCE.getXMLType_XmlElement();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation XML_TYPE___TO_STRING = eINSTANCE.getXMLType__ToString();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.CardinalityImpl <em>Cardinality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.type.impl.CardinalityImpl
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getCardinality()
		 * @generated
		 */
		EClass CARDINALITY = eINSTANCE.getCardinality();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__LOWER = eINSTANCE.getCardinality_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDINALITY__UPPER = eINSTANCE.getCardinality_Upper();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.PasswordTypeImpl <em>Password Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.type.impl.PasswordTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getPasswordType()
		 * @generated
		 */
		EClass PASSWORD_TYPE = eINSTANCE.getPasswordType();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PASSWORD_TYPE___TO_STRING = eINSTANCE.getPasswordType__ToString();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.DateTypeImpl <em>Date Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.type.impl.DateTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getDateType()
		 * @generated
		 */
		EClass DATE_TYPE = eINSTANCE.getDateType();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DATE_TYPE___TO_STRING = eINSTANCE.getDateType__ToString();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.TimestampTypeImpl <em>Timestamp Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TimestampTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getTimestampType()
		 * @generated
		 */
		EClass TIMESTAMP_TYPE = eINSTANCE.getTimestampType();

		/**
		 * The meta object literal for the '<em><b>Base Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMESTAMP_TYPE__BASE_UNIT = eINSTANCE.getTimestampType_BaseUnit();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIMESTAMP_TYPE___TO_STRING = eINSTANCE.getTimestampType__ToString();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.FlatPrimitiveTypeImpl <em>Flat Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.type.impl.FlatPrimitiveTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getFlatPrimitiveType()
		 * @generated
		 */
		EClass FLAT_PRIMITIVE_TYPE = eINSTANCE.getFlatPrimitiveType();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.BinaryTypeImpl <em>Binary Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.type.impl.BinaryTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getBinaryType()
		 * @generated
		 */
		EClass BINARY_TYPE = eINSTANCE.getBinaryType();

		/**
		 * The meta object literal for the '<em><b>Mime Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_TYPE__MIME_TYPES = eINSTANCE.getBinaryType_MimeTypes();

		/**
		 * The meta object literal for the '<em><b>Max File Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_TYPE__MAX_FILE_SIZE = eINSTANCE.getBinaryType_MaxFileSize();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BINARY_TYPE___TO_STRING = eINSTANCE.getBinaryType__ToString();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.TimeTypeImpl <em>Time Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TimeTypeImpl
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getTimeType()
		 * @generated
		 */
		EClass TIME_TYPE = eINSTANCE.getTimeType();

		/**
		 * The meta object literal for the '<em><b>Base Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_TYPE__BASE_UNIT = eINSTANCE.getTimeType_BaseUnit();

		/**
		 * The meta object literal for the '<em><b>To String</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIME_TYPE___TO_STRING = eINSTANCE.getTimeType__ToString();

		/**
		 * The meta object literal for the '<em>Reg Exp</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getRegExp()
		 * @generated
		 */
		EDataType REG_EXP = eINSTANCE.getRegExp();

		/**
		 * The meta object literal for the '<em>Xml Namespace</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getXmlNamespace()
		 * @generated
		 */
		EDataType XML_NAMESPACE = eINSTANCE.getXmlNamespace();

		/**
		 * The meta object literal for the '<em>Xml Element</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getXmlElement()
		 * @generated
		 */
		EDataType XML_ELEMENT = eINSTANCE.getXmlElement();

	}

} //TypePackage
