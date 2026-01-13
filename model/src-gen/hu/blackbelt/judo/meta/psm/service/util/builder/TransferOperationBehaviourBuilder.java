package hu.blackbelt.judo.meta.psm.service.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class TransferOperationBehaviourBuilder implements IServiceBuilder<hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour> {
    private  hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour $instance = null;

    // features and builders
     private hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType m_behaviourType;
     private hu.blackbelt.judo.meta.psm.namespace.NamedElement m_owner;
     private hu.blackbelt.judo.meta.psm.service.TransferObjectRelation m_relation;
     private hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferObjectRelation> m_featureRelationBuilder;


     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureBehaviourTypeSet = false;
     private boolean m_featureOwnerSet = false;
     private boolean m_featureRelationSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.service.ServicePackage.eINSTANCE.getEClassifier("TransferOperationBehaviour");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public TransferOperationBehaviourBuilder but() {
           TransferOperationBehaviourBuilder _builder = create();
          _builder.m_featureBehaviourTypeSet = m_featureBehaviourTypeSet;
          _builder.m_behaviourType = m_behaviourType;
          _builder.m_featureOwnerSet = m_featureOwnerSet;
          _builder.m_owner = m_owner;
          _builder.m_featureRelationSet = m_featureRelationSet;
          _builder.m_relation = m_relation;
          _builder.m_featureRelationBuilder = m_featureRelationBuilder;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour type
     */
    public hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour build() {

        final hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.service.ServiceFactory.eINSTANCE.createTransferOperationBehaviour();
        } else {
            _instance = $instance;
        }

         if (m_featureBehaviourTypeSet) {
             _instance.setBehaviourType(m_behaviourType);
         }
         if (m_featureOwnerSet) {
             _instance.setOwner(m_owner);
         }
         if (m_featureRelationSet) {
             _instance.setRelation(m_relation);
         } else {
                 if (m_featureRelationBuilder != null) {
                     _instance.setRelation(m_featureRelationBuilder.build());
                 }
             }
        if (m_nullCheck && _instance.getOwner() == null) {
            throw new IllegalArgumentException("Mandatory \"owner\" attribute is missing from TransferOperationBehaviourBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see ServiceBuilders#newTransferOperationBehaviourBuilder()
     */
    private TransferOperationBehaviourBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  ServiceBuilders#useTransferOperationBehaviourBuilder()
     */
    private TransferOperationBehaviourBuilder(hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the TransferOperationBehaviourBuilder.
     * @return new instance of the TransferOperationBehaviourBuilder
     */
    public static TransferOperationBehaviourBuilder create() {
        return new TransferOperationBehaviourBuilder();
    }

    /**
     * This method creates a new instance of the TransferOperationBehaviourBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the TransferOperationBehaviourBuilder
     */
    public static TransferOperationBehaviourBuilder create(boolean p_nullCheck) {
        return new TransferOperationBehaviourBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the TransferOperationBehaviourBuilder from the given instance of class.
     * @return new instance of the TransferOperationBehaviourBuilder
     */
    public static TransferOperationBehaviourBuilder use(hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour instance) {
        return new TransferOperationBehaviourBuilder(instance);
    }

    /**
     * This method creates a new instance of the TransferOperationBehaviourBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the TransferOperationBehaviourBuilder
     */
    public static TransferOperationBehaviourBuilder use(hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour instance, boolean p_nullCheck) {
        return new TransferOperationBehaviourBuilder(instance).withNullCheck(p_nullCheck);
    }

    private TransferOperationBehaviourBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public TransferOperationBehaviourBuilder withBehaviourType(hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType p_behaviourType){
         m_behaviourType = p_behaviourType;
         m_featureBehaviourTypeSet = true;
         return this;
     }
     public TransferOperationBehaviourBuilder withOwner(hu.blackbelt.judo.meta.psm.namespace.NamedElement p_owner){
         m_owner = p_owner;
         m_featureOwnerSet = true;
         return this;
     }
     public TransferOperationBehaviourBuilder withRelation(hu.blackbelt.judo.meta.psm.service.TransferObjectRelation p_relation){
         m_relation = p_relation;
         m_featureRelationSet = true;
         return this;
     }
     public TransferOperationBehaviourBuilder withRelation(hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferObjectRelation> p_transferOperationBehaviourBuilder){
         m_featureRelationBuilder = p_transferOperationBehaviourBuilder;
         return this;
     }

}
