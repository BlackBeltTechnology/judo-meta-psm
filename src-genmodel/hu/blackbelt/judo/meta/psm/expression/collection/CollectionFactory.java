/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage
 * @generated
 */
public interface CollectionFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    CollectionFactory eINSTANCE = hu.blackbelt.judo.meta.psm.expression.collection.impl.CollectionFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Immutable Collection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Immutable Collection</em>'.
     * @generated
     */
    ImmutableCollection createImmutableCollection();

    /**
     * Returns a new object of class '<em>Filter Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Filter Expression</em>'.
     * @generated
     */
    CollectionFilterExpression createCollectionFilterExpression();

    /**
     * Returns a new object of class '<em>Variable Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable Reference</em>'.
     * @generated
     */
    CollectionVariableReference createCollectionVariableReference();

    /**
     * Returns a new object of class '<em>Navigation From Object Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Navigation From Object Expression</em>'.
     * @generated
     */
    CollectionNavigationFromObjectExpression createCollectionNavigationFromObjectExpression();

    /**
     * Returns a new object of class '<em>Navigation From Collection Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Navigation From Collection Expression</em>'.
     * @generated
     */
    CollectionNavigationFromCollectionExpression createCollectionNavigationFromCollectionExpression();

    /**
     * Returns a new object of class '<em>Sort Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sort Expression</em>'.
     * @generated
     */
    SortExpression createSortExpression();

    /**
     * Returns a new object of class '<em>Sub Collection Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Sub Collection Expression</em>'.
     * @generated
     */
    SubCollectionExpression createSubCollectionExpression();

    /**
     * Returns a new object of class '<em>Order By Item</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Order By Item</em>'.
     * @generated
     */
    OrderByItem createOrderByItem();

    /**
     * Returns a new object of class '<em>Object Navigation From Collection Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Object Navigation From Collection Expression</em>'.
     * @generated
     */
    ObjectNavigationFromCollectionExpression createObjectNavigationFromCollectionExpression();

    /**
     * Returns a new object of class '<em>Cast Collection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cast Collection</em>'.
     * @generated
     */
    CastCollection createCastCollection();

    /**
     * Returns a new object of class '<em>Switch Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch Expression</em>'.
     * @generated
     */
    CollectionSwitchExpression createCollectionSwitchExpression();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    CollectionPackage getCollectionPackage();

} //CollectionFactory
