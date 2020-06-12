package hu.blackbelt.judo.meta.psm;

import hu.blackbelt.judo.meta.psm.accesspoint.ActorType;
import hu.blackbelt.judo.meta.psm.data.*;
import hu.blackbelt.judo.meta.psm.data.util.builder.BoundOperationBuilder;
import hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders;
import hu.blackbelt.judo.meta.psm.data.util.builder.EntityTypeBuilder;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.ExpressionDialect;
import hu.blackbelt.judo.meta.psm.measure.DurationType;
import hu.blackbelt.judo.meta.psm.measure.DurationUnit;
import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.MeasuredType;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders;
import hu.blackbelt.judo.meta.psm.namespace.util.builder.PackageBuilder;
import hu.blackbelt.judo.meta.psm.service.*;
import hu.blackbelt.judo.meta.psm.service.util.builder.*;
import hu.blackbelt.judo.meta.psm.type.Primitive;
import hu.blackbelt.model.northwind.Entities;
import hu.blackbelt.model.northwind.Measures;
import hu.blackbelt.model.northwind.Services;
import hu.blackbelt.model.northwind.Types;
import hu.blackbelt.model.northwind.measures.Mass;
import hu.blackbelt.model.northwind.types.Date;
import hu.blackbelt.model.northwind.types.Integer;
import hu.blackbelt.model.northwind.types.*;
import hu.blackbelt.model.northwind.types.measured.MassStoredInGrams;
import hu.blackbelt.model.northwind.types.measured.MassStoredInKilograms;

import java.lang.String;
import java.util.*;

import static hu.blackbelt.judo.meta.psm.accesspoint.util.builder.AccesspointBuilders.newActorTypeBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newDataExpressionTypeBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newDataPropertyBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newCardinalityBuilder;

public class PsmTestModelBuilder {

    public static class Cardinality {
        private int min;
        private int max;

        private Cardinality(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public static Cardinality cardinality(int min, int max) {
            return new Cardinality(min, max);
        }

        public hu.blackbelt.judo.meta.psm.type.Cardinality create() {
            return newCardinalityBuilder().withLower(min).withUpper(max).build();
        }
    }

    private final Package defaultToPkg;
    private Model $;
    private Entities entities;
    private Services services;
    private hu.blackbelt.model.northwind.types.String string;
    private hu.blackbelt.model.northwind.types.Integer intType;
    private hu.blackbelt.model.northwind.types.Double doubleType;
    private hu.blackbelt.model.northwind.types.Boolean booleanType;
    private hu.blackbelt.model.northwind.types.Date dateType;
    private hu.blackbelt.model.northwind.types.TimeStamp timeStampType;
    private hu.blackbelt.model.northwind.types.measured.MassStoredInKilograms massStoredInKilograms;
    private hu.blackbelt.model.northwind.types.measured.MassStoredInGrams massStoredInGrams;
    private hu.blackbelt.model.northwind.types.Countries countries;

    private Map<String, Primitive> dataTypes = new HashMap<>();
    private Set<ScriptTestBuilders> scriptTestBuilders = new LinkedHashSet<>();
    private Set<ScriptTestActorTypeBuilder> actorTypeBuilders = new LinkedHashSet<>();

    private Map<String, EntityType> entityTypes = new HashMap<>();
    private Map<String, TransferObjectType> toTypes = new HashMap<>();
    private Map<String, TwoWayTargetDef> twoWayTargetDefs = new HashMap<>();
    private Set<ScriptTestBoundOperationBuilder> boundOperationBuilders = new HashSet<>();
    private Set<ScriptTestUnboundOperationBuilder> unboundOperationBuilders = new HashSet<>();

    private Map<BoundOperation, BoundTransferOperation> boundOperationMapping = new HashMap<>();

    public PsmTestModelBuilder() {
        $ = NamespaceBuilders.newModelBuilder().build();
        NamespaceBuilders.useModel($).withName("demo").build();
        entities = new Entities();
        entities.init($);
        services = new Services();
        services.init($);
        defaultToPkg = NamespaceBuilders.newPackageBuilder().withName("_default_transferobjecttypes").build();
        NamespaceBuilders.useModel($).withPackages(defaultToPkg).build();
        Types types = new Types();
        types.init($);
        intType = new Integer();
        intType.init(types.$);
        string = new hu.blackbelt.model.northwind.types.String();
        string.init(types.$);
        doubleType = new hu.blackbelt.model.northwind.types.Double();
        doubleType.init(types.$);
        booleanType = new hu.blackbelt.model.northwind.types.Boolean();
        booleanType.init(types.$);
        dateType = new Date();
        dateType.init(types.$);
        timeStampType = new TimeStamp();
        timeStampType.init(types.$);
        Measured measured = new Measured();
        measured.init(types.$);
        Measures measures = new Measures();
        measures.init($);
        Mass mass = new Mass();
        mass.init(measures.$);
        massStoredInKilograms = new MassStoredInKilograms();
        massStoredInKilograms.init(measured.$, mass);
        massStoredInGrams = new MassStoredInGrams();
        massStoredInGrams.init(measured.$, mass);
        countries = new Countries();
        countries.init(types.$);
        dataTypes.put("String", string.$);
        dataTypes.put("Integer", intType.$);
        dataTypes.put("Double", doubleType.$);
        dataTypes.put("Boolean", booleanType.$);
        dataTypes.put("Date", dateType.$);
        dataTypes.put("Timestamp", timeStampType.$);
        dataTypes.put("MassStoredInKilograms", massStoredInKilograms.$);
        dataTypes.put("MassStoredInGrams", massStoredInGrams.$);
        dataTypes.put("Country", countries.$);

        DurationUnit durationUnit = newDurationUnitBuilder().withName("day").withUnitType(DurationType.DAY).build();
        Measure dayMeasure = newMeasureBuilder().withName("Day").withSymbol("day").withUnits(durationUnit).build();
        NamespaceBuilders.usePackage(measures.$).withElements(dayMeasure).build();
        MeasuredType durationType = newMeasuredTypeBuilder().withName("Duration").withPrecision(9).withStoreUnit(durationUnit).build();
        NamespaceBuilders.usePackage(measured.$).withElements(durationType).build();
        dataTypes.put("Duration", durationType);

    }

    public ScriptTestMappedTransferObjectBuilder addMappedTransferObject(String toName, String entityName) {
        ScriptTestMappedTransferObjectBuilder builder = new ScriptTestMappedTransferObjectBuilder(toName, entityName);
        scriptTestBuilders.add(builder);
        return builder;
    }

    public Optional<ScriptTestMappedTransferObjectBuilder> getMappedTransferObject(String name) {
        return scriptTestBuilders.stream()
                .filter(e -> e instanceof ScriptTestMappedTransferObjectBuilder && name.equals(((ScriptTestMappedTransferObjectBuilder) e).name))
                .findFirst()
                .map(e -> (ScriptTestMappedTransferObjectBuilder) (e));
    }

    public ScriptTestUnmappedTransferObjectBuilder addUnmappedTransferObject(String toName) {
        ScriptTestUnmappedTransferObjectBuilder builder = new ScriptTestUnmappedTransferObjectBuilder(toName);
        scriptTestBuilders.add(builder);
        return builder;
    }

    public Optional<ScriptTestUnmappedTransferObjectBuilder> getUnmappedTransferObject(String name) {
        return scriptTestBuilders.stream()
                .filter(e -> e instanceof ScriptTestUnmappedTransferObjectBuilder && name.equals(((ScriptTestUnmappedTransferObjectBuilder) e).name))
                .findFirst()
                .map(e -> (ScriptTestUnmappedTransferObjectBuilder) e);
    }

    public ScriptTestActorTypeBuilder addActorType(String name, String toName) {
        ScriptTestActorTypeBuilder builder = new ScriptTestActorTypeBuilder(name, toName);
        actorTypeBuilders.add(builder);
        return builder;
    }

    public ScriptTestEntityBuilder addEntity(String name) {
        ScriptTestEntityBuilder entityBuilder = new ScriptTestEntityBuilder(name);
        scriptTestBuilders.add(entityBuilder);
        return entityBuilder;
    }

    public Optional<ScriptTestEntityBuilder> getEntity(String name) {
        return scriptTestBuilders.stream()
                .filter(e -> e instanceof ScriptTestEntityBuilder && name.equals(((ScriptTestEntityBuilder) e).name))
                .findFirst()
                .map(e -> (ScriptTestEntityBuilder) e);
    }

    public Optional<ScriptTestEntityBuilder> getEntityFromTO(String name) {
        final Optional<ScriptTestMappedTransferObjectBuilder> mappedTransferObject = getMappedTransferObject(name);
        if(!mappedTransferObject.isPresent())
            return Optional.empty();
        return getEntity(mappedTransferObject.get().entityName);
    }

    public ScriptTestBoundOperationBuilder addBoundOperation(String type, String name) {
        ScriptTestBoundOperationBuilder builder = new ScriptTestBoundOperationBuilder(type, name);
        boundOperationBuilders.add(builder);
        return builder;
    }

    public Model build() {
        PackageBuilder entityPackageBuilder = NamespaceBuilders.usePackage(entities.$);
        PackageBuilder servicePackageBuilder = NamespaceBuilders.usePackage(services.$);
        PackageBuilder defaultToEntityPackageBuilder = NamespaceBuilders.newPackageBuilder().withName("entities");

        for (ScriptTestBuilders scriptTestBuilder : scriptTestBuilders) {
            if (scriptTestBuilder instanceof ScriptTestEntityBuilder) {
                ScriptTestEntityBuilder entityBuilder = (ScriptTestEntityBuilder) scriptTestBuilder;
                EntityType entityType = entityBuilder.emptyBuild();
                entityPackageBuilder.withElements(entityType);
                MappedTransferObjectType defaultTo = entityBuilder.defaultToBuilder.emptyBuild();
                defaultToEntityPackageBuilder.withElements(defaultTo);
            }
            if (scriptTestBuilder instanceof ScriptTestMappedTransferObjectBuilder) {
                MappedTransferObjectType mappedTransferObjectType = ((ScriptTestMappedTransferObjectBuilder) scriptTestBuilder).emptyBuild();
                servicePackageBuilder.withElements(mappedTransferObjectType);
            }
            if (scriptTestBuilder instanceof ScriptTestUnmappedTransferObjectBuilder) {
                UnmappedTransferObjectType unmappedTransferObjectType = ((ScriptTestUnmappedTransferObjectBuilder) scriptTestBuilder).emptyBuild();
                servicePackageBuilder.withElements(unmappedTransferObjectType);
            }
        }

        for (ScriptTestBuilders scriptTestBuilder : scriptTestBuilders) {
            if (scriptTestBuilder instanceof ScriptTestEntityBuilder) {
                ((ScriptTestEntityBuilder) scriptTestBuilder).build();
                ((ScriptTestEntityBuilder) scriptTestBuilder).defaultToBuilder.build();
            }
            if (scriptTestBuilder instanceof ScriptTestMappedTransferObjectBuilder) {
                ((ScriptTestMappedTransferObjectBuilder) scriptTestBuilder).build();
            }
            if (scriptTestBuilder instanceof ScriptTestUnmappedTransferObjectBuilder) {
                ((ScriptTestUnmappedTransferObjectBuilder) scriptTestBuilder).build();
            }
        }

        for (String entityType : entityTypes.keySet()) {
            if (twoWayTargetDefs.containsKey(entityType)) {
                TwoWayTargetDef twoWayTargetDef = twoWayTargetDefs.get(entityType);
                entityTypes.get(entityType).getRelations().stream().filter(rel -> rel.getName().equals(twoWayTargetDef.reference)).forEach(
                        relation -> {
                            EntityType targetEntity = entityTypes.get(twoWayTargetDef.target);
                            relation.setTarget(targetEntity);
                            AssociationEnd partner = (AssociationEnd) targetEntity.getRelations().stream().filter(rel -> rel.getName().equals(twoWayTargetDef.targetReference))
                                    .findFirst().get();
                            ((AssociationEnd) relation).setPartner(partner);
                            partner.setPartner(((AssociationEnd) relation));
                        }
                );
                TransferObjectType defaultTo = toTypes.get(entityType);
                defaultTo.getRelations().stream().filter(rel -> rel.getName().equals(twoWayTargetDef.reference)).forEach(relation -> {
                    TransferObjectType targetTo = toTypes.get(twoWayTargetDef.target);
                    relation.setTarget(targetTo);
                });
            }
        }

        PackageBuilder defaultToPackageBuilder = NamespaceBuilders.usePackage(defaultToPkg);
        defaultToPackageBuilder.withPackages(defaultToEntityPackageBuilder.build());

        for (ScriptTestUnboundOperationBuilder unboundOperationBuilder : unboundOperationBuilders) {
            UnboundOperation unboundOperation = unboundOperationBuilder.build();
            toTypes.get(unboundOperationBuilder.type).getOperations().add(unboundOperation);
        }

        for (ScriptTestBoundOperationBuilder boundOperationBuilder : boundOperationBuilders) {
            BoundOperation boundOperation = boundOperationBuilder.build();
            EntityType entityType = entityTypes.get(boundOperationBuilder.type);
            entityType.getOperations().add(boundOperation);
            TransferObjectType transferObjectType = toTypes.get(boundOperationBuilder.type);
            transferObjectType.getOperations().add(boundOperationMapping.get(boundOperation));
        }

        for (ScriptTestActorTypeBuilder actorTypeBuilder : actorTypeBuilders) {
            servicePackageBuilder.withElements(actorTypeBuilder.build());
        }

        entityPackageBuilder.build();
        servicePackageBuilder.build();
        defaultToPackageBuilder.build();
        return $;
    }

    public ScriptTestUnboundOperationBuilder addUnboundOperation(String type, String operationName) {
        ScriptTestUnboundOperationBuilder builder = new ScriptTestUnboundOperationBuilder(type, operationName);
        unboundOperationBuilders.add(builder);
        return builder;
    }

    public ScriptTestUnboundOperationBuilder addUnboundOperation(String operationName) {
        String type = "UnboundServices";
        if (!toTypes.containsKey(type)) {
            toTypes.put("UnboundServices", null);
            addUnmappedTransferObject(type);
        }
        ScriptTestUnboundOperationBuilder builder = new ScriptTestUnboundOperationBuilder(type, operationName);
        unboundOperationBuilders.add(builder);
        return builder;
    }

    @Deprecated
    public ScriptTestOperationBuilder addUnboundOperation(String operationName, String operationBody, String returnType, Cardinality cardinality) {
        return addUnboundOperation(operationName).withBody(operationBody).withOutput(returnType, cardinality);
    }

    @Deprecated
    public ScriptTestOperationBuilder addUnboundOperation(String operationName, String operationBody, String returnType) {
        return addUnboundOperation(operationName).withBody(operationBody).withOutput(returnType, Cardinality.cardinality(1, 1));
    }

    public void setTwoWayRelation(String entity, String reference, String target, String targetReference) {
        twoWayTargetDefs.put(entity, new TwoWayTargetDef(entity, reference, target, targetReference));
    }

    private static class OperationDef {
        String name;
        String body;
        String returnType;
        Cardinality cardinality;
        String boundType;

        public OperationDef(String name, String body, String returnType, Cardinality cardinality, String boundType) {
            this.name = name;
            this.body = body;
            this.returnType = returnType;
            this.cardinality = cardinality;
            this.boundType = boundType;
        }
    }

    private static class PropertyDef {
        String name;
        String type;
        String expression;

        public PropertyDef(String name, String type, String expression) {
            this.name = name;
            this.type = type;
            this.expression = expression;
        }
    }

    private static class TwoWayTargetDef {
        String entity;
        String reference;
        String target;
        String targetReference;

        public TwoWayTargetDef(String entity, String reference, String target, String targetReference) {
            this.entity = entity;
            this.reference = reference;
            this.target = target;
            this.targetReference = targetReference;
        }
    }

    private static class RelationDef {
        String name;
        String type;
        Cardinality cardinality;
        boolean aggregation;

        public RelationDef(String name, String type, Cardinality cardinality) {
            this(name, type, cardinality, false);
        }

        public RelationDef(String name, String type, Cardinality cardinality, boolean aggregation) {
            this.name = name;
            this.type = type;
            this.cardinality = cardinality;
            this.aggregation = aggregation;
        }
    }

    public interface ScriptTestBuilders {
    }

    public class ScriptTestUnmappedTransferObjectBuilder implements ScriptTestBuilders {
        private String name;
        private Map<String, String> attributes = new HashMap<>();
        private Map<String, RelationDef> relations = new HashMap<>();
        private Map<String, RelationDef> containments = new HashMap<>();

        private ScriptTestUnmappedTransferObjectBuilder(String name) {
            this.name = name;
        }

        public ScriptTestUnmappedTransferObjectBuilder withAttribute(String type, String name) {
            attributes.put(name, type);
            return this;
        }

        public ScriptTestUnmappedTransferObjectBuilder withRelation(String target, String name, Cardinality cardinality) {
            relations.put(name, new RelationDef(name, target, cardinality));
            return this;
        }

        public ScriptTestUnmappedTransferObjectBuilder withContainment(String target, String name, Cardinality cardinality) {
            containments.put(name, new RelationDef(name, target, cardinality));
            return this;
        }

        private UnmappedTransferObjectType emptyBuild() {
            final UnmappedTransferObjectTypeBuilder builder = newUnmappedTransferObjectTypeBuilder().withName(name);
            final UnmappedTransferObjectType build = builder.build();
            toTypes.put(name, build);
            return build;
        }

        private UnmappedTransferObjectType build() {
            UnmappedTransferObjectTypeBuilder builder = useUnmappedTransferObjectType((UnmappedTransferObjectType) toTypes.get(name));
            for (Map.Entry<String, String> attributeEntry : attributes.entrySet()) {
                TransferAttribute transferAttribute = ServiceBuilders.useTransferAttribute(ServiceBuilders.newTransferAttributeBuilder().build())
                        .withName(attributeEntry.getKey())
                        .withDataType(dataTypes.get(attributeEntry.getValue()))
                        .withRequired(false).build();
                builder.withAttributes(transferAttribute);
            }
            for (Map.Entry<String, RelationDef> relationEntry : relations.entrySet()) {
                TransferObjectType target = toTypes.get(relationEntry.getValue().type);
                TransferObjectRelation relation = ServiceBuilders.newTransferObjectRelationBuilder()
                        .withName(relationEntry.getKey())
                        .withCardinality(relationEntry.getValue().cardinality.create())
                        .withEmbedded(relationEntry.getValue().aggregation)
                        .withTarget(target).build();
                builder.withRelations(relation);
            }
            for (Map.Entry<String, RelationDef> relationEntry : containments.entrySet()) {
                TransferObjectRelation relation = ServiceBuilders.newTransferObjectRelationBuilder()
                        .withName(relationEntry.getKey())
                        .withEmbedded(true)
                        .withCardinality(relationEntry.getValue().cardinality.create())
                        .withTarget(toTypes.get(relationEntry.getValue().type)).build();
                builder.withRelations(relation);
            }
            return builder.build();
        }
    }

    public class ScriptTestMappedTransferObjectBuilder implements ScriptTestBuilders {
        private String name;
        private String entityName;
        private Map<String, String> attributes = new HashMap<>();
        private Map<String, RelationDef> relations = new HashMap<>();
        private Map<String, RelationDef> containments = new HashMap<>();
        private Map<String, String> properties = new HashMap<>();


        private ScriptTestMappedTransferObjectBuilder(String name, String entityName) {
            this.name = name;
            this.entityName = entityName;
        }

        public ScriptTestMappedTransferObjectBuilder withAttribute(String type, String name) {
            attributes.put(name, type);
            return this;
        }

        public ScriptTestMappedTransferObjectBuilder withProperty(String type, String name) {
            properties.put(name, type);
            return this;
        }

        public ScriptTestMappedTransferObjectBuilder withRelation(String target, String name, Cardinality cardinality) {
            relations.put(name, new RelationDef(name, target, cardinality));
            return this;
        }

        public void withAggregation(String type, String name, Cardinality cardinality) {
            relations.put(name, new RelationDef(name, type, cardinality, true));
        }

        public ScriptTestMappedTransferObjectBuilder withContainment(String target, String name, Cardinality cardinality) {
            containments.put(name, new RelationDef(name, target, cardinality));
            return this;
        }

        private MappedTransferObjectType emptyBuild() {
            EntityType entityType = entityTypes.get(entityName);
            MappedTransferObjectTypeBuilder builder = ServiceBuilders.newMappedTransferObjectTypeBuilder()
                    .withName(name)
                    .withEntityType(entityType);
            final MappedTransferObjectType build = builder.build();
            toTypes.put(name, build);
            return build;
        }

        private MappedTransferObjectType build() {
            EntityType entityType = entityTypes.get(entityName);
            MappedTransferObjectTypeBuilder builder = useMappedTransferObjectType((MappedTransferObjectType) toTypes.get(name));

            for (Map.Entry<String, String> attributeEntry : attributes.entrySet()) {
                TransferAttribute transferAttribute = ServiceBuilders.useTransferAttribute(ServiceBuilders.newTransferAttributeBuilder().build())
                        .withName(attributeEntry.getKey())
                        .withDataType(dataTypes.get(attributeEntry.getValue()))
                        .withRequired(false)
                        .withBinding(entityType.getAttribute(attributeEntry.getKey())).build();
                builder.withAttributes(transferAttribute);
            }
            for (Map.Entry<String, String> propertyEntry : properties.entrySet()) {
                TransferAttribute transferAttribute = ServiceBuilders.useTransferAttribute(ServiceBuilders.newTransferAttributeBuilder().build())
                        .withName(propertyEntry.getKey())
                        .withDataType(dataTypes.get(propertyEntry.getValue()))
                        .withRequired(false)
                        .withBinding(entityType.getDataProperties().stream().filter(p -> p.getName().equals(propertyEntry.getKey())).findAny().get()).build();
                builder.withAttributes(transferAttribute);
            }
            for (Map.Entry<String, RelationDef> relationEntry : relations.entrySet()) {
                TransferObjectType target = toTypes.get(relationEntry.getValue().type);
                TransferObjectRelationBuilder relation = ServiceBuilders.newTransferObjectRelationBuilder()
                        .withName(relationEntry.getKey())
                        .withCardinality(relationEntry.getValue().cardinality.create())
                        .withEmbedded(relationEntry.getValue().aggregation)
                        .withBinding(entityType.getReference(relationEntry.getKey()))
                        .withTarget(target);
                builder.withRelations(relation);
            }
            for (Map.Entry<String, RelationDef> relationEntry : containments.entrySet()) {
                TransferObjectRelation relation = ServiceBuilders.newTransferObjectRelationBuilder()
                        .withName(relationEntry.getKey())
                        .withEmbedded(true)
                        .withBinding(entityType.getRelations().stream().filter(rel -> rel.getName().equals(relationEntry.getKey())).findAny().get())
                        .withCardinality(relationEntry.getValue().cardinality.create())
                        .withTarget(toTypes.get(relationEntry.getValue().type)).build();
                builder.withRelations(relation);
            }

            return builder.build();
        }

    }

    public class ScriptTestEntityBuilder implements ScriptTestBuilders {

        private final ScriptTestMappedTransferObjectBuilder defaultToBuilder;
        private String name;
        private Map<String, String> attributes = new HashMap<>();
        private Map<String, RelationDef> relations = new HashMap<>();
        private Map<String, RelationDef> containments = new HashMap<>();
        private Map<String, PropertyDef> properties = new HashMap<>();

        private ScriptTestEntityBuilder(String name) {
            this.name = name;
            defaultToBuilder = new ScriptTestMappedTransferObjectBuilder(name, name);
        }

        public ScriptTestEntityBuilder withAttribute(String type, String name) {
            attributes.put(name, type);
            defaultToBuilder.withAttribute(type, name);
            return this;
        }

        public ScriptTestEntityBuilder withProperty(String type, String name, String expression) {
            properties.put(name, new PropertyDef(name, type, expression));
            defaultToBuilder.withProperty(type, name);
            return this;
        }

        public ScriptTestEntityBuilder withContainment(String type, String name, Cardinality cardinality) {
            containments.put(name, new RelationDef(name, type, cardinality));
            defaultToBuilder.withContainment(type, name, cardinality);
            return this;
        }

        public ScriptTestEntityBuilder withRelation(String type, String name, Cardinality cardinality) {
            relations.put(name, new RelationDef(name, type, cardinality));
            defaultToBuilder.withRelation(type, name, cardinality);
            return this;
        }

        public ScriptTestEntityBuilder withAggregation(String type, String name, Cardinality cardinality) {
            relations.put(name, new RelationDef(name, type, cardinality, true));
            defaultToBuilder.withAggregation(type, name, cardinality);
            return this;
        }

        private EntityType emptyBuild() {
            EntityTypeBuilder builder = DataBuilders.newEntityTypeBuilder().withName(name);
            final EntityType build = builder.build();
            entityTypes.put(name, build);
            defaultToBuilder.emptyBuild();
            return build;
        }

        private EntityType build() {
            EntityTypeBuilder builder = EntityTypeBuilder.use(entityTypes.get(name));
            for (Map.Entry<String, String> attributeEntry : attributes.entrySet()) {
                Attribute attribute = DataBuilders.newAttributeBuilder().withName(attributeEntry.getKey()).withDataType(dataTypes.get(attributeEntry.getValue())).build();
                builder.withAttributes(attribute);
            }
            for (Map.Entry<String, RelationDef> relationEntry : relations.entrySet()) {
                AssociationEnd relation = DataBuilders.newAssociationEndBuilder().withName(relationEntry.getKey())
                        .withTarget(entityTypes.get(relationEntry.getValue().type))
                        .withCardinality(relationEntry.getValue().cardinality.create()).build();
                builder.withRelations(relation);
            }
            for (Map.Entry<String, RelationDef> containmentEntry : containments.entrySet()) {
                Containment relation = DataBuilders.newContainmentBuilder().withName(containmentEntry.getKey())
                        .withTarget(entityTypes.get(containmentEntry.getValue().type))
                        .withCardinality(containmentEntry.getValue().cardinality.create()).build();
                builder.withRelations(relation);
            }
            for (Map.Entry<String, PropertyDef> propertyEntry : properties.entrySet()) {
                DataProperty property = newDataPropertyBuilder()
                        .withDataType(dataTypes.get(propertyEntry.getValue().type))
                        .withName(propertyEntry.getKey())
                        .withGetterExpression(
                                newDataExpressionTypeBuilder().withExpression(propertyEntry.getValue().expression).withDialect(ExpressionDialect.JQL).build())
                        .build();
                builder.withDataProperties(property);
            }
            return builder.build();
        }

    }

    public class ScriptTestActorTypeBuilder implements ScriptTestBuilders {

        private final String name;
        private final String toName;

        public ScriptTestActorTypeBuilder(String name, String toName) {
            this.name = name;
            this.toName = toName;
        }

        public ActorType build() {
            return newActorTypeBuilder().withName(name).withTransferObjectType(toTypes.get(toName)).build();
        }

    }

    public abstract class ScriptTestOperationBuilder {
        protected final String type;
        protected final String name;
        protected RelationDef output;
        protected String body;
        protected RelationDef input;

        public ScriptTestOperationBuilder(String type, String name) {
            this.type = type;
            this.name = name;
        }

        public ScriptTestOperationBuilder withOutput(String dtoTypeName, Cardinality cardinality) {
            output = new RelationDef("output", dtoTypeName, cardinality);
            return this;
        }

        public ScriptTestOperationBuilder withBody(String body) {
            this.body = body;
            return this;
        }

        public ScriptTestOperationBuilder withInput(String dtoTypeName, String inputName, Cardinality cardinality) {
            input = new RelationDef(inputName, dtoTypeName, cardinality);
            return this;
        }

        protected ParameterBuilder createOutputParam() {
            return newParameterBuilder().withType(toTypes.get(output.type)).withName(output.name).withCardinality(output.cardinality.create());
        }

        protected ParameterBuilder createInputParameter() {
            return newParameterBuilder()
                    .withType(toTypes.get(input.type))
                    .withName(input.name)
                    .withCardinality(input.cardinality.create());
        }

        protected OperationBody createOperationBody() {
            return DataBuilders.newOperationBodyBuilder()
                    .withBody(body)
                    .build();
        }

    }

    public class ScriptTestUnboundOperationBuilder extends ScriptTestOperationBuilder {

        public ScriptTestUnboundOperationBuilder(String type, String name) {
            super(type, name);
        }

        public UnboundOperation build() {
            UnboundOperationBuilder builder = ServiceBuilders.newUnboundOperationBuilder().withName(name);
            if (output != null) {
                builder.withOutput(createOutputParam());
            }
            if (input != null) {
                builder.withInput(createInputParameter());
            }
            builder.withImplementation(createOperationBody());
            return builder.build();
        }

    }

    public class ScriptTestBoundOperationBuilder extends ScriptTestOperationBuilder {

        public ScriptTestBoundOperationBuilder(String type, String name) {
            super(type, name);
        }

        public BoundOperation build() {
            BoundOperationBuilder builder = DataBuilders.newBoundOperationBuilder();
            builder.withName(name)
                    .withInstanceRepresentation((MappedTransferObjectType) toTypes.get(type));
            if (output != null) {
                builder.withOutput(createOutputParam());
            }
            if (input != null) {
                builder.withInput(createInputParameter());
            }
            builder.withImplementation(createOperationBody());
            BoundOperation boundOperation = builder.build();
            BoundTransferOperationBuilder boundTransferOperationBuilder = newBoundTransferOperationBuilder()
                    .withName(name)
                    .withBinding(boundOperation);
            if (output != null) {
                boundTransferOperationBuilder.withOutput(createOutputParam());
            }
            if (input != null) {
                boundTransferOperationBuilder.withInput(createInputParameter());
            }
            boundOperationMapping.put(boundOperation, boundTransferOperationBuilder.build());
            return boundOperation;
        }

    }

}
