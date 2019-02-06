/**
 */
package hu.blackbelt.judo.meta.psm.expression.constant.impl;

import hu.blackbelt.judo.meta.psm.expression.constant.BooleanConstant;
import hu.blackbelt.judo.meta.psm.expression.constant.ConstantFactory;
import hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage;
import hu.blackbelt.judo.meta.psm.expression.constant.CustomData;
import hu.blackbelt.judo.meta.psm.expression.constant.DateConstant;
import hu.blackbelt.judo.meta.psm.expression.constant.DecimalConstant;
import hu.blackbelt.judo.meta.psm.expression.constant.Instance;
import hu.blackbelt.judo.meta.psm.expression.constant.IntegerConstant;
import hu.blackbelt.judo.meta.psm.expression.constant.Literal;
import hu.blackbelt.judo.meta.psm.expression.constant.MeasuredDecimal;
import hu.blackbelt.judo.meta.psm.expression.constant.MeasuredInteger;
import hu.blackbelt.judo.meta.psm.expression.constant.StringConstant;
import hu.blackbelt.judo.meta.psm.expression.constant.TimestampConstant;

import org.eclipse.emf.ecore.EClass;
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
public class ConstantFactoryImpl extends EFactoryImpl implements ConstantFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConstantFactory init() {
		try {
			ConstantFactory theConstantFactory = (ConstantFactory)EPackage.Registry.INSTANCE.getEFactory(ConstantPackage.eNS_URI);
			if (theConstantFactory != null) {
				return theConstantFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ConstantFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantFactoryImpl() {
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
			case ConstantPackage.INTEGER_CONSTANT: return createIntegerConstant();
			case ConstantPackage.DECIMAL_CONSTANT: return createDecimalConstant();
			case ConstantPackage.BOOLEAN_CONSTANT: return createBooleanConstant();
			case ConstantPackage.STRING_CONSTANT: return createStringConstant();
			case ConstantPackage.LITERAL: return createLiteral();
			case ConstantPackage.INSTANCE: return createInstance();
			case ConstantPackage.CUSTOM_DATA: return createCustomData();
			case ConstantPackage.MEASURED_DECIMAL: return createMeasuredDecimal();
			case ConstantPackage.MEASURED_INTEGER: return createMeasuredInteger();
			case ConstantPackage.DATE_CONSTANT: return createDateConstant();
			case ConstantPackage.TIMESTAMP_CONSTANT: return createTimestampConstant();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerConstant createIntegerConstant() {
		IntegerConstantImpl integerConstant = new IntegerConstantImpl();
		return integerConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalConstant createDecimalConstant() {
		DecimalConstantImpl decimalConstant = new DecimalConstantImpl();
		return decimalConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanConstant createBooleanConstant() {
		BooleanConstantImpl booleanConstant = new BooleanConstantImpl();
		return booleanConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringConstant createStringConstant() {
		StringConstantImpl stringConstant = new StringConstantImpl();
		return stringConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomData createCustomData() {
		CustomDataImpl customData = new CustomDataImpl();
		return customData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredDecimal createMeasuredDecimal() {
		MeasuredDecimalImpl measuredDecimal = new MeasuredDecimalImpl();
		return measuredDecimal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasuredInteger createMeasuredInteger() {
		MeasuredIntegerImpl measuredInteger = new MeasuredIntegerImpl();
		return measuredInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateConstant createDateConstant() {
		DateConstantImpl dateConstant = new DateConstantImpl();
		return dateConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimestampConstant createTimestampConstant() {
		TimestampConstantImpl timestampConstant = new TimestampConstantImpl();
		return timestampConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantPackage getConstantPackage() {
		return (ConstantPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ConstantPackage getPackage() {
		return ConstantPackage.eINSTANCE;
	}

} //ConstantFactoryImpl
