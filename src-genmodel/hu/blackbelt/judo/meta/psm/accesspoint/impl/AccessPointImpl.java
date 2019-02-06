/**
 */
package hu.blackbelt.judo.meta.psm.accesspoint.impl;

import hu.blackbelt.judo.meta.psm.accesspoint.AccessPoint;
import hu.blackbelt.judo.meta.psm.accesspoint.AccesspointPackage;
import hu.blackbelt.judo.meta.psm.accesspoint.ExposedGraph;
import hu.blackbelt.judo.meta.psm.accesspoint.ExposedService;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.AccessPointImpl#getExposedServices <em>Exposed Services</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.accesspoint.impl.AccessPointImpl#getExposedGraphs <em>Exposed Graphs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessPointImpl extends NamespaceElementImpl implements AccessPoint {
	/**
	 * The cached value of the '{@link #getExposedServices() <em>Exposed Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposedServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ExposedService> exposedServices;

	/**
	 * The cached value of the '{@link #getExposedGraphs() <em>Exposed Graphs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExposedGraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<ExposedGraph> exposedGraphs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccesspointPackage.Literals.ACCESS_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExposedService> getExposedServices() {
		if (exposedServices == null) {
			exposedServices = new EObjectContainmentEList<ExposedService>(ExposedService.class, this, AccesspointPackage.ACCESS_POINT__EXPOSED_SERVICES);
		}
		return exposedServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExposedGraph> getExposedGraphs() {
		if (exposedGraphs == null) {
			exposedGraphs = new EObjectContainmentEList<ExposedGraph>(ExposedGraph.class, this, AccesspointPackage.ACCESS_POINT__EXPOSED_GRAPHS);
		}
		return exposedGraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AccesspointPackage.ACCESS_POINT__EXPOSED_SERVICES:
				return ((InternalEList<?>)getExposedServices()).basicRemove(otherEnd, msgs);
			case AccesspointPackage.ACCESS_POINT__EXPOSED_GRAPHS:
				return ((InternalEList<?>)getExposedGraphs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AccesspointPackage.ACCESS_POINT__EXPOSED_SERVICES:
				return getExposedServices();
			case AccesspointPackage.ACCESS_POINT__EXPOSED_GRAPHS:
				return getExposedGraphs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AccesspointPackage.ACCESS_POINT__EXPOSED_SERVICES:
				getExposedServices().clear();
				getExposedServices().addAll((Collection<? extends ExposedService>)newValue);
				return;
			case AccesspointPackage.ACCESS_POINT__EXPOSED_GRAPHS:
				getExposedGraphs().clear();
				getExposedGraphs().addAll((Collection<? extends ExposedGraph>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AccesspointPackage.ACCESS_POINT__EXPOSED_SERVICES:
				getExposedServices().clear();
				return;
			case AccesspointPackage.ACCESS_POINT__EXPOSED_GRAPHS:
				getExposedGraphs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AccesspointPackage.ACCESS_POINT__EXPOSED_SERVICES:
				return exposedServices != null && !exposedServices.isEmpty();
			case AccesspointPackage.ACCESS_POINT__EXPOSED_GRAPHS:
				return exposedGraphs != null && !exposedGraphs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccessPointImpl
