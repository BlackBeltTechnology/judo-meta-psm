package hu.blackbelt.judo.meta.psm.data.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.data.EntitySequence</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class EntitySequenceBuilder implements IDataBuilder<hu.blackbelt.judo.meta.psm.data.EntitySequence> {
    private  hu.blackbelt.judo.meta.psm.data.EntitySequence $instance = null;

    // features and builders
     private Boolean m_cyclic;
     private java.lang.String m_documentation;
     private Long m_increment;
     private Long m_initialValue;
     private Long m_maximumValue;
     private java.lang.String m_name;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureCyclicSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureIncrementSet = false;
     private boolean m_featureInitialValueSet = false;
     private boolean m_featureMaximumValueSet = false;
     private boolean m_featureNameSet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public EntitySequenceBuilder but() {
           EntitySequenceBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureCyclicSet = m_featureCyclicSet;
          _builder.m_cyclic = m_cyclic;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureIncrementSet = m_featureIncrementSet;
          _builder.m_increment = m_increment;
          _builder.m_featureInitialValueSet = m_featureInitialValueSet;
          _builder.m_initialValue = m_initialValue;
          _builder.m_featureMaximumValueSet = m_featureMaximumValueSet;
          _builder.m_maximumValue = m_maximumValue;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.data.EntitySequence type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.data.EntitySequence type
     */
    public hu.blackbelt.judo.meta.psm.data.EntitySequence build() {

        final hu.blackbelt.judo.meta.psm.data.EntitySequence _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.data.DataFactory.eINSTANCE.createEntitySequence();
        } else {
            _instance = $instance;
        }

         if (m_featureCyclicSet) {
             _instance.setCyclic(m_cyclic);
         }
         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureIncrementSet) {
             _instance.setIncrement(m_increment);
         }
         if (m_featureInitialValueSet) {
             _instance.setInitialValue(m_initialValue);
         }
         if (m_featureMaximumValueSet) {
             _instance.setMaximumValue(m_maximumValue);
         }
         if (m_featureNameSet) {
             _instance.setName(m_name);
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
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from EntitySequenceBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see DataBuilders#newEntitySequenceBuilder()
     */
    private EntitySequenceBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  DataBuilders#useEntitySequenceBuilder()
     */
    private EntitySequenceBuilder(hu.blackbelt.judo.meta.psm.data.EntitySequence instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the EntitySequenceBuilder.
     * @return new instance of the EntitySequenceBuilder
     */
    public static EntitySequenceBuilder create() {
        return new EntitySequenceBuilder();
    }

    /**
     * This method creates a new instance of the EntitySequenceBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the EntitySequenceBuilder
     */
    public static EntitySequenceBuilder create(boolean p_nullCheck) {
        return new EntitySequenceBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the EntitySequenceBuilder from the given instance of class.
     * @return new instance of the EntitySequenceBuilder
     */
    public static EntitySequenceBuilder use(hu.blackbelt.judo.meta.psm.data.EntitySequence instance) {
        return new EntitySequenceBuilder(instance);
    }

    /**
     * This method creates a new instance of the EntitySequenceBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the EntitySequenceBuilder
     */
    public static EntitySequenceBuilder use(hu.blackbelt.judo.meta.psm.data.EntitySequence instance, boolean p_nullCheck) {
        return new EntitySequenceBuilder(instance).withNullCheck(p_nullCheck);
    }

    private EntitySequenceBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public EntitySequenceBuilder withCyclic(Boolean p_cyclic){
         m_cyclic = p_cyclic;
         m_featureCyclicSet = true;
         return this;
     }
     public EntitySequenceBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public EntitySequenceBuilder withIncrement(Long p_increment){
         m_increment = p_increment;
         m_featureIncrementSet = true;
         return this;
     }
     public EntitySequenceBuilder withInitialValue(Long p_initialValue){
         m_initialValue = p_initialValue;
         m_featureInitialValueSet = true;
         return this;
     }
     public EntitySequenceBuilder withMaximumValue(Long p_maximumValue){
         m_maximumValue = p_maximumValue;
         m_featureMaximumValueSet = true;
         return this;
     }
     public EntitySequenceBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }

     public EntitySequenceBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public EntitySequenceBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public EntitySequenceBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public EntitySequenceBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_entitySequenceBuilder){
         m_featureAnnotationsBuilder.add(p_entitySequenceBuilder);
         return this;
     }

}
