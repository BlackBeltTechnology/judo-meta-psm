/**
 */
package hu.blackbelt.judo.meta.psm.view.impl;

import hu.blackbelt.judo.meta.psm.view.Component;
import hu.blackbelt.judo.meta.psm.view.Groupbox;
import hu.blackbelt.judo.meta.psm.view.ObjectView;
import hu.blackbelt.judo.meta.psm.view.ViewPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Groupbox</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.GroupboxImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.GroupboxImpl#getParentView <em>Parent View</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GroupboxImpl extends ContainerImpl implements Groupbox {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParentView() <em>Parent View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentView()
	 * @generated
	 * @ordered
	 */
	protected ObjectView parentView;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupboxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ViewPackage.Literals.GROUPBOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.GROUPBOX__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectView getParentView() {
		if (parentView != null && parentView.eIsProxy()) {
			InternalEObject oldParentView = (InternalEObject)parentView;
			parentView = (ObjectView)eResolveProxy(oldParentView);
			if (parentView != oldParentView) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewPackage.GROUPBOX__PARENT_VIEW, oldParentView, parentView));
			}
		}
		return parentView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectView basicGetParentView() {
		return parentView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentView(ObjectView newParentView) {
		ObjectView oldParentView = parentView;
		parentView = newParentView;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.GROUPBOX__PARENT_VIEW, oldParentView, parentView));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ViewPackage.GROUPBOX__LABEL:
				return getLabel();
			case ViewPackage.GROUPBOX__PARENT_VIEW:
				if (resolve) return getParentView();
				return basicGetParentView();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ViewPackage.GROUPBOX__LABEL:
				setLabel((String)newValue);
				return;
			case ViewPackage.GROUPBOX__PARENT_VIEW:
				setParentView((ObjectView)newValue);
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
			case ViewPackage.GROUPBOX__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ViewPackage.GROUPBOX__PARENT_VIEW:
				setParentView((ObjectView)null);
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
			case ViewPackage.GROUPBOX__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ViewPackage.GROUPBOX__PARENT_VIEW:
				return parentView != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Component.class) {
			switch (derivedFeatureID) {
				case ViewPackage.GROUPBOX__LABEL: return ViewPackage.COMPONENT__LABEL;
				case ViewPackage.GROUPBOX__PARENT_VIEW: return ViewPackage.COMPONENT__PARENT_VIEW;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Component.class) {
			switch (baseFeatureID) {
				case ViewPackage.COMPONENT__LABEL: return ViewPackage.GROUPBOX__LABEL;
				case ViewPackage.COMPONENT__PARENT_VIEW: return ViewPackage.GROUPBOX__PARENT_VIEW;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //GroupboxImpl
