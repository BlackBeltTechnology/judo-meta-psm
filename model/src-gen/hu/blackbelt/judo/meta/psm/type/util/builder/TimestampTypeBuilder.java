package hu.blackbelt.judo.meta.psm.type.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.type.TimestampType</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class TimestampTypeBuilder implements ITypeBuilder<hu.blackbelt.judo.meta.psm.type.TimestampType> {
    private  hu.blackbelt.judo.meta.psm.type.TimestampType $instance = null;

    // features and builders
     private hu.blackbelt.judo.meta.psm.measure.DurationType m_baseUnit;
     private java.lang.String m_documentation;
     private java.lang.String m_name;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureBaseUnitSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureNameSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.type.TypePackage.eINSTANCE.getEClassifier("TimestampType");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public TimestampTypeBuilder but() {
           TimestampTypeBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureBaseUnitSet = m_featureBaseUnitSet;
          _builder.m_baseUnit = m_baseUnit;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.type.TimestampType type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.type.TimestampType type
     */
    public hu.blackbelt.judo.meta.psm.type.TimestampType build() {

        final hu.blackbelt.judo.meta.psm.type.TimestampType _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.type.TypeFactory.eINSTANCE.createTimestampType();
        } else {
            _instance = $instance;
        }

         if (m_featureBaseUnitSet) {
             _instance.setBaseUnit(m_baseUnit);
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
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from TimestampTypeBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see TypeBuilders#newTimestampTypeBuilder()
     */
    private TimestampTypeBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  TypeBuilders#useTimestampTypeBuilder()
     */
    private TimestampTypeBuilder(hu.blackbelt.judo.meta.psm.type.TimestampType instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the TimestampTypeBuilder.
     * @return new instance of the TimestampTypeBuilder
     */
    public static TimestampTypeBuilder create() {
        return new TimestampTypeBuilder();
    }

    /**
     * This method creates a new instance of the TimestampTypeBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the TimestampTypeBuilder
     */
    public static TimestampTypeBuilder create(boolean p_nullCheck) {
        return new TimestampTypeBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the TimestampTypeBuilder from the given instance of class.
     * @return new instance of the TimestampTypeBuilder
     */
    public static TimestampTypeBuilder use(hu.blackbelt.judo.meta.psm.type.TimestampType instance) {
        return new TimestampTypeBuilder(instance);
    }

    /**
     * This method creates a new instance of the TimestampTypeBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the TimestampTypeBuilder
     */
    public static TimestampTypeBuilder use(hu.blackbelt.judo.meta.psm.type.TimestampType instance, boolean p_nullCheck) {
        return new TimestampTypeBuilder(instance).withNullCheck(p_nullCheck);
    }

    private TimestampTypeBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public TimestampTypeBuilder withBaseUnit(hu.blackbelt.judo.meta.psm.measure.DurationType p_baseUnit){
         m_baseUnit = p_baseUnit;
         m_featureBaseUnitSet = true;
         return this;
     }
     public TimestampTypeBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public TimestampTypeBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }

     public TimestampTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public TimestampTypeBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public TimestampTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public TimestampTypeBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_timestampTypeBuilder){
         m_featureAnnotationsBuilder.add(p_timestampTypeBuilder);
         return this;
     }
}
