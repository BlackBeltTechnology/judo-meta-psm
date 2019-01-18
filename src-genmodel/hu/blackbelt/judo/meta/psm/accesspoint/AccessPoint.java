/**
 */
package hu.blackbelt.judo.meta.psm.accesspoint;

import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint#getExposedServices <em>Exposed Services</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint#getExposedGraphs <em>Exposed Graphs</em>}</li>
 * </ul>
 *
 * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage#getAccessPoint()
 * @model
 * @generated
 */
public interface AccessPoint extends NamespaceElement {
    /**
     * Returns the value of the '<em><b>Exposed Services</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.accesspoint.ExposedService}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exposed Services</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exposed Services</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage#getAccessPoint_ExposedServices()
     * @model containment="true"
     * @generated
     */
    EList<ExposedService> getExposedServices();

    /**
     * Returns the value of the '<em><b>Exposed Graphs</b></em>' containment reference list.
     * The list contents are of type {@link hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exposed Graphs</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exposed Graphs</em>' containment reference list.
     * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage#getAccessPoint_ExposedGraphs()
     * @model containment="true"
     * @generated
     */
    EList<ExposedGraph> getExposedGraphs();

} // AccessPoint
