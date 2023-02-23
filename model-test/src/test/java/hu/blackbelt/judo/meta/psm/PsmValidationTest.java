package hu.blackbelt.judo.meta.psm;

/*-
 * #%L
 * Judo :: Psm :: Model
 * %%
 * Copyright (C) 2018 - 2022 BlackBelt Technology
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

import com.google.common.collect.ImmutableList;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.exceptions.EvlScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.BufferedSlf4jLogger;
import hu.blackbelt.judo.meta.psm.data.*;
import hu.blackbelt.judo.meta.psm.measure.*;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.type.*;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.*;

import java.util.Collection;
import java.util.Collections;

import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.*;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newDataExpressionTypeBuilder;
import static hu.blackbelt.judo.meta.psm.derived.util.builder.DerivedBuilders.newDataPropertyBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;

@Slf4j
class PsmValidationTest {

    private final String createdSourceModelName = "urn:psm.judo-meta-psm";

    private PsmModel psmModel;

    @BeforeEach
    void setUp () {
        psmModel = PsmModel.buildPsmModel()
                .uri(URI.createURI(createdSourceModelName))
                .build();
    }

    private void runEpsilon (Collection<String> expectedErrors, Collection<String> expectedWarnings) throws Exception {
        try (Log bufferedLog = new BufferedSlf4jLogger(log)) {
        	bufferedLog.debug("PSM diagnostics: " + psmModel.getDiagnosticsAsString());
        	Assertions.assertTrue(psmModel.isValid());
            PsmEpsilonValidator.validatePsm(bufferedLog,
                    psmModel,
                    PsmEpsilonValidator.calculatePsmValidationScriptURI(),
                    expectedErrors,
                    expectedWarnings);
        } catch (EvlScriptExecutionException ex) {
            log.error("EVL failed", ex);
            log.error("\u001B[31m - expected errors: {}\u001B[0m", expectedErrors);
            log.error("\u001B[31m - unexpected errors: {}\u001B[0m", ex.getUnexpectedErrors());
            log.error("\u001B[31m - errors not found: {}\u001B[0m", ex.getErrorsNotFound());
            log.error("\u001B[33m - expected warnings: {}\u001B[0m", expectedWarnings);
            log.error("\u001B[33m - unexpected warnings: {}\u001B[0m", ex.getUnexpectedWarnings());
            log.error("\u001B[33m - warnings not found: {}\u001B[0m", ex.getWarningsNotFound());
            throw ex;
        }
    }

    //There is no 'ModelNameIsUnique' constraint.
    @Test
    void testModelNameIsUnique () throws Exception {
        log.info("Testing constraint: ModelNameIsUnique");

        Model m1 = newModelBuilder().withName("A").build();
        Model m2 = newModelBuilder().withName("A").build();

        psmModel.addContent(m1);
        psmModel.addContent(m2);

        runEpsilon(ImmutableList.of("StandaloneModelLoadedOnly|Standalone models are supported only"),
                Collections.emptyList());
    }
    
  //There is no 'DataPropertyGetterTypeIsValid' constraint.
    @Test
    void testDataPropertyGetterTypeIsValid () throws Exception {
        log.info("Testing constraint: DataPropertyGetterTypeIsValid");

        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();
        BooleanType bool = newBooleanTypeBuilder().withName("Boolean").build();
        DateType date = newDateTypeBuilder().withName("Date").build();
        NumericType integer = newNumericTypeBuilder().withName("Integer").withPrecision(10).build();
        NumericType decimal = newNumericTypeBuilder().withName("Decimal").withPrecision(16).withScale(2).build();
        CustomType email = newCustomTypeBuilder().withName("Email").build();
        EnumerationType country = newEnumerationTypeBuilder().withName("Country").withMembers(ImmutableList.of(
                newEnumerationMemberBuilder().withName("north").build(),
                newEnumerationMemberBuilder().withName("east").withOrdinal(1).build(),
                newEnumerationMemberBuilder().withName("south").withOrdinal(2).build(),
                newEnumerationMemberBuilder().withName("west").withOrdinal(3).build()
        )).build();
        EnumerationType direction = newEnumerationTypeBuilder().withName("Direction").withMembers(ImmutableList.of(
                newEnumerationMemberBuilder().withName("HU").build(),
                newEnumerationMemberBuilder().withName("RO").withOrdinal(1).build(),
                newEnumerationMemberBuilder().withName("SK").withOrdinal(2).build()
        )).build();

        TimestampType timestamp = newTimestampTypeBuilder().withName("Timestamp").build();
        CustomType location = newCustomTypeBuilder().withName("Location").build();
        EntityType F = newEntityTypeBuilder().withName("F").withAttributes(ImmutableList.of(
                newAttributeBuilder().withName("beginTimestamp").withDataType(timestamp).build(),
                newAttributeBuilder().withName("endTimestamp").withDataType(timestamp).build(),
                newAttributeBuilder().withName("location").withDataType(location).build()
        )).build();

        Containment f = newContainmentBuilder().withName("f").withTarget(F).withCardinality(newCardinalityBuilder().withLower(1).build()).build();

        EntityType e = newEntityTypeBuilder().withName("E").withAttributes(ImmutableList.of(
                newAttributeBuilder().withName("name").withDataType(string).build(),
                newAttributeBuilder().withName("external").withDataType(bool).build(),
                newAttributeBuilder().withName("birthDate").withDataType(date).build(),
                newAttributeBuilder().withName("roomNumber").withDataType(integer).build(),
                newAttributeBuilder().withName("email").withDataType(email).build(),
                newAttributeBuilder().withName("radius").withDataType(decimal).build(),
                newAttributeBuilder().withName("country").withDataType(country).build()
        )).withRelations(f)
                .withDataProperties(ImmutableList.of(
                        newDataPropertyBuilder().withName("lowerName").withDataType(bool).withGetterExpression(newDataExpressionTypeBuilder().withExpression("lower(self.name)").build())/*.withSetterExpression(newAttributeSelectorTypeBuilder().withExpression("self.name").build())*/.build(),
                        newDataPropertyBuilder().withName("neighbourRoom").withDataType(decimal).withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.roomNumber + 1").build())/*.withSetterExpression(newAttributeSelectorTypeBuilder().withExpression("self.roomNumber").build())*/.build(),
                        newDataPropertyBuilder().withName("area").withDataType(integer).withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.roomNumber").build())/*.withSetterExpression(newAttributeSelectorTypeBuilder().withExpression("self.radius").build())*/.build(),
                        newDataPropertyBuilder().withName("internal").withDataType(decimal).withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.radius * self.radius * 3.1415").build())/*.withSetterExpression(newAttributeSelectorTypeBuilder().withExpression("self.external").build())*/.build(),
                        newDataPropertyBuilder().withName("direction").withDataType(decimal).withGetterExpression(newDataExpressionTypeBuilder().withExpression("SWITCH CASE WHEN self.country == 'RO' THEN 'east' CASE WHEN self.country == 'SK' THEN 'north' END").build()).build(),
                        newDataPropertyBuilder().withName("begin").withDataType(string).withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.f.beginTimestamp").build())/*.withSetterExpression(newAttributeSelectorTypeBuilder().withExpression("self.f.beginTimestamp").build())*/.build(),
                        newDataPropertyBuilder().withName("place").withDataType(email).withGetterExpression(newDataExpressionTypeBuilder().withExpression("self.f.location").build())/*.withSetterExpression(newAttributeSelectorTypeBuilder().withExpression("self.f.location").build())*/.build()
                )).build();

        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(
                e,
                string,
                bool,
                date,
                integer,
                decimal,
                email,
                country,
                direction,
                F,
                timestamp,
                location
        )).build();


        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                Collections.emptyList());
    }

    @Test
    void testValidModelWithMeasures () throws Exception {
        log.info("Positive test with measures");

        Unit quintal = newUnitBuilder().withName("quintal").withRateDividend(100.0).withSymbol("q").build();
        Unit kilogram = newUnitBuilder().withName("kilogram").withSymbol("kg").build();
        Measure mass = newMeasureBuilder().withName("Mass").withSymbol("m").withUnits(ImmutableList.of(kilogram, quintal)).build();
        Model template = newModelBuilder().withPackages(newPackageBuilder().withName("sandbox").withElements(mass).build()).withName("Template").build();

        MeasuredType massStoredInKg = newMeasuredTypeBuilder().withName("MassStoredInKg").withPrecision(15).withScale(4).withStoreUnit(kilogram).build();
        MeasuredType massStoredInQ = newMeasuredTypeBuilder().withName("MassStoredInQ").withPrecision(15).withScale(4).withStoreUnit(quintal).build();

        EntityType person = newEntityTypeBuilder().withName("Person").withAttributes(newAttributeBuilder().withName("weight").withDataType(massStoredInKg).build()).build();
        EntityType car = newEntityTypeBuilder().withName("Car")
                .withAttributes(
                        newAttributeBuilder().withName("weight").withDataType(massStoredInQ).build()
                ).withRelations(ImmutableList.of(
                        newAssociationEndBuilder().withName("passengers").withTarget(person).withCardinality(
                                newCardinalityBuilder().withUpper(4).withLower(0).build()
                        ).build(),
                        newAssociationEndBuilder().withName("driver").withTarget(person).withCardinality(
                                newCardinalityBuilder().withLower(1).withUpper(1).build()
                        ).build())
                ).withDataProperties(
                        newDataPropertyBuilder().withName("totalWeight").withDataType(massStoredInKg).withGetterExpression(
                                newDataExpressionTypeBuilder().withExpression("self.weight + self.passengers->sum(p | p.weight)").build()).build()
                ).build();


        Model m = newModelBuilder().withName("M").withElements(ImmutableList.of(
                person,
                massStoredInKg,
                massStoredInQ,
                car
        )).build();

        psmModel.addContent(m);
        psmModel.addContent(template);
        runEpsilon(ImmutableList.of("StandaloneModelLoadedOnly|Standalone models are supported only"),
                Collections.emptyList());
    }

    @Test
    void testValidModel () throws Exception {
        log.info("Positive test");

        EntityType E10 = newEntityTypeBuilder().withName("E10").build(); //inherited BY E1
        EntityType E11 = newEntityTypeBuilder().withName("E11").withAbstract_(true).build(); //inherited BY E1

        AssociationEnd b = newAssociationEndBuilder().withName("ep2").withCardinality(newCardinalityBuilder().withLower(1).withUpper(1).build()).build();
        AssociationEnd c = newAssociationEndBuilder().withName("ep3").withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build()).build();
        StringType string = newStringTypeBuilder().withName("String").withMaxLength(255).build();

        //inheriting: E10, E11
        EntityType E1 = newEntityTypeBuilder().withName("E1").withAttributes(
                newAttributeBuilder().withName("a1").withDataType(string).withRequired(true).withIdentifier(true).build()
        ).withRelations(
                ImmutableList.of(b, c)
        ).withSuperEntityTypes(ImmutableList.of(E10, E11)).build();

        StringType text = newStringTypeBuilder().withName("Text").withMaxLength(255).build();
        NumericType integer = newNumericTypeBuilder().withName("Integer").withPrecision(10).build();
        AssociationEnd a = newAssociationEndBuilder().withName("ep1").withCardinality(newCardinalityBuilder().withLower(0).withUpper(1).build()).build();

        EntityType E3 = newEntityTypeBuilder().withName("E3").withRelations(newAssociationEndBuilder().withName("ep4").withTarget(E1).withCardinality(newCardinalityBuilder().withUpper(-1).build()).build()).build();

        EntityType E2 = newEntityTypeBuilder().withName("E2").withRelations(a).build();

        EntityType S2 = newEntityTypeBuilder().withName("S2").withRelations(
                newAssociationEndBuilder().withName("endpoint").withTarget(E2).withCardinality(newCardinalityBuilder().build()).build()
        ).build();

        EntityType S1 = newEntityTypeBuilder().withName("S1").withRelations(ImmutableList.of(
                newAssociationEndBuilder().withName("ep5").withTarget(E1).withCardinality(newCardinalityBuilder().build()).build(),
                newAssociationEndBuilder().withName("s2").withTarget(S2).withCardinality(newCardinalityBuilder().build()).build()
        )).build();

        a.setTarget(E1);
        a.setPartner(b);
        b.setTarget(E2);
        b.setPartner(a);
        c.setTarget(E3);

        Model test = newModelBuilder().withPackages(newPackageBuilder().withName("sandbox").withElements(ImmutableList.of(
                E10,
                E11,
                E1,
                E2,
                E3,
                S1,
                S2
        )).build()).withElements(ImmutableList.of(
                string,
                text,
                integer
        )).withName("TEST").build();

        psmModel.addContent(test);
        runEpsilon(Collections.emptyList(), Collections.emptyList());
    }
}
