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
import hu.blackbelt.judo.meta.psm.measure.*;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.junit.jupiter.api.*;

import java.io.File;
import java.util.Collection;
import java.util.Collections;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;

@Slf4j
class PsmValidationMeasureTest {

    private final String createdSourceModelName = "urn:psm.judo-meta-psm";

    private PsmModel psmModel;

    @BeforeEach
    void setUp() {
        psmModel = PsmModel.buildPsmModel().uri(URI.createURI(createdSourceModelName)).build();
    }

    private void runEpsilon(Collection<String> expectedErrors, Collection<String> expectedWarnings) throws Exception {
        try (Log bufferedLog = new BufferedSlf4jLogger(log)) {
            bufferedLog.debug("PSM diagnostics: " + psmModel.getDiagnosticsAsString());
            Assertions.assertTrue(psmModel.isValid());
            PsmEpsilonValidator.validatePsm(bufferedLog, psmModel,
                    new File("../model/src/main/epsilon/validations/psm.evl").toURI().resolve("."), expectedErrors,
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

    @Test
    void testNoCircularReferencesOfDerivedMeasures() throws Exception {
        log.info("Testing constraint: NoCircularReferencesOfDerivedMeasures");

        final Unit u1 = newUnitBuilder().withName("u1").withRateDividend(1.0).withRateDivisor(1.0).build();
        final Unit u2 = newUnitBuilder().withName("u2").withRateDividend(1.0).withRateDivisor(1.0).build();
        final MeasureDefinitionTerm t1 = newMeasureDefinitionTermBuilder().withUnit(u2).withExponent(1).build();
        final MeasureDefinitionTerm t2 = newMeasureDefinitionTermBuilder().withUnit(u1).withExponent(1).build();
        final DerivedMeasure m1 = newDerivedMeasureBuilder().withName("m1").withUnits(u1).withTerms(t1).build();
        final DerivedMeasure m2 = newDerivedMeasureBuilder().withName("m2").withUnits(u2).withTerms(t2).build();

        final Model m = newModelBuilder()
                .withPackages(newPackageBuilder().withName("measures").withElements(ImmutableList.of(m1, m2)).build())
                .withName("M").build();

        psmModel.addContent(m);
        runEpsilon(
                ImmutableList.of("NoCircularReferencesOfDerivedMeasures|Derived measure definition m1 is recursive",
                        "NoCircularReferencesOfDerivedMeasures|Derived measure definition m2 is recursive"),
                Collections.emptyList());
    }

    @Test
    void testUnitRates() throws Exception {
        log.info("Testing constraints: *RateIsValid");

        final DurationUnit millisecond = newDurationUnitBuilder().withName("millisecond").withSymbol("ms")
                .withRateDividend(1.0).withRateDivisor(1000.0).withUnitType(DurationType.MILLISECOND).build();
        final DurationUnit second = newDurationUnitBuilder().withName("second").withSymbol("s").withRateDividend(1.0)
                .withRateDivisor(1.0).withUnitType(DurationType.SECOND).build();
        final DurationUnit minute = newDurationUnitBuilder().withName("minute").withSymbol("m").withRateDividend(60.0)
                .withRateDivisor(1.0).withUnitType(DurationType.MINUTE).build();
        final DurationUnit hour = newDurationUnitBuilder().withName("hour").withSymbol("h").withRateDividend(3600.0)
                .withRateDivisor(1.0).withUnitType(DurationType.HOUR).build();
        final DurationUnit day = newDurationUnitBuilder().withName("day").withSymbol("d").withRateDividend(86400.0)
                .withRateDivisor(1.0).withUnitType(DurationType.DAY).build();
        final DurationUnit week = newDurationUnitBuilder().withName("week").withSymbol("w").withRateDividend(604800.0)
                .withRateDivisor(1.0).withUnitType(DurationType.WEEK).build();
        final DurationUnit month = newDurationUnitBuilder().withName("month").withSymbol("mo").withRateDividend(1.0)
                .withRateDivisor(1.0).withUnitType(DurationType.MONTH).build();
        final DurationUnit year = newDurationUnitBuilder().withName("year").withSymbol("y").withRateDividend(12.0)
                .withRateDivisor(1.0).withUnitType(DurationType.YEAR).build();

        final Measure time = newMeasureBuilder().withName("Time").withSymbol("t")
                .withUnits(ImmutableList.of(millisecond, second, minute, hour, day, week)).build();
        final Measure monthBasedTime = newMeasureBuilder().withName("MonthBasedTime")
                .withUnits(ImmutableList.of(month, year)).build();
        final Model m = newModelBuilder().withPackages(
                newPackageBuilder().withName("measures").withElements(ImmutableList.of(time, monthBasedTime)).build())
                .withName("M").build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(), ImmutableList.of());
    }

    @Test
    public void testMicrosecondRateIsValid() throws Exception {

        DurationUnit micro = newDurationUnitBuilder().withName("micro").withRateDividend(1).withRateDivisor(1)
                .withUnitType(DurationType.MICROSECOND).build();
        DurationUnit nano = newDurationUnitBuilder().withName("nano").withRateDividend(1).withRateDivisor(2000)
                .withUnitType(DurationType.NANOSECOND).build();
        Measure measure = newMeasureBuilder().withName("measure").withUnits(ImmutableList.of(micro, nano)).build();

        final Model model = newModelBuilder().withName("Model").withElements(ImmutableList.of(measure)).build();

        psmModel.addContent(model);

        runEpsilon(
                ImmutableList.of("MicrosecondRateIsValid|Rate of microsecond (micro) temporal measure unit is invalid"),
                Collections.emptyList());
    }

    @Test
    public void testMillisecondRateIsValid() throws Exception {

        DurationUnit milli = newDurationUnitBuilder().withName("milli").withRateDividend(1).withRateDivisor(2)
                .withUnitType(DurationType.MILLISECOND).build();
        DurationUnit micro = newDurationUnitBuilder().withName("micro").withRateDividend(1).withRateDivisor(1)
                .withUnitType(DurationType.MICROSECOND).build();
        DurationUnit nano = newDurationUnitBuilder().withName("nano").withRateDividend(1).withRateDivisor(1000)
                .withUnitType(DurationType.NANOSECOND).build();
        Measure measure = newMeasureBuilder().withName("measure").withUnits(ImmutableList.of(micro, nano, milli))
                .build();

        final Model model = newModelBuilder().withName("Model").withElements(ImmutableList.of(measure)).build();

        psmModel.addContent(model);

        runEpsilon(
                ImmutableList.of("MillisecondRateIsValid|Rate of millisecond (milli) temporal measure unit is invalid"),
                Collections.emptyList());
    }

    @Test
    public void testSecondRateIsValid() throws Exception {

        DurationUnit second = newDurationUnitBuilder().withName("second").withRateDividend(1).withRateDivisor(1)
                .withUnitType(DurationType.SECOND).build();
        DurationUnit milli = newDurationUnitBuilder().withName("milli").withRateDividend(1).withRateDivisor(1)
                .withUnitType(DurationType.MILLISECOND).build();
        DurationUnit micro = newDurationUnitBuilder().withName("micro").withRateDividend(1).withRateDivisor(1000)
                .withUnitType(DurationType.MICROSECOND).build();
        DurationUnit nano = newDurationUnitBuilder().withName("nano").withRateDividend(1).withRateDivisor(1000000)
                .withUnitType(DurationType.NANOSECOND).build();
        Measure measure = newMeasureBuilder().withName("measure")
                .withUnits(ImmutableList.of(micro, nano, milli, second)).build();

        final Model model = newModelBuilder().withName("Model").withElements(ImmutableList.of(measure)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of("SecondRateIsValid|Rate of second (second) temporal measure unit is invalid"),
                Collections.emptyList());
    }

    @Test
    public void testMinuteRateIsValid() throws Exception {

        DurationUnit minute = newDurationUnitBuilder().withName("minute").withRateDividend(1).withRateDivisor(2)
                .withUnitType(DurationType.MINUTE).build();
        DurationUnit second = newDurationUnitBuilder().withName("second").withRateDividend(1).withRateDivisor(1)
                .withUnitType(DurationType.SECOND).build();
        DurationUnit milli = newDurationUnitBuilder().withName("milli").withRateDividend(1).withRateDivisor(1000)
                .withUnitType(DurationType.MILLISECOND).build();
        DurationUnit micro = newDurationUnitBuilder().withName("micro").withRateDividend(1).withRateDivisor(1000000)
                .withUnitType(DurationType.MICROSECOND).build();
        DurationUnit nano = newDurationUnitBuilder().withName("nano").withRateDividend(1).withRateDivisor(1000000000d)
                .withUnitType(DurationType.NANOSECOND).build();
        Measure measure = newMeasureBuilder().withName("measure")
                .withUnits(ImmutableList.of(micro, nano, milli, second, minute)).build();

        final Model model = newModelBuilder().withName("Model").withElements(ImmutableList.of(measure)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of("MinuteRateIsValid|Rate of minute (minute) temporal measure unit is invalid"),
                Collections.emptyList());
    }

    @Test
    public void testHourRateIsValid() throws Exception {

        DurationUnit hour = newDurationUnitBuilder().withName("hour").withRateDividend(1).withRateDivisor(2)
                .withUnitType(DurationType.HOUR).build();
        DurationUnit minute = newDurationUnitBuilder().withName("minute").withRateDividend(1).withRateDivisor(1)
                .withUnitType(DurationType.MINUTE).build();
        DurationUnit second = newDurationUnitBuilder().withName("second").withRateDividend(1).withRateDivisor(60)
                .withUnitType(DurationType.SECOND).build();
        DurationUnit milli = newDurationUnitBuilder().withName("milli").withRateDividend(1).withRateDivisor(60000)
                .withUnitType(DurationType.MILLISECOND).build();
        DurationUnit micro = newDurationUnitBuilder().withName("micro").withRateDividend(1).withRateDivisor(60000000)
                .withUnitType(DurationType.MICROSECOND).build();
        DurationUnit nano = newDurationUnitBuilder().withName("nano").withRateDividend(0.001).withRateDivisor(60000000)
                .withUnitType(DurationType.NANOSECOND).build();
        Measure measure = newMeasureBuilder().withName("measure")
                .withUnits(ImmutableList.of(nano, micro, milli, second, minute, hour)).build();

        final Model model = newModelBuilder().withName("Model").withElements(ImmutableList.of(measure)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of("HourRateIsValid|Rate of hour (hour) temporal measure unit is invalid"),
                Collections.emptyList());
    }

    @Test
    public void testDayRateIsValid() throws Exception {

        DurationUnit day = newDurationUnitBuilder().withName("day").withRateDividend(1).withRateDivisor(1)
                .withUnitType(DurationType.DAY).build();
        DurationUnit hour = newDurationUnitBuilder().withName("hour").withRateDividend(1).withRateDivisor(25)
                .withUnitType(DurationType.HOUR).build();
        DurationUnit minute = newDurationUnitBuilder().withName("minute").withRateDividend(1).withRateDivisor(1500)
                .withUnitType(DurationType.MINUTE).build();
        DurationUnit second = newDurationUnitBuilder().withName("second").withRateDividend(1).withRateDivisor(90000)
                .withUnitType(DurationType.SECOND).build();
        DurationUnit milli = newDurationUnitBuilder().withName("milli").withRateDividend(1).withRateDivisor(90000000)
                .withUnitType(DurationType.MILLISECOND).build();
        DurationUnit micro = newDurationUnitBuilder().withName("micro").withRateDividend(1)
                .withRateDivisor(90000000000d).withUnitType(DurationType.MICROSECOND).build();
        DurationUnit nano = newDurationUnitBuilder().withName("nano").withRateDividend(1)
                .withRateDivisor(90000000000000d).withUnitType(DurationType.NANOSECOND).build();
        Measure measure = newMeasureBuilder().withName("measure")
                .withUnits(ImmutableList.of(hour, day, minute, second, milli, micro, nano)).build();

        final Model model = newModelBuilder().withName("Model").withElements(ImmutableList.of(measure)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of("DayRateIsValid|Rate of day (day) temporal measure unit is invalid"),
                Collections.emptyList());
    }

    @Test
    public void testWeekRateIsValid() throws Exception {

        DurationUnit week = newDurationUnitBuilder().withName("week").withRateDividend(1).withRateDivisor(1)
                .withUnitType(DurationType.WEEK).build();
        DurationUnit day = newDurationUnitBuilder().withName("day").withRateDividend(1).withRateDivisor(6)
                .withUnitType(DurationType.DAY).build();
        DurationUnit hour = newDurationUnitBuilder().withName("hour").withRateDividend(1).withRateDivisor(144)
                .withUnitType(DurationType.HOUR).build();
        DurationUnit minute = newDurationUnitBuilder().withName("minute").withRateDividend(1).withRateDivisor(8640)
                .withUnitType(DurationType.MINUTE).build();
        DurationUnit second = newDurationUnitBuilder().withName("second").withRateDividend(1).withRateDivisor(518400)
                .withUnitType(DurationType.SECOND).build();
        DurationUnit milli = newDurationUnitBuilder().withName("milli").withRateDividend(1).withRateDivisor(518400000)
                .withUnitType(DurationType.MILLISECOND).build();
        DurationUnit micro = newDurationUnitBuilder().withName("micro").withRateDividend(1)
                .withRateDivisor(518400000000d).withUnitType(DurationType.MICROSECOND).build();
        DurationUnit nano = newDurationUnitBuilder().withName("nano").withRateDividend(1)
                .withRateDivisor(518400000000000d).withUnitType(DurationType.NANOSECOND).build();
        Measure measure = newMeasureBuilder().withName("measure")
                .withUnits(ImmutableList.of(hour, day, week, minute, second, milli, micro, nano)).build();

        final Model model = newModelBuilder().withName("Model").withElements(ImmutableList.of(measure)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of("WeekRateIsValid|Rate of week (week) temporal measure unit is invalid"),
                Collections.emptyList());
    }

    @Test
    public void testYearRateIsValid() throws Exception {

        DurationUnit year = newDurationUnitBuilder().withName("year").withRateDividend(1).withRateDivisor(1)
                .withUnitType(DurationType.YEAR).build();
        DurationUnit month = newDurationUnitBuilder().withName("month").withRateDividend(1).withRateDivisor(10)
                .withUnitType(DurationType.MONTH).build();
        Measure measure = newMeasureBuilder().withName("measure").withUnits(ImmutableList.of(year, month)).build();

        final Model model = newModelBuilder().withName("Model").withElements(ImmutableList.of(measure)).build();

        psmModel.addContent(model);

        runEpsilon(ImmutableList.of("YearRateIsValid|Rate of year (year) temporal measure unit is invalid"),
                Collections.emptyList());
    }

    @Test
    void testBaseUnitShouldBeDefined() throws Exception {
        log.info("Testing critique: BaseUnitShouldBeDefined");

        final Unit millimetre = newUnitBuilder().withName("millimetre").withSymbol("mm").withRateDividend(1.0)
                .withRateDivisor(1000.0).build();
        final Unit centimetre = newUnitBuilder().withName("centimetre").withSymbol("cm").withRateDividend(1.0)
                .withRateDivisor(100.0).build();
        final Unit kilometre = newUnitBuilder().withName("kilometre").withSymbol("km").withRateDividend(1000.0)
                .withRateDivisor(1.0).build();

        final Measure length = newMeasureBuilder().withName("Length").withSymbol("l")
                .withUnits(ImmutableList.of(millimetre, centimetre, kilometre)).build();
        final Model m = newModelBuilder()
                .withPackages(newPackageBuilder().withName("measures").withElements(ImmutableList.of(length)).build())
                .withName("M").build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of("BaseUnitShouldBeDefined|No base unit is defined for measure: Length"));
    }

    @Test
    void testMeasureNameIsUnique() throws Exception {
        log.info("Testing critique: MeasureNameIsUnique");

        final DurationUnit second = newDurationUnitBuilder().withName("second").withSymbol("s").withRateDividend(1.0)
                .withRateDivisor(1.0).withUnitType(DurationType.SECOND).build();
        final DurationUnit minute = newDurationUnitBuilder().withName("minute").withSymbol("m").withRateDividend(60.0)
                .withRateDivisor(1.0).withUnitType(DurationType.MINUTE).build();
        final DurationUnit month = newDurationUnitBuilder().withName("month").withSymbol("mo").withRateDividend(1.0)
                .withRateDivisor(1.0).withUnitType(DurationType.MONTH).build();
        final DurationUnit year = newDurationUnitBuilder().withName("year").withSymbol("y").withRateDividend(12.0)
                .withRateDivisor(1.0).withUnitType(DurationType.YEAR).build();

        final Measure time = newMeasureBuilder().withName("Time").withSymbol("t")
                .withUnits(ImmutableList.of(second, minute)).build();
        final Measure monthBasedTime = newMeasureBuilder().withName("Time").withUnits(ImmutableList.of(month, year))
                .build();
        final Model m = newModelBuilder().withPackages(ImmutableList.of(
                newPackageBuilder().withName("siMeasures").withElements(ImmutableList.of(time)).build(),
                newPackageBuilder().withName("otherMeasures").withElements(ImmutableList.of(monthBasedTime)).build()))
                .withName("M").build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(), ImmutableList.of("MeasureNameIsUnique|There are two or more measures of the same name: Time"));
    }

    @Test
    void testMeasureSymbolIsUnique() throws Exception {
        log.info("Testing constraint: MeasureSymbolIsUnique");

        final DurationUnit second = newDurationUnitBuilder().withName("second").withSymbol("s").withRateDividend(1.0)
                .withRateDivisor(1.0).withUnitType(DurationType.SECOND).build();
        final DurationUnit minute = newDurationUnitBuilder().withName("minute").withSymbol("m").withRateDividend(60.0)
                .withRateDivisor(1.0).withUnitType(DurationType.MINUTE).build();
        final DurationUnit month = newDurationUnitBuilder().withName("month").withSymbol("mo").withRateDividend(1.0)
                .withRateDivisor(1.0).withUnitType(DurationType.MONTH).build();
        final DurationUnit year = newDurationUnitBuilder().withName("year").withSymbol("y").withRateDividend(12.0)
                .withRateDivisor(1.0).withUnitType(DurationType.YEAR).build();

        final Measure time = newMeasureBuilder().withName("Time").withSymbol("t")
                .withUnits(ImmutableList.of(second, minute)).build();
        final Measure monthBasedTime = newMeasureBuilder().withName("MonthBasedTime").withSymbol("t")
                .withUnits(ImmutableList.of(month, year)).build();
        final Model m = newModelBuilder().withPackages(
                newPackageBuilder().withName("measures").withElements(ImmutableList.of(time, monthBasedTime)).build())
                .withName("M").build();

        psmModel.addContent(m);
        runEpsilon(
                ImmutableList.of("MeasureSymbolIsUnique|Measure symbol is not unique: t (measure: Time)",
                        "MeasureSymbolIsUnique|Measure symbol is not unique: t (measure: MonthBasedTime)"),
                Collections.emptyList());
    }

    @Test
    void testUnitNameIsUnique() throws Exception {
        log.info("Testing critique: UnitNameIsUnique");

        final Unit millimetre = newUnitBuilder().withName("millimetre").withSymbol("mm").withRateDividend(1.0)
                .withRateDivisor(1000.0).build();
        final Unit centimetre = newUnitBuilder().withName("centimetre").withSymbol("cm").withRateDividend(1.0)
                .withRateDivisor(100.0).build();
        final Unit metre = newUnitBuilder().withName("base").withSymbol("m").withRateDividend(1.0).withRateDivisor(1.0)
                .build();
        final DurationUnit second = newDurationUnitBuilder().withName("base").withSymbol("sec").withRateDividend(1.0)
                .withRateDivisor(1.0).withUnitType(DurationType.SECOND).build();
        final DurationUnit minute = newDurationUnitBuilder().withName("minute").withSymbol("min").withRateDividend(60.0)
                .withRateDivisor(1.0).withUnitType(DurationType.MINUTE).build();
        final DurationUnit hour = newDurationUnitBuilder().withName("hour").withSymbol("h").withRateDividend(3600.0)
                .withRateDivisor(1.0).withUnitType(DurationType.HOUR).build();

        final Measure length = newMeasureBuilder().withName("Length").withSymbol("l")
                .withUnits(ImmutableList.of(millimetre, centimetre, metre)).build();
        final Measure time = newMeasureBuilder().withName("Time").withSymbol("t")
                .withUnits(ImmutableList.of(second, minute, hour)).build();
        final Model m = newModelBuilder()
                .withPackages(
                        newPackageBuilder().withName("measures").withElements(ImmutableList.of(length, time)).build())
                .withName("M").build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of("UnitNameIsUnique|There are two or more units of the same name: base (in measure: Length)",
                        "UnitNameIsUnique|There are two or more units of the same name: base (in measure: Time)"));
    }

    @Test
    void testUnitSymbolIsUnique() throws Exception {
        log.info("Testing critique: UnitSymbolIsUnique");

        final Unit millimetre = newUnitBuilder().withName("millimetre").withSymbol("mm").withRateDividend(1.0)
                .withRateDivisor(1000.0).build();
        final Unit centimetre = newUnitBuilder().withName("centimetre").withSymbol("cm").withRateDividend(1.0)
                .withRateDivisor(100.0).build();
        final Unit metre = newUnitBuilder().withName("metre").withSymbol("m").withRateDividend(1.0).withRateDivisor(1.0)
                .build();
        final DurationUnit second = newDurationUnitBuilder().withName("second").withSymbol("s").withRateDividend(1.0)
                .withRateDivisor(1.0).withUnitType(DurationType.SECOND).build();
        final DurationUnit minute = newDurationUnitBuilder().withName("minute").withSymbol("m").withRateDividend(60.0)
                .withRateDivisor(1.0).withUnitType(DurationType.MINUTE).build();
        final DurationUnit hour = newDurationUnitBuilder().withName("hour").withSymbol("h").withRateDividend(3600.0)
                .withRateDivisor(1.0).withUnitType(DurationType.HOUR).build();

        final Measure length = newMeasureBuilder().withName("Length").withSymbol("l")
                .withUnits(ImmutableList.of(millimetre, centimetre, metre)).build();
        final Measure time = newMeasureBuilder().withName("Time").withSymbol("t")
                .withUnits(ImmutableList.of(second, minute, hour)).build();
        final Model m = newModelBuilder()
                .withPackages(
                        newPackageBuilder().withName("measures").withElements(ImmutableList.of(length, time)).build())
                .withName("M").build();

        psmModel.addContent(m);
        runEpsilon(Collections.emptyList(),
                ImmutableList.of("UnitSymbolIsUnique|There are two or more units that have the same symbol: m (unit: metre, measure: Length)",
                        "UnitSymbolIsUnique|There are two or more units that have the same symbol: m (unit: minute, measure: Time)"));
    }

    @Test
    void testUnitSymbolIsUniqueInMeasure() throws Exception {
        log.info("Testing critique: UnitSymbolIsUniqueInMeasure");

        final Unit millimetre = newUnitBuilder().withName("millimetre").withSymbol("mm").withRateDividend(1.0)
                .withRateDivisor(1000.0).build();
        final Unit centimetre = newUnitBuilder().withName("centimetre").withSymbol("m").withRateDividend(1.0)
                .withRateDivisor(100.0).build();
        final Unit metre = newUnitBuilder().withName("metre").withSymbol("m").withRateDividend(1.0).withRateDivisor(1.0)
                .build();

        final Measure length = newMeasureBuilder().withName("Length").withSymbol("l")
                .withUnits(ImmutableList.of(millimetre, centimetre, metre)).build();

        final Model m = newModelBuilder()
                .withPackages(newPackageBuilder().withName("measures").withElements(ImmutableList.of(length)).build())
                .withName("M").build();

        psmModel.addContent(m);
        runEpsilon(ImmutableList.of(
                "UnitSymbolIsUniqueInMeasure|Unit symbol: m of unit: metre of measure: Length is not unique",
                "UnitSymbolIsUniqueInMeasure|Unit symbol: m of unit: centimetre of measure: Length is not unique"),
                Collections.emptyList());
    }
}
