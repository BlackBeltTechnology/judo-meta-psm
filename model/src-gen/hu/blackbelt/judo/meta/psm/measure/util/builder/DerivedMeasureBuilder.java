package hu.blackbelt.judo.meta.psm.measure.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.measure.DerivedMeasure</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class DerivedMeasureBuilder implements IMeasureBuilder<hu.blackbelt.judo.meta.psm.measure.DerivedMeasure> {
    private  hu.blackbelt.judo.meta.psm.measure.DerivedMeasure $instance = null;

    // features and builders
     private java.lang.String m_documentation;
     private java.lang.String m_name;
     private java.lang.String m_symbol;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm> m_terms = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.measure.util.builder.IMeasureBuilder<? extends hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm>> m_featureTermsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.measure.util.builder.IMeasureBuilder<? extends hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm>>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.measure.Unit> m_units = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.measure.Unit>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.measure.util.builder.IMeasureBuilder<? extends hu.blackbelt.judo.meta.psm.measure.Unit>> m_featureUnitsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.measure.util.builder.IMeasureBuilder<? extends hu.blackbelt.judo.meta.psm.measure.Unit>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureSymbolSet = false;
     private boolean m_featureTermsSet = false;
     private boolean m_featureUnitsSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.measure.MeasurePackage.eINSTANCE.getEClassifier("DerivedMeasure");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public DerivedMeasureBuilder but() {
           DerivedMeasureBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureSymbolSet = m_featureSymbolSet;
          _builder.m_symbol = m_symbol;
          _builder.m_featureTermsSet = m_featureTermsSet;
          _builder.m_terms = m_terms;
          _builder.m_featureTermsBuilder = m_featureTermsBuilder;
          _builder.m_featureUnitsSet = m_featureUnitsSet;
          _builder.m_units = m_units;
          _builder.m_featureUnitsBuilder = m_featureUnitsBuilder;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.measure.DerivedMeasure type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.measure.DerivedMeasure type
     */
    public hu.blackbelt.judo.meta.psm.measure.DerivedMeasure build() {

        final hu.blackbelt.judo.meta.psm.measure.DerivedMeasure _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.measure.MeasureFactory.eINSTANCE.createDerivedMeasure();
        } else {
            _instance = $instance;
        }

         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureNameSet) {
             _instance.setName(m_name);
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
         if(m_featureTermsSet) {
             _instance.getTerms().addAll(m_terms);
         } else {
             if (!m_featureTermsBuilder.isEmpty()) {
                 for (hu.blackbelt.judo.meta.psm.measure.util.builder.IMeasureBuilder<? extends hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm> builder: m_featureTermsBuilder) {
                     _instance.getTerms().add(builder.build());
                 }
             }
         }
         if(m_featureUnitsSet) {
             _instance.getUnits().addAll(m_units);
         } else {
             if (!m_featureUnitsBuilder.isEmpty()) {
                 for (hu.blackbelt.judo.meta.psm.measure.util.builder.IMeasureBuilder<? extends hu.blackbelt.judo.meta.psm.measure.Unit> builder: m_featureUnitsBuilder) {
                     _instance.getUnits().add(builder.build());
                 }
             }
         }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from DerivedMeasureBuilder.");
        }
        if (m_nullCheck && _instance.getTerms().isEmpty()) {
            throw new IllegalArgumentException("Mandatory \"terms\" list cannot be empty in DerivedMeasureBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see MeasureBuilders#newDerivedMeasureBuilder()
     */
    private DerivedMeasureBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  MeasureBuilders#useDerivedMeasureBuilder()
     */
    private DerivedMeasureBuilder(hu.blackbelt.judo.meta.psm.measure.DerivedMeasure instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the DerivedMeasureBuilder.
     * @return new instance of the DerivedMeasureBuilder
     */
    public static DerivedMeasureBuilder create() {
        return new DerivedMeasureBuilder();
    }

    /**
     * This method creates a new instance of the DerivedMeasureBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the DerivedMeasureBuilder
     */
    public static DerivedMeasureBuilder create(boolean p_nullCheck) {
        return new DerivedMeasureBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the DerivedMeasureBuilder from the given instance of class.
     * @return new instance of the DerivedMeasureBuilder
     */
    public static DerivedMeasureBuilder use(hu.blackbelt.judo.meta.psm.measure.DerivedMeasure instance) {
        return new DerivedMeasureBuilder(instance);
    }

    /**
     * This method creates a new instance of the DerivedMeasureBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the DerivedMeasureBuilder
     */
    public static DerivedMeasureBuilder use(hu.blackbelt.judo.meta.psm.measure.DerivedMeasure instance, boolean p_nullCheck) {
        return new DerivedMeasureBuilder(instance).withNullCheck(p_nullCheck);
    }

    private DerivedMeasureBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public DerivedMeasureBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public DerivedMeasureBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public DerivedMeasureBuilder withSymbol(java.lang.String p_symbol){
         m_symbol = p_symbol;
         m_featureSymbolSet = true;
         return this;
     }

     public DerivedMeasureBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public DerivedMeasureBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public DerivedMeasureBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public DerivedMeasureBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_derivedMeasureBuilder){
         m_featureAnnotationsBuilder.add(p_derivedMeasureBuilder);
         return this;
     }
     public DerivedMeasureBuilder withTerms(hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm p_terms){
         m_terms.add(p_terms);
         m_featureTermsSet = true;
         return this;
     }
     
     public DerivedMeasureBuilder withTerms(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm> p_terms){
         m_terms.addAll(p_terms);
         m_featureTermsSet = true;
         return this;
     }
     
     public DerivedMeasureBuilder withTerms(hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm...p_terms){
         m_terms.addAll(java.util.Arrays.asList(p_terms));
         m_featureTermsSet = true;
         return this;
     }
     
     public DerivedMeasureBuilder withTerms(hu.blackbelt.judo.meta.psm.measure.util.builder.IMeasureBuilder<? extends hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm> p_derivedMeasureBuilder){
         m_featureTermsBuilder.add(p_derivedMeasureBuilder);
         return this;
     }
     public DerivedMeasureBuilder withUnits(hu.blackbelt.judo.meta.psm.measure.Unit p_units){
         m_units.add(p_units);
         m_featureUnitsSet = true;
         return this;
     }
     
     public DerivedMeasureBuilder withUnits(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.measure.Unit> p_units){
         m_units.addAll(p_units);
         m_featureUnitsSet = true;
         return this;
     }
     
     public DerivedMeasureBuilder withUnits(hu.blackbelt.judo.meta.psm.measure.Unit...p_units){
         m_units.addAll(java.util.Arrays.asList(p_units));
         m_featureUnitsSet = true;
         return this;
     }
     
     public DerivedMeasureBuilder withUnits(hu.blackbelt.judo.meta.psm.measure.util.builder.IMeasureBuilder<? extends hu.blackbelt.judo.meta.psm.measure.Unit> p_derivedMeasureBuilder){
         m_featureUnitsBuilder.add(p_derivedMeasureBuilder);
         return this;
     }
}
