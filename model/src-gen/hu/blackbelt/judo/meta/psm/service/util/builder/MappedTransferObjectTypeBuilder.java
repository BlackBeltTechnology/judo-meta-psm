package hu.blackbelt.judo.meta.psm.service.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class MappedTransferObjectTypeBuilder implements IServiceBuilder<hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType> {
    private  hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType $instance = null;

    // features and builders
     private hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType m_actorType;
     private java.lang.String m_documentation;
     private hu.blackbelt.judo.meta.psm.data.EntityType m_entityType;
     private hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.EntityType> m_featureEntityTypeBuilder;
     private hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType m_filter;
     private hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType> m_featureFilterBuilder;
     private java.lang.String m_name;
     private hu.blackbelt.judo.meta.psm.service.TransferObjectType m_override;
     private Boolean m_queryCustomizer;
     private hu.blackbelt.judo.meta.psm.service.TransferAttribute m_representation;
     private hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferAttribute> m_featureRepresentationBuilder;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.service.TransferAttribute> m_attributes = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.service.TransferAttribute>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferAttribute>> m_featureAttributesBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferAttribute>>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.service.TransferOperation> m_operations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.service.TransferOperation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.service.TransferObjectRelation> m_relations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.service.TransferObjectRelation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferObjectRelation>> m_featureRelationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferObjectRelation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureActorTypeSet = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureAttributesSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureEntityTypeSet = false;
     private boolean m_featureFilterSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureOperationsSet = false;
     private boolean m_featureOverrideSet = false;
     private boolean m_featureQueryCustomizerSet = false;
     private boolean m_featureRelationsSet = false;
     private boolean m_featureRepresentationSet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public MappedTransferObjectTypeBuilder but() {
           MappedTransferObjectTypeBuilder _builder = create();
          _builder.m_featureActorTypeSet = m_featureActorTypeSet;
          _builder.m_actorType = m_actorType;
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureAttributesSet = m_featureAttributesSet;
          _builder.m_attributes = m_attributes;
          _builder.m_featureAttributesBuilder = m_featureAttributesBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureEntityTypeSet = m_featureEntityTypeSet;
          _builder.m_entityType = m_entityType;
          _builder.m_featureEntityTypeBuilder = m_featureEntityTypeBuilder;
          _builder.m_featureFilterSet = m_featureFilterSet;
          _builder.m_filter = m_filter;
          _builder.m_featureFilterBuilder = m_featureFilterBuilder;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureOperationsSet = m_featureOperationsSet;
          _builder.m_operations = m_operations;
          _builder.m_featureOverrideSet = m_featureOverrideSet;
          _builder.m_override = m_override;
          _builder.m_featureQueryCustomizerSet = m_featureQueryCustomizerSet;
          _builder.m_queryCustomizer = m_queryCustomizer;
          _builder.m_featureRelationsSet = m_featureRelationsSet;
          _builder.m_relations = m_relations;
          _builder.m_featureRelationsBuilder = m_featureRelationsBuilder;
          _builder.m_featureRepresentationSet = m_featureRepresentationSet;
          _builder.m_representation = m_representation;
          _builder.m_featureRepresentationBuilder = m_featureRepresentationBuilder;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType type
     */
    public hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType build() {

        final hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.service.ServiceFactory.eINSTANCE.createMappedTransferObjectType();
        } else {
            _instance = $instance;
        }

         if (m_featureActorTypeSet) {
             _instance.setActorType(m_actorType);
         }
         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureEntityTypeSet) {
             _instance.setEntityType(m_entityType);
         } else {
                 if (m_featureEntityTypeBuilder != null) {
                     _instance.setEntityType(m_featureEntityTypeBuilder.build());
                 }
             }
         if (m_featureFilterSet) {
             _instance.setFilter(m_filter);
         } else {
                 if (m_featureFilterBuilder != null) {
                     _instance.setFilter(m_featureFilterBuilder.build());
                 }
             }
         if (m_featureNameSet) {
             _instance.setName(m_name);
         }
         if (m_featureOverrideSet) {
             _instance.setOverride(m_override);
         }
         if (m_featureQueryCustomizerSet) {
             _instance.setQueryCustomizer(m_queryCustomizer);
         }
         if (m_featureRepresentationSet) {
             _instance.setRepresentation(m_representation);
         } else {
                 if (m_featureRepresentationBuilder != null) {
                     _instance.setRepresentation(m_featureRepresentationBuilder.build());
                 }
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
         if(m_featureAttributesSet) {
             _instance.getAttributes().addAll(m_attributes);
         } else {
             if (!m_featureAttributesBuilder.isEmpty()) {
                 for (hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferAttribute> builder: m_featureAttributesBuilder) {
                     _instance.getAttributes().add(builder.build());
                 }
             }
         }
         if(m_featureOperationsSet) {
             _instance.getOperations().addAll(m_operations);
         }
         if(m_featureRelationsSet) {
             _instance.getRelations().addAll(m_relations);
         } else {
             if (!m_featureRelationsBuilder.isEmpty()) {
                 for (hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferObjectRelation> builder: m_featureRelationsBuilder) {
                     _instance.getRelations().add(builder.build());
                 }
             }
         }
        if (m_nullCheck && _instance.getEntityType() == null) {
            throw new IllegalArgumentException("Mandatory \"entityType\" attribute is missing from MappedTransferObjectTypeBuilder.");
        }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from MappedTransferObjectTypeBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see ServiceBuilders#newMappedTransferObjectTypeBuilder()
     */
    private MappedTransferObjectTypeBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  ServiceBuilders#useMappedTransferObjectTypeBuilder()
     */
    private MappedTransferObjectTypeBuilder(hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the MappedTransferObjectTypeBuilder.
     * @return new instance of the MappedTransferObjectTypeBuilder
     */
    public static MappedTransferObjectTypeBuilder create() {
        return new MappedTransferObjectTypeBuilder();
    }

    /**
     * This method creates a new instance of the MappedTransferObjectTypeBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the MappedTransferObjectTypeBuilder
     */
    public static MappedTransferObjectTypeBuilder create(boolean p_nullCheck) {
        return new MappedTransferObjectTypeBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the MappedTransferObjectTypeBuilder from the given instance of class.
     * @return new instance of the MappedTransferObjectTypeBuilder
     */
    public static MappedTransferObjectTypeBuilder use(hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType instance) {
        return new MappedTransferObjectTypeBuilder(instance);
    }

    /**
     * This method creates a new instance of the MappedTransferObjectTypeBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the MappedTransferObjectTypeBuilder
     */
    public static MappedTransferObjectTypeBuilder use(hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType instance, boolean p_nullCheck) {
        return new MappedTransferObjectTypeBuilder(instance).withNullCheck(p_nullCheck);
    }

    private MappedTransferObjectTypeBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public MappedTransferObjectTypeBuilder withActorType(hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType p_actorType){
         m_actorType = p_actorType;
         m_featureActorTypeSet = true;
         return this;
     }
     public MappedTransferObjectTypeBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public MappedTransferObjectTypeBuilder withEntityType(hu.blackbelt.judo.meta.psm.data.EntityType p_entityType){
         m_entityType = p_entityType;
         m_featureEntityTypeSet = true;
         return this;
     }
     public MappedTransferObjectTypeBuilder withEntityType(hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.EntityType> p_mappedTransferObjectTypeBuilder){
         m_featureEntityTypeBuilder = p_mappedTransferObjectTypeBuilder;
         return this;
     }
     public MappedTransferObjectTypeBuilder withFilter(hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType p_filter){
         m_filter = p_filter;
         m_featureFilterSet = true;
         return this;
     }
     public MappedTransferObjectTypeBuilder withFilter(hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType> p_mappedTransferObjectTypeBuilder){
         m_featureFilterBuilder = p_mappedTransferObjectTypeBuilder;
         return this;
     }
     public MappedTransferObjectTypeBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public MappedTransferObjectTypeBuilder withOverride(hu.blackbelt.judo.meta.psm.service.TransferObjectType p_override){
         m_override = p_override;
         m_featureOverrideSet = true;
         return this;
     }
     public MappedTransferObjectTypeBuilder withQueryCustomizer(Boolean p_queryCustomizer){
         m_queryCustomizer = p_queryCustomizer;
         m_featureQueryCustomizerSet = true;
         return this;
     }
     public MappedTransferObjectTypeBuilder withRepresentation(hu.blackbelt.judo.meta.psm.service.TransferAttribute p_representation){
         m_representation = p_representation;
         m_featureRepresentationSet = true;
         return this;
     }
     public MappedTransferObjectTypeBuilder withRepresentation(hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferAttribute> p_mappedTransferObjectTypeBuilder){
         m_featureRepresentationBuilder = p_mappedTransferObjectTypeBuilder;
         return this;
     }

     public MappedTransferObjectTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public MappedTransferObjectTypeBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public MappedTransferObjectTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public MappedTransferObjectTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_mappedTransferObjectTypeBuilder){
         m_featureAnnotationsBuilder.add(p_mappedTransferObjectTypeBuilder);
         return this;
     }
     public MappedTransferObjectTypeBuilder withAttributes(hu.blackbelt.judo.meta.psm.service.TransferAttribute p_attributes){
         m_attributes.add(p_attributes);
         m_featureAttributesSet = true;
         return this;
     }
     
     public MappedTransferObjectTypeBuilder withAttributes(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.service.TransferAttribute> p_attributes){
         m_attributes.addAll(p_attributes);
         m_featureAttributesSet = true;
         return this;
     }
     
     public MappedTransferObjectTypeBuilder withAttributes(hu.blackbelt.judo.meta.psm.service.TransferAttribute...p_attributes){
         m_attributes.addAll(java.util.Arrays.asList(p_attributes));
         m_featureAttributesSet = true;
         return this;
     }
     
     public MappedTransferObjectTypeBuilder withAttributes(hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferAttribute> p_mappedTransferObjectTypeBuilder){
         m_featureAttributesBuilder.add(p_mappedTransferObjectTypeBuilder);
         return this;
     }
     public MappedTransferObjectTypeBuilder withOperations(hu.blackbelt.judo.meta.psm.service.TransferOperation p_operations){
         m_operations.add(p_operations);
         m_featureOperationsSet = true;
         return this;
     }
     
     public MappedTransferObjectTypeBuilder withOperations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.service.TransferOperation> p_operations){
         m_operations.addAll(p_operations);
         m_featureOperationsSet = true;
         return this;
     }
     
     public MappedTransferObjectTypeBuilder withOperations(hu.blackbelt.judo.meta.psm.service.TransferOperation...p_operations){
         m_operations.addAll(java.util.Arrays.asList(p_operations));
         m_featureOperationsSet = true;
         return this;
     }
     
     public MappedTransferObjectTypeBuilder withRelations(hu.blackbelt.judo.meta.psm.service.TransferObjectRelation p_relations){
         m_relations.add(p_relations);
         m_featureRelationsSet = true;
         return this;
     }
     
     public MappedTransferObjectTypeBuilder withRelations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.service.TransferObjectRelation> p_relations){
         m_relations.addAll(p_relations);
         m_featureRelationsSet = true;
         return this;
     }
     
     public MappedTransferObjectTypeBuilder withRelations(hu.blackbelt.judo.meta.psm.service.TransferObjectRelation...p_relations){
         m_relations.addAll(java.util.Arrays.asList(p_relations));
         m_featureRelationsSet = true;
         return this;
     }
     
     public MappedTransferObjectTypeBuilder withRelations(hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferObjectRelation> p_mappedTransferObjectTypeBuilder){
         m_featureRelationsBuilder.add(p_mappedTransferObjectTypeBuilder);
         return this;
     }

}
