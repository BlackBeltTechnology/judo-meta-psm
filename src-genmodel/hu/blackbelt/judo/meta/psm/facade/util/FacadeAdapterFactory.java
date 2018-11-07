/**
 */
package hu.blackbelt.judo.meta.psm.facade.util;

import hu.blackbelt.judo.meta.psm.facade.*;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage
 * @generated
 */
public class FacadeAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static FacadePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FacadeAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = FacadePackage.eINSTANCE;
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
    protected FacadeSwitch<Adapter> modelSwitch =
        new FacadeSwitch<Adapter>() {
            @Override
            public Adapter casePropertySet(PropertySet object) {
                return createPropertySetAdapter();
            }
            @Override
            public Adapter caseProperty(Property object) {
                return createPropertyAdapter();
            }
            @Override
            public Adapter caseNavigation(Navigation object) {
                return createNavigationAdapter();
            }
            @Override
            public Adapter caseSingleNavigation(SingleNavigation object) {
                return createSingleNavigationAdapter();
            }
            @Override
            public Adapter caseListNavigation(ListNavigation object) {
                return createListNavigationAdapter();
            }
            @Override
            public Adapter caseEntitySetSelector(EntitySetSelector object) {
                return createEntitySetSelectorAdapter();
            }
            @Override
            public Adapter caseEntitySingleSelector(EntitySingleSelector object) {
                return createEntitySingleSelectorAdapter();
            }
            @Override
            public Adapter caseEntitySelector(EntitySelector object) {
                return createEntitySelectorAdapter();
            }
            @Override
            public Adapter caseFacade(Facade object) {
                return createFacadeAdapter();
            }
            @Override
            public Adapter caseStandaloneFacade(StandaloneFacade object) {
                return createStandaloneFacadeAdapter();
            }
            @Override
            public Adapter caseDeleteOperation(DeleteOperation object) {
                return createDeleteOperationAdapter();
            }
            @Override
            public Adapter caseReadFilterableProperty(ReadFilterableProperty object) {
                return createReadFilterablePropertyAdapter();
            }
            @Override
            public Adapter caseReadFunctionProperty(ReadFunctionProperty object) {
                return createReadFunctionPropertyAdapter();
            }
            @Override
            public Adapter caseReadProperty(ReadProperty object) {
                return createReadPropertyAdapter();
            }
            @Override
            public Adapter caseWriteProperty(WriteProperty object) {
                return createWritePropertyAdapter();
            }
            @Override
            public Adapter caseWriteAttribute(WriteAttribute object) {
                return createWriteAttributeAdapter();
            }
            @Override
            public Adapter caseWriteFunctionProperty(WriteFunctionProperty object) {
                return createWriteFunctionPropertyAdapter();
            }
            @Override
            public Adapter caseTraverseFunctionSingleNavigation(TraverseFunctionSingleNavigation object) {
                return createTraverseFunctionSingleNavigationAdapter();
            }
            @Override
            public Adapter caseTraverseSingleNavigation(TraverseSingleNavigation object) {
                return createTraverseSingleNavigationAdapter();
            }
            @Override
            public Adapter caseTraverseListNavigation(TraverseListNavigation object) {
                return createTraverseListNavigationAdapter();
            }
            @Override
            public Adapter caseMultiTraverseFunctionDefinition(MultiTraverseFunctionDefinition object) {
                return createMultiTraverseFunctionDefinitionAdapter();
            }
            @Override
            public Adapter caseCreateOperation(CreateOperation object) {
                return createCreateOperationAdapter();
            }
            @Override
            public Adapter caseDefaultCreateOperation(DefaultCreateOperation object) {
                return createDefaultCreateOperationAdapter();
            }
            @Override
            public Adapter caseCustomCreateOperation(CustomCreateOperation object) {
                return createCustomCreateOperationAdapter();
            }
            @Override
            public Adapter caseUpdateOperation(UpdateOperation object) {
                return createUpdateOperationAdapter();
            }
            @Override
            public Adapter caseDefaultUpdateOperation(DefaultUpdateOperation object) {
                return createDefaultUpdateOperationAdapter();
            }
            @Override
            public Adapter caseCustomUpdateOperation(CustomUpdateOperation object) {
                return createCustomUpdateOperationAdapter();
            }
            @Override
            public Adapter caseBindSingleNavigation(BindSingleNavigation object) {
                return createBindSingleNavigationAdapter();
            }
            @Override
            public Adapter caseBindSingleReference(BindSingleReference object) {
                return createBindSingleReferenceAdapter();
            }
            @Override
            public Adapter caseTraverseFilterableSingleNavigation(TraverseFilterableSingleNavigation object) {
                return createTraverseFilterableSingleNavigationAdapter();
            }
            @Override
            public Adapter caseBindFunctionSingleNavigation(BindFunctionSingleNavigation object) {
                return createBindFunctionSingleNavigationAdapter();
            }
            @Override
            public Adapter caseTraverseFilterableListNavigation(TraverseFilterableListNavigation object) {
                return createTraverseFilterableListNavigationAdapter();
            }
            @Override
            public Adapter caseAttachListNavigation(AttachListNavigation object) {
                return createAttachListNavigationAdapter();
            }
            @Override
            public Adapter caseDetachListNavigation(DetachListNavigation object) {
                return createDetachListNavigationAdapter();
            }
            @Override
            public Adapter caseAttachListReference(AttachListReference object) {
                return createAttachListReferenceAdapter();
            }
            @Override
            public Adapter caseAttachFunctionListNavigation(AttachFunctionListNavigation object) {
                return createAttachFunctionListNavigationAdapter();
            }
            @Override
            public Adapter caseDetachListReference(DetachListReference object) {
                return createDetachListReferenceAdapter();
            }
            @Override
            public Adapter caseDetachFunctionListNavigation(DetachFunctionListNavigation object) {
                return createDetachFunctionListNavigationAdapter();
            }
            @Override
            public Adapter caseNamedElement(NamedElement object) {
                return createNamedElementAdapter();
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
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.PropertySet <em>Property Set</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.PropertySet
     * @generated
     */
    public Adapter createPropertySetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.Navigation <em>Navigation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.Navigation
     * @generated
     */
    public Adapter createNavigationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.SingleNavigation <em>Single Navigation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.SingleNavigation
     * @generated
     */
    public Adapter createSingleNavigationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.ListNavigation <em>List Navigation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.ListNavigation
     * @generated
     */
    public Adapter createListNavigationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.EntitySetSelector <em>Entity Set Selector</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.EntitySetSelector
     * @generated
     */
    public Adapter createEntitySetSelectorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.EntitySingleSelector <em>Entity Single Selector</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.EntitySingleSelector
     * @generated
     */
    public Adapter createEntitySingleSelectorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.EntitySelector <em>Entity Selector</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.EntitySelector
     * @generated
     */
    public Adapter createEntitySelectorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.Facade <em>Facade</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.Facade
     * @generated
     */
    public Adapter createFacadeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.StandaloneFacade <em>Standalone Facade</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.StandaloneFacade
     * @generated
     */
    public Adapter createStandaloneFacadeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.DeleteOperation <em>Delete Operation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.DeleteOperation
     * @generated
     */
    public Adapter createDeleteOperationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.ReadFilterableProperty <em>Read Filterable Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.ReadFilterableProperty
     * @generated
     */
    public Adapter createReadFilterablePropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.ReadFunctionProperty <em>Read Function Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.ReadFunctionProperty
     * @generated
     */
    public Adapter createReadFunctionPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.ReadProperty <em>Read Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.ReadProperty
     * @generated
     */
    public Adapter createReadPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.WriteProperty <em>Write Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.WriteProperty
     * @generated
     */
    public Adapter createWritePropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.WriteAttribute <em>Write Attribute</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.WriteAttribute
     * @generated
     */
    public Adapter createWriteAttributeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.WriteFunctionProperty <em>Write Function Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.WriteFunctionProperty
     * @generated
     */
    public Adapter createWriteFunctionPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.TraverseFunctionSingleNavigation <em>Traverse Function Single Navigation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.TraverseFunctionSingleNavigation
     * @generated
     */
    public Adapter createTraverseFunctionSingleNavigationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.TraverseSingleNavigation <em>Traverse Single Navigation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.TraverseSingleNavigation
     * @generated
     */
    public Adapter createTraverseSingleNavigationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.TraverseListNavigation <em>Traverse List Navigation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.TraverseListNavigation
     * @generated
     */
    public Adapter createTraverseListNavigationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.MultiTraverseFunctionDefinition <em>Multi Traverse Function Definition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.MultiTraverseFunctionDefinition
     * @generated
     */
    public Adapter createMultiTraverseFunctionDefinitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.CreateOperation <em>Create Operation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.CreateOperation
     * @generated
     */
    public Adapter createCreateOperationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.DefaultCreateOperation <em>Default Create Operation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.DefaultCreateOperation
     * @generated
     */
    public Adapter createDefaultCreateOperationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.CustomCreateOperation <em>Custom Create Operation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.CustomCreateOperation
     * @generated
     */
    public Adapter createCustomCreateOperationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.UpdateOperation <em>Update Operation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.UpdateOperation
     * @generated
     */
    public Adapter createUpdateOperationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.DefaultUpdateOperation <em>Default Update Operation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.DefaultUpdateOperation
     * @generated
     */
    public Adapter createDefaultUpdateOperationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.CustomUpdateOperation <em>Custom Update Operation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.CustomUpdateOperation
     * @generated
     */
    public Adapter createCustomUpdateOperationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.BindSingleNavigation <em>Bind Single Navigation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.BindSingleNavigation
     * @generated
     */
    public Adapter createBindSingleNavigationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.BindSingleReference <em>Bind Single Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.BindSingleReference
     * @generated
     */
    public Adapter createBindSingleReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.TraverseFilterableSingleNavigation <em>Traverse Filterable Single Navigation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.TraverseFilterableSingleNavigation
     * @generated
     */
    public Adapter createTraverseFilterableSingleNavigationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.BindFunctionSingleNavigation <em>Bind Function Single Navigation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.BindFunctionSingleNavigation
     * @generated
     */
    public Adapter createBindFunctionSingleNavigationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.TraverseFilterableListNavigation <em>Traverse Filterable List Navigation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.TraverseFilterableListNavigation
     * @generated
     */
    public Adapter createTraverseFilterableListNavigationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.AttachListNavigation <em>Attach List Navigation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.AttachListNavigation
     * @generated
     */
    public Adapter createAttachListNavigationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.DetachListNavigation <em>Detach List Navigation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.DetachListNavigation
     * @generated
     */
    public Adapter createDetachListNavigationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.AttachListReference <em>Attach List Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.AttachListReference
     * @generated
     */
    public Adapter createAttachListReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.AttachFunctionListNavigation <em>Attach Function List Navigation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.AttachFunctionListNavigation
     * @generated
     */
    public Adapter createAttachFunctionListNavigationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.DetachListReference <em>Detach List Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.DetachListReference
     * @generated
     */
    public Adapter createDetachListReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.facade.DetachFunctionListNavigation <em>Detach Function List Navigation</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.facade.DetachFunctionListNavigation
     * @generated
     */
    public Adapter createDetachFunctionListNavigationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.namespace.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.namespace.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
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

} //FacadeAdapterFactory
