package hu.blackbelt.judo.meta.psm.type.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.type.XMLType</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class XMLTypeBuilder implements ITypeBuilder<hu.blackbelt.judo.meta.psm.type.XMLType> {
    private  hu.blackbelt.judo.meta.psm.type.XMLType $instance = null;

    // features and builders
     private java.lang.String m_documentation;
     private java.lang.String m_name;
     private java.lang.String m_xmlElement;
     private java.lang.String m_xmlNamespace;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureXmlElementSet = false;
     private boolean m_featureXmlNamespaceSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.type.TypePackage.eINSTANCE.getEClassifier("XMLType");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public XMLTypeBuilder but() {
           XMLTypeBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureXmlElementSet = m_featureXmlElementSet;
          _builder.m_xmlElement = m_xmlElement;
          _builder.m_featureXmlNamespaceSet = m_featureXmlNamespaceSet;
          _builder.m_xmlNamespace = m_xmlNamespace;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.type.XMLType type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.type.XMLType type
     */
    public hu.blackbelt.judo.meta.psm.type.XMLType build() {

        final hu.blackbelt.judo.meta.psm.type.XMLType _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.type.TypeFactory.eINSTANCE.createXMLType();
        } else {
            _instance = $instance;
        }

         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureNameSet) {
             _instance.setName(m_name);
         }
         if (m_featureXmlElementSet) {
             _instance.setXmlElement(m_xmlElement);
         }
         if (m_featureXmlNamespaceSet) {
             _instance.setXmlNamespace(m_xmlNamespace);
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
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from XMLTypeBuilder.");
        }
        if (m_nullCheck && _instance.getXmlElement() == null) {
            throw new IllegalArgumentException("Mandatory \"xmlElement\" attribute is missing from XMLTypeBuilder.");
        }
        if (m_nullCheck && _instance.getXmlNamespace() == null) {
            throw new IllegalArgumentException("Mandatory \"xmlNamespace\" attribute is missing from XMLTypeBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see TypeBuilders#newXMLTypeBuilder()
     */
    private XMLTypeBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  TypeBuilders#useXMLTypeBuilder()
     */
    private XMLTypeBuilder(hu.blackbelt.judo.meta.psm.type.XMLType instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the XMLTypeBuilder.
     * @return new instance of the XMLTypeBuilder
     */
    public static XMLTypeBuilder create() {
        return new XMLTypeBuilder();
    }

    /**
     * This method creates a new instance of the XMLTypeBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the XMLTypeBuilder
     */
    public static XMLTypeBuilder create(boolean p_nullCheck) {
        return new XMLTypeBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the XMLTypeBuilder from the given instance of class.
     * @return new instance of the XMLTypeBuilder
     */
    public static XMLTypeBuilder use(hu.blackbelt.judo.meta.psm.type.XMLType instance) {
        return new XMLTypeBuilder(instance);
    }

    /**
     * This method creates a new instance of the XMLTypeBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the XMLTypeBuilder
     */
    public static XMLTypeBuilder use(hu.blackbelt.judo.meta.psm.type.XMLType instance, boolean p_nullCheck) {
        return new XMLTypeBuilder(instance).withNullCheck(p_nullCheck);
    }

    private XMLTypeBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public XMLTypeBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public XMLTypeBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public XMLTypeBuilder withXmlElement(java.lang.String p_xmlElement){
         m_xmlElement = p_xmlElement;
         m_featureXmlElementSet = true;
         return this;
     }
     public XMLTypeBuilder withXmlNamespace(java.lang.String p_xmlNamespace){
         m_xmlNamespace = p_xmlNamespace;
         m_featureXmlNamespaceSet = true;
         return this;
     }

     public XMLTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public XMLTypeBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public XMLTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public XMLTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_xMLTypeBuilder){
         m_featureAnnotationsBuilder.add(p_xMLTypeBuilder);
         return this;
     }
}
