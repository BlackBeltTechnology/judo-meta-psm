/**
 */
package hu.blackbelt.judo.meta.psm.expression.temporal.util;

import hu.blackbelt.judo.meta.psm.expression.AttributeSelector;
import hu.blackbelt.judo.meta.psm.expression.DataExpression;
import hu.blackbelt.judo.meta.psm.expression.DateExpression;
import hu.blackbelt.judo.meta.psm.expression.Expression;
import hu.blackbelt.judo.meta.psm.expression.NumericExpression;
import hu.blackbelt.judo.meta.psm.expression.SwitchExpression;
import hu.blackbelt.judo.meta.psm.expression.TimestampExpression;

import hu.blackbelt.judo.meta.psm.expression.temporal.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TemporalPackage
 * @generated
 */
public class TemporalAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TemporalPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TemporalPackage.eINSTANCE;
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
	protected TemporalSwitch<Adapter> modelSwitch =
		new TemporalSwitch<Adapter>() {
			@Override
			public Adapter caseDateAttribute(DateAttribute object) {
				return createDateAttributeAdapter();
			}
			@Override
			public Adapter caseTimestampAttribute(TimestampAttribute object) {
				return createTimestampAttributeAdapter();
			}
			@Override
			public Adapter caseDateSwitchExpression(DateSwitchExpression object) {
				return createDateSwitchExpressionAdapter();
			}
			@Override
			public Adapter caseTimestampSwitchExpression(TimestampSwitchExpression object) {
				return createTimestampSwitchExpressionAdapter();
			}
			@Override
			public Adapter caseTimestampAdditionExpression(TimestampAdditionExpression object) {
				return createTimestampAdditionExpressionAdapter();
			}
			@Override
			public Adapter caseTimestampDifferenceExpression(TimestampDifferenceExpression object) {
				return createTimestampDifferenceExpressionAdapter();
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
			public Adapter caseDateExpression(DateExpression object) {
				return createDateExpressionAdapter();
			}
			@Override
			public Adapter caseAttributeSelector(AttributeSelector object) {
				return createAttributeSelectorAdapter();
			}
			@Override
			public Adapter caseTimestampExpression(TimestampExpression object) {
				return createTimestampExpressionAdapter();
			}
			@Override
			public Adapter caseSwitchExpression(SwitchExpression object) {
				return createSwitchExpressionAdapter();
			}
			@Override
			public Adapter caseNumericExpression(NumericExpression object) {
				return createNumericExpressionAdapter();
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
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.temporal.DateAttribute <em>Date Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.DateAttribute
	 * @generated
	 */
	public Adapter createDateAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAttribute <em>Timestamp Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAttribute
	 * @generated
	 */
	public Adapter createTimestampAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.temporal.DateSwitchExpression <em>Date Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.DateSwitchExpression
	 * @generated
	 */
	public Adapter createDateSwitchExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampSwitchExpression <em>Timestamp Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TimestampSwitchExpression
	 * @generated
	 */
	public Adapter createTimestampSwitchExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAdditionExpression <em>Timestamp Addition Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TimestampAdditionExpression
	 * @generated
	 */
	public Adapter createTimestampAdditionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.temporal.TimestampDifferenceExpression <em>Timestamp Difference Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.temporal.TimestampDifferenceExpression
	 * @generated
	 */
	public Adapter createTimestampDifferenceExpressionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.AttributeSelector <em>Attribute Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.AttributeSelector
	 * @generated
	 */
	public Adapter createAttributeSelectorAdapter() {
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
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.SwitchExpression <em>Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.SwitchExpression
	 * @generated
	 */
	public Adapter createSwitchExpressionAdapter() {
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

} //TemporalAdapterFactory
