/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.data.EntityType;

import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.TransferAttributeBinding;
import hu.blackbelt.judo.meta.psm.service.TransferRelationBinding;

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
 * An implementation of the model object '<em><b>Mapped Transfer Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.MappedTransferObjectTypeImpl#getEntityType <em>Entity Type</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.MappedTransferObjectTypeImpl#getTransferRelationBindings <em>Transfer Relation Bindings</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.MappedTransferObjectTypeImpl#getTransferAttributeBindings <em>Transfer Attribute Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappedTransferObjectTypeImpl extends TransferObjectTypeImpl implements MappedTransferObjectType {
	/**
	 * The cached value of the '{@link #getEntityType() <em>Entity Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntityType()
	 * @generated
	 * @ordered
	 */
	protected EntityType entityType;

	/**
	 * The cached value of the '{@link #getTransferRelationBindings() <em>Transfer Relation Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferRelationBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<TransferRelationBinding> transferRelationBindings;

	/**
	 * The cached value of the '{@link #getTransferAttributeBindings() <em>Transfer Attribute Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferAttributeBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<TransferAttributeBinding> transferAttributeBindings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappedTransferObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.MAPPED_TRANSFER_OBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType getEntityType() {
		if (entityType != null && entityType.eIsProxy()) {
			InternalEObject oldEntityType = (InternalEObject)entityType;
			entityType = (EntityType)eResolveProxy(oldEntityType);
			if (entityType != oldEntityType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE, oldEntityType, entityType));
			}
		}
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityType basicGetEntityType() {
		return entityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntityType(EntityType newEntityType) {
		EntityType oldEntityType = entityType;
		entityType = newEntityType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE, oldEntityType, entityType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransferRelationBinding> getTransferRelationBindings() {
		if (transferRelationBindings == null) {
			transferRelationBindings = new EObjectContainmentEList<TransferRelationBinding>(TransferRelationBinding.class, this, ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_RELATION_BINDINGS);
		}
		return transferRelationBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransferAttributeBinding> getTransferAttributeBindings() {
		if (transferAttributeBindings == null) {
			transferAttributeBindings = new EObjectContainmentEList<TransferAttributeBinding>(TransferAttributeBinding.class, this, ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_ATTRIBUTE_BINDINGS);
		}
		return transferAttributeBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_RELATION_BINDINGS:
				return ((InternalEList<?>)getTransferRelationBindings()).basicRemove(otherEnd, msgs);
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_ATTRIBUTE_BINDINGS:
				return ((InternalEList<?>)getTransferAttributeBindings()).basicRemove(otherEnd, msgs);
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
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE:
				if (resolve) return getEntityType();
				return basicGetEntityType();
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_RELATION_BINDINGS:
				return getTransferRelationBindings();
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_ATTRIBUTE_BINDINGS:
				return getTransferAttributeBindings();
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
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE:
				setEntityType((EntityType)newValue);
				return;
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_RELATION_BINDINGS:
				getTransferRelationBindings().clear();
				getTransferRelationBindings().addAll((Collection<? extends TransferRelationBinding>)newValue);
				return;
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_ATTRIBUTE_BINDINGS:
				getTransferAttributeBindings().clear();
				getTransferAttributeBindings().addAll((Collection<? extends TransferAttributeBinding>)newValue);
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
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE:
				setEntityType((EntityType)null);
				return;
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_RELATION_BINDINGS:
				getTransferRelationBindings().clear();
				return;
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_ATTRIBUTE_BINDINGS:
				getTransferAttributeBindings().clear();
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
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__ENTITY_TYPE:
				return entityType != null;
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_RELATION_BINDINGS:
				return transferRelationBindings != null && !transferRelationBindings.isEmpty();
			case ServicePackage.MAPPED_TRANSFER_OBJECT_TYPE__TRANSFER_ATTRIBUTE_BINDINGS:
				return transferAttributeBindings != null && !transferAttributeBindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MappedTransferObjectTypeImpl
