/**
 */
package hu.blackbelt.judo.meta.psm.facade;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage
 * @generated
 */
public interface FacadeFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    FacadeFactory eINSTANCE = hu.blackbelt.judo.meta.psm.facade.impl.FacadeFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Property Set</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property Set</em>'.
     * @generated
     */
    PropertySet createPropertySet();

    /**
     * Returns a new object of class '<em>Single Navigation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Single Navigation</em>'.
     * @generated
     */
    SingleNavigation createSingleNavigation();

    /**
     * Returns a new object of class '<em>List Navigation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>List Navigation</em>'.
     * @generated
     */
    ListNavigation createListNavigation();

    /**
     * Returns a new object of class '<em>Entity Set Selector</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity Set Selector</em>'.
     * @generated
     */
    EntitySetSelector createEntitySetSelector();

    /**
     * Returns a new object of class '<em>Entity Single Selector</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Entity Single Selector</em>'.
     * @generated
     */
    EntitySingleSelector createEntitySingleSelector();

    /**
     * Returns a new object of class '<em>Standalone Facade</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Standalone Facade</em>'.
     * @generated
     */
    StandaloneFacade createStandaloneFacade();

    /**
     * Returns a new object of class '<em>Delete Operation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Delete Operation</em>'.
     * @generated
     */
    DeleteOperation createDeleteOperation();

    /**
     * Returns a new object of class '<em>Read Filterable Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Read Filterable Property</em>'.
     * @generated
     */
    ReadFilterableProperty createReadFilterableProperty();

    /**
     * Returns a new object of class '<em>Read Function Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Read Function Property</em>'.
     * @generated
     */
    ReadFunctionProperty createReadFunctionProperty();

    /**
     * Returns a new object of class '<em>Write Attribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Write Attribute</em>'.
     * @generated
     */
    WriteAttribute createWriteAttribute();

    /**
     * Returns a new object of class '<em>Write Function Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Write Function Property</em>'.
     * @generated
     */
    WriteFunctionProperty createWriteFunctionProperty();

    /**
     * Returns a new object of class '<em>Traverse Function Single Navigation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Traverse Function Single Navigation</em>'.
     * @generated
     */
    TraverseFunctionSingleNavigation createTraverseFunctionSingleNavigation();

    /**
     * Returns a new object of class '<em>Multi Traverse Function Definition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Multi Traverse Function Definition</em>'.
     * @generated
     */
    MultiTraverseFunctionDefinition createMultiTraverseFunctionDefinition();

    /**
     * Returns a new object of class '<em>Default Create Operation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Default Create Operation</em>'.
     * @generated
     */
    DefaultCreateOperation createDefaultCreateOperation();

    /**
     * Returns a new object of class '<em>Custom Create Operation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Custom Create Operation</em>'.
     * @generated
     */
    CustomCreateOperation createCustomCreateOperation();

    /**
     * Returns a new object of class '<em>Default Update Operation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Default Update Operation</em>'.
     * @generated
     */
    DefaultUpdateOperation createDefaultUpdateOperation();

    /**
     * Returns a new object of class '<em>Custom Update Operation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Custom Update Operation</em>'.
     * @generated
     */
    CustomUpdateOperation createCustomUpdateOperation();

    /**
     * Returns a new object of class '<em>Bind Single Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bind Single Reference</em>'.
     * @generated
     */
    BindSingleReference createBindSingleReference();

    /**
     * Returns a new object of class '<em>Traverse Filterable Single Navigation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Traverse Filterable Single Navigation</em>'.
     * @generated
     */
    TraverseFilterableSingleNavigation createTraverseFilterableSingleNavigation();

    /**
     * Returns a new object of class '<em>Bind Function Single Navigation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bind Function Single Navigation</em>'.
     * @generated
     */
    BindFunctionSingleNavigation createBindFunctionSingleNavigation();

    /**
     * Returns a new object of class '<em>Traverse Filterable List Navigation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Traverse Filterable List Navigation</em>'.
     * @generated
     */
    TraverseFilterableListNavigation createTraverseFilterableListNavigation();

    /**
     * Returns a new object of class '<em>Attach List Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attach List Reference</em>'.
     * @generated
     */
    AttachListReference createAttachListReference();

    /**
     * Returns a new object of class '<em>Attach Function List Navigation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attach Function List Navigation</em>'.
     * @generated
     */
    AttachFunctionListNavigation createAttachFunctionListNavigation();

    /**
     * Returns a new object of class '<em>Detach List Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Detach List Reference</em>'.
     * @generated
     */
    DetachListReference createDetachListReference();

    /**
     * Returns a new object of class '<em>Detach Function List Navigation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Detach Function List Navigation</em>'.
     * @generated
     */
    DetachFunctionListNavigation createDetachFunctionListNavigation();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    FacadePackage getFacadePackage();

} //FacadeFactory
