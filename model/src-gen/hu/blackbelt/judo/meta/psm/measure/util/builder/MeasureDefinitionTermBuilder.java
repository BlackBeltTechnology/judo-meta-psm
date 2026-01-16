package hu.blackbelt.judo.meta.psm.measure.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class MeasureDefinitionTermBuilder implements IMeasureBuilder<hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm> {
    private  hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm $instance = null;

    // features and builders
     private Integer m_exponent;
     private hu.blackbelt.judo.meta.psm.measure.Unit m_unit;
     private hu.blackbelt.judo.meta.psm.measure.util.builder.IMeasureBuilder<? extends hu.blackbelt.judo.meta.psm.measure.Unit> m_featureUnitBuilder;


     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureExponentSet = false;
     private boolean m_featureUnitSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.measure.MeasurePackage.eINSTANCE.getEClassifier("MeasureDefinitionTerm");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public MeasureDefinitionTermBuilder but() {
           MeasureDefinitionTermBuilder _builder = create();
          _builder.m_featureExponentSet = m_featureExponentSet;
          _builder.m_exponent = m_exponent;
          _builder.m_featureUnitSet = m_featureUnitSet;
          _builder.m_unit = m_unit;
          _builder.m_featureUnitBuilder = m_featureUnitBuilder;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm type
     */
    public hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm build() {

        final hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.measure.MeasureFactory.eINSTANCE.createMeasureDefinitionTerm();
        } else {
            _instance = $instance;
        }

         if (m_featureExponentSet) {
             _instance.setExponent(m_exponent);
         }
         if (m_featureUnitSet) {
             _instance.setUnit(m_unit);
         } else {
                 if (m_featureUnitBuilder != null) {
                     _instance.setUnit(m_featureUnitBuilder.build());
                 }
             }
        if (m_nullCheck && _instance.getUnit() == null) {
            throw new IllegalArgumentException("Mandatory \"unit\" attribute is missing from MeasureDefinitionTermBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see MeasureBuilders#newMeasureDefinitionTermBuilder()
     */
    private MeasureDefinitionTermBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  MeasureBuilders#useMeasureDefinitionTermBuilder()
     */
    private MeasureDefinitionTermBuilder(hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the MeasureDefinitionTermBuilder.
     * @return new instance of the MeasureDefinitionTermBuilder
     */
    public static MeasureDefinitionTermBuilder create() {
        return new MeasureDefinitionTermBuilder();
    }

    /**
     * This method creates a new instance of the MeasureDefinitionTermBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the MeasureDefinitionTermBuilder
     */
    public static MeasureDefinitionTermBuilder create(boolean p_nullCheck) {
        return new MeasureDefinitionTermBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the MeasureDefinitionTermBuilder from the given instance of class.
     * @return new instance of the MeasureDefinitionTermBuilder
     */
    public static MeasureDefinitionTermBuilder use(hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm instance) {
        return new MeasureDefinitionTermBuilder(instance);
    }

    /**
     * This method creates a new instance of the MeasureDefinitionTermBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the MeasureDefinitionTermBuilder
     */
    public static MeasureDefinitionTermBuilder use(hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm instance, boolean p_nullCheck) {
        return new MeasureDefinitionTermBuilder(instance).withNullCheck(p_nullCheck);
    }

    private MeasureDefinitionTermBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public MeasureDefinitionTermBuilder withExponent(Integer p_exponent){
         m_exponent = p_exponent;
         m_featureExponentSet = true;
         return this;
     }
     public MeasureDefinitionTermBuilder withUnit(hu.blackbelt.judo.meta.psm.measure.Unit p_unit){
         m_unit = p_unit;
         m_featureUnitSet = true;
         return this;
     }
     public MeasureDefinitionTermBuilder withUnit(hu.blackbelt.judo.meta.psm.measure.util.builder.IMeasureBuilder<? extends hu.blackbelt.judo.meta.psm.measure.Unit> p_measureDefinitionTermBuilder){
         m_featureUnitBuilder = p_measureDefinitionTermBuilder;
         return this;
     }

}
