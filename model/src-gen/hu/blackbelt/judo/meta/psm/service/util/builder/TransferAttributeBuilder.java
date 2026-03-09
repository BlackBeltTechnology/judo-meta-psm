package hu.blackbelt.judo.meta.psm.service.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.service.TransferAttribute</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class TransferAttributeBuilder implements IServiceBuilder<hu.blackbelt.judo.meta.psm.service.TransferAttribute> {
    private  hu.blackbelt.judo.meta.psm.service.TransferAttribute $instance = null;

    // features and builders
     private hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement m_binding;
     private java.lang.String m_claimType;
     private hu.blackbelt.judo.meta.psm.type.Primitive m_dataType;
     private hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor m_defaultValue;
     private java.lang.String m_documentation;
     private java.lang.String m_name;
     private Boolean m_required;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureBindingSet = false;
     private boolean m_featureClaimTypeSet = false;
     private boolean m_featureDataTypeSet = false;
     private boolean m_featureDefaultValueSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureRequiredSet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public TransferAttributeBuilder but() {
           TransferAttributeBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureBindingSet = m_featureBindingSet;
          _builder.m_binding = m_binding;
          _builder.m_featureClaimTypeSet = m_featureClaimTypeSet;
          _builder.m_claimType = m_claimType;
          _builder.m_featureDataTypeSet = m_featureDataTypeSet;
          _builder.m_dataType = m_dataType;
          _builder.m_featureDefaultValueSet = m_featureDefaultValueSet;
          _builder.m_defaultValue = m_defaultValue;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureRequiredSet = m_featureRequiredSet;
          _builder.m_required = m_required;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.service.TransferAttribute type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.service.TransferAttribute type
     */
    public hu.blackbelt.judo.meta.psm.service.TransferAttribute build() {

        final hu.blackbelt.judo.meta.psm.service.TransferAttribute _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.service.ServiceFactory.eINSTANCE.createTransferAttribute();
        } else {
            _instance = $instance;
        }

         if (m_featureBindingSet) {
             _instance.setBinding(m_binding);
         }
         if (m_featureClaimTypeSet) {
             _instance.setClaimType(m_claimType);
         }
         if (m_featureDataTypeSet) {
             _instance.setDataType(m_dataType);
         }
         if (m_featureDefaultValueSet) {
             _instance.setDefaultValue(m_defaultValue);
         }
         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureNameSet) {
             _instance.setName(m_name);
         }
         if (m_featureRequiredSet) {
             _instance.setRequired(m_required);
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
            throw new IllegalArgumentException("Mandatory \"dataType\" attribute is missing from TransferAttributeBuilder.");
        }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from TransferAttributeBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see ServiceBuilders#newTransferAttributeBuilder()
     */
    private TransferAttributeBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  ServiceBuilders#useTransferAttributeBuilder()
     */
    private TransferAttributeBuilder(hu.blackbelt.judo.meta.psm.service.TransferAttribute instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the TransferAttributeBuilder.
     * @return new instance of the TransferAttributeBuilder
     */
    public static TransferAttributeBuilder create() {
        return new TransferAttributeBuilder();
    }

    /**
     * This method creates a new instance of the TransferAttributeBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the TransferAttributeBuilder
     */
    public static TransferAttributeBuilder create(boolean p_nullCheck) {
        return new TransferAttributeBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the TransferAttributeBuilder from the given instance of class.
     * @return new instance of the TransferAttributeBuilder
     */
    public static TransferAttributeBuilder use(hu.blackbelt.judo.meta.psm.service.TransferAttribute instance) {
        return new TransferAttributeBuilder(instance);
    }

    /**
     * This method creates a new instance of the TransferAttributeBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the TransferAttributeBuilder
     */
    public static TransferAttributeBuilder use(hu.blackbelt.judo.meta.psm.service.TransferAttribute instance, boolean p_nullCheck) {
        return new TransferAttributeBuilder(instance).withNullCheck(p_nullCheck);
    }

    private TransferAttributeBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public TransferAttributeBuilder withBinding(hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement p_binding){
         m_binding = p_binding;
         m_featureBindingSet = true;
         return this;
     }
     public TransferAttributeBuilder withClaimType(java.lang.String p_claimType){
         m_claimType = p_claimType;
         m_featureClaimTypeSet = true;
         return this;
     }
     public TransferAttributeBuilder withDataType(hu.blackbelt.judo.meta.psm.type.Primitive p_dataType){
         m_dataType = p_dataType;
         m_featureDataTypeSet = true;
         return this;
     }
     public TransferAttributeBuilder withDefaultValue(hu.blackbelt.judo.meta.psm.derived.PrimitiveAccessor p_defaultValue){
         m_defaultValue = p_defaultValue;
         m_featureDefaultValueSet = true;
         return this;
     }
     public TransferAttributeBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public TransferAttributeBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public TransferAttributeBuilder withRequired(Boolean p_required){
         m_required = p_required;
         m_featureRequiredSet = true;
         return this;
     }

     public TransferAttributeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public TransferAttributeBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public TransferAttributeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public TransferAttributeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_transferAttributeBuilder){
         m_featureAnnotationsBuilder.add(p_transferAttributeBuilder);
         return this;
     }

}
