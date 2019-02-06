/**
 */
package hu.blackbelt.judo.meta.psm.expression.enumeration.impl;

import hu.blackbelt.judo.meta.psm.expression.enumeration.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumerationFactoryImpl extends EFactoryImpl implements EnumerationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EnumerationFactory init() {
		try {
			EnumerationFactory theEnumerationFactory = (EnumerationFactory)EPackage.Registry.INSTANCE.getEFactory(EnumerationPackage.eNS_URI);
			if (theEnumerationFactory != null) {
				return theEnumerationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EnumerationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case EnumerationPackage.ENUMERATION_ATTRIBUTE: return createEnumerationAttribute();
			case EnumerationPackage.ENUMERATION_SWITCH_EXPRESSION: return createEnumerationSwitchExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationAttribute createEnumerationAttribute() {
		EnumerationAttributeImpl enumerationAttribute = new EnumerationAttributeImpl();
		return enumerationAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationSwitchExpression createEnumerationSwitchExpression() {
		EnumerationSwitchExpressionImpl enumerationSwitchExpression = new EnumerationSwitchExpressionImpl();
		return enumerationSwitchExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationPackage getEnumerationPackage() {
		return (EnumerationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EnumerationPackage getPackage() {
		return EnumerationPackage.eINSTANCE;
	}

} //EnumerationFactoryImpl
