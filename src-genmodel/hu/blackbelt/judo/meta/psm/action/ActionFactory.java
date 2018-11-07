/**
 */
package hu.blackbelt.judo.meta.psm.action;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.action.ActionPackage
 * @generated
 */
public interface ActionFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ActionFactory eINSTANCE = hu.blackbelt.judo.meta.psm.action.impl.ActionFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Action</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Action</em>'.
     * @generated
     */
    Action createAction();

    /**
     * Returns a new object of class '<em>Query</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Query</em>'.
     * @generated
     */
    Query createQuery();

    /**
     * Returns a new object of class '<em>Primitive Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Primitive Parameter</em>'.
     * @generated
     */
    PrimitiveParameter createPrimitiveParameter();

    /**
     * Returns a new object of class '<em>Single Entity Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Single Entity Parameter</em>'.
     * @generated
     */
    SingleEntityParameter createSingleEntityParameter();

    /**
     * Returns a new object of class '<em>List Entity Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>List Entity Parameter</em>'.
     * @generated
     */
    ListEntityParameter createListEntityParameter();

    /**
     * Returns a new object of class '<em>Delete Operation</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Delete Operation</em>'.
     * @generated
     */
    DeleteOperation createDeleteOperation();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ActionPackage getActionPackage();

} //ActionFactory
