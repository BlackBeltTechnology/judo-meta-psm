package hu.blackbelt.judo.meta.psm.namespace.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class AnnotationDetailBuilder implements INamespaceBuilder<hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail> {
    private  hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail $instance = null;

    // features and builders
     private java.lang.String m_name;
     private java.lang.String m_value;


     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureValueSet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public AnnotationDetailBuilder but() {
           AnnotationDetailBuilder _builder = create();
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureValueSet = m_featureValueSet;
          _builder.m_value = m_value;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail type
     */
    public hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail build() {

        final hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.namespace.NamespaceFactory.eINSTANCE.createAnnotationDetail();
        } else {
            _instance = $instance;
        }

         if (m_featureNameSet) {
             _instance.setName(m_name);
         }
         if (m_featureValueSet) {
             _instance.setValue(m_value);
         }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from AnnotationDetailBuilder.");
        }
        if (m_nullCheck && _instance.getValue() == null) {
            throw new IllegalArgumentException("Mandatory \"value\" attribute is missing from AnnotationDetailBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see NamespaceBuilders#newAnnotationDetailBuilder()
     */
    private AnnotationDetailBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  NamespaceBuilders#useAnnotationDetailBuilder()
     */
    private AnnotationDetailBuilder(hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the AnnotationDetailBuilder.
     * @return new instance of the AnnotationDetailBuilder
     */
    public static AnnotationDetailBuilder create() {
        return new AnnotationDetailBuilder();
    }

    /**
     * This method creates a new instance of the AnnotationDetailBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the AnnotationDetailBuilder
     */
    public static AnnotationDetailBuilder create(boolean p_nullCheck) {
        return new AnnotationDetailBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the AnnotationDetailBuilder from the given instance of class.
     * @return new instance of the AnnotationDetailBuilder
     */
    public static AnnotationDetailBuilder use(hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail instance) {
        return new AnnotationDetailBuilder(instance);
    }

    /**
     * This method creates a new instance of the AnnotationDetailBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the AnnotationDetailBuilder
     */
    public static AnnotationDetailBuilder use(hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail instance, boolean p_nullCheck) {
        return new AnnotationDetailBuilder(instance).withNullCheck(p_nullCheck);
    }

    private AnnotationDetailBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public AnnotationDetailBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public AnnotationDetailBuilder withValue(java.lang.String p_value){
         m_value = p_value;
         m_featureValueSet = true;
         return this;
     }


}
