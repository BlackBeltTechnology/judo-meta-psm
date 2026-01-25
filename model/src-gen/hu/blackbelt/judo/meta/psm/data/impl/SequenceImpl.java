/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.Sequence;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.SequenceImpl#getInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.SequenceImpl#getIncrement <em>Increment</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.SequenceImpl#getMaximumValue <em>Maximum Value</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.SequenceImpl#isCyclic <em>Cyclic</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SequenceImpl extends NamedElementImpl implements Sequence
{
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
	protected SequenceImpl()
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
		return DataPackage.Literals.SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getInitialValue()
	{
		return (Long)eDynamicGet(DataPackage.SEQUENCE__INITIAL_VALUE, DataPackage.Literals.SEQUENCE__INITIAL_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitialValue(long newInitialValue)
	{
		eDynamicSet(DataPackage.SEQUENCE__INITIAL_VALUE, DataPackage.Literals.SEQUENCE__INITIAL_VALUE, newInitialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getIncrement()
	{
		return (Long)eDynamicGet(DataPackage.SEQUENCE__INCREMENT, DataPackage.Literals.SEQUENCE__INCREMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncrement(long newIncrement)
	{
		eDynamicSet(DataPackage.SEQUENCE__INCREMENT, DataPackage.Literals.SEQUENCE__INCREMENT, newIncrement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public long getMaximumValue()
	{
		return (Long)eDynamicGet(DataPackage.SEQUENCE__MAXIMUM_VALUE, DataPackage.Literals.SEQUENCE__MAXIMUM_VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumValue(long newMaximumValue)
	{
		eDynamicSet(DataPackage.SEQUENCE__MAXIMUM_VALUE, DataPackage.Literals.SEQUENCE__MAXIMUM_VALUE, newMaximumValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCyclic()
	{
		return (Boolean)eDynamicGet(DataPackage.SEQUENCE__CYCLIC, DataPackage.Literals.SEQUENCE__CYCLIC, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCyclic(boolean newCyclic)
	{
		eDynamicSet(DataPackage.SEQUENCE__CYCLIC, DataPackage.Literals.SEQUENCE__CYCLIC, newCyclic);
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
			case DataPackage.SEQUENCE__INITIAL_VALUE:
				return getInitialValue();
			case DataPackage.SEQUENCE__INCREMENT:
				return getIncrement();
			case DataPackage.SEQUENCE__MAXIMUM_VALUE:
				return getMaximumValue();
			case DataPackage.SEQUENCE__CYCLIC:
				return isCyclic();
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
			case DataPackage.SEQUENCE__INITIAL_VALUE:
				setInitialValue((Long)newValue);
				return;
			case DataPackage.SEQUENCE__INCREMENT:
				setIncrement((Long)newValue);
				return;
			case DataPackage.SEQUENCE__MAXIMUM_VALUE:
				setMaximumValue((Long)newValue);
				return;
			case DataPackage.SEQUENCE__CYCLIC:
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
			case DataPackage.SEQUENCE__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
			case DataPackage.SEQUENCE__INCREMENT:
				setIncrement(INCREMENT_EDEFAULT);
				return;
			case DataPackage.SEQUENCE__MAXIMUM_VALUE:
				setMaximumValue(MAXIMUM_VALUE_EDEFAULT);
				return;
			case DataPackage.SEQUENCE__CYCLIC:
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
			case DataPackage.SEQUENCE__INITIAL_VALUE:
				return getInitialValue() != INITIAL_VALUE_EDEFAULT;
			case DataPackage.SEQUENCE__INCREMENT:
				return getIncrement() != INCREMENT_EDEFAULT;
			case DataPackage.SEQUENCE__MAXIMUM_VALUE:
				return getMaximumValue() != MAXIMUM_VALUE_EDEFAULT;
			case DataPackage.SEQUENCE__CYCLIC:
				return isCyclic() != CYCLIC_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //SequenceImpl
