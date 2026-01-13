package hu.blackbelt.judo.meta.psm.namespace.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.namespace.Model</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class ModelBuilder implements INamespaceBuilder<hu.blackbelt.judo.meta.psm.namespace.Model> {
    private  hu.blackbelt.judo.meta.psm.namespace.Model $instance = null;

    // features and builders
     private java.lang.String m_documentation;
     private java.lang.String m_name;
     private java.lang.String m_version;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.NamespaceElement> m_elements = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.NamespaceElement>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Package> m_packages = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Package>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Package>> m_featurePackagesBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Package>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureElementsSet = false;
     private boolean m_featureNameSet = false;
     private boolean m_featurePackagesSet = false;
     private boolean m_featureVersionSet = false;
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.namespace.NamespacePackage.eINSTANCE.getEClassifier("Model");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public ModelBuilder but() {
           ModelBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureElementsSet = m_featureElementsSet;
          _builder.m_elements = m_elements;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          _builder.m_featurePackagesSet = m_featurePackagesSet;
          _builder.m_packages = m_packages;
          _builder.m_featurePackagesBuilder = m_featurePackagesBuilder;
          _builder.m_featureVersionSet = m_featureVersionSet;
          _builder.m_version = m_version;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.namespace.Model type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.namespace.Model type
     */
    public hu.blackbelt.judo.meta.psm.namespace.Model build() {

        final hu.blackbelt.judo.meta.psm.namespace.Model _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.namespace.NamespaceFactory.eINSTANCE.createModel();
        } else {
            _instance = $instance;
        }

         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureNameSet) {
             _instance.setName(m_name);
         }
         if (m_featureVersionSet) {
             _instance.setVersion(m_version);
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
         if(m_featureElementsSet) {
             _instance.getElements().addAll(m_elements);
         }
         if(m_featurePackagesSet) {
             _instance.getPackages().addAll(m_packages);
         } else {
             if (!m_featurePackagesBuilder.isEmpty()) {
                 for (hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Package> builder: m_featurePackagesBuilder) {
                     _instance.getPackages().add(builder.build());
                 }
             }
         }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from ModelBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see NamespaceBuilders#newModelBuilder()
     */
    private ModelBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  NamespaceBuilders#useModelBuilder()
     */
    private ModelBuilder(hu.blackbelt.judo.meta.psm.namespace.Model instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the ModelBuilder.
     * @return new instance of the ModelBuilder
     */
    public static ModelBuilder create() {
        return new ModelBuilder();
    }

    /**
     * This method creates a new instance of the ModelBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the ModelBuilder
     */
    public static ModelBuilder create(boolean p_nullCheck) {
        return new ModelBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the ModelBuilder from the given instance of class.
     * @return new instance of the ModelBuilder
     */
    public static ModelBuilder use(hu.blackbelt.judo.meta.psm.namespace.Model instance) {
        return new ModelBuilder(instance);
    }

    /**
     * This method creates a new instance of the ModelBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the ModelBuilder
     */
    public static ModelBuilder use(hu.blackbelt.judo.meta.psm.namespace.Model instance, boolean p_nullCheck) {
        return new ModelBuilder(instance).withNullCheck(p_nullCheck);
    }

    private ModelBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public ModelBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public ModelBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }
     public ModelBuilder withVersion(java.lang.String p_version){
         m_version = p_version;
         m_featureVersionSet = true;
         return this;
     }

     public ModelBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public ModelBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public ModelBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public ModelBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_modelBuilder){
         m_featureAnnotationsBuilder.add(p_modelBuilder);
         return this;
     }
     public ModelBuilder withElements(hu.blackbelt.judo.meta.psm.namespace.NamespaceElement p_elements){
         m_elements.add(p_elements);
         m_featureElementsSet = true;
         return this;
     }
     
     public ModelBuilder withElements(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.NamespaceElement> p_elements){
         m_elements.addAll(p_elements);
         m_featureElementsSet = true;
         return this;
     }
     
     public ModelBuilder withElements(hu.blackbelt.judo.meta.psm.namespace.NamespaceElement...p_elements){
         m_elements.addAll(java.util.Arrays.asList(p_elements));
         m_featureElementsSet = true;
         return this;
     }
     
     public ModelBuilder withPackages(hu.blackbelt.judo.meta.psm.namespace.Package p_packages){
         m_packages.add(p_packages);
         m_featurePackagesSet = true;
         return this;
     }
     
     public ModelBuilder withPackages(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Package> p_packages){
         m_packages.addAll(p_packages);
         m_featurePackagesSet = true;
         return this;
     }
     
     public ModelBuilder withPackages(hu.blackbelt.judo.meta.psm.namespace.Package...p_packages){
         m_packages.addAll(java.util.Arrays.asList(p_packages));
         m_featurePackagesSet = true;
         return this;
     }
     
     public ModelBuilder withPackages(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Package> p_modelBuilder){
         m_featurePackagesBuilder.add(p_modelBuilder);
         return this;
     }
}
