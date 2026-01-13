package hu.blackbelt.judo.meta.psm.data.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.data.BoundOperation</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class BoundOperationBuilder implements IDataBuilder<hu.blackbelt.judo.meta.psm.data.BoundOperation> {
    private  hu.blackbelt.judo.meta.psm.data.BoundOperation $instance = null;

    // features and builders
     private Boolean m_abstract_;
     private java.lang.String m_documentation;
     private hu.blackbelt.judo.meta.psm.data.OperationBody m_implementation;
     private hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.OperationBody> m_featureImplementationBuilder;
     private hu.blackbelt.judo.meta.psm.service.Parameter m_input;
     private hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.Parameter> m_featureInputBuilder;
     private hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType m_instanceRepresentation;
     private hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType> m_featureInstanceRepresentationBuilder;
     private java.lang.String m_name;
     private hu.blackbelt.judo.meta.psm.service.Parameter m_output;
     private hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.Parameter> m_featureOutputBuilder;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.service.Parameter> m_faults = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.service.Parameter>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.Parameter>> m_featureFaultsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.Parameter>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAbstract_Set = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureFaultsSet = false;
     private boolean m_featureImplementationSet = false;
     private boolean m_featureInputSet = false;
     private boolean m_featureInstanceRepresentationSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featureOutputSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.data.DataPackage.eINSTANCE.getEClassifier("BoundOperation");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public BoundOperationBuilder but() {
           BoundOperationBuilder _builder = create();
          _builder.m_featureAbstract_Set = m_featureAbstract_Set;
          _builder.m_abstract_ = m_abstract_;
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureFaultsSet = m_featureFaultsSet;
          _builder.m_faults = m_faults;
          _builder.m_featureFaultsBuilder = m_featureFaultsBuilder;
          _builder.m_featureImplementationSet = m_featureImplementationSet;
          _builder.m_implementation = m_implementation;
          _builder.m_featureImplementationBuilder = m_featureImplementationBuilder;
          _builder.m_featureInputSet = m_featureInputSet;
          _builder.m_input = m_input;
          _builder.m_featureInputBuilder = m_featureInputBuilder;
          _builder.m_featureInstanceRepresentationSet = m_featureInstanceRepresentationSet;
          _builder.m_instanceRepresentation = m_instanceRepresentation;
          _builder.m_featureInstanceRepresentationBuilder = m_featureInstanceRepresentationBuilder;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featureOutputSet = m_featureOutputSet;
          _builder.m_output = m_output;
          _builder.m_featureOutputBuilder = m_featureOutputBuilder;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.data.BoundOperation type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.data.BoundOperation type
     */
    public hu.blackbelt.judo.meta.psm.data.BoundOperation build() {

        final hu.blackbelt.judo.meta.psm.data.BoundOperation _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.data.DataFactory.eINSTANCE.createBoundOperation();
        } else {
            _instance = $instance;
        }

         if (m_featureAbstract_Set) {
             _instance.setAbstract(m_abstract_);
         }
         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureImplementationSet) {
             _instance.setImplementation(m_implementation);
         } else {
                 if (m_featureImplementationBuilder != null) {
                     _instance.setImplementation(m_featureImplementationBuilder.build());
                 }
             }
         if (m_featureInputSet) {
             _instance.setInput(m_input);
         } else {
                 if (m_featureInputBuilder != null) {
                     _instance.setInput(m_featureInputBuilder.build());
                 }
             }
         if (m_featureInstanceRepresentationSet) {
             _instance.setInstanceRepresentation(m_instanceRepresentation);
         } else {
                 if (m_featureInstanceRepresentationBuilder != null) {
                     _instance.setInstanceRepresentation(m_featureInstanceRepresentationBuilder.build());
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
        if (m_nullCheck && _instance.getInstanceRepresentation() == null) {
            throw new IllegalArgumentException("Mandatory \"instanceRepresentation\" attribute is missing from BoundOperationBuilder.");
        }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from BoundOperationBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see DataBuilders#newBoundOperationBuilder()
     */
    private BoundOperationBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  DataBuilders#useBoundOperationBuilder()
     */
    private BoundOperationBuilder(hu.blackbelt.judo.meta.psm.data.BoundOperation instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the BoundOperationBuilder.
     * @return new instance of the BoundOperationBuilder
     */
    public static BoundOperationBuilder create() {
        return new BoundOperationBuilder();
    }

    /**
     * This method creates a new instance of the BoundOperationBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the BoundOperationBuilder
     */
    public static BoundOperationBuilder create(boolean p_nullCheck) {
        return new BoundOperationBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the BoundOperationBuilder from the given instance of class.
     * @return new instance of the BoundOperationBuilder
     */
    public static BoundOperationBuilder use(hu.blackbelt.judo.meta.psm.data.BoundOperation instance) {
        return new BoundOperationBuilder(instance);
    }

    /**
     * This method creates a new instance of the BoundOperationBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the BoundOperationBuilder
     */
    public static BoundOperationBuilder use(hu.blackbelt.judo.meta.psm.data.BoundOperation instance, boolean p_nullCheck) {
        return new BoundOperationBuilder(instance).withNullCheck(p_nullCheck);
    }

    private BoundOperationBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public BoundOperationBuilder withAbstract_(Boolean p_abstract_){
         m_abstract_ = p_abstract_;
         m_featureAbstract_Set = true;
         return this;
     }
     public BoundOperationBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public BoundOperationBuilder withImplementation(hu.blackbelt.judo.meta.psm.data.OperationBody p_implementation){
         m_implementation = p_implementation;
         m_featureImplementationSet = true;
         return this;
     }
     public BoundOperationBuilder withImplementation(hu.blackbelt.judo.meta.psm.data.util.builder.IDataBuilder<? extends hu.blackbelt.judo.meta.psm.data.OperationBody> p_boundOperationBuilder){
         m_featureImplementationBuilder = p_boundOperationBuilder;
         return this;
     }
     public BoundOperationBuilder withInput(hu.blackbelt.judo.meta.psm.service.Parameter p_input){
         m_input = p_input;
         m_featureInputSet = true;
         return this;
     }
     public BoundOperationBuilder withInput(hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.Parameter> p_boundOperationBuilder){
         m_featureInputBuilder = p_boundOperationBuilder;
         return this;
     }
     public BoundOperationBuilder withInstanceRepresentation(hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType p_instanceRepresentation){
         m_instanceRepresentation = p_instanceRepresentation;
         m_featureInstanceRepresentationSet = true;
         return this;
     }
     public BoundOperationBuilder withInstanceRepresentation(hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType> p_boundOperationBuilder){
         m_featureInstanceRepresentationBuilder = p_boundOperationBuilder;
         return this;
     }
     public BoundOperationBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public BoundOperationBuilder withOutput(hu.blackbelt.judo.meta.psm.service.Parameter p_output){
         m_output = p_output;
         m_featureOutputSet = true;
         return this;
     }
     public BoundOperationBuilder withOutput(hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.Parameter> p_boundOperationBuilder){
         m_featureOutputBuilder = p_boundOperationBuilder;
         return this;
     }

     public BoundOperationBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public BoundOperationBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public BoundOperationBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public BoundOperationBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_boundOperationBuilder){
         m_featureAnnotationsBuilder.add(p_boundOperationBuilder);
         return this;
     }
     public BoundOperationBuilder withFaults(hu.blackbelt.judo.meta.psm.service.Parameter p_faults){
         m_faults.add(p_faults);
         m_featureFaultsSet = true;
         return this;
     }
     
     public BoundOperationBuilder withFaults(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.service.Parameter> p_faults){
         m_faults.addAll(p_faults);
         m_featureFaultsSet = true;
         return this;
     }
     
     public BoundOperationBuilder withFaults(hu.blackbelt.judo.meta.psm.service.Parameter...p_faults){
         m_faults.addAll(java.util.Arrays.asList(p_faults));
         m_featureFaultsSet = true;
         return this;
     }
     
     public BoundOperationBuilder withFaults(hu.blackbelt.judo.meta.psm.service.util.builder.IServiceBuilder<? extends hu.blackbelt.judo.meta.psm.service.Parameter> p_boundOperationBuilder){
         m_featureFaultsBuilder.add(p_boundOperationBuilder);
         return this;
     }
}
