/**
 */
package hu.blackbelt.judo.meta.psm.accesspoint;

import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.accesspoint.AccesspointFactory
 * @model kind="package"
 * @generated
 */
public interface AccesspointPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "accesspoint";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://blackbelt.hu/judo/meta/psm/accesspoint";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "accesspoint";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccesspointPackage eINSTANCE = hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.ExposedServiceImpl <em>Exposed Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.ExposedServiceImpl
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl#getExposedService()
	 * @generated
	 */
	int EXPOSED_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSED_SERVICE__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSED_SERVICE__OPERATION = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Exposed Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSED_SERVICE_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Exposed Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSED_SERVICE_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.AccessPointImpl <em>Access Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.AccessPointImpl
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl#getAccessPoint()
	 * @generated
	 */
	int ACCESS_POINT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POINT__NAME = NamespacePackage.NAMESPACE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Exposed Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POINT__EXPOSED_SERVICES = NamespacePackage.NAMESPACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Exposed Graphs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POINT__EXPOSED_GRAPHS = NamespacePackage.NAMESPACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Access Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POINT_FEATURE_COUNT = NamespacePackage.NAMESPACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Access Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCESS_POINT_OPERATION_COUNT = NamespacePackage.NAMESPACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.ExposedGraphImpl <em>Exposed Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.ExposedGraphImpl
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl#getExposedGraph()
	 * @generated
	 */
	int EXPOSED_GRAPH = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSED_GRAPH__NAME = NamespacePackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Selector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSED_GRAPH__SELECTOR = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Entry Transfer Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSED_GRAPH__ENTRY_TRANSFER_OBJECT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Exposed Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSED_GRAPH_FEATURE_COUNT = NamespacePackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Exposed Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPOSED_GRAPH_OPERATION_COUNT = NamespacePackage.NAMED_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.accesspoint.ExposedService <em>Exposed Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exposed Service</em>'.
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.ExposedService
	 * @generated
	 */
	EClass getExposedService();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.accesspoint.ExposedService#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation</em>'.
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.ExposedService#getOperation()
	 * @see #getExposedService()
	 * @generated
	 */
	EReference getExposedService_Operation();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint <em>Access Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Access Point</em>'.
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint
	 * @generated
	 */
	EClass getAccessPoint();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint#getExposedServices <em>Exposed Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exposed Services</em>'.
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint#getExposedServices()
	 * @see #getAccessPoint()
	 * @generated
	 */
	EReference getAccessPoint_ExposedServices();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint#getExposedGraphs <em>Exposed Graphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exposed Graphs</em>'.
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint#getExposedGraphs()
	 * @see #getAccessPoint()
	 * @generated
	 */
	EReference getAccessPoint_ExposedGraphs();

	/**
	 * Returns the meta object for class '{@link hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph <em>Exposed Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exposed Graph</em>'.
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph
	 * @generated
	 */
	EClass getExposedGraph();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph#getSelector <em>Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Selector</em>'.
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph#getSelector()
	 * @see #getExposedGraph()
	 * @generated
	 */
	EReference getExposedGraph_Selector();

	/**
	 * Returns the meta object for the reference '{@link hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph#getEntryTransferObject <em>Entry Transfer Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entry Transfer Object</em>'.
	 * @see hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph#getEntryTransferObject()
	 * @see #getExposedGraph()
	 * @generated
	 */
	EReference getExposedGraph_EntryTransferObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AccesspointFactory getAccesspointFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.ExposedServiceImpl <em>Exposed Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.ExposedServiceImpl
		 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl#getExposedService()
		 * @generated
		 */
		EClass EXPOSED_SERVICE = eINSTANCE.getExposedService();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPOSED_SERVICE__OPERATION = eINSTANCE.getExposedService_Operation();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.AccessPointImpl <em>Access Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.AccessPointImpl
		 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl#getAccessPoint()
		 * @generated
		 */
		EClass ACCESS_POINT = eINSTANCE.getAccessPoint();

		/**
		 * The meta object literal for the '<em><b>Exposed Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POINT__EXPOSED_SERVICES = eINSTANCE.getAccessPoint_ExposedServices();

		/**
		 * The meta object literal for the '<em><b>Exposed Graphs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCESS_POINT__EXPOSED_GRAPHS = eINSTANCE.getAccessPoint_ExposedGraphs();

		/**
		 * The meta object literal for the '{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.ExposedGraphImpl <em>Exposed Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.ExposedGraphImpl
		 * @see hu.blackbelt.judo.meta.psm.accesspoint.impl.AccesspointPackageImpl#getExposedGraph()
		 * @generated
		 */
		EClass EXPOSED_GRAPH = eINSTANCE.getExposedGraph();

		/**
		 * The meta object literal for the '<em><b>Selector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPOSED_GRAPH__SELECTOR = eINSTANCE.getExposedGraph_Selector();

		/**
		 * The meta object literal for the '<em><b>Entry Transfer Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPOSED_GRAPH__ENTRY_TRANSFER_OBJECT = eINSTANCE.getExposedGraph_EntryTransferObject();

	}

} //AccesspointPackage
