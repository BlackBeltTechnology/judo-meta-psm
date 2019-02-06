/**
 */
package hu.blackbelt.judo.meta.psm.expression.util;

import hu.blackbelt.judo.meta.psm.expression.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.ExpressionPackage
 * @generated
 */
public class ExpressionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExpressionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExpressionPackage.eINSTANCE;
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
	protected ExpressionSwitch<Adapter> modelSwitch =
		new ExpressionSwitch<Adapter>() {
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseElementName(ElementName object) {
				return createElementNameAdapter();
			}
			@Override
			public Adapter caseNumericExpression(NumericExpression object) {
				return createNumericExpressionAdapter();
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
			public Adapter caseObjectExpression(ObjectExpression object) {
				return createObjectExpressionAdapter();
			}
			@Override
			public Adapter caseCollectionExpression(CollectionExpression object) {
				return createCollectionExpressionAdapter();
			}
			@Override
			public Adapter caseAttributeSelector(AttributeSelector object) {
				return createAttributeSelectorAdapter();
			}
			@Override
			public Adapter caseVariableReference(VariableReference object) {
				return createVariableReferenceAdapter();
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
			public Adapter caseOrderedCollectionExpression(OrderedCollectionExpression object) {
				return createOrderedCollectionExpressionAdapter();
			}
			@Override
			public Adapter caseDataExpression(DataExpression object) {
				return createDataExpressionAdapter();
			}
			@Override
			public Adapter caseNavigationExpression(NavigationExpression object) {
				return createNavigationExpressionAdapter();
			}
			@Override
			public Adapter caseSwitchExpression(SwitchExpression object) {
				return createSwitchExpressionAdapter();
			}
			@Override
			public Adapter caseSwitchCase(SwitchCase object) {
				return createSwitchCaseAdapter();
			}
			@Override
			public Adapter caseAggregatedExpression(AggregatedExpression object) {
				return createAggregatedExpressionAdapter();
			}
			@Override
			public Adapter caseReferenceExpression(ReferenceExpression object) {
				return createReferenceExpressionAdapter();
			}
			@Override
			public Adapter caseReferenceSelector(ReferenceSelector object) {
				return createReferenceSelectorAdapter();
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
			public Adapter caseTypeName(TypeName object) {
				return createTypeNameAdapter();
			}
			@Override
			public Adapter caseMeasureName(MeasureName object) {
				return createMeasureNameAdapter();
			}
			@Override
			public Adapter caseWindowingExpression(WindowingExpression object) {
				return createWindowingExpressionAdapter();
			}
			@Override
			public Adapter caseFilteringExpression(FilteringExpression object) {
				return createFilteringExpressionAdapter();
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
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.ElementName <em>Element Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.ElementName
	 * @generated
	 */
	public Adapter createElementNameAdapter() {
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
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.CollectionExpression <em>Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.CollectionExpression
	 * @generated
	 */
	public Adapter createCollectionExpressionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.VariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.VariableReference
	 * @generated
	 */
	public Adapter createVariableReferenceAdapter() {
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
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.OrderedCollectionExpression <em>Ordered Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.OrderedCollectionExpression
	 * @generated
	 */
	public Adapter createOrderedCollectionExpressionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.NavigationExpression <em>Navigation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.NavigationExpression
	 * @generated
	 */
	public Adapter createNavigationExpressionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.SwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.SwitchCase
	 * @generated
	 */
	public Adapter createSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.AggregatedExpression <em>Aggregated Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.AggregatedExpression
	 * @generated
	 */
	public Adapter createAggregatedExpressionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.ReferenceSelector <em>Reference Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.ReferenceSelector
	 * @generated
	 */
	public Adapter createReferenceSelectorAdapter() {
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
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.TypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.TypeName
	 * @generated
	 */
	public Adapter createTypeNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.MeasureName <em>Measure Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.MeasureName
	 * @generated
	 */
	public Adapter createMeasureNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.WindowingExpression <em>Windowing Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.WindowingExpression
	 * @generated
	 */
	public Adapter createWindowingExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.FilteringExpression <em>Filtering Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.FilteringExpression
	 * @generated
	 */
	public Adapter createFilteringExpressionAdapter() {
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

} //ExpressionAdapterFactory
