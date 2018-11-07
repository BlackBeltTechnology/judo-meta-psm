/**
 */
package hu.blackbelt.judo.meta.psm.type.impl;

import hu.blackbelt.judo.meta.psm.type.ComplexType;
import hu.blackbelt.judo.meta.psm.type.Element;
import hu.blackbelt.judo.meta.psm.type.TypePackage;

import java.lang.Boolean;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.ComplexTypeImpl#getSuperComplexTypes <em>Super Complex Types</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.ComplexTypeImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.ComplexTypeImpl#isAbstract <em>Abstract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplexTypeImpl extends DataTypeImpl implements ComplexType {
    /**
     * The cached value of the '{@link #getSuperComplexTypes() <em>Super Complex Types</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperComplexTypes()
     * @generated
     * @ordered
     */
    protected EList<ComplexType> superComplexTypes;

    /**
     * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getElements()
     * @generated
     * @ordered
     */
    protected EList<Element> elements;

    /**
     * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAbstract()
     * @generated
     * @ordered
     */
    protected static final boolean ABSTRACT_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isAbstract()
     * @generated
     * @ordered
     */
    protected boolean abstract_ = ABSTRACT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComplexTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.COMPLEX_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ComplexType> getSuperComplexTypes() {
        if (superComplexTypes == null) {
            superComplexTypes = new EObjectResolvingEList<ComplexType>(ComplexType.class, this, TypePackage.COMPLEX_TYPE__SUPER_COMPLEX_TYPES);
        }
        return superComplexTypes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Element> getElements() {
        if (elements == null) {
            elements = new EObjectContainmentEList<Element>(Element.class, this, TypePackage.COMPLEX_TYPE__ELEMENTS);
        }
        return elements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isAbstract() {
        return abstract_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAbstract(boolean newAbstract) {
        boolean oldAbstract = abstract_;
        abstract_ = newAbstract;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.COMPLEX_TYPE__ABSTRACT, oldAbstract, abstract_));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypePackage.COMPLEX_TYPE__ELEMENTS:
                return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TypePackage.COMPLEX_TYPE__SUPER_COMPLEX_TYPES:
                return getSuperComplexTypes();
            case TypePackage.COMPLEX_TYPE__ELEMENTS:
                return getElements();
            case TypePackage.COMPLEX_TYPE__ABSTRACT:
                return isAbstract();
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
            case TypePackage.COMPLEX_TYPE__SUPER_COMPLEX_TYPES:
                getSuperComplexTypes().clear();
                getSuperComplexTypes().addAll((Collection<? extends ComplexType>)newValue);
                return;
            case TypePackage.COMPLEX_TYPE__ELEMENTS:
                getElements().clear();
                getElements().addAll((Collection<? extends Element>)newValue);
                return;
            case TypePackage.COMPLEX_TYPE__ABSTRACT:
                setAbstract((Boolean)newValue);
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
            case TypePackage.COMPLEX_TYPE__SUPER_COMPLEX_TYPES:
                getSuperComplexTypes().clear();
                return;
            case TypePackage.COMPLEX_TYPE__ELEMENTS:
                getElements().clear();
                return;
            case TypePackage.COMPLEX_TYPE__ABSTRACT:
                setAbstract(ABSTRACT_EDEFAULT);
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
            case TypePackage.COMPLEX_TYPE__SUPER_COMPLEX_TYPES:
                return superComplexTypes != null && !superComplexTypes.isEmpty();
            case TypePackage.COMPLEX_TYPE__ELEMENTS:
                return elements != null && !elements.isEmpty();
            case TypePackage.COMPLEX_TYPE__ABSTRACT:
                return abstract_ != ABSTRACT_EDEFAULT;
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
        result.append(" (abstract: ");
        result.append(abstract_);
        result.append(')');
        return result.toString();
    }

} //ComplexTypeImpl
