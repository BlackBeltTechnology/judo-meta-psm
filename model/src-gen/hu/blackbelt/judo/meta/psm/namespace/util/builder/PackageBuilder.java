package hu.blackbelt.judo.meta.psm.namespace.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.namespace.Package</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class PackageBuilder implements INamespaceBuilder<hu.blackbelt.judo.meta.psm.namespace.Package> {
    private  hu.blackbelt.judo.meta.psm.namespace.Package $instance = null;

    // features and builders
     private java.lang.String m_documentation;
     private java.lang.String m_name;

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
    private static final org.eclipse.emf.ecore.EClass ECLASS = (org.eclipse.emf.ecore.EClass)
            hu.blackbelt.judo.meta.psm.namespace.NamespacePackage.eINSTANCE.getEClassifier("Package");

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public PackageBuilder but() {
           PackageBuilder _builder = create();
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
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.namespace.Package type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.namespace.Package type
     */
    public hu.blackbelt.judo.meta.psm.namespace.Package build() {

        final hu.blackbelt.judo.meta.psm.namespace.Package _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.namespace.NamespaceFactory.eINSTANCE.createPackage();
        } else {
            _instance = $instance;
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
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from PackageBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see NamespaceBuilders#newPackageBuilder()
     */
    private PackageBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  NamespaceBuilders#usePackageBuilder()
     */
    private PackageBuilder(hu.blackbelt.judo.meta.psm.namespace.Package instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the PackageBuilder.
     * @return new instance of the PackageBuilder
     */
    public static PackageBuilder create() {
        return new PackageBuilder();
    }

    /**
     * This method creates a new instance of the PackageBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the PackageBuilder
     */
    public static PackageBuilder create(boolean p_nullCheck) {
        return new PackageBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the PackageBuilder from the given instance of class.
     * @return new instance of the PackageBuilder
     */
    public static PackageBuilder use(hu.blackbelt.judo.meta.psm.namespace.Package instance) {
        return new PackageBuilder(instance);
    }

    /**
     * This method creates a new instance of the PackageBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the PackageBuilder
     */
    public static PackageBuilder use(hu.blackbelt.judo.meta.psm.namespace.Package instance, boolean p_nullCheck) {
        return new PackageBuilder(instance).withNullCheck(p_nullCheck);
    }

    private PackageBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public PackageBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public PackageBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }

     public PackageBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public PackageBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public PackageBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public PackageBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_packageBuilder){
         m_featureAnnotationsBuilder.add(p_packageBuilder);
         return this;
     }
     public PackageBuilder withElements(hu.blackbelt.judo.meta.psm.namespace.NamespaceElement p_elements){
         m_elements.add(p_elements);
         m_featureElementsSet = true;
         return this;
     }
     
     public PackageBuilder withElements(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.NamespaceElement> p_elements){
         m_elements.addAll(p_elements);
         m_featureElementsSet = true;
         return this;
     }
     
     public PackageBuilder withElements(hu.blackbelt.judo.meta.psm.namespace.NamespaceElement...p_elements){
         m_elements.addAll(java.util.Arrays.asList(p_elements));
         m_featureElementsSet = true;
         return this;
     }
     
     public PackageBuilder withPackages(hu.blackbelt.judo.meta.psm.namespace.Package p_packages){
         m_packages.add(p_packages);
         m_featurePackagesSet = true;
         return this;
     }
     
     public PackageBuilder withPackages(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Package> p_packages){
         m_packages.addAll(p_packages);
         m_featurePackagesSet = true;
         return this;
     }
     
     public PackageBuilder withPackages(hu.blackbelt.judo.meta.psm.namespace.Package...p_packages){
         m_packages.addAll(java.util.Arrays.asList(p_packages));
         m_featurePackagesSet = true;
         return this;
     }
     
     public PackageBuilder withPackages(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Package> p_packageBuilder){
         m_featurePackagesBuilder.add(p_packageBuilder);
         return this;
     }
}
