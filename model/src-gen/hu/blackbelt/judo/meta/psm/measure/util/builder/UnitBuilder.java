package hu.blackbelt.judo.meta.psm.measure.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.measure.Unit</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class UnitBuilder implements IMeasureBuilder<hu.blackbelt.judo.meta.psm.measure.Unit> {
    private  hu.blackbelt.judo.meta.psm.measure.Unit $instance = null;

    // features and builders
     private java.lang.String m_documentation;
     private java.lang.String m_name;
     private double m_rateDividend;
     private double m_rateDivisor;
     private java.lang.String m_symbol;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureRateDividendSet = false;
     private boolean m_featureRateDivisorSet = false;
     private boolean m_featureSymbolSet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public UnitBuilder but() {
           UnitBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureRateDividendSet = m_featureRateDividendSet;
          _builder.m_rateDividend = m_rateDividend;
          _builder.m_featureRateDivisorSet = m_featureRateDivisorSet;
          _builder.m_rateDivisor = m_rateDivisor;
          _builder.m_featureSymbolSet = m_featureSymbolSet;
          _builder.m_symbol = m_symbol;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.measure.Unit type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.measure.Unit type
     */
    public hu.blackbelt.judo.meta.psm.measure.Unit build() {

        final hu.blackbelt.judo.meta.psm.measure.Unit _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.measure.MeasureFactory.eINSTANCE.createUnit();
        } else {
            _instance = $instance;
        }

         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureNameSet) {
             _instance.setName(m_name);
         }
         if (m_featureRateDividendSet) {
             _instance.setRateDividend(m_rateDividend);
         }
         if (m_featureRateDivisorSet) {
             _instance.setRateDivisor(m_rateDivisor);
         }
         if (m_featureSymbolSet) {
             _instance.setSymbol(m_symbol);
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
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from UnitBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see MeasureBuilders#newUnitBuilder()
     */
    private UnitBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  MeasureBuilders#useUnitBuilder()
     */
    private UnitBuilder(hu.blackbelt.judo.meta.psm.measure.Unit instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the UnitBuilder.
     * @return new instance of the UnitBuilder
     */
    public static UnitBuilder create() {
        return new UnitBuilder();
    }

    /**
     * This method creates a new instance of the UnitBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the UnitBuilder
     */
    public static UnitBuilder create(boolean p_nullCheck) {
        return new UnitBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the UnitBuilder from the given instance of class.
     * @return new instance of the UnitBuilder
     */
    public static UnitBuilder use(hu.blackbelt.judo.meta.psm.measure.Unit instance) {
        return new UnitBuilder(instance);
    }

    /**
     * This method creates a new instance of the UnitBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the UnitBuilder
     */
    public static UnitBuilder use(hu.blackbelt.judo.meta.psm.measure.Unit instance, boolean p_nullCheck) {
        return new UnitBuilder(instance).withNullCheck(p_nullCheck);
    }

    private UnitBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public UnitBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public UnitBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public UnitBuilder withRateDividend(double p_rateDividend){
         m_rateDividend = p_rateDividend;
         m_featureRateDividendSet = true;
         return this;
     }
     public UnitBuilder withRateDivisor(double p_rateDivisor){
         m_rateDivisor = p_rateDivisor;
         m_featureRateDivisorSet = true;
         return this;
     }
     public UnitBuilder withSymbol(java.lang.String p_symbol){
         m_symbol = p_symbol;
         m_featureSymbolSet = true;
         return this;
     }

     public UnitBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public UnitBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public UnitBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public UnitBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_unitBuilder){
         m_featureAnnotationsBuilder.add(p_unitBuilder);
         return this;
     }

}
