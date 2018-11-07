/**
 */
package hu.blackbelt.judo.meta.psm.type.util;

import hu.blackbelt.judo.meta.psm.namespace.NamedElement;

import hu.blackbelt.judo.meta.psm.type.Cardinality;
import hu.blackbelt.judo.meta.psm.type.ComplexType;
import hu.blackbelt.judo.meta.psm.type.Custom;
import hu.blackbelt.judo.meta.psm.type.DataType;
import hu.blackbelt.judo.meta.psm.type.Element;
import hu.blackbelt.judo.meta.psm.type.Enumeration;
import hu.blackbelt.judo.meta.psm.type.Member;
import hu.blackbelt.judo.meta.psm.type.Numeric;
import hu.blackbelt.judo.meta.psm.type.Primitive;
import hu.blackbelt.judo.meta.psm.type.Type;
import hu.blackbelt.judo.meta.psm.type.TypePackage;
import hu.blackbelt.judo.meta.psm.type.XML;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.blackbelt.judo.meta.psm.type.TypePackage
 * @generated
 */
public class TypeAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static TypePackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TypePackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TypeSwitch<Adapter> modelSwitch =
        new TypeSwitch<Adapter>() {
            @Override
            public Adapter casePrimitive(Primitive object) {
                return createPrimitiveAdapter();
            }
            @Override
            public Adapter caseCustom(Custom object) {
                return createCustomAdapter();
            }
            @Override
            public Adapter caseString(hu.blackbelt.judo.meta.psm.type.String object) {
                return createStringAdapter();
            }
            @Override
            public Adapter caseNumeric(Numeric object) {
                return createNumericAdapter();
            }
            @Override
            public Adapter caseBoolean(hu.blackbelt.judo.meta.psm.type.Boolean object) {
                return createBooleanAdapter();
            }
            @Override
            public Adapter caseEnumeration(Enumeration object) {
                return createEnumerationAdapter();
            }
            @Override
            public Adapter caseMember(Member object) {
                return createMemberAdapter();
            }
            @Override
            public Adapter caseType(Type object) {
                return createTypeAdapter();
            }
            @Override
            public Adapter caseDataType(DataType object) {
                return createDataTypeAdapter();
            }
            @Override
            public Adapter caseXML(XML object) {
                return createXMLAdapter();
            }
            @Override
            public Adapter caseComplexType(ComplexType object) {
                return createComplexTypeAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseCardinality(Cardinality object) {
                return createCardinalityAdapter();
            }
            @Override
            public Adapter caseNamedElement(NamedElement object) {
                return createNamedElementAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.type.Primitive <em>Primitive</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.type.Primitive
     * @generated
     */
    public Adapter createPrimitiveAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.type.Custom <em>Custom</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.type.Custom
     * @generated
     */
    public Adapter createCustomAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.type.String <em>String</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.type.String
     * @generated
     */
    public Adapter createStringAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.type.Numeric <em>Numeric</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.type.Numeric
     * @generated
     */
    public Adapter createNumericAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.type.Boolean <em>Boolean</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.type.Boolean
     * @generated
     */
    public Adapter createBooleanAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.type.Enumeration <em>Enumeration</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.type.Enumeration
     * @generated
     */
    public Adapter createEnumerationAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.type.Member <em>Member</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.type.Member
     * @generated
     */
    public Adapter createMemberAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.type.Type <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.type.Type
     * @generated
     */
    public Adapter createTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.type.DataType <em>Data Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.type.DataType
     * @generated
     */
    public Adapter createDataTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.type.XML <em>XML</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.type.XML
     * @generated
     */
    public Adapter createXMLAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.type.ComplexType <em>Complex Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.type.ComplexType
     * @generated
     */
    public Adapter createComplexTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.type.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.type.Element
     * @generated
     */
    public Adapter createElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.type.Cardinality <em>Cardinality</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.type.Cardinality
     * @generated
     */
    public Adapter createCardinalityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.blackbelt.judo.meta.psm.namespace.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.blackbelt.judo.meta.psm.namespace.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //TypeAdapterFactory
