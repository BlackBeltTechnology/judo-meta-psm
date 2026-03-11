package hu.blackbelt.judo.meta.psm.type.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.type.EnumerationMember</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class EnumerationMemberBuilder implements ITypeBuilder<hu.blackbelt.judo.meta.psm.type.EnumerationMember> {
    private  hu.blackbelt.judo.meta.psm.type.EnumerationMember $instance = null;

    // features and builders
     private java.lang.String m_documentation;
     private java.lang.String m_name;
     private Integer m_ordinal;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureOrdinalSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.type.TypePackage.eINSTANCE.getEClassifier("EnumerationMember");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public EnumerationMemberBuilder but() {
           EnumerationMemberBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureOrdinalSet = m_featureOrdinalSet;
          _builder.m_ordinal = m_ordinal;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.type.EnumerationMember type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.type.EnumerationMember type
     */
    public hu.blackbelt.judo.meta.psm.type.EnumerationMember build() {

        final hu.blackbelt.judo.meta.psm.type.EnumerationMember _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.type.TypeFactory.eINSTANCE.createEnumerationMember();
        } else {
            _instance = $instance;
        }

         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureNameSet) {
             _instance.setName(m_name);
         }
         if (m_featureOrdinalSet) {
             _instance.setOrdinal(m_ordinal);
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
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from EnumerationMemberBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see TypeBuilders#newEnumerationMemberBuilder()
     */
    private EnumerationMemberBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  TypeBuilders#useEnumerationMemberBuilder()
     */
    private EnumerationMemberBuilder(hu.blackbelt.judo.meta.psm.type.EnumerationMember instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the EnumerationMemberBuilder.
     * @return new instance of the EnumerationMemberBuilder
     */
    public static EnumerationMemberBuilder create() {
        return new EnumerationMemberBuilder();
    }

    /**
     * This method creates a new instance of the EnumerationMemberBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the EnumerationMemberBuilder
     */
    public static EnumerationMemberBuilder create(boolean p_nullCheck) {
        return new EnumerationMemberBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the EnumerationMemberBuilder from the given instance of class.
     * @return new instance of the EnumerationMemberBuilder
     */
    public static EnumerationMemberBuilder use(hu.blackbelt.judo.meta.psm.type.EnumerationMember instance) {
        return new EnumerationMemberBuilder(instance);
    }

    /**
     * This method creates a new instance of the EnumerationMemberBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the EnumerationMemberBuilder
     */
    public static EnumerationMemberBuilder use(hu.blackbelt.judo.meta.psm.type.EnumerationMember instance, boolean p_nullCheck) {
        return new EnumerationMemberBuilder(instance).withNullCheck(p_nullCheck);
    }

    private EnumerationMemberBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public EnumerationMemberBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public EnumerationMemberBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public EnumerationMemberBuilder withOrdinal(Integer p_ordinal){
         m_ordinal = p_ordinal;
         m_featureOrdinalSet = true;
         return this;
     }

     public EnumerationMemberBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public EnumerationMemberBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public EnumerationMemberBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public EnumerationMemberBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_enumerationMemberBuilder){
         m_featureAnnotationsBuilder.add(p_enumerationMemberBuilder);
         return this;
     }
}
