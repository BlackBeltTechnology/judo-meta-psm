package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DurationType;
import hu.blackbelt.judo.meta.psm.measure.DurationUnit;
import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newDurationUnitBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasureBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newUnitBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useDurationUnit;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useMeasure;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useUnit;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Time {
    /*
    <elements xsi:type="measure:Measure" xmi:id="_qJUV0B1REemwg4NgOjaKeA" name="Time">
      <units xsi:type="measure:DurationUnit" xmi:id="_PCQ14B2GEemwg4NgOjaKeA" name="millisecond" rateDividend="0.001" symbol="ms"/>
      <units xsi:type="measure:DurationUnit" xmi:id="_SlUs8B2GEemwg4NgOjaKeA" name="second" symbol="s" unitType="second"/>
      <units xsi:type="measure:DurationUnit" xmi:id="_S5zvMB2GEemwg4NgOjaKeA" name="minute" rateDividend="60.0" symbol="min" unitType="minute"/>
      <units xsi:type="measure:DurationUnit" xmi:id="_TRAHMB2GEemwg4NgOjaKeA" name="hour" rateDividend="3600.0" symbol="h" unitType="hour"/>
      <units xsi:type="measure:DurationUnit" xmi:id="_TjC5cB2GEemwg4NgOjaKeA" name="day" rateDividend="86400.0" symbol="" unitType="day"/>
      <units xsi:type="measure:DurationUnit" xmi:id="_ezprAB2GEemwg4NgOjaKeA" name="week" rateDividend="604800.0" symbol="" unitType="week"/>
    </elements>
    */

    public Measure $ = newMeasureBuilder().build();
    public DurationUnit nanosecond = newDurationUnitBuilder().build();
    public Unit microsecond = newUnitBuilder().build();
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
                        .withRateDividend(new Double("0.000000001"))
                        .withUnitType(DurationType.NANOSECOND)
                        .withSymbol("ns")
                )
                .withUnits(useUnit(microsecond)
                        .withName("microsecond")
                        .withRateDividend(new Double("0.000001"))
                        .withSymbol("\u03bcs")
                )

                .withUnits(useDurationUnit(millisecond)
                        .withName("millisecond")
                        .withRateDividend(new Double("0.001"))
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
