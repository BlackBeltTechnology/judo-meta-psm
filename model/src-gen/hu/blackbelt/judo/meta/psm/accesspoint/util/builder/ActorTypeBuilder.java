package hu.blackbelt.judo.meta.psm.accesspoint.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.accesspoint.ActorType</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class ActorTypeBuilder implements IAccesspointBuilder<hu.blackbelt.judo.meta.psm.accesspoint.ActorType> {
    private  hu.blackbelt.judo.meta.psm.accesspoint.ActorType $instance = null;

    // features and builders
     private hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType m_actorType;
     private java.lang.String m_documentation;
     private java.lang.String m_kind;
     private java.lang.String m_name;
     private hu.blackbelt.judo.meta.psm.service.TransferObjectType m_override;
     private Boolean m_queryCustomizer;
     private java.lang.String m_realm;
     private hu.blackbelt.judo.meta.psm.service.TransferAttribute m_representation;
     private hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferAttribute> m_featureRepresentationBuilder;
     private hu.blackbelt.judo.meta.psm.service.TransferObjectType m_transferObjectType;

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
     private boolean m_featureKindSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureOperationsSet = false;
     private boolean m_featureOverrideSet = false;
     private boolean m_featureQueryCustomizerSet = false;
     private boolean m_featureRealmSet = false;
     private boolean m_featureRelationsSet = false;
     private boolean m_featureRepresentationSet = false;
     private boolean m_featureTransferObjectTypeSet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public ActorTypeBuilder but() {
           ActorTypeBuilder _builder = create();
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
          _builder.m_featureKindSet = m_featureKindSet;
          _builder.m_kind = m_kind;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureOperationsSet = m_featureOperationsSet;
          _builder.m_operations = m_operations;
          _builder.m_featureOverrideSet = m_featureOverrideSet;
          _builder.m_override = m_override;
          _builder.m_featureQueryCustomizerSet = m_featureQueryCustomizerSet;
          _builder.m_queryCustomizer = m_queryCustomizer;
          _builder.m_featureRealmSet = m_featureRealmSet;
          _builder.m_realm = m_realm;
          _builder.m_featureRelationsSet = m_featureRelationsSet;
          _builder.m_relations = m_relations;
          _builder.m_featureRelationsBuilder = m_featureRelationsBuilder;
          _builder.m_featureRepresentationSet = m_featureRepresentationSet;
          _builder.m_representation = m_representation;
          _builder.m_featureRepresentationBuilder = m_featureRepresentationBuilder;
          _builder.m_featureTransferObjectTypeSet = m_featureTransferObjectTypeSet;
          _builder.m_transferObjectType = m_transferObjectType;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.accesspoint.ActorType type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.accesspoint.ActorType type
     */
    public hu.blackbelt.judo.meta.psm.accesspoint.ActorType build() {

        final hu.blackbelt.judo.meta.psm.accesspoint.ActorType _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.accesspoint.AccesspointFactory.eINSTANCE.createActorType();
        } else {
            _instance = $instance;
        }

         if (m_featureActorTypeSet) {
             _instance.setActorType(m_actorType);
         }
         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureKindSet) {
             _instance.setKind(m_kind);
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
         if (m_featureRealmSet) {
             _instance.setRealm(m_realm);
         }
         if (m_featureRepresentationSet) {
             _instance.setRepresentation(m_representation);
         } else {
                 if (m_featureRepresentationBuilder != null) {
                     _instance.setRepresentation(m_featureRepresentationBuilder.build());
                 }
             }
         if (m_featureTransferObjectTypeSet) {
             _instance.setTransferObjectType(m_transferObjectType);
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
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from ActorTypeBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see AccesspointBuilders#newActorTypeBuilder()
     */
    private ActorTypeBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  AccesspointBuilders#useActorTypeBuilder()
     */
    private ActorTypeBuilder(hu.blackbelt.judo.meta.psm.accesspoint.ActorType instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the ActorTypeBuilder.
     * @return new instance of the ActorTypeBuilder
     */
    public static ActorTypeBuilder create() {
        return new ActorTypeBuilder();
    }

    /**
     * This method creates a new instance of the ActorTypeBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the ActorTypeBuilder
     */
    public static ActorTypeBuilder create(boolean p_nullCheck) {
        return new ActorTypeBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the ActorTypeBuilder from the given instance of class.
     * @return new instance of the ActorTypeBuilder
     */
    public static ActorTypeBuilder use(hu.blackbelt.judo.meta.psm.accesspoint.ActorType instance) {
        return new ActorTypeBuilder(instance);
    }

    /**
     * This method creates a new instance of the ActorTypeBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the ActorTypeBuilder
     */
    public static ActorTypeBuilder use(hu.blackbelt.judo.meta.psm.accesspoint.ActorType instance, boolean p_nullCheck) {
        return new ActorTypeBuilder(instance).withNullCheck(p_nullCheck);
    }

    private ActorTypeBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public ActorTypeBuilder withActorType(hu.blackbelt.judo.meta.psm.accesspoint.AbstractActorType p_actorType){
         m_actorType = p_actorType;
         m_featureActorTypeSet = true;
         return this;
     }
     public ActorTypeBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public ActorTypeBuilder withKind(java.lang.String p_kind){
         m_kind = p_kind;
         m_featureKindSet = true;
         return this;
     }
     public ActorTypeBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public ActorTypeBuilder withOverride(hu.blackbelt.judo.meta.psm.service.TransferObjectType p_override){
         m_override = p_override;
         m_featureOverrideSet = true;
         return this;
     }
     public ActorTypeBuilder withQueryCustomizer(Boolean p_queryCustomizer){
         m_queryCustomizer = p_queryCustomizer;
         m_featureQueryCustomizerSet = true;
         return this;
     }
     public ActorTypeBuilder withRealm(java.lang.String p_realm){
         m_realm = p_realm;
         m_featureRealmSet = true;
         return this;
     }
     public ActorTypeBuilder withRepresentation(hu.blackbelt.judo.meta.psm.service.TransferAttribute p_representation){
         m_representation = p_representation;
         m_featureRepresentationSet = true;
         return this;
     }
     public ActorTypeBuilder withRepresentation(hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferAttribute> p_actorTypeBuilder){
         m_featureRepresentationBuilder = p_actorTypeBuilder;
         return this;
     }
     public ActorTypeBuilder withTransferObjectType(hu.blackbelt.judo.meta.psm.service.TransferObjectType p_transferObjectType){
         m_transferObjectType = p_transferObjectType;
         m_featureTransferObjectTypeSet = true;
         return this;
     }

     public ActorTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public ActorTypeBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public ActorTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public ActorTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_actorTypeBuilder){
         m_featureAnnotationsBuilder.add(p_actorTypeBuilder);
         return this;
     }
     public ActorTypeBuilder withAttributes(hu.blackbelt.judo.meta.psm.service.TransferAttribute p_attributes){
         m_attributes.add(p_attributes);
         m_featureAttributesSet = true;
         return this;
     }
     
     public ActorTypeBuilder withAttributes(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.service.TransferAttribute> p_attributes){
         m_attributes.addAll(p_attributes);
         m_featureAttributesSet = true;
         return this;
     }
     
     public ActorTypeBuilder withAttributes(hu.blackbelt.judo.meta.psm.service.TransferAttribute...p_attributes){
         m_attributes.addAll(java.util.Arrays.asList(p_attributes));
         m_featureAttributesSet = true;
         return this;
     }
     
     public ActorTypeBuilder withAttributes(hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferAttribute> p_actorTypeBuilder){
         m_featureAttributesBuilder.add(p_actorTypeBuilder);
         return this;
     }
     public ActorTypeBuilder withOperations(hu.blackbelt.judo.meta.psm.service.TransferOperation p_operations){
         m_operations.add(p_operations);
         m_featureOperationsSet = true;
         return this;
     }
     
     public ActorTypeBuilder withOperations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.service.TransferOperation> p_operations){
         m_operations.addAll(p_operations);
         m_featureOperationsSet = true;
         return this;
     }
     
     public ActorTypeBuilder withOperations(hu.blackbelt.judo.meta.psm.service.TransferOperation...p_operations){
         m_operations.addAll(java.util.Arrays.asList(p_operations));
         m_featureOperationsSet = true;
         return this;
     }
     
     public ActorTypeBuilder withRelations(hu.blackbelt.judo.meta.psm.service.TransferObjectRelation p_relations){
         m_relations.add(p_relations);
         m_featureRelationsSet = true;
         return this;
     }
     
     public ActorTypeBuilder withRelations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.service.TransferObjectRelation> p_relations){
         m_relations.addAll(p_relations);
         m_featureRelationsSet = true;
         return this;
     }
     
     public ActorTypeBuilder withRelations(hu.blackbelt.judo.meta.psm.service.TransferObjectRelation...p_relations){
         m_relations.addAll(java.util.Arrays.asList(p_relations));
         m_featureRelationsSet = true;
         return this;
     }
     
     public ActorTypeBuilder withRelations(hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferObjectRelation> p_actorTypeBuilder){
         m_featureRelationsBuilder.add(p_actorTypeBuilder);
         return this;
     }

}
