/**
 */
package hu.blackbelt.judo.meta.psm.type.impl;

import hu.blackbelt.judo.meta.psm.type.TypePackage;
import hu.blackbelt.judo.meta.psm.type.XMLType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.XMLTypeImpl#getXmlNamespace <em>Xml Namespace</em>}</li>
 *   <li>{@link hu.blackbelt.judo.meta.psm.type.impl.XMLTypeImpl#getXmlElement <em>Xml Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMLTypeImpl extends PrimitiveImpl implements XMLType {
    /**
     * The default value of the '{@link #getXmlNamespace() <em>Xml Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXmlNamespace()
     * @generated
     * @ordered
     */
    protected static final String XML_NAMESPACE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXmlNamespace() <em>Xml Namespace</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXmlNamespace()
     * @generated
     * @ordered
     */
    protected String xmlNamespace = XML_NAMESPACE_EDEFAULT;

    /**
     * The default value of the '{@link #getXmlElement() <em>Xml Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXmlElement()
     * @generated
     * @ordered
     */
    protected static final String XML_ELEMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXmlElement() <em>Xml Element</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXmlElement()
     * @generated
     * @ordered
     */
    protected String xmlElement = XML_ELEMENT_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected XMLTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypePackage.Literals.XML_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getXmlNamespace() {
        return xmlNamespace;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXmlNamespace(String newXmlNamespace) {
        String oldXmlNamespace = xmlNamespace;
        xmlNamespace = newXmlNamespace;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.XML_TYPE__XML_NAMESPACE, oldXmlNamespace, xmlNamespace));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getXmlElement() {
        return xmlElement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setXmlElement(String newXmlElement) {
        String oldXmlElement = xmlElement;
        xmlElement = newXmlElement;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypePackage.XML_TYPE__XML_ELEMENT, oldXmlElement, xmlElement));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TypePackage.XML_TYPE__XML_NAMESPACE:
                return getXmlNamespace();
            case TypePackage.XML_TYPE__XML_ELEMENT:
                return getXmlElement();
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
            case TypePackage.XML_TYPE__XML_NAMESPACE:
                setXmlNamespace((String)newValue);
                return;
            case TypePackage.XML_TYPE__XML_ELEMENT:
                setXmlElement((String)newValue);
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
            case TypePackage.XML_TYPE__XML_NAMESPACE:
                setXmlNamespace(XML_NAMESPACE_EDEFAULT);
                return;
            case TypePackage.XML_TYPE__XML_ELEMENT:
                setXmlElement(XML_ELEMENT_EDEFAULT);
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
            case TypePackage.XML_TYPE__XML_NAMESPACE:
                return XML_NAMESPACE_EDEFAULT == null ? xmlNamespace != null : !XML_NAMESPACE_EDEFAULT.equals(xmlNamespace);
            case TypePackage.XML_TYPE__XML_ELEMENT:
                return XML_ELEMENT_EDEFAULT == null ? xmlElement != null : !XML_ELEMENT_EDEFAULT.equals(xmlElement);
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
        result.append(" (xmlNamespace: ");
        result.append(xmlNamespace);
        result.append(", xmlElement: ");
        result.append(xmlElement);
        result.append(')');
        return result.toString();
    }

} //XMLTypeImpl
