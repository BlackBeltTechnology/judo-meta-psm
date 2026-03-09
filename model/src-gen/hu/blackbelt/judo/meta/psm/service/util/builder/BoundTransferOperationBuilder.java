package hu.blackbelt.judo.meta.psm.service.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.service.BoundTransferOperation</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class BoundTransferOperationBuilder implements IServiceBuilder<hu.blackbelt.judo.meta.psm.service.BoundTransferOperation> {
    private  hu.blackbelt.judo.meta.psm.service.BoundTransferOperation $instance = null;

    // features and builders
     private hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour m_behaviour;
     private hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour> m_featureBehaviourBuilder;
     private hu.blackbelt.judo.meta.psm.data.BoundOperation m_binding;
     private hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.BoundOperation> m_featureBindingBuilder;
     private Boolean m_deleteOnResult;
     private java.lang.String m_documentation;
     private Boolean m_immutable;
     private hu.blackbelt.judo.meta.psm.service.Parameter m_input;
     private hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.Parameter> m_featureInputBuilder;
     private hu.blackbelt.judo.meta.psm.service.TransferObjectRelation m_inputRange;
     private hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferObjectRelation> m_featureInputRangeBuilder;
     private java.lang.String m_name;
     private hu.blackbelt.judo.meta.psm.service.Parameter m_output;
     private hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.Parameter> m_featureOutputBuilder;
     private Boolean m_updateOnResult;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.service.Parameter> m_faults = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.service.Parameter>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.Parameter>> m_featureFaultsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.Parameter>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureBehaviourSet = false;
     private boolean m_featureBindingSet = false;
     private boolean m_featureDeleteOnResultSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureFaultsSet = false;
     private boolean m_featureImmutableSet = false;
     private boolean m_featureInputSet = false;
     private boolean m_featureInputRangeSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureOutputSet = false;
     private boolean m_featureUpdateOnResultSet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public BoundTransferOperationBuilder but() {
           BoundTransferOperationBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureBehaviourSet = m_featureBehaviourSet;
          _builder.m_behaviour = m_behaviour;
          _builder.m_featureBehaviourBuilder = m_featureBehaviourBuilder;
          _builder.m_featureBindingSet = m_featureBindingSet;
          _builder.m_binding = m_binding;
          _builder.m_featureBindingBuilder = m_featureBindingBuilder;
          _builder.m_featureDeleteOnResultSet = m_featureDeleteOnResultSet;
          _builder.m_deleteOnResult = m_deleteOnResult;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureFaultsSet = m_featureFaultsSet;
          _builder.m_faults = m_faults;
          _builder.m_featureFaultsBuilder = m_featureFaultsBuilder;
          _builder.m_featureImmutableSet = m_featureImmutableSet;
          _builder.m_immutable = m_immutable;
          _builder.m_featureInputSet = m_featureInputSet;
          _builder.m_input = m_input;
          _builder.m_featureInputBuilder = m_featureInputBuilder;
          _builder.m_featureInputRangeSet = m_featureInputRangeSet;
          _builder.m_inputRange = m_inputRange;
          _builder.m_featureInputRangeBuilder = m_featureInputRangeBuilder;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureOutputSet = m_featureOutputSet;
          _builder.m_output = m_output;
          _builder.m_featureOutputBuilder = m_featureOutputBuilder;
          _builder.m_featureUpdateOnResultSet = m_featureUpdateOnResultSet;
          _builder.m_updateOnResult = m_updateOnResult;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.service.BoundTransferOperation type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.service.BoundTransferOperation type
     */
    public hu.blackbelt.judo.meta.psm.service.BoundTransferOperation build() {

        final hu.blackbelt.judo.meta.psm.service.BoundTransferOperation _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.service.ServiceFactory.eINSTANCE.createBoundTransferOperation();
        } else {
            _instance = $instance;
        }

         if (m_featureBehaviourSet) {
             _instance.setBehaviour(m_behaviour);
         } else {
                 if (m_featureBehaviourBuilder != null) {
                     _instance.setBehaviour(m_featureBehaviourBuilder.build());
                 }
             }
         if (m_featureBindingSet) {
             _instance.setBinding(m_binding);
         } else {
                 if (m_featureBindingBuilder != null) {
                     _instance.setBinding(m_featureBindingBuilder.build());
                 }
             }
         if (m_featureDeleteOnResultSet) {
             _instance.setDeleteOnResult(m_deleteOnResult);
         }
         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureImmutableSet) {
             _instance.setImmutable(m_immutable);
         }
         if (m_featureInputSet) {
             _instance.setInput(m_input);
         } else {
                 if (m_featureInputBuilder != null) {
                     _instance.setInput(m_featureInputBuilder.build());
                 }
             }
         if (m_featureInputRangeSet) {
             _instance.setInputRange(m_inputRange);
         } else {
                 if (m_featureInputRangeBuilder != null) {
                     _instance.setInputRange(m_featureInputRangeBuilder.build());
                 }
             }
         if (m_featureNameSet) {
             _instance.setName(m_name);
         }
         if (m_featureOutputSet) {
             _instance.setOutput(m_output);
         } else {
                 if (m_featureOutputBuilder != null) {
                     _instance.setOutput(m_featureOutputBuilder.build());
                 }
             }
         if (m_featureUpdateOnResultSet) {
             _instance.setUpdateOnResult(m_updateOnResult);
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
         if(m_featureFaultsSet) {
             _instance.getFaults().addAll(m_faults);
         } else {
             if (!m_featureFaultsBuilder.isEmpty()) {
                 for (hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.Parameter> builder: m_featureFaultsBuilder) {
                     _instance.getFaults().add(builder.build());
                 }
             }
         }
        if (m_nullCheck && _instance.getBinding() == null) {
            throw new IllegalArgumentException("Mandatory \"binding\" attribute is missing from BoundTransferOperationBuilder.");
        }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from BoundTransferOperationBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see ServiceBuilders#newBoundTransferOperationBuilder()
     */
    private BoundTransferOperationBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  ServiceBuilders#useBoundTransferOperationBuilder()
     */
    private BoundTransferOperationBuilder(hu.blackbelt.judo.meta.psm.service.BoundTransferOperation instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the BoundTransferOperationBuilder.
     * @return new instance of the BoundTransferOperationBuilder
     */
    public static BoundTransferOperationBuilder create() {
        return new BoundTransferOperationBuilder();
    }

    /**
     * This method creates a new instance of the BoundTransferOperationBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the BoundTransferOperationBuilder
     */
    public static BoundTransferOperationBuilder create(boolean p_nullCheck) {
        return new BoundTransferOperationBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the BoundTransferOperationBuilder from the given instance of class.
     * @return new instance of the BoundTransferOperationBuilder
     */
    public static BoundTransferOperationBuilder use(hu.blackbelt.judo.meta.psm.service.BoundTransferOperation instance) {
        return new BoundTransferOperationBuilder(instance);
    }

    /**
     * This method creates a new instance of the BoundTransferOperationBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the BoundTransferOperationBuilder
     */
    public static BoundTransferOperationBuilder use(hu.blackbelt.judo.meta.psm.service.BoundTransferOperation instance, boolean p_nullCheck) {
        return new BoundTransferOperationBuilder(instance).withNullCheck(p_nullCheck);
    }

    private BoundTransferOperationBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public BoundTransferOperationBuilder withBehaviour(hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour p_behaviour){
         m_behaviour = p_behaviour;
         m_featureBehaviourSet = true;
         return this;
     }
     public BoundTransferOperationBuilder withBehaviour(hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour> p_boundTransferOperationBuilder){
         m_featureBehaviourBuilder = p_boundTransferOperationBuilder;
         return this;
     }
     public BoundTransferOperationBuilder withBinding(hu.blackbelt.judo.meta.psm.data.BoundOperation p_binding){
         m_binding = p_binding;
         m_featureBindingSet = true;
         return this;
     }
     public BoundTransferOperationBuilder withBinding(hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.BoundOperation> p_boundTransferOperationBuilder){
         m_featureBindingBuilder = p_boundTransferOperationBuilder;
         return this;
     }
     public BoundTransferOperationBuilder withDeleteOnResult(Boolean p_deleteOnResult){
         m_deleteOnResult = p_deleteOnResult;
         m_featureDeleteOnResultSet = true;
         return this;
     }
     public BoundTransferOperationBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public BoundTransferOperationBuilder withImmutable(Boolean p_immutable){
         m_immutable = p_immutable;
         m_featureImmutableSet = true;
         return this;
     }
     public BoundTransferOperationBuilder withInput(hu.blackbelt.judo.meta.psm.service.Parameter p_input){
         m_input = p_input;
         m_featureInputSet = true;
         return this;
     }
     public BoundTransferOperationBuilder withInput(hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.Parameter> p_boundTransferOperationBuilder){
         m_featureInputBuilder = p_boundTransferOperationBuilder;
         return this;
     }
     public BoundTransferOperationBuilder withInputRange(hu.blackbelt.judo.meta.psm.service.TransferObjectRelation p_inputRange){
         m_inputRange = p_inputRange;
         m_featureInputRangeSet = true;
         return this;
     }
     public BoundTransferOperationBuilder withInputRange(hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.TransferObjectRelation> p_boundTransferOperationBuilder){
         m_featureInputRangeBuilder = p_boundTransferOperationBuilder;
         return this;
     }
     public BoundTransferOperationBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public BoundTransferOperationBuilder withOutput(hu.blackbelt.judo.meta.psm.service.Parameter p_output){
         m_output = p_output;
         m_featureOutputSet = true;
         return this;
     }
     public BoundTransferOperationBuilder withOutput(hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.Parameter> p_boundTransferOperationBuilder){
         m_featureOutputBuilder = p_boundTransferOperationBuilder;
         return this;
     }
     public BoundTransferOperationBuilder withUpdateOnResult(Boolean p_updateOnResult){
         m_updateOnResult = p_updateOnResult;
         m_featureUpdateOnResultSet = true;
         return this;
     }

     public BoundTransferOperationBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public BoundTransferOperationBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public BoundTransferOperationBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public BoundTransferOperationBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_boundTransferOperationBuilder){
         m_featureAnnotationsBuilder.add(p_boundTransferOperationBuilder);
         return this;
     }
     public BoundTransferOperationBuilder withFaults(hu.blackbelt.judo.meta.psm.service.Parameter p_faults){
         m_faults.add(p_faults);
         m_featureFaultsSet = true;
         return this;
     }
     
     public BoundTransferOperationBuilder withFaults(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.service.Parameter> p_faults){
         m_faults.addAll(p_faults);
         m_featureFaultsSet = true;
         return this;
     }
     
     public BoundTransferOperationBuilder withFaults(hu.blackbelt.judo.meta.psm.service.Parameter...p_faults){
         m_faults.addAll(java.util.Arrays.asList(p_faults));
         m_featureFaultsSet = true;
         return this;
     }
     
     public BoundTransferOperationBuilder withFaults(hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.Parameter> p_boundTransferOperationBuilder){
         m_featureFaultsBuilder.add(p_boundTransferOperationBuilder);
         return this;
     }

}
