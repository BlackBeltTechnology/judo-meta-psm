package hu.blackbelt.judo.meta.psm.constraint.util.builder;

/**
  * <!-- begin-user-doc -->
  *   A builder for the model object ' <em><b>hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint</b></em>'.
  * <!-- end-user-doc -->
  *
  * @generated
  */
public class InvariantConstraintBuilder implements IConstraintBuilder<hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint> {
    private  hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint $instance = null;

    // features and builders
     private java.lang.String m_documentation;
     private hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType m_expression;
     private hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType> m_featureExpressionBuilder;
     private java.lang.String m_name;

     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.Annotation> m_annotations = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.Annotation>();
     private java.util.Collection<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>> m_featureAnnotationsBuilder = new java.util.LinkedList<hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation>>();

     // helper attributes
     private boolean m_nullCheck = false;
     private boolean m_featureAnnotationsSet = false;
     private boolean m_featureDocumentationSet = false;
     private boolean m_featureExpressionSet = false;
     private boolean m_featureNameSet = false;

    /**
     * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
     */
    public InvariantConstraintBuilder but() {
           InvariantConstraintBuilder _builder = create();
          _builder.m_featureAnnotationsSet = m_featureAnnotationsSet;
          _builder.m_annotations = m_annotations;
          _builder.m_featureAnnotationsBuilder = m_featureAnnotationsBuilder;
          _builder.m_featureDocumentationSet = m_featureDocumentationSet;
          _builder.m_documentation = m_documentation;
          _builder.m_featureExpressionSet = m_featureExpressionSet;
          _builder.m_expression = m_expression;
          _builder.m_featureExpressionBuilder = m_featureExpressionBuilder;
          _builder.m_featureNameSet = m_featureNameSet;
          _builder.m_name = m_name;
          return _builder;
      }

    /**
     * This method constructs the final hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint type.
     * @return new instance of the hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint type
     */
    public hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint build() {

        final hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint _instance;

        if ($instance == null) {
            _instance = hu.blackbelt.judo.meta.psm.constraint.ConstraintFactory.eINSTANCE.createInvariantConstraint();
        } else {
            _instance = $instance;
        }

         if (m_featureDocumentationSet) {
             _instance.setDocumentation(m_documentation);
         }
         if (m_featureExpressionSet) {
             _instance.setExpression(m_expression);
         } else {
                 if (m_featureExpressionBuilder != null) {
                     _instance.setExpression(m_featureExpressionBuilder.build());
                 }
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
        if (m_nullCheck && _instance.getExpression() == null) {
            throw new IllegalArgumentException("Mandatory \"expression\" attribute is missing from InvariantConstraintBuilder.");
        }
        if (m_nullCheck && _instance.getName() == null) {
            throw new IllegalArgumentException("Mandatory \"name\" attribute is missing from InvariantConstraintBuilder.");
        }
        return _instance;
    }

    /**
     * Builder is not instantiated with a constructor.
     * @see ConstraintBuilders#newInvariantConstraintBuilder()
     */
    private InvariantConstraintBuilder() {
    }


    /**
     * Builder is not instantiated with an instance.
     * @see  ConstraintBuilders#useInvariantConstraintBuilder()
     */
    private InvariantConstraintBuilder(hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint instance) {
        $instance = instance;
    }

    /**
     * This method creates a new instance of the InvariantConstraintBuilder.
     * @return new instance of the InvariantConstraintBuilder
     */
    public static InvariantConstraintBuilder create() {
        return new InvariantConstraintBuilder();
    }

    /**
     * This method creates a new instance of the InvariantConstraintBuilder with mandatory field check if nullCheck is true.
     * @return new instance of the InvariantConstraintBuilder
     */
    public static InvariantConstraintBuilder create(boolean p_nullCheck) {
        return new InvariantConstraintBuilder().withNullCheck(p_nullCheck);
    }

    /**
     * This method creates a new instance of the InvariantConstraintBuilder from the given instance of class.
     * @return new instance of the InvariantConstraintBuilder
     */
    public static InvariantConstraintBuilder use(hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint instance) {
        return new InvariantConstraintBuilder(instance);
    }

    /**
     * This method creates a new instance of the InvariantConstraintBuilder from the given instance of class with mandatory field check if nullCheck is true.
     * @return new instance of the InvariantConstraintBuilder
     */
    public static InvariantConstraintBuilder use(hu.blackbelt.judo.meta.psm.constraint.InvariantConstraint instance, boolean p_nullCheck) {
        return new InvariantConstraintBuilder(instance).withNullCheck(p_nullCheck);
    }

    private InvariantConstraintBuilder withNullCheck(boolean p_nullCheck){
        m_nullCheck = p_nullCheck;
        return this;
    }

     public InvariantConstraintBuilder withDocumentation(java.lang.String p_documentation){
         m_documentation = p_documentation;
         m_featureDocumentationSet = true;
         return this;
     }
     public InvariantConstraintBuilder withExpression(hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType p_expression){
         m_expression = p_expression;
         m_featureExpressionSet = true;
         return this;
     }
     public InvariantConstraintBuilder withExpression(hu.blackbelt.judo.meta.psm.derived.util.builder.IDerivedBuilder<? extends hu.blackbelt.judo.meta.psm.derived.LogicalExpressionType> p_invariantConstraintBuilder){
         m_featureExpressionBuilder = p_invariantConstraintBuilder;
         return this;
     }
     public InvariantConstraintBuilder withName(java.lang.String p_name){
         m_name = p_name;
         m_featureNameSet = true;
         return this;
     }

     public InvariantConstraintBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation p_annotations){
         m_annotations.add(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public InvariantConstraintBuilder withAnnotations(java.util.Collection<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_annotations){
         m_annotations.addAll(p_annotations);
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public InvariantConstraintBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.Annotation...p_annotations){
         m_annotations.addAll(java.util.Arrays.asList(p_annotations));
         m_featureAnnotationsSet = true;
         return this;
     }
     
     public InvariantConstraintBuilder withAnnotations(hu.blackbelt.judo.meta.psm.namespace.util.builder.INamespaceBuilder<? extends hu.blackbelt.judo.meta.psm.namespace.Annotation> p_invariantConstraintBuilder){
         m_featureAnnotationsBuilder.add(p_invariantConstraintBuilder);
         return this;
     }

}
