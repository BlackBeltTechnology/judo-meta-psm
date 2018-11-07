/**
 */
package hu.blackbelt.judo.meta.psm.action.impl;

import hu.blackbelt.judo.meta.psm.action.*;

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
public class ActionFactoryImpl extends EFactoryImpl implements ActionFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static ActionFactory init() {
        try {
            ActionFactory theActionFactory = (ActionFactory)EPackage.Registry.INSTANCE.getEFactory(ActionPackage.eNS_URI);
            if (theActionFactory != null) {
                return theActionFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new ActionFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionFactoryImpl() {
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
            case ActionPackage.ACTION: return createAction();
            case ActionPackage.QUERY: return createQuery();
            case ActionPackage.PRIMITIVE_PARAMETER: return createPrimitiveParameter();
            case ActionPackage.SINGLE_ENTITY_PARAMETER: return createSingleEntityParameter();
            case ActionPackage.LIST_ENTITY_PARAMETER: return createListEntityParameter();
            case ActionPackage.DELETE_OPERATION: return createDeleteOperation();
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
            case ActionPackage.DIRECTION:
                return createDirectionFromString(eDataType, initialValue);
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
            case ActionPackage.DIRECTION:
                return convertDirectionToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Action createAction() {
        ActionImpl action = new ActionImpl();
        return action;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Query createQuery() {
        QueryImpl query = new QueryImpl();
        return query;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PrimitiveParameter createPrimitiveParameter() {
        PrimitiveParameterImpl primitiveParameter = new PrimitiveParameterImpl();
        return primitiveParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SingleEntityParameter createSingleEntityParameter() {
        SingleEntityParameterImpl singleEntityParameter = new SingleEntityParameterImpl();
        return singleEntityParameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ListEntityParameter createListEntityParameter() {
        ListEntityParameterImpl listEntityParameter = new ListEntityParameterImpl();
        return listEntityParameter;
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
    public Direction createDirectionFromString(EDataType eDataType, String initialValue) {
        Direction result = Direction.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertDirectionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ActionPackage getActionPackage() {
        return (ActionPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static ActionPackage getPackage() {
        return ActionPackage.eINSTANCE;
    }

} //ActionFactoryImpl
