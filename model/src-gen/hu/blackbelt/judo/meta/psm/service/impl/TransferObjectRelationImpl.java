/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement;

import hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferObjectType;

import hu.blackbelt.judo.meta.psm.type.Cardinality;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transfer Object Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectRelationImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectRelationImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectRelationImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectRelationImpl#getRange <em>Range</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectRelationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectRelationImpl#isEmbedded <em>Embedded</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectRelationImpl#isEmbeddedCreate <em>Embedded Create</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectRelationImpl#isEmbeddedUpdate <em>Embedded Update</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectRelationImpl#isEmbeddedDelete <em>Embedded Delete</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.TransferObjectRelationImpl#isAccess <em>Access</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransferObjectRelationImpl extends NamedElementImpl implements TransferObjectRelation
{
	/**
	 * The default value of the '{@link #isEmbedded() <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbedded()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMBEDDED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isEmbeddedCreate() <em>Embedded Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbeddedCreate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMBEDDED_CREATE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isEmbeddedUpdate() <em>Embedded Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbeddedUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMBEDDED_UPDATE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isEmbeddedDelete() <em>Embedded Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEmbeddedDelete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMBEDDED_DELETE_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isAccess() <em>Access</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccess()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCESS_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransferObjectRelationImpl()
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
		return ServicePackage.Literals.TRANSFER_OBJECT_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Cardinality getCardinality()
	{
		return (Cardinality)eDynamicGet(ServicePackage.TRANSFER_OBJECT_RELATION__CARDINALITY, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__CARDINALITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardinality(Cardinality newCardinality, NotificationChain msgs)
	{
		msgs = eDynamicInverseAdd((InternalEObject)newCardinality, ServicePackage.TRANSFER_OBJECT_RELATION__CARDINALITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCardinality(Cardinality newCardinality)
	{
		eDynamicSet(ServicePackage.TRANSFER_OBJECT_RELATION__CARDINALITY, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__CARDINALITY, newCardinality);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceTypedElement getBinding()
	{
		return (ReferenceTypedElement)eDynamicGet(ServicePackage.TRANSFER_OBJECT_RELATION__BINDING, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__BINDING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceTypedElement basicGetBinding()
	{
		return (ReferenceTypedElement)eDynamicGet(ServicePackage.TRANSFER_OBJECT_RELATION__BINDING, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__BINDING, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBinding(ReferenceTypedElement newBinding)
	{
		eDynamicSet(ServicePackage.TRANSFER_OBJECT_RELATION__BINDING, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__BINDING, newBinding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceAccessor getDefaultValue()
	{
		return (ReferenceAccessor)eDynamicGet(ServicePackage.TRANSFER_OBJECT_RELATION__DEFAULT_VALUE, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__DEFAULT_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceAccessor basicGetDefaultValue()
	{
		return (ReferenceAccessor)eDynamicGet(ServicePackage.TRANSFER_OBJECT_RELATION__DEFAULT_VALUE, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__DEFAULT_VALUE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultValue(ReferenceAccessor newDefaultValue)
	{
		eDynamicSet(ServicePackage.TRANSFER_OBJECT_RELATION__DEFAULT_VALUE, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__DEFAULT_VALUE, newDefaultValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceAccessor getRange()
	{
		return (ReferenceAccessor)eDynamicGet(ServicePackage.TRANSFER_OBJECT_RELATION__RANGE, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__RANGE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceAccessor basicGetRange()
	{
		return (ReferenceAccessor)eDynamicGet(ServicePackage.TRANSFER_OBJECT_RELATION__RANGE, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__RANGE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRange(ReferenceAccessor newRange)
	{
		eDynamicSet(ServicePackage.TRANSFER_OBJECT_RELATION__RANGE, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__RANGE, newRange);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransferObjectType getTarget()
	{
		return (TransferObjectType)eDynamicGet(ServicePackage.TRANSFER_OBJECT_RELATION__TARGET, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferObjectType basicGetTarget()
	{
		return (TransferObjectType)eDynamicGet(ServicePackage.TRANSFER_OBJECT_RELATION__TARGET, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(TransferObjectType newTarget)
	{
		eDynamicSet(ServicePackage.TRANSFER_OBJECT_RELATION__TARGET, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEmbedded()
	{
		return (Boolean)eDynamicGet(ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__EMBEDDED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmbedded(boolean newEmbedded)
	{
		eDynamicSet(ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__EMBEDDED, newEmbedded);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEmbeddedCreate()
	{
		return (Boolean)eDynamicGet(ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_CREATE, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__EMBEDDED_CREATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmbeddedCreate(boolean newEmbeddedCreate)
	{
		eDynamicSet(ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_CREATE, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__EMBEDDED_CREATE, newEmbeddedCreate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEmbeddedUpdate()
	{
		return (Boolean)eDynamicGet(ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_UPDATE, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__EMBEDDED_UPDATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmbeddedUpdate(boolean newEmbeddedUpdate)
	{
		eDynamicSet(ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_UPDATE, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__EMBEDDED_UPDATE, newEmbeddedUpdate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isEmbeddedDelete()
	{
		return (Boolean)eDynamicGet(ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_DELETE, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__EMBEDDED_DELETE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmbeddedDelete(boolean newEmbeddedDelete)
	{
		eDynamicSet(ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_DELETE, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__EMBEDDED_DELETE, newEmbeddedDelete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isAccess()
	{
		return (Boolean)eDynamicGet(ServicePackage.TRANSFER_OBJECT_RELATION__ACCESS, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__ACCESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAccess(boolean newAccess)
	{
		eDynamicSet(ServicePackage.TRANSFER_OBJECT_RELATION__ACCESS, ServicePackage.Literals.TRANSFER_OBJECT_RELATION__ACCESS, newAccess);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCollection()
	{
		if (getCardinality() == null) {
		    return false;
		} else {
		    return getCardinality().getUpper() == -1 || getCardinality().getUpper() > 1;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRequired()
	{
		return getCardinality() != null && getCardinality().getLower() > 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMutable()
	{
		return (getBinding() instanceof hu.blackbelt.judo.meta.psm.data.Relation) ||
		                (getBinding() instanceof hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor) && ((hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor)getBinding()).getSetterExpression() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isNavigable()
	{
		return (eContainer() instanceof hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExposedGraph()
	{
		return ((hu.blackbelt.judo.meta.psm.service.TransferObjectType) eContainer()).isAccessPoint() && getBinding() != null;
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
			case ServicePackage.TRANSFER_OBJECT_RELATION__CARDINALITY:
				return basicSetCardinality(null, msgs);
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
			case ServicePackage.TRANSFER_OBJECT_RELATION__CARDINALITY:
				return getCardinality();
			case ServicePackage.TRANSFER_OBJECT_RELATION__BINDING:
				if (resolve) return getBinding();
				return basicGetBinding();
			case ServicePackage.TRANSFER_OBJECT_RELATION__DEFAULT_VALUE:
				if (resolve) return getDefaultValue();
				return basicGetDefaultValue();
			case ServicePackage.TRANSFER_OBJECT_RELATION__RANGE:
				if (resolve) return getRange();
				return basicGetRange();
			case ServicePackage.TRANSFER_OBJECT_RELATION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED:
				return isEmbedded();
			case ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_CREATE:
				return isEmbeddedCreate();
			case ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_UPDATE:
				return isEmbeddedUpdate();
			case ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_DELETE:
				return isEmbeddedDelete();
			case ServicePackage.TRANSFER_OBJECT_RELATION__ACCESS:
				return isAccess();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case ServicePackage.TRANSFER_OBJECT_RELATION__CARDINALITY:
				setCardinality((Cardinality)newValue);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__BINDING:
				setBinding((ReferenceTypedElement)newValue);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__DEFAULT_VALUE:
				setDefaultValue((ReferenceAccessor)newValue);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__RANGE:
				setRange((ReferenceAccessor)newValue);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__TARGET:
				setTarget((TransferObjectType)newValue);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED:
				setEmbedded((Boolean)newValue);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_CREATE:
				setEmbeddedCreate((Boolean)newValue);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_UPDATE:
				setEmbeddedUpdate((Boolean)newValue);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_DELETE:
				setEmbeddedDelete((Boolean)newValue);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__ACCESS:
				setAccess((Boolean)newValue);
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
			case ServicePackage.TRANSFER_OBJECT_RELATION__CARDINALITY:
				setCardinality((Cardinality)null);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__BINDING:
				setBinding((ReferenceTypedElement)null);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__DEFAULT_VALUE:
				setDefaultValue((ReferenceAccessor)null);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__RANGE:
				setRange((ReferenceAccessor)null);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__TARGET:
				setTarget((TransferObjectType)null);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED:
				setEmbedded(EMBEDDED_EDEFAULT);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_CREATE:
				setEmbeddedCreate(EMBEDDED_CREATE_EDEFAULT);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_UPDATE:
				setEmbeddedUpdate(EMBEDDED_UPDATE_EDEFAULT);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_DELETE:
				setEmbeddedDelete(EMBEDDED_DELETE_EDEFAULT);
				return;
			case ServicePackage.TRANSFER_OBJECT_RELATION__ACCESS:
				setAccess(ACCESS_EDEFAULT);
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
			case ServicePackage.TRANSFER_OBJECT_RELATION__CARDINALITY:
				return getCardinality() != null;
			case ServicePackage.TRANSFER_OBJECT_RELATION__BINDING:
				return basicGetBinding() != null;
			case ServicePackage.TRANSFER_OBJECT_RELATION__DEFAULT_VALUE:
				return basicGetDefaultValue() != null;
			case ServicePackage.TRANSFER_OBJECT_RELATION__RANGE:
				return basicGetRange() != null;
			case ServicePackage.TRANSFER_OBJECT_RELATION__TARGET:
				return basicGetTarget() != null;
			case ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED:
				return isEmbedded() != EMBEDDED_EDEFAULT;
			case ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_CREATE:
				return isEmbeddedCreate() != EMBEDDED_CREATE_EDEFAULT;
			case ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_UPDATE:
				return isEmbeddedUpdate() != EMBEDDED_UPDATE_EDEFAULT;
			case ServicePackage.TRANSFER_OBJECT_RELATION__EMBEDDED_DELETE:
				return isEmbeddedDelete() != EMBEDDED_DELETE_EDEFAULT;
			case ServicePackage.TRANSFER_OBJECT_RELATION__ACCESS:
				return isAccess() != ACCESS_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
			case ServicePackage.TRANSFER_OBJECT_RELATION___IS_COLLECTION:
				return isCollection();
			case ServicePackage.TRANSFER_OBJECT_RELATION___IS_REQUIRED:
				return isRequired();
			case ServicePackage.TRANSFER_OBJECT_RELATION___IS_MUTABLE:
				return isMutable();
			case ServicePackage.TRANSFER_OBJECT_RELATION___IS_NAVIGABLE:
				return isNavigable();
			case ServicePackage.TRANSFER_OBJECT_RELATION___IS_EXPOSED_GRAPH:
				return isExposedGraph();
		}
		return super.eInvoke(operationID, arguments);
	}

} //TransferObjectRelationImpl
