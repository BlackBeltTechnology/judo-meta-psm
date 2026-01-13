package hu.blackbelt.judo.meta.psm.type.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.type.EnumerationType</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class EnumerationTypeBuilder implements ITypeBuilder<hu.blackbelt.judo.meta.psm.type.EnumerationType> {
    private  hu.blackbelt.judo.meta.psm.type.EnumerationType $instance = null;

    // features and builders
     private java.lang.String m_documentation;
     private java.lang.String m_name;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.type.EnumerationMember> m_members = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.type.EnumerationMember>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.type.util.builder.ITypeBuilder<? extends hu.blackbelt.judo.meta.psm.type.EnumerationMember>> m_featureMembersBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.type.util.builder.ITypeBuilder<? extends hu.blackbelt.judo.meta.psm.type.EnumerationMember>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureMembersSet = false;
     private boolean m_featureNameSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.type.TypePackage.eINSTANCE.getEClassifier("EnumerationType");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public EnumerationTypeBuilder but() {
           EnumerationTypeBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureMembersSet = m_featureMembersSet;
          _builder.m_members = m_members;
          _builder.m_featureMembersBuilder = m_featureMembersBuilder;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.type.EnumerationType type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.type.EnumerationType type
     */
    public hu.blackbelt.judo.meta.psm.type.EnumerationType build() {

        final hu.blackbelt.judo.meta.psm.type.EnumerationType _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.type.TypeFactory.eINSTANCE.createEnumerationType();
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
         if(m_featureMembersSet) {
             _instance.getMembers().addAll(m_members);
         } else {
             if (!m_featureMembersBuilder.isEmpty()) {
                 for (hu.blackbelt.judo.meta.psm.type.util.builder.ITypeBuilder<? extends hu.blackbelt.judo.meta.psm.type.EnumerationMember> builder: m_featureMembersBuilder) {
                     _instance.getMembers().add(builder.build());
                 }
             }
         }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from EnumerationTypeBuilder.");
        }
        if (m_nullCheck && _instance.getMembers().isEmpty()) {
            throw new IllegalArgumentException("Mandatory \"members\" list cannot be empty in EnumerationTypeBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see TypeBuilders#newEnumerationTypeBuilder()
     */
    private EnumerationTypeBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  TypeBuilders#useEnumerationTypeBuilder()
     */
    private EnumerationTypeBuilder(hu.blackbelt.judo.meta.psm.type.EnumerationType instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the EnumerationTypeBuilder.
     * @return new instance of the EnumerationTypeBuilder
     */
    public static EnumerationTypeBuilder create() {
        return new EnumerationTypeBuilder();
    }

    /**
     * This method creates a new instance of the EnumerationTypeBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the EnumerationTypeBuilder
     */
    public static EnumerationTypeBuilder create(boolean p_nullCheck) {
        return new EnumerationTypeBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the EnumerationTypeBuilder from the given instance of class.
     * @return new instance of the EnumerationTypeBuilder
     */
    public static EnumerationTypeBuilder use(hu.blackbelt.judo.meta.psm.type.EnumerationType instance) {
        return new EnumerationTypeBuilder(instance);
    }

    /**
     * This method creates a new instance of the EnumerationTypeBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the EnumerationTypeBuilder
     */
    public static EnumerationTypeBuilder use(hu.blackbelt.judo.meta.psm.type.EnumerationType instance, boolean p_nullCheck) {
        return new EnumerationTypeBuilder(instance).withNullCheck(p_nullCheck);
    }

    private EnumerationTypeBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public EnumerationTypeBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public EnumerationTypeBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }

     public EnumerationTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public EnumerationTypeBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public EnumerationTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public EnumerationTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_enumerationTypeBuilder){
         m_featureAnnotationsBuilder.add(p_enumerationTypeBuilder);
         return this;
     }
     public EnumerationTypeBuilder withMembers(hu.blackbelt.judo.meta.psm.type.EnumerationMember p_members){
         m_members.add(p_members);
         m_featureMembersSet = true;
         return this;
     }
     
     public EnumerationTypeBuilder withMembers(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.type.EnumerationMember> p_members){
         m_members.addAll(p_members);
         m_featureMembersSet = true;
         return this;
     }
     
     public EnumerationTypeBuilder withMembers(hu.blackbelt.judo.meta.psm.type.EnumerationMember...p_members){
         m_members.addAll(java.util.Arrays.asList(p_members));
         m_featureMembersSet = true;
         return this;
     }
     
     public EnumerationTypeBuilder withMembers(hu.blackbelt.judo.meta.psm.type.util.builder.ITypeBuilder<? extends hu.blackbelt.judo.meta.psm.type.EnumerationMember> p_enumerationTypeBuilder){
         m_featureMembersBuilder.add(p_enumerationTypeBuilder);
         return this;
     }
}
