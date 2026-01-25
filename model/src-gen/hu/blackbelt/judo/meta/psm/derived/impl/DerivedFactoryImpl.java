/**
 */
package hu.blackbelt.judo.meta.psm.derived.impl;

import hu.blackbelt.judo.meta.psm.derived.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class DerivedFactoryImpl extends EFactoryImpl implements DerivedFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DerivedFactory init()
	{
		try
		{
			DerivedFactory theDerivedFactory = (DerivedFactory)EPackage.Registry.INSTANCE.getEFactory(DerivedPackage.eNS_URI);
			if (theDerivedFactory != null)
			{
				return theDerivedFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DerivedFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case DerivedPackage.DATA_PROPERTY: return createDataProperty();
			case DerivedPackage.NAVIGATION_PROPERTY: return createNavigationProperty();
			case DerivedPackage.STATIC_NAVIGATION: return createStaticNavigation();
			case DerivedPackage.STATIC_DATA: return createStaticData();
			case DerivedPackage.REFERENCE_EXPRESSION_TYPE: return createReferenceExpressionType();
			case DerivedPackage.REFERENCE_SELECTOR_TYPE: return createReferenceSelectorType();
			case DerivedPackage.DATA_EXPRESSION_TYPE: return createDataExpressionType();
			case DerivedPackage.ATTRIBUTE_SELECTOR_TYPE: return createAttributeSelectorType();
			case DerivedPackage.LOGICAL_EXPRESSION_TYPE: return createLogicalExpressionType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case DerivedPackage.EXPRESSION_DIALECT:
				return createExpressionDialectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case DerivedPackage.EXPRESSION_DIALECT:
				return convertExpressionDialectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataProperty createDataProperty()
	{
		DataPropertyImpl dataProperty = new DataPropertyImpl();
		return dataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NavigationProperty createNavigationProperty()
	{
		NavigationPropertyImpl navigationProperty = new NavigationPropertyImpl();
		return navigationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticNavigation createStaticNavigation()
	{
		StaticNavigationImpl staticNavigation = new StaticNavigationImpl();
		return staticNavigation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StaticData createStaticData()
	{
		StaticDataImpl staticData = new StaticDataImpl();
		return staticData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceExpressionType createReferenceExpressionType()
	{
		ReferenceExpressionTypeImpl referenceExpressionType = new ReferenceExpressionTypeImpl();
		return referenceExpressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceSelectorType createReferenceSelectorType()
	{
		ReferenceSelectorTypeImpl referenceSelectorType = new ReferenceSelectorTypeImpl();
		return referenceSelectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataExpressionType createDataExpressionType()
	{
		DataExpressionTypeImpl dataExpressionType = new DataExpressionTypeImpl();
		return dataExpressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AttributeSelectorType createAttributeSelectorType()
	{
		AttributeSelectorTypeImpl attributeSelectorType = new AttributeSelectorTypeImpl();
		return attributeSelectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LogicalExpressionType createLogicalExpressionType()
	{
		LogicalExpressionTypeImpl logicalExpressionType = new LogicalExpressionTypeImpl();
		return logicalExpressionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionDialect createExpressionDialect(String literal)
	{
		ExpressionDialect result = ExpressionDialect.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + DerivedPackage.Literals.EXPRESSION_DIALECT.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionDialect createExpressionDialectFromString(EDataType eDataType, String initialValue)
	{
		return createExpressionDialect(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertExpressionDialect(ExpressionDialect instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpressionDialectToString(EDataType eDataType, Object instanceValue)
	{
		return convertExpressionDialect((ExpressionDialect)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DerivedPackage getDerivedPackage()
	{
		return (DerivedPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DerivedPackage getPackage()
	{
		return DerivedPackage.eINSTANCE;
	}

} //DerivedFactoryImpl
