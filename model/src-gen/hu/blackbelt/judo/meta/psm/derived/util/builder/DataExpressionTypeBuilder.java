package hu.blackbelt.judo.meta.psm.derived.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.derived.DataExpressionType</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class DataExpressionTypeBuilder implements IDerivedBuilder<hu.blackbelt.judo.meta.psm.derived.DataExpressionType> {
    private  hu.blackbelt.judo.meta.psm.derived.DataExpressionType $instance = null;

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
    public DataExpressionTypeBuilder but() {
           DataExpressionTypeBuilder _builder = create();
          _builder.m_featureDialectSet = m_featureDialectSet;
          _builder.m_dialect = m_dialect;
          _builder.m_featureExpressionSet = m_featureExpressionSet;
          _builder.m_expression = m_expression;
          _builder.m_featureParameterTypeSet = m_featureParameterTypeSet;
          _builder.m_parameterType = m_parameterType;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.derived.DataExpressionType type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.derived.DataExpressionType type
     */
    public hu.blackbelt.judo.meta.psm.derived.DataExpressionType build() {

        final hu.blackbelt.judo.meta.psm.derived.DataExpressionType _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.derived.DerivedFactory.eINSTANCE.createDataExpressionType();
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
            throw new IllegalArgumentException("Mandatory \"expression\" attribute is missing from DataExpressionTypeBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see DerivedBuilders#newDataExpressionTypeBuilder()
     */
    private DataExpressionTypeBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  DerivedBuilders#useDataExpressionTypeBuilder()
     */
    private DataExpressionTypeBuilder(hu.blackbelt.judo.meta.psm.derived.DataExpressionType instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the DataExpressionTypeBuilder.
     * @return new instance of the DataExpressionTypeBuilder
     */
    public static DataExpressionTypeBuilder create() {
        return new DataExpressionTypeBuilder();
    }

    /**
     * This method creates a new instance of the DataExpressionTypeBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the DataExpressionTypeBuilder
     */
    public static DataExpressionTypeBuilder create(boolean p_nullCheck) {
        return new DataExpressionTypeBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the DataExpressionTypeBuilder from the given instance of class.
     * @return new instance of the DataExpressionTypeBuilder
     */
    public static DataExpressionTypeBuilder use(hu.blackbelt.judo.meta.psm.derived.DataExpressionType instance) {
        return new DataExpressionTypeBuilder(instance);
    }

    /**
     * This method creates a new instance of the DataExpressionTypeBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the DataExpressionTypeBuilder
     */
    public static DataExpressionTypeBuilder use(hu.blackbelt.judo.meta.psm.derived.DataExpressionType instance, boolean p_nullCheck) {
        return new DataExpressionTypeBuilder(instance).withNullCheck(p_nullCheck);
    }

    private DataExpressionTypeBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public DataExpressionTypeBuilder withDialect(hu.blackbelt.judo.meta.psm.derived.ExpressionDialect p_dialect){
         m_dialect = p_dialect;
         m_featureDialectSet = true;
         return this;
     }
     public DataExpressionTypeBuilder withExpression(java.lang.String p_expression){
         m_expression = p_expression;
         m_featureExpressionSet = true;
         return this;
     }
     public DataExpressionTypeBuilder withParameterType(hu.blackbelt.judo.meta.psm.service.TransferObjectType p_parameterType){
         m_parameterType = p_parameterType;
         m_featureParameterTypeSet = true;
         return this;
     }


}
