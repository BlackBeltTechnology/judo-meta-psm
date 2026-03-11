package hu.blackbelt.judo.meta.psm.measure.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.measure.Measure</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class MeasureBuilder implements IMeasureBuilder<hu.blackbelt.judo.meta.psm.measure.Measure> {
    private  hu.blackbelt.judo.meta.psm.measure.Measure $instance = null;

    // features and builders
     private java.lang.String m_documentation;
     private java.lang.String m_name;
     private java.lang.String m_symbol;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.measure.Unit> m_units = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.measure.Unit>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.measure.util.builder.IMeasureBuilder<? extends hu.blackbelt.judo.meta.psm.measure.Unit>> m_featureUnitsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.measure.util.builder.IMeasureBuilder<? extends hu.blackbelt.judo.meta.psm.measure.Unit>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureSymbolSet = false;
     private boolean m_featureUnitsSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.measure.MeasurePackage.eINSTANCE.getEClassifier("Measure");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public MeasureBuilder but() {
           MeasureBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureSymbolSet = m_featureSymbolSet;
          _builder.m_symbol = m_symbol;
          _builder.m_featureUnitsSet = m_featureUnitsSet;
          _builder.m_units = m_units;
          _builder.m_featureUnitsBuilder = m_featureUnitsBuilder;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.measure.Measure type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.measure.Measure type
     */
    public hu.blackbelt.judo.meta.psm.measure.Measure build() {

        final hu.blackbelt.judo.meta.psm.measure.Measure _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.measure.MeasureFactory.eINSTANCE.createMeasure();
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
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from MeasureBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see MeasureBuilders#newMeasureBuilder()
     */
    private MeasureBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  MeasureBuilders#useMeasureBuilder()
     */
    private MeasureBuilder(hu.blackbelt.judo.meta.psm.measure.Measure instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the MeasureBuilder.
     * @return new instance of the MeasureBuilder
     */
    public static MeasureBuilder create() {
        return new MeasureBuilder();
    }

    /**
     * This method creates a new instance of the MeasureBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the MeasureBuilder
     */
    public static MeasureBuilder create(boolean p_nullCheck) {
        return new MeasureBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the MeasureBuilder from the given instance of class.
     * @return new instance of the MeasureBuilder
     */
    public static MeasureBuilder use(hu.blackbelt.judo.meta.psm.measure.Measure instance) {
        return new MeasureBuilder(instance);
    }

    /**
     * This method creates a new instance of the MeasureBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the MeasureBuilder
     */
    public static MeasureBuilder use(hu.blackbelt.judo.meta.psm.measure.Measure instance, boolean p_nullCheck) {
        return new MeasureBuilder(instance).withNullCheck(p_nullCheck);
    }

    private MeasureBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public MeasureBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public MeasureBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public MeasureBuilder withSymbol(java.lang.String p_symbol){
         m_symbol = p_symbol;
         m_featureSymbolSet = true;
         return this;
     }

     public MeasureBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public MeasureBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public MeasureBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public MeasureBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_measureBuilder){
         m_featureAnnotationsBuilder.add(p_measureBuilder);
         return this;
     }
     public MeasureBuilder withUnits(hu.blackbelt.judo.meta.psm.measure.Unit p_units){
         m_units.add(p_units);
         m_featureUnitsSet = true;
         return this;
     }
     
     public MeasureBuilder withUnits(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.measure.Unit> p_units){
         m_units.addAll(p_units);
         m_featureUnitsSet = true;
         return this;
     }
     
     public MeasureBuilder withUnits(hu.blackbelt.judo.meta.psm.measure.Unit...p_units){
         m_units.addAll(java.util.Arrays.asList(p_units));
         m_featureUnitsSet = true;
         return this;
     }
     
     public MeasureBuilder withUnits(hu.blackbelt.judo.meta.psm.measure.util.builder.IMeasureBuilder<? extends hu.blackbelt.judo.meta.psm.measure.Unit> p_measureBuilder){
         m_featureUnitsBuilder.add(p_measureBuilder);
         return this;
     }
}
