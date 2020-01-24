package hu.blackbelt.judo.meta.psm;

import com.google.common.collect.ImmutableList;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.exceptions.EvlScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.Slf4jLog;
import hu.blackbelt.judo.meta.psm.derived.StaticNavigation;
import hu.blackbelt.judo.meta.psm.data.AssociationEnd;
import hu.blackbelt.judo.meta.psm.data.Attribute;
import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.derived.DataProperty;
import hu.blackbelt.judo.meta.psm.derived.NavigationProperty;
import hu.blackbelt.judo.meta.psm.derived.StaticData;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.type.CustomType;
import hu.blackbelt.judo.meta.psm.type.StringType;

import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.Assertions;
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
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;

class PsmValidationDerivedTest {

    Logger logger = LoggerFactory.getLogger(PsmValidationDerivedTest.class);

    private final String createdSourceModelName = "urn:psm.judo-meta-psm";

    private PsmModel psmModel;
    private Log log = new Slf4jLog();

    @BeforeEach
    void setUp() {
        psmModel = PsmModel.buildPsmModel()
                .uri(URI.createURI(createdSourceModelName))
                .name("test")
                .build();
    }

    private void runEpsilon(Collection<String> expectedErrors, Collection<String> expectedWarnings) throws Exception {
        try {
        	Assertions.assertTrue(psmModel.isValid());
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
    void testStaticDataNamesAreUnique() throws Exception {
        log.info("Testing critique: StaticDataNamesAreUnique");

        CustomType custom1 = newCustomTypeBuilder().withName("custom1").build();
        CustomType custom2 = newCustomTypeBuilder().withName("custom2").build();
        
        StaticData staticData1 = newStaticDataBuilder().withName("staticData")
                .withDataType(custom1)
                .withGetterExpression(newDataExpressionTypeBuilder().withExpression("5").build())
                .build();
        StaticData staticData2 = newStaticDataBuilder().withName("StaticData")
                .withDataType(custom2)
                .withGetterExpression(newDataExpressionTypeBuilder().withExpression("5").build())
                .build();

        Package p1 = newPackageBuilder().withName("pkg1").withElements(ImmutableList.of(staticData1,custom1)).build();
        Package p2 = newPackageBuilder().withName("pkg2").withElements(ImmutableList.of(staticData2,custom2)).build();

        Model m = newModelBuilder().withName("M")
                .withPackages(ImmutableList.of(p1, p2))
                .build();

        psmModel.addContent(m);
        
        runEpsilon(Collections.emptyList(),
                ImmutableList.of(
                        "StaticDataNamesAreUnique|Static data name is not unique: staticData",
                        "StaticDataNamesAreUnique|Static data name is not unique: StaticData"));
    }

    @Test
    void testStaticNavigationNamesAreUnique() throws Exception {
        log.info("Testing critique: StaticNavigationNamesAreUnique");

        EntityType entity1 = newEntityTypeBuilder().withName("entity1").build();
        EntityType entity2 = newEntityTypeBuilder().withName("entity2").build();
        
        StaticNavigation staticNavigation1 = newStaticNavigationBuilder().withName("staticNavigation")
                .withTarget(entity1)
                .withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1))
                .withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("entity").build())
                .build();
        StaticNavigation staticNavigation2 = newStaticNavigationBuilder().withName("staticnavigation")
                .withTarget(entity1)
                .withCardinality(newCardinalityBuilder().withLower(0).withUpper(-1))
                .withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("entity").build())
                .build();

        Package p1 = newPackageBuilder().withName("pkg1").withElements(ImmutableList.of(staticNavigation1,entity1)).build();
        Package p2 = newPackageBuilder().withName("pkg2").withElements(ImmutableList.of(staticNavigation2,entity2)).build();

        Model m = newModelBuilder().withName("M")
                .withPackages(ImmutableList.of(p1, p2))
                .build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of(
                        "StaticNavigationNamesAreUnique|Static navigation name is not unique: staticNavigation",
                        "StaticNavigationNamesAreUnique|Static navigation name is not unique: staticnavigation"));
    }

    @Test
    void testInheritedAndOwnDataPropertyNameIsUniqueInEntityType() throws Exception {
        log.info("Testing constraint: InheritedAndOwnDataPropertyNameIsUniqueInEntityType");

        StringType string = newStringTypeBuilder().withName("string").withMaxLength(255).build();

        Attribute attribute1 = newAttributeBuilder().withName("member").withDataType(string).build();
        Attribute attribute2 = newAttributeBuilder().withName("attribute").withDataType(string).build();

        DataProperty property1 = newDataPropertyBuilder().withName("property").withDataType(string).withGetterExpression(
                newDataExpressionTypeBuilder().withExpression("self.attribute").build()
        ).build();
        DataProperty property2 = newDataPropertyBuilder().withName("Member").withDataType(string).withGetterExpression(
                newDataExpressionTypeBuilder().withExpression("self.attribute").build()
        ).build();

        EntityType superSuperEntityType = newEntityTypeBuilder().withName("superSuperEntityType")
                .withAttributes(ImmutableList.of(attribute1))
                .build();
        EntityType superEntityType = newEntityTypeBuilder().withName("superEntityType")
                .withAttributes(ImmutableList.of(attribute2))
                .withDataProperties(ImmutableList.of(property1))
                .withSuperEntityTypes(ImmutableList.of(superSuperEntityType))
                .build();
        EntityType entityType = newEntityTypeBuilder().withName("entityType")
                .withDataProperties(ImmutableList.of(property2))
                .withSuperEntityTypes(ImmutableList.of(superEntityType))
                .build();

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(
                entityType, superEntityType, superSuperEntityType, string)).build();

        psmModel.addContent(m);
        runEpsilon(
                ImmutableList.of(
                        "InheritedAndOwnDataPropertyNameIsUniqueInEntityType|"
                                + "Data property: Member has the same name as inherited content(s) of entity type: entityType"),
                Collections.emptyList());
    }

    @Test
    void testInheritedAndOwnNavigationPropertyNameIsUniqueInEntityType() throws Exception {
        log.info("Testing constraint: InheritedAndOwnNavigationPropertyNameIsUniqueInEntityType");

        StringType string = newStringTypeBuilder().withName("string").withMaxLength(255).build();

        EntityType target = newEntityTypeBuilder().withName("target").build();
        
        AssociationEnd e1 = newAssociationEndBuilder().withName("member").withCardinality(newCardinalityBuilder().build())
        		.withTarget(target).build();
        AssociationEnd e2 = newAssociationEndBuilder().withName("e2").withCardinality(newCardinalityBuilder().build())
        		.withTarget(target).build();

        NavigationProperty navigation1 = newNavigationPropertyBuilder().withName("navigation").withCardinality(newCardinalityBuilder().build())
        		.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.member").build())
        		.withTarget(target).build();
        NavigationProperty navigation2 = newNavigationPropertyBuilder().withName("member").withCardinality(newCardinalityBuilder().build())
        		.withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.e2").build())
        		.withTarget(target).build();

        EntityType superSuperEntityType = newEntityTypeBuilder().withName("superSuperEntityType")
                .withRelations(ImmutableList.of(e1))
                .build();
        EntityType superEntityType = newEntityTypeBuilder().withName("superEntityType")
                .withRelations(ImmutableList.of(e2))
                .withNavigationProperties(ImmutableList.of(navigation1))
                .withSuperEntityTypes(ImmutableList.of(superSuperEntityType))
                .build();
        EntityType entityType = newEntityTypeBuilder().withName("entityType")
                .withNavigationProperties(ImmutableList.of(navigation2))
                .withSuperEntityTypes(ImmutableList.of(superEntityType))
                .build();

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(
                entityType, superEntityType, superSuperEntityType, string, target)).build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of(
                        "InheritedAndOwnNavigationPropertyNameIsUniqueInEntityType|"
                                + "Navigation property: member has the same name as inherited content(s) of entity type: entityType"),
                Collections.emptyList());
    }

    @Test
    void testSetterExpressionsAreNotSupportedYetInPrimitiveAccessor() throws Exception {
        log.info("Testing constraint: SetterExpressionsAreNotSupportedYet (PrimitiveAccessor)");

        final StringType string = newStringTypeBuilder().withName("string").withMaxLength(255).build();

        final EntityType personType = newEntityTypeBuilder().withName("Person")
                .withAttributes(newAttributeBuilder().withName("email").withDataType(string).build())
                .withDataProperties(newDataPropertyBuilder()
                        .withName("myEmail")
                        .withDataType(string)
                        .withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.email").build())
                        .withSetterExpression(newAttributeSelectorTypeBuilder().withExpression("self.email").build())
                        .build())
                .build();

        final Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(personType, string)).build();

        psmModel.addContent(m);
        runEpsilon(
                ImmutableList.of(
                        "SetterExpressionsAreNotSupportedYet|"
                                + "Setter expressions are not supported yet (Person.myEmail)"),
                Collections.emptyList());
    }

    @Test
    void testSetterExpressionsAreNotSupportedYetInReferenceAccessor() throws Exception {
        log.info("Testing constraint: SetterExpressionsAreNotSupportedYet (ReferenceAccessor)");

        EntityType target = newEntityTypeBuilder().withName("target").build();
        
        NavigationProperty nav = newNavigationPropertyBuilder()
		        .withName("myMother")
		        .withCardinality(newCardinalityBuilder().build())
		        .withGetterExpression(newReferenceExpressionTypeBuilder().withExpression("self.mother").build())
		        .withSetterExpression(newReferenceSelectorTypeBuilder().withExpression("self.mother").build())
		        .withTarget(target)
		        .build();
        
        final EntityType personType = newEntityTypeBuilder().withName("Person")
                .withNavigationProperties(ImmutableList.of(nav))
                .build();
        personType.getRelations().add(newAssociationEndBuilder().withName("mother").withCardinality(newCardinalityBuilder().build()).withTarget(personType).build());

        final Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(personType, target)).build();

        psmModel.addContent(m);
        runEpsilon(
                ImmutableList.of("SetterExpressionsAreNotSupportedYet|Setter expressions are not supported yet (Person.myMother)"),
                Collections.emptyList());
    }
}
