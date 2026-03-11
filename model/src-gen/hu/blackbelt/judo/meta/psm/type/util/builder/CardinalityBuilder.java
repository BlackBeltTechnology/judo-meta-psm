package hu.blackbelt.judo.meta.psm.type.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.type.Cardinality</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class CardinalityBuilder implements ITypeBuilder<hu.blackbelt.judo.meta.psm.type.Cardinality> {
    private  hu.blackbelt.judo.meta.psm.type.Cardinality $instance = null;

    // features and builders
     private Integer m_lower;
     private Integer m_upper;


     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureLowerSet = false;
     private boolean m_featureUpperSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.type.TypePackage.eINSTANCE.getEClassifier("Cardinality");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public CardinalityBuilder but() {
           CardinalityBuilder _builder = create();
          _builder.m_featureLowerSet = m_featureLowerSet;
          _builder.m_lower = m_lower;
          _builder.m_featureUpperSet = m_featureUpperSet;
          _builder.m_upper = m_upper;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.type.Cardinality type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.type.Cardinality type
     */
    public hu.blackbelt.judo.meta.psm.type.Cardinality build() {

        final hu.blackbelt.judo.meta.psm.type.Cardinality _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.type.TypeFactory.eINSTANCE.createCardinality();
        } else {
            _instance = $instance;
        }

         if (m_featureLowerSet) {
             _instance.setLower(m_lower);
         }
         if (m_featureUpperSet) {
             _instance.setUpper(m_upper);
         }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see TypeBuilders#newCardinalityBuilder()
     */
    private CardinalityBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  TypeBuilders#useCardinalityBuilder()
     */
    private CardinalityBuilder(hu.blackbelt.judo.meta.psm.type.Cardinality instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the CardinalityBuilder.
     * @return new instance of the CardinalityBuilder
     */
    public static CardinalityBuilder create() {
        return new CardinalityBuilder();
    }

    /**
     * This method creates a new instance of the CardinalityBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the CardinalityBuilder
     */
    public static CardinalityBuilder create(boolean p_nullCheck) {
        return new CardinalityBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the CardinalityBuilder from the given instance of class.
     * @return new instance of the CardinalityBuilder
     */
    public static CardinalityBuilder use(hu.blackbelt.judo.meta.psm.type.Cardinality instance) {
        return new CardinalityBuilder(instance);
    }

    /**
     * This method creates a new instance of the CardinalityBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the CardinalityBuilder
     */
    public static CardinalityBuilder use(hu.blackbelt.judo.meta.psm.type.Cardinality instance, boolean p_nullCheck) {
        return new CardinalityBuilder(instance).withNullCheck(p_nullCheck);
    }

    private CardinalityBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public CardinalityBuilder withLower(Integer p_lower){
         m_lower = p_lower;
         m_featureLowerSet = true;
         return this;
     }
     public CardinalityBuilder withUpper(Integer p_upper){
         m_upper = p_upper;
         m_featureUpperSet = true;
         return this;
     }

}
