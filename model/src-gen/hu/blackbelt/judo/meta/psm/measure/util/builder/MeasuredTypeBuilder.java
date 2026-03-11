package hu.blackbelt.judo.meta.psm.measure.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.measure.MeasuredType</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class MeasuredTypeBuilder implements IMeasureBuilder<hu.blackbelt.judo.meta.psm.measure.MeasuredType> {
    private  hu.blackbelt.judo.meta.psm.measure.MeasuredType $instance = null;

    // features and builders
     private java.lang.String m_documentation;
     private java.lang.String m_name;
     private Integer m_precision;
     private Integer m_scale;
     private hu.blackbelt.judo.meta.psm.measure.Unit m_storeUnit;
     private hu.blackbelt.judo.meta.psm.measure.util.builder.IMeasureBuilder<? extends hu.blackbelt.judo.meta.psm.measure.Unit> m_featureStoreUnitBuilder;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featurePrecisionSet = false;
     private boolean m_featureScaleSet = false;
     private boolean m_featureStoreUnitSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.measure.MeasurePackage.eINSTANCE.getEClassifier("MeasuredType");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public MeasuredTypeBuilder but() {
           MeasuredTypeBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featurePrecisionSet = m_featurePrecisionSet;
          _builder.m_precision = m_precision;
          _builder.m_featureScaleSet = m_featureScaleSet;
          _builder.m_scale = m_scale;
          _builder.m_featureStoreUnitSet = m_featureStoreUnitSet;
          _builder.m_storeUnit = m_storeUnit;
          _builder.m_featureStoreUnitBuilder = m_featureStoreUnitBuilder;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.measure.MeasuredType type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.measure.MeasuredType type
     */
    public hu.blackbelt.judo.meta.psm.measure.MeasuredType build() {

        final hu.blackbelt.judo.meta.psm.measure.MeasuredType _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.measure.MeasureFactory.eINSTANCE.createMeasuredType();
        } else {
            _instance = $instance;
        }

         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureNameSet) {
             _instance.setName(m_name);
         }
         if (m_featurePrecisionSet) {
             _instance.setPrecision(m_precision);
         }
         if (m_featureScaleSet) {
             _instance.setScale(m_scale);
         }
         if (m_featureStoreUnitSet) {
             _instance.setStoreUnit(m_storeUnit);
         } else {
                 if (m_featureStoreUnitBuilder != null) {
                     _instance.setStoreUnit(m_featureStoreUnitBuilder.build());
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
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from MeasuredTypeBuilder.");
        }
        if (m_nullCheck && _instance.getStoreUnit() == null) {
            throw new IllegalArgumentException("Mandatory \"storeUnit\" attribute is missing from MeasuredTypeBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see MeasureBuilders#newMeasuredTypeBuilder()
     */
    private MeasuredTypeBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  MeasureBuilders#useMeasuredTypeBuilder()
     */
    private MeasuredTypeBuilder(hu.blackbelt.judo.meta.psm.measure.MeasuredType instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the MeasuredTypeBuilder.
     * @return new instance of the MeasuredTypeBuilder
     */
    public static MeasuredTypeBuilder create() {
        return new MeasuredTypeBuilder();
    }

    /**
     * This method creates a new instance of the MeasuredTypeBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the MeasuredTypeBuilder
     */
    public static MeasuredTypeBuilder create(boolean p_nullCheck) {
        return new MeasuredTypeBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the MeasuredTypeBuilder from the given instance of class.
     * @return new instance of the MeasuredTypeBuilder
     */
    public static MeasuredTypeBuilder use(hu.blackbelt.judo.meta.psm.measure.MeasuredType instance) {
        return new MeasuredTypeBuilder(instance);
    }

    /**
     * This method creates a new instance of the MeasuredTypeBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the MeasuredTypeBuilder
     */
    public static MeasuredTypeBuilder use(hu.blackbelt.judo.meta.psm.measure.MeasuredType instance, boolean p_nullCheck) {
        return new MeasuredTypeBuilder(instance).withNullCheck(p_nullCheck);
    }

    private MeasuredTypeBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public MeasuredTypeBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public MeasuredTypeBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public MeasuredTypeBuilder withPrecision(Integer p_precision){
         m_precision = p_precision;
         m_featurePrecisionSet = true;
         return this;
     }
     public MeasuredTypeBuilder withScale(Integer p_scale){
         m_scale = p_scale;
         m_featureScaleSet = true;
         return this;
     }
     public MeasuredTypeBuilder withStoreUnit(hu.blackbelt.judo.meta.psm.measure.Unit p_storeUnit){
         m_storeUnit = p_storeUnit;
         m_featureStoreUnitSet = true;
         return this;
     }
     public MeasuredTypeBuilder withStoreUnit(hu.blackbelt.judo.meta.psm.measure.util.builder.IMeasureBuilder<? extends hu.blackbelt.judo.meta.psm.measure.Unit> p_measuredTypeBuilder){
         m_featureStoreUnitBuilder = p_measuredTypeBuilder;
         return this;
     }

     public MeasuredTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public MeasuredTypeBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public MeasuredTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public MeasuredTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_measuredTypeBuilder){
         m_featureAnnotationsBuilder.add(p_measuredTypeBuilder);
         return this;
     }
}
