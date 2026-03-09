package hu.blackbelt.judo.meta.psm.derived.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.derived.StaticNavigation</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class StaticNavigationBuilder implements IDerivedBuilder<hu.blackbelt.judo.meta.psm.derived.StaticNavigation> {
    private  hu.blackbelt.judo.meta.psm.derived.StaticNavigation $instance = null;

    // features and builders
     private hu.blackbelt.judo.meta.psm.type.Cardinality m_cardinality;
     private hu.blackbelt.judo.meta.psm.type.util.builder.ITypeBuilder<? extends hu.blackbelt.judo.meta.psm.type.Cardinality> m_featureCardinalityBuilder;
     private java.lang.String m_documentation;
     private hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType m_getterExpression;
     private hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType> m_featureGetterExpressionBuilder;
     private java.lang.String m_name;
     private hu.blackbelt.judo.meta.psm.derived.ReferenceSelectorType m_setterExpression;
     private hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.ReferenceSelectorType> m_featureSetterExpressionBuilder;
     private hu.blackbelt.judo.meta.psm.data.EntityType m_target;
     private hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.EntityType> m_featureTargetBuilder;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureCardinalitySet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureGetterExpressionSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureSetterExpressionSet = false;
     private boolean m_featureTargetSet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public StaticNavigationBuilder but() {
           StaticNavigationBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureCardinalitySet = m_featureCardinalitySet;
          _builder.m_cardinality = m_cardinality;
          _builder.m_featureCardinalityBuilder = m_featureCardinalityBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureGetterExpressionSet = m_featureGetterExpressionSet;
          _builder.m_getterExpression = m_getterExpression;
          _builder.m_featureGetterExpressionBuilder = m_featureGetterExpressionBuilder;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureSetterExpressionSet = m_featureSetterExpressionSet;
          _builder.m_setterExpression = m_setterExpression;
          _builder.m_featureSetterExpressionBuilder = m_featureSetterExpressionBuilder;
          _builder.m_featureTargetSet = m_featureTargetSet;
          _builder.m_target = m_target;
          _builder.m_featureTargetBuilder = m_featureTargetBuilder;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.derived.StaticNavigation type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.derived.StaticNavigation type
     */
    public hu.blackbelt.judo.meta.psm.derived.StaticNavigation build() {

        final hu.blackbelt.judo.meta.psm.derived.StaticNavigation _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.derived.DerivedFactory.eINSTANCE.createStaticNavigation();
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
         if (m_featureGetterExpressionSet) {
             _instance.setGetterExpression(m_getterExpression);
         } else {
                 if (m_featureGetterExpressionBuilder != null) {
                     _instance.setGetterExpression(m_featureGetterExpressionBuilder.build());
                 }
             }
         if (m_featureNameSet) {
             _instance.setName(m_name);
         }
         if (m_featureSetterExpressionSet) {
             _instance.setSetterExpression(m_setterExpression);
         } else {
                 if (m_featureSetterExpressionBuilder != null) {
                     _instance.setSetterExpression(m_featureSetterExpressionBuilder.build());
                 }
             }
         if (m_featureTargetSet) {
             _instance.setTarget(m_target);
         } else {
                 if (m_featureTargetBuilder != null) {
                     _instance.setTarget(m_featureTargetBuilder.build());
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
        if (m_nullCheck && _instance.getCardinality() == null) {
            throw new IllegalArgumentException("Mandatory \"cardinality\" attribute is missing from StaticNavigationBuilder.");
        }
        if (m_nullCheck && _instance.getGetterExpression() == null) {
            throw new IllegalArgumentException("Mandatory \"getterExpression\" attribute is missing from StaticNavigationBuilder.");
        }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from StaticNavigationBuilder.");
        }
        if (m_nullCheck && _instance.getTarget() == null) {
            throw new IllegalArgumentException("Mandatory \"target\" attribute is missing from StaticNavigationBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see DerivedBuilders#newStaticNavigationBuilder()
     */
    private StaticNavigationBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  DerivedBuilders#useStaticNavigationBuilder()
     */
    private StaticNavigationBuilder(hu.blackbelt.judo.meta.psm.derived.StaticNavigation instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the StaticNavigationBuilder.
     * @return new instance of the StaticNavigationBuilder
     */
    public static StaticNavigationBuilder create() {
        return new StaticNavigationBuilder();
    }

    /**
     * This method creates a new instance of the StaticNavigationBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the StaticNavigationBuilder
     */
    public static StaticNavigationBuilder create(boolean p_nullCheck) {
        return new StaticNavigationBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the StaticNavigationBuilder from the given instance of class.
     * @return new instance of the StaticNavigationBuilder
     */
    public static StaticNavigationBuilder use(hu.blackbelt.judo.meta.psm.derived.StaticNavigation instance) {
        return new StaticNavigationBuilder(instance);
    }

    /**
     * This method creates a new instance of the StaticNavigationBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the StaticNavigationBuilder
     */
    public static StaticNavigationBuilder use(hu.blackbelt.judo.meta.psm.derived.StaticNavigation instance, boolean p_nullCheck) {
        return new StaticNavigationBuilder(instance).withNullCheck(p_nullCheck);
    }

    private StaticNavigationBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public StaticNavigationBuilder withCardinality(hu.blackbelt.judo.meta.psm.type.Cardinality p_cardinality){
         m_cardinality = p_cardinality;
         m_featureCardinalitySet = true;
         return this;
     }
     public StaticNavigationBuilder withCardinality(hu.blackbelt.judo.meta.psm.type.util.builder.ITypeBuilder<? extends hu.blackbelt.judo.meta.psm.type.Cardinality> p_staticNavigationBuilder){
         m_featureCardinalityBuilder = p_staticNavigationBuilder;
         return this;
     }
     public StaticNavigationBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public StaticNavigationBuilder withGetterExpression(hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType p_getterExpression){
         m_getterExpression = p_getterExpression;
         m_featureGetterExpressionSet = true;
         return this;
     }
     public StaticNavigationBuilder withGetterExpression(hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.ReferenceExpressionType> p_staticNavigationBuilder){
         m_featureGetterExpressionBuilder = p_staticNavigationBuilder;
         return this;
     }
     public StaticNavigationBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public StaticNavigationBuilder withSetterExpression(hu.blackbelt.judo.meta.psm.derived.ReferenceSelectorType p_setterExpression){
         m_setterExpression = p_setterExpression;
         m_featureSetterExpressionSet = true;
         return this;
     }
     public StaticNavigationBuilder withSetterExpression(hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.ReferenceSelectorType> p_staticNavigationBuilder){
         m_featureSetterExpressionBuilder = p_staticNavigationBuilder;
         return this;
     }
     public StaticNavigationBuilder withTarget(hu.blackbelt.judo.meta.psm.data.EntityType p_target){
         m_target = p_target;
         m_featureTargetSet = true;
         return this;
     }
     public StaticNavigationBuilder withTarget(hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.EntityType> p_staticNavigationBuilder){
         m_featureTargetBuilder = p_staticNavigationBuilder;
         return this;
     }

     public StaticNavigationBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public StaticNavigationBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public StaticNavigationBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public StaticNavigationBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_staticNavigationBuilder){
         m_featureAnnotationsBuilder.add(p_staticNavigationBuilder);
         return this;
     }

}
