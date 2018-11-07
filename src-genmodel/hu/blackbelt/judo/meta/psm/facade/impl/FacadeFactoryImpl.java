/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FacadeFactoryImpl extends EFactoryImpl implements FacadeFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static FacadeFactory init() {
        try {
            FacadeFactory theFacadeFactory = (FacadeFactory)EPackage.Registry.INSTANCE.getEFactory(FacadePackage.eNS_URI);
            if (theFacadeFactory != null) {
                return theFacadeFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new FacadeFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FacadeFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case FacadePackage.PROPERTY_SET: return createPropertySet();
            case FacadePackage.SINGLE_NAVIGATION: return createSingleNavigation();
            case FacadePackage.LIST_NAVIGATION: return createListNavigation();
            case FacadePackage.ENTITY_SET_SELECTOR: return createEntitySetSelector();
            case FacadePackage.ENTITY_SINGLE_SELECTOR: return createEntitySingleSelector();
            case FacadePackage.STANDALONE_FACADE: return createStandaloneFacade();
            case FacadePackage.DELETE_OPERATION: return createDeleteOperation();
            case FacadePackage.READ_FILTERABLE_PROPERTY: return createReadFilterableProperty();
            case FacadePackage.READ_FUNCTION_PROPERTY: return createReadFunctionProperty();
            case FacadePackage.WRITE_ATTRIBUTE: return createWriteAttribute();
            case FacadePackage.WRITE_FUNCTION_PROPERTY: return createWriteFunctionProperty();
            case FacadePackage.TRAVERSE_FUNCTION_SINGLE_NAVIGATION: return createTraverseFunctionSingleNavigation();
            case FacadePackage.MULTI_TRAVERSE_FUNCTION_DEFINITION: return createMultiTraverseFunctionDefinition();
            case FacadePackage.DEFAULT_CREATE_OPERATION: return createDefaultCreateOperation();
            case FacadePackage.CUSTOM_CREATE_OPERATION: return createCustomCreateOperation();
            case FacadePackage.DEFAULT_UPDATE_OPERATION: return createDefaultUpdateOperation();
            case FacadePackage.CUSTOM_UPDATE_OPERATION: return createCustomUpdateOperation();
            case FacadePackage.BIND_SINGLE_REFERENCE: return createBindSingleReference();
            case FacadePackage.TRAVERSE_FILTERABLE_SINGLE_NAVIGATION: return createTraverseFilterableSingleNavigation();
            case FacadePackage.BIND_FUNCTION_SINGLE_NAVIGATION: return createBindFunctionSingleNavigation();
            case FacadePackage.TRAVERSE_FILTERABLE_LIST_NAVIGATION: return createTraverseFilterableListNavigation();
            case FacadePackage.ATTACH_LIST_REFERENCE: return createAttachListReference();
            case FacadePackage.ATTACH_FUNCTION_LIST_NAVIGATION: return createAttachFunctionListNavigation();
            case FacadePackage.DETACH_LIST_REFERENCE: return createDetachListReference();
            case FacadePackage.DETACH_FUNCTION_LIST_NAVIGATION: return createDetachFunctionListNavigation();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case FacadePackage.ENTITY_SET_EXPR:
                return createEntitySetExprFromString(eDataType, initialValue);
            case FacadePackage.SINGLE_ATTRIBUTE_EXPR:
                return createSingleAttributeExprFromString(eDataType, initialValue);
            case FacadePackage.SINGLE_DATA_EXPR:
                return createSingleDataExprFromString(eDataType, initialValue);
            case FacadePackage.ENTITY_EXPR:
                return createEntityExprFromString(eDataType, initialValue);
            case FacadePackage.SINGLE_REFERENCE_EXPR:
                return createSingleReferenceExprFromString(eDataType, initialValue);
            case FacadePackage.LIST_REFERENCE_EXPR:
                return createListReferenceExprFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case FacadePackage.ENTITY_SET_EXPR:
                return convertEntitySetExprToString(eDataType, instanceValue);
            case FacadePackage.SINGLE_ATTRIBUTE_EXPR:
                return convertSingleAttributeExprToString(eDataType, instanceValue);
            case FacadePackage.SINGLE_DATA_EXPR:
                return convertSingleDataExprToString(eDataType, instanceValue);
            case FacadePackage.ENTITY_EXPR:
                return convertEntityExprToString(eDataType, instanceValue);
            case FacadePackage.SINGLE_REFERENCE_EXPR:
                return convertSingleReferenceExprToString(eDataType, instanceValue);
            case FacadePackage.LIST_REFERENCE_EXPR:
                return convertListReferenceExprToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertySet createPropertySet() {
        PropertySetImpl propertySet = new PropertySetImpl();
        return propertySet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SingleNavigation createSingleNavigation() {
        SingleNavigationImpl singleNavigation = new SingleNavigationImpl();
        return singleNavigation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ListNavigation createListNavigation() {
        ListNavigationImpl listNavigation = new ListNavigationImpl();
        return listNavigation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntitySetSelector createEntitySetSelector() {
        EntitySetSelectorImpl entitySetSelector = new EntitySetSelectorImpl();
        return entitySetSelector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EntitySingleSelector createEntitySingleSelector() {
        EntitySingleSelectorImpl entitySingleSelector = new EntitySingleSelectorImpl();
        return entitySingleSelector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StandaloneFacade createStandaloneFacade() {
        StandaloneFacadeImpl standaloneFacade = new StandaloneFacadeImpl();
        return standaloneFacade;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeleteOperation createDeleteOperation() {
        DeleteOperationImpl deleteOperation = new DeleteOperationImpl();
        return deleteOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadFilterableProperty createReadFilterableProperty() {
        ReadFilterablePropertyImpl readFilterableProperty = new ReadFilterablePropertyImpl();
        return readFilterableProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ReadFunctionProperty createReadFunctionProperty() {
        ReadFunctionPropertyImpl readFunctionProperty = new ReadFunctionPropertyImpl();
        return readFunctionProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WriteAttribute createWriteAttribute() {
        WriteAttributeImpl writeAttribute = new WriteAttributeImpl();
        return writeAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WriteFunctionProperty createWriteFunctionProperty() {
        WriteFunctionPropertyImpl writeFunctionProperty = new WriteFunctionPropertyImpl();
        return writeFunctionProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TraverseFunctionSingleNavigation createTraverseFunctionSingleNavigation() {
        TraverseFunctionSingleNavigationImpl traverseFunctionSingleNavigation = new TraverseFunctionSingleNavigationImpl();
        return traverseFunctionSingleNavigation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MultiTraverseFunctionDefinition createMultiTraverseFunctionDefinition() {
        MultiTraverseFunctionDefinitionImpl multiTraverseFunctionDefinition = new MultiTraverseFunctionDefinitionImpl();
        return multiTraverseFunctionDefinition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultCreateOperation createDefaultCreateOperation() {
        DefaultCreateOperationImpl defaultCreateOperation = new DefaultCreateOperationImpl();
        return defaultCreateOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CustomCreateOperation createCustomCreateOperation() {
        CustomCreateOperationImpl customCreateOperation = new CustomCreateOperationImpl();
        return customCreateOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DefaultUpdateOperation createDefaultUpdateOperation() {
        DefaultUpdateOperationImpl defaultUpdateOperation = new DefaultUpdateOperationImpl();
        return defaultUpdateOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CustomUpdateOperation createCustomUpdateOperation() {
        CustomUpdateOperationImpl customUpdateOperation = new CustomUpdateOperationImpl();
        return customUpdateOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BindSingleReference createBindSingleReference() {
        BindSingleReferenceImpl bindSingleReference = new BindSingleReferenceImpl();
        return bindSingleReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TraverseFilterableSingleNavigation createTraverseFilterableSingleNavigation() {
        TraverseFilterableSingleNavigationImpl traverseFilterableSingleNavigation = new TraverseFilterableSingleNavigationImpl();
        return traverseFilterableSingleNavigation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BindFunctionSingleNavigation createBindFunctionSingleNavigation() {
        BindFunctionSingleNavigationImpl bindFunctionSingleNavigation = new BindFunctionSingleNavigationImpl();
        return bindFunctionSingleNavigation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TraverseFilterableListNavigation createTraverseFilterableListNavigation() {
        TraverseFilterableListNavigationImpl traverseFilterableListNavigation = new TraverseFilterableListNavigationImpl();
        return traverseFilterableListNavigation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttachListReference createAttachListReference() {
        AttachListReferenceImpl attachListReference = new AttachListReferenceImpl();
        return attachListReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttachFunctionListNavigation createAttachFunctionListNavigation() {
        AttachFunctionListNavigationImpl attachFunctionListNavigation = new AttachFunctionListNavigationImpl();
        return attachFunctionListNavigation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DetachListReference createDetachListReference() {
        DetachListReferenceImpl detachListReference = new DetachListReferenceImpl();
        return detachListReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DetachFunctionListNavigation createDetachFunctionListNavigation() {
        DetachFunctionListNavigationImpl detachFunctionListNavigation = new DetachFunctionListNavigationImpl();
        return detachFunctionListNavigation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createEntitySetExprFromString(EDataType eDataType, String initialValue) {
        return (String)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEntitySetExprToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createSingleAttributeExprFromString(EDataType eDataType, String initialValue) {
        return (String)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSingleAttributeExprToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createSingleDataExprFromString(EDataType eDataType, String initialValue) {
        return (String)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSingleDataExprToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createEntityExprFromString(EDataType eDataType, String initialValue) {
        return (String)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertEntityExprToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createSingleReferenceExprFromString(EDataType eDataType, String initialValue) {
        return (String)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertSingleReferenceExprToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String createListReferenceExprFromString(EDataType eDataType, String initialValue) {
        return (String)super.createFromString(eDataType, initialValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertListReferenceExprToString(EDataType eDataType, Object instanceValue) {
        return super.convertToString(eDataType, instanceValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FacadePackage getFacadePackage() {
        return (FacadePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static FacadePackage getPackage() {
        return FacadePackage.eINSTANCE;
    }

} //FacadeFactoryImpl
