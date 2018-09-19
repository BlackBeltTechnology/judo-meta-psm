/**
 */
package hu.blackbelt.judo.meta.psm.data.impl;

import hu.blackbelt.judo.meta.psm.data.DataPackage;
import hu.blackbelt.judo.meta.psm.data.Endpoint;
import hu.blackbelt.judo.meta.psm.data.Reference;

import hu.blackbelt.judo.meta.psm.namespace.impl.NamedElementImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EndpointImpl#isComposition <em>Composition</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EndpointImpl#getPartner <em>Partner</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EndpointImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EndpointImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.data.impl.EndpointImpl#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndpointImpl extends NamedElementImpl implements Endpoint {
    /**
     * The default value of the '{@link #isComposition() <em>Composition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isComposition()
     * @generated
     * @ordered
     */
    protected static final boolean COMPOSITION_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isComposition() <em>Composition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isComposition()
     * @generated
     * @ordered
     */
    protected boolean composition = COMPOSITION_EDEFAULT;

    /**
     * The cached value of the '{@link #getPartner() <em>Partner</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPartner()
     * @generated
     * @ordered
     */
    protected Endpoint partner;

    /**
     * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReference()
     * @generated
     * @ordered
     */
    protected Reference reference;

    /**
     * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLower()
     * @generated
     * @ordered
     */
    protected static final int LOWER_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getLower() <em>Lower</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLower()
     * @generated
     * @ordered
     */
    protected int lower = LOWER_EDEFAULT;

    /**
     * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpper()
     * @generated
     * @ordered
     */
    protected static final int UPPER_EDEFAULT = 1;

    /**
     * The cached value of the '{@link #getUpper() <em>Upper</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpper()
     * @generated
     * @ordered
     */
    protected int upper = UPPER_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EndpointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DataPackage.Literals.ENDPOINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isComposition() {
        return composition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComposition(boolean newComposition) {
        boolean oldComposition = composition;
        composition = newComposition;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ENDPOINT__COMPOSITION, oldComposition, composition));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Endpoint getPartner() {
        if (partner != null && partner.eIsProxy()) {
            InternalEObject oldPartner = (InternalEObject)partner;
            partner = (Endpoint)eResolveProxy(oldPartner);
            if (partner != oldPartner) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.ENDPOINT__PARTNER, oldPartner, partner));
            }
        }
        return partner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Endpoint basicGetPartner() {
        return partner;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPartner(Endpoint newPartner) {
        Endpoint oldPartner = partner;
        partner = newPartner;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ENDPOINT__PARTNER, oldPartner, partner));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Reference getReference() {
        if (reference != null && reference.eIsProxy()) {
            InternalEObject oldReference = (InternalEObject)reference;
            reference = (Reference)eResolveProxy(oldReference);
            if (reference != oldReference) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DataPackage.ENDPOINT__REFERENCE, oldReference, reference));
            }
        }
        return reference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Reference basicGetReference() {
        return reference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setReference(Reference newReference) {
        Reference oldReference = reference;
        reference = newReference;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ENDPOINT__REFERENCE, oldReference, reference));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLower() {
        return lower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLower(int newLower) {
        int oldLower = lower;
        lower = newLower;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ENDPOINT__LOWER, oldLower, lower));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getUpper() {
        return upper;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setUpper(int newUpper) {
        int oldUpper = upper;
        upper = newUpper;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DataPackage.ENDPOINT__UPPER, oldUpper, upper));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DataPackage.ENDPOINT__COMPOSITION:
                return isComposition();
            case DataPackage.ENDPOINT__PARTNER:
                if (resolve) return getPartner();
                return basicGetPartner();
            case DataPackage.ENDPOINT__REFERENCE:
                if (resolve) return getReference();
                return basicGetReference();
            case DataPackage.ENDPOINT__LOWER:
                return getLower();
            case DataPackage.ENDPOINT__UPPER:
                return getUpper();
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
            case DataPackage.ENDPOINT__COMPOSITION:
                setComposition((Boolean)newValue);
                return;
            case DataPackage.ENDPOINT__PARTNER:
                setPartner((Endpoint)newValue);
                return;
            case DataPackage.ENDPOINT__REFERENCE:
                setReference((Reference)newValue);
                return;
            case DataPackage.ENDPOINT__LOWER:
                setLower((Integer)newValue);
                return;
            case DataPackage.ENDPOINT__UPPER:
                setUpper((Integer)newValue);
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
            case DataPackage.ENDPOINT__COMPOSITION:
                setComposition(COMPOSITION_EDEFAULT);
                return;
            case DataPackage.ENDPOINT__PARTNER:
                setPartner((Endpoint)null);
                return;
            case DataPackage.ENDPOINT__REFERENCE:
                setReference((Reference)null);
                return;
            case DataPackage.ENDPOINT__LOWER:
                setLower(LOWER_EDEFAULT);
                return;
            case DataPackage.ENDPOINT__UPPER:
                setUpper(UPPER_EDEFAULT);
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
            case DataPackage.ENDPOINT__COMPOSITION:
                return composition != COMPOSITION_EDEFAULT;
            case DataPackage.ENDPOINT__PARTNER:
                return partner != null;
            case DataPackage.ENDPOINT__REFERENCE:
                return reference != null;
            case DataPackage.ENDPOINT__LOWER:
                return lower != LOWER_EDEFAULT;
            case DataPackage.ENDPOINT__UPPER:
                return upper != UPPER_EDEFAULT;
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
        result.append(" (composition: ");
        result.append(composition);
        result.append(", lower: ");
        result.append(lower);
        result.append(", upper: ");
        result.append(upper);
        result.append(')');
        return result.toString();
    }

} //EndpointImpl
