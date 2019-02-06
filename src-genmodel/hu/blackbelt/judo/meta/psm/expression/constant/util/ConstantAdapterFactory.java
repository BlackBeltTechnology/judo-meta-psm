/**
 */
package hu.blackbelt.judo.meta.psm.expression.constant.util;

import hu.blackbelt.judo.meta.psm.expression.CustomExpression;
import hu.blackbelt.judo.meta.psm.expression.DataExpression;
import hu.blackbelt.judo.meta.psm.expression.DateExpression;
import hu.blackbelt.judo.meta.psm.expression.DecimalExpression;
import hu.blackbelt.judo.meta.psm.expression.EnumerationExpression;
import hu.blackbelt.judo.meta.psm.expression.Expression;
import hu.blackbelt.judo.meta.psm.expression.IntegerExpression;
import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;
import hu.blackbelt.judo.meta.psm.expression.NumericExpression;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;
import hu.blackbelt.judo.meta.psm.expression.ReferenceExpression;
import hu.blackbelt.judo.meta.psm.expression.StringExpression;
import hu.blackbelt.judo.meta.psm.expression.TimestampExpression;

import hu.blackbelt.judo.meta.psm.expression.constant.BooleanConstant;
import hu.blackbelt.judo.meta.psm.expression.constant.Constant;
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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage
 * @generated
 */
public class ConstantAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ConstantPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ConstantPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantSwitch<Adapter> modelSwitch =
		new ConstantSwitch<Adapter>() {
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseNumber(hu.blackbelt.judo.meta.psm.expression.constant.Number object) {
				return createNumberAdapter();
			}
			@Override
			public Adapter caseIntegerConstant(IntegerConstant object) {
				return createIntegerConstantAdapter();
			}
			@Override
			public Adapter caseDecimalConstant(DecimalConstant object) {
				return createDecimalConstantAdapter();
			}
			@Override
			public Adapter caseBooleanConstant(BooleanConstant object) {
				return createBooleanConstantAdapter();
			}
			@Override
			public Adapter caseStringConstant(StringConstant object) {
				return createStringConstantAdapter();
			}
			@Override
			public Adapter caseLiteral(Literal object) {
				return createLiteralAdapter();
			}
			@Override
			public Adapter caseInstance(Instance object) {
				return createInstanceAdapter();
			}
			@Override
			public Adapter caseCustomData(CustomData object) {
				return createCustomDataAdapter();
			}
			@Override
			public Adapter caseMeasuredDecimal(MeasuredDecimal object) {
				return createMeasuredDecimalAdapter();
			}
			@Override
			public Adapter caseMeasuredInteger(MeasuredInteger object) {
				return createMeasuredIntegerAdapter();
			}
			@Override
			public Adapter caseDateConstant(DateConstant object) {
				return createDateConstantAdapter();
			}
			@Override
			public Adapter caseTimestampConstant(TimestampConstant object) {
				return createTimestampConstantAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseDataExpression(DataExpression object) {
				return createDataExpressionAdapter();
			}
			@Override
			public Adapter caseNumericExpression(NumericExpression object) {
				return createNumericExpressionAdapter();
			}
			@Override
			public Adapter caseIntegerExpression(IntegerExpression object) {
				return createIntegerExpressionAdapter();
			}
			@Override
			public Adapter caseDecimalExpression(DecimalExpression object) {
				return createDecimalExpressionAdapter();
			}
			@Override
			public Adapter caseLogicalExpression(LogicalExpression object) {
				return createLogicalExpressionAdapter();
			}
			@Override
			public Adapter caseStringExpression(StringExpression object) {
				return createStringExpressionAdapter();
			}
			@Override
			public Adapter caseEnumerationExpression(EnumerationExpression object) {
				return createEnumerationExpressionAdapter();
			}
			@Override
			public Adapter caseReferenceExpression(ReferenceExpression object) {
				return createReferenceExpressionAdapter();
			}
			@Override
			public Adapter caseObjectExpression(ObjectExpression object) {
				return createObjectExpressionAdapter();
			}
			@Override
			public Adapter caseCustomExpression(CustomExpression object) {
				return createCustomExpressionAdapter();
			}
			@Override
			public Adapter caseDateExpression(DateExpression object) {
				return createDateExpressionAdapter();
			}
			@Override
			public Adapter caseTimestampExpression(TimestampExpression object) {
				return createTimestampExpressionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.constant.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.constant.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.Number
	 * @generated
	 */
	public Adapter createNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.constant.IntegerConstant <em>Integer Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.IntegerConstant
	 * @generated
	 */
	public Adapter createIntegerConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.constant.DecimalConstant <em>Decimal Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.DecimalConstant
	 * @generated
	 */
	public Adapter createDecimalConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.constant.BooleanConstant <em>Boolean Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.BooleanConstant
	 * @generated
	 */
	public Adapter createBooleanConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.constant.StringConstant <em>String Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.StringConstant
	 * @generated
	 */
	public Adapter createStringConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.constant.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.Literal
	 * @generated
	 */
	public Adapter createLiteralAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.constant.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.constant.CustomData <em>Custom Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.CustomData
	 * @generated
	 */
	public Adapter createCustomDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.constant.MeasuredDecimal <em>Measured Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.MeasuredDecimal
	 * @generated
	 */
	public Adapter createMeasuredDecimalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.constant.MeasuredInteger <em>Measured Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.MeasuredInteger
	 * @generated
	 */
	public Adapter createMeasuredIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.constant.DateConstant <em>Date Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.DateConstant
	 * @generated
	 */
	public Adapter createDateConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.constant.TimestampConstant <em>Timestamp Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.constant.TimestampConstant
	 * @generated
	 */
	public Adapter createTimestampConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.DataExpression <em>Data Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.DataExpression
	 * @generated
	 */
	public Adapter createDataExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.NumericExpression <em>Numeric Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.NumericExpression
	 * @generated
	 */
	public Adapter createNumericExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.IntegerExpression <em>Integer Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.IntegerExpression
	 * @generated
	 */
	public Adapter createIntegerExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.DecimalExpression <em>Decimal Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.DecimalExpression
	 * @generated
	 */
	public Adapter createDecimalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.LogicalExpression <em>Logical Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.LogicalExpression
	 * @generated
	 */
	public Adapter createLogicalExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.StringExpression <em>String Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.StringExpression
	 * @generated
	 */
	public Adapter createStringExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.EnumerationExpression <em>Enumeration Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.EnumerationExpression
	 * @generated
	 */
	public Adapter createEnumerationExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.ReferenceExpression <em>Reference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.ReferenceExpression
	 * @generated
	 */
	public Adapter createReferenceExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.ObjectExpression <em>Object Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.ObjectExpression
	 * @generated
	 */
	public Adapter createObjectExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.CustomExpression <em>Custom Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.CustomExpression
	 * @generated
	 */
	public Adapter createCustomExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.DateExpression <em>Date Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.DateExpression
	 * @generated
	 */
	public Adapter createDateExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.TimestampExpression <em>Timestamp Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.TimestampExpression
	 * @generated
	 */
	public Adapter createTimestampExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ConstantAdapterFactory
