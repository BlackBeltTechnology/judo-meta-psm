package hu.blackbelt.judo.meta.psm;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.data.Containment;
import hu.blackbelt.judo.meta.psm.data.EntitySequence;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.data.OperationBody;
import hu.blackbelt.judo.meta.psm.data.PrimitiveTypedElement;
import hu.blackbelt.judo.meta.psm.data.ReferenceTypedElement;
import hu.blackbelt.judo.meta.psm.data.Relation;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.DurationType;
import hu.blackbelt.judo.meta.psm.measure.DurationUnit;
import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Namespace;
import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.BoundTransferOperation;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.OperationDeclaration;
import hu.blackbelt.judo.meta.psm.service.Parameter;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferOperation;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviourType;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Utils for PSM models.
 */
public class PsmUtils {

    public static final String NAMESPACE_SEPARATOR = "::";
    public static final String FEATURE_SEPARATOR = ".";

    private static final EList<TransferOperationBehaviourType> behaviourTypesToExtend = new UniqueEList<>(Arrays.asList(
            TransferOperationBehaviourType.CREATE,
            TransferOperationBehaviourType.UPDATE,
            TransferOperationBehaviourType.SET_RELATION,
            TransferOperationBehaviourType.ADD_ALL_TO_RELATION,
            TransferOperationBehaviourType.REMOVE_ALL_FROM_RELATION,
            TransferOperationBehaviourType.CREATE_RELATION,
            TransferOperationBehaviourType.UPDATE_RELATION,
            TransferOperationBehaviourType.SET_RELATION_OF_RELATION,
            TransferOperationBehaviourType.ADD_ALL_TO_RELATION_OF_RELATION,
            TransferOperationBehaviourType.REMOVE_ALL_FROM_RELATION_OF_RELATION
    ));

    /**
     * Convert namespace to string.
     *
     * @param namespace namespace
     * @return namespace as string
     */
    public static String namespaceToString(final Namespace namespace) {
        if (namespace instanceof Model) {
            return namespace.getName();
        } else if (namespace instanceof Package) {
            final Optional<Namespace> containerNamespace = getNamespaceOfPackage((Package) namespace);
            if (containerNamespace.isPresent()) {
                return namespaceToString(containerNamespace.get()) + NAMESPACE_SEPARATOR + namespace.getName();
            } else {
                // relative path is returned
                return NAMESPACE_SEPARATOR + namespace.getName();
            }
        } else {
            throw new IllegalArgumentException("Invalid namespace");
        }
    }

    /**
     * Convert namespace element to string.
     *
     * @param namespaceElement namespace element
     * @return namespace element as string
     */
    public static String namespaceElementToString(final NamespaceElement namespaceElement) {
        if (namespaceElement.eContainer() == null) {
            throw new IllegalStateException("NameSpaceElement container not set (not added to resource?) - " + namespaceElement.getName());
        }
        final Optional<Namespace> namespace = getNamespaceOfNamespaceElement(namespaceElement);
        if (namespace.isPresent()) {
            return namespaceToString(namespace.get()) + NAMESPACE_SEPARATOR + namespaceElement.getName();
        } else {
            // relative path is returned
            return NAMESPACE_SEPARATOR + namespaceElement.getName();
        }
    }

    /**
     * Convert attribute to string.
     *
     * @param attribute attribute
     * @return attribute as string
     */
    public static String attributeToString(final Attribute attribute) {
        final EntityType entityType = (EntityType) attribute.eContainer();
        if (entityType != null) {
            return namespaceElementToString(entityType) + FEATURE_SEPARATOR + attribute.getName();
        } else {
            return FEATURE_SEPARATOR + attribute.getName();
        }
    }

    /**
     * Convert relation to string.
     *
     * @param relation relation
     * @return relation as string
     */
    public static String relationToString(final Relation relation) {
        final EntityType entityType = (EntityType) relation.eContainer();
        if (entityType != null) {
            return namespaceElementToString(entityType) + FEATURE_SEPARATOR + relation.getName();
        } else {
            return FEATURE_SEPARATOR + relation.getName();
        }
    }

    /**
     * Convert transfer attribute to string.
     *
     * @param transferAttribute transfer attribute
     * @return transfer attribute as string
     */
    public static String transferAttributeToString(final TransferAttribute transferAttribute) {
        final PrimitiveTypedElement binding = transferAttribute.getBinding();
        final Optional<EntityType> entityType;
        if (binding instanceof Attribute) {
            entityType = Optional.ofNullable((EntityType) binding.eContainer());
        } else if (binding instanceof DataProperty) {
            entityType = Optional.ofNullable((EntityType) binding.eContainer());
        } else {
            entityType = Optional.empty();
        }
        if (entityType.isPresent()) {
            return namespaceElementToString(entityType.get()) + FEATURE_SEPARATOR + transferAttribute.getName();
        } else {
            return FEATURE_SEPARATOR + transferAttribute.getName();
        }
    }

    /**
     * Convert transfer object relation to string.
     *
     * @param transferObjectRelation transfer object relation
     * @return transfer object relation as string
     */
    public static String transferObjectRelationToString(final TransferObjectRelation transferObjectRelation) {
        final ReferenceTypedElement binding = transferObjectRelation.getBinding();
        final Optional<EntityType> entityType;
        if (binding instanceof Relation) {
            entityType = Optional.ofNullable((EntityType) binding.eContainer());
        } else if (binding instanceof NavigationProperty) {
            entityType = Optional.ofNullable((EntityType) binding.eContainer());
        } else {
            entityType = Optional.empty();
        }
        if (entityType.isPresent()) {
            return namespaceElementToString(entityType.get()) + FEATURE_SEPARATOR + transferObjectRelation.getName();
        } else {
            return FEATURE_SEPARATOR + transferObjectRelation.getName();
        }
    }

    /**
     * Get namespace of a given package.
     *
     * @param pkg package
     * @return namespace of the package
     */
    public static Optional<Namespace> getNamespaceOfPackage(final Package pkg) {
        return getAllContents(pkg, Namespace.class)
                .filter(ns -> ns.getPackages().contains(pkg))
                .findAny();
    }

    /**
     * Get namespace of a given namespace element.
     *
     * @param namespaceElement namespace element
     * @return namespace of the namespace element
     */
    public static Optional<Namespace> getNamespaceOfNamespaceElement(final NamespaceElement namespaceElement) {
        return getAllContents(namespaceElement, Namespace.class)
                .filter(ns -> ns.getElements().contains(namespaceElement))
                .findAny();
    }

    /**
     * Get entity type of an attribute.
     *
     * @param attribute attribute
     * @return entity type of the attribute
     */
    @Deprecated
    public static Optional<EntityType> getEntityTypeOfAttribute(final Attribute attribute) {
        return Optional.ofNullable((EntityType) attribute.eContainer());
    }

    /**
     * Get entity type of a relation.
     *
     * @param relation relation
     * @return entity type of the relation
     */
    @Deprecated
    public static Optional<EntityType> getEntityTypeOfRelation(final Relation relation) {
        return Optional.ofNullable((EntityType) relation.eContainer());
    }

    /**
     * Get entity type of a data property.
     *
     * @param dataProperty data property
     * @return entity type of the data property
     */
    @Deprecated
    public static Optional<EntityType> getEntityTypeOfDataProperty(final DataProperty dataProperty) {
        return Optional.ofNullable((EntityType) dataProperty.eContainer());
    }

    /**
     * Get entity type of a navigation property.
     *
     * @param navigationProperty navigation property
     * @return entity type of the navigation property
     */
    @Deprecated
    public static Optional<EntityType> getEntityTypeOfNavigationProperty(final NavigationProperty navigationProperty) {
        return Optional.ofNullable((EntityType) navigationProperty.eContainer());
    }

    /**
     * Check if an entity type is used as containment.
     *
     * @param entityType entity type
     * @return <code>true</code> if entity type is used as containment (at least once), <code>false</code> otherwise
     */
    public static boolean isContainment(final EntityType entityType) {
        return getAllContents(entityType, Containment.class)
                .anyMatch(containment -> EcoreUtil.equals(containment.getTarget(), entityType));
    }

    /**
     * Get list of all super types of a given entity type. The given entity type is included in case of circular references.
     *
     * @param entityType entity type
     * @return list of super types
     */
    public static EList<EntityType> getAllSuperEntityTypes(final EntityType entityType) {
        final EList<EntityType> foundSuperTypes = new UniqueEList<>();
        addSuperTypes(entityType, foundSuperTypes);
        return foundSuperTypes;
    }

    /**
     * Add super types of a given entity type recursively to a list.
     *
     * @param entityType      entity type
     * @param foundSuperTypes list that super types added to
     */
    private static void addSuperTypes(final EntityType entityType, final EList<EntityType> foundSuperTypes) {
        final Set<EntityType> newSuperTypes = entityType.getSuperEntityTypes().stream().filter(s -> !foundSuperTypes.contains(s)).collect(Collectors.toSet());
        foundSuperTypes.addAll(newSuperTypes);
        newSuperTypes.forEach(s -> addSuperTypes(s, foundSuperTypes));
    }

    /**
     * Get unique list of all (inherited and not inherited) relations of a given entity type.
     *
     * @param entityType entity type
     * @return unique list of the inherited and own relations of an entity type
     */
    public static EList<Relation> getAllRelations(final EntityType entityType) {
        final EList<Relation> relations = new UniqueEList<>();
        relations.addAll(entityType.getRelations());
        relations.addAll(entityType.getAllSuperEntityTypes().stream()
                .flatMap(e -> e.getRelations().stream())
                .collect(Collectors.toSet()));
        return relations;
    }

    /**
     * Get unique list of all (inherited and not inherited) attributes of a given entity type.
     *
     * @param entityType entity type
     * @return unique list of the inherited and own attributes of an entity type
     */
    public static EList<Attribute> getAllAttributes(final EntityType entityType) {
        final EList<Attribute> attributes = new UniqueEList<>();
        attributes.addAll(entityType.getAttributes());
        attributes.addAll(entityType.getAllSuperEntityTypes().stream()
                .flatMap(e -> e.getAttributes().stream())
                .collect(Collectors.toSet()));
        return attributes;
    }

    /**
     * Get unique list of all (inherited and not inherited) data properties of a given entity type.
     *
     * @param entityType entity type
     * @return unique list of the inherited and own data properties of an entity type
     */
    public static EList<DataProperty> getAllDataProperties(final EntityType entityType) {
        final EList<DataProperty> dataProperties = new UniqueEList<>();
        dataProperties.addAll(entityType.getDataProperties());
        dataProperties.addAll(entityType.getAllSuperEntityTypes().stream()
                .flatMap(e -> e.getDataProperties().stream())
                .collect(Collectors.toSet()));
        return dataProperties;
    }

    /**
     * Get unique list of all (inherited and not inherited) navigation properties of a given entity type.
     *
     * @param entityType entity type
     * @return unique list of the inherited and own navigation properties of an entity type
     */
    public static EList<NavigationProperty> getAllNavigationProperties(final EntityType entityType) {
        final EList<NavigationProperty> navigationProperties = new UniqueEList<>();
        navigationProperties.addAll(entityType.getNavigationProperties());
        navigationProperties.addAll(entityType.getAllSuperEntityTypes().stream()
                .flatMap(e -> e.getNavigationProperties().stream())
                .collect(Collectors.toSet()));
        return navigationProperties;
    }

    /**
     * Get unique list of all (inherited and not inherited) sequences of a given entity type.
     *
     * @param entityType entity type
     * @return unique list of the inherited and own sequences of an entity type
     */
    public static EList<EntitySequence> getAllSequences(final EntityType entityType) {
        final EList<EntitySequence> sequences = new UniqueEList<>();
        sequences.addAll(entityType.getSequences());
        sequences.addAll(entityType.getAllSuperEntityTypes().stream()
                .flatMap(e -> e.getSequences().stream())
                .collect(Collectors.toSet()));
        return sequences;
    }

    /**
     * Get unique list of all (inherited and not inherited) bound operations of a given entity type.
     *
     * @param entityType entity type
     * @return unique list of the inherited and own bound operations of an entity type
     */
    public static EList<BoundOperation> getAllBoundOperations(final EntityType entityType) {
        EList<BoundOperation> operations = new UniqueEList<>();
        operations.addAll(entityType.getOperations());
        operations.addAll(entityType.getAllSuperEntityTypes().stream()
                .flatMap(e -> e.getOperations().stream())
                .collect(Collectors.toSet()));
        return operations;
    }

    /**
     * Get unique list of inherited bound operations of a given entity type.
     *
     * @param entityType entity type
     * @return unique list of the inherited bound operations of an entity type
     */
    public static EList<BoundOperation> getInheritedBoundOperations(final EntityType entityType) {
        EList<BoundOperation> operations = new UniqueEList<>();
        operations.addAll(entityType.getAllSuperEntityTypes().stream()
                .flatMap(e -> e.getOperations().stream())
                .collect(Collectors.toSet()));
        return operations;
    }

    /**
     * Compares input, output and fault parameters of two operation declarations.
     *
     * @param op1 operation declaration, op2	operation declaration
     * @return true if the input, output and fault types and cardinalities are the same for both operations
     */
    public static boolean parametersAreTheSame(final OperationDeclaration op1, final OperationDeclaration op2) {
        if (op1.getInput() != null) {
            if (op2.getInput() == null) return false;
            if (!op1.getInput().getType().equals(op2.getInput().getType())) return false;
            if (op1.getInput().getCardinality().getLower() != op2.getInput().getCardinality().getLower() ||
                    op1.getInput().getCardinality().getUpper() != op2.getInput().getCardinality().getUpper())
                return false;
        } else if (op2.getInput() != null) return false;

        if (op1.getOutput() != null) {
            if (op2.getOutput() == null) return false;
            if (!op1.getOutput().getType().equals(op2.getOutput().getType())) return false;
            if (op1.getOutput().getCardinality().getLower() != op2.getOutput().getCardinality().getLower() ||
                    op1.getOutput().getCardinality().getUpper() != op2.getOutput().getCardinality().getUpper())
                return false;
        } else if (op2.getOutput() != null) return false;

        if (op1.getFaults().size() != op2.getFaults().size()) return false;
        else if (op1.getFaults().isEmpty() && op2.getFaults().isEmpty()) return true;

        return op1.getFaults().stream()
                .allMatch(f -> op2.getFaults().stream()
                        .anyMatch(f2 -> f.getType().equals(f2.getType()) &&
                                f.getCardinality().getLower() == f2.getCardinality().getLower() &&
                                f.getCardinality().getUpper() == f2.getCardinality().getUpper()))
                &&
                op2.getFaults().stream()
                        .allMatch(f -> op1.getFaults().stream()
                                .anyMatch(f1 -> f.getType().equals(f1.getType()) &&
                                        f.getCardinality().getLower() == f1.getCardinality().getLower() &&
                                        f.getCardinality().getUpper() == f1.getCardinality().getUpper()));
    }

    /**
     * Get set of all inherited attribute names of a given entity type.
     *
     * @param entityType entity type
     * @return set of the names of inherited attributes
     */
    public static Set<String> getInheritedAttributeNames(final EntityType entityType) {
        return entityType.getAllSuperEntityTypes().stream()
                .flatMap(e -> e.getAttributes().stream())
                .map(a -> a.getName())
                .collect(Collectors.toSet());
    }

    /**
     * Get set of all inherited relation names of a given entity type.
     *
     * @param entityType entity type
     * @return set of the names of inherited relations
     */
    public static Set<String> getInheritedRelationNames(final EntityType entityType) {
        return entityType.getAllSuperEntityTypes().stream()
                .flatMap(e -> e.getRelations().stream())
                .map(r -> r.getName())
                .collect(Collectors.toSet());
    }

    /**
     * Get set of all inherited data property names of a given entity type.
     *
     * @param entityType entity type
     * @return set of the names of inherited data properties
     */
    public static Set<String> getInheritedDataPropertyNames(final EntityType entityType) {
        return entityType.getAllSuperEntityTypes().stream()
                .flatMap(e -> e.getDataProperties().stream())
                .map(d -> d.getName())
                .collect(Collectors.toSet());
    }

    /**
     * Get set of all inherited navigation property names of a given entity type.
     *
     * @param entityType entity type
     * @return set of the names of inherited navigation properties
     */
    public static Set<String> getInheritedNavigationPropertyNames(final EntityType entityType) {
        return entityType.getAllSuperEntityTypes().stream()
                .flatMap(e -> e.getNavigationProperties().stream())
                .map(n -> n.getName())
                .collect(Collectors.toSet());
    }

    /**
     * Get set of all inherited entity sequence names of a given entity type.
     *
     * @param entityType entity type
     * @return set of the names of inherited entity sequence
     */
    public static Set<String> getInheritedSequenceNames(final EntityType entityType) {
        return entityType.getAllSuperEntityTypes().stream()
                .flatMap(e -> e.getSequences().stream())
                .map(n -> n.getName())
                .collect(Collectors.toSet());
    }

    /**
     * Get unique list of all inherited bound operation names of a given entity type.
     *
     * @param entityType entity type
     * @return unique list of the names of inherited bound operations
     */
    public static EList<String> getInheritedBoundOperationNames(final EntityType entityType) {
        EList<String> operationNames = new UniqueEList<>();

        Set<String> operationNamesSet = entityType.getAllSuperEntityTypes().stream()
                .flatMap(e -> e.getOperations().stream())
                .map(o -> o.getName())
                .collect(Collectors.toSet());

        operationNames.addAll(operationNamesSet);
        return operationNames;
    }

    /**
     * Get set of all inherited named element names of a given entity type.
     *
     * @param entityType entity type
     * @return set of the names of inherited named elements
     */
    public static Set<String> getInheritedNamedElementNames(final EntityType entityType) {
        return Stream.of(getInheritedAttributeNames(entityType),
                getInheritedRelationNames(entityType),
                getInheritedDataPropertyNames(entityType),
                getInheritedNavigationPropertyNames(entityType),
                getInheritedSequenceNames(entityType),
                getInheritedBoundOperationNames(entityType))
                .flatMap(s -> s.stream())
                .collect(Collectors.toSet());
    }

    /**
     * Get list of all super transfer object types of a given transfer object type. The given transfer object type is included in case of circular references.
     *
     * @param transferObjectType transfer object type
     * @return list of super transfer object types
     */
    public static EList<TransferObjectType> getAllSuperTransferObjectTypes(final TransferObjectType transferObjectType) {
        final EList<TransferObjectType> foundSuperTransferObjectTypes = new UniqueEList<>();
        addSuperTransferObjectTypes(transferObjectType, foundSuperTransferObjectTypes);
        return foundSuperTransferObjectTypes;
    }

    /**
     * Add super transfer object types of a given transfer object type recursively to a list.
     *
     * @param transferObjectType            transfer object type
     * @param foundSuperTransferObjectTypes list that super transfer object types added to
     */
    private static void addSuperTransferObjectTypes(final TransferObjectType transferObjectType, final EList<TransferObjectType> foundSuperTransferObjectTypes) {
        final Set<TransferObjectType> newSuperTransferObjectTypes = transferObjectType.getSuperTransferObjectTypes().stream()
                .filter(s -> !foundSuperTransferObjectTypes.contains(s)).collect(Collectors.toSet());
        foundSuperTransferObjectTypes.addAll(newSuperTransferObjectTypes);
        newSuperTransferObjectTypes.forEach(s -> addSuperTransferObjectTypes(s, foundSuperTransferObjectTypes));
    }

    /**
     * Get unique list of all inherited transfer attribute names of a given mapped transfer object type.
     *
     * @param transferObjectType transfer object type
     * @return unique list of the names of inherited transfer attributes
     */
    public static EList<String> getInheritedTransferAttributeNames(final TransferObjectType transferObjectType) {
        EList<String> attributeNames = new UniqueEList<>();
        attributeNames.addAll(transferObjectType.getAllSuperTransferObjectTypes().stream()
                .flatMap(to -> to.getAttributes().stream())
                .map(a -> a.getName())
                .collect(Collectors.toSet()));
        return attributeNames;
    }

    /**
     * Get unique list of all inherited transfer object relation names of a given mapped transfer object type.
     *
     * @param transferObjectType transfer object type
     * @return unique list of the names of inherited transfer object relations
     */
    public static EList<String> getInheritedTransferObjectRelationNames(final TransferObjectType transferObjectType) {
        EList<String> relationNames = new UniqueEList<>();
        relationNames.addAll(transferObjectType.getAllSuperTransferObjectTypes().stream()
                .flatMap(to -> to.getRelations().stream())
                .map(r -> r.getName())
                .collect(Collectors.toSet()));
        return relationNames;
    }

    /**
     * Get unique list of all (inherited and not inherited) transfer object relations of a given transfer object type.
     *
     * @param transferObjectType transfer object type
     * @return unique list of inherited and not inherited transfer object relations
     */
    public static EList<TransferObjectRelation> getAllTransferObjectRelations(final TransferObjectType transferObjectType) {
        EList<TransferObjectRelation> relations = new UniqueEList<>();
        relations.addAll(transferObjectType.getRelations());
        relations.addAll(transferObjectType.getAllSuperTransferObjectTypes().stream()
                .flatMap(to -> to.getRelations().stream())
                .collect(Collectors.toSet()));
        return relations;
    }

    /**
     * Get unique list of all inherited transfer operation names of a given transfer object type.
     *
     * @param transferObjectType transfer object type
     * @return unique list of the names of inherited transfer operations
     */
    public static EList<String> getInheritedTransferOperationNames(final TransferObjectType transferObjectType) {
        EList<String> operationNames = new UniqueEList<>();

        Set<String> operationNamesSet = transferObjectType.getAllSuperTransferObjectTypes().stream()
                .flatMap(e -> e.getOperations().stream())
                .map(o -> o.getName())
                .collect(Collectors.toSet());

        operationNames.addAll(operationNamesSet);
        return operationNames;
    }

    /**
     * Get unique list of all inherited bound transfer operation names of a given transfer object type.
     *
     * @param transferObjectType transfer object type
     * @return unique list of the names of inherited bound transfer operations
     */
    public static EList<String> getInheritedBoundTransferOperationNames(final MappedTransferObjectType mappedTransferObjectType) {
        EList<String> operationNames = new UniqueEList<>();

        Set<String> operationNamesSet = mappedTransferObjectType.getAllSuperTransferObjectTypes().stream()
                .flatMap(e -> e.getOperations().stream())
                .filter(o -> o instanceof BoundTransferOperation)
                .map(o -> o.getName())
                .collect(Collectors.toSet());

        operationNames.addAll(operationNamesSet);
        return operationNames;
    }

    /**
     * Get unique list of all inherited unbound operation names of a given transfer object type.
     *
     * @param transferObjectType transfer object type
     * @return unique list of the names of inherited unbound operations
     */
    public static EList<String> getInheritedUnboundOperationNames(final TransferObjectType transferObjectType) {
        EList<String> operationNames = new UniqueEList<>();

        Set<String> operationNamesSet = transferObjectType.getAllSuperTransferObjectTypes().stream()
                .flatMap(e -> e.getOperations().stream())
                .filter(o -> o instanceof UnboundOperation)
                .map(o -> o.getName())
                .collect(Collectors.toSet());

        operationNames.addAll(operationNamesSet);
        return operationNames;
    }

    /**
     * Get unique list of all inherited bound transfer operations of a given transfer object type.
     *
     * @param transferObjectType transfer object type
     * @return unique list of the inherited bound transfer operations
     */
    public static EList<BoundTransferOperation> getInheritedBoundTransferOperations(final MappedTransferObjectType mappedTransferObjectType) {
        EList<BoundTransferOperation> operations = new UniqueEList<>();

        Set<BoundTransferOperation> operationNamesSet = mappedTransferObjectType.getAllSuperTransferObjectTypes().stream()
                .flatMap(e -> e.getOperations().stream())
                .filter(o -> o instanceof BoundTransferOperation)
                .map(o -> (BoundTransferOperation) o)
                .collect(Collectors.toSet());

        operations.addAll(operationNamesSet);
        return operations;
    }

    /**
     * Get unique list of all inherited unbound operations of a given transfer object type.
     *
     * @param transferObjectType transfer object type
     * @return unique list of the inherited unbound operations
     */
    public static EList<UnboundOperation> getInheritedUnboundOperations(final TransferObjectType transferObjectType) {
        EList<UnboundOperation> operations = new UniqueEList<>();

        Set<UnboundOperation> operationNamesSet = transferObjectType.getAllSuperTransferObjectTypes().stream()
                .flatMap(e -> e.getOperations().stream())
                .filter(o -> o instanceof UnboundOperation)
                .map(o -> (UnboundOperation) o)
                .collect(Collectors.toSet());

        operations.addAll(operationNamesSet);
        return operations;
    }

    /**
     * Get unique list of all inherited operation names of a given entity type.
     *
     * @param entityType entity type
     * @return unique list of the names of inherited operations
     */
    public static EList<String> getInheritedOperationNames(final EntityType entityType) {
        EList<String> operationNames = new UniqueEList<>();

        Set<String> operationNamesSet = entityType.getAllSuperEntityTypes().stream()
                .flatMap(e -> e.getOperations().stream())
                .map(o -> o.getName())
                .collect(Collectors.toSet());

        operationNames.addAll(operationNamesSet);
        return operationNames;
    }

    /**
     * Get unique list of all operation names (inherited and not inherited) of a given entity type.
     *
     * @param entityType entity type
     * @return unique list of the names of all operations
     */
    public static EList<String> getAllOperationNames(final EntityType entityType) {
        EList<String> operationNames = new UniqueEList<>();

        Set<String> operationNamesSet = entityType.getOperations().stream()
                .map(o -> o.getName())
                .collect(Collectors.toSet());

        operationNamesSet.addAll(getInheritedOperationNames(entityType));
        operationNames.addAll(operationNamesSet);
        return operationNames;
    }

    public static Optional<OperationBody> getOperationImplementationByName(final EntityType entityType, final String name) {
        final Optional<BoundOperation> boundOperation = entityType.getOperations().stream().filter(o -> o.getName().equalsIgnoreCase(name))
                .findAny();

        if (boundOperation.isPresent()) {
            return boundOperation.get().isAbstract() ? Optional.empty() : Optional.ofNullable(boundOperation.get().getImplementation());
        } else {
            return Optional.ofNullable(getInheritedOperationImplementationByName(entityType, name));
        }
    }

    /**
     * Get list of all implementations of a given inherited operation.
     *
     * @param entityType entity type
     * @param name       operation name
     * @return list of the implementations of a given inherited operation
     */
    public static EList<OperationBody> getInheritedOperationImplementationsByName(final EntityType entityType, final String name) {
        EList<OperationBody> implementations = new UniqueEList<>();

        entityType.getSuperEntityTypes().stream()
                .forEach(s -> {
                    final Optional<BoundOperation> boundOperation = s.getOperations().stream()
                            .filter(o -> o.getName().equalsIgnoreCase(name)).findAny();
                    if (boundOperation.isPresent()) {
                        if (!boundOperation.get().isAbstract()) {
                            implementations.add(boundOperation.get().getImplementation());
                        }
                    } else {
                        implementations.addAll(getInheritedOperationImplementationsByName(s, name));
                    }
                });
        return implementations;
    }

    /**
     * Get the implementation of a given inherited operation.
     *
     * @param entityType entity type
     * @param name       operation name
     * @return OperationBody implementation of a given inherited operation
     */
    public static OperationBody getInheritedOperationImplementationByName(final EntityType entityType, final String name) {
        EList<OperationBody> implementations = getInheritedOperationImplementationsByName(entityType, name);
        if (implementations.size() > 1) {
            throw new IllegalStateException("Multiple implementation found and not overriden by transfer object type");
        } else if (implementations.isEmpty()) {
            return null;
        } else {
            return implementations.get(0);
        }
    }

    /**
     * Get measure of a given unit.
     *
     * @param unit unit
     * @return measure of the unit
     */
    public static Optional<Measure> getMeasure(final Unit unit) {
        return getAllContents(unit, Measure.class)
                .filter(m -> m.getUnits().contains(unit))
                .findAny();
    }

    /**
     * Get rate of duration unit to duration type.
     * <p>
     * Dividend and divisor returned separately so some problem related to rounding is eliminated. In example: second = 1 / 3600 hour.
     *
     * @param durationUnit duration unit
     * @param durationType duration type
     * @return rate of duration unit to duration type
     */
    public static Optional<Rate> getRate(final DurationUnit durationUnit, final DurationType durationType) {
        return getAllContents(durationUnit, DurationUnit.class)
                .filter(u -> u.getUnitType() == durationType)
                .map(u -> new Rate(durationUnit.getRateDividend() * u.getRateDivisor(), u.getRateDividend() * durationUnit.getRateDivisor()))
                .findAny();
    }

    /**
     * Get all term measures of a given derived measure. Both base and derived measures are returned that used as terms collected recursively.
     *
     * @param derivedMeasure derived measure
     * @return terms that define derived measure
     */
    public static EList<Measure> getAllTermMeasures(final DerivedMeasure derivedMeasure) {
        final EList<Measure> termMeasures = new UniqueEList<>();
        addTermMeasures(derivedMeasure, termMeasures);
        return termMeasures;
    }

    /**
     * Check if a mapped transfer object type is abstract.
     * <p>
     * A mapped transfer object type is abstract if and only if the referenced entity type is abstract.
     *
     * @param mappedTransferObjectType mapped transfer object type
     * @return <code>true</code> if mapped transfer object type is abstract, <code>false</code> otherwise
     */
    public static boolean isAbstractMappedTransferObjectType(final MappedTransferObjectType mappedTransferObjectType) {
        return mappedTransferObjectType.getEntityType().isAbstract();
    }

    /**
     * Check if a mapped transfer object type is instantiable.
     * <p>
     * A mapped transfer object type is not instantiable if the referenced entity type has (own or inherited) bound operation without operation body
     * or the referenced entity type is abstract.
     *
     * @param mappedTransferObjectType mapped transfer object type
     * @return <code>true</code> if mapped transfer object type is instantiable, <code>false</code> otherwise
     */
    public static boolean isInstantiableMappedTransferObjectType(final MappedTransferObjectType mappedTransferObjectType) {
        if (mappedTransferObjectType.getEntityType().isAbstract()) return false;

        final EntityType entityType = mappedTransferObjectType.getEntityType();

        return getAllOperationNames(entityType).stream().allMatch(
                name -> entityType.getOperations().stream()
                        .anyMatch(o -> o.getName().equalsIgnoreCase(name) && !o.isAbstract())
                        || getInheritedOperationImplementationsByName(entityType, name).size() == 1);
    }

    public static boolean isRegex(final String regex) throws PatternSyntaxException {
        try {
            Pattern.compile(regex);
            return true;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }

    /**
     * Get all possible mapped transfer object types embedding given mapped transfer object types
     *
     * @param mappedTransferObjectType
     * @return all mapped transfer object type embedding given mapped transfer object type
     */
    public EList<MappedTransferObjectType> getAllContainingMappedTransferObjects(MappedTransferObjectType mappedTransferObjectType) {
        EList<MappedTransferObjectType> sourceList = new UniqueEList<>();
        sourceList.add(mappedTransferObjectType);
        return getAllContainingMappedTransferObjectsRecursively(mappedTransferObjectType.eResource().getResourceSet(), sourceList, sourceList);
    }

    /**
     * Get all possible mapped transfer object types embedding at least one in listed of mapped transfer object types
     *
     * @param resourceSet
     * @param topLevelContainers last list of unique mapped transfer object being embedded by mapped transfer object types
     * @param allContainers      list of all unique mapped transfer object types being embedded by mapped transfer objects
     * @return list of unique mapped transfer object types being targeted by transfer object relations in mapped transfer objects
     */
    public EList<MappedTransferObjectType> getAllContainingMappedTransferObjectsRecursively(ResourceSet resourceSet, EList<MappedTransferObjectType> topLevelContainers, EList<MappedTransferObjectType> allContainers) {
        EList<MappedTransferObjectType> newContainers = new UniqueEList<>(all(resourceSet, TransferObjectRelation.class)
                .filter(relation -> relation.isEmbedded() && (relation.eContainer() instanceof MappedTransferObjectType) && (relation.getTarget() instanceof MappedTransferObjectType) && topLevelContainers.contains(relation.getTarget()))
                .map(relation -> (MappedTransferObjectType) relation.eContainer())
                .filter(mto -> !allContainers.contains(mto))
                .collect(Collectors.toList()));

        if (newContainers.isEmpty()) {
            return allContainers;
        }
        EList<MappedTransferObjectType> newAllContainers = allContainers;
        newAllContainers.addAll(newContainers);

        return getAllContainingMappedTransferObjectsRecursively(resourceSet, newContainers, newAllContainers);

    }

    /**
     * Get all mapped transfer object types that are type of input parameter in operations
     *
     * @param resourceSet
     * @return list of unique mapped transfer object types
     */
    public EList<TransferObjectType> getTransferObjectTypesToExtendWithEmbeddedRelations(ResourceSet resourceSet) {
        return new UniqueEList<>(all(resourceSet, TransferOperation.class)
                .filter(transferOperation -> transferOperation.getInput() != null && transferOperation.getBehaviour() != null && behaviourTypesToExtend.contains(transferOperation.getBehaviour().getBehaviourType()))
                .map(transferOperation -> transferOperation.getInput().getType())
                .filter(transferObject -> transferObject instanceof MappedTransferObjectType)
                .collect(Collectors.toList()));
    }

    /**
     * Check if given parameter's type should be extended.
     *
     * @param parameter
     * @return
     */
    public boolean isParameterTypeExtended(Parameter parameter) {
        if (parameter.getType() instanceof MappedTransferObjectType) {
            if (parameter.eContainer() instanceof TransferOperation) {
                TransferOperationBehaviour containingOperationBehaviour = ((TransferOperation) parameter.eContainer()).getBehaviour();
                if (containingOperationBehaviour != null) {
                    return behaviourTypesToExtend.contains(containingOperationBehaviour.getBehaviourType());
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Get all possible containers of a given (embedded) mapped transfer object type.
     *
     * @param mappedTransferObjectType
     * @return
     */
    public EList<MappedTransferObjectType> getAllContainers(final MappedTransferObjectType mappedTransferObjectType) {
        return getAllContainers(new UniqueEList<>(), mappedTransferObjectType);
    }

    private EList<MappedTransferObjectType> getAllContainers(final EList<MappedTransferObjectType> result, final MappedTransferObjectType mappedTransferObjectType) {
        final List<MappedTransferObjectType> newContainers = getAllContents(mappedTransferObjectType, TransferObjectRelation.class)
                .filter(r -> EcoreUtil.equals(mappedTransferObjectType, r.eContainer()) && (r.getTarget() instanceof MappedTransferObjectType))
                .map(r -> (MappedTransferObjectType) r.getTarget())
                .filter(t -> !result.contains(t))
                .collect(Collectors.toList());

        result.addAll(newContainers);
        newContainers.forEach(i -> getAllContainers(result, i));

        return result;
    }

    /**
     * Get stream of source iterator.
     *
     * @param sourceIterator source iterator
     * @param parallel       flag controlling returned stream (serial or parallel)
     * @param <T>            type of source iterator
     * @return return serial (parallel = <code>false</code>) or parallel (parallel = <code>true</code>) stream
     */
    static <T> Stream<T> asStream(Iterator<T> sourceIterator, boolean parallel) {
        Iterable<T> iterable = () -> sourceIterator;
        return StreamSupport.stream(iterable.spliterator(), parallel);
    }

    /**
     * Get all model elements.
     *
     * @param <T> generic type of model elements
     * @return model elements
     */
    <T> Stream<T> all(final ResourceSet resourceSet) {
        return asStream((Iterator<T>) resourceSet.getAllContents(), false);
    }

    /**
     * Get model elements with specific type
     *
     * @param clazz class of model element types
     * @param <T>   specific type
     * @return all elements with clazz type
     */
    public <T> Stream<T> all(final ResourceSet resourceSet, final Class<T> clazz) {
        return all(resourceSet).filter(e -> clazz.isAssignableFrom(e.getClass())).map(e -> (T) e);
    }

    /**
     * Get all contents with a type from resource set of a given EObject.
     *
     * @param eObject EObject in the resource set
     * @param clazz   type class for filtering
     * @param <T>     type for filtering
     * @return stream of contents
     */
    public static <T> Stream<T> getAllContents(final EObject eObject, final Class<T> clazz) {
        if (eObject.eResource() == null) {
            throw new IllegalStateException("No object added to resource - " + eObject.eClass().toString());
        }
        final ResourceSet resourceSet = eObject.eResource().getResourceSet();
        if (resourceSet == null) {
            throw new IllegalStateException("No resource in resourceset");
        }
        final Iterable<Notifier> psmContents = resourceSet::getAllContents;
        return StreamSupport.stream(psmContents.spliterator(), true)
                .filter(e -> clazz.isAssignableFrom(e.getClass())).map(e -> (T) e);
    }

    /**
     * Add term measures of a given derived measure recursively to a list.
     *
     * @param derivedMeasure derived measure
     * @param terms          list that term measures added to
     */
    private static void addTermMeasures(final DerivedMeasure derivedMeasure, final EList<Measure> terms) {
        terms.addAll(derivedMeasure.getTerms().stream()
                .map(term -> term.getUnit().getMeasure())
                .filter(m -> !(m instanceof DerivedMeasure))
                .collect(Collectors.toSet()));

        final Set<DerivedMeasure> newDerivedTerms = derivedMeasure.getTerms().stream()
                .map(term -> term.getUnit().getMeasure())
                .filter(m -> !terms.contains(m))
                .filter(m -> m instanceof DerivedMeasure)
                .map(m -> (DerivedMeasure) m)
                .collect(Collectors.toSet());
        terms.addAll(newDerivedTerms);
        newDerivedTerms.forEach(s -> addTermMeasures(s, terms));
    }

    /**
     * Rate of two doubles. Used to check consistency of duration units.
     */
    public static class Rate {

        private final double dividend;
        private final double divisor;

        public Rate(final double dividend, final double divisor) {
            this.dividend = dividend;
            this.divisor = divisor;
        }

        public double getDividend() {
            return dividend;
        }

        public double getDivisor() {
            return divisor;
        }

        @Override
        public String toString() {
            return dividend + "/" + divisor;
        }
    }
}
