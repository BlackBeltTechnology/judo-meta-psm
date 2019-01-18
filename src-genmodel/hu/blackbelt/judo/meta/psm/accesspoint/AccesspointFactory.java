/**
 */
package hu.blackbelt.judo.meta.psm.accesspoint;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage
 * @generated
 */
public interface AccesspointFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AccesspointFactory eINSTANCE = hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Exposed Service</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exposed Service</em>'.
     * @generated
     */
    ExposedService createExposedService();

    /**
     * Returns a new object of class '<em>Access Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Access Point</em>'.
     * @generated
     */
    AccessPoint createAccessPoint();

    /**
     * Returns a new object of class '<em>Exposed Graph</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Exposed Graph</em>'.
     * @generated
     */
    ExposedGraph createExposedGraph();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    AccesspointPackage getAccesspointPackage();

} //AccesspointFactory
