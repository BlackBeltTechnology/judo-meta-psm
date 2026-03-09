package hu.blackbelt.judo.meta.psm.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.PlaceHolder</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class PlaceHolderBuilder implements IPsmBuilder<hu.blackbelt.judo.meta.psm.PlaceHolder> {
    private  hu.blackbelt.judo.meta.psm.PlaceHolder $instance = null;

    // features and builders


     // helper attributes
     private boolean m_nullCheck = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public PlaceHolderBuilder but() {
           PlaceHolderBuilder _builder = create();
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.PlaceHolder type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.PlaceHolder type
     */
    public hu.blackbelt.judo.meta.psm.PlaceHolder build() {

        final hu.blackbelt.judo.meta.psm.PlaceHolder _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.PsmFactory.eINSTANCE.createPlaceHolder();
        } else {
            _instance = $instance;
        }

        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see PsmBuilders#newPlaceHolderBuilder()
     */
    private PlaceHolderBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  PsmBuilders#usePlaceHolderBuilder()
     */
    private PlaceHolderBuilder(hu.blackbelt.judo.meta.psm.PlaceHolder instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the PlaceHolderBuilder.
     * @return new instance of the PlaceHolderBuilder
     */
    public static PlaceHolderBuilder create() {
        return new PlaceHolderBuilder();
    }

    /**
     * This method creates a new instance of the PlaceHolderBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the PlaceHolderBuilder
     */
    public static PlaceHolderBuilder create(boolean p_nullCheck) {
        return new PlaceHolderBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the PlaceHolderBuilder from the given instance of class.
     * @return new instance of the PlaceHolderBuilder
     */
    public static PlaceHolderBuilder use(hu.blackbelt.judo.meta.psm.PlaceHolder instance) {
        return new PlaceHolderBuilder(instance);
    }

    /**
     * This method creates a new instance of the PlaceHolderBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the PlaceHolderBuilder
     */
    public static PlaceHolderBuilder use(hu.blackbelt.judo.meta.psm.PlaceHolder instance, boolean p_nullCheck) {
        return new PlaceHolderBuilder(instance).withNullCheck(p_nullCheck);
    }

    private PlaceHolderBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }



}
