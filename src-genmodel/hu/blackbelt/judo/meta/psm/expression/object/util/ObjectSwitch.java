/**
 */
package hu.blackbelt.judo.meta.psm.expression.object.util;

import hu.blackbelt.judo.meta.psm.expression.Expression;
import hu.blackbelt.judo.meta.psm.expression.Lambda;
import hu.blackbelt.judo.meta.psm.expression.NavigationExpression;
import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;
import hu.blackbelt.judo.meta.psm.expression.ReferenceExpression;
import hu.blackbelt.judo.meta.psm.expression.ReferenceSelector;
import hu.blackbelt.judo.meta.psm.expression.SwitchExpression;
import hu.blackbelt.judo.meta.psm.expression.VariableReference;

import hu.blackbelt.judo.meta.psm.expression.object.*;

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
 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage
 * @generated
 */
public class ObjectSwitch<T> extends Switch<T> {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ObjectPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectSwitch() {
        if (modelPackage == null) {
            modelPackage = ObjectPackage.eINSTANCE;
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
            case ObjectPackage.OBJECT_NAVIGATION_EXPRESSION: {
                ObjectNavigationExpression objectNavigationExpression = (ObjectNavigationExpression)theEObject;
                T result = caseObjectNavigationExpression(objectNavigationExpression);
                if (result == null) result = caseObjectExpression(objectNavigationExpression);
                if (result == null) result = caseObjectVariable(objectNavigationExpression);
                if (result == null) result = caseReferenceSelector(objectNavigationExpression);
                if (result == null) result = caseReferenceExpression(objectNavigationExpression);
                if (result == null) result = caseVariable(objectNavigationExpression);
                if (result == null) result = caseNavigationExpression(objectNavigationExpression);
                if (result == null) result = caseExpression(objectNavigationExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ObjectPackage.OBJECT_SELECTOR_EXPRESSION: {
                ObjectSelectorExpression objectSelectorExpression = (ObjectSelectorExpression)theEObject;
                T result = caseObjectSelectorExpression(objectSelectorExpression);
                if (result == null) result = caseObjectExpression(objectSelectorExpression);
                if (result == null) result = caseReferenceExpression(objectSelectorExpression);
                if (result == null) result = caseExpression(objectSelectorExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ObjectPackage.OBJECT_FILTER_EXPRESSION: {
                ObjectFilterExpression objectFilterExpression = (ObjectFilterExpression)theEObject;
                T result = caseObjectFilterExpression(objectFilterExpression);
                if (result == null) result = caseObjectExpression(objectFilterExpression);
                if (result == null) result = caseLambda(objectFilterExpression);
                if (result == null) result = caseReferenceExpression(objectFilterExpression);
                if (result == null) result = caseExpression(objectFilterExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ObjectPackage.OBJECT_VARIABLE_REFERENCE: {
                ObjectVariableReference objectVariableReference = (ObjectVariableReference)theEObject;
                T result = caseObjectVariableReference(objectVariableReference);
                if (result == null) result = caseObjectExpression(objectVariableReference);
                if (result == null) result = caseVariableReference(objectVariableReference);
                if (result == null) result = caseReferenceExpression(objectVariableReference);
                if (result == null) result = caseExpression(objectVariableReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ObjectPackage.CAST_OBJECT: {
                CastObject castObject = (CastObject)theEObject;
                T result = caseCastObject(castObject);
                if (result == null) result = caseObjectExpression(castObject);
                if (result == null) result = caseObjectVariable(castObject);
                if (result == null) result = caseReferenceExpression(castObject);
                if (result == null) result = caseVariable(castObject);
                if (result == null) result = caseExpression(castObject);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case ObjectPackage.OBJECT_SWITCH_EXPRESSION: {
                ObjectSwitchExpression objectSwitchExpression = (ObjectSwitchExpression)theEObject;
                T result = caseObjectSwitchExpression(objectSwitchExpression);
                if (result == null) result = caseSwitchExpression(objectSwitchExpression);
                if (result == null) result = caseObjectExpression(objectSwitchExpression);
                if (result == null) result = caseReferenceExpression(objectSwitchExpression);
                if (result == null) result = caseExpression(objectSwitchExpression);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
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
    public T caseObjectNavigationExpression(ObjectNavigationExpression object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Selector Expression</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Selector Expression</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseObjectSelectorExpression(ObjectSelectorExpression object) {
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
    public T caseObjectFilterExpression(ObjectFilterExpression object) {
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
    public T caseObjectVariableReference(ObjectVariableReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Cast Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Cast Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCastObject(CastObject object) {
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
    public T caseObjectSwitchExpression(ObjectSwitchExpression object) {
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
     * Returns the result of interpreting the object as an instance of '<em>Lambda</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Lambda</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseLambda(Lambda object) {
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

} //ObjectSwitch
