/**
 */
package hu.blackbelt.judo.meta.psm.type;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public interface TypePackage extends EPackage {
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
     * The number of structural features of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_FEATURE_COUNT = NamespacePackage.NAMESPACE_ELEMENT_FEATURE_COUNT + 0;

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
     * The number of structural features of the '<em>Data Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATA_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

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
     * The number of structural features of the '<em>Primitive</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Primitive</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PRIMITIVE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

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
    int CUSTOM_TYPE__NAME = PRIMITIVE__NAME;

    /**
     * The number of structural features of the '<em>Custom Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Custom Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_TYPE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

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
    int STRING_TYPE__NAME = PRIMITIVE__NAME;

    /**
     * The feature id for the '<em><b>Max Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TYPE__MAX_LENGTH = PRIMITIVE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Reg Exp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TYPE__REG_EXP = PRIMITIVE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>String Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>String Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_TYPE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

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
    int NUMERIC_TYPE__NAME = PRIMITIVE__NAME;

    /**
     * The feature id for the '<em><b>Precision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE__PRECISION = PRIMITIVE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Scale</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE__SCALE = PRIMITIVE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Numeric Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Numeric Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_TYPE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

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
    int BOOLEAN_TYPE__NAME = PRIMITIVE__NAME;

    /**
     * The number of structural features of the '<em>Boolean Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Boolean Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_TYPE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

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
     * The number of operations of the '<em>Enumeration Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_TYPE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

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
    int XML_TYPE__NAME = PRIMITIVE__NAME;

    /**
     * The feature id for the '<em><b>Xml Namespace</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_TYPE__XML_NAMESPACE = PRIMITIVE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Xml Element</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_TYPE__XML_ELEMENT = PRIMITIVE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>XML Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>XML Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int XML_TYPE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

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
    int PASSWORD_TYPE__NAME = PRIMITIVE__NAME;

    /**
     * The number of structural features of the '<em>Password Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSWORD_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Password Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PASSWORD_TYPE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

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
    int DATE_TYPE__NAME = PRIMITIVE__NAME;

    /**
     * The number of structural features of the '<em>Date Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Date Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int DATE_TYPE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

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
    int TIMESTAMP_TYPE__NAME = PRIMITIVE__NAME;

    /**
     * The number of structural features of the '<em>Timestamp Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_TYPE_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Timestamp Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TIMESTAMP_TYPE_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '<em>Reg Exp</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getRegExp()
     * @generated
     */
    int REG_EXP = 14;

    /**
     * The meta object id for the '<em>Xml Namespace</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getXmlNamespace()
     * @generated
     */
    int XML_NAMESPACE = 15;

    /**
     * The meta object id for the '<em>Xml Element</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getXmlElement()
     * @generated
     */
    int XML_ELEMENT = 16;


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
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.CustomType <em>Custom Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Custom Type</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.CustomType
     * @generated
     */
    EClass getCustomType();

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
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.BooleanType <em>Boolean Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boolean Type</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.BooleanType
     * @generated
     */
    EClass getBooleanType();

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
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.DateType <em>Date Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Date Type</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.DateType
     * @generated
     */
    EClass getDateType();

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
    interface Literals {
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
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.CustomTypeImpl <em>Custom Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.type.impl.CustomTypeImpl
         * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getCustomType()
         * @generated
         */
        EClass CUSTOM_TYPE = eINSTANCE.getCustomType();

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
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.BooleanTypeImpl <em>Boolean Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.type.impl.BooleanTypeImpl
         * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getBooleanType()
         * @generated
         */
        EClass BOOLEAN_TYPE = eINSTANCE.getBooleanType();

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
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.DateTypeImpl <em>Date Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.type.impl.DateTypeImpl
         * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getDateType()
         * @generated
         */
        EClass DATE_TYPE = eINSTANCE.getDateType();

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
