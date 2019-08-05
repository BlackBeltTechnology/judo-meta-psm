package hu.blackbelt.judo.meta.psm;

import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.data.Relation;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.support.PsmModelResourceSupport;
import hu.blackbelt.judo.meta.psm.type.Primitive;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;

public class BuiltInOperationTest {

    private ResourceSet resourceSet;
    private Resource resource;

    @BeforeEach
    public void setUp() {
        resourceSet = PsmModelResourceSupport.createPsmResourceSet();
        resource = resourceSet.createResource(URI.createURI("urn:psm.judo-meta-psm"));
    }

    @AfterEach
    public void tearDown() {
        resource = null;
        resourceSet = null;
    }

    @Test
    public void testToString() {
    	final Primitive booleanType = newBooleanTypeBuilder()
                .withName("Boolean")
                .build();
        final Primitive integerType = newNumericTypeBuilder()
                .withName("Integer")
                .withPrecision(9)
                .withScale(0)
                .build();
        final Primitive longType = newNumericTypeBuilder()
                .withName("Long")
                .withPrecision(19)
                .withScale(0)
                .build();
        final Primitive floatType = newNumericTypeBuilder()
                .withName("Float")
                .withPrecision(7)
                .withScale(4)
                .build();
        final Primitive doubleType = newNumericTypeBuilder()
                .withName("Double")
                .withPrecision(15)
                .withScale(4)
                .build();
        final Primitive stringType = newStringTypeBuilder()
                .withName("String")
                .withMaxLength(255)
                .build();

        final Attribute booleanAttribute = newAttributeBuilder().withName("boolean").withDataType(booleanType).build();
        final Attribute integerAttribute = newAttributeBuilder().withName("integer").withDataType(integerType).withRequired(true).build();
        final Attribute longAttribute = newAttributeBuilder().withName("long").withDataType(longType).build();
        final Attribute floatAttribute = newAttributeBuilder().withName("float").withDataType(floatType).build();
        final Attribute doubleAttribute = newAttributeBuilder().withName("double").withDataType(doubleType).build();
        final Attribute stringAttribute = newAttributeBuilder().withName("string").withDataType(stringType).withRequired(true).withIdentifier(true).build();

        final EntityType entityType1 = newEntityTypeBuilder()
                .withName("EntityType1")
                .withAttributes(Arrays.asList(booleanAttribute, integerAttribute, longAttribute, floatAttribute, doubleAttribute, stringAttribute))
                .build();

        final Relation entity1Containment = newContainmentBuilder()
                .withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build())
                .withName("entity1")
                .withTarget(entityType1)
                .build();
        final Relation entity1Endpoint = newEndpointBuilder()
                .withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1).build())
                .withName("entity1List")
                .withTarget(entityType1)
                .build();

        final EntityType entityType2 = newEntityTypeBuilder()
                .withName("EntityType2")
                .withRelations(Arrays.asList(entity1Containment, entity1Endpoint))
                .build();

        final Package types = newPackageBuilder()
                .withName("types")
                .withElements(Arrays.asList(booleanType, integerType, longType, floatType, doubleType, stringType))
                .build();

        final Package pkg3 = newPackageBuilder()
                .withName("pkg3")
                .withElements(Arrays.asList(entityType1, entityType2))
                .build();

        final Package pkg1 = newPackageBuilder()
                .withName("pkg1")
                .build();

        final Package pkg2 = newPackageBuilder()
                .withName("pkg2")
                .withPackages(Collections.singletonList(pkg3))
                .build();

        final Model model = newModelBuilder()
                .withName("Model")
                .withPackages(Arrays.asList(types, pkg1, pkg2))
                .build();

        resource.getContents().add(model);

        Assertions.assertEquals("Model", model.toString());
        Assertions.assertEquals("Model::pkg1", pkg1.toString());
        Assertions.assertEquals("Model::pkg2", pkg2.toString());
        Assertions.assertEquals("Model::pkg2::pkg3", pkg3.toString());
        Assertions.assertEquals("Model::types", types.toString());
        Assertions.assertEquals("Model::types::Boolean", booleanType.toString());
        Assertions.assertEquals("Model::types::Integer", integerType.toString());
        Assertions.assertEquals("Model::types::Long", longType.toString());
        Assertions.assertEquals("Model::types::Float", floatType.toString());
        Assertions.assertEquals("Model::types::Double", doubleType.toString());
        Assertions.assertEquals("Model::types::String", stringType.toString());
        Assertions.assertEquals("Model::pkg2::pkg3::EntityType1", entityType1.toString());
        Assertions.assertEquals("Model::pkg2::pkg3::EntityType1.boolean", PsmUtils.attributeToString(booleanAttribute));
        Assertions.assertEquals("Model::pkg2::pkg3::EntityType1.integer", PsmUtils.attributeToString(integerAttribute));
        Assertions.assertEquals("Model::pkg2::pkg3::EntityType1.long", PsmUtils.attributeToString(longAttribute));
        Assertions.assertEquals("Model::pkg2::pkg3::EntityType1.float", PsmUtils.attributeToString(floatAttribute));
        Assertions.assertEquals("Model::pkg2::pkg3::EntityType1.double", PsmUtils.attributeToString(doubleAttribute));
        Assertions.assertEquals("Model::pkg2::pkg3::EntityType1.string", PsmUtils.attributeToString(stringAttribute));
        Assertions.assertEquals("Model::pkg2::pkg3::EntityType2", entityType2.toString());
        Assertions.assertEquals("Model::pkg2::pkg3::EntityType2.entity1", PsmUtils.relationToString(entity1Containment));
        Assertions.assertEquals("Model::pkg2::pkg3::EntityType2.entity1List", PsmUtils.relationToString(entity1Endpoint));
    }
}
