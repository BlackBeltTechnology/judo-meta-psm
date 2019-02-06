/**
 */
package hu.blackbelt.judo.meta.psm.type.impl;

import hu.blackbelt.judo.meta.psm.type.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeFactoryImpl extends EFactoryImpl implements TypeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypeFactory init() {
		try {
			TypeFactory theTypeFactory = (TypeFactory)EPackage.Registry.INSTANCE.getEFactory(TypePackage.eNS_URI);
			if (theTypeFactory != null) {
				return theTypeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TypeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TypePackage.CUSTOM_TYPE: return createCustomType();
			case TypePackage.STRING_TYPE: return createStringType();
			case TypePackage.NUMERIC_TYPE: return createNumericType();
			case TypePackage.BOOLEAN_TYPE: return createBooleanType();
			case TypePackage.ENUMERATION_TYPE: return createEnumerationType();
			case TypePackage.ENUMERATION_MEMBER: return createEnumerationMember();
			case TypePackage.XML_TYPE: return createXMLType();
			case TypePackage.CARDINALITY: return createCardinality();
			case TypePackage.PASSWORD_TYPE: return createPasswordType();
			case TypePackage.DATE_TYPE: return createDateType();
			case TypePackage.TIMESTAMP_TYPE: return createTimestampType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TypePackage.REG_EXP:
				return createRegExpFromString(eDataType, initialValue);
			case TypePackage.XML_NAMESPACE:
				return createXmlNamespaceFromString(eDataType, initialValue);
			case TypePackage.XML_ELEMENT:
				return createXmlElementFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TypePackage.REG_EXP:
				return convertRegExpToString(eDataType, instanceValue);
			case TypePackage.XML_NAMESPACE:
				return convertXmlNamespaceToString(eDataType, instanceValue);
			case TypePackage.XML_ELEMENT:
				return convertXmlElementToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomType createCustomType() {
		CustomTypeImpl customType = new CustomTypeImpl();
		return customType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringType createStringType() {
		StringTypeImpl stringType = new StringTypeImpl();
		return stringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericType createNumericType() {
		NumericTypeImpl numericType = new NumericTypeImpl();
		return numericType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanType createBooleanType() {
		BooleanTypeImpl booleanType = new BooleanTypeImpl();
		return booleanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationType createEnumerationType() {
		EnumerationTypeImpl enumerationType = new EnumerationTypeImpl();
		return enumerationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationMember createEnumerationMember() {
		EnumerationMemberImpl enumerationMember = new EnumerationMemberImpl();
		return enumerationMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLType createXMLType() {
		XMLTypeImpl xmlType = new XMLTypeImpl();
		return xmlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cardinality createCardinality() {
		CardinalityImpl cardinality = new CardinalityImpl();
		return cardinality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordType createPasswordType() {
		PasswordTypeImpl passwordType = new PasswordTypeImpl();
		return passwordType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateType createDateType() {
		DateTypeImpl dateType = new DateTypeImpl();
		return dateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampType createTimestampType() {
		TimestampTypeImpl timestampType = new TimestampTypeImpl();
		return timestampType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRegExp(String literal) {
		return (String)super.createFromString(TypePackage.Literals.REG_EXP, literal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createRegExpFromString(EDataType eDataType, String initialValue) {
		return createRegExp(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegExp(String instanceValue) {
		return super.convertToString(TypePackage.Literals.REG_EXP, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRegExpToString(EDataType eDataType, Object instanceValue) {
		return convertRegExp((String)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createXmlNamespace(String literal) {
		return (String)super.createFromString(TypePackage.Literals.XML_NAMESPACE, literal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createXmlNamespaceFromString(EDataType eDataType, String initialValue) {
		return createXmlNamespace(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXmlNamespace(String instanceValue) {
		return super.convertToString(TypePackage.Literals.XML_NAMESPACE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXmlNamespaceToString(EDataType eDataType, Object instanceValue) {
		return convertXmlNamespace((String)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createXmlElement(String literal) {
		return (String)super.createFromString(TypePackage.Literals.XML_ELEMENT, literal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createXmlElementFromString(EDataType eDataType, String initialValue) {
		return createXmlElement(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXmlElement(String instanceValue) {
		return super.convertToString(TypePackage.Literals.XML_ELEMENT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXmlElementToString(EDataType eDataType, Object instanceValue) {
		return convertXmlElement((String)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypePackage getTypePackage() {
		return (TypePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TypePackage getPackage() {
		return TypePackage.eINSTANCE;
	}

} //TypeFactoryImpl
