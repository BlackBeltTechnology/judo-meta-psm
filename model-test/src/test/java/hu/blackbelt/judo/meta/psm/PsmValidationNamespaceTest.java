package hu.blackbelt.judo.meta.psm;

import com.google.common.collect.ImmutableList;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.exceptions.EvlScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.Slf4jLog;
import hu.blackbelt.judo.meta.psm.data.*;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.type.*;
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Collection;
import java.util.Collections;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.service.util.builder.ServiceBuilders.newUnmappedTransferObjectTypeBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;

class PsmValidationNamespaceTest {
    
	Logger logger = LoggerFactory.getLogger(PsmValidationNamespaceTest.class);

    private final String createdSourceModelName = "urn:psm.judo-meta-psm";

    private PsmModel psmModel;
    private Log log = new Slf4jLog();

    @BeforeEach
    void setUp () {
        psmModel = PsmModel.buildPsmModel()
                .uri(URI.createURI(createdSourceModelName))
                .name("test")
                .build();
    }

    private void runEpsilon (Collection<String> expectedErrors, Collection<String> expectedWarnings) throws Exception {
        try {
            PsmEpsilonValidator.validatePsm(log,
                    psmModel,
                    new File("../model/src/main/epsilon/validations/psm.evl").toURI().resolve("."),
                    expectedErrors,
                    expectedWarnings);
        } catch (EvlScriptExecutionException ex) {
            logger.error("EVL failed", ex);
            logger.error("\u001B[31m - expected errors: {}\u001B[0m", expectedErrors);
            logger.error("\u001B[31m - unexpected errors: {}\u001B[0m", ex.getUnexpectedErrors());
            logger.error("\u001B[31m - errors not found: {}\u001B[0m", ex.getErrorsNotFound());
            logger.error("\u001B[33m - expected warnings: {}\u001B[0m", expectedWarnings);
            logger.error("\u001B[33m - unexpected warnings: {}\u001B[0m", ex.getUnexpectedWarnings());
            logger.error("\u001B[33m - warnings not found: {}\u001B[0m", ex.getWarningsNotFound());
            throw ex;
        }
    }
    
    @Test
    void testStandaloneModelLoadedOnly () throws Exception {
        log.info("Testing constraint: StandaloneModelLoadedOnly");

        Model a = newModelBuilder().withName("A").build();
        Model b = newModelBuilder().withName("B").build();

        psmModel.addContent(a);
        psmModel.addContent(b);
        runEpsilon(ImmutableList.of("StandaloneModelLoadedOnly|Standalone models are supported only"),
                Collections.emptyList());
    }

    @Test
    void testPackageHasNamespace () throws Exception {
        log.info("Testing constraint: NamedElementHasContainer");

        Package pkg = newPackageBuilder().withName("pkg").build();
        Model m = newModelBuilder().withName("M").build();

        psmModel.addContent(m);
        psmModel.addContent(pkg);

        runEpsilon(ImmutableList.of("NamedElementHasContainer|Named element pkg has no container"),
                Collections.emptyList());
    }
    
    @Test
    void testNamespaceElementBelongsToOneNamespace () throws Exception {
        log.info("Testing constraint: NamedElementHasContainer");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();
        StringType orphanString = newStringTypeBuilder().withName("orphanString").withMaxLength(255).build();
        Model m = newModelBuilder().withName("M").build();

        psmModel.addContent(m);
        psmModel.addContent(string);
        psmModel.addContent(orphanString);

        runEpsilon(ImmutableList.of("NamedElementHasContainer|Named element String has no container", "NamedElementHasContainer|Named element orphanString has no container"),
                Collections.emptyList());
    }

    @Test
    void testEnumerationMemberHasEnumerationType () throws Exception {
        log.info("Testing constraint: NamedElementHasContainer");

        Model m = newModelBuilder().withName("M")
                .withElements(newEnumerationTypeBuilder().withName("E")
                        .withMembers(ImmutableList.of(
                                newEnumerationMemberBuilder().withName("m2").withOrdinal(2).build(),
                                newEnumerationMemberBuilder().withName("m3").build()
                        )).build()
                )
                .build();

        EnumerationMember enumMemb = newEnumerationMemberBuilder().withName("m1").withOrdinal(1).build();
        psmModel.addContent(m);
        psmModel.addContent(enumMemb);
        runEpsilon(ImmutableList.of("NamedElementHasContainer|Named element m1 has no container"),
                Collections.emptyList());
    }

    @Test
    void testRelationBelongsToEntity () throws Exception {
        log.info("Testing constraint: NamedElementHasContainer");

        AssociationEnd orphanAssociationEnd = newAssociationEndBuilder().withName("orphanAssociationEnd").withCardinality(newCardinalityBuilder().withUpper(1).withLower(1).build()).build();
        EntityType entity1 = newEntityTypeBuilder().withName("entity1").build();
        orphanAssociationEnd.setTarget(entity1);

        Model m = newModelBuilder().withName("M").withElements(entity1).build();

        psmModel.addContent(orphanAssociationEnd);
        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("NamedElementHasContainer|Named element orphanAssociationEnd has no container"),
                Collections.emptyList());
    }

    @Test
    void testAttributeBelongsToEntity () throws Exception {
        log.info("Testing constraint: NamedElementHasContainer");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        newEntityTypeBuilder().withName("E").withAttributes(newAttributeBuilder().withName("a").withDataType(string).build()).build(),
                        string
                )).build();

        Attribute b = newAttributeBuilder().withName("b").withDataType(string).build();

        psmModel.addContent(m);
        psmModel.addContent(b);

        runEpsilon(ImmutableList.of("NamedElementHasContainer|Named element b has no container"),
                Collections.emptyList());
    }

    @Test
    void testDataPropertyBelongsToEntity () throws Exception {
        log.info("Testing constraint: NamedElementHasContainer");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();
        EntityType E = newEntityTypeBuilder().withName("E").withAttributes(newAttributeBuilder().withName("a").withDataType(string).build()).build();
        DataProperty p = newDataPropertyBuilder().withName("p").withDataType(string).withGetterExpression(newDataExpressionTypeBuilder().withExpression("lower(self.a)").build()).build();

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(E, string)).build();

        psmModel.addContent(m);
        psmModel.addContent(p);
        runEpsilon(ImmutableList.of("NamedElementHasContainer|Named element p has no container"),
                Collections.emptyList());
    }

    @Test
    void testNavigationPropertyBelongsToEntity () throws Exception {
        log.info("Testing constraint: NamedElementHasContainer");

        Containment r1 = newContainmentBuilder().withName("r1").withCardinality(newCardinalityBuilder().build()).build();
        EntityType E = newEntityTypeBuilder().withName("E").withRelations(r1).build();
        r1.setTarget(E);
        Model m = newModelBuilder().withName("M").withElements(E).build();

        NavigationProperty n = newNavigationPropertyBuilder().withName("n").withCardinality(newCardinalityBuilder().build()).withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.r1.r1").build()).build();
        n.setTarget(E);

        psmModel.addContent(m);
        psmModel.addContent(n);

        runEpsilon(ImmutableList.of("NamedElementHasContainer|Named element n has no container"),
                Collections.emptyList());
    }
    
    @Test
    void testNamedElementHasContainer() throws Exception {
        log.info("Testing constraint: NamedElementHasContainer");
        
        Model m = newModelBuilder().withName("M").build();
        Package p = newPackageBuilder().withName("p").build();

        psmModel.addContent(m);
        psmModel.addContent(p);
        runEpsilon(ImmutableList.of("NamedElementHasContainer|Named element p has no container"), Collections.emptyList());
    }
    
    @Test
    void testDataPropertyNameIsUnique () throws Exception {
        log.info("Testing constraint: NamedElementIsUniqueInItsContainer");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

        DataProperty p1 = newDataPropertyBuilder().withName("p").withDataType(string).withGetterExpression(
                newDataExpressionTypeBuilder().withExpression("lower(self.a)").build()).build();
        DataProperty p2 = newDataPropertyBuilder().withName("p").withDataType(string).withGetterExpression(
                newDataExpressionTypeBuilder().withExpression("upper(self.a)").build()).build();

        EntityType E = newEntityTypeBuilder().withName("E")
                .withAttributes(newAttributeBuilder().withName("a").withDataType(string).build())
                .withDataProperties(ImmutableList.of(p1, p2))
                .build();

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(E, string)).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("NamedElementIsUniqueInItsContainer|Named element p is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element p is not unique in its container"),
                Collections.emptyList());
    }

    @Test
    void testNavigationPropertyNameIsUnique () throws Exception {
        log.info("Testing constraint: NamedElementIsUniqueInItsContainer");

        Containment r1 = newContainmentBuilder().withName("r1").withCardinality(newCardinalityBuilder().build()).build();
        NavigationProperty n1 = newNavigationPropertyBuilder().withName("n").withCardinality(newCardinalityBuilder().build()).withGetterExpression(
                newReferenceExpressionTypeBuilder().withExpression("self.r1.r1").build()
        ).build();
        NavigationProperty n2 = newNavigationPropertyBuilder().withName("n").withCardinality(newCardinalityBuilder().build()).withGetterExpression(
                newReferenceExpressionTypeBuilder().withExpression("self.r1.r1.r1").build()
        ).build();


        EntityType E = newEntityTypeBuilder().withName("E").withRelations(r1).withNavigationProperties(ImmutableList.of(n1, n2)).build();

        r1.setTarget(E);
        n1.setTarget(E);
        n2.setTarget(E);


        Model m = newModelBuilder().withName("M").withElements(E).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("NamedElementIsUniqueInItsContainer|Named element n is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element n is not unique in its container"),
                Collections.emptyList());
    }

    @Test
    void testAttributeNameIsUnique () throws Exception {
        log.info("Testing constraint: NamedElementIsUniqueInItsContainer");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255)
                .build();
        NumericType integer = newNumericTypeBuilder().withName("Integer").withPrecision(18)
                .build();

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        string,
                        integer,
                        newEntityTypeBuilder()
                                .withName("E")
                                .withAttributes(ImmutableList.of(
                                        newAttributeBuilder().withName("a").withDataType(string).build(),
                                        newAttributeBuilder().withName("a").withDataType(integer).build()
                                )).build()
                )).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("NamedElementIsUniqueInItsContainer|Named element a is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element a is not unique in its container"),
                Collections.emptyList());
    }
    
    @Test
    void testRelationNameIsUnique () throws Exception {
        log.info("Testing constraint: NamedElementIsUniqueInItsContainer");

        AssociationEnd endpoint = newAssociationEndBuilder()
                .withName("e")
                .withCardinality(newCardinalityBuilder().build())
                .build();
        Containment containment = newContainmentBuilder()
                .withName("e")
                .withCardinality(newCardinalityBuilder().build())
                .build();

        EntityType E = newEntityTypeBuilder()
                .withName("E")
                .withRelations(ImmutableList.of(endpoint, containment))
                .build();

        endpoint.setTarget(E);
        containment.setTarget(E);

        Model m = newModelBuilder().withName("M").withElements(E).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("NamedElementIsUniqueInItsContainer|Named element e is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element e is not unique in its container"),
                Collections.emptyList());
    }
    
    @Test
    void testNoAttributeAndRelationAreWithTheSameName () throws Exception {
        log.info("Testing constraint: NamedElementIsUniqueInItsContainer");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

        AssociationEnd x = newAssociationEndBuilder()
                .withName("x")
                .withCardinality(newCardinalityBuilder().build()).build();

        EntityType E = newEntityTypeBuilder().withName("E")
                .withAttributes(newAttributeBuilder().withName("x").withDataType(string).build())
                .withRelations(x)
                .build();

        x.setTarget(E);

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(string, E)).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("NamedElementIsUniqueInItsContainer|Named element x is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element x is not unique in its container"),
                Collections.emptyList());
    }
    
    @Test
    void testNamedElementIsUniqueInItsContainer() throws Exception {
        log.info("Testing constraint: NamedElementIsUniqueInItsContainer");
        
        Model m = newModelBuilder().withName("M")
        		.withPackages(ImmutableList.of(
        				newPackageBuilder().withName("p").build(),
        				newPackageBuilder().withName("P").build()))
        		.build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("NamedElementIsUniqueInItsContainer|Named element P is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element p is not unique in its container"), Collections.emptyList());
    }
    
    @Test
    void testNamespaceHasUniqueElementNames () throws Exception {
        log.info("Testing constraint: NamedElementIsUniqueInItsContainer");

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        newCustomTypeBuilder().withName("string").build(),
                        newStringTypeBuilder().withName("String").withMaxLength(255).build(),
                        newEntityTypeBuilder().withName("e").build(),
                        newUnmappedTransferObjectTypeBuilder().withName("E").build()
                ))
                .withPackages(ImmutableList.of(
                        newPackageBuilder().withName("p").build(),
                        newPackageBuilder().withName("P").build()
                ))
                .build();

        psmModel.addContent(m);

        runEpsilon(ImmutableList.of(
        		"NamedElementIsUniqueInItsContainer|Named element string is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element String is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element e is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element E is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element p is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element P is not unique in its container"),
        		ImmutableList.of(
				"PrimitiveTypeNamesAreUnique|Primitive type name is not unique: String",
				"PrimitiveTypeNamesAreUnique|Primitive type name is not unique: string"
        		));
    }
    

    @Test
    void testEnumerationMemberNameIs () throws Exception {
        log.info("Testing constraint: NamedElementIsUniqueInItsContainer");

        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(newEnumerationTypeBuilder()
                        .withName("E")
                        .withMembers(ImmutableList.of(newEnumerationMemberBuilder()
                                        .withName("A")
                                        .withOrdinal(0)
                                        .build(),
                                newEnumerationMemberBuilder()
                                        .withName("A")
                                        .withOrdinal(1)
                                        .build()
                        ))
                        .build()
                ))
                .build();

        psmModel.addContent(m);

        runEpsilon(ImmutableList.of("NamedElementIsUniqueInItsContainer|Named element A is not unique in its container",
        		"NamedElementIsUniqueInItsContainer|Named element A is not unique in its container"),
                Collections.emptyList());
    }
    
    @Test
    void testNamespaceElementNameNotEmpty () throws Exception {
        log.info("Testing constraint: ElementNameNotEmpty");
        StringType stringType = newStringTypeBuilder().withName("").withMaxLength(255).build();
        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        stringType
                ))
                .build();
        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("ElementNameNotEmpty|NamespaceElement name must contain at least one character. Zero length name found in M::"), Collections.emptyList());
    }
    
    @Test
    void testNamespaceElementNameContainsValidCharacters () throws Exception {
        log.info("Testing constraint: ElementNameContainsValidCharacters");
        StringType stringType = newStringTypeBuilder().withName("string$string").withMaxLength(255).build();
        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        stringType
                ))
                .build();
        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("ElementNameContainsValidCharacters|NamespaceElement's name can only contain english letters (A-Z, a-z), digits (0-9) and underscore characters (_): string$string"), Collections.emptyList());
    }
    
    @Test
    void testNamespaceElementNameContainsNoSubsequentUnderscores () throws Exception {
        log.info("Testing constraint: ElementNameCannotContainSubsequentUnderscores");
        StringType stringType = newStringTypeBuilder().withName("__string").withMaxLength(255).build();
        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        stringType
                ))
                .build();
        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("ElementNameCannotContainSubsequentUnderscores|NamespaceElement's name cannot contain two subsequent underscore characters: __string"), Collections.emptyList());
    }

    @Test
    void testNamespaceElementNameFirstCharacterCannotBeDigit () throws Exception {
        log.info("Testing constraint: ElementNameFirstCharacterCannotBeDigit");
        StringType stringType = newStringTypeBuilder().withName("0string").withMaxLength(255).build();
        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        stringType
                ))
                .build();
        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("ElementNameFirstCharacterCannotBeDigit|NamespaceElement's name must start with an english letter or an underscore: 0string"), Collections.emptyList());
    }

    @Test
    void testNamespaceElementNameLastCharacterCannotBeUnderscore () throws Exception {
        log.info("Testing constraint: ElementNameLastCharacterCannotBeUnderscore");
        StringType stringType = newStringTypeBuilder().withName("string_").withMaxLength(255).build();
        Model m = newModelBuilder().withName("M")
                .withElements(ImmutableList.of(
                        stringType
                ))
                .build();
        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("ElementNameLastCharacterCannotBeUnderscore|NamespaceElement's name must end with an english letter or a digit: string_"), Collections.emptyList());
    }
}
