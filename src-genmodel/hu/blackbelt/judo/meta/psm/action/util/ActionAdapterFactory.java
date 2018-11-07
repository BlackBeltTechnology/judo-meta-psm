/**
 */
package hu.blackbelt.judo.meta.psm.action.util;

import hu.blackbelt.judo.meta.psm.action.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.action.ActionPackage
 * @generated
 */
public class ActionAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static ActionPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = ActionPackage.eINSTANCE;
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
    protected ActionSwitch<Adapter> modelSwitch =
        new ActionSwitch<Adapter>() {
            @Override
            public Adapter caseAction(Action object) {
                return createActionAdapter();
            }
            @Override
            public Adapter caseFunction(Function object) {
                return createFunctionAdapter();
            }
            @Override
            public Adapter caseQuery(Query object) {
                return createQueryAdapter();
            }
            @Override
            public Adapter caseParameter(Parameter object) {
                return createParameterAdapter();
            }
            @Override
            public Adapter caseEntityParameter(EntityParameter object) {
                return createEntityParameterAdapter();
            }
            @Override
            public Adapter casePrimitiveParameter(PrimitiveParameter object) {
                return createPrimitiveParameterAdapter();
            }
            @Override
            public Adapter caseSingleEntityParameter(SingleEntityParameter object) {
                return createSingleEntityParameterAdapter();
            }
            @Override
            public Adapter caseListEntityParameter(ListEntityParameter object) {
                return createListEntityParameterAdapter();
            }
            @Override
            public Adapter caseDeleteOperation(DeleteOperation object) {
                return createDeleteOperationAdapter();
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
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.action.Action <em>Action</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.action.Action
     * @generated
     */
    public Adapter createActionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.action.Function <em>Function</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.action.Function
     * @generated
     */
    public Adapter createFunctionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.action.Query <em>Query</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.action.Query
     * @generated
     */
    public Adapter createQueryAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.action.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.action.Parameter
     * @generated
     */
    public Adapter createParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.action.EntityParameter <em>Entity Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.action.EntityParameter
     * @generated
     */
    public Adapter createEntityParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.action.PrimitiveParameter <em>Primitive Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.action.PrimitiveParameter
     * @generated
     */
    public Adapter createPrimitiveParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.action.SingleEntityParameter <em>Single Entity Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.action.SingleEntityParameter
     * @generated
     */
    public Adapter createSingleEntityParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.action.ListEntityParameter <em>List Entity Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.action.ListEntityParameter
     * @generated
     */
    public Adapter createListEntityParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.action.DeleteOperation <em>Delete Operation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.action.DeleteOperation
     * @generated
     */
    public Adapter createDeleteOperationAdapter() {
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

} //ActionAdapterFactory
