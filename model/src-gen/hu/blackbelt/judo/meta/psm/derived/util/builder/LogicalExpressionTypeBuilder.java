package hu.blackbelt.judo.meta.psm.derived.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class LogicalExpressionTypeBuilder implements IDerivedBuilder<hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType> {
    private  hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType $instance = null;

    // features and builders
     private hu.blackbelt.judo.meta.psm.derived.ExpressionDialect m_dialect;
     private java.lang.String m_expression;
     private hu.blackbelt.judo.meta.psm.service.TransferObjectType m_parameterType;


     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureDialectSet = false;
     private boolean m_featureExpressionSet = false;
     private boolean m_featureParameterTypeSet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public LogicalExpressionTypeBuilder but() {
           LogicalExpressionTypeBuilder _builder = create();
          _builder.m_featureDialectSet = m_featureDialectSet;
          _builder.m_dialect = m_dialect;
          _builder.m_featureExpressionSet = m_featureExpressionSet;
          _builder.m_expression = m_expression;
          _builder.m_featureParameterTypeSet = m_featureParameterTypeSet;
          _builder.m_parameterType = m_parameterType;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType type
     */
    public hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType build() {

        final hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.derived.DerivedFactory.eINSTANCE.createLogicalExpressionType();
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
            throw new IllegalArgumentException("Mandatory \"expression\" attribute is missing from LogicalExpressionTypeBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see DerivedBuilders#newLogicalExpressionTypeBuilder()
     */
    private LogicalExpressionTypeBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  DerivedBuilders#useLogicalExpressionTypeBuilder()
     */
    private LogicalExpressionTypeBuilder(hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the LogicalExpressionTypeBuilder.
     * @return new instance of the LogicalExpressionTypeBuilder
     */
    public static LogicalExpressionTypeBuilder create() {
        return new LogicalExpressionTypeBuilder();
    }

    /**
     * This method creates a new instance of the LogicalExpressionTypeBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the LogicalExpressionTypeBuilder
     */
    public static LogicalExpressionTypeBuilder create(boolean p_nullCheck) {
        return new LogicalExpressionTypeBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the LogicalExpressionTypeBuilder from the given instance of class.
     * @return new instance of the LogicalExpressionTypeBuilder
     */
    public static LogicalExpressionTypeBuilder use(hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType instance) {
        return new LogicalExpressionTypeBuilder(instance);
    }

    /**
     * This method creates a new instance of the LogicalExpressionTypeBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the LogicalExpressionTypeBuilder
     */
    public static LogicalExpressionTypeBuilder use(hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType instance, boolean p_nullCheck) {
        return new LogicalExpressionTypeBuilder(instance).withNullCheck(p_nullCheck);
    }

    private LogicalExpressionTypeBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public LogicalExpressionTypeBuilder withDialect(hu.blackbelt.judo.meta.psm.derived.ExpressionDialect p_dialect){
         m_dialect = p_dialect;
         m_featureDialectSet = true;
         return this;
     }
     public LogicalExpressionTypeBuilder withExpression(java.lang.String p_expression){
         m_expression = p_expression;
         m_featureExpressionSet = true;
         return this;
     }
     public LogicalExpressionTypeBuilder withParameterType(hu.blackbelt.judo.meta.psm.service.TransferObjectType p_parameterType){
         m_parameterType = p_parameterType;
         m_featureParameterTypeSet = true;
         return this;
     }


}
