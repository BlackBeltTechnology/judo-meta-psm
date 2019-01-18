/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection.impl;

import hu.blackbelt.judo.meta.psm.expression.collection.*;

import org.eclipse.emf.ecore.EClass;
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
public class CollectionFactoryImpl extends EFactoryImpl implements CollectionFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static CollectionFactory init() {
        try {
            CollectionFactory theCollectionFactory = (CollectionFactory)EPackage.Registry.INSTANCE.getEFactory(CollectionPackage.eNS_URI);
            if (theCollectionFactory != null) {
                return theCollectionFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new CollectionFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CollectionFactoryImpl() {
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
            case CollectionPackage.IMMUTABLE_COLLECTION: return createImmutableCollection();
            case CollectionPackage.COLLECTION_FILTER_EXPRESSION: return createCollectionFilterExpression();
            case CollectionPackage.COLLECTION_VARIABLE_REFERENCE: return createCollectionVariableReference();
            case CollectionPackage.COLLECTION_NAVIGATION_FROM_OBJECT_EXPRESSION: return createCollectionNavigationFromObjectExpression();
            case CollectionPackage.COLLECTION_NAVIGATION_FROM_COLLECTION_EXPRESSION: return createCollectionNavigationFromCollectionExpression();
            case CollectionPackage.SORT_EXPRESSION: return createSortExpression();
            case CollectionPackage.SUB_COLLECTION_EXPRESSION: return createSubCollectionExpression();
            case CollectionPackage.ORDER_BY_ITEM: return createOrderByItem();
            case CollectionPackage.OBJECT_NAVIGATION_FROM_COLLECTION_EXPRESSION: return createObjectNavigationFromCollectionExpression();
            case CollectionPackage.CAST_COLLECTION: return createCastCollection();
            case CollectionPackage.COLLECTION_SWITCH_EXPRESSION: return createCollectionSwitchExpression();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ImmutableCollection createImmutableCollection() {
        ImmutableCollectionImpl immutableCollection = new ImmutableCollectionImpl();
        return immutableCollection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CollectionFilterExpression createCollectionFilterExpression() {
        CollectionFilterExpressionImpl collectionFilterExpression = new CollectionFilterExpressionImpl();
        return collectionFilterExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CollectionVariableReference createCollectionVariableReference() {
        CollectionVariableReferenceImpl collectionVariableReference = new CollectionVariableReferenceImpl();
        return collectionVariableReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CollectionNavigationFromObjectExpression createCollectionNavigationFromObjectExpression() {
        CollectionNavigationFromObjectExpressionImpl collectionNavigationFromObjectExpression = new CollectionNavigationFromObjectExpressionImpl();
        return collectionNavigationFromObjectExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CollectionNavigationFromCollectionExpression createCollectionNavigationFromCollectionExpression() {
        CollectionNavigationFromCollectionExpressionImpl collectionNavigationFromCollectionExpression = new CollectionNavigationFromCollectionExpressionImpl();
        return collectionNavigationFromCollectionExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SortExpression createSortExpression() {
        SortExpressionImpl sortExpression = new SortExpressionImpl();
        return sortExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubCollectionExpression createSubCollectionExpression() {
        SubCollectionExpressionImpl subCollectionExpression = new SubCollectionExpressionImpl();
        return subCollectionExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OrderByItem createOrderByItem() {
        OrderByItemImpl orderByItem = new OrderByItemImpl();
        return orderByItem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectNavigationFromCollectionExpression createObjectNavigationFromCollectionExpression() {
        ObjectNavigationFromCollectionExpressionImpl objectNavigationFromCollectionExpression = new ObjectNavigationFromCollectionExpressionImpl();
        return objectNavigationFromCollectionExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CastCollection createCastCollection() {
        CastCollectionImpl castCollection = new CastCollectionImpl();
        return castCollection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CollectionSwitchExpression createCollectionSwitchExpression() {
        CollectionSwitchExpressionImpl collectionSwitchExpression = new CollectionSwitchExpressionImpl();
        return collectionSwitchExpression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CollectionPackage getCollectionPackage() {
        return (CollectionPackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static CollectionPackage getPackage() {
        return CollectionPackage.eINSTANCE;
    }

} //CollectionFactoryImpl
