/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.DefaultUpdateOperation;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Update Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.DefaultUpdateOperationImpl#getPreUpdateOperation <em>Pre Update Operation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.DefaultUpdateOperationImpl#getPostUpdateOperation <em>Post Update Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultUpdateOperationImpl extends UpdateOperationImpl implements DefaultUpdateOperation {
    /**
     * The default value of the '{@link #getPreUpdateOperation() <em>Pre Update Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreUpdateOperation()
     * @generated
     * @ordered
     */
    protected static final String PRE_UPDATE_OPERATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPreUpdateOperation() <em>Pre Update Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreUpdateOperation()
     * @generated
     * @ordered
     */
    protected String preUpdateOperation = PRE_UPDATE_OPERATION_EDEFAULT;

    /**
     * The default value of the '{@link #getPostUpdateOperation() <em>Post Update Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostUpdateOperation()
     * @generated
     * @ordered
     */
    protected static final String POST_UPDATE_OPERATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPostUpdateOperation() <em>Post Update Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostUpdateOperation()
     * @generated
     * @ordered
     */
    protected String postUpdateOperation = POST_UPDATE_OPERATION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DefaultUpdateOperationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.DEFAULT_UPDATE_OPERATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPreUpdateOperation() {
        return preUpdateOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreUpdateOperation(String newPreUpdateOperation) {
        String oldPreUpdateOperation = preUpdateOperation;
        preUpdateOperation = newPreUpdateOperation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.DEFAULT_UPDATE_OPERATION__PRE_UPDATE_OPERATION, oldPreUpdateOperation, preUpdateOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPostUpdateOperation() {
        return postUpdateOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPostUpdateOperation(String newPostUpdateOperation) {
        String oldPostUpdateOperation = postUpdateOperation;
        postUpdateOperation = newPostUpdateOperation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.DEFAULT_UPDATE_OPERATION__POST_UPDATE_OPERATION, oldPostUpdateOperation, postUpdateOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.DEFAULT_UPDATE_OPERATION__PRE_UPDATE_OPERATION:
                return getPreUpdateOperation();
            case FacadePackage.DEFAULT_UPDATE_OPERATION__POST_UPDATE_OPERATION:
                return getPostUpdateOperation();
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
            case FacadePackage.DEFAULT_UPDATE_OPERATION__PRE_UPDATE_OPERATION:
                setPreUpdateOperation((String)newValue);
                return;
            case FacadePackage.DEFAULT_UPDATE_OPERATION__POST_UPDATE_OPERATION:
                setPostUpdateOperation((String)newValue);
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
            case FacadePackage.DEFAULT_UPDATE_OPERATION__PRE_UPDATE_OPERATION:
                setPreUpdateOperation(PRE_UPDATE_OPERATION_EDEFAULT);
                return;
            case FacadePackage.DEFAULT_UPDATE_OPERATION__POST_UPDATE_OPERATION:
                setPostUpdateOperation(POST_UPDATE_OPERATION_EDEFAULT);
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
            case FacadePackage.DEFAULT_UPDATE_OPERATION__PRE_UPDATE_OPERATION:
                return PRE_UPDATE_OPERATION_EDEFAULT == null ? preUpdateOperation != null : !PRE_UPDATE_OPERATION_EDEFAULT.equals(preUpdateOperation);
            case FacadePackage.DEFAULT_UPDATE_OPERATION__POST_UPDATE_OPERATION:
                return POST_UPDATE_OPERATION_EDEFAULT == null ? postUpdateOperation != null : !POST_UPDATE_OPERATION_EDEFAULT.equals(postUpdateOperation);
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
        result.append(" (preUpdateOperation: ");
        result.append(preUpdateOperation);
        result.append(", postUpdateOperation: ");
        result.append(postUpdateOperation);
        result.append(')');
        return result.toString();
    }

} //DefaultUpdateOperationImpl
