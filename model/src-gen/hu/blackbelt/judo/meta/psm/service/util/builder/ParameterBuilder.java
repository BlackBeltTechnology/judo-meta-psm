package hu.blackbelt.judo.meta.psm.service.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.service.Parameter</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class ParameterBuilder implements IServiceBuilder<hu.blackbelt.judo.meta.psm.service.Parameter> {
    private  hu.blackbelt.judo.meta.psm.service.Parameter $instance = null;

    // features and builders
     private hu.blackbelt.judo.meta.psm.type.Cardinality m_cardinality;
     private hu.blackbelt.judo.meta.psm.type.util.builder.ITypeBuilder<? extends hu.blackbelt.judo.meta.psm.type.Cardinality> m_featureCardinalityBuilder;
     private java.lang.String m_documentation;
     private java.lang.String m_name;
     private hu.blackbelt.judo.meta.psm.service.TransferObjectType m_type;
     private Boolean m_wrapAsOptional;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureCardinalitySet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureTypeSet = false;
     private boolean m_featureWrapAsOptionalSet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public ParameterBuilder but() {
           ParameterBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureCardinalitySet = m_featureCardinalitySet;
          _builder.m_cardinality = m_cardinality;
          _builder.m_featureCardinalityBuilder = m_featureCardinalityBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureTypeSet = m_featureTypeSet;
          _builder.m_type = m_type;
          _builder.m_featureWrapAsOptionalSet = m_featureWrapAsOptionalSet;
          _builder.m_wrapAsOptional = m_wrapAsOptional;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.service.Parameter type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.service.Parameter type
     */
    public hu.blackbelt.judo.meta.psm.service.Parameter build() {

        final hu.blackbelt.judo.meta.psm.service.Parameter _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.service.ServiceFactory.eINSTANCE.createParameter();
        } else {
            _instance = $instance;
        }

         if (m_featureCardinalitySet) {
             _instance.setCardinality(m_cardinality);
         } else {
                 if (m_featureCardinalityBuilder != null) {
                     _instance.setCardinality(m_featureCardinalityBuilder.build());
                 }
             }
         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureNameSet) {
             _instance.setName(m_name);
         }
         if (m_featureTypeSet) {
             _instance.setType(m_type);
         }
         if (m_featureWrapAsOptionalSet) {
             _instance.setWrapAsOptional(m_wrapAsOptional);
         }
         if(m_featureAnnotationsSet) {
             _instance.getAnnotations().addAll(m_annotations);
         } else {
             if (!m_featureAnnotationsBuilder.isEmpty()) {
                 for (hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> builder: m_featureAnnotationsBuilder) {
                     _instance.getAnnotations().add(builder.build());
                 }
             }
         }
        if (m_nullCheck && _instance.getCardinality() == null) {
            throw new IllegalArgumentException("Mandatory \"cardinality\" attribute is missing from ParameterBuilder.");
        }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from ParameterBuilder.");
        }
        if (m_nullCheck && _instance.getType() == null) {
            throw new IllegalArgumentException("Mandatory \"type\" attribute is missing from ParameterBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see ServiceBuilders#newParameterBuilder()
     */
    private ParameterBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  ServiceBuilders#useParameterBuilder()
     */
    private ParameterBuilder(hu.blackbelt.judo.meta.psm.service.Parameter instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the ParameterBuilder.
     * @return new instance of the ParameterBuilder
     */
    public static ParameterBuilder create() {
        return new ParameterBuilder();
    }

    /**
     * This method creates a new instance of the ParameterBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the ParameterBuilder
     */
    public static ParameterBuilder create(boolean p_nullCheck) {
        return new ParameterBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the ParameterBuilder from the given instance of class.
     * @return new instance of the ParameterBuilder
     */
    public static ParameterBuilder use(hu.blackbelt.judo.meta.psm.service.Parameter instance) {
        return new ParameterBuilder(instance);
    }

    /**
     * This method creates a new instance of the ParameterBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the ParameterBuilder
     */
    public static ParameterBuilder use(hu.blackbelt.judo.meta.psm.service.Parameter instance, boolean p_nullCheck) {
        return new ParameterBuilder(instance).withNullCheck(p_nullCheck);
    }

    private ParameterBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public ParameterBuilder withCardinality(hu.blackbelt.judo.meta.psm.type.Cardinality p_cardinality){
         m_cardinality = p_cardinality;
         m_featureCardinalitySet = true;
         return this;
     }
     public ParameterBuilder withCardinality(hu.blackbelt.judo.meta.psm.type.util.builder.ITypeBuilder<? extends hu.blackbelt.judo.meta.psm.type.Cardinality> p_parameterBuilder){
         m_featureCardinalityBuilder = p_parameterBuilder;
         return this;
     }
     public ParameterBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public ParameterBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public ParameterBuilder withType(hu.blackbelt.judo.meta.psm.service.TransferObjectType p_type){
         m_type = p_type;
         m_featureTypeSet = true;
         return this;
     }
     public ParameterBuilder withWrapAsOptional(Boolean p_wrapAsOptional){
         m_wrapAsOptional = p_wrapAsOptional;
         m_featureWrapAsOptionalSet = true;
         return this;
     }

     public ParameterBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public ParameterBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public ParameterBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public ParameterBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_parameterBuilder){
         m_featureAnnotationsBuilder.add(p_parameterBuilder);
         return this;
     }

}
