/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferRelation;

import hu.blackbelt.judo.meta.psm.type.impl.DataTypeImpl;

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
 * An implementation of the model object '<em><b>Transfer Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectTypeImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectTypeImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectTypeImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransferObjectTypeImpl extends DataTypeImpl implements TransferObjectType {
	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected TransferAttribute representation;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<TransferRelation> relations;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<TransferAttribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.TRANSFER_OBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferAttribute getRepresentation() {
		if (representation != null && representation.eIsProxy()) {
			InternalEObject oldRepresentation = (InternalEObject)representation;
			representation = (TransferAttribute)eResolveProxy(oldRepresentation);
			if (representation != oldRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.TRANSFER_OBJECT_TYPE__REPRESENTATION, oldRepresentation, representation));
			}
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferAttribute basicGetRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(TransferAttribute newRepresentation) {
		TransferAttribute oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.TRANSFER_OBJECT_TYPE__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransferRelation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<TransferRelation>(TransferRelation.class, this, ServicePackage.TRANSFER_OBJECT_TYPE__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransferAttribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<TransferAttribute>(TransferAttribute.class, this, ServicePackage.TRANSFER_OBJECT_TYPE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.TRANSFER_OBJECT_TYPE__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case ServicePackage.TRANSFER_OBJECT_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
			case ServicePackage.TRANSFER_OBJECT_TYPE__REPRESENTATION:
				if (resolve) return getRepresentation();
				return basicGetRepresentation();
			case ServicePackage.TRANSFER_OBJECT_TYPE__RELATIONS:
				return getRelations();
			case ServicePackage.TRANSFER_OBJECT_TYPE__ATTRIBUTES:
				return getAttributes();
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
			case ServicePackage.TRANSFER_OBJECT_TYPE__REPRESENTATION:
				setRepresentation((TransferAttribute)newValue);
				return;
			case ServicePackage.TRANSFER_OBJECT_TYPE__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends TransferRelation>)newValue);
				return;
			case ServicePackage.TRANSFER_OBJECT_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends TransferAttribute>)newValue);
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
			case ServicePackage.TRANSFER_OBJECT_TYPE__REPRESENTATION:
				setRepresentation((TransferAttribute)null);
				return;
			case ServicePackage.TRANSFER_OBJECT_TYPE__RELATIONS:
				getRelations().clear();
				return;
			case ServicePackage.TRANSFER_OBJECT_TYPE__ATTRIBUTES:
				getAttributes().clear();
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
			case ServicePackage.TRANSFER_OBJECT_TYPE__REPRESENTATION:
				return representation != null;
			case ServicePackage.TRANSFER_OBJECT_TYPE__RELATIONS:
				return relations != null && !relations.isEmpty();
			case ServicePackage.TRANSFER_OBJECT_TYPE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TransferObjectTypeImpl
