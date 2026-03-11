package hu.blackbelt.judo.meta.psm.data.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.data.EntityType</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class EntityTypeBuilder implements IDataBuilder<hu.blackbelt.judo.meta.psm.data.EntityType> {
    private  hu.blackbelt.judo.meta.psm.data.EntityType $instance = null;

    // features and builders
     private Boolean m_abstract_;
     private hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType m_defaultRepresentation;
     private hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType> m_featureDefaultRepresentationBuilder;
     private java.lang.String m_documentation;
     private java.lang.String m_name;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.data.Attribute> m_attributes = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.data.Attribute>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.Attribute>> m_featureAttributesBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.Attribute>>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint> m_constraints = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.constraint.util.builder.IConstraintBuilder<? extends hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint>> m_featureConstraintsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.constraint.util.builder.IConstraintBuilder<? extends hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint>>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.derived.DataProperty> m_dataProperties = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.derived.DataProperty>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.DataProperty>> m_featureDataPropertiesBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.DataProperty>>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.derived.NavigationProperty> m_navigationProperties = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.derived.NavigationProperty>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.NavigationProperty>> m_featureNavigationPropertiesBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.NavigationProperty>>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.data.BoundOperation> m_operations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.data.BoundOperation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.BoundOperation>> m_featureOperationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.BoundOperation>>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.data.Relation> m_relations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.data.Relation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.data.EntitySequence> m_sequences = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.data.EntitySequence>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.EntitySequence>> m_featureSequencesBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.EntitySequence>>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.data.EntityType> m_superEntityTypes = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.data.EntityType>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.EntityType>> m_featureSuperEntityTypesBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.EntityType>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAbstract_Set = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureAttributesSet = false;
     private boolean m_featureConstraintsSet = false;
     private boolean m_featureDataPropertiesSet = false;
     private boolean m_featureDefaultRepresentationSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureNavigationPropertiesSet = false;
     private boolean m_featureOperationsSet = false;
     private boolean m_featureRelationsSet = false;
     private boolean m_featureSequencesSet = false;
     private boolean m_featureSuperEntityTypesSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.data.DataPackage.eINSTANCE.getEClassifier("EntityType");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public EntityTypeBuilder but() {
           EntityTypeBuilder _builder = create();
          _builder.m_featureAbstract_Set = m_featureAbstract_Set;
          _builder.m_abstract_ = m_abstract_;
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureAttributesSet = m_featureAttributesSet;
          _builder.m_attributes = m_attributes;
          _builder.m_featureAttributesBuilder = m_featureAttributesBuilder;
          _builder.m_featureConstraintsSet = m_featureConstraintsSet;
          _builder.m_constraints = m_constraints;
          _builder.m_featureConstraintsBuilder = m_featureConstraintsBuilder;
          _builder.m_featureDataPropertiesSet = m_featureDataPropertiesSet;
          _builder.m_dataProperties = m_dataProperties;
          _builder.m_featureDataPropertiesBuilder = m_featureDataPropertiesBuilder;
          _builder.m_featureDefaultRepresentationSet = m_featureDefaultRepresentationSet;
          _builder.m_defaultRepresentation = m_defaultRepresentation;
          _builder.m_featureDefaultRepresentationBuilder = m_featureDefaultRepresentationBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureNavigationPropertiesSet = m_featureNavigationPropertiesSet;
          _builder.m_navigationProperties = m_navigationProperties;
          _builder.m_featureNavigationPropertiesBuilder = m_featureNavigationPropertiesBuilder;
          _builder.m_featureOperationsSet = m_featureOperationsSet;
          _builder.m_operations = m_operations;
          _builder.m_featureOperationsBuilder = m_featureOperationsBuilder;
          _builder.m_featureRelationsSet = m_featureRelationsSet;
          _builder.m_relations = m_relations;
          _builder.m_featureSequencesSet = m_featureSequencesSet;
          _builder.m_sequences = m_sequences;
          _builder.m_featureSequencesBuilder = m_featureSequencesBuilder;
          _builder.m_featureSuperEntityTypesSet = m_featureSuperEntityTypesSet;
          _builder.m_superEntityTypes = m_superEntityTypes;
          _builder.m_featureSuperEntityTypesBuilder = m_featureSuperEntityTypesBuilder;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.data.EntityType type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.data.EntityType type
     */
    public hu.blackbelt.judo.meta.psm.data.EntityType build() {

        final hu.blackbelt.judo.meta.psm.data.EntityType _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.data.DataFactory.eINSTANCE.createEntityType();
        } else {
            _instance = $instance;
        }

         if (m_featureAbstract_Set) {
             _instance.setAbstract(m_abstract_);
         }
         if (m_featureDefaultRepresentationSet) {
             _instance.setDefaultRepresentation(m_defaultRepresentation);
         } else {
                 if (m_featureDefaultRepresentationBuilder != null) {
                     _instance.setDefaultRepresentation(m_featureDefaultRepresentationBuilder.build());
                 }
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
         if(m_featureAttributesSet) {
             _instance.getAttributes().addAll(m_attributes);
         } else {
             if (!m_featureAttributesBuilder.isEmpty()) {
                 for (hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.Attribute> builder: m_featureAttributesBuilder) {
                     _instance.getAttributes().add(builder.build());
                 }
             }
         }
         if(m_featureConstraintsSet) {
             _instance.getConstraints().addAll(m_constraints);
         } else {
             if (!m_featureConstraintsBuilder.isEmpty()) {
                 for (hu.blackbelt.judo.meta.psm.constraint.util.builder.IConstraintBuilder<? extends hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint> builder: m_featureConstraintsBuilder) {
                     _instance.getConstraints().add(builder.build());
                 }
             }
         }
         if(m_featureDataPropertiesSet) {
             _instance.getDataProperties().addAll(m_dataProperties);
         } else {
             if (!m_featureDataPropertiesBuilder.isEmpty()) {
                 for (hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.DataProperty> builder: m_featureDataPropertiesBuilder) {
                     _instance.getDataProperties().add(builder.build());
                 }
             }
         }
         if(m_featureNavigationPropertiesSet) {
             _instance.getNavigationProperties().addAll(m_navigationProperties);
         } else {
             if (!m_featureNavigationPropertiesBuilder.isEmpty()) {
                 for (hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.NavigationProperty> builder: m_featureNavigationPropertiesBuilder) {
                     _instance.getNavigationProperties().add(builder.build());
                 }
             }
         }
         if(m_featureOperationsSet) {
             _instance.getOperations().addAll(m_operations);
         } else {
             if (!m_featureOperationsBuilder.isEmpty()) {
                 for (hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.BoundOperation> builder: m_featureOperationsBuilder) {
                     _instance.getOperations().add(builder.build());
                 }
             }
         }
         if(m_featureRelationsSet) {
             _instance.getRelations().addAll(m_relations);
         }
         if(m_featureSequencesSet) {
             _instance.getSequences().addAll(m_sequences);
         } else {
             if (!m_featureSequencesBuilder.isEmpty()) {
                 for (hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.EntitySequence> builder: m_featureSequencesBuilder) {
                     _instance.getSequences().add(builder.build());
                 }
             }
         }
         if(m_featureSuperEntityTypesSet) {
             _instance.getSuperEntityTypes().addAll(m_superEntityTypes);
         } else {
             if (!m_featureSuperEntityTypesBuilder.isEmpty()) {
                 for (hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.EntityType> builder: m_featureSuperEntityTypesBuilder) {
                     _instance.getSuperEntityTypes().add(builder.build());
                 }
             }
         }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from EntityTypeBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see DataBuilders#newEntityTypeBuilder()
     */
    private EntityTypeBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  DataBuilders#useEntityTypeBuilder()
     */
    private EntityTypeBuilder(hu.blackbelt.judo.meta.psm.data.EntityType instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the EntityTypeBuilder.
     * @return new instance of the EntityTypeBuilder
     */
    public static EntityTypeBuilder create() {
        return new EntityTypeBuilder();
    }

    /**
     * This method creates a new instance of the EntityTypeBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the EntityTypeBuilder
     */
    public static EntityTypeBuilder create(boolean p_nullCheck) {
        return new EntityTypeBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the EntityTypeBuilder from the given instance of class.
     * @return new instance of the EntityTypeBuilder
     */
    public static EntityTypeBuilder use(hu.blackbelt.judo.meta.psm.data.EntityType instance) {
        return new EntityTypeBuilder(instance);
    }

    /**
     * This method creates a new instance of the EntityTypeBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the EntityTypeBuilder
     */
    public static EntityTypeBuilder use(hu.blackbelt.judo.meta.psm.data.EntityType instance, boolean p_nullCheck) {
        return new EntityTypeBuilder(instance).withNullCheck(p_nullCheck);
    }

    private EntityTypeBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public EntityTypeBuilder withAbstract_(Boolean p_abstract_){
         m_abstract_ = p_abstract_;
         m_featureAbstract_Set = true;
         return this;
     }
     public EntityTypeBuilder withDefaultRepresentation(hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType p_defaultRepresentation){
         m_defaultRepresentation = p_defaultRepresentation;
         m_featureDefaultRepresentationSet = true;
         return this;
     }
     public EntityTypeBuilder withDefaultRepresentation(hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType> p_entityTypeBuilder){
         m_featureDefaultRepresentationBuilder = p_entityTypeBuilder;
         return this;
     }
     public EntityTypeBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public EntityTypeBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }

     public EntityTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public EntityTypeBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public EntityTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public EntityTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_entityTypeBuilder){
         m_featureAnnotationsBuilder.add(p_entityTypeBuilder);
         return this;
     }
     public EntityTypeBuilder withAttributes(hu.blackbelt.judo.meta.psm.data.Attribute p_attributes){
         m_attributes.add(p_attributes);
         m_featureAttributesSet = true;
         return this;
     }
     
     public EntityTypeBuilder withAttributes(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.data.Attribute> p_attributes){
         m_attributes.addAll(p_attributes);
         m_featureAttributesSet = true;
         return this;
     }
     
     public EntityTypeBuilder withAttributes(hu.blackbelt.judo.meta.psm.data.Attribute...p_attributes){
         m_attributes.addAll(java.util.Arrays.asList(p_attributes));
         m_featureAttributesSet = true;
         return this;
     }
     
     public EntityTypeBuilder withAttributes(hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.Attribute> p_entityTypeBuilder){
         m_featureAttributesBuilder.add(p_entityTypeBuilder);
         return this;
     }
     public EntityTypeBuilder withConstraints(hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint p_constraints){
         m_constraints.add(p_constraints);
         m_featureConstraintsSet = true;
         return this;
     }
     
     public EntityTypeBuilder withConstraints(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint> p_constraints){
         m_constraints.addAll(p_constraints);
         m_featureConstraintsSet = true;
         return this;
     }
     
     public EntityTypeBuilder withConstraints(hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint...p_constraints){
         m_constraints.addAll(java.util.Arrays.asList(p_constraints));
         m_featureConstraintsSet = true;
         return this;
     }
     
     public EntityTypeBuilder withConstraints(hu.blackbelt.judo.meta.psm.constraint.util.builder.IConstraintBuilder<? extends hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint> p_entityTypeBuilder){
         m_featureConstraintsBuilder.add(p_entityTypeBuilder);
         return this;
     }
     public EntityTypeBuilder withDataProperties(hu.blackbelt.judo.meta.psm.derived.DataProperty p_dataProperties){
         m_dataProperties.add(p_dataProperties);
         m_featureDataPropertiesSet = true;
         return this;
     }
     
     public EntityTypeBuilder withDataProperties(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.derived.DataProperty> p_dataProperties){
         m_dataProperties.addAll(p_dataProperties);
         m_featureDataPropertiesSet = true;
         return this;
     }
     
     public EntityTypeBuilder withDataProperties(hu.blackbelt.judo.meta.psm.derived.DataProperty...p_dataProperties){
         m_dataProperties.addAll(java.util.Arrays.asList(p_dataProperties));
         m_featureDataPropertiesSet = true;
         return this;
     }
     
     public EntityTypeBuilder withDataProperties(hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.DataProperty> p_entityTypeBuilder){
         m_featureDataPropertiesBuilder.add(p_entityTypeBuilder);
         return this;
     }
     public EntityTypeBuilder withNavigationProperties(hu.blackbelt.judo.meta.psm.derived.NavigationProperty p_navigationProperties){
         m_navigationProperties.add(p_navigationProperties);
         m_featureNavigationPropertiesSet = true;
         return this;
     }
     
     public EntityTypeBuilder withNavigationProperties(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.derived.NavigationProperty> p_navigationProperties){
         m_navigationProperties.addAll(p_navigationProperties);
         m_featureNavigationPropertiesSet = true;
         return this;
     }
     
     public EntityTypeBuilder withNavigationProperties(hu.blackbelt.judo.meta.psm.derived.NavigationProperty...p_navigationProperties){
         m_navigationProperties.addAll(java.util.Arrays.asList(p_navigationProperties));
         m_featureNavigationPropertiesSet = true;
         return this;
     }
     
     public EntityTypeBuilder withNavigationProperties(hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.NavigationProperty> p_entityTypeBuilder){
         m_featureNavigationPropertiesBuilder.add(p_entityTypeBuilder);
         return this;
     }
     public EntityTypeBuilder withOperations(hu.blackbelt.judo.meta.psm.data.BoundOperation p_operations){
         m_operations.add(p_operations);
         m_featureOperationsSet = true;
         return this;
     }
     
     public EntityTypeBuilder withOperations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.data.BoundOperation> p_operations){
         m_operations.addAll(p_operations);
         m_featureOperationsSet = true;
         return this;
     }
     
     public EntityTypeBuilder withOperations(hu.blackbelt.judo.meta.psm.data.BoundOperation...p_operations){
         m_operations.addAll(java.util.Arrays.asList(p_operations));
         m_featureOperationsSet = true;
         return this;
     }
     
     public EntityTypeBuilder withOperations(hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.BoundOperation> p_entityTypeBuilder){
         m_featureOperationsBuilder.add(p_entityTypeBuilder);
         return this;
     }
     public EntityTypeBuilder withRelations(hu.blackbelt.judo.meta.psm.data.Relation p_relations){
         m_relations.add(p_relations);
         m_featureRelationsSet = true;
         return this;
     }
     
     public EntityTypeBuilder withRelations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.data.Relation> p_relations){
         m_relations.addAll(p_relations);
         m_featureRelationsSet = true;
         return this;
     }
     
     public EntityTypeBuilder withRelations(hu.blackbelt.judo.meta.psm.data.Relation...p_relations){
         m_relations.addAll(java.util.Arrays.asList(p_relations));
         m_featureRelationsSet = true;
         return this;
     }
     
     public EntityTypeBuilder withSequences(hu.blackbelt.judo.meta.psm.data.EntitySequence p_sequences){
         m_sequences.add(p_sequences);
         m_featureSequencesSet = true;
         return this;
     }
     
     public EntityTypeBuilder withSequences(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.data.EntitySequence> p_sequences){
         m_sequences.addAll(p_sequences);
         m_featureSequencesSet = true;
         return this;
     }
     
     public EntityTypeBuilder withSequences(hu.blackbelt.judo.meta.psm.data.EntitySequence...p_sequences){
         m_sequences.addAll(java.util.Arrays.asList(p_sequences));
         m_featureSequencesSet = true;
         return this;
     }
     
     public EntityTypeBuilder withSequences(hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.EntitySequence> p_entityTypeBuilder){
         m_featureSequencesBuilder.add(p_entityTypeBuilder);
         return this;
     }
     public EntityTypeBuilder withSuperEntityTypes(hu.blackbelt.judo.meta.psm.data.EntityType p_superEntityTypes){
         m_superEntityTypes.add(p_superEntityTypes);
         m_featureSuperEntityTypesSet = true;
         return this;
     }
     
     public EntityTypeBuilder withSuperEntityTypes(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.data.EntityType> p_superEntityTypes){
         m_superEntityTypes.addAll(p_superEntityTypes);
         m_featureSuperEntityTypesSet = true;
         return this;
     }
     
     public EntityTypeBuilder withSuperEntityTypes(hu.blackbelt.judo.meta.psm.data.EntityType...p_superEntityTypes){
         m_superEntityTypes.addAll(java.util.Arrays.asList(p_superEntityTypes));
         m_featureSuperEntityTypesSet = true;
         return this;
     }
     
     public EntityTypeBuilder withSuperEntityTypes(hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.EntityType> p_entityTypeBuilder){
         m_featureSuperEntityTypesBuilder.add(p_entityTypeBuilder);
         return this;
     }
}
