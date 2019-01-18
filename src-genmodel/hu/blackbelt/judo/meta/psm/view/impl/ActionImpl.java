/**
 */
package hu.blackbelt.judo.meta.psm.view.impl;

import hu.blackbelt.judo.meta.psm.service.Operation;

import hu.blackbelt.judo.meta.psm.view.Action;
import hu.blackbelt.judo.meta.psm.view.ObjectView;
import hu.blackbelt.judo.meta.psm.view.Placeholder;
import hu.blackbelt.judo.meta.psm.view.ViewPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.ActionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.ActionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.ActionImpl#getResultView <em>Result View</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.view.impl.ActionImpl#getFaultViews <em>Fault Views</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends ComponentImpl implements Action {
    /**
     * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTarget()
     * @generated
     * @ordered
     */
    protected Placeholder target;

    /**
     * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperation()
     * @generated
     * @ordered
     */
    protected Operation operation;

    /**
     * The cached value of the '{@link #getResultView() <em>Result View</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResultView()
     * @generated
     * @ordered
     */
    protected ObjectView resultView;

    /**
     * The cached value of the '{@link #getFaultViews() <em>Fault Views</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFaultViews()
     * @generated
     * @ordered
     */
    protected EList<ObjectView> faultViews;

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
        return ViewPackage.Literals.ACTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Placeholder getTarget() {
        if (target != null && target.eIsProxy()) {
            InternalEObject oldTarget = (InternalEObject)target;
            target = (Placeholder)eResolveProxy(oldTarget);
            if (target != oldTarget) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewPackage.ACTION__TARGET, oldTarget, target));
            }
        }
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Placeholder basicGetTarget() {
        return target;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTarget(Placeholder newTarget) {
        Placeholder oldTarget = target;
        target = newTarget;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.ACTION__TARGET, oldTarget, target));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation getOperation() {
        if (operation != null && operation.eIsProxy()) {
            InternalEObject oldOperation = (InternalEObject)operation;
            operation = (Operation)eResolveProxy(oldOperation);
            if (operation != oldOperation) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewPackage.ACTION__OPERATION, oldOperation, operation));
            }
        }
        return operation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Operation basicGetOperation() {
        return operation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOperation(Operation newOperation) {
        Operation oldOperation = operation;
        operation = newOperation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.ACTION__OPERATION, oldOperation, operation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectView getResultView() {
        if (resultView != null && resultView.eIsProxy()) {
            InternalEObject oldResultView = (InternalEObject)resultView;
            resultView = (ObjectView)eResolveProxy(oldResultView);
            if (resultView != oldResultView) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, ViewPackage.ACTION__RESULT_VIEW, oldResultView, resultView));
            }
        }
        return resultView;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ObjectView basicGetResultView() {
        return resultView;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setResultView(ObjectView newResultView) {
        ObjectView oldResultView = resultView;
        resultView = newResultView;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ViewPackage.ACTION__RESULT_VIEW, oldResultView, resultView));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ObjectView> getFaultViews() {
        if (faultViews == null) {
            faultViews = new EObjectResolvingEList<ObjectView>(ObjectView.class, this, ViewPackage.ACTION__FAULT_VIEWS);
        }
        return faultViews;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case ViewPackage.ACTION__TARGET:
                if (resolve) return getTarget();
                return basicGetTarget();
            case ViewPackage.ACTION__OPERATION:
                if (resolve) return getOperation();
                return basicGetOperation();
            case ViewPackage.ACTION__RESULT_VIEW:
                if (resolve) return getResultView();
                return basicGetResultView();
            case ViewPackage.ACTION__FAULT_VIEWS:
                return getFaultViews();
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
            case ViewPackage.ACTION__TARGET:
                setTarget((Placeholder)newValue);
                return;
            case ViewPackage.ACTION__OPERATION:
                setOperation((Operation)newValue);
                return;
            case ViewPackage.ACTION__RESULT_VIEW:
                setResultView((ObjectView)newValue);
                return;
            case ViewPackage.ACTION__FAULT_VIEWS:
                getFaultViews().clear();
                getFaultViews().addAll((Collection<? extends ObjectView>)newValue);
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
            case ViewPackage.ACTION__TARGET:
                setTarget((Placeholder)null);
                return;
            case ViewPackage.ACTION__OPERATION:
                setOperation((Operation)null);
                return;
            case ViewPackage.ACTION__RESULT_VIEW:
                setResultView((ObjectView)null);
                return;
            case ViewPackage.ACTION__FAULT_VIEWS:
                getFaultViews().clear();
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
            case ViewPackage.ACTION__TARGET:
                return target != null;
            case ViewPackage.ACTION__OPERATION:
                return operation != null;
            case ViewPackage.ACTION__RESULT_VIEW:
                return resultView != null;
            case ViewPackage.ACTION__FAULT_VIEWS:
                return faultViews != null && !faultViews.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ActionImpl
