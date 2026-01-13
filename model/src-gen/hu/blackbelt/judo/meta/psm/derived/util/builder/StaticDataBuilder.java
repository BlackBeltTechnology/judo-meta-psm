package hu.blackbelt.judo.meta.psm.derived.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.derived.StaticData</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class StaticDataBuilder implements IDerivedBuilder<hu.blackbelt.judo.meta.psm.derived.StaticData> {
    private  hu.blackbelt.judo.meta.psm.derived.StaticData $instance = null;

    // features and builders
     private hu.blackbelt.judo.meta.psm.type.Primitive m_dataType;
     private java.lang.String m_documentation;
     private hu.blackbelt.judo.meta.psm.derived.DataExpressionType m_getterExpression;
     private hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.DataExpressionType> m_featureGetterExpressionBuilder;
     private java.lang.String m_name;
     private Boolean m_required;
     private hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType m_setterExpression;
     private hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType> m_featureSetterExpressionBuilder;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureDataTypeSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureGetterExpressionSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureRequiredSet = false;
     private boolean m_featureSetterExpressionSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.derived.DerivedPackage.eINSTANCE.getEClassifier("StaticData");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public StaticDataBuilder but() {
           StaticDataBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureDataTypeSet = m_featureDataTypeSet;
          _builder.m_dataType = m_dataType;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureGetterExpressionSet = m_featureGetterExpressionSet;
          _builder.m_getterExpression = m_getterExpression;
          _builder.m_featureGetterExpressionBuilder = m_featureGetterExpressionBuilder;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureRequiredSet = m_featureRequiredSet;
          _builder.m_required = m_required;
          _builder.m_featureSetterExpressionSet = m_featureSetterExpressionSet;
          _builder.m_setterExpression = m_setterExpression;
          _builder.m_featureSetterExpressionBuilder = m_featureSetterExpressionBuilder;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.derived.StaticData type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.derived.StaticData type
     */
    public hu.blackbelt.judo.meta.psm.derived.StaticData build() {

        final hu.blackbelt.judo.meta.psm.derived.StaticData _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.derived.DerivedFactory.eINSTANCE.createStaticData();
        } else {
            _instance = $instance;
        }

         if (m_featureDataTypeSet) {
             _instance.setDataType(m_dataType);
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
         if (m_featureRequiredSet) {
             _instance.setRequired(m_required);
         }
         if (m_featureSetterExpressionSet) {
             _instance.setSetterExpression(m_setterExpression);
         } else {
                 if (m_featureSetterExpressionBuilder != null) {
                     _instance.setSetterExpression(m_featureSetterExpressionBuilder.build());
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
        if (m_nullCheck && _instance.getDataType() == null) {
            throw new IllegalArgumentException("Mandatory \"dataType\" attribute is missing from StaticDataBuilder.");
        }
        if (m_nullCheck && _instance.getGetterExpression() == null) {
            throw new IllegalArgumentException("Mandatory \"getterExpression\" attribute is missing from StaticDataBuilder.");
        }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from StaticDataBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see DerivedBuilders#newStaticDataBuilder()
     */
    private StaticDataBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  DerivedBuilders#useStaticDataBuilder()
     */
    private StaticDataBuilder(hu.blackbelt.judo.meta.psm.derived.StaticData instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the StaticDataBuilder.
     * @return new instance of the StaticDataBuilder
     */
    public static StaticDataBuilder create() {
        return new StaticDataBuilder();
    }

    /**
     * This method creates a new instance of the StaticDataBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the StaticDataBuilder
     */
    public static StaticDataBuilder create(boolean p_nullCheck) {
        return new StaticDataBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the StaticDataBuilder from the given instance of class.
     * @return new instance of the StaticDataBuilder
     */
    public static StaticDataBuilder use(hu.blackbelt.judo.meta.psm.derived.StaticData instance) {
        return new StaticDataBuilder(instance);
    }

    /**
     * This method creates a new instance of the StaticDataBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the StaticDataBuilder
     */
    public static StaticDataBuilder use(hu.blackbelt.judo.meta.psm.derived.StaticData instance, boolean p_nullCheck) {
        return new StaticDataBuilder(instance).withNullCheck(p_nullCheck);
    }

    private StaticDataBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public StaticDataBuilder withDataType(hu.blackbelt.judo.meta.psm.type.Primitive p_dataType){
         m_dataType = p_dataType;
         m_featureDataTypeSet = true;
         return this;
     }
     public StaticDataBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public StaticDataBuilder withGetterExpression(hu.blackbelt.judo.meta.psm.derived.DataExpressionType p_getterExpression){
         m_getterExpression = p_getterExpression;
         m_featureGetterExpressionSet = true;
         return this;
     }
     public StaticDataBuilder withGetterExpression(hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.DataExpressionType> p_staticDataBuilder){
         m_featureGetterExpressionBuilder = p_staticDataBuilder;
         return this;
     }
     public StaticDataBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public StaticDataBuilder withRequired(Boolean p_required){
         m_required = p_required;
         m_featureRequiredSet = true;
         return this;
     }
     public StaticDataBuilder withSetterExpression(hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType p_setterExpression){
         m_setterExpression = p_setterExpression;
         m_featureSetterExpressionSet = true;
         return this;
     }
     public StaticDataBuilder withSetterExpression(hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.AttributeSelectorType> p_staticDataBuilder){
         m_featureSetterExpressionBuilder = p_staticDataBuilder;
         return this;
     }

     public StaticDataBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public StaticDataBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public StaticDataBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public StaticDataBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_staticDataBuilder){
         m_featureAnnotationsBuilder.add(p_staticDataBuilder);
         return this;
     }
}
