/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.EntitySequence;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.data.OperationBody;
import hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement;
import hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement;
import hu.blackbelt.judo.meta.psm.data.Relation;

import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;

import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;
import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;

import hu.blackbelt.judo.meta.psm.type.Primitive;

import hu.blackbelt.judo.meta.psm.type.impl.TypeImpl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#getDataProperties <em>Data Properties</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#getNavigationProperties <em>Navigation Properties</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#getSequences <em>Sequences</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntityTypeImpl#getDefaultRepresentation <em>Default Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityTypeImpl extends TypeImpl implements EntityType
{
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityTypeImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return DataPackage.Literals.ENTITY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EntityType> getSuperEntityTypes()
	{
		return (EList<EntityType>)eDynamicGet(DataPackage.ENTITY_TYPE__SUPER_ENTITY_TYPES, DataPackage.Literals.ENTITY_TYPE__SUPER_ENTITY_TYPES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAbstract()
	{
		return (Boolean)eDynamicGet(DataPackage.ENTITY_TYPE__ABSTRACT, DataPackage.Literals.ENTITY_TYPE__ABSTRACT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAbstract(boolean newAbstract)
	{
		eDynamicSet(DataPackage.ENTITY_TYPE__ABSTRACT, DataPackage.Literals.ENTITY_TYPE__ABSTRACT, newAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Attribute> getAttributes()
	{
		return (EList<Attribute>)eDynamicGet(DataPackage.ENTITY_TYPE__ATTRIBUTES, DataPackage.Literals.ENTITY_TYPE__ATTRIBUTES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Relation> getRelations()
	{
		return (EList<Relation>)eDynamicGet(DataPackage.ENTITY_TYPE__RELATIONS, DataPackage.Literals.ENTITY_TYPE__RELATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<DataProperty> getDataProperties()
	{
		return (EList<DataProperty>)eDynamicGet(DataPackage.ENTITY_TYPE__DATA_PROPERTIES, DataPackage.Literals.ENTITY_TYPE__DATA_PROPERTIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<NavigationProperty> getNavigationProperties()
	{
		return (EList<NavigationProperty>)eDynamicGet(DataPackage.ENTITY_TYPE__NAVIGATION_PROPERTIES, DataPackage.Literals.ENTITY_TYPE__NAVIGATION_PROPERTIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EntitySequence> getSequences()
	{
		return (EList<EntitySequence>)eDynamicGet(DataPackage.ENTITY_TYPE__SEQUENCES, DataPackage.Literals.ENTITY_TYPE__SEQUENCES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<BoundOperation> getOperations()
	{
		return (EList<BoundOperation>)eDynamicGet(DataPackage.ENTITY_TYPE__OPERATIONS, DataPackage.Literals.ENTITY_TYPE__OPERATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<InvariantConstraint> getConstraints()
	{
		return (EList<InvariantConstraint>)eDynamicGet(DataPackage.ENTITY_TYPE__CONSTRAINTS, DataPackage.Literals.ENTITY_TYPE__CONSTRAINTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappedTransferObjectType getDefaultRepresentation()
	{
		return (MappedTransferObjectType)eDynamicGet(DataPackage.ENTITY_TYPE__DEFAULT_REPRESENTATION, DataPackage.Literals.ENTITY_TYPE__DEFAULT_REPRESENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedTransferObjectType basicGetDefaultRepresentation()
	{
		return (MappedTransferObjectType)eDynamicGet(DataPackage.ENTITY_TYPE__DEFAULT_REPRESENTATION, DataPackage.Literals.ENTITY_TYPE__DEFAULT_REPRESENTATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultRepresentation(MappedTransferObjectType newDefaultRepresentation)
	{
		eDynamicSet(DataPackage.ENTITY_TYPE__DEFAULT_REPRESENTATION, DataPackage.Literals.ENTITY_TYPE__DEFAULT_REPRESENTATION, newDefaultRepresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EntityType> getAllSuperEntityTypes()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.getAllSuperEntityTypes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveTypedElement getAttribute(final String name)
	{
		        final java.util.Collection<EntityType> base = new java.util.ArrayList<>(getAllSuperEntityTypes());
		        base.add(this);
		
		        final java.util.Optional<java.util.Optional<Attribute>> attribute = base.stream()
		                .filter(e -> e.getAttributes().stream().anyMatch(a -> java.util.Objects.equals(name, a.getName()))) // get all types containing attribute named name
		                .map(e -> e.getAttributes().stream().filter(a -> java.util.Objects.equals(name, a.getName())).findFirst()) // get attributes of types
		                .findFirst(); // redefining attributes is not supported
		        final java.util.Optional<java.util.Optional<DataProperty>> dataProperty = base.stream()
		                .filter(e -> e.getDataProperties().stream().anyMatch(d -> java.util.Objects.equals(name, d.getName()))) // get all types containing data property named name
		                .map(e -> e.getDataProperties().stream().filter(d -> java.util.Objects.equals(name, d.getName())).findFirst()) // get data properties of types
		                .findFirst(); // redefining data properties is not supported
		
		        if (attribute.isPresent()) {
		            return attribute.get().get();
		        } else if (dataProperty.isPresent()) {
		            return dataProperty.get().get();
		        } else {
		            return null;
		        }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceTypedElement getReference(final String name)
	{
		        final java.util.Collection<EntityType> base = new java.util.ArrayList<>(getAllSuperEntityTypes());
		        base.add(this);
		
		        final java.util.Optional<java.util.Optional<Relation>> relation = base.stream()
		                .filter(e -> e.getRelations().stream().anyMatch(r -> java.util.Objects.equals(name, r.getName()))) // get all types containing reference named name
		                .map(e -> e.getRelations().stream().filter(r -> java.util.Objects.equals(name, r.getName())).findFirst()) // get references of types
		                .findFirst(); // redefining references is not supported
		        final java.util.Optional<java.util.Optional<NavigationProperty>> navigationProperty = base.stream()
		                .filter(e -> e.getNavigationProperties().stream().anyMatch(n -> java.util.Objects.equals(name, n.getName()))) // get all types containing navigation property named name
		                .map(e -> e.getNavigationProperties().stream().filter(n -> java.util.Objects.equals(name, n.getName())).findFirst()) // get navigation properties of types
		                .findFirst(); // redefining navigation properties is not supported
		
		        if (relation.isPresent()) {
		            return relation.get().get();
		        } else if (navigationProperty.isPresent()) {
		            return navigationProperty.get().get();
		        } else {
		            return null;
		        }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Primitive getAttributeType(final String name)
	{
		        final PrimitiveTypedElement attribute = getAttribute(name);
		
		        if (attribute != null) {
		            return attribute.getDataType();
		        } else {
		            return null;
		        }
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		return super.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContainer()
	{
		return getRelations().stream().anyMatch(r -> r instanceof hu.blackbelt.judo.meta.psm.data.Containment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isContainment()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.isContainment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relation> getAllRelations()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.getAllRelations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAllAttributes()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.getAllAttributes(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataProperty> getAllDataProperties()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.getAllDataProperties(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NavigationProperty> getAllNavigationProperties()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.getAllNavigationProperties(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EntitySequence> getAllSequences()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.getAllSequences(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationBody getInheritedOperationImplementationByName(final String name)
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.getInheritedOperationImplementationByName(this,name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OperationBody> getInheritedOperationImplementationsByName(final String name)
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.getInheritedOperationImplementationsByName(this,name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getInheritedOperationNames()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.getInheritedOperationNames(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAllOperationNames()
	{
		return hu.blackbelt.judo.meta.psm.PsmUtils.getAllOperationNames(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case DataPackage.ENTITY_TYPE__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case DataPackage.ENTITY_TYPE__RELATIONS:
				return ((InternalEList<?>)getRelations()).basicRemove(otherEnd, msgs);
			case DataPackage.ENTITY_TYPE__DATA_PROPERTIES:
				return ((InternalEList<?>)getDataProperties()).basicRemove(otherEnd, msgs);
			case DataPackage.ENTITY_TYPE__NAVIGATION_PROPERTIES:
				return ((InternalEList<?>)getNavigationProperties()).basicRemove(otherEnd, msgs);
			case DataPackage.ENTITY_TYPE__SEQUENCES:
				return ((InternalEList<?>)getSequences()).basicRemove(otherEnd, msgs);
			case DataPackage.ENTITY_TYPE__OPERATIONS:
				return ((InternalEList<?>)getOperations()).basicRemove(otherEnd, msgs);
			case DataPackage.ENTITY_TYPE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case DataPackage.ENTITY_TYPE__SUPER_ENTITY_TYPES:
				return getSuperEntityTypes();
			case DataPackage.ENTITY_TYPE__ABSTRACT:
				return isAbstract();
			case DataPackage.ENTITY_TYPE__ATTRIBUTES:
				return getAttributes();
			case DataPackage.ENTITY_TYPE__RELATIONS:
				return getRelations();
			case DataPackage.ENTITY_TYPE__DATA_PROPERTIES:
				return getDataProperties();
			case DataPackage.ENTITY_TYPE__NAVIGATION_PROPERTIES:
				return getNavigationProperties();
			case DataPackage.ENTITY_TYPE__SEQUENCES:
				return getSequences();
			case DataPackage.ENTITY_TYPE__OPERATIONS:
				return getOperations();
			case DataPackage.ENTITY_TYPE__CONSTRAINTS:
				return getConstraints();
			case DataPackage.ENTITY_TYPE__DEFAULT_REPRESENTATION:
				if (resolve) return getDefaultRepresentation();
				return basicGetDefaultRepresentation();
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
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
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
			case DataPackage.ENTITY_TYPE__DATA_PROPERTIES:
				getDataProperties().clear();
				getDataProperties().addAll((Collection<? extends DataProperty>)newValue);
				return;
			case DataPackage.ENTITY_TYPE__NAVIGATION_PROPERTIES:
				getNavigationProperties().clear();
				getNavigationProperties().addAll((Collection<? extends NavigationProperty>)newValue);
				return;
			case DataPackage.ENTITY_TYPE__SEQUENCES:
				getSequences().clear();
				getSequences().addAll((Collection<? extends EntitySequence>)newValue);
				return;
			case DataPackage.ENTITY_TYPE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends BoundOperation>)newValue);
				return;
			case DataPackage.ENTITY_TYPE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends InvariantConstraint>)newValue);
				return;
			case DataPackage.ENTITY_TYPE__DEFAULT_REPRESENTATION:
				setDefaultRepresentation((MappedTransferObjectType)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
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
			case DataPackage.ENTITY_TYPE__DATA_PROPERTIES:
				getDataProperties().clear();
				return;
			case DataPackage.ENTITY_TYPE__NAVIGATION_PROPERTIES:
				getNavigationProperties().clear();
				return;
			case DataPackage.ENTITY_TYPE__SEQUENCES:
				getSequences().clear();
				return;
			case DataPackage.ENTITY_TYPE__OPERATIONS:
				getOperations().clear();
				return;
			case DataPackage.ENTITY_TYPE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case DataPackage.ENTITY_TYPE__DEFAULT_REPRESENTATION:
				setDefaultRepresentation((MappedTransferObjectType)null);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case DataPackage.ENTITY_TYPE__SUPER_ENTITY_TYPES:
				return !getSuperEntityTypes().isEmpty();
			case DataPackage.ENTITY_TYPE__ABSTRACT:
				return isAbstract() != ABSTRACT_EDEFAULT;
			case DataPackage.ENTITY_TYPE__ATTRIBUTES:
				return !getAttributes().isEmpty();
			case DataPackage.ENTITY_TYPE__RELATIONS:
				return !getRelations().isEmpty();
			case DataPackage.ENTITY_TYPE__DATA_PROPERTIES:
				return !getDataProperties().isEmpty();
			case DataPackage.ENTITY_TYPE__NAVIGATION_PROPERTIES:
				return !getNavigationProperties().isEmpty();
			case DataPackage.ENTITY_TYPE__SEQUENCES:
				return !getSequences().isEmpty();
			case DataPackage.ENTITY_TYPE__OPERATIONS:
				return !getOperations().isEmpty();
			case DataPackage.ENTITY_TYPE__CONSTRAINTS:
				return !getConstraints().isEmpty();
			case DataPackage.ENTITY_TYPE__DEFAULT_REPRESENTATION:
				return basicGetDefaultRepresentation() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
	{
		if (baseClass == NamespaceElement.class)
		{
			switch (baseOperationID)
			{
				case NamespacePackage.NAMESPACE_ELEMENT___TO_STRING: return DataPackage.ENTITY_TYPE___TO_STRING;
				default: return super.eDerivedOperationID(baseOperationID, baseClass);
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
			case DataPackage.ENTITY_TYPE___GET_ALL_SUPER_ENTITY_TYPES:
				return getAllSuperEntityTypes();
			case DataPackage.ENTITY_TYPE___GET_ATTRIBUTE__STRING:
				return getAttribute((String)arguments.get(0));
			case DataPackage.ENTITY_TYPE___GET_REFERENCE__STRING:
				return getReference((String)arguments.get(0));
			case DataPackage.ENTITY_TYPE___GET_ATTRIBUTE_TYPE__STRING:
				return getAttributeType((String)arguments.get(0));
			case DataPackage.ENTITY_TYPE___TO_STRING:
				return toString();
			case DataPackage.ENTITY_TYPE___IS_CONTAINER:
				return isContainer();
			case DataPackage.ENTITY_TYPE___IS_CONTAINMENT:
				return isContainment();
			case DataPackage.ENTITY_TYPE___GET_ALL_RELATIONS:
				return getAllRelations();
			case DataPackage.ENTITY_TYPE___GET_ALL_ATTRIBUTES:
				return getAllAttributes();
			case DataPackage.ENTITY_TYPE___GET_ALL_DATA_PROPERTIES:
				return getAllDataProperties();
			case DataPackage.ENTITY_TYPE___GET_ALL_NAVIGATION_PROPERTIES:
				return getAllNavigationProperties();
			case DataPackage.ENTITY_TYPE___GET_ALL_SEQUENCES:
				return getAllSequences();
			case DataPackage.ENTITY_TYPE___GET_INHERITED_OPERATION_IMPLEMENTATION_BY_NAME__STRING:
				return getInheritedOperationImplementationByName((String)arguments.get(0));
			case DataPackage.ENTITY_TYPE___GET_INHERITED_OPERATION_IMPLEMENTATIONS_BY_NAME__STRING:
				return getInheritedOperationImplementationsByName((String)arguments.get(0));
			case DataPackage.ENTITY_TYPE___GET_INHERITED_OPERATION_NAMES:
				return getInheritedOperationNames();
			case DataPackage.ENTITY_TYPE___GET_ALL_OPERATION_NAMES:
				return getAllOperationNames();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EntityTypeImpl
