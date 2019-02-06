/**
 */
package hu.blackbelt.judo.meta.psm.accesspoint.impl;

import hu.blackbelt.judo.meta.psm.accesspoint.*;

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
public class AccesspointFactoryImpl extends EFactoryImpl implements AccesspointFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccesspointFactory init() {
		try {
			AccesspointFactory theAccesspointFactory = (AccesspointFactory)EPackage.Registry.INSTANCE.getEFactory(AccesspointPackage.eNS_URI);
			if (theAccesspointFactory != null) {
				return theAccesspointFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AccesspointFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccesspointFactoryImpl() {
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
			case AccesspointPackage.EXPOSED_SERVICE: return createExposedService();
			case AccesspointPackage.ACCESS_POINT: return createAccessPoint();
			case AccesspointPackage.EXPOSED_GRAPH: return createExposedGraph();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposedService createExposedService() {
		ExposedServiceImpl exposedService = new ExposedServiceImpl();
		return exposedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessPoint createAccessPoint() {
		AccessPointImpl accessPoint = new AccessPointImpl();
		return accessPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExposedGraph createExposedGraph() {
		ExposedGraphImpl exposedGraph = new ExposedGraphImpl();
		return exposedGraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccesspointPackage getAccesspointPackage() {
		return (AccesspointPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AccesspointPackage getPackage() {
		return AccesspointPackage.eINSTANCE;
	}

} //AccesspointFactoryImpl
