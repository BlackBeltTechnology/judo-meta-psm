/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection.util;

import hu.blackbelt.judo.meta.psm.expression.CollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.Expression;
import hu.blackbelt.judo.meta.psm.expression.FilteringExpression;
import hu.blackbelt.judo.meta.psm.expression.NavigationExpression;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;
import hu.blackbelt.judo.meta.psm.expression.OrderedCollectionExpression;
import hu.blackbelt.judo.meta.psm.expression.ReferenceExpression;
import hu.blackbelt.judo.meta.psm.expression.ReferenceSelector;
import hu.blackbelt.judo.meta.psm.expression.SwitchExpression;
import hu.blackbelt.judo.meta.psm.expression.VariableReference;
import hu.blackbelt.judo.meta.psm.expression.WindowingExpression;

import hu.blackbelt.judo.meta.psm.expression.collection.*;

import hu.blackbelt.judo.meta.psm.expression.variable.ObjectVariable;
import hu.blackbelt.judo.meta.psm.expression.variable.Variable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage
 * @generated
 */
public class CollectionAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CollectionPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CollectionPackage.eINSTANCE;
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
	protected CollectionSwitch<Adapter> modelSwitch =
		new CollectionSwitch<Adapter>() {
			@Override
			public Adapter caseImmutableCollection(ImmutableCollection object) {
				return createImmutableCollectionAdapter();
			}
			@Override
			public Adapter caseCollectionFilterExpression(CollectionFilterExpression object) {
				return createCollectionFilterExpressionAdapter();
			}
			@Override
			public Adapter caseCollectionVariableReference(CollectionVariableReference object) {
				return createCollectionVariableReferenceAdapter();
			}
			@Override
			public Adapter caseCollectionNavigationFromObjectExpression(CollectionNavigationFromObjectExpression object) {
				return createCollectionNavigationFromObjectExpressionAdapter();
			}
			@Override
			public Adapter caseCollectionNavigationFromCollectionExpression(CollectionNavigationFromCollectionExpression object) {
				return createCollectionNavigationFromCollectionExpressionAdapter();
			}
			@Override
			public Adapter caseSortExpression(SortExpression object) {
				return createSortExpressionAdapter();
			}
			@Override
			public Adapter caseSubCollectionExpression(SubCollectionExpression object) {
				return createSubCollectionExpressionAdapter();
			}
			@Override
			public Adapter caseOrderByItem(OrderByItem object) {
				return createOrderByItemAdapter();
			}
			@Override
			public Adapter caseObjectNavigationFromCollectionExpression(ObjectNavigationFromCollectionExpression object) {
				return createObjectNavigationFromCollectionExpressionAdapter();
			}
			@Override
			public Adapter caseCastCollection(CastCollection object) {
				return createCastCollectionAdapter();
			}
			@Override
			public Adapter caseCollectionSwitchExpression(CollectionSwitchExpression object) {
				return createCollectionSwitchExpressionAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object) {
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseReferenceExpression(ReferenceExpression object) {
				return createReferenceExpressionAdapter();
			}
			@Override
			public Adapter caseCollectionExpression(CollectionExpression object) {
				return createCollectionExpressionAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseObjectVariable(ObjectVariable object) {
				return createObjectVariableAdapter();
			}
			@Override
			public Adapter caseFilteringExpression(FilteringExpression object) {
				return createFilteringExpressionAdapter();
			}
			@Override
			public Adapter caseVariableReference(VariableReference object) {
				return createVariableReferenceAdapter();
			}
			@Override
			public Adapter caseNavigationExpression(NavigationExpression object) {
				return createNavigationExpressionAdapter();
			}
			@Override
			public Adapter caseReferenceSelector(ReferenceSelector object) {
				return createReferenceSelectorAdapter();
			}
			@Override
			public Adapter caseOrderedCollectionExpression(OrderedCollectionExpression object) {
				return createOrderedCollectionExpressionAdapter();
			}
			@Override
			public Adapter caseWindowingExpression(WindowingExpression object) {
				return createWindowingExpressionAdapter();
			}
			@Override
			public Adapter caseSwitchExpression(SwitchExpression object) {
				return createSwitchExpressionAdapter();
			}
			@Override
			public Adapter caseObjectExpression(ObjectExpression object) {
				return createObjectExpressionAdapter();
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
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.collection.ImmutableCollection <em>Immutable Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.ImmutableCollection
	 * @generated
	 */
	public Adapter createImmutableCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionFilterExpression <em>Filter Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionFilterExpression
	 * @generated
	 */
	public Adapter createCollectionFilterExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionVariableReference <em>Variable Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionVariableReference
	 * @generated
	 */
	public Adapter createCollectionVariableReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromObjectExpression <em>Navigation From Object Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromObjectExpression
	 * @generated
	 */
	public Adapter createCollectionNavigationFromObjectExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromCollectionExpression <em>Navigation From Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionNavigationFromCollectionExpression
	 * @generated
	 */
	public Adapter createCollectionNavigationFromCollectionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.collection.SortExpression <em>Sort Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.SortExpression
	 * @generated
	 */
	public Adapter createSortExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression <em>Sub Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.SubCollectionExpression
	 * @generated
	 */
	public Adapter createSubCollectionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.collection.OrderByItem <em>Order By Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.OrderByItem
	 * @generated
	 */
	public Adapter createOrderByItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.collection.ObjectNavigationFromCollectionExpression <em>Object Navigation From Collection Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.ObjectNavigationFromCollectionExpression
	 * @generated
	 */
	public Adapter createObjectNavigationFromCollectionExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.collection.CastCollection <em>Cast Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CastCollection
	 * @generated
	 */
	public Adapter createCastCollectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.collection.CollectionSwitchExpression <em>Switch Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionSwitchExpression
	 * @generated
	 */
	public Adapter createCollectionSwitchExpressionAdapter() {
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
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.variable.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.variable.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.variable.ObjectVariable <em>Object Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.blackbelt.judo.meta.psm.expression.variable.ObjectVariable
	 * @generated
	 */
	public Adapter createObjectVariableAdapter() {
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

} //CollectionAdapterFactory
