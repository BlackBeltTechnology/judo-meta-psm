package hu.blackbelt.judo.meta.psm.type.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.type.DateType</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class DateTypeBuilder implements ITypeBuilder<hu.blackbelt.judo.meta.psm.type.DateType> {
    private  hu.blackbelt.judo.meta.psm.type.DateType $instance = null;

    // features and builders
     private java.lang.String m_documentation;
     private java.lang.String m_name;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureNameSet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public DateTypeBuilder but() {
           DateTypeBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.type.DateType type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.type.DateType type
     */
    public hu.blackbelt.judo.meta.psm.type.DateType build() {

        final hu.blackbelt.judo.meta.psm.type.DateType _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.type.TypeFactory.eINSTANCE.createDateType();
        } else {
            _instance = $instance;
        }

         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
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
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from DateTypeBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see TypeBuilders#newDateTypeBuilder()
     */
    private DateTypeBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  TypeBuilders#useDateTypeBuilder()
     */
    private DateTypeBuilder(hu.blackbelt.judo.meta.psm.type.DateType instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the DateTypeBuilder.
     * @return new instance of the DateTypeBuilder
     */
    public static DateTypeBuilder create() {
        return new DateTypeBuilder();
    }

    /**
     * This method creates a new instance of the DateTypeBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the DateTypeBuilder
     */
    public static DateTypeBuilder create(boolean p_nullCheck) {
        return new DateTypeBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the DateTypeBuilder from the given instance of class.
     * @return new instance of the DateTypeBuilder
     */
    public static DateTypeBuilder use(hu.blackbelt.judo.meta.psm.type.DateType instance) {
        return new DateTypeBuilder(instance);
    }

    /**
     * This method creates a new instance of the DateTypeBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the DateTypeBuilder
     */
    public static DateTypeBuilder use(hu.blackbelt.judo.meta.psm.type.DateType instance, boolean p_nullCheck) {
        return new DateTypeBuilder(instance).withNullCheck(p_nullCheck);
    }

    private DateTypeBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public DateTypeBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public DateTypeBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }

     public DateTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public DateTypeBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public DateTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public DateTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_dateTypeBuilder){
         m_featureAnnotationsBuilder.add(p_dateTypeBuilder);
         return this;
     }

}
