/**
 */
package hu.blackbelt.judo.meta.psm.expression.collection.impl;

import hu.blackbelt.judo.meta.psm.expression.TypeName;

import hu.blackbelt.judo.meta.psm.expression.collection.CollectionPackage;
import hu.blackbelt.judo.meta.psm.expression.collection.ImmutableCollection;

import hu.blackbelt.judo.meta.psm.expression.variable.ObjectVariable;
import hu.blackbelt.judo.meta.psm.expression.variable.Variable;
import hu.blackbelt.judo.meta.psm.expression.variable.VariablePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immutable Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.ImmutableCollectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.collection.impl.ImmutableCollectionImpl#getElementName <em>Element Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImmutableCollectionImpl extends MinimalEObjectImpl.Container implements ImmutableCollection {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElementName() <em>Element Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementName()
	 * @generated
	 * @ordered
	 */
	protected TypeName elementName;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmutableCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CollectionPackage.Literals.IMMUTABLE_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.IMMUTABLE_COLLECTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeName getElementName() {
		if (elementName != null && elementName.eIsProxy()) {
			InternalEObject oldElementName = (InternalEObject)elementName;
			elementName = (TypeName)eResolveProxy(oldElementName);
			if (elementName != oldElementName) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CollectionPackage.IMMUTABLE_COLLECTION__ELEMENT_NAME, oldElementName, elementName));
			}
		}
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeName basicGetElementName() {
		return elementName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementName(TypeName newElementName) {
		TypeName oldElementName = elementName;
		elementName = newElementName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CollectionPackage.IMMUTABLE_COLLECTION__ELEMENT_NAME, oldElementName, elementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CollectionPackage.IMMUTABLE_COLLECTION__NAME:
				return getName();
			case CollectionPackage.IMMUTABLE_COLLECTION__ELEMENT_NAME:
				if (resolve) return getElementName();
				return basicGetElementName();
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
			case CollectionPackage.IMMUTABLE_COLLECTION__NAME:
				setName((String)newValue);
				return;
			case CollectionPackage.IMMUTABLE_COLLECTION__ELEMENT_NAME:
				setElementName((TypeName)newValue);
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
			case CollectionPackage.IMMUTABLE_COLLECTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CollectionPackage.IMMUTABLE_COLLECTION__ELEMENT_NAME:
				setElementName((TypeName)null);
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
			case CollectionPackage.IMMUTABLE_COLLECTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CollectionPackage.IMMUTABLE_COLLECTION__ELEMENT_NAME:
				return elementName != null;
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
		if (baseClass == Variable.class) {
			switch (derivedFeatureID) {
				case CollectionPackage.IMMUTABLE_COLLECTION__NAME: return VariablePackage.VARIABLE__NAME;
				default: return -1;
			}
		}
		if (baseClass == ObjectVariable.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == Variable.class) {
			switch (baseFeatureID) {
				case VariablePackage.VARIABLE__NAME: return CollectionPackage.IMMUTABLE_COLLECTION__NAME;
				default: return -1;
			}
		}
		if (baseClass == ObjectVariable.class) {
			switch (baseFeatureID) {
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ImmutableCollectionImpl
