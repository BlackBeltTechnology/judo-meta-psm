/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.DefaultCreateOperation;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Create Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.DefaultCreateOperationImpl#getPreCreateOperation <em>Pre Create Operation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.DefaultCreateOperationImpl#getPostCreateOperation <em>Post Create Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultCreateOperationImpl extends CreateOperationImpl implements DefaultCreateOperation {
    /**
     * The default value of the '{@link #getPreCreateOperation() <em>Pre Create Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreCreateOperation()
     * @generated
     * @ordered
     */
    protected static final String PRE_CREATE_OPERATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPreCreateOperation() <em>Pre Create Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPreCreateOperation()
     * @generated
     * @ordered
     */
    protected String preCreateOperation = PRE_CREATE_OPERATION_EDEFAULT;

    /**
     * The default value of the '{@link #getPostCreateOperation() <em>Post Create Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostCreateOperation()
     * @generated
     * @ordered
     */
    protected static final String POST_CREATE_OPERATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPostCreateOperation() <em>Post Create Operation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPostCreateOperation()
     * @generated
     * @ordered
     */
    protected String postCreateOperation = POST_CREATE_OPERATION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DefaultCreateOperationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.DEFAULT_CREATE_OPERATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPreCreateOperation() {
        return preCreateOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPreCreateOperation(String newPreCreateOperation) {
        String oldPreCreateOperation = preCreateOperation;
        preCreateOperation = newPreCreateOperation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.DEFAULT_CREATE_OPERATION__PRE_CREATE_OPERATION, oldPreCreateOperation, preCreateOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getPostCreateOperation() {
        return postCreateOperation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPostCreateOperation(String newPostCreateOperation) {
        String oldPostCreateOperation = postCreateOperation;
        postCreateOperation = newPostCreateOperation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.DEFAULT_CREATE_OPERATION__POST_CREATE_OPERATION, oldPostCreateOperation, postCreateOperation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.DEFAULT_CREATE_OPERATION__PRE_CREATE_OPERATION:
                return getPreCreateOperation();
            case FacadePackage.DEFAULT_CREATE_OPERATION__POST_CREATE_OPERATION:
                return getPostCreateOperation();
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
            case FacadePackage.DEFAULT_CREATE_OPERATION__PRE_CREATE_OPERATION:
                setPreCreateOperation((String)newValue);
                return;
            case FacadePackage.DEFAULT_CREATE_OPERATION__POST_CREATE_OPERATION:
                setPostCreateOperation((String)newValue);
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
            case FacadePackage.DEFAULT_CREATE_OPERATION__PRE_CREATE_OPERATION:
                setPreCreateOperation(PRE_CREATE_OPERATION_EDEFAULT);
                return;
            case FacadePackage.DEFAULT_CREATE_OPERATION__POST_CREATE_OPERATION:
                setPostCreateOperation(POST_CREATE_OPERATION_EDEFAULT);
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
            case FacadePackage.DEFAULT_CREATE_OPERATION__PRE_CREATE_OPERATION:
                return PRE_CREATE_OPERATION_EDEFAULT == null ? preCreateOperation != null : !PRE_CREATE_OPERATION_EDEFAULT.equals(preCreateOperation);
            case FacadePackage.DEFAULT_CREATE_OPERATION__POST_CREATE_OPERATION:
                return POST_CREATE_OPERATION_EDEFAULT == null ? postCreateOperation != null : !POST_CREATE_OPERATION_EDEFAULT.equals(postCreateOperation);
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
        result.append(" (preCreateOperation: ");
        result.append(preCreateOperation);
        result.append(", postCreateOperation: ");
        result.append(postCreateOperation);
        result.append(')');
        return result.toString();
    }

} //DefaultCreateOperationImpl
