/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.EntitySequence;
import hu.blackbelt.judo.meta.psm.data.Sequence;

import hu.blackbelt.judo.meta.psm.namespace.Annotation;
import hu.blackbelt.judo.meta.psm.namespace.NamedElement;
import hu.blackbelt.judo.meta.psm.namespace.NamespacePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntitySequenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntitySequenceImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntitySequenceImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntitySequenceImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntitySequenceImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntitySequenceImpl#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EntitySequenceImpl#isCyclic <em>Cyclic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntitySequenceImpl extends MinimalEObjectImpl.Container implements EntitySequence
{
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
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialValue()
	 * @generated
	 * @ordered
	 */
	protected static final long INITIAL_VALUE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #getIncrement() <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final long INCREMENT_EDEFAULT = 1L;

	/**
	 * The default value of the '{@link #getMaximumValue() <em>Maximum Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumValue()
	 * @generated
	 * @ordered
	 */
	protected static final long MAXIMUM_VALUE_EDEFAULT = 0L;

	/**
	 * The default value of the '{@link #isCyclic() <em>Cyclic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCyclic()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CYCLIC_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntitySequenceImpl()
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
		return DataPackage.Literals.ENTITY_SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount()
	{
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName()
	{
		return (String)eDynamicGet(DataPackage.ENTITY_SEQUENCE__NAME, NamespacePackage.Literals.NAMED_ELEMENT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName)
	{
		eDynamicSet(DataPackage.ENTITY_SEQUENCE__NAME, NamespacePackage.Literals.NAMED_ELEMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentation()
	{
		return (String)eDynamicGet(DataPackage.ENTITY_SEQUENCE__DOCUMENTATION, NamespacePackage.Literals.NAMED_ELEMENT__DOCUMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentation(String newDocumentation)
	{
		eDynamicSet(DataPackage.ENTITY_SEQUENCE__DOCUMENTATION, NamespacePackage.Literals.NAMED_ELEMENT__DOCUMENTATION, newDocumentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Annotation> getAnnotations()
	{
		return (EList<Annotation>)eDynamicGet(DataPackage.ENTITY_SEQUENCE__ANNOTATIONS, NamespacePackage.Literals.NAMED_ELEMENT__ANNOTATIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getInitialValue()
	{
		return (Long)eDynamicGet(DataPackage.ENTITY_SEQUENCE__INITIAL_VALUE, DataPackage.Literals.SEQUENCE__INITIAL_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialValue(long newInitialValue)
	{
		eDynamicSet(DataPackage.ENTITY_SEQUENCE__INITIAL_VALUE, DataPackage.Literals.SEQUENCE__INITIAL_VALUE, newInitialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getIncrement()
	{
		return (Long)eDynamicGet(DataPackage.ENTITY_SEQUENCE__INCREMENT, DataPackage.Literals.SEQUENCE__INCREMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncrement(long newIncrement)
	{
		eDynamicSet(DataPackage.ENTITY_SEQUENCE__INCREMENT, DataPackage.Literals.SEQUENCE__INCREMENT, newIncrement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaximumValue()
	{
		return (Long)eDynamicGet(DataPackage.ENTITY_SEQUENCE__MAXIMUM_VALUE, DataPackage.Literals.SEQUENCE__MAXIMUM_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumValue(long newMaximumValue)
	{
		eDynamicSet(DataPackage.ENTITY_SEQUENCE__MAXIMUM_VALUE, DataPackage.Literals.SEQUENCE__MAXIMUM_VALUE, newMaximumValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCyclic()
	{
		return (Boolean)eDynamicGet(DataPackage.ENTITY_SEQUENCE__CYCLIC, DataPackage.Literals.SEQUENCE__CYCLIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCyclic(boolean newCyclic)
	{
		eDynamicSet(DataPackage.ENTITY_SEQUENCE__CYCLIC, DataPackage.Literals.SEQUENCE__CYCLIC, newCyclic);
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
			case DataPackage.ENTITY_SEQUENCE__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
			case DataPackage.ENTITY_SEQUENCE__NAME:
				return getName();
			case DataPackage.ENTITY_SEQUENCE__DOCUMENTATION:
				return getDocumentation();
			case DataPackage.ENTITY_SEQUENCE__ANNOTATIONS:
				return getAnnotations();
			case DataPackage.ENTITY_SEQUENCE__INITIAL_VALUE:
				return getInitialValue();
			case DataPackage.ENTITY_SEQUENCE__INCREMENT:
				return getIncrement();
			case DataPackage.ENTITY_SEQUENCE__MAXIMUM_VALUE:
				return getMaximumValue();
			case DataPackage.ENTITY_SEQUENCE__CYCLIC:
				return isCyclic();
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
			case DataPackage.ENTITY_SEQUENCE__NAME:
				setName((String)newValue);
				return;
			case DataPackage.ENTITY_SEQUENCE__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case DataPackage.ENTITY_SEQUENCE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case DataPackage.ENTITY_SEQUENCE__INITIAL_VALUE:
				setInitialValue((Long)newValue);
				return;
			case DataPackage.ENTITY_SEQUENCE__INCREMENT:
				setIncrement((Long)newValue);
				return;
			case DataPackage.ENTITY_SEQUENCE__MAXIMUM_VALUE:
				setMaximumValue((Long)newValue);
				return;
			case DataPackage.ENTITY_SEQUENCE__CYCLIC:
				setCyclic((Boolean)newValue);
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
			case DataPackage.ENTITY_SEQUENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case DataPackage.ENTITY_SEQUENCE__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case DataPackage.ENTITY_SEQUENCE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case DataPackage.ENTITY_SEQUENCE__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
			case DataPackage.ENTITY_SEQUENCE__INCREMENT:
				setIncrement(INCREMENT_EDEFAULT);
				return;
			case DataPackage.ENTITY_SEQUENCE__MAXIMUM_VALUE:
				setMaximumValue(MAXIMUM_VALUE_EDEFAULT);
				return;
			case DataPackage.ENTITY_SEQUENCE__CYCLIC:
				setCyclic(CYCLIC_EDEFAULT);
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
			case DataPackage.ENTITY_SEQUENCE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case DataPackage.ENTITY_SEQUENCE__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? getDocumentation() != null : !DOCUMENTATION_EDEFAULT.equals(getDocumentation());
			case DataPackage.ENTITY_SEQUENCE__ANNOTATIONS:
				return !getAnnotations().isEmpty();
			case DataPackage.ENTITY_SEQUENCE__INITIAL_VALUE:
				return getInitialValue() != INITIAL_VALUE_EDEFAULT;
			case DataPackage.ENTITY_SEQUENCE__INCREMENT:
				return getIncrement() != INCREMENT_EDEFAULT;
			case DataPackage.ENTITY_SEQUENCE__MAXIMUM_VALUE:
				return getMaximumValue() != MAXIMUM_VALUE_EDEFAULT;
			case DataPackage.ENTITY_SEQUENCE__CYCLIC:
				return isCyclic() != CYCLIC_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
	{
		if (baseClass == NamedElement.class)
		{
			switch (derivedFeatureID)
			{
				case DataPackage.ENTITY_SEQUENCE__NAME: return NamespacePackage.NAMED_ELEMENT__NAME;
				case DataPackage.ENTITY_SEQUENCE__DOCUMENTATION: return NamespacePackage.NAMED_ELEMENT__DOCUMENTATION;
				case DataPackage.ENTITY_SEQUENCE__ANNOTATIONS: return NamespacePackage.NAMED_ELEMENT__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == Sequence.class)
		{
			switch (derivedFeatureID)
			{
				case DataPackage.ENTITY_SEQUENCE__INITIAL_VALUE: return DataPackage.SEQUENCE__INITIAL_VALUE;
				case DataPackage.ENTITY_SEQUENCE__INCREMENT: return DataPackage.SEQUENCE__INCREMENT;
				case DataPackage.ENTITY_SEQUENCE__MAXIMUM_VALUE: return DataPackage.SEQUENCE__MAXIMUM_VALUE;
				case DataPackage.ENTITY_SEQUENCE__CYCLIC: return DataPackage.SEQUENCE__CYCLIC;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
	{
		if (baseClass == NamedElement.class)
		{
			switch (baseFeatureID)
			{
				case NamespacePackage.NAMED_ELEMENT__NAME: return DataPackage.ENTITY_SEQUENCE__NAME;
				case NamespacePackage.NAMED_ELEMENT__DOCUMENTATION: return DataPackage.ENTITY_SEQUENCE__DOCUMENTATION;
				case NamespacePackage.NAMED_ELEMENT__ANNOTATIONS: return DataPackage.ENTITY_SEQUENCE__ANNOTATIONS;
				default: return -1;
			}
		}
		if (baseClass == Sequence.class)
		{
			switch (baseFeatureID)
			{
				case DataPackage.SEQUENCE__INITIAL_VALUE: return DataPackage.ENTITY_SEQUENCE__INITIAL_VALUE;
				case DataPackage.SEQUENCE__INCREMENT: return DataPackage.ENTITY_SEQUENCE__INCREMENT;
				case DataPackage.SEQUENCE__MAXIMUM_VALUE: return DataPackage.ENTITY_SEQUENCE__MAXIMUM_VALUE;
				case DataPackage.SEQUENCE__CYCLIC: return DataPackage.ENTITY_SEQUENCE__CYCLIC;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EntitySequenceImpl
