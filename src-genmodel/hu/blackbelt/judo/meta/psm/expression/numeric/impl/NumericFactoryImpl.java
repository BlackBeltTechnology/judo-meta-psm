/**
 */
package hu.blackbelt.judo.meta.psm.expression.numeric.impl;

import hu.blackbelt.judo.meta.psm.expression.numeric.*;

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
public class NumericFactoryImpl extends EFactoryImpl implements NumericFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NumericFactory init() {
		try {
			NumericFactory theNumericFactory = (NumericFactory)EPackage.Registry.INSTANCE.getEFactory(NumericPackage.eNS_URI);
			if (theNumericFactory != null) {
				return theNumericFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NumericFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericFactoryImpl() {
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
			case NumericPackage.COUNT_EXPRESSION: return createCountExpression();
			case NumericPackage.INTEGER_ARITMETIC_EXPRESSION: return createIntegerAritmeticExpression();
			case NumericPackage.DECIMAL_ARITMETIC_EXPRESSION: return createDecimalAritmeticExpression();
			case NumericPackage.INTEGER_OPPOSITE_EXPRESSION: return createIntegerOppositeExpression();
			case NumericPackage.DECIMAL_OPPOSITE_EXPRESSION: return createDecimalOppositeExpression();
			case NumericPackage.INTEGER_ATTRIBUTE: return createIntegerAttribute();
			case NumericPackage.DECIMAL_ATTRIBUTE: return createDecimalAttribute();
			case NumericPackage.INTEGER_AGGREGATED_EXPRESSION: return createIntegerAggregatedExpression();
			case NumericPackage.DECIMAL_AGGREGATED_EXPRESSION: return createDecimalAggregatedExpression();
			case NumericPackage.ROUND_EXPRESSION: return createRoundExpression();
			case NumericPackage.INTEGER_SWITCH_EXPRESSION: return createIntegerSwitchExpression();
			case NumericPackage.DECIMAL_SWITCH_EXPRESSION: return createDecimalSwitchExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountExpression createCountExpression() {
		CountExpressionImpl countExpression = new CountExpressionImpl();
		return countExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerAritmeticExpression createIntegerAritmeticExpression() {
		IntegerAritmeticExpressionImpl integerAritmeticExpression = new IntegerAritmeticExpressionImpl();
		return integerAritmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalAritmeticExpression createDecimalAritmeticExpression() {
		DecimalAritmeticExpressionImpl decimalAritmeticExpression = new DecimalAritmeticExpressionImpl();
		return decimalAritmeticExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerOppositeExpression createIntegerOppositeExpression() {
		IntegerOppositeExpressionImpl integerOppositeExpression = new IntegerOppositeExpressionImpl();
		return integerOppositeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalOppositeExpression createDecimalOppositeExpression() {
		DecimalOppositeExpressionImpl decimalOppositeExpression = new DecimalOppositeExpressionImpl();
		return decimalOppositeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerAttribute createIntegerAttribute() {
		IntegerAttributeImpl integerAttribute = new IntegerAttributeImpl();
		return integerAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalAttribute createDecimalAttribute() {
		DecimalAttributeImpl decimalAttribute = new DecimalAttributeImpl();
		return decimalAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerAggregatedExpression createIntegerAggregatedExpression() {
		IntegerAggregatedExpressionImpl integerAggregatedExpression = new IntegerAggregatedExpressionImpl();
		return integerAggregatedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalAggregatedExpression createDecimalAggregatedExpression() {
		DecimalAggregatedExpressionImpl decimalAggregatedExpression = new DecimalAggregatedExpressionImpl();
		return decimalAggregatedExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoundExpression createRoundExpression() {
		RoundExpressionImpl roundExpression = new RoundExpressionImpl();
		return roundExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerSwitchExpression createIntegerSwitchExpression() {
		IntegerSwitchExpressionImpl integerSwitchExpression = new IntegerSwitchExpressionImpl();
		return integerSwitchExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalSwitchExpression createDecimalSwitchExpression() {
		DecimalSwitchExpressionImpl decimalSwitchExpression = new DecimalSwitchExpressionImpl();
		return decimalSwitchExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumericPackage getNumericPackage() {
		return (NumericPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NumericPackage getPackage() {
		return NumericPackage.eINSTANCE;
	}

} //NumericFactoryImpl
