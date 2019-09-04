package hu.blackbelt.judo.meta.psm;

import hu.blackbelt.judo.meta.psm.data.*;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.measure.*;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Namespace;
import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.type.StringType;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

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
     *
     * A mapped transfer object type is abstract if and only if the referenced entity type is abstract.
     *
     * @param mappedTransferObjectType mapped transfer object type
     * @return <code>true</code> if mapped transfer object type is abstract, <code>false</code> otherwise
     */
    public static boolean isAbstractMappedTransferObjectType(final MappedTransferObjectType mappedTransferObjectType) {
        return mappedTransferObjectType.isAbstract();
    }

    /**
     * Check if a mapped transfer object type is instantiable.
     *
     * A mapped transfer object type is not instantiable if it has (its own or inherited) transfer attribute or transfer object relation without binding or it has (its own or inherited)
     * bound operation without operation body or referenced entity type is abstract.
     *
     * @param mappedTransferObjectType mapped transfer object type
     * @return <code>true</code> if mapped transfer object type is instantiable, <code>false</code> otherwise
     */
    public static boolean isInstantiableMappedTransferObjectType(final MappedTransferObjectType mappedTransferObjectType) {
        // TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public static boolean isRegex(String regex) throws PatternSyntaxException {
        try {
            Pattern.compile(regex);
            return true;
        } catch (PatternSyntaxException e) {
            //fukd
            return false;
        }
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
        final ResourceSet resourceSet = eObject.eResource().getResourceSet();
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
