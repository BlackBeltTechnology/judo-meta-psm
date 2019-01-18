/**
 */
package hu.blackbelt.judo.meta.psm.expression.object;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage
 * @generated
 */
public interface ObjectFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ObjectFactory eINSTANCE = hu.blackbelt.judo.meta.psm.expression.object.impl.ObjectFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Navigation Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Navigation Expression</em>'.
     * @generated
     */
    ObjectNavigationExpression createObjectNavigationExpression();

    /**
     * Returns a new object of class '<em>Selector Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Selector Expression</em>'.
     * @generated
     */
    ObjectSelectorExpression createObjectSelectorExpression();

    /**
     * Returns a new object of class '<em>Filter Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Filter Expression</em>'.
     * @generated
     */
    ObjectFilterExpression createObjectFilterExpression();

    /**
     * Returns a new object of class '<em>Variable Reference</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Variable Reference</em>'.
     * @generated
     */
    ObjectVariableReference createObjectVariableReference();

    /**
     * Returns a new object of class '<em>Cast Object</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Cast Object</em>'.
     * @generated
     */
    CastObject createCastObject();

    /**
     * Returns a new object of class '<em>Switch Expression</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch Expression</em>'.
     * @generated
     */
    ObjectSwitchExpression createObjectSwitchExpression();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ObjectPackage getObjectPackage();

} //ObjectFactory
