/**
 */
package hu.blackbelt.judo.meta.psm.expression.custom.util;

import hu.blackbelt.judo.meta.psm.expression.AttributeSelector;
import hu.blackbelt.judo.meta.psm.expression.CustomExpression;
import hu.blackbelt.judo.meta.psm.expression.DataExpression;
import hu.blackbelt.judo.meta.psm.expression.Expression;
import hu.blackbelt.judo.meta.psm.expression.SwitchExpression;
import hu.blackbelt.judo.meta.psm.expression.VariableReference;

import hu.blackbelt.judo.meta.psm.expression.custom.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.custom.CustomPackage
 * @generated
 */
public class CustomAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static CustomPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CustomAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = CustomPackage.eINSTANCE;
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
    protected CustomSwitch<Adapter> modelSwitch =
        new CustomSwitch<Adapter>() {
            @Override
            public Adapter caseCustomAttribute(CustomAttribute object) {
                return createCustomAttributeAdapter();
            }
            @Override
            public Adapter caseCustomVariableReference(CustomVariableReference object) {
                return createCustomVariableReferenceAdapter();
            }
            @Override
            public Adapter caseCustomSwitchExpression(CustomSwitchExpression object) {
                return createCustomSwitchExpressionAdapter();
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
            public Adapter caseCustomExpression(CustomExpression object) {
                return createCustomExpressionAdapter();
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
            public Adapter caseSwitchExpression(SwitchExpression object) {
                return createSwitchExpressionAdapter();
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
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.custom.CustomAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.custom.CustomAttribute
     * @generated
     */
    public Adapter createCustomAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.custom.CustomVariableReference <em>Variable Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.custom.CustomVariableReference
     * @generated
     */
    public Adapter createCustomVariableReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.custom.CustomSwitchExpression <em>Switch Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.custom.CustomSwitchExpression
     * @generated
     */
    public Adapter createCustomSwitchExpressionAdapter() {
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

} //CustomAdapterFactory