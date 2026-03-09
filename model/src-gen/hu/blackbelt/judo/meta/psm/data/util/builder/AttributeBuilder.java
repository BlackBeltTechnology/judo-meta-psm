package hu.blackbelt.judo.meta.psm.data.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.data.Attribute</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class AttributeBuilder implements IDataBuilder<hu.blackbelt.judo.meta.psm.data.Attribute> {
    private  hu.blackbelt.judo.meta.psm.data.Attribute $instance = null;

    // features and builders
     private hu.blackbelt.judo.meta.psm.type.Primitive m_dataType;
     private java.lang.String m_documentation;
     private Boolean m_identifier;
     private java.lang.String m_name;
     private Boolean m_required;
     private Boolean m_unmappedDefaultOnly;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureDataTypeSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureIdentifierSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureRequiredSet = false;
     private boolean m_featureUnmappedDefaultOnlySet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public AttributeBuilder but() {
           AttributeBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureDataTypeSet = m_featureDataTypeSet;
          _builder.m_dataType = m_dataType;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureIdentifierSet = m_featureIdentifierSet;
          _builder.m_identifier = m_identifier;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureRequiredSet = m_featureRequiredSet;
          _builder.m_required = m_required;
          _builder.m_featureUnmappedDefaultOnlySet = m_featureUnmappedDefaultOnlySet;
          _builder.m_unmappedDefaultOnly = m_unmappedDefaultOnly;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.data.Attribute type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.data.Attribute type
     */
    public hu.blackbelt.judo.meta.psm.data.Attribute build() {

        final hu.blackbelt.judo.meta.psm.data.Attribute _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.data.DataFactory.eINSTANCE.createAttribute();
        } else {
            _instance = $instance;
        }

         if (m_featureDataTypeSet) {
             _instance.setDataType(m_dataType);
         }
         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureIdentifierSet) {
             _instance.setIdentifier(m_identifier);
         }
         if (m_featureNameSet) {
             _instance.setName(m_name);
         }
         if (m_featureRequiredSet) {
             _instance.setRequired(m_required);
         }
         if (m_featureUnmappedDefaultOnlySet) {
             _instance.setUnmappedDefaultOnly(m_unmappedDefaultOnly);
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
        if (m_nullCheck && _instance.getDataType() == null) {
            throw new IllegalArgumentException("Mandatory \"dataType\" attribute is missing from AttributeBuilder.");
        }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from AttributeBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see DataBuilders#newAttributeBuilder()
     */
    private AttributeBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  DataBuilders#useAttributeBuilder()
     */
    private AttributeBuilder(hu.blackbelt.judo.meta.psm.data.Attribute instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the AttributeBuilder.
     * @return new instance of the AttributeBuilder
     */
    public static AttributeBuilder create() {
        return new AttributeBuilder();
    }

    /**
     * This method creates a new instance of the AttributeBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the AttributeBuilder
     */
    public static AttributeBuilder create(boolean p_nullCheck) {
        return new AttributeBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the AttributeBuilder from the given instance of class.
     * @return new instance of the AttributeBuilder
     */
    public static AttributeBuilder use(hu.blackbelt.judo.meta.psm.data.Attribute instance) {
        return new AttributeBuilder(instance);
    }

    /**
     * This method creates a new instance of the AttributeBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the AttributeBuilder
     */
    public static AttributeBuilder use(hu.blackbelt.judo.meta.psm.data.Attribute instance, boolean p_nullCheck) {
        return new AttributeBuilder(instance).withNullCheck(p_nullCheck);
    }

    private AttributeBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public AttributeBuilder withDataType(hu.blackbelt.judo.meta.psm.type.Primitive p_dataType){
         m_dataType = p_dataType;
         m_featureDataTypeSet = true;
         return this;
     }
     public AttributeBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public AttributeBuilder withIdentifier(Boolean p_identifier){
         m_identifier = p_identifier;
         m_featureIdentifierSet = true;
         return this;
     }
     public AttributeBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public AttributeBuilder withRequired(Boolean p_required){
         m_required = p_required;
         m_featureRequiredSet = true;
         return this;
     }
     public AttributeBuilder withUnmappedDefaultOnly(Boolean p_unmappedDefaultOnly){
         m_unmappedDefaultOnly = p_unmappedDefaultOnly;
         m_featureUnmappedDefaultOnlySet = true;
         return this;
     }

     public AttributeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public AttributeBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public AttributeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public AttributeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_attributeBuilder){
         m_featureAnnotationsBuilder.add(p_attributeBuilder);
         return this;
     }

}
