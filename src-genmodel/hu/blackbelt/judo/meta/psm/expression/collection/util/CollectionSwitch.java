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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage
 * @generated
 */
public class CollectionSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CollectionPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionSwitch() {
		if (modelPackage == null) {
			modelPackage = CollectionPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CollectionPackage.IMMUTABLE_COLLECTION: {
				ImmutableCollection immutableCollection = (ImmutableCollection)theEObject;
				T result = caseImmutableCollection(immutableCollection);
				if (result == null) result = caseCollectionExpression(immutableCollection);
				if (result == null) result = caseObjectVariable(immutableCollection);
				if (result == null) result = caseReferenceExpression(immutableCollection);
				if (result == null) result = caseVariable(immutableCollection);
				if (result == null) result = caseExpression(immutableCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectionPackage.COLLECTION_FILTER_EXPRESSION: {
				CollectionFilterExpression collectionFilterExpression = (CollectionFilterExpression)theEObject;
				T result = caseCollectionFilterExpression(collectionFilterExpression);
				if (result == null) result = caseCollectionExpression(collectionFilterExpression);
				if (result == null) result = caseFilteringExpression(collectionFilterExpression);
				if (result == null) result = caseReferenceExpression(collectionFilterExpression);
				if (result == null) result = caseExpression(collectionFilterExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectionPackage.COLLECTION_VARIABLE_REFERENCE: {
				CollectionVariableReference collectionVariableReference = (CollectionVariableReference)theEObject;
				T result = caseCollectionVariableReference(collectionVariableReference);
				if (result == null) result = caseCollectionExpression(collectionVariableReference);
				if (result == null) result = caseVariableReference(collectionVariableReference);
				if (result == null) result = caseReferenceExpression(collectionVariableReference);
				if (result == null) result = caseExpression(collectionVariableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION: {
				CollectionNavigationFromObjectExpression collectionNavigationFromObjectExpression = (CollectionNavigationFromObjectExpression)theEObject;
				T result = caseCollectionNavigationFromObjectExpression(collectionNavigationFromObjectExpression);
				if (result == null) result = caseCollectionExpression(collectionNavigationFromObjectExpression);
				if (result == null) result = caseObjectVariable(collectionNavigationFromObjectExpression);
				if (result == null) result = caseReferenceSelector(collectionNavigationFromObjectExpression);
				if (result == null) result = caseReferenceExpression(collectionNavigationFromObjectExpression);
				if (result == null) result = caseVariable(collectionNavigationFromObjectExpression);
				if (result == null) result = caseNavigationExpression(collectionNavigationFromObjectExpression);
				if (result == null) result = caseExpression(collectionNavigationFromObjectExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectionPackage.COLLECTION_NAVIGATION_FROM_COLLECTION_EXPRESSION: {
				CollectionNavigationFromCollectionExpression collectionNavigationFromCollectionExpression = (CollectionNavigationFromCollectionExpression)theEObject;
				T result = caseCollectionNavigationFromCollectionExpression(collectionNavigationFromCollectionExpression);
				if (result == null) result = caseCollectionExpression(collectionNavigationFromCollectionExpression);
				if (result == null) result = caseNavigationExpression(collectionNavigationFromCollectionExpression);
				if (result == null) result = caseObjectVariable(collectionNavigationFromCollectionExpression);
				if (result == null) result = caseReferenceExpression(collectionNavigationFromCollectionExpression);
				if (result == null) result = caseVariable(collectionNavigationFromCollectionExpression);
				if (result == null) result = caseExpression(collectionNavigationFromCollectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectionPackage.SORT_EXPRESSION: {
				SortExpression sortExpression = (SortExpression)theEObject;
				T result = caseSortExpression(sortExpression);
				if (result == null) result = caseOrderedCollectionExpression(sortExpression);
				if (result == null) result = caseCollectionExpression(sortExpression);
				if (result == null) result = caseReferenceExpression(sortExpression);
				if (result == null) result = caseExpression(sortExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectionPackage.SUB_COLLECTION_EXPRESSION: {
				SubCollectionExpression subCollectionExpression = (SubCollectionExpression)theEObject;
				T result = caseSubCollectionExpression(subCollectionExpression);
				if (result == null) result = caseOrderedCollectionExpression(subCollectionExpression);
				if (result == null) result = caseWindowingExpression(subCollectionExpression);
				if (result == null) result = caseCollectionExpression(subCollectionExpression);
				if (result == null) result = caseReferenceExpression(subCollectionExpression);
				if (result == null) result = caseExpression(subCollectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectionPackage.ORDER_BY_ITEM: {
				OrderByItem orderByItem = (OrderByItem)theEObject;
				T result = caseOrderByItem(orderByItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectionPackage.OBJECT_NAVIGATION_FROM_COLLECTION_EXPRESSION: {
				ObjectNavigationFromCollectionExpression objectNavigationFromCollectionExpression = (ObjectNavigationFromCollectionExpression)theEObject;
				T result = caseObjectNavigationFromCollectionExpression(objectNavigationFromCollectionExpression);
				if (result == null) result = caseCollectionExpression(objectNavigationFromCollectionExpression);
				if (result == null) result = caseNavigationExpression(objectNavigationFromCollectionExpression);
				if (result == null) result = caseObjectVariable(objectNavigationFromCollectionExpression);
				if (result == null) result = caseReferenceExpression(objectNavigationFromCollectionExpression);
				if (result == null) result = caseVariable(objectNavigationFromCollectionExpression);
				if (result == null) result = caseExpression(objectNavigationFromCollectionExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectionPackage.CAST_COLLECTION: {
				CastCollection castCollection = (CastCollection)theEObject;
				T result = caseCastCollection(castCollection);
				if (result == null) result = caseCollectionExpression(castCollection);
				if (result == null) result = caseObjectVariable(castCollection);
				if (result == null) result = caseReferenceExpression(castCollection);
				if (result == null) result = caseVariable(castCollection);
				if (result == null) result = caseExpression(castCollection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CollectionPackage.COLLECTION_SWITCH_EXPRESSION: {
				CollectionSwitchExpression collectionSwitchExpression = (CollectionSwitchExpression)theEObject;
				T result = caseCollectionSwitchExpression(collectionSwitchExpression);
				if (result == null) result = caseSwitchExpression(collectionSwitchExpression);
				if (result == null) result = caseObjectExpression(collectionSwitchExpression);
				if (result == null) result = caseReferenceExpression(collectionSwitchExpression);
				if (result == null) result = caseExpression(collectionSwitchExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Immutable Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Immutable Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImmutableCollection(ImmutableCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionFilterExpression(CollectionFilterExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionVariableReference(CollectionVariableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation From Object Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation From Object Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionNavigationFromObjectExpression(CollectionNavigationFromObjectExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation From Collection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation From Collection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionNavigationFromCollectionExpression(CollectionNavigationFromCollectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sort Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sort Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortExpression(SortExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Collection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Collection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubCollectionExpression(SubCollectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Order By Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Order By Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderByItem(OrderByItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Navigation From Collection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Navigation From Collection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectNavigationFromCollectionExpression(ObjectNavigationFromCollectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cast Collection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cast Collection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCastCollection(CastCollection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionSwitchExpression(CollectionSwitchExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceExpression(ReferenceExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionExpression(CollectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectVariable(ObjectVariable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtering Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtering Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilteringExpression(FilteringExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableReference(VariableReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationExpression(NavigationExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceSelector(ReferenceSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Collection Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Collection Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedCollectionExpression(OrderedCollectionExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Windowing Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Windowing Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindowingExpression(WindowingExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchExpression(SwitchExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectExpression(ObjectExpression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CollectionSwitch
