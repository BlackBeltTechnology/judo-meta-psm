package hu.blackbelt.judo.meta.psm.derived.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class AttributeSelectorTypeBuilder implements IDerivedBuilder<hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType> {
    private  hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType $instance = null;

    // features and builders
     private hu.blackbelt.judo.meta.psm.derived.ExpressionDialect m_dialect;
     private java.lang.String m_expression;
     private hu.blackbelt.judo.meta.psm.service.TransferObjectType m_parameterType;


     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureDialectSet = false;
     private boolean m_featureExpressionSet = false;
     private boolean m_featureParameterTypeSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.derived.DerivedPackage.eINSTANCE.getEClassifier("AttributeSelectorType");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public AttributeSelectorTypeBuilder but() {
           AttributeSelectorTypeBuilder _builder = create();
          _builder.m_featureDialectSet = m_featureDialectSet;
          _builder.m_dialect = m_dialect;
          _builder.m_featureExpressionSet = m_featureExpressionSet;
          _builder.m_expression = m_expression;
          _builder.m_featureParameterTypeSet = m_featureParameterTypeSet;
          _builder.m_parameterType = m_parameterType;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType type
     */
    public hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType build() {

        final hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.derived.DerivedFactory.eINSTANCE.createAttributeSelectorType();
        } else {
            _instance = $instance;
        }

         if (m_featureDialectSet) {
             _instance.setDialect(m_dialect);
         }
         if (m_featureExpressionSet) {
             _instance.setExpression(m_expression);
         }
         if (m_featureParameterTypeSet) {
             _instance.setParameterType(m_parameterType);
         }
        if (m_nullCheck && _instance.getExpression() == null) {
            throw new IllegalArgumentException("Mandatory \"expression\" attribute is missing from AttributeSelectorTypeBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see DerivedBuilders#newAttributeSelectorTypeBuilder()
     */
    private AttributeSelectorTypeBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  DerivedBuilders#useAttributeSelectorTypeBuilder()
     */
    private AttributeSelectorTypeBuilder(hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the AttributeSelectorTypeBuilder.
     * @return new instance of the AttributeSelectorTypeBuilder
     */
    public static AttributeSelectorTypeBuilder create() {
        return new AttributeSelectorTypeBuilder();
    }

    /**
     * This method creates a new instance of the AttributeSelectorTypeBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the AttributeSelectorTypeBuilder
     */
    public static AttributeSelectorTypeBuilder create(boolean p_nullCheck) {
        return new AttributeSelectorTypeBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the AttributeSelectorTypeBuilder from the given instance of class.
     * @return new instance of the AttributeSelectorTypeBuilder
     */
    public static AttributeSelectorTypeBuilder use(hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType instance) {
        return new AttributeSelectorTypeBuilder(instance);
    }

    /**
     * This method creates a new instance of the AttributeSelectorTypeBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the AttributeSelectorTypeBuilder
     */
    public static AttributeSelectorTypeBuilder use(hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType instance, boolean p_nullCheck) {
        return new AttributeSelectorTypeBuilder(instance).withNullCheck(p_nullCheck);
    }

    private AttributeSelectorTypeBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public AttributeSelectorTypeBuilder withDialect(hu.blackbelt.judo.meta.psm.derived.ExpressionDialect p_dialect){
         m_dialect = p_dialect;
         m_featureDialectSet = true;
         return this;
     }
     public AttributeSelectorTypeBuilder withExpression(java.lang.String p_expression){
         m_expression = p_expression;
         m_featureExpressionSet = true;
         return this;
     }
     public AttributeSelectorTypeBuilder withParameterType(hu.blackbelt.judo.meta.psm.service.TransferObjectType p_parameterType){
         m_parameterType = p_parameterType;
         m_featureParameterTypeSet = true;
         return this;
     }

}
