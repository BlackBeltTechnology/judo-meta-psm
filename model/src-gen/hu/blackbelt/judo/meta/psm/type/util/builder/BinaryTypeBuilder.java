package hu.blackbelt.judo.meta.psm.type.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.type.BinaryType</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class BinaryTypeBuilder implements ITypeBuilder<hu.blackbelt.judo.meta.psm.type.BinaryType> {
    private  hu.blackbelt.judo.meta.psm.type.BinaryType $instance = null;

    // features and builders
     private java.lang.String m_documentation;
     private Long m_maxFileSize;
     private java.lang.String m_name;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();
     private java.util.Collection<java.lang.String> m_mimeTypes = new java.util.LinkedList<java.lang.String>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureMaxFileSizeSet = false;
     private boolean m_featureMimeTypesSet = false;
     private boolean m_featureNameSet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public BinaryTypeBuilder but() {
           BinaryTypeBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureMaxFileSizeSet = m_featureMaxFileSizeSet;
          _builder.m_maxFileSize = m_maxFileSize;
          _builder.m_featureMimeTypesSet = m_featureMimeTypesSet;
          _builder.m_mimeTypes = m_mimeTypes;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.type.BinaryType type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.type.BinaryType type
     */
    public hu.blackbelt.judo.meta.psm.type.BinaryType build() {

        final hu.blackbelt.judo.meta.psm.type.BinaryType _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.type.TypeFactory.eINSTANCE.createBinaryType();
        } else {
            _instance = $instance;
        }

         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureMaxFileSizeSet) {
             _instance.setMaxFileSize(m_maxFileSize);
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
         if(m_featureMimeTypesSet) {
             _instance.getMimeTypes().addAll(m_mimeTypes);
         }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from BinaryTypeBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see TypeBuilders#newBinaryTypeBuilder()
     */
    private BinaryTypeBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  TypeBuilders#useBinaryTypeBuilder()
     */
    private BinaryTypeBuilder(hu.blackbelt.judo.meta.psm.type.BinaryType instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the BinaryTypeBuilder.
     * @return new instance of the BinaryTypeBuilder
     */
    public static BinaryTypeBuilder create() {
        return new BinaryTypeBuilder();
    }

    /**
     * This method creates a new instance of the BinaryTypeBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the BinaryTypeBuilder
     */
    public static BinaryTypeBuilder create(boolean p_nullCheck) {
        return new BinaryTypeBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the BinaryTypeBuilder from the given instance of class.
     * @return new instance of the BinaryTypeBuilder
     */
    public static BinaryTypeBuilder use(hu.blackbelt.judo.meta.psm.type.BinaryType instance) {
        return new BinaryTypeBuilder(instance);
    }

    /**
     * This method creates a new instance of the BinaryTypeBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the BinaryTypeBuilder
     */
    public static BinaryTypeBuilder use(hu.blackbelt.judo.meta.psm.type.BinaryType instance, boolean p_nullCheck) {
        return new BinaryTypeBuilder(instance).withNullCheck(p_nullCheck);
    }

    private BinaryTypeBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public BinaryTypeBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public BinaryTypeBuilder withMaxFileSize(Long p_maxFileSize){
         m_maxFileSize = p_maxFileSize;
         m_featureMaxFileSizeSet = true;
         return this;
     }
     public BinaryTypeBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }

     public BinaryTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public BinaryTypeBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public BinaryTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public BinaryTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_binaryTypeBuilder){
         m_featureAnnotationsBuilder.add(p_binaryTypeBuilder);
         return this;
     }
     public BinaryTypeBuilder withMimeTypes(java.lang.String p_mimeTypes){
         m_mimeTypes.add(p_mimeTypes);
         m_featureMimeTypesSet = true;
         return this;
     }
     
     public BinaryTypeBuilder withMimeTypes(java.util.Collection<? extends java.lang.String> p_mimeTypes){
         m_mimeTypes.addAll(p_mimeTypes);
         m_featureMimeTypesSet = true;
         return this;
     }
     
     public BinaryTypeBuilder withMimeTypes(java.lang.String...p_mimeTypes){
         m_mimeTypes.addAll(java.util.Arrays.asList(p_mimeTypes));
         m_featureMimeTypesSet = true;
         return this;
     }
     

}
