/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.OperationBody;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.OperationBodyImpl#isStateful <em>Stateful</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.OperationBodyImpl#isCustomImplementation <em>Custom Implementation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.OperationBodyImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationBodyImpl extends MinimalEObjectImpl.Container implements OperationBody
{
	/**
	 * The default value of the '{@link #isStateful() <em>Stateful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStateful()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATEFUL_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isCustomImplementation() <em>Custom Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCustomImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CUSTOM_IMPLEMENTATION_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationBodyImpl()
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
		return DataPackage.Literals.OPERATION_BODY;
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
	public boolean isStateful()
	{
		return (Boolean)eDynamicGet(DataPackage.OPERATION_BODY__STATEFUL, DataPackage.Literals.OPERATION_BODY__STATEFUL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateful(boolean newStateful)
	{
		eDynamicSet(DataPackage.OPERATION_BODY__STATEFUL, DataPackage.Literals.OPERATION_BODY__STATEFUL, newStateful);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCustomImplementation()
	{
		return (Boolean)eDynamicGet(DataPackage.OPERATION_BODY__CUSTOM_IMPLEMENTATION, DataPackage.Literals.OPERATION_BODY__CUSTOM_IMPLEMENTATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomImplementation(boolean newCustomImplementation)
	{
		eDynamicSet(DataPackage.OPERATION_BODY__CUSTOM_IMPLEMENTATION, DataPackage.Literals.OPERATION_BODY__CUSTOM_IMPLEMENTATION, newCustomImplementation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBody()
	{
		return (String)eDynamicGet(DataPackage.OPERATION_BODY__BODY, DataPackage.Literals.OPERATION_BODY__BODY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBody(String newBody)
	{
		eDynamicSet(DataPackage.OPERATION_BODY__BODY, DataPackage.Literals.OPERATION_BODY__BODY, newBody);
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
			case DataPackage.OPERATION_BODY__STATEFUL:
				return isStateful();
			case DataPackage.OPERATION_BODY__CUSTOM_IMPLEMENTATION:
				return isCustomImplementation();
			case DataPackage.OPERATION_BODY__BODY:
				return getBody();
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
			case DataPackage.OPERATION_BODY__STATEFUL:
				setStateful((Boolean)newValue);
				return;
			case DataPackage.OPERATION_BODY__CUSTOM_IMPLEMENTATION:
				setCustomImplementation((Boolean)newValue);
				return;
			case DataPackage.OPERATION_BODY__BODY:
				setBody((String)newValue);
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
			case DataPackage.OPERATION_BODY__STATEFUL:
				setStateful(STATEFUL_EDEFAULT);
				return;
			case DataPackage.OPERATION_BODY__CUSTOM_IMPLEMENTATION:
				setCustomImplementation(CUSTOM_IMPLEMENTATION_EDEFAULT);
				return;
			case DataPackage.OPERATION_BODY__BODY:
				setBody(BODY_EDEFAULT);
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
			case DataPackage.OPERATION_BODY__STATEFUL:
				return isStateful() != STATEFUL_EDEFAULT;
			case DataPackage.OPERATION_BODY__CUSTOM_IMPLEMENTATION:
				return isCustomImplementation() != CUSTOM_IMPLEMENTATION_EDEFAULT;
			case DataPackage.OPERATION_BODY__BODY:
				return BODY_EDEFAULT == null ? getBody() != null : !BODY_EDEFAULT.equals(getBody());
		}
		return super.eIsSet(featureID);
	}

} //OperationBodyImpl
