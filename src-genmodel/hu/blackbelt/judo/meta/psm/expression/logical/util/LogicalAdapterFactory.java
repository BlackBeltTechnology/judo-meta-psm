/**
 */
package hu.blackbelt.judo.meta.psm.expression.logical.util;

import hu.blackbelt.judo.meta.psm.expression.AttributeSelector;
import hu.blackbelt.judo.meta.psm.expression.DataExpression;
import hu.blackbelt.judo.meta.psm.expression.Expression;
import hu.blackbelt.judo.meta.psm.expression.LogicalExpression;
import hu.blackbelt.judo.meta.psm.expression.VariableReference;

import hu.blackbelt.judo.meta.psm.expression.logical.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalPackage
 * @generated
 */
public class LogicalAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static LogicalPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LogicalAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = LogicalPackage.eINSTANCE;
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
    protected LogicalSwitch<Adapter> modelSwitch =
        new LogicalSwitch<Adapter>() {
            @Override
            public Adapter caseStringComparison(StringComparison object) {
                return createStringComparisonAdapter();
            }
            @Override
            public Adapter caseEnumerationComparison(EnumerationComparison object) {
                return createEnumerationComparisonAdapter();
            }
            @Override
            public Adapter caseNegationExpression(NegationExpression object) {
                return createNegationExpressionAdapter();
            }
            @Override
            public Adapter caseKleeneExpression(KleeneExpression object) {
                return createKleeneExpressionAdapter();
            }
            @Override
            public Adapter caseInstanceOfExpression(InstanceOfExpression object) {
                return createInstanceOfExpressionAdapter();
            }
            @Override
            public Adapter caseLogicalAttribute(LogicalAttribute object) {
                return createLogicalAttributeAdapter();
            }
            @Override
            public Adapter caseUndefinedAttributeComparison(UndefinedAttributeComparison object) {
                return createUndefinedAttributeComparisonAdapter();
            }
            @Override
            public Adapter caseUndefinedNavigationComparison(UndefinedNavigationComparison object) {
                return createUndefinedNavigationComparisonAdapter();
            }
            @Override
            public Adapter caseLogicalVariableReference(LogicalVariableReference object) {
                return createLogicalVariableReferenceAdapter();
            }
            @Override
            public Adapter caseContainsExpression(ContainsExpression object) {
                return createContainsExpressionAdapter();
            }
            @Override
            public Adapter caseIntegerComparison(IntegerComparison object) {
                return createIntegerComparisonAdapter();
            }
            @Override
            public Adapter caseDecimalComparison(DecimalComparison object) {
                return createDecimalComparisonAdapter();
            }
            @Override
            public Adapter caseObjectComparison(ObjectComparison object) {
                return createObjectComparisonAdapter();
            }
            @Override
            public Adapter caseMemberOfExpression(MemberOfExpression object) {
                return createMemberOfExpressionAdapter();
            }
            @Override
            public Adapter caseTypeOfExpression(TypeOfExpression object) {
                return createTypeOfExpressionAdapter();
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
            public Adapter caseLogicalExpression(LogicalExpression object) {
                return createLogicalExpressionAdapter();
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
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.logical.StringComparison <em>String Comparison</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.logical.StringComparison
     * @generated
     */
    public Adapter createStringComparisonAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.logical.EnumerationComparison <em>Enumeration Comparison</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.logical.EnumerationComparison
     * @generated
     */
    public Adapter createEnumerationComparisonAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.logical.NegationExpression <em>Negation Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.logical.NegationExpression
     * @generated
     */
    public Adapter createNegationExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.logical.KleeneExpression <em>Kleene Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.logical.KleeneExpression
     * @generated
     */
    public Adapter createKleeneExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.logical.InstanceOfExpression <em>Instance Of Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.logical.InstanceOfExpression
     * @generated
     */
    public Adapter createInstanceOfExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.logical.LogicalAttribute <em>Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalAttribute
     * @generated
     */
    public Adapter createLogicalAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.logical.UndefinedAttributeComparison <em>Undefined Attribute Comparison</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.logical.UndefinedAttributeComparison
     * @generated
     */
    public Adapter createUndefinedAttributeComparisonAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.logical.UndefinedNavigationComparison <em>Undefined Navigation Comparison</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.logical.UndefinedNavigationComparison
     * @generated
     */
    public Adapter createUndefinedNavigationComparisonAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.logical.LogicalVariableReference <em>Variable Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.logical.LogicalVariableReference
     * @generated
     */
    public Adapter createLogicalVariableReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.logical.ContainsExpression <em>Contains Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.logical.ContainsExpression
     * @generated
     */
    public Adapter createContainsExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.logical.IntegerComparison <em>Integer Comparison</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.logical.IntegerComparison
     * @generated
     */
    public Adapter createIntegerComparisonAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.logical.DecimalComparison <em>Decimal Comparison</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.logical.DecimalComparison
     * @generated
     */
    public Adapter createDecimalComparisonAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.logical.ObjectComparison <em>Object Comparison</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.logical.ObjectComparison
     * @generated
     */
    public Adapter createObjectComparisonAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.logical.MemberOfExpression <em>Member Of Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.logical.MemberOfExpression
     * @generated
     */
    public Adapter createMemberOfExpressionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.logical.TypeOfExpression <em>Type Of Expression</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.logical.TypeOfExpression
     * @generated
     */
    public Adapter createTypeOfExpressionAdapter() {
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

} //LogicalAdapterFactory
