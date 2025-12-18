package hu.blackbelt.judo.meta.psm.cli;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;

import hu.blackbelt.judo.cli.api.FqnResolver;
import hu.blackbelt.judo.meta.psm.PsmUtils;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.data.Relation;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;
import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferObjectType;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;

/**
 * PSM FQN resolver implementation.
 * <p>
 * Implements {@link FqnResolver} from model-cli-api for type-safe FQN resolution.
 */
public class PsmFqnResolverImpl implements FqnResolver {

    private final Map<String, EObject> cache = new ConcurrentHashMap<>();
    private ResourceSet resourceSet;

    @Override
    public synchronized void bind(ResourceSet resourceSet) {
        this.resourceSet = resourceSet;
        rebuildCache();
    }

    @Override
    public synchronized void unbind() {
        this.resourceSet = null;
        cache.clear();
    }

    @Override
    public boolean isBound() {
        return resourceSet != null;
    }

    @Override
    public String getModelType() {
        return "psm";
    }

    @Override
    public Optional<EObject> resolve(String fqn) {
        if (fqn == null) {
            return Optional.empty();
        }
        return Optional.ofNullable(cache.get(fqn));
    }

    @Override
    public Stream<String> getFqnCollection() {
        return cache.keySet().stream();
    }

    @Override
    public Optional<String> getFqn(EObject eObject) {
        return computeFqn(eObject);
    }

    @Override
    public Stream<String> findByPattern(String pattern) {
        if (pattern == null || pattern.isEmpty()) {
            return getFqnCollection();
        }
        return cache.keySet().stream()
                .filter(fqn -> fqn.matches(pattern));
    }

    @Override
    public Optional<EObject> resolveByXmiId(String xmiId) {
        if (xmiId == null || resourceSet == null) {
            return Optional.empty();
        }
        // Iterate through all resources to find element by URI fragment
        return resourceSet.getResources().stream()
                .map(resource -> {
                    try {
                        return resource.getEObject(xmiId);
                    } catch (Exception e) {
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .findFirst();
    }

    private void rebuildCache() {
        cache.clear();
        if (resourceSet == null) {
            return;
        }
        TreeIterator<?> iterator = resourceSet.getAllContents();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            if (next instanceof EObject current) {
                computeFqn(current).ifPresent(fqn -> cache.put(fqn, current));
            }
        }
    }

    private Optional<String> computeFqn(EObject eObject) {
        // Model - root element
        if (eObject instanceof Model model) {
            return Optional.ofNullable(model.getName());
        }

        // NamespaceElement (Package, EntityType, TransferObjectType, EnumerationType, etc.)
        if (eObject instanceof NamespaceElement namespaceElement) {
            return Optional.ofNullable(PsmUtils.namespaceElementToString(namespaceElement));
        }

        // Attribute (on EntityType)
        if (eObject instanceof Attribute attribute) {
            return Optional.ofNullable(PsmUtils.attributeToString(attribute));
        }

        // Relation (on EntityType)
        if (eObject instanceof Relation relation) {
            return Optional.ofNullable(PsmUtils.relationToString(relation));
        }

        // DataProperty (derived attribute on EntityType)
        if (eObject instanceof DataProperty dataProperty) {
            EntityType entityType = (EntityType) dataProperty.eContainer();
            if (entityType != null) {
                return Optional.of(PsmUtils.namespaceElementToString(entityType) + 
                        PsmUtils.FEATURE_SEPARATOR + dataProperty.getName());
            }
        }

        // NavigationProperty (derived relation on EntityType)
        if (eObject instanceof NavigationProperty navigationProperty) {
            EntityType entityType = (EntityType) navigationProperty.eContainer();
            if (entityType != null) {
                return Optional.of(PsmUtils.namespaceElementToString(entityType) + 
                        PsmUtils.FEATURE_SEPARATOR + navigationProperty.getName());
            }
        }

        // TransferAttribute (on TransferObjectType)
        if (eObject instanceof TransferAttribute transferAttribute) {
            TransferObjectType transferObjectType = (TransferObjectType) transferAttribute.eContainer();
            if (transferObjectType != null) {
                return Optional.of(PsmUtils.namespaceElementToString(transferObjectType) + 
                        PsmUtils.FEATURE_SEPARATOR + transferAttribute.getName());
            }
        }

        // TransferObjectRelation (on TransferObjectType)
        if (eObject instanceof TransferObjectRelation transferObjectRelation) {
            TransferObjectType transferObjectType = (TransferObjectType) transferObjectRelation.eContainer();
            if (transferObjectType != null) {
                return Optional.of(PsmUtils.namespaceElementToString(transferObjectType) + 
                        PsmUtils.FEATURE_SEPARATOR + transferObjectRelation.getName());
            }
        }

        // BoundOperation (on EntityType or TransferObjectType)
        if (eObject instanceof BoundOperation boundOperation) {
            EObject container = boundOperation.eContainer();
            if (container instanceof EntityType entityType) {
                return Optional.of(PsmUtils.namespaceElementToString(entityType) + 
                        PsmUtils.FEATURE_SEPARATOR + boundOperation.getName());
            }
            if (container instanceof TransferObjectType transferObjectType) {
                return Optional.of(PsmUtils.namespaceElementToString(transferObjectType) + 
                        PsmUtils.FEATURE_SEPARATOR + boundOperation.getName());
            }
        }

        // UnboundOperation (on TransferObjectType)
        if (eObject instanceof UnboundOperation unboundOperation) {
            TransferObjectType transferObjectType = (TransferObjectType) unboundOperation.eContainer();
            if (transferObjectType != null) {
                return Optional.of(PsmUtils.namespaceElementToString(transferObjectType) + 
                        PsmUtils.FEATURE_SEPARATOR + unboundOperation.getName());
            }
        }

        // Unit (on Measure)
        if (eObject instanceof Unit unit) {
            Measure measure = unit.getMeasure();
            if (measure != null) {
                return Optional.of(PsmUtils.namespaceElementToString(measure) + 
                        PsmUtils.FEATURE_SEPARATOR + unit.getName());
            }
        }

        // Fallback: use URI
        return Optional.of(EcoreUtil.getURI(eObject).toString());
    }
}
