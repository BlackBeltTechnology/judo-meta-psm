/**
 */
package hu.blackbelt.judo.meta.psm.expression.object.impl;

import hu.blackbelt.judo.meta.psm.expression.ObjectExpression;
import hu.blackbelt.judo.meta.psm.expression.TypeName;

import hu.blackbelt.judo.meta.psm.expression.object.CastObject;
import hu.blackbelt.judo.meta.psm.expression.object.ObjectPackage;

import hu.blackbelt.judo.meta.psm.expression.variable.ObjectVariable;
import hu.blackbelt.judo.meta.psm.expression.variable.Variable;
import hu.blackbelt.judo.meta.psm.expression.variable.VariablePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cast Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.object.impl.CastObjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.object.impl.CastObjectImpl#getElementName <em>Element Name</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.expression.object.impl.CastObjectImpl#getObjectExpression <em>Object Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CastObjectImpl extends MinimalEObjectImpl.Container implements CastObject {
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
	 * The cached value of the '{@link #getObjectExpression() <em>Object Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectExpression()
	 * @generated
	 * @ordered
	 */
	protected ObjectExpression objectExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CastObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ObjectPackage.Literals.CAST_OBJECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectPackage.CAST_OBJECT__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ObjectPackage.CAST_OBJECT__ELEMENT_NAME, oldElementName, elementName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectPackage.CAST_OBJECT__ELEMENT_NAME, oldElementName, elementName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectExpression getObjectExpression() {
		return objectExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectExpression(ObjectExpression newObjectExpression, NotificationChain msgs) {
		ObjectExpression oldObjectExpression = objectExpression;
		objectExpression = newObjectExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ObjectPackage.CAST_OBJECT__OBJECT_EXPRESSION, oldObjectExpression, newObjectExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectExpression(ObjectExpression newObjectExpression) {
		if (newObjectExpression != objectExpression) {
			NotificationChain msgs = null;
			if (objectExpression != null)
				msgs = ((InternalEObject)objectExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ObjectPackage.CAST_OBJECT__OBJECT_EXPRESSION, null, msgs);
			if (newObjectExpression != null)
				msgs = ((InternalEObject)newObjectExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ObjectPackage.CAST_OBJECT__OBJECT_EXPRESSION, null, msgs);
			msgs = basicSetObjectExpression(newObjectExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ObjectPackage.CAST_OBJECT__OBJECT_EXPRESSION, newObjectExpression, newObjectExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ObjectPackage.CAST_OBJECT__OBJECT_EXPRESSION:
				return basicSetObjectExpression(null, msgs);
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
			case ObjectPackage.CAST_OBJECT__NAME:
				return getName();
			case ObjectPackage.CAST_OBJECT__ELEMENT_NAME:
				if (resolve) return getElementName();
				return basicGetElementName();
			case ObjectPackage.CAST_OBJECT__OBJECT_EXPRESSION:
				return getObjectExpression();
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
			case ObjectPackage.CAST_OBJECT__NAME:
				setName((String)newValue);
				return;
			case ObjectPackage.CAST_OBJECT__ELEMENT_NAME:
				setElementName((TypeName)newValue);
				return;
			case ObjectPackage.CAST_OBJECT__OBJECT_EXPRESSION:
				setObjectExpression((ObjectExpression)newValue);
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
			case ObjectPackage.CAST_OBJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ObjectPackage.CAST_OBJECT__ELEMENT_NAME:
				setElementName((TypeName)null);
				return;
			case ObjectPackage.CAST_OBJECT__OBJECT_EXPRESSION:
				setObjectExpression((ObjectExpression)null);
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
			case ObjectPackage.CAST_OBJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ObjectPackage.CAST_OBJECT__ELEMENT_NAME:
				return elementName != null;
			case ObjectPackage.CAST_OBJECT__OBJECT_EXPRESSION:
				return objectExpression != null;
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
				case ObjectPackage.CAST_OBJECT__NAME: return VariablePackage.VARIABLE__NAME;
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
				case VariablePackage.VARIABLE__NAME: return ObjectPackage.CAST_OBJECT__NAME;
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

} //CastObjectImpl
