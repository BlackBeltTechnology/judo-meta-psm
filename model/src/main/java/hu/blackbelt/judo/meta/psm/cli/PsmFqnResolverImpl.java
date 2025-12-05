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
import hu.blackbelt.judo.meta.psm.data.BoundOperation;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.data.OperationBody;
import hu.blackbelt.judo.meta.psm.data.Relation;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.MeasureDefinitionTerm;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.NamespaceElement;
import hu.blackbelt.judo.meta.psm.service.BoundTransferOperation;
import hu.blackbelt.judo.meta.psm.service.OperationDeclaration;
import hu.blackbelt.judo.meta.psm.service.Parameter;
import hu.blackbelt.judo.meta.psm.service.TransferAttribute;
import hu.blackbelt.judo.meta.psm.service.TransferObjectRelation;
import hu.blackbelt.judo.meta.psm.service.TransferObjectType;
import hu.blackbelt.judo.meta.psm.service.TransferOperation;
import hu.blackbelt.judo.meta.psm.service.TransferOperationBehaviour;
import hu.blackbelt.judo.meta.psm.service.UnboundOperation;
import hu.blackbelt.judo.meta.psm.type.Cardinality;

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
            if (next instanceof EObject) {
                EObject current = (EObject) next;
                computeFqn(current).ifPresent(fqn -> cache.put(fqn, current));
            }
        }
    }

    private Optional<String> computeFqn(EObject eObject) {
        // Model - root element
        if (eObject instanceof Model) {
            Model model = (Model) eObject;
            return Optional.ofNullable(model.getName());
        }

        // NamespaceElement (Package, EntityType, TransferObjectType, EnumerationType, etc.)
        if (eObject instanceof NamespaceElement) {
            NamespaceElement namespaceElement = (NamespaceElement) eObject;
            return Optional.ofNullable(PsmUtils.namespaceElementToString(namespaceElement));
        }

        // Attribute (on EntityType)
        if (eObject instanceof Attribute) {
            Attribute attribute = (Attribute) eObject;
            return Optional.ofNullable(PsmUtils.attributeToString(attribute));
        }

        // Relation (on EntityType)
        if (eObject instanceof Relation) {
            Relation relation = (Relation) eObject;
            return Optional.ofNullable(PsmUtils.relationToString(relation));
        }

        // DataProperty (derived attribute on EntityType)
        if (eObject instanceof DataProperty) {
            DataProperty dataProperty = (DataProperty) eObject;
            EntityType entityType = (EntityType) dataProperty.eContainer();
            if (entityType != null) {
                return Optional.of(PsmUtils.namespaceElementToString(entityType) +
                        PsmUtils.FEATURE_SEPARATOR + dataProperty.getName());
            }
        }

        // NavigationProperty (derived relation on EntityType)
        if (eObject instanceof NavigationProperty) {
            NavigationProperty navigationProperty = (NavigationProperty) eObject;
            EntityType entityType = (EntityType) navigationProperty.eContainer();
            if (entityType != null) {
                return Optional.of(PsmUtils.namespaceElementToString(entityType) +
                        PsmUtils.FEATURE_SEPARATOR + navigationProperty.getName());
            }
        }

        // TransferAttribute (on TransferObjectType)
        if (eObject instanceof TransferAttribute) {
            TransferAttribute transferAttribute = (TransferAttribute) eObject;
            TransferObjectType transferObjectType = (TransferObjectType) transferAttribute.eContainer();
            if (transferObjectType != null) {
                return Optional.of(PsmUtils.namespaceElementToString(transferObjectType) +
                        PsmUtils.FEATURE_SEPARATOR + transferAttribute.getName());
            }
        }

        // TransferObjectRelation (on TransferObjectType)
        if (eObject instanceof TransferObjectRelation) {
            TransferObjectRelation transferObjectRelation = (TransferObjectRelation) eObject;
            TransferObjectType transferObjectType = (TransferObjectType) transferObjectRelation.eContainer();
            if (transferObjectType != null) {
                return Optional.of(PsmUtils.namespaceElementToString(transferObjectType) +
                        PsmUtils.FEATURE_SEPARATOR + transferObjectRelation.getName());
            }
        }

        // BoundOperation (on EntityType or TransferObjectType)
        if (eObject instanceof BoundOperation) {
            BoundOperation boundOperation = (BoundOperation) eObject;
            EObject container = boundOperation.eContainer();
            if (container instanceof EntityType) {
                EntityType entityType = (EntityType) container;
                return Optional.of(PsmUtils.namespaceElementToString(entityType) +
                        PsmUtils.FEATURE_SEPARATOR + boundOperation.getName());
            }
            if (container instanceof TransferObjectType) {
                TransferObjectType transferObjectType = (TransferObjectType) container;
                return Optional.of(PsmUtils.namespaceElementToString(transferObjectType) +
                        PsmUtils.FEATURE_SEPARATOR + boundOperation.getName());
            }
        }

        // UnboundOperation (on TransferObjectType)
        if (eObject instanceof UnboundOperation) {
            UnboundOperation unboundOperation = (UnboundOperation) eObject;
            TransferObjectType transferObjectType = (TransferObjectType) unboundOperation.eContainer();
            if (transferObjectType != null) {
                return Optional.of(PsmUtils.namespaceElementToString(transferObjectType) +
                        PsmUtils.FEATURE_SEPARATOR + unboundOperation.getName());
            }
        }

        // Unit (on Measure)
        if (eObject instanceof Unit) {
            Unit unit = (Unit) eObject;
            Measure measure = unit.getMeasure();
            if (measure != null) {
                return Optional.of(PsmUtils.namespaceElementToString(measure) +
                        PsmUtils.FEATURE_SEPARATOR + unit.getName());
            }
        }

        // Parameter (on OperationDeclaration - input/output/faults)
        if (eObject instanceof Parameter) {
            Parameter parameter = (Parameter) eObject;
            EObject container = parameter.eContainer();
            // Container is the operation that contains the parameter
            if (container instanceof OperationDeclaration) {
                Optional<String> operationFqn = computeFqn(container);
                if (operationFqn.isPresent()) {
                    String paramName = parameter.getName();
                    if (paramName != null && !paramName.isEmpty()) {
                        return Optional.of(operationFqn.get() + "/" + paramName);
                    }
                }
            }
        }

        // BoundTransferOperation (on TransferObjectType) - extends TransferOperation which is NamedElement
        if (eObject instanceof BoundTransferOperation) {
            BoundTransferOperation boundTransferOp = (BoundTransferOperation) eObject;
            EObject container = boundTransferOp.eContainer();
            if (container instanceof TransferObjectType) {
                TransferObjectType transferObjectType = (TransferObjectType) container;
                return Optional.of(PsmUtils.namespaceElementToString(transferObjectType) +
                        PsmUtils.FEATURE_SEPARATOR + boundTransferOp.getName());
            }
        }

        // Cardinality (on Parameter, Attribute, etc.)
        if (eObject instanceof Cardinality) {
            EObject container = eObject.eContainer();
            if (container != null) {
                Optional<String> containerFqn = computeFqn(container);
                if (containerFqn.isPresent()) {
                    return Optional.of(containerFqn.get() + "/Cardinality");
                }
            }
        }

        // TransferOperationBehaviour (on TransferOperation)
        if (eObject instanceof TransferOperationBehaviour) {
            EObject container = eObject.eContainer();
            if (container instanceof TransferOperation) {
                Optional<String> opFqn = computeFqn(container);
                if (opFqn.isPresent()) {
                    return Optional.of(opFqn.get() + "/Behaviour");
                }
            }
        }

        // OperationBody (on BoundOperation)
        if (eObject instanceof OperationBody) {
            EObject container = eObject.eContainer();
            if (container instanceof BoundOperation) {
                BoundOperation boundOp = (BoundOperation) container;
                EObject opContainer = boundOp.eContainer();
                if (opContainer instanceof EntityType) {
                    EntityType entityType = (EntityType) opContainer;
                    return Optional.of(PsmUtils.namespaceElementToString(entityType) +
                            PsmUtils.FEATURE_SEPARATOR + boundOp.getName() + "/Body");
                }
                if (opContainer instanceof TransferObjectType) {
                    TransferObjectType transferObjectType = (TransferObjectType) opContainer;
                    return Optional.of(PsmUtils.namespaceElementToString(transferObjectType) +
                            PsmUtils.FEATURE_SEPARATOR + boundOp.getName() + "/Body");
                }
            }
        }

        // MeasureDefinitionTerm (on DerivedMeasure)
        if (eObject instanceof MeasureDefinitionTerm) {
            MeasureDefinitionTerm term = (MeasureDefinitionTerm) eObject;
            EObject container = term.eContainer();
            if (container instanceof DerivedMeasure) {
                DerivedMeasure derivedMeasure = (DerivedMeasure) container;
                Unit unit = term.getUnit();
                if (unit != null && unit.getName() != null) {
                    return Optional.of(PsmUtils.namespaceElementToString(derivedMeasure) +
                            "/Term[" + unit.getName() + "^" + term.getExponent() + "]");
                }
            }
        }

        // Fallback: use URI
        return Optional.of(EcoreUtil.getURI(eObject).toString());
    }
}
