/**
 */
package hu.blackbelt.judo.meta.psm.service.impl;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import hu.blackbelt.judo.meta.psm.service.Operation;
import hu.blackbelt.judo.meta.psm.service.ServicePackage;
import hu.blackbelt.judo.meta.psm.service.TransferObjectType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.OperationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.OperationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.OperationImpl#getFaults <em>Faults</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.service.impl.OperationImpl#isUndefined <em>Undefined</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OperationImpl extends NamedElementImpl implements Operation {
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
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected TransferObjectType output;

	/**
	 * The cached value of the '{@link #getFaults() <em>Faults</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaults()
	 * @generated
	 * @ordered
	 */
	protected EList<TransferObjectType> faults;

	/**
	 * The default value of the '{@link #isUndefined() <em>Undefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUndefined()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNDEFINED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUndefined() <em>Undefined</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUndefined()
	 * @generated
	 * @ordered
	 */
	protected boolean undefined = UNDEFINED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.OPERATION__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferObjectType getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject)output;
			output = (TransferObjectType)eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.OPERATION__OUTPUT, oldOutput, output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferObjectType basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(TransferObjectType newOutput) {
		TransferObjectType oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.OPERATION__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransferObjectType> getFaults() {
		if (faults == null) {
			faults = new EObjectResolvingEList<TransferObjectType>(TransferObjectType.class, this, ServicePackage.OPERATION__FAULTS);
		}
		return faults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUndefined() {
		return undefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUndefined(boolean newUndefined) {
		boolean oldUndefined = undefined;
		undefined = newUndefined;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.OPERATION__UNDEFINED, oldUndefined, undefined));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.OPERATION__BODY:
				return getBody();
			case ServicePackage.OPERATION__OUTPUT:
				if (resolve) return getOutput();
				return basicGetOutput();
			case ServicePackage.OPERATION__FAULTS:
				return getFaults();
			case ServicePackage.OPERATION__UNDEFINED:
				return isUndefined();
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
			case ServicePackage.OPERATION__BODY:
				setBody((String)newValue);
				return;
			case ServicePackage.OPERATION__OUTPUT:
				setOutput((TransferObjectType)newValue);
				return;
			case ServicePackage.OPERATION__FAULTS:
				getFaults().clear();
				getFaults().addAll((Collection<? extends TransferObjectType>)newValue);
				return;
			case ServicePackage.OPERATION__UNDEFINED:
				setUndefined((Boolean)newValue);
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
			case ServicePackage.OPERATION__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case ServicePackage.OPERATION__OUTPUT:
				setOutput((TransferObjectType)null);
				return;
			case ServicePackage.OPERATION__FAULTS:
				getFaults().clear();
				return;
			case ServicePackage.OPERATION__UNDEFINED:
				setUndefined(UNDEFINED_EDEFAULT);
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
			case ServicePackage.OPERATION__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case ServicePackage.OPERATION__OUTPUT:
				return output != null;
			case ServicePackage.OPERATION__FAULTS:
				return faults != null && !faults.isEmpty();
			case ServicePackage.OPERATION__UNDEFINED:
				return undefined != UNDEFINED_EDEFAULT;
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
		result.append(" (body: ");
		result.append(body);
		result.append(", undefined: ");
		result.append(undefined);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
