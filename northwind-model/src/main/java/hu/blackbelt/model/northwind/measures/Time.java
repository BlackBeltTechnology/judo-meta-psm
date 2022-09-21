package hu.blackbelt.model.northwind.measures;

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

import hu.blackbelt.judo.meta.psm.measure.DurationType;
import hu.blackbelt.judo.meta.psm.measure.DurationUnit;
import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Time {

    public Measure $ = newMeasureBuilder().build();
    public DurationUnit nanosecond = newDurationUnitBuilder().build();
    public DurationUnit microsecond = newDurationUnitBuilder().build();
    public DurationUnit millisecond = newDurationUnitBuilder().build();
    public DurationUnit second = newDurationUnitBuilder().build();
    public DurationUnit minute = newDurationUnitBuilder().build();
    public DurationUnit hour = newDurationUnitBuilder().build();
    public DurationUnit day = newDurationUnitBuilder().build();
    public DurationUnit week = newDurationUnitBuilder().build();

    public void init(Package $package) {
        useMeasure($)
                .withName("Time")
                .withUnits(useDurationUnit(nanosecond)
                        .withName("nanosecond")
                        .withRateDivisor(new Double("1000000000.0"))
                        .withUnitType(DurationType.NANOSECOND)
                        .withSymbol("ns")
                )
                .withUnits(useDurationUnit(microsecond)
                        .withName("microsecond")
                        .withRateDivisor(new Double("1000000.0"))
                        .withUnitType(DurationType.MICROSECOND)
                        .withSymbol("\u03bcs")
                )

                .withUnits(useDurationUnit(millisecond)
                        .withName("millisecond")
                        .withRateDivisor(new Double("1000.0"))
                        .withUnitType(DurationType.MILLISECOND)
                        .withSymbol("ms")
                )
                .withUnits(useDurationUnit(second)
                        .withName("second")
                        .withSymbol("s")
                        .withUnitType(DurationType.SECOND)
                )
                .withUnits(useDurationUnit(minute)
                        .withName("minute")
                        .withRateDividend(new Double("60.0"))
                        .withSymbol("min")
                        .withUnitType(DurationType.MINUTE)
                )
                .withUnits(useDurationUnit(hour)
                        .withName("hour")
                        .withRateDividend(new Double("3600.0"))
                        .withSymbol("h")
                        .withUnitType(DurationType.HOUR)
                )
                .withUnits(useDurationUnit(day)
                        .withName("day")
                        .withRateDividend(new Double("86400.0"))
                        .withSymbol("")
                        .withUnitType(DurationType.DAY)
                )
                .withUnits(useDurationUnit(week)
                        .withName("week")
                        .withRateDividend(new Double("604800.0"))
                        .withSymbol("")
                        .withUnitType(DurationType.WEEK)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
