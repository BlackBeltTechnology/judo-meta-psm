package hu.blackbelt.judo.meta.psm.type.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.type.NumericType</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class NumericTypeBuilder implements ITypeBuilder<hu.blackbelt.judo.meta.psm.type.NumericType> {
    private  hu.blackbelt.judo.meta.psm.type.NumericType $instance = null;

    // features and builders
     private java.lang.String m_documentation;
     private java.lang.String m_name;
     private Integer m_precision;
     private Integer m_scale;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featurePrecisionSet = false;
     private boolean m_featureScaleSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.type.TypePackage.eINSTANCE.getEClassifier("NumericType");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public NumericTypeBuilder but() {
           NumericTypeBuilder _builder = create();
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
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.type.NumericType type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.type.NumericType type
     */
    public hu.blackbelt.judo.meta.psm.type.NumericType build() {

        final hu.blackbelt.judo.meta.psm.type.NumericType _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.type.TypeFactory.eINSTANCE.createNumericType();
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
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from NumericTypeBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see TypeBuilders#newNumericTypeBuilder()
     */
    private NumericTypeBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  TypeBuilders#useNumericTypeBuilder()
     */
    private NumericTypeBuilder(hu.blackbelt.judo.meta.psm.type.NumericType instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the NumericTypeBuilder.
     * @return new instance of the NumericTypeBuilder
     */
    public static NumericTypeBuilder create() {
        return new NumericTypeBuilder();
    }

    /**
     * This method creates a new instance of the NumericTypeBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the NumericTypeBuilder
     */
    public static NumericTypeBuilder create(boolean p_nullCheck) {
        return new NumericTypeBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the NumericTypeBuilder from the given instance of class.
     * @return new instance of the NumericTypeBuilder
     */
    public static NumericTypeBuilder use(hu.blackbelt.judo.meta.psm.type.NumericType instance) {
        return new NumericTypeBuilder(instance);
    }

    /**
     * This method creates a new instance of the NumericTypeBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the NumericTypeBuilder
     */
    public static NumericTypeBuilder use(hu.blackbelt.judo.meta.psm.type.NumericType instance, boolean p_nullCheck) {
        return new NumericTypeBuilder(instance).withNullCheck(p_nullCheck);
    }

    private NumericTypeBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public NumericTypeBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public NumericTypeBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public NumericTypeBuilder withPrecision(Integer p_precision){
         m_precision = p_precision;
         m_featurePrecisionSet = true;
         return this;
     }
     public NumericTypeBuilder withScale(Integer p_scale){
         m_scale = p_scale;
         m_featureScaleSet = true;
         return this;
     }

     public NumericTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public NumericTypeBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public NumericTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public NumericTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_numericTypeBuilder){
         m_featureAnnotationsBuilder.add(p_numericTypeBuilder);
         return this;
     }
}
