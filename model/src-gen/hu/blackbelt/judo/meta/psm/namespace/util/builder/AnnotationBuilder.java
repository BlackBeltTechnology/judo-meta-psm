package hu.blackbelt.judo.meta.psm.namespace.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.namespace.Annotation</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class AnnotationBuilder implements INamespaceBuilder<hu.blackbelt.judo.meta.psm.namespace.Annotation> {
    private  hu.blackbelt.judo.meta.psm.namespace.Annotation $instance = null;

    // features and builders
     private java.lang.String m_name;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail> m_details = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail>> m_featureDetailsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureDetailsSet = false;
     private boolean m_featureNameSet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public AnnotationBuilder but() {
           AnnotationBuilder _builder = create();
          _builder.m_featureDetailsSet = m_featureDetailsSet;
          _builder.m_details = m_details;
          _builder.m_featureDetailsBuilder = m_featureDetailsBuilder;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.namespace.Annotation type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.namespace.Annotation type
     */
    public hu.blackbelt.judo.meta.psm.namespace.Annotation build() {

        final hu.blackbelt.judo.meta.psm.namespace.Annotation _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.namespace.NamespaceFactory.eINSTANCE.createAnnotation();
        } else {
            _instance = $instance;
        }

         if (m_featureNameSet) {
             _instance.setName(m_name);
         }
         if(m_featureDetailsSet) {
             _instance.getDetails().addAll(m_details);
         } else {
             if (!m_featureDetailsBuilder.isEmpty()) {
                 for (hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail> builder: m_featureDetailsBuilder) {
                     _instance.getDetails().add(builder.build());
                 }
             }
         }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from AnnotationBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see NamespaceBuilders#newAnnotationBuilder()
     */
    private AnnotationBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  NamespaceBuilders#useAnnotationBuilder()
     */
    private AnnotationBuilder(hu.blackbelt.judo.meta.psm.namespace.Annotation instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the AnnotationBuilder.
     * @return new instance of the AnnotationBuilder
     */
    public static AnnotationBuilder create() {
        return new AnnotationBuilder();
    }

    /**
     * This method creates a new instance of the AnnotationBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the AnnotationBuilder
     */
    public static AnnotationBuilder create(boolean p_nullCheck) {
        return new AnnotationBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the AnnotationBuilder from the given instance of class.
     * @return new instance of the AnnotationBuilder
     */
    public static AnnotationBuilder use(hu.blackbelt.judo.meta.psm.namespace.Annotation instance) {
        return new AnnotationBuilder(instance);
    }

    /**
     * This method creates a new instance of the AnnotationBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the AnnotationBuilder
     */
    public static AnnotationBuilder use(hu.blackbelt.judo.meta.psm.namespace.Annotation instance, boolean p_nullCheck) {
        return new AnnotationBuilder(instance).withNullCheck(p_nullCheck);
    }

    private AnnotationBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public AnnotationBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }

     public AnnotationBuilder withDetails(hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail p_details){
         m_details.add(p_details);
         m_featureDetailsSet = true;
         return this;
     }
     
     public AnnotationBuilder withDetails(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail> p_details){
         m_details.addAll(p_details);
         m_featureDetailsSet = true;
         return this;
     }
     
     public AnnotationBuilder withDetails(hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail...p_details){
         m_details.addAll(java.util.Arrays.asList(p_details));
         m_featureDetailsSet = true;
         return this;
     }
     
     public AnnotationBuilder withDetails(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.AnnotationDetail> p_annotationBuilder){
         m_featureDetailsBuilder.add(p_annotationBuilder);
         return this;
     }

}
