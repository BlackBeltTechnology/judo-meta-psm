/**
 */
package hu.blackbelt.judo.meta.psm.expression.variable.util;

import hu.blackbelt.judo.meta.psm.expression.variable.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.variable.VariablePackage
 * @generated
 */
public class VariableAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static VariablePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VariableAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = VariablePackage.eINSTANCE;
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
    protected VariableSwitch<Adapter> modelSwitch =
        new VariableSwitch<Adapter>() {
            @Override
            public Adapter caseVariable(Variable object) {
                return createVariableAdapter();
            }
            @Override
            public Adapter caseLogicalVariable(LogicalVariable object) {
                return createLogicalVariableAdapter();
            }
            @Override
            public Adapter caseStringVariable(StringVariable object) {
                return createStringVariableAdapter();
            }
            @Override
            public Adapter caseEnumerationVariable(EnumerationVariable object) {
                return createEnumerationVariableAdapter();
            }
            @Override
            public Adapter caseObjectVariable(ObjectVariable object) {
                return createObjectVariableAdapter();
            }
            @Override
            public Adapter caseCollectionVariable(CollectionVariable object) {
                return createCollectionVariableAdapter();
            }
            @Override
            public Adapter caseIntegerVariable(IntegerVariable object) {
                return createIntegerVariableAdapter();
            }
            @Override
            public Adapter caseDecimalVariable(DecimalVariable object) {
                return createDecimalVariableAdapter();
            }
            @Override
            public Adapter caseCustomVariable(CustomVariable object) {
                return createCustomVariableAdapter();
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
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.variable.LogicalVariable <em>Logical Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.LogicalVariable
     * @generated
     */
    public Adapter createLogicalVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.variable.StringVariable <em>String Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.StringVariable
     * @generated
     */
    public Adapter createStringVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.variable.EnumerationVariable <em>Enumeration Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.EnumerationVariable
     * @generated
     */
    public Adapter createEnumerationVariableAdapter() {
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
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.variable.CollectionVariable <em>Collection Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.CollectionVariable
     * @generated
     */
    public Adapter createCollectionVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.variable.IntegerVariable <em>Integer Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.IntegerVariable
     * @generated
     */
    public Adapter createIntegerVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.variable.DecimalVariable <em>Decimal Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.DecimalVariable
     * @generated
     */
    public Adapter createDecimalVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.expression.variable.CustomVariable <em>Custom Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.expression.variable.CustomVariable
     * @generated
     */
    public Adapter createCustomVariableAdapter() {
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

} //VariableAdapterFactory