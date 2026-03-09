package hu.blackbelt.judo.meta.psm.data.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.data.AssociationEnd</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class AssociationEndBuilder implements IDataBuilder<hu.blackbelt.judo.meta.psm.data.AssociationEnd> {
    private  hu.blackbelt.judo.meta.psm.data.AssociationEnd $instance = null;

    // features and builders
     private hu.blackbelt.judo.meta.psm.type.Cardinality m_cardinality;
     private hu.blackbelt.judo.meta.psm.type.util.builder.ITypeBuilder<? extends hu.blackbelt.judo.meta.psm.type.Cardinality> m_featureCardinalityBuilder;
     private java.lang.String m_documentation;
     private java.lang.String m_name;
     private hu.blackbelt.judo.meta.psm.data.AssociationEnd m_partner;
     private hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.AssociationEnd> m_featurePartnerBuilder;
     private Boolean m_reverseCascadeDelete;
     private hu.blackbelt.judo.meta.psm.data.EntityType m_target;
     private hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.EntityType> m_featureTargetBuilder;
     private Boolean m_unmappedDefaultOnly;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureCardinalitySet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featurePartnerSet = false;
     private boolean m_featureReverseCascadeDeleteSet = false;
     private boolean m_featureTargetSet = false;
     private boolean m_featureUnmappedDefaultOnlySet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public AssociationEndBuilder but() {
           AssociationEndBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureCardinalitySet = m_featureCardinalitySet;
          _builder.m_cardinality = m_cardinality;
          _builder.m_featureCardinalityBuilder = m_featureCardinalityBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featurePartnerSet = m_featurePartnerSet;
          _builder.m_partner = m_partner;
          _builder.m_featurePartnerBuilder = m_featurePartnerBuilder;
          _builder.m_featureReverseCascadeDeleteSet = m_featureReverseCascadeDeleteSet;
          _builder.m_reverseCascadeDelete = m_reverseCascadeDelete;
          _builder.m_featureTargetSet = m_featureTargetSet;
          _builder.m_target = m_target;
          _builder.m_featureTargetBuilder = m_featureTargetBuilder;
          _builder.m_featureUnmappedDefaultOnlySet = m_featureUnmappedDefaultOnlySet;
          _builder.m_unmappedDefaultOnly = m_unmappedDefaultOnly;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.data.AssociationEnd type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.data.AssociationEnd type
     */
    public hu.blackbelt.judo.meta.psm.data.AssociationEnd build() {

        final hu.blackbelt.judo.meta.psm.data.AssociationEnd _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.data.DataFactory.eINSTANCE.createAssociationEnd();
        } else {
            _instance = $instance;
        }

         if (m_featureCardinalitySet) {
             _instance.setCardinality(m_cardinality);
         } else {
                 if (m_featureCardinalityBuilder != null) {
                     _instance.setCardinality(m_featureCardinalityBuilder.build());
                 }
             }
         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureNameSet) {
             _instance.setName(m_name);
         }
         if (m_featurePartnerSet) {
             _instance.setPartner(m_partner);
         } else {
                 if (m_featurePartnerBuilder != null) {
                     _instance.setPartner(m_featurePartnerBuilder.build());
                 }
             }
         if (m_featureReverseCascadeDeleteSet) {
             _instance.setReverseCascadeDelete(m_reverseCascadeDelete);
         }
         if (m_featureTargetSet) {
             _instance.setTarget(m_target);
         } else {
                 if (m_featureTargetBuilder != null) {
                     _instance.setTarget(m_featureTargetBuilder.build());
                 }
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
        if (m_nullCheck && _instance.getCardinality() == null) {
            throw new IllegalArgumentException("Mandatory \"cardinality\" attribute is missing from AssociationEndBuilder.");
        }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from AssociationEndBuilder.");
        }
        if (m_nullCheck && _instance.getTarget() == null) {
            throw new IllegalArgumentException("Mandatory \"target\" attribute is missing from AssociationEndBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see DataBuilders#newAssociationEndBuilder()
     */
    private AssociationEndBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  DataBuilders#useAssociationEndBuilder()
     */
    private AssociationEndBuilder(hu.blackbelt.judo.meta.psm.data.AssociationEnd instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the AssociationEndBuilder.
     * @return new instance of the AssociationEndBuilder
     */
    public static AssociationEndBuilder create() {
        return new AssociationEndBuilder();
    }

    /**
     * This method creates a new instance of the AssociationEndBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the AssociationEndBuilder
     */
    public static AssociationEndBuilder create(boolean p_nullCheck) {
        return new AssociationEndBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the AssociationEndBuilder from the given instance of class.
     * @return new instance of the AssociationEndBuilder
     */
    public static AssociationEndBuilder use(hu.blackbelt.judo.meta.psm.data.AssociationEnd instance) {
        return new AssociationEndBuilder(instance);
    }

    /**
     * This method creates a new instance of the AssociationEndBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the AssociationEndBuilder
     */
    public static AssociationEndBuilder use(hu.blackbelt.judo.meta.psm.data.AssociationEnd instance, boolean p_nullCheck) {
        return new AssociationEndBuilder(instance).withNullCheck(p_nullCheck);
    }

    private AssociationEndBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public AssociationEndBuilder withCardinality(hu.blackbelt.judo.meta.psm.type.Cardinality p_cardinality){
         m_cardinality = p_cardinality;
         m_featureCardinalitySet = true;
         return this;
     }
     public AssociationEndBuilder withCardinality(hu.blackbelt.judo.meta.psm.type.util.builder.ITypeBuilder<? extends hu.blackbelt.judo.meta.psm.type.Cardinality> p_associationEndBuilder){
         m_featureCardinalityBuilder = p_associationEndBuilder;
         return this;
     }
     public AssociationEndBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public AssociationEndBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public AssociationEndBuilder withPartner(hu.blackbelt.judo.meta.psm.data.AssociationEnd p_partner){
         m_partner = p_partner;
         m_featurePartnerSet = true;
         return this;
     }
     public AssociationEndBuilder withPartner(hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.AssociationEnd> p_associationEndBuilder){
         m_featurePartnerBuilder = p_associationEndBuilder;
         return this;
     }
     public AssociationEndBuilder withReverseCascadeDelete(Boolean p_reverseCascadeDelete){
         m_reverseCascadeDelete = p_reverseCascadeDelete;
         m_featureReverseCascadeDeleteSet = true;
         return this;
     }
     public AssociationEndBuilder withTarget(hu.blackbelt.judo.meta.psm.data.EntityType p_target){
         m_target = p_target;
         m_featureTargetSet = true;
         return this;
     }
     public AssociationEndBuilder withTarget(hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.EntityType> p_associationEndBuilder){
         m_featureTargetBuilder = p_associationEndBuilder;
         return this;
     }
     public AssociationEndBuilder withUnmappedDefaultOnly(Boolean p_unmappedDefaultOnly){
         m_unmappedDefaultOnly = p_unmappedDefaultOnly;
         m_featureUnmappedDefaultOnlySet = true;
         return this;
     }

     public AssociationEndBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public AssociationEndBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public AssociationEndBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public AssociationEndBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_associationEndBuilder){
         m_featureAnnotationsBuilder.add(p_associationEndBuilder);
         return this;
     }

}
