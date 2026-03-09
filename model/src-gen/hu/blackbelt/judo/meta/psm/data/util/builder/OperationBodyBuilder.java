package hu.blackbelt.judo.meta.psm.data.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.data.OperationBody</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class OperationBodyBuilder implements IDataBuilder<hu.blackbelt.judo.meta.psm.data.OperationBody> {
    private  hu.blackbelt.judo.meta.psm.data.OperationBody $instance = null;

    // features and builders
     private java.lang.String m_body;
     private Boolean m_customImplementation;
     private Boolean m_stateful;


     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureBodySet = false;
     private boolean m_featureCustomImplementationSet = false;
     private boolean m_featureStatefulSet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public OperationBodyBuilder but() {
           OperationBodyBuilder _builder = create();
          _builder.m_featureBodySet = m_featureBodySet;
          _builder.m_body = m_body;
          _builder.m_featureCustomImplementationSet = m_featureCustomImplementationSet;
          _builder.m_customImplementation = m_customImplementation;
          _builder.m_featureStatefulSet = m_featureStatefulSet;
          _builder.m_stateful = m_stateful;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.data.OperationBody type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.data.OperationBody type
     */
    public hu.blackbelt.judo.meta.psm.data.OperationBody build() {

        final hu.blackbelt.judo.meta.psm.data.OperationBody _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.data.DataFactory.eINSTANCE.createOperationBody();
        } else {
            _instance = $instance;
        }

         if (m_featureBodySet) {
             _instance.setBody(m_body);
         }
         if (m_featureCustomImplementationSet) {
             _instance.setCustomImplementation(m_customImplementation);
         }
         if (m_featureStatefulSet) {
             _instance.setStateful(m_stateful);
         }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see DataBuilders#newOperationBodyBuilder()
     */
    private OperationBodyBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  DataBuilders#useOperationBodyBuilder()
     */
    private OperationBodyBuilder(hu.blackbelt.judo.meta.psm.data.OperationBody instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the OperationBodyBuilder.
     * @return new instance of the OperationBodyBuilder
     */
    public static OperationBodyBuilder create() {
        return new OperationBodyBuilder();
    }

    /**
     * This method creates a new instance of the OperationBodyBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the OperationBodyBuilder
     */
    public static OperationBodyBuilder create(boolean p_nullCheck) {
        return new OperationBodyBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the OperationBodyBuilder from the given instance of class.
     * @return new instance of the OperationBodyBuilder
     */
    public static OperationBodyBuilder use(hu.blackbelt.judo.meta.psm.data.OperationBody instance) {
        return new OperationBodyBuilder(instance);
    }

    /**
     * This method creates a new instance of the OperationBodyBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the OperationBodyBuilder
     */
    public static OperationBodyBuilder use(hu.blackbelt.judo.meta.psm.data.OperationBody instance, boolean p_nullCheck) {
        return new OperationBodyBuilder(instance).withNullCheck(p_nullCheck);
    }

    private OperationBodyBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public OperationBodyBuilder withBody(java.lang.String p_body){
         m_body = p_body;
         m_featureBodySet = true;
         return this;
     }
     public OperationBodyBuilder withCustomImplementation(Boolean p_customImplementation){
         m_customImplementation = p_customImplementation;
         m_featureCustomImplementationSet = true;
         return this;
     }
     public OperationBodyBuilder withStateful(Boolean p_stateful){
         m_stateful = p_stateful;
         m_featureStatefulSet = true;
         return this;
     }


}
