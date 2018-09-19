/**
 */
package hu.blackbelt.judo.meta.psm.type;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import java.lang.String;

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
    int TYPE = 10;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The number of structural features of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.DataTypeImpl <em>Data Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.type.impl.DataTypeImpl
     * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getDataType()
     * @generated
     */
    int DATA_TYPE = 0;

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
    int PRIMITIVE = 1;

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
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.CustomImpl <em>Custom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.type.impl.CustomImpl
     * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getCustom()
     * @generated
     */
    int CUSTOM = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM__NAME = PRIMITIVE__NAME;

    /**
     * The number of structural features of the '<em>Custom</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Custom</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CUSTOM_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.StringImpl <em>String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.type.impl.StringImpl
     * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getString()
     * @generated
     */
    int STRING = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING__NAME = PRIMITIVE__NAME;

    /**
     * The feature id for the '<em><b>Max Length</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING__MAX_LENGTH = PRIMITIVE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>String</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>String</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRING_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.NumericImpl <em>Numeric</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.type.impl.NumericImpl
     * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getNumeric()
     * @generated
     */
    int NUMERIC = 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC__NAME = PRIMITIVE__NAME;

    /**
     * The feature id for the '<em><b>Precision</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC__PRECISION = PRIMITIVE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Scale</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC__SCALE = PRIMITIVE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Numeric</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Numeric</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NUMERIC_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.BooleanImpl <em>Boolean</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.type.impl.BooleanImpl
     * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getBoolean()
     * @generated
     */
    int BOOLEAN = 5;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN__NAME = PRIMITIVE__NAME;

    /**
     * The number of structural features of the '<em>Boolean</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>Boolean</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BOOLEAN_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.type.impl.EnumerationImpl
     * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getEnumeration()
     * @generated
     */
    int ENUMERATION = 6;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__NAME = PRIMITIVE__NAME;

    /**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION__MEMBERS = PRIMITIVE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Enumeration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_FEATURE_COUNT = PRIMITIVE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Enumeration</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERATION_OPERATION_COUNT = PRIMITIVE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.type.impl.MemberImpl
     * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getMember()
     * @generated
     */
    int MEMBER = 7;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Ordinal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__ORDINAL = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Member</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.StructureImpl <em>Structure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.type.impl.StructureImpl
     * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getStructure()
     * @generated
     */
    int STRUCTURE = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURE__NAME = DATA_TYPE__NAME;

    /**
     * The feature id for the '<em><b>Fields</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURE__FIELDS = DATA_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Structure</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Structure</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int STRUCTURE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.type.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.blackbelt.judo.meta.psm.type.impl.FieldImpl
     * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getField()
     * @generated
     */
    int FIELD = 9;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__TYPE = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Required</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD__REQUIRED = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Field</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Field</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int FIELD_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '<em>Navigation Expression</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getNavigationExpression()
     * @generated
     */
    int NAVIGATION_EXPRESSION = 11;

    /**
     * The meta object id for the '<em>Script</em>' data type.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see java.lang.String
     * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getScript()
     * @generated
     */
    int SCRIPT = 12;


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
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.Primitive <em>Primitive</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Primitive</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.Primitive
     * @generated
     */
    EClass getPrimitive();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.Custom <em>Custom</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Custom</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.Custom
     * @generated
     */
    EClass getCustom();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.String <em>String</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>String</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.String
     * @generated
     */
    EClass getString();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.type.String#getMaxLength <em>Max Length</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Max Length</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.String#getMaxLength()
     * @see #getString()
     * @generated
     */
    EAttribute getString_MaxLength();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.Numeric <em>Numeric</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Numeric</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.Numeric
     * @generated
     */
    EClass getNumeric();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.type.Numeric#getPrecision <em>Precision</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Precision</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.Numeric#getPrecision()
     * @see #getNumeric()
     * @generated
     */
    EAttribute getNumeric_Precision();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.type.Numeric#getScale <em>Scale</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Scale</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.Numeric#getScale()
     * @see #getNumeric()
     * @generated
     */
    EAttribute getNumeric_Scale();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.Boolean <em>Boolean</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Boolean</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.Boolean
     * @generated
     */
    EClass getBoolean();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.Enumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Enumeration</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.Enumeration
     * @generated
     */
    EClass getEnumeration();

    /**
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.type.Enumeration#getMembers <em>Members</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Members</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.Enumeration#getMembers()
     * @see #getEnumeration()
     * @generated
     */
    EReference getEnumeration_Members();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.Member <em>Member</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Member</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.Member
     * @generated
     */
    EClass getMember();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.type.Member#getOrdinal <em>Ordinal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Ordinal</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.Member#getOrdinal()
     * @see #getMember()
     * @generated
     */
    EAttribute getMember_Ordinal();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.Structure <em>Structure</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Structure</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.Structure
     * @generated
     */
    EClass getStructure();

    /**
     * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.type.Structure#getFields <em>Fields</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Fields</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.Structure#getFields()
     * @see #getStructure()
     * @generated
     */
    EReference getStructure_Fields();

    /**
     * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.type.Field <em>Field</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Field</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.Field
     * @generated
     */
    EClass getField();

    /**
     * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.type.Field#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Type</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.Field#getType()
     * @see #getField()
     * @generated
     */
    EReference getField_Type();

    /**
     * Returns the meta object for the attribute '{@link hu.blackbelt.judo.meta.psm.type.Field#isRequired <em>Required</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Required</em>'.
     * @see hu.blackbelt.judo.meta.psm.type.Field#isRequired()
     * @see #getField()
     * @generated
     */
    EAttribute getField_Required();

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
     * Returns the meta object for data type '{@link java.lang.String <em>Navigation Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Navigation Expression</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     * @generated
     */
    EDataType getNavigationExpression();

    /**
     * Returns the meta object for data type '{@link java.lang.String <em>Script</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Script</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     * @generated
     */
    EDataType getScript();

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
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.DataTypeImpl <em>Data Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.type.impl.DataTypeImpl
         * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getDataType()
         * @generated
         */
        EClass DATA_TYPE = eINSTANCE.getDataType();

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
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.CustomImpl <em>Custom</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.type.impl.CustomImpl
         * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getCustom()
         * @generated
         */
        EClass CUSTOM = eINSTANCE.getCustom();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.StringImpl <em>String</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.type.impl.StringImpl
         * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getString()
         * @generated
         */
        EClass STRING = eINSTANCE.getString();

        /**
         * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute STRING__MAX_LENGTH = eINSTANCE.getString_MaxLength();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.NumericImpl <em>Numeric</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.type.impl.NumericImpl
         * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getNumeric()
         * @generated
         */
        EClass NUMERIC = eINSTANCE.getNumeric();

        /**
         * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMERIC__PRECISION = eINSTANCE.getNumeric_Precision();

        /**
         * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NUMERIC__SCALE = eINSTANCE.getNumeric_Scale();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.BooleanImpl <em>Boolean</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.type.impl.BooleanImpl
         * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getBoolean()
         * @generated
         */
        EClass BOOLEAN = eINSTANCE.getBoolean();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.EnumerationImpl <em>Enumeration</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.type.impl.EnumerationImpl
         * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getEnumeration()
         * @generated
         */
        EClass ENUMERATION = eINSTANCE.getEnumeration();

        /**
         * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENUMERATION__MEMBERS = eINSTANCE.getEnumeration_Members();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.MemberImpl <em>Member</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.type.impl.MemberImpl
         * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getMember()
         * @generated
         */
        EClass MEMBER = eINSTANCE.getMember();

        /**
         * The meta object literal for the '<em><b>Ordinal</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MEMBER__ORDINAL = eINSTANCE.getMember_Ordinal();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.StructureImpl <em>Structure</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.type.impl.StructureImpl
         * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getStructure()
         * @generated
         */
        EClass STRUCTURE = eINSTANCE.getStructure();

        /**
         * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference STRUCTURE__FIELDS = eINSTANCE.getStructure_Fields();

        /**
         * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.type.impl.FieldImpl <em>Field</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see hu.blackbelt.judo.meta.psm.type.impl.FieldImpl
         * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getField()
         * @generated
         */
        EClass FIELD = eINSTANCE.getField();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference FIELD__TYPE = eINSTANCE.getField_Type();

        /**
         * The meta object literal for the '<em><b>Required</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute FIELD__REQUIRED = eINSTANCE.getField_Required();

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
         * The meta object literal for the '<em>Navigation Expression</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getNavigationExpression()
         * @generated
         */
        EDataType NAVIGATION_EXPRESSION = eINSTANCE.getNavigationExpression();

        /**
         * The meta object literal for the '<em>Script</em>' data type.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see java.lang.String
         * @see hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl#getScript()
         * @generated
         */
        EDataType SCRIPT = eINSTANCE.getScript();

    }

} //TypePackage
