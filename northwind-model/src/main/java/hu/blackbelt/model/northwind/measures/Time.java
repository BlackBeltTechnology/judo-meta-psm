package hu.blackbelt.model.northwind.measures;

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
