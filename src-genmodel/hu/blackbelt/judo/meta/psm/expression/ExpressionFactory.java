/**
 */
package hu.blackbelt.judo.meta.psm.expression;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.ExpressionPackage
 * @generated
 */
public interface ExpressionFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ExpressionFactory eINSTANCE = hu.blackbelt.judo.meta.psm.expression.impl.ExpressionFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Element Name</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Element Name</em>'.
     * @generated
     */
    ElementName createElementName();

    /**
     * Returns a new object of class '<em>Switch Case</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Switch Case</em>'.
     * @generated
     */
    SwitchCase createSwitchCase();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ExpressionPackage getExpressionPackage();

} //ExpressionFactory
