/**
 */
package hu.blackbelt.judo.meta.psm.facade.impl;

import hu.blackbelt.judo.meta.psm.facade.Action;
import hu.blackbelt.judo.meta.psm.facade.FacadePackage;
import hu.blackbelt.judo.meta.psm.facade.View;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.ActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.ActionImpl#getBody <em>Body</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.ActionImpl#isList <em>List</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.facade.impl.ActionImpl#isExternal <em>External</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends FacadeImpl implements Action {
    /**
     * The cached value of the '{@link #getResult() <em>Result</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResult()
     * @generated
     * @ordered
     */
    protected View result;

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
     * The default value of the '{@link #isList() <em>List</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isList()
     * @generated
     * @ordered
     */
    protected static final boolean LIST_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isList() <em>List</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isList()
     * @generated
     * @ordered
     */
    protected boolean list = LIST_EDEFAULT;

    /**
     * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExternal()
     * @generated
     * @ordered
     */
    protected static final boolean EXTERNAL_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isExternal() <em>External</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExternal()
     * @generated
     * @ordered
     */
    protected boolean external = EXTERNAL_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ActionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return FacadePackage.Literals.ACTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public View getResult() {
        if (result != null && result.eIsProxy()) {
            InternalEObject oldResult = (InternalEObject)result;
            result = (View)eResolveProxy(oldResult);
            if (result != oldResult) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, FacadePackage.ACTION__RESULT, oldResult, result));
            }
        }
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public View basicGetResult() {
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResult(View newResult) {
        View oldResult = result;
        result = newResult;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.ACTION__RESULT, oldResult, result));
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
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.ACTION__BODY, oldBody, body));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isList() {
        return list;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setList(boolean newList) {
        boolean oldList = list;
        list = newList;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.ACTION__LIST, oldList, list));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isExternal() {
        return external;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExternal(boolean newExternal) {
        boolean oldExternal = external;
        external = newExternal;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, FacadePackage.ACTION__EXTERNAL, oldExternal, external));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case FacadePackage.ACTION__RESULT:
                if (resolve) return getResult();
                return basicGetResult();
            case FacadePackage.ACTION__BODY:
                return getBody();
            case FacadePackage.ACTION__LIST:
                return isList();
            case FacadePackage.ACTION__EXTERNAL:
                return isExternal();
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
            case FacadePackage.ACTION__RESULT:
                setResult((View)newValue);
                return;
            case FacadePackage.ACTION__BODY:
                setBody((String)newValue);
                return;
            case FacadePackage.ACTION__LIST:
                setList((Boolean)newValue);
                return;
            case FacadePackage.ACTION__EXTERNAL:
                setExternal((Boolean)newValue);
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
            case FacadePackage.ACTION__RESULT:
                setResult((View)null);
                return;
            case FacadePackage.ACTION__BODY:
                setBody(BODY_EDEFAULT);
                return;
            case FacadePackage.ACTION__LIST:
                setList(LIST_EDEFAULT);
                return;
            case FacadePackage.ACTION__EXTERNAL:
                setExternal(EXTERNAL_EDEFAULT);
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
            case FacadePackage.ACTION__RESULT:
                return result != null;
            case FacadePackage.ACTION__BODY:
                return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
            case FacadePackage.ACTION__LIST:
                return list != LIST_EDEFAULT;
            case FacadePackage.ACTION__EXTERNAL:
                return external != EXTERNAL_EDEFAULT;
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
        result.append(", list: ");
        result.append(list);
        result.append(", external: ");
        result.append(external);
        result.append(')');
        return result.toString();
    }

} //ActionImpl
