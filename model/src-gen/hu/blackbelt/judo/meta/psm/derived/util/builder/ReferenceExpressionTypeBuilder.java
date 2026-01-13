package hu.blackbelt.judo.meta.psm.derived.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class ReferenceExpressionTypeBuilder implements IDerivedBuilder<hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType> {
    private  hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType $instance = null;

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
            hu.blackbelt.judo.meta.psm.derived.DerivedPackage.eINSTANCE.getEClassifier("ReferenceExpressionType");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public ReferenceExpressionTypeBuilder but() {
           ReferenceExpressionTypeBuilder _builder = create();
          _builder.m_featureDialectSet = m_featureDialectSet;
          _builder.m_dialect = m_dialect;
          _builder.m_featureExpressionSet = m_featureExpressionSet;
          _builder.m_expression = m_expression;
          _builder.m_featureParameterTypeSet = m_featureParameterTypeSet;
          _builder.m_parameterType = m_parameterType;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType type
     */
    public hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType build() {

        final hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.derived.DerivedFactory.eINSTANCE.createReferenceExpressionType();
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
            throw new IllegalArgumentException("Mandatory \"expression\" attribute is missing from ReferenceExpressionTypeBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see DerivedBuilders#newReferenceExpressionTypeBuilder()
     */
    private ReferenceExpressionTypeBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  DerivedBuilders#useReferenceExpressionTypeBuilder()
     */
    private ReferenceExpressionTypeBuilder(hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the ReferenceExpressionTypeBuilder.
     * @return new instance of the ReferenceExpressionTypeBuilder
     */
    public static ReferenceExpressionTypeBuilder create() {
        return new ReferenceExpressionTypeBuilder();
    }

    /**
     * This method creates a new instance of the ReferenceExpressionTypeBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the ReferenceExpressionTypeBuilder
     */
    public static ReferenceExpressionTypeBuilder create(boolean p_nullCheck) {
        return new ReferenceExpressionTypeBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the ReferenceExpressionTypeBuilder from the given instance of class.
     * @return new instance of the ReferenceExpressionTypeBuilder
     */
    public static ReferenceExpressionTypeBuilder use(hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType instance) {
        return new ReferenceExpressionTypeBuilder(instance);
    }

    /**
     * This method creates a new instance of the ReferenceExpressionTypeBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the ReferenceExpressionTypeBuilder
     */
    public static ReferenceExpressionTypeBuilder use(hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType instance, boolean p_nullCheck) {
        return new ReferenceExpressionTypeBuilder(instance).withNullCheck(p_nullCheck);
    }

    private ReferenceExpressionTypeBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public ReferenceExpressionTypeBuilder withDialect(hu.blackbelt.judo.meta.psm.derived.ExpressionDialect p_dialect){
         m_dialect = p_dialect;
         m_featureDialectSet = true;
         return this;
     }
     public ReferenceExpressionTypeBuilder withExpression(java.lang.String p_expression){
         m_expression = p_expression;
         m_featureExpressionSet = true;
         return this;
     }
     public ReferenceExpressionTypeBuilder withParameterType(hu.blackbelt.judo.meta.psm.service.TransferObjectType p_parameterType){
         m_parameterType = p_parameterType;
         m_featureParameterTypeSet = true;
         return this;
     }

}
