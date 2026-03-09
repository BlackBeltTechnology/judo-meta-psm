package hu.blackbelt.judo.meta.psm.service.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.service.TransferObjectRelation</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class TransferObjectRelationBuilder implements IServiceBuilder<hu.blackbelt.judo.meta.psm.service.TransferObjectRelation> {
    private  hu.blackbelt.judo.meta.psm.service.TransferObjectRelation $instance = null;

    // features and builders
     private Boolean m_access;
     private hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement m_binding;
     private hu.blackbelt.judo.meta.psm.type.Cardinality m_cardinality;
     private hu.blackbelt.judo.meta.psm.type.util.builder.ITypeBuilder<? extends hu.blackbelt.judo.meta.psm.type.Cardinality> m_featureCardinalityBuilder;
     private hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor m_defaultValue;
     private java.lang.String m_documentation;
     private Boolean m_embedded;
     private Boolean m_embeddedCreate;
     private Boolean m_embeddedDelete;
     private Boolean m_embeddedUpdate;
     private java.lang.String m_name;
     private hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor m_range;
     private hu.blackbelt.judo.meta.psm.service.TransferObjectType m_target;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAccessSet = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureBindingSet = false;
     private boolean m_featureCardinalitySet = false;
     private boolean m_featureDefaultValueSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureEmbeddedSet = false;
     private boolean m_featureEmbeddedCreateSet = false;
     private boolean m_featureEmbeddedDeleteSet = false;
     private boolean m_featureEmbeddedUpdateSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureRangeSet = false;
     private boolean m_featureTargetSet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public TransferObjectRelationBuilder but() {
           TransferObjectRelationBuilder _builder = create();
          _builder.m_featureAccessSet = m_featureAccessSet;
          _builder.m_access = m_access;
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureBindingSet = m_featureBindingSet;
          _builder.m_binding = m_binding;
          _builder.m_featureCardinalitySet = m_featureCardinalitySet;
          _builder.m_cardinality = m_cardinality;
          _builder.m_featureCardinalityBuilder = m_featureCardinalityBuilder;
          _builder.m_featureDefaultValueSet = m_featureDefaultValueSet;
          _builder.m_defaultValue = m_defaultValue;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureEmbeddedSet = m_featureEmbeddedSet;
          _builder.m_embedded = m_embedded;
          _builder.m_featureEmbeddedCreateSet = m_featureEmbeddedCreateSet;
          _builder.m_embeddedCreate = m_embeddedCreate;
          _builder.m_featureEmbeddedDeleteSet = m_featureEmbeddedDeleteSet;
          _builder.m_embeddedDelete = m_embeddedDelete;
          _builder.m_featureEmbeddedUpdateSet = m_featureEmbeddedUpdateSet;
          _builder.m_embeddedUpdate = m_embeddedUpdate;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureRangeSet = m_featureRangeSet;
          _builder.m_range = m_range;
          _builder.m_featureTargetSet = m_featureTargetSet;
          _builder.m_target = m_target;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.service.TransferObjectRelation type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.service.TransferObjectRelation type
     */
    public hu.blackbelt.judo.meta.psm.service.TransferObjectRelation build() {

        final hu.blackbelt.judo.meta.psm.service.TransferObjectRelation _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.service.ServiceFactory.eINSTANCE.createTransferObjectRelation();
        } else {
            _instance = $instance;
        }

         if (m_featureAccessSet) {
             _instance.setAccess(m_access);
         }
         if (m_featureBindingSet) {
             _instance.setBinding(m_binding);
         }
         if (m_featureCardinalitySet) {
             _instance.setCardinality(m_cardinality);
         } else {
                 if (m_featureCardinalityBuilder != null) {
                     _instance.setCardinality(m_featureCardinalityBuilder.build());
                 }
             }
         if (m_featureDefaultValueSet) {
             _instance.setDefaultValue(m_defaultValue);
         }
         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureEmbeddedSet) {
             _instance.setEmbedded(m_embedded);
         }
         if (m_featureEmbeddedCreateSet) {
             _instance.setEmbeddedCreate(m_embeddedCreate);
         }
         if (m_featureEmbeddedDeleteSet) {
             _instance.setEmbeddedDelete(m_embeddedDelete);
         }
         if (m_featureEmbeddedUpdateSet) {
             _instance.setEmbeddedUpdate(m_embeddedUpdate);
         }
         if (m_featureNameSet) {
             _instance.setName(m_name);
         }
         if (m_featureRangeSet) {
             _instance.setRange(m_range);
         }
         if (m_featureTargetSet) {
             _instance.setTarget(m_target);
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
            throw new IllegalArgumentException("Mandatory \"cardinality\" attribute is missing from TransferObjectRelationBuilder.");
        }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from TransferObjectRelationBuilder.");
        }
        if (m_nullCheck && _instance.getTarget() == null) {
            throw new IllegalArgumentException("Mandatory \"target\" attribute is missing from TransferObjectRelationBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see ServiceBuilders#newTransferObjectRelationBuilder()
     */
    private TransferObjectRelationBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  ServiceBuilders#useTransferObjectRelationBuilder()
     */
    private TransferObjectRelationBuilder(hu.blackbelt.judo.meta.psm.service.TransferObjectRelation instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the TransferObjectRelationBuilder.
     * @return new instance of the TransferObjectRelationBuilder
     */
    public static TransferObjectRelationBuilder create() {
        return new TransferObjectRelationBuilder();
    }

    /**
     * This method creates a new instance of the TransferObjectRelationBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the TransferObjectRelationBuilder
     */
    public static TransferObjectRelationBuilder create(boolean p_nullCheck) {
        return new TransferObjectRelationBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the TransferObjectRelationBuilder from the given instance of class.
     * @return new instance of the TransferObjectRelationBuilder
     */
    public static TransferObjectRelationBuilder use(hu.blackbelt.judo.meta.psm.service.TransferObjectRelation instance) {
        return new TransferObjectRelationBuilder(instance);
    }

    /**
     * This method creates a new instance of the TransferObjectRelationBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the TransferObjectRelationBuilder
     */
    public static TransferObjectRelationBuilder use(hu.blackbelt.judo.meta.psm.service.TransferObjectRelation instance, boolean p_nullCheck) {
        return new TransferObjectRelationBuilder(instance).withNullCheck(p_nullCheck);
    }

    private TransferObjectRelationBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public TransferObjectRelationBuilder withAccess(Boolean p_access){
         m_access = p_access;
         m_featureAccessSet = true;
         return this;
     }
     public TransferObjectRelationBuilder withBinding(hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement p_binding){
         m_binding = p_binding;
         m_featureBindingSet = true;
         return this;
     }
     public TransferObjectRelationBuilder withCardinality(hu.blackbelt.judo.meta.psm.type.Cardinality p_cardinality){
         m_cardinality = p_cardinality;
         m_featureCardinalitySet = true;
         return this;
     }
     public TransferObjectRelationBuilder withCardinality(hu.blackbelt.judo.meta.psm.type.util.builder.ITypeBuilder<? extends hu.blackbelt.judo.meta.psm.type.Cardinality> p_transferObjectRelationBuilder){
         m_featureCardinalityBuilder = p_transferObjectRelationBuilder;
         return this;
     }
     public TransferObjectRelationBuilder withDefaultValue(hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor p_defaultValue){
         m_defaultValue = p_defaultValue;
         m_featureDefaultValueSet = true;
         return this;
     }
     public TransferObjectRelationBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public TransferObjectRelationBuilder withEmbedded(Boolean p_embedded){
         m_embedded = p_embedded;
         m_featureEmbeddedSet = true;
         return this;
     }
     public TransferObjectRelationBuilder withEmbeddedCreate(Boolean p_embeddedCreate){
         m_embeddedCreate = p_embeddedCreate;
         m_featureEmbeddedCreateSet = true;
         return this;
     }
     public TransferObjectRelationBuilder withEmbeddedDelete(Boolean p_embeddedDelete){
         m_embeddedDelete = p_embeddedDelete;
         m_featureEmbeddedDeleteSet = true;
         return this;
     }
     public TransferObjectRelationBuilder withEmbeddedUpdate(Boolean p_embeddedUpdate){
         m_embeddedUpdate = p_embeddedUpdate;
         m_featureEmbeddedUpdateSet = true;
         return this;
     }
     public TransferObjectRelationBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public TransferObjectRelationBuilder withRange(hu.blackbelt.judo.meta.psm.derived.ReferenceAccessor p_range){
         m_range = p_range;
         m_featureRangeSet = true;
         return this;
     }
     public TransferObjectRelationBuilder withTarget(hu.blackbelt.judo.meta.psm.service.TransferObjectType p_target){
         m_target = p_target;
         m_featureTargetSet = true;
         return this;
     }

     public TransferObjectRelationBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public TransferObjectRelationBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public TransferObjectRelationBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public TransferObjectRelationBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_transferObjectRelationBuilder){
         m_featureAnnotationsBuilder.add(p_transferObjectRelationBuilder);
         return this;
     }

}
