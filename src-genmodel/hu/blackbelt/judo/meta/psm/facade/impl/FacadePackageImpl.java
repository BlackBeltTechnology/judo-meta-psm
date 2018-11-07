/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.action.ActionPackage;

import hu.blackbelt.judo.meta.psm.action.impl.ActionPackageImpl;

import hu.blackbelt.judo.meta.psm.behavior.BehaviorPackage;

import hu.blackbelt.judo.meta.psm.behavior.impl.BehaviorPackageImpl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;

import hu.blackbelt.judo.meta.psm.data.impl.DataPackageImpl;

import hu.blackbelt.judo.meta.psm.facade.AttachFunctionListNavigation;
import hu.blackbelt.judo.meta.psm.facade.AttachListNavigation;
import hu.blackbelt.judo.meta.psm.facade.AttachListReference;
import hu.blackbelt.judo.meta.psm.facade.BindFunctionSingleNavigation;
import hu.blackbelt.judo.meta.psm.facade.BindSingleNavigation;
import hu.blackbelt.judo.meta.psm.facade.BindSingleReference;
import hu.blackbelt.judo.meta.psm.facade.CreateOperation;
import hu.blackbelt.judo.meta.psm.facade.CustomCreateOperation;
import hu.blackbelt.judo.meta.psm.facade.CustomUpdateOperation;
import hu.blackbelt.judo.meta.psm.facade.DefaultCreateOperation;
import hu.blackbelt.judo.meta.psm.facade.DefaultUpdateOperation;
import hu.blackbelt.judo.meta.psm.facade.DeleteOperation;
import hu.blackbelt.judo.meta.psm.facade.DetachFunctionListNavigation;
import hu.blackbelt.judo.meta.psm.facade.DetachListNavigation;
import hu.blackbelt.judo.meta.psm.facade.DetachListReference;
import hu.blackbelt.judo.meta.psm.facade.EntitySelector;
import hu.blackbelt.judo.meta.psm.facade.EntitySetSelector;
import hu.blackbelt.judo.meta.psm.facade.EntitySingleSelector;
import hu.blackbelt.judo.meta.psm.facade.Facade;
import hu.blackbelt.judo.meta.psm.facade.FacadeFactory;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.facade.ListNavigation;
import hu.blackbelt.judo.meta.psm.facade.MultiTraverseFunctionDefinition;
import hu.blackbelt.judo.meta.psm.facade.Navigation;
import hu.blackbelt.judo.meta.psm.facade.Property;
import hu.blackbelt.judo.meta.psm.facade.PropertySet;
import hu.blackbelt.judo.meta.psm.facade.ReadFilterableProperty;
import hu.blackbelt.judo.meta.psm.facade.ReadFunctionProperty;
import hu.blackbelt.judo.meta.psm.facade.ReadProperty;
import hu.blackbelt.judo.meta.psm.facade.SingleNavigation;
import hu.blackbelt.judo.meta.psm.facade.StandaloneFacade;
import hu.blackbelt.judo.meta.psm.facade.TraverseFilterableListNavigation;
import hu.blackbelt.judo.meta.psm.facade.TraverseFilterableSingleNavigation;
import hu.blackbelt.judo.meta.psm.facade.TraverseFunctionSingleNavigation;
import hu.blackbelt.judo.meta.psm.facade.TraverseListNavigation;
import hu.blackbelt.judo.meta.psm.facade.TraverseSingleNavigation;
import hu.blackbelt.judo.meta.psm.facade.UpdateOperation;
import hu.blackbelt.judo.meta.psm.facade.WriteAttribute;
import hu.blackbelt.judo.meta.psm.facade.WriteFunctionProperty;
import hu.blackbelt.judo.meta.psm.facade.WriteProperty;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamespacePackageImpl;

import hu.blackbelt.judo.meta.psm.type.TypePackage;

import hu.blackbelt.judo.meta.psm.type.impl.TypePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FacadePackageImpl extends EPackageImpl implements FacadePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertySetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass navigationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass singleNavigationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass listNavigationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entitySetSelectorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entitySingleSelectorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass entitySelectorEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass facadeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass standaloneFacadeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass deleteOperationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass readFilterablePropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass readFunctionPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass readPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass writePropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass writeAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass writeFunctionPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass traverseFunctionSingleNavigationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass traverseSingleNavigationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass traverseListNavigationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass multiTraverseFunctionDefinitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass createOperationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass defaultCreateOperationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass customCreateOperationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass updateOperationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass defaultUpdateOperationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass customUpdateOperationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bindSingleNavigationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bindSingleReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass traverseFilterableSingleNavigationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass bindFunctionSingleNavigationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass traverseFilterableListNavigationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attachListNavigationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass detachListNavigationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attachListReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attachFunctionListNavigationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass detachListReferenceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass detachFunctionListNavigationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType entitySetExprEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType singleAttributeExprEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType singleDataExprEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType entityExprEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType singleReferenceExprEDataType = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EDataType listReferenceExprEDataType = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see hu.blackbelt.judo.meta.psm.facade.FacadePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private FacadePackageImpl() {
        super(eNS_URI, FacadeFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link FacadePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static FacadePackage init() {
        if (isInited) return (FacadePackage)EPackage.Registry.INSTANCE.getEPackage(FacadePackage.eNS_URI);

        // Obtain or create and register package
        FacadePackageImpl theFacadePackage = (FacadePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FacadePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FacadePackageImpl());

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        NamespacePackageImpl theNamespacePackage = (NamespacePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) instanceof NamespacePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI) : NamespacePackage.eINSTANCE);
        TypePackageImpl theTypePackage = (TypePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) instanceof TypePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI) : TypePackage.eINSTANCE);
        DataPackageImpl theDataPackage = (DataPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) instanceof DataPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI) : DataPackage.eINSTANCE);
        BehaviorPackageImpl theBehaviorPackage = (BehaviorPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) instanceof BehaviorPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorPackage.eNS_URI) : BehaviorPackage.eINSTANCE);
        ActionPackageImpl theActionPackage = (ActionPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) instanceof ActionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ActionPackage.eNS_URI) : ActionPackage.eINSTANCE);

        // Create package meta-data objects
        theFacadePackage.createPackageContents();
        theNamespacePackage.createPackageContents();
        theTypePackage.createPackageContents();
        theDataPackage.createPackageContents();
        theBehaviorPackage.createPackageContents();
        theActionPackage.createPackageContents();

        // Initialize created meta-data
        theFacadePackage.initializePackageContents();
        theNamespacePackage.initializePackageContents();
        theTypePackage.initializePackageContents();
        theDataPackage.initializePackageContents();
        theBehaviorPackage.initializePackageContents();
        theActionPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theFacadePackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(FacadePackage.eNS_URI, theFacadePackage);
        return theFacadePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPropertySet() {
        return propertySetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPropertySet_Properties() {
        return (EReference)propertySetEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPropertySet_NavigationProperties() {
        return (EReference)propertySetEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPropertySet_EntityType() {
        return (EReference)propertySetEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProperty() {
        return propertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProperty_DataType() {
        return (EReference)propertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProperty_ReadDefinition() {
        return (EReference)propertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProperty_WriteDefinition() {
        return (EReference)propertyEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNavigation() {
        return navigationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSingleNavigation() {
        return singleNavigationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSingleNavigation_TraverseDefinition() {
        return (EReference)singleNavigationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getSingleNavigation_BindDefinition() {
        return (EReference)singleNavigationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getListNavigation() {
        return listNavigationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getListNavigation_TraverseDefinition() {
        return (EReference)listNavigationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getListNavigation_AttachDefinition() {
        return (EReference)listNavigationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getListNavigation_DetachNavigation() {
        return (EReference)listNavigationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntitySetSelector() {
        return entitySetSelectorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEntitySetSelector_GetExpr() {
        return (EAttribute)entitySetSelectorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntitySingleSelector() {
        return entitySingleSelectorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getEntitySingleSelector_GetExpr() {
        return (EAttribute)entitySingleSelectorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEntitySelector() {
        return entitySelectorEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getEntitySelector_EntityType() {
        return (EReference)entitySelectorEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getFacade() {
        return facadeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFacade_PropertySet() {
        return (EReference)facadeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFacade_UpdateOperation() {
        return (EReference)facadeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFacade_CreateOperation() {
        return (EReference)facadeEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getFacade_DeleteOperation() {
        return (EReference)facadeEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getStandaloneFacade() {
        return standaloneFacadeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getStandaloneFacade_EntitySelector() {
        return (EReference)standaloneFacadeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDeleteOperation() {
        return deleteOperationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDeleteOperation_DeleteOperation() {
        return (EAttribute)deleteOperationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReadFilterableProperty() {
        return readFilterablePropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getReadFilterableProperty_Filtareble() {
        return (EAttribute)readFilterablePropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getReadFilterableProperty_ReadExpr() {
        return (EAttribute)readFilterablePropertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReadFunctionProperty() {
        return readFunctionPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getReadFunctionProperty_ReadFunction() {
        return (EAttribute)readFunctionPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getReadProperty() {
        return readPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWriteProperty() {
        return writePropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWriteAttribute() {
        return writeAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWriteAttribute_WriteExpr() {
        return (EAttribute)writeAttributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWriteFunctionProperty() {
        return writeFunctionPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getWriteFunctionProperty_WriteOperation() {
        return (EAttribute)writeFunctionPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTraverseFunctionSingleNavigation() {
        return traverseFunctionSingleNavigationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTraverseFunctionSingleNavigation_TraverseFunction() {
        return (EAttribute)traverseFunctionSingleNavigationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTraverseSingleNavigation() {
        return traverseSingleNavigationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTraverseListNavigation() {
        return traverseListNavigationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMultiTraverseFunctionDefinition() {
        return multiTraverseFunctionDefinitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getMultiTraverseFunctionDefinition_TraverseFunction() {
        return (EAttribute)multiTraverseFunctionDefinitionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCreateOperation() {
        return createOperationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDefaultCreateOperation() {
        return defaultCreateOperationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefaultCreateOperation_PreCreateOperation() {
        return (EAttribute)defaultCreateOperationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefaultCreateOperation_PostCreateOperation() {
        return (EAttribute)defaultCreateOperationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCustomCreateOperation() {
        return customCreateOperationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCustomCreateOperation_CreateOperation() {
        return (EAttribute)customCreateOperationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUpdateOperation() {
        return updateOperationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDefaultUpdateOperation() {
        return defaultUpdateOperationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefaultUpdateOperation_PreUpdateOperation() {
        return (EAttribute)defaultUpdateOperationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDefaultUpdateOperation_PostUpdateOperation() {
        return (EAttribute)defaultUpdateOperationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCustomUpdateOperation() {
        return customUpdateOperationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCustomUpdateOperation_UpdateOperation() {
        return (EAttribute)customUpdateOperationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBindSingleNavigation() {
        return bindSingleNavigationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBindSingleReference() {
        return bindSingleReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBindSingleReference_BindExpr() {
        return (EAttribute)bindSingleReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTraverseFilterableSingleNavigation() {
        return traverseFilterableSingleNavigationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTraverseFilterableSingleNavigation_Filterable() {
        return (EAttribute)traverseFilterableSingleNavigationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTraverseFilterableSingleNavigation_TraverseExpr() {
        return (EAttribute)traverseFilterableSingleNavigationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getBindFunctionSingleNavigation() {
        return bindFunctionSingleNavigationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getBindFunctionSingleNavigation_BindOperation() {
        return (EAttribute)bindFunctionSingleNavigationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getTraverseFilterableListNavigation() {
        return traverseFilterableListNavigationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTraverseFilterableListNavigation_Filterable() {
        return (EAttribute)traverseFilterableListNavigationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getTraverseFilterableListNavigation_TraverseExpr() {
        return (EAttribute)traverseFilterableListNavigationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttachListNavigation() {
        return attachListNavigationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDetachListNavigation() {
        return detachListNavigationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttachListReference() {
        return attachListReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttachListReference_AttachExpr() {
        return (EAttribute)attachListReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttachFunctionListNavigation() {
        return attachFunctionListNavigationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAttachFunctionListNavigation_AttachFunction() {
        return (EAttribute)attachFunctionListNavigationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDetachListReference() {
        return detachListReferenceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDetachListReference_DetachExpr() {
        return (EAttribute)detachListReferenceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDetachFunctionListNavigation() {
        return detachFunctionListNavigationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getDetachFunctionListNavigation_DetachFunction() {
        return (EAttribute)detachFunctionListNavigationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getEntitySetExpr() {
        return entitySetExprEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSingleAttributeExpr() {
        return singleAttributeExprEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSingleDataExpr() {
        return singleDataExprEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getEntityExpr() {
        return entityExprEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getSingleReferenceExpr() {
        return singleReferenceExprEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EDataType getListReferenceExpr() {
        return listReferenceExprEDataType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public FacadeFactory getFacadeFactory() {
        return (FacadeFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        propertySetEClass = createEClass(PROPERTY_SET);
        createEReference(propertySetEClass, PROPERTY_SET__PROPERTIES);
        createEReference(propertySetEClass, PROPERTY_SET__NAVIGATION_PROPERTIES);
        createEReference(propertySetEClass, PROPERTY_SET__ENTITY_TYPE);

        propertyEClass = createEClass(PROPERTY);
        createEReference(propertyEClass, PROPERTY__DATA_TYPE);
        createEReference(propertyEClass, PROPERTY__READ_DEFINITION);
        createEReference(propertyEClass, PROPERTY__WRITE_DEFINITION);

        navigationEClass = createEClass(NAVIGATION);

        singleNavigationEClass = createEClass(SINGLE_NAVIGATION);
        createEReference(singleNavigationEClass, SINGLE_NAVIGATION__TRAVERSE_DEFINITION);
        createEReference(singleNavigationEClass, SINGLE_NAVIGATION__BIND_DEFINITION);

        listNavigationEClass = createEClass(LIST_NAVIGATION);
        createEReference(listNavigationEClass, LIST_NAVIGATION__TRAVERSE_DEFINITION);
        createEReference(listNavigationEClass, LIST_NAVIGATION__ATTACH_DEFINITION);
        createEReference(listNavigationEClass, LIST_NAVIGATION__DETACH_NAVIGATION);

        entitySetSelectorEClass = createEClass(ENTITY_SET_SELECTOR);
        createEAttribute(entitySetSelectorEClass, ENTITY_SET_SELECTOR__GET_EXPR);

        entitySingleSelectorEClass = createEClass(ENTITY_SINGLE_SELECTOR);
        createEAttribute(entitySingleSelectorEClass, ENTITY_SINGLE_SELECTOR__GET_EXPR);

        entitySelectorEClass = createEClass(ENTITY_SELECTOR);
        createEReference(entitySelectorEClass, ENTITY_SELECTOR__ENTITY_TYPE);

        facadeEClass = createEClass(FACADE);
        createEReference(facadeEClass, FACADE__PROPERTY_SET);
        createEReference(facadeEClass, FACADE__UPDATE_OPERATION);
        createEReference(facadeEClass, FACADE__CREATE_OPERATION);
        createEReference(facadeEClass, FACADE__DELETE_OPERATION);

        standaloneFacadeEClass = createEClass(STANDALONE_FACADE);
        createEReference(standaloneFacadeEClass, STANDALONE_FACADE__ENTITY_SELECTOR);

        deleteOperationEClass = createEClass(DELETE_OPERATION);
        createEAttribute(deleteOperationEClass, DELETE_OPERATION__DELETE_OPERATION);

        readFilterablePropertyEClass = createEClass(READ_FILTERABLE_PROPERTY);
        createEAttribute(readFilterablePropertyEClass, READ_FILTERABLE_PROPERTY__FILTAREBLE);
        createEAttribute(readFilterablePropertyEClass, READ_FILTERABLE_PROPERTY__READ_EXPR);

        readFunctionPropertyEClass = createEClass(READ_FUNCTION_PROPERTY);
        createEAttribute(readFunctionPropertyEClass, READ_FUNCTION_PROPERTY__READ_FUNCTION);

        readPropertyEClass = createEClass(READ_PROPERTY);

        writePropertyEClass = createEClass(WRITE_PROPERTY);

        writeAttributeEClass = createEClass(WRITE_ATTRIBUTE);
        createEAttribute(writeAttributeEClass, WRITE_ATTRIBUTE__WRITE_EXPR);

        writeFunctionPropertyEClass = createEClass(WRITE_FUNCTION_PROPERTY);
        createEAttribute(writeFunctionPropertyEClass, WRITE_FUNCTION_PROPERTY__WRITE_OPERATION);

        traverseFunctionSingleNavigationEClass = createEClass(TRAVERSE_FUNCTION_SINGLE_NAVIGATION);
        createEAttribute(traverseFunctionSingleNavigationEClass, TRAVERSE_FUNCTION_SINGLE_NAVIGATION__TRAVERSE_FUNCTION);

        traverseSingleNavigationEClass = createEClass(TRAVERSE_SINGLE_NAVIGATION);

        traverseListNavigationEClass = createEClass(TRAVERSE_LIST_NAVIGATION);

        multiTraverseFunctionDefinitionEClass = createEClass(MULTI_TRAVERSE_FUNCTION_DEFINITION);
        createEAttribute(multiTraverseFunctionDefinitionEClass, MULTI_TRAVERSE_FUNCTION_DEFINITION__TRAVERSE_FUNCTION);

        createOperationEClass = createEClass(CREATE_OPERATION);

        defaultCreateOperationEClass = createEClass(DEFAULT_CREATE_OPERATION);
        createEAttribute(defaultCreateOperationEClass, DEFAULT_CREATE_OPERATION__PRE_CREATE_OPERATION);
        createEAttribute(defaultCreateOperationEClass, DEFAULT_CREATE_OPERATION__POST_CREATE_OPERATION);

        customCreateOperationEClass = createEClass(CUSTOM_CREATE_OPERATION);
        createEAttribute(customCreateOperationEClass, CUSTOM_CREATE_OPERATION__CREATE_OPERATION);

        updateOperationEClass = createEClass(UPDATE_OPERATION);

        defaultUpdateOperationEClass = createEClass(DEFAULT_UPDATE_OPERATION);
        createEAttribute(defaultUpdateOperationEClass, DEFAULT_UPDATE_OPERATION__PRE_UPDATE_OPERATION);
        createEAttribute(defaultUpdateOperationEClass, DEFAULT_UPDATE_OPERATION__POST_UPDATE_OPERATION);

        customUpdateOperationEClass = createEClass(CUSTOM_UPDATE_OPERATION);
        createEAttribute(customUpdateOperationEClass, CUSTOM_UPDATE_OPERATION__UPDATE_OPERATION);

        bindSingleNavigationEClass = createEClass(BIND_SINGLE_NAVIGATION);

        bindSingleReferenceEClass = createEClass(BIND_SINGLE_REFERENCE);
        createEAttribute(bindSingleReferenceEClass, BIND_SINGLE_REFERENCE__BIND_EXPR);

        traverseFilterableSingleNavigationEClass = createEClass(TRAVERSE_FILTERABLE_SINGLE_NAVIGATION);
        createEAttribute(traverseFilterableSingleNavigationEClass, TRAVERSE_FILTERABLE_SINGLE_NAVIGATION__FILTERABLE);
        createEAttribute(traverseFilterableSingleNavigationEClass, TRAVERSE_FILTERABLE_SINGLE_NAVIGATION__TRAVERSE_EXPR);

        bindFunctionSingleNavigationEClass = createEClass(BIND_FUNCTION_SINGLE_NAVIGATION);
        createEAttribute(bindFunctionSingleNavigationEClass, BIND_FUNCTION_SINGLE_NAVIGATION__BIND_OPERATION);

        traverseFilterableListNavigationEClass = createEClass(TRAVERSE_FILTERABLE_LIST_NAVIGATION);
        createEAttribute(traverseFilterableListNavigationEClass, TRAVERSE_FILTERABLE_LIST_NAVIGATION__FILTERABLE);
        createEAttribute(traverseFilterableListNavigationEClass, TRAVERSE_FILTERABLE_LIST_NAVIGATION__TRAVERSE_EXPR);

        attachListNavigationEClass = createEClass(ATTACH_LIST_NAVIGATION);

        detachListNavigationEClass = createEClass(DETACH_LIST_NAVIGATION);

        attachListReferenceEClass = createEClass(ATTACH_LIST_REFERENCE);
        createEAttribute(attachListReferenceEClass, ATTACH_LIST_REFERENCE__ATTACH_EXPR);

        attachFunctionListNavigationEClass = createEClass(ATTACH_FUNCTION_LIST_NAVIGATION);
        createEAttribute(attachFunctionListNavigationEClass, ATTACH_FUNCTION_LIST_NAVIGATION__ATTACH_FUNCTION);

        detachListReferenceEClass = createEClass(DETACH_LIST_REFERENCE);
        createEAttribute(detachListReferenceEClass, DETACH_LIST_REFERENCE__DETACH_EXPR);

        detachFunctionListNavigationEClass = createEClass(DETACH_FUNCTION_LIST_NAVIGATION);
        createEAttribute(detachFunctionListNavigationEClass, DETACH_FUNCTION_LIST_NAVIGATION__DETACH_FUNCTION);

        // Create data types
        entitySetExprEDataType = createEDataType(ENTITY_SET_EXPR);
        singleAttributeExprEDataType = createEDataType(SINGLE_ATTRIBUTE_EXPR);
        singleDataExprEDataType = createEDataType(SINGLE_DATA_EXPR);
        entityExprEDataType = createEDataType(ENTITY_EXPR);
        singleReferenceExprEDataType = createEDataType(SINGLE_REFERENCE_EXPR);
        listReferenceExprEDataType = createEDataType(LIST_REFERENCE_EXPR);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        NamespacePackage theNamespacePackage = (NamespacePackage)EPackage.Registry.INSTANCE.getEPackage(NamespacePackage.eNS_URI);
        DataPackage theDataPackage = (DataPackage)EPackage.Registry.INSTANCE.getEPackage(DataPackage.eNS_URI);
        TypePackage theTypePackage = (TypePackage)EPackage.Registry.INSTANCE.getEPackage(TypePackage.eNS_URI);
        XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        propertySetEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
        propertyEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
        navigationEClass.getESuperTypes().add(this.getFacade());
        singleNavigationEClass.getESuperTypes().add(this.getNavigation());
        listNavigationEClass.getESuperTypes().add(this.getNavigation());
        entitySetSelectorEClass.getESuperTypes().add(this.getEntitySelector());
        entitySingleSelectorEClass.getESuperTypes().add(this.getEntitySelector());
        entitySelectorEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
        facadeEClass.getESuperTypes().add(theNamespacePackage.getNamedElement());
        standaloneFacadeEClass.getESuperTypes().add(this.getFacade());
        readFilterablePropertyEClass.getESuperTypes().add(this.getReadProperty());
        readFunctionPropertyEClass.getESuperTypes().add(this.getReadProperty());
        writeAttributeEClass.getESuperTypes().add(this.getWriteProperty());
        writeFunctionPropertyEClass.getESuperTypes().add(this.getWriteProperty());
        traverseFunctionSingleNavigationEClass.getESuperTypes().add(this.getTraverseSingleNavigation());
        multiTraverseFunctionDefinitionEClass.getESuperTypes().add(this.getTraverseListNavigation());
        defaultCreateOperationEClass.getESuperTypes().add(this.getCreateOperation());
        customCreateOperationEClass.getESuperTypes().add(this.getCreateOperation());
        defaultUpdateOperationEClass.getESuperTypes().add(this.getUpdateOperation());
        customUpdateOperationEClass.getESuperTypes().add(this.getUpdateOperation());
        bindSingleReferenceEClass.getESuperTypes().add(this.getBindSingleNavigation());
        traverseFilterableSingleNavigationEClass.getESuperTypes().add(this.getTraverseSingleNavigation());
        bindFunctionSingleNavigationEClass.getESuperTypes().add(this.getBindSingleNavigation());
        traverseFilterableListNavigationEClass.getESuperTypes().add(this.getTraverseListNavigation());
        attachListReferenceEClass.getESuperTypes().add(this.getAttachListNavigation());
        attachFunctionListNavigationEClass.getESuperTypes().add(this.getAttachListNavigation());
        detachListReferenceEClass.getESuperTypes().add(this.getDetachListNavigation());
        detachFunctionListNavigationEClass.getESuperTypes().add(this.getDetachListNavigation());

        // Initialize classes, features, and operations; add parameters
        initEClass(propertySetEClass, PropertySet.class, "PropertySet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPropertySet_Properties(), this.getProperty(), null, "properties", null, 0, -1, PropertySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPropertySet_NavigationProperties(), this.getNavigation(), null, "navigationProperties", null, 0, -1, PropertySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPropertySet_EntityType(), theDataPackage.getEntityType(), null, "entityType", null, 1, 1, PropertySet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(propertyEClass, Property.class, "Property", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProperty_DataType(), theTypePackage.getDataType(), null, "dataType", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getProperty_ReadDefinition(), this.getReadProperty(), null, "readDefinition", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProperty_WriteDefinition(), this.getWriteProperty(), null, "writeDefinition", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(navigationEClass, Navigation.class, "Navigation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(singleNavigationEClass, SingleNavigation.class, "SingleNavigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSingleNavigation_TraverseDefinition(), this.getTraverseSingleNavigation(), null, "traverseDefinition", null, 0, 1, SingleNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSingleNavigation_BindDefinition(), this.getBindSingleNavigation(), null, "bindDefinition", null, 0, 1, SingleNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(listNavigationEClass, ListNavigation.class, "ListNavigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getListNavigation_TraverseDefinition(), this.getTraverseListNavigation(), null, "traverseDefinition", null, 0, 1, ListNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getListNavigation_AttachDefinition(), this.getAttachListNavigation(), null, "attachDefinition", null, 0, 1, ListNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getListNavigation_DetachNavigation(), this.getDetachListNavigation(), null, "detachNavigation", null, 0, 1, ListNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entitySetSelectorEClass, EntitySetSelector.class, "EntitySetSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEntitySetSelector_GetExpr(), this.getEntitySetExpr(), "getExpr", null, 1, 1, EntitySetSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entitySingleSelectorEClass, EntitySingleSelector.class, "EntitySingleSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEntitySingleSelector_GetExpr(), this.getEntityExpr(), "getExpr", null, 1, 1, EntitySingleSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(entitySelectorEClass, EntitySelector.class, "EntitySelector", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEntitySelector_EntityType(), theDataPackage.getEntityType(), null, "entityType", null, 1, 1, EntitySelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

        initEClass(facadeEClass, Facade.class, "Facade", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getFacade_PropertySet(), this.getPropertySet(), null, "propertySet", null, 1, 1, Facade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFacade_UpdateOperation(), this.getUpdateOperation(), null, "updateOperation", null, 0, 1, Facade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFacade_CreateOperation(), this.getCreateOperation(), null, "createOperation", null, 0, 1, Facade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getFacade_DeleteOperation(), this.getDeleteOperation(), null, "deleteOperation", null, 0, 1, Facade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(standaloneFacadeEClass, StandaloneFacade.class, "StandaloneFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getStandaloneFacade_EntitySelector(), this.getEntitySelector(), null, "entitySelector", null, 1, 1, StandaloneFacade.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(deleteOperationEClass, DeleteOperation.class, "DeleteOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDeleteOperation_DeleteOperation(), theTypePackage.getScript(), "deleteOperation", null, 1, 1, DeleteOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(readFilterablePropertyEClass, ReadFilterableProperty.class, "ReadFilterableProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getReadFilterableProperty_Filtareble(), ecorePackage.getEBoolean(), "filtareble", "true", 1, 1, ReadFilterableProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getReadFilterableProperty_ReadExpr(), this.getSingleDataExpr(), "readExpr", null, 1, 1, ReadFilterableProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(readFunctionPropertyEClass, ReadFunctionProperty.class, "ReadFunctionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getReadFunctionProperty_ReadFunction(), theTypePackage.getScript(), "readFunction", null, 1, 1, ReadFunctionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(readPropertyEClass, ReadProperty.class, "ReadProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(writePropertyEClass, WriteProperty.class, "WriteProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(writeAttributeEClass, WriteAttribute.class, "WriteAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getWriteAttribute_WriteExpr(), this.getSingleAttributeExpr(), "writeExpr", null, 1, 1, WriteAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(writeFunctionPropertyEClass, WriteFunctionProperty.class, "WriteFunctionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getWriteFunctionProperty_WriteOperation(), theTypePackage.getScript(), "writeOperation", null, 1, 1, WriteFunctionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(traverseFunctionSingleNavigationEClass, TraverseFunctionSingleNavigation.class, "TraverseFunctionSingleNavigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTraverseFunctionSingleNavigation_TraverseFunction(), theTypePackage.getScript(), "traverseFunction", null, 1, 1, TraverseFunctionSingleNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(traverseSingleNavigationEClass, TraverseSingleNavigation.class, "TraverseSingleNavigation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(traverseListNavigationEClass, TraverseListNavigation.class, "TraverseListNavigation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(multiTraverseFunctionDefinitionEClass, MultiTraverseFunctionDefinition.class, "MultiTraverseFunctionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getMultiTraverseFunctionDefinition_TraverseFunction(), theTypePackage.getScript(), "traverseFunction", null, 1, 1, MultiTraverseFunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(createOperationEClass, CreateOperation.class, "CreateOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(defaultCreateOperationEClass, DefaultCreateOperation.class, "DefaultCreateOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDefaultCreateOperation_PreCreateOperation(), theTypePackage.getScript(), "preCreateOperation", null, 0, 1, DefaultCreateOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDefaultCreateOperation_PostCreateOperation(), theTypePackage.getScript(), "postCreateOperation", null, 0, 1, DefaultCreateOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(customCreateOperationEClass, CustomCreateOperation.class, "CustomCreateOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCustomCreateOperation_CreateOperation(), theTypePackage.getScript(), "createOperation", null, 1, 1, CustomCreateOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(updateOperationEClass, UpdateOperation.class, "UpdateOperation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(defaultUpdateOperationEClass, DefaultUpdateOperation.class, "DefaultUpdateOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDefaultUpdateOperation_PreUpdateOperation(), theTypePackage.getScript(), "preUpdateOperation", null, 0, 1, DefaultUpdateOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getDefaultUpdateOperation_PostUpdateOperation(), theTypePackage.getScript(), "postUpdateOperation", null, 0, 1, DefaultUpdateOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(customUpdateOperationEClass, CustomUpdateOperation.class, "CustomUpdateOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCustomUpdateOperation_UpdateOperation(), theTypePackage.getScript(), "updateOperation", null, 1, 1, CustomUpdateOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(bindSingleNavigationEClass, BindSingleNavigation.class, "BindSingleNavigation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(bindSingleReferenceEClass, BindSingleReference.class, "BindSingleReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBindSingleReference_BindExpr(), this.getSingleReferenceExpr(), "bindExpr", null, 1, 1, BindSingleReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(traverseFilterableSingleNavigationEClass, TraverseFilterableSingleNavigation.class, "TraverseFilterableSingleNavigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTraverseFilterableSingleNavigation_Filterable(), theXMLTypePackage.getBoolean(), "filterable", null, 1, 1, TraverseFilterableSingleNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTraverseFilterableSingleNavigation_TraverseExpr(), this.getEntityExpr(), "traverseExpr", null, 1, 1, TraverseFilterableSingleNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(bindFunctionSingleNavigationEClass, BindFunctionSingleNavigation.class, "BindFunctionSingleNavigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBindFunctionSingleNavigation_BindOperation(), theTypePackage.getScript(), "bindOperation", null, 1, 1, BindFunctionSingleNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(traverseFilterableListNavigationEClass, TraverseFilterableListNavigation.class, "TraverseFilterableListNavigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getTraverseFilterableListNavigation_Filterable(), theXMLTypePackage.getBoolean(), "filterable", null, 1, 1, TraverseFilterableListNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTraverseFilterableListNavigation_TraverseExpr(), this.getEntitySetExpr(), "traverseExpr", null, 1, 1, TraverseFilterableListNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attachListNavigationEClass, AttachListNavigation.class, "AttachListNavigation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(detachListNavigationEClass, DetachListNavigation.class, "DetachListNavigation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(attachListReferenceEClass, AttachListReference.class, "AttachListReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAttachListReference_AttachExpr(), this.getEntitySetExpr(), "attachExpr", null, 1, 1, AttachListReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(attachFunctionListNavigationEClass, AttachFunctionListNavigation.class, "AttachFunctionListNavigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAttachFunctionListNavigation_AttachFunction(), theTypePackage.getScript(), "attachFunction", null, 1, 1, AttachFunctionListNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(detachListReferenceEClass, DetachListReference.class, "DetachListReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDetachListReference_DetachExpr(), this.getEntitySetExpr(), "detachExpr", null, 1, 1, DetachListReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(detachFunctionListNavigationEClass, DetachFunctionListNavigation.class, "DetachFunctionListNavigation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDetachFunctionListNavigation_DetachFunction(), theTypePackage.getScript(), "detachFunction", null, 1, 1, DetachFunctionListNavigation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Initialize data types
        initEDataType(entitySetExprEDataType, String.class, "EntitySetExpr", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(singleAttributeExprEDataType, String.class, "SingleAttributeExpr", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(singleDataExprEDataType, String.class, "SingleDataExpr", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(entityExprEDataType, String.class, "EntityExpr", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(singleReferenceExprEDataType, String.class, "SingleReferenceExpr", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
        initEDataType(listReferenceExprEDataType, String.class, "ListReferenceExpr", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //FacadePackageImpl
