/**
 */
package hu.blackbelt.judo.meta.psm.measure.impl;

import hu.blackbelt.judo.meta.psm.expression.MeasureName;

import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.MeasurePackage;
import hu.blackbelt.judo.meta.psm.measure.Unit;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamespaceElementImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Measure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.impl.MeasureImpl#getUnits <em>Units</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.impl.MeasureImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.measure.impl.MeasureImpl#getMeasureName <em>Measure Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MeasureImpl extends NamespaceElementImpl implements Measure {
	/**
	 * The cached value of the '{@link #getUnits() <em>Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<Unit> units;

	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasureName() <em>Measure Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureName()
	 * @generated
	 * @ordered
	 */
	protected MeasureName measureName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MeasureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MeasurePackage.Literals.MEASURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Unit> getUnits() {
		if (units == null) {
			units = new EObjectContainmentEList<Unit>(Unit.class, this, MeasurePackage.MEASURE__UNITS);
		}
		return units;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasurePackage.MEASURE__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureName getMeasureName() {
		if (measureName != null && measureName.eIsProxy()) {
			InternalEObject oldMeasureName = (InternalEObject)measureName;
			measureName = (MeasureName)eResolveProxy(oldMeasureName);
			if (measureName != oldMeasureName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MeasurePackage.MEASURE__MEASURE_NAME, oldMeasureName, measureName));
			}
		}
		return measureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasureName basicGetMeasureName() {
		return measureName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMeasureName(MeasureName newMeasureName) {
		MeasureName oldMeasureName = measureName;
		measureName = newMeasureName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MeasurePackage.MEASURE__MEASURE_NAME, oldMeasureName, measureName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MeasurePackage.MEASURE__UNITS:
				return ((InternalEList<?>)getUnits()).basicRemove(otherEnd, msgs);
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
			case MeasurePackage.MEASURE__UNITS:
				return getUnits();
			case MeasurePackage.MEASURE__SYMBOL:
				return getSymbol();
			case MeasurePackage.MEASURE__MEASURE_NAME:
				if (resolve) return getMeasureName();
				return basicGetMeasureName();
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
			case MeasurePackage.MEASURE__UNITS:
				getUnits().clear();
				getUnits().addAll((Collection<? extends Unit>)newValue);
				return;
			case MeasurePackage.MEASURE__SYMBOL:
				setSymbol((String)newValue);
				return;
			case MeasurePackage.MEASURE__MEASURE_NAME:
				setMeasureName((MeasureName)newValue);
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
			case MeasurePackage.MEASURE__UNITS:
				getUnits().clear();
				return;
			case MeasurePackage.MEASURE__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case MeasurePackage.MEASURE__MEASURE_NAME:
				setMeasureName((MeasureName)null);
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
			case MeasurePackage.MEASURE__UNITS:
				return units != null && !units.isEmpty();
			case MeasurePackage.MEASURE__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case MeasurePackage.MEASURE__MEASURE_NAME:
				return measureName != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (symbol: ");
		result.append(symbol);
		result.append(')');
		return result.toString();
	}

} //MeasureImpl
