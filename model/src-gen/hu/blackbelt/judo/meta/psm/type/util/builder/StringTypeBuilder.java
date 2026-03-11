package hu.blackbelt.judo.meta.psm.type.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.type.StringType</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class StringTypeBuilder implements ITypeBuilder<hu.blackbelt.judo.meta.psm.type.StringType> {
    private  hu.blackbelt.judo.meta.psm.type.StringType $instance = null;

    // features and builders
     private java.lang.String m_documentation;
     private Integer m_maxLength;
     private java.lang.String m_name;
     private java.lang.String m_regExp;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureMaxLengthSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureRegExpSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.type.TypePackage.eINSTANCE.getEClassifier("StringType");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public StringTypeBuilder but() {
           StringTypeBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureMaxLengthSet = m_featureMaxLengthSet;
          _builder.m_maxLength = m_maxLength;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureRegExpSet = m_featureRegExpSet;
          _builder.m_regExp = m_regExp;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.type.StringType type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.type.StringType type
     */
    public hu.blackbelt.judo.meta.psm.type.StringType build() {

        final hu.blackbelt.judo.meta.psm.type.StringType _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.type.TypeFactory.eINSTANCE.createStringType();
        } else {
            _instance = $instance;
        }

         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureMaxLengthSet) {
             _instance.setMaxLength(m_maxLength);
         }
         if (m_featureNameSet) {
             _instance.setName(m_name);
         }
         if (m_featureRegExpSet) {
             _instance.setRegExp(m_regExp);
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
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from StringTypeBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see TypeBuilders#newStringTypeBuilder()
     */
    private StringTypeBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  TypeBuilders#useStringTypeBuilder()
     */
    private StringTypeBuilder(hu.blackbelt.judo.meta.psm.type.StringType instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the StringTypeBuilder.
     * @return new instance of the StringTypeBuilder
     */
    public static StringTypeBuilder create() {
        return new StringTypeBuilder();
    }

    /**
     * This method creates a new instance of the StringTypeBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the StringTypeBuilder
     */
    public static StringTypeBuilder create(boolean p_nullCheck) {
        return new StringTypeBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the StringTypeBuilder from the given instance of class.
     * @return new instance of the StringTypeBuilder
     */
    public static StringTypeBuilder use(hu.blackbelt.judo.meta.psm.type.StringType instance) {
        return new StringTypeBuilder(instance);
    }

    /**
     * This method creates a new instance of the StringTypeBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the StringTypeBuilder
     */
    public static StringTypeBuilder use(hu.blackbelt.judo.meta.psm.type.StringType instance, boolean p_nullCheck) {
        return new StringTypeBuilder(instance).withNullCheck(p_nullCheck);
    }

    private StringTypeBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public StringTypeBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public StringTypeBuilder withMaxLength(Integer p_maxLength){
         m_maxLength = p_maxLength;
         m_featureMaxLengthSet = true;
         return this;
     }
     public StringTypeBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public StringTypeBuilder withRegExp(java.lang.String p_regExp){
         m_regExp = p_regExp;
         m_featureRegExpSet = true;
         return this;
     }

     public StringTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public StringTypeBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public StringTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public StringTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_stringTypeBuilder){
         m_featureAnnotationsBuilder.add(p_stringTypeBuilder);
         return this;
     }
}
