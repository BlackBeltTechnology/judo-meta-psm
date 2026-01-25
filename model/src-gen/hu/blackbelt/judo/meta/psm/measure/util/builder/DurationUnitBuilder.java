package hu.blackbelt.judo.meta.psm.measure.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.measure.DurationUnit</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class DurationUnitBuilder implements IMeasureBuilder<hu.blackbelt.judo.meta.psm.measure.DurationUnit> {
    private  hu.blackbelt.judo.meta.psm.measure.DurationUnit $instance = null;

    // features and builders
     private java.lang.String m_documentation;
     private java.lang.String m_name;
     private double m_rateDividend;
     private double m_rateDivisor;
     private java.lang.String m_symbol;
     private hu.blackbelt.judo.meta.psm.measure.DurationType m_unitType;

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
     private boolean m_featureUnitTypeSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.measure.MeasurePackage.eINSTANCE.getEClassifier("DurationUnit");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public DurationUnitBuilder but() {
           DurationUnitBuilder _builder = create();
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
          _builder.m_featureUnitTypeSet = m_featureUnitTypeSet;
          _builder.m_unitType = m_unitType;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.measure.DurationUnit type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.measure.DurationUnit type
     */
    public hu.blackbelt.judo.meta.psm.measure.DurationUnit build() {

        final hu.blackbelt.judo.meta.psm.measure.DurationUnit _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.measure.MeasureFactory.eINSTANCE.createDurationUnit();
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
         if (m_featureUnitTypeSet) {
             _instance.setUnitType(m_unitType);
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
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from DurationUnitBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see MeasureBuilders#newDurationUnitBuilder()
     */
    private DurationUnitBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  MeasureBuilders#useDurationUnitBuilder()
     */
    private DurationUnitBuilder(hu.blackbelt.judo.meta.psm.measure.DurationUnit instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the DurationUnitBuilder.
     * @return new instance of the DurationUnitBuilder
     */
    public static DurationUnitBuilder create() {
        return new DurationUnitBuilder();
    }

    /**
     * This method creates a new instance of the DurationUnitBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the DurationUnitBuilder
     */
    public static DurationUnitBuilder create(boolean p_nullCheck) {
        return new DurationUnitBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the DurationUnitBuilder from the given instance of class.
     * @return new instance of the DurationUnitBuilder
     */
    public static DurationUnitBuilder use(hu.blackbelt.judo.meta.psm.measure.DurationUnit instance) {
        return new DurationUnitBuilder(instance);
    }

    /**
     * This method creates a new instance of the DurationUnitBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the DurationUnitBuilder
     */
    public static DurationUnitBuilder use(hu.blackbelt.judo.meta.psm.measure.DurationUnit instance, boolean p_nullCheck) {
        return new DurationUnitBuilder(instance).withNullCheck(p_nullCheck);
    }

    private DurationUnitBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public DurationUnitBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public DurationUnitBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public DurationUnitBuilder withRateDividend(double p_rateDividend){
         m_rateDividend = p_rateDividend;
         m_featureRateDividendSet = true;
         return this;
     }
     public DurationUnitBuilder withRateDivisor(double p_rateDivisor){
         m_rateDivisor = p_rateDivisor;
         m_featureRateDivisorSet = true;
         return this;
     }
     public DurationUnitBuilder withSymbol(java.lang.String p_symbol){
         m_symbol = p_symbol;
         m_featureSymbolSet = true;
         return this;
     }
     public DurationUnitBuilder withUnitType(hu.blackbelt.judo.meta.psm.measure.DurationType p_unitType){
         m_unitType = p_unitType;
         m_featureUnitTypeSet = true;
         return this;
     }

     public DurationUnitBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public DurationUnitBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public DurationUnitBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public DurationUnitBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_durationUnitBuilder){
         m_featureAnnotationsBuilder.add(p_durationUnitBuilder);
         return this;
     }
}
