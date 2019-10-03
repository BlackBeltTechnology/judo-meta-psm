package hu.blackbelt.judo.meta.psm;

import com.google.common.collect.ImmutableList;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.exceptions.EvlScriptExecutionException;
import hu.blackbelt.epsilon.runtime.execution.impl.Slf4jLog;
import hu.blackbelt.judo.meta.psm.measure.*;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Collection;
import java.util.Collections;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;

class PsmValidationMeasureTest {
    
	Logger logger = LoggerFactory.getLogger(PsmValidationMeasureTest.class);

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
    void testNoCircularReferencesOfDerivedMeasures () throws Exception {
        log.info("Testing constraint: NoCircularReferencesOfDerivedMeasures");

        final Unit u1 = newUnitBuilder().withName("u1").withRateDividend(1.0).withRateDivisor(1.0).build();
        final Unit u2 = newUnitBuilder().withName("u2").withRateDividend(1.0).withRateDivisor(1.0).build();
        final MeasureDefinitionTerm t1 = newMeasureDefinitionTermBuilder().withUnit(u2).withExponent(1).build();
        final MeasureDefinitionTerm t2 = newMeasureDefinitionTermBuilder().withUnit(u1).withExponent(1).build();
        final DerivedMeasure m1 = newDerivedMeasureBuilder().withName("m1").withUnits(u1).withTerms(t1).build();
        final DerivedMeasure m2 = newDerivedMeasureBuilder().withName("m2").withUnits(u2).withTerms(t2).build();

        final Model m = newModelBuilder().withPackages(newPackageBuilder().withName("measures").withElements(ImmutableList.of(m1, m2)).build()).withName("M").build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("NoCircularReferencesOfDerivedMeasures|Derived measure definition m1 is recursive",
                "NoCircularReferencesOfDerivedMeasures|Derived measure definition m2 is recursive"),
                Collections.emptyList());
    }
    
    @Test
    void testUnitRates () throws Exception {
        log.info("Testing constraints: *RateIsValid");

        final DurationUnit millisecond = newDurationUnitBuilder().withName("millisecond").withSymbol("ms").withRateDividend(1.0).withRateDivisor(1000.0).withUnitType(DurationType.MILLISECOND).build();
        final DurationUnit second = newDurationUnitBuilder().withName("second").withSymbol("s").withRateDividend(1.0).withRateDivisor(1.0).withUnitType(DurationType.SECOND).build();
        final DurationUnit minute = newDurationUnitBuilder().withName("minute").withSymbol("m").withRateDividend(60.0).withRateDivisor(1.0).withUnitType(DurationType.MINUTE).build();
        final DurationUnit hour = newDurationUnitBuilder().withName("hour").withSymbol("h").withRateDividend(3600.0).withRateDivisor(1.0).withUnitType(DurationType.HOUR).build();
        final DurationUnit day = newDurationUnitBuilder().withName("day").withSymbol("d").withRateDividend(86400.0).withRateDivisor(1.0).withUnitType(DurationType.DAY).build();
        final DurationUnit week = newDurationUnitBuilder().withName("week").withSymbol("w").withRateDividend(604800.0).withRateDivisor(1.0).withUnitType(DurationType.WEEK).build();
        final DurationUnit month = newDurationUnitBuilder().withName("month").withSymbol("mo").withRateDividend(1.0).withRateDivisor(1.0).withUnitType(DurationType.MONTH).build();
        final DurationUnit year = newDurationUnitBuilder().withName("year").withSymbol("y").withRateDividend(12.0).withRateDivisor(1.0).withUnitType(DurationType.YEAR).build();

        final Measure time = newMeasureBuilder().withName("Time").withSymbol("t").withUnits(ImmutableList.of(millisecond, second, minute, hour, day, week)).build();
        final Measure monthBasedTime = newMeasureBuilder().withName("MonthBasedTime").withUnits(ImmutableList.of(month, year)).build();
        final Model m = newModelBuilder().withPackages(newPackageBuilder().withName("measures").withElements(ImmutableList.of(time, monthBasedTime)).build()).withName("M").build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of());

        // TODO - add negative tests
    }
    
    @Test
    void testBaseUnitShouldBeDefined () throws Exception {
        log.info("Testing critique: BaseUnitShouldBeDefined");

        final Unit millimetre = newUnitBuilder().withName("millimetre").withSymbol("mm").withRateDividend(1.0).withRateDivisor(1000.0).build();
        final Unit centimetre = newUnitBuilder().withName("centimetre").withSymbol("cm").withRateDividend(1.0).withRateDivisor(100.0).build();
        final Unit kilometre = newUnitBuilder().withName("kilometre").withSymbol("km").withRateDividend(1000.0).withRateDivisor(1.0).build();

        final Measure length = newMeasureBuilder().withName("Length").withSymbol("l").withUnits(ImmutableList.of(millimetre, centimetre, kilometre)).build();
        final Model m = newModelBuilder().withPackages(newPackageBuilder().withName("measures").withElements(ImmutableList.of(length)).build()).withName("M").build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of("BaseUnitShouldBeDefined|No base unit is defined for measure: Length"));
    }

    @Test
    void testMeasureNameIsUnique () throws Exception {
        log.info("Testing critique: MeasureNameIsUnique");

        final DurationUnit second = newDurationUnitBuilder().withName("second").withSymbol("s").withRateDividend(1.0).withRateDivisor(1.0).withUnitType(DurationType.SECOND).build();
        final DurationUnit minute = newDurationUnitBuilder().withName("minute").withSymbol("m").withRateDividend(60.0).withRateDivisor(1.0).withUnitType(DurationType.MINUTE).build();
        final DurationUnit month = newDurationUnitBuilder().withName("month").withSymbol("mo").withRateDividend(1.0).withRateDivisor(1.0).withUnitType(DurationType.MONTH).build();
        final DurationUnit year = newDurationUnitBuilder().withName("year").withSymbol("y").withRateDividend(12.0).withRateDivisor(1.0).withUnitType(DurationType.YEAR).build();

        final Measure time = newMeasureBuilder().withName("Time").withSymbol("t").withUnits(ImmutableList.of(second, minute)).build();
        final Measure monthBasedTime = newMeasureBuilder().withName("Time").withUnits(ImmutableList.of(month, year)).build();
        final Model m = newModelBuilder().withPackages(ImmutableList.of(
                newPackageBuilder().withName("siMeasures").withElements(ImmutableList.of(time)).build(),
                newPackageBuilder().withName("otherMeasures").withElements(ImmutableList.of(monthBasedTime)).build()
        )).withName("M").build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of("MeasureNameIsUnique|Measure name is not unique: Time"));
    }

    @Test
    void testMeasureSymbolIsUnique () throws Exception {
        log.info("Testing constraint: MeasureSymbolIsUnique");

        final DurationUnit second = newDurationUnitBuilder().withName("second").withSymbol("s").withRateDividend(1.0).withRateDivisor(1.0).withUnitType(DurationType.SECOND).build();
        final DurationUnit minute = newDurationUnitBuilder().withName("minute").withSymbol("m").withRateDividend(60.0).withRateDivisor(1.0).withUnitType(DurationType.MINUTE).build();
        final DurationUnit month = newDurationUnitBuilder().withName("month").withSymbol("mo").withRateDividend(1.0).withRateDivisor(1.0).withUnitType(DurationType.MONTH).build();
        final DurationUnit year = newDurationUnitBuilder().withName("year").withSymbol("y").withRateDividend(12.0).withRateDivisor(1.0).withUnitType(DurationType.YEAR).build();

        final Measure time = newMeasureBuilder().withName("Time").withSymbol("t").withUnits(ImmutableList.of(second, minute)).build();
        final Measure monthBasedTime = newMeasureBuilder().withName("MonthBasedTime").withSymbol("t").withUnits(ImmutableList.of(month, year)).build();
        final Model m = newModelBuilder().withPackages(newPackageBuilder().withName("measures").withElements(ImmutableList.of(time, monthBasedTime)).build()).withName("M").build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of("MeasureSymbolIsUnique|Measure symbol is not unique: t (measure: Time)",
                "MeasureSymbolIsUnique|Measure symbol is not unique: t (measure: MonthBasedTime)"),
                Collections.emptyList());
    }
    
    @Test
    void testUnitNameIsUnique () throws Exception {
        log.info("Testing critique: unitNameIsUnique");

        final Unit millimetre = newUnitBuilder().withName("millimetre").withSymbol("mm").withRateDividend(1.0).withRateDivisor(1000.0).build();
        final Unit centimetre = newUnitBuilder().withName("centimetre").withSymbol("cm").withRateDividend(1.0).withRateDivisor(100.0).build();
        final Unit metre = newUnitBuilder().withName("metre").withSymbol("m").withRateDividend(1.0).withRateDivisor(1.0).build();
        final DurationUnit second = newDurationUnitBuilder().withName("second").withSymbol("s").withRateDividend(1.0).withRateDivisor(1.0).withUnitType(DurationType.SECOND).build();
        final DurationUnit minute = newDurationUnitBuilder().withName("minute").withSymbol("m").withRateDividend(60.0).withRateDivisor(1.0).withUnitType(DurationType.MINUTE).build();
        final DurationUnit hour = newDurationUnitBuilder().withName("hour").withSymbol("h").withRateDividend(3600.0).withRateDivisor(1.0).withUnitType(DurationType.HOUR).build();

        final Measure length = newMeasureBuilder().withName("Length").withSymbol("l").withUnits(ImmutableList.of(millimetre, centimetre, metre)).build();
        final Measure time = newMeasureBuilder().withName("Time").withSymbol("t").withUnits(ImmutableList.of(second, minute, hour)).build();
        final Model m = newModelBuilder().withPackages(newPackageBuilder().withName("measures").withElements(ImmutableList.of(length, time)).build()).withName("M").build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of("UnitNameIsUnique|Unit name/symbol is not unique: metre/m",
                        "UnitNameIsUnique|Unit name/symbol is not unique: minute/m"));
    }
}
