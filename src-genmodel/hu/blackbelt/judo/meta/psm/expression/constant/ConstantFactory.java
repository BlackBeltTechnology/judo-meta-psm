/**
 */
package hu.blackbelt.judo.meta.psm.expression.constant;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.expression.constant.ConstantPackage
 * @generated
 */
public interface ConstantFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    ConstantFactory eINSTANCE = hu.blackbelt.judo.meta.psm.expression.constant.impl.ConstantFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Integer</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Integer</em>'.
     * @generated
     */
    Integer createInteger();

    /**
     * Returns a new object of class '<em>Decimal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Decimal</em>'.
     * @generated
     */
    Decimal createDecimal();

    /**
     * Returns a new object of class '<em>Boolean</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Boolean</em>'.
     * @generated
     */
    Boolean createBoolean();

    /**
     * Returns a new object of class '<em>String</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>String</em>'.
     * @generated
     */
    String createString();

    /**
     * Returns a new object of class '<em>Literal</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Literal</em>'.
     * @generated
     */
    Literal createLiteral();

    /**
     * Returns a new object of class '<em>Instance</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Instance</em>'.
     * @generated
     */
    Instance createInstance();

    /**
     * Returns a new object of class '<em>Custom Data</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Custom Data</em>'.
     * @generated
     */
    CustomData createCustomData();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    ConstantPackage getConstantPackage();

} //ConstantFactory
