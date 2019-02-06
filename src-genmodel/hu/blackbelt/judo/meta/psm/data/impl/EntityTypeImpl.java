/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.data.Relation;
import hu.blackbelt.judo.meta.psm.data.RelationCountConstraint;

import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;

import hu.blackbelt.judo.meta.psm.service.BoundOperation;

import hu.blackbelt.judo.meta.psm.type.impl.TypeImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#getSuperEntityTypes <em>Super Entity Types</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#getRelations <em>Relations</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#getRelationCountConstraints <em>Relation Count Constraints</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#getDataProperties <em>Data Properties</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#getNavigationProperties <em>Navigation Properties</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityTypeImpl extends TypeImpl implements EntityType {
	/**
	 * The cached value of the '{@link #getSuperEntityTypes() <em>Super Entity Types</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperEntityTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EntityType> superEntityTypes;

	/**
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getRelations() <em>Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<Relation> relations;

	/**
	 * The cached value of the '{@link #getRelationCountConstraints() <em>Relation Count Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationCountConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationCountConstraint> relationCountConstraints;

	/**
	 * The cached value of the '{@link #getDataProperties() <em>Data Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<DataProperty> dataProperties;

	/**
	 * The cached value of the '{@link #getNavigationProperties() <em>Navigation Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigationProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<NavigationProperty> navigationProperties;

	/**
	 * The cached value of the '{@link #getOperations() <em>Operations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<BoundOperation> operations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DataPackage.Literals.ENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EntityType> getSuperEntityTypes() {
		if (superEntityTypes == null) {
			superEntityTypes = new EObjectResolvingEList<EntityType>(EntityType.class, this, DataPackage.ENTITY_TYPE__SUPER_ENTITY_TYPES);
		}
		return superEntityTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ENTITY_TYPE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, DataPackage.ENTITY_TYPE__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relation> getRelations() {
		if (relations == null) {
			relations = new EObjectContainmentEList<Relation>(Relation.class, this, DataPackage.ENTITY_TYPE__RELATIONS);
		}
		return relations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationCountConstraint> getRelationCountConstraints() {
		if (relationCountConstraints == null) {
			relationCountConstraints = new EObjectContainmentEList<RelationCountConstraint>(RelationCountConstraint.class, this, DataPackage.ENTITY_TYPE__RELATION_COUNT_CONSTRAINTS);
		}
		return relationCountConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataProperty> getDataProperties() {
		if (dataProperties == null) {
			dataProperties = new EObjectContainmentEList<DataProperty>(DataProperty.class, this, DataPackage.ENTITY_TYPE__DATA_PROPERTIES);
		}
		return dataProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NavigationProperty> getNavigationProperties() {
		if (navigationProperties == null) {
			navigationProperties = new EObjectContainmentEList<NavigationProperty>(NavigationProperty.class, this, DataPackage.ENTITY_TYPE__NAVIGATION_PROPERTIES);
		}
		return navigationProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BoundOperation> getOperations() {
		if (operations == null) {
			operations = new EObjectContainmentEList<BoundOperation>(BoundOperation.class, this, DataPackage.ENTITY_TYPE__OPERATIONS);
		}
		return operations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DataPackage.ENTITY_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case DataPackage.ENTITY_TYPE__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case DataPackage.ENTITY_TYPE__RELATION_COUNT_CONSTRAINTS:
				return ((InternalEList<?>)getRelationCountConstraints()).basicRemove(otherEnd, msgs);
			case DataPackage.ENTITY_TYPE__DATA_PROPERTIES:
				return ((InternalEList<?>)getDataProperties()).basicRemove(otherEnd, msgs);
			case DataPackage.ENTITY_TYPE__NAVIGATION_PROPERTIES:
				return ((InternalEList<?>)getNavigationProperties()).basicRemove(otherEnd, msgs);
			case DataPackage.ENTITY_TYPE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
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
			case DataPackage.ENTITY_TYPE__SUPER_ENTITY_TYPES:
				return getSuperEntityTypes();
			case DataPackage.ENTITY_TYPE__ABSTRACT:
				return isAbstract();
			case DataPackage.ENTITY_TYPE__ATTRIBUTES:
				return getAttributes();
			case DataPackage.ENTITY_TYPE__RELATIONS:
				return getRelations();
			case DataPackage.ENTITY_TYPE__RELATION_COUNT_CONSTRAINTS:
				return getRelationCountConstraints();
			case DataPackage.ENTITY_TYPE__DATA_PROPERTIES:
				return getDataProperties();
			case DataPackage.ENTITY_TYPE__NAVIGATION_PROPERTIES:
				return getNavigationProperties();
			case DataPackage.ENTITY_TYPE__OPERATIONS:
				return getOperations();
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
			case DataPackage.ENTITY_TYPE__SUPER_ENTITY_TYPES:
				getSuperEntityTypes().clear();
				getSuperEntityTypes().addAll((Collection<? extends EntityType>)newValue);
				return;
			case DataPackage.ENTITY_TYPE__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case DataPackage.ENTITY_TYPE__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case DataPackage.ENTITY_TYPE__RELATIONS:
				getRelations().clear();
				getRelations().addAll((Collection<? extends Relation>)newValue);
				return;
			case DataPackage.ENTITY_TYPE__RELATION_COUNT_CONSTRAINTS:
				getRelationCountConstraints().clear();
				getRelationCountConstraints().addAll((Collection<? extends RelationCountConstraint>)newValue);
				return;
			case DataPackage.ENTITY_TYPE__DATA_PROPERTIES:
				getDataProperties().clear();
				getDataProperties().addAll((Collection<? extends DataProperty>)newValue);
				return;
			case DataPackage.ENTITY_TYPE__NAVIGATION_PROPERTIES:
				getNavigationProperties().clear();
				getNavigationProperties().addAll((Collection<? extends NavigationProperty>)newValue);
				return;
			case DataPackage.ENTITY_TYPE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends BoundOperation>)newValue);
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
			case DataPackage.ENTITY_TYPE__SUPER_ENTITY_TYPES:
				getSuperEntityTypes().clear();
				return;
			case DataPackage.ENTITY_TYPE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case DataPackage.ENTITY_TYPE__ATTRIBUTES:
				getAttributes().clear();
				return;
			case DataPackage.ENTITY_TYPE__RELATIONS:
				getRelations().clear();
				return;
			case DataPackage.ENTITY_TYPE__RELATION_COUNT_CONSTRAINTS:
				getRelationCountConstraints().clear();
				return;
			case DataPackage.ENTITY_TYPE__DATA_PROPERTIES:
				getDataProperties().clear();
				return;
			case DataPackage.ENTITY_TYPE__NAVIGATION_PROPERTIES:
				getNavigationProperties().clear();
				return;
			case DataPackage.ENTITY_TYPE__OPERATIONS:
				getOperations().clear();
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
			case DataPackage.ENTITY_TYPE__SUPER_ENTITY_TYPES:
				return superEntityTypes != null && !superEntityTypes.isEmpty();
			case DataPackage.ENTITY_TYPE__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case DataPackage.ENTITY_TYPE__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case DataPackage.ENTITY_TYPE__RELATIONS:
				return relations != null && !relations.isEmpty();
			case DataPackage.ENTITY_TYPE__RELATION_COUNT_CONSTRAINTS:
				return relationCountConstraints != null && !relationCountConstraints.isEmpty();
			case DataPackage.ENTITY_TYPE__DATA_PROPERTIES:
				return dataProperties != null && !dataProperties.isEmpty();
			case DataPackage.ENTITY_TYPE__NAVIGATION_PROPERTIES:
				return navigationProperties != null && !navigationProperties.isEmpty();
			case DataPackage.ENTITY_TYPE__OPERATIONS:
				return operations != null && !operations.isEmpty();
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(')');
		return result.toString();
	}

} //EntityTypeImpl
