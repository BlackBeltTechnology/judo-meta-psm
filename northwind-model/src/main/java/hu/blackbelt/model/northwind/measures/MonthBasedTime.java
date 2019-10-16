package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DurationType;
import hu.blackbelt.judo.meta.psm.measure.DurationUnit;
import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newDurationUnitBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasureBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useDurationUnit;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useMeasure;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class MonthBasedTime {
    /*
    <elements xsi:type="measure:Measure" xmi:id="_tTcIcB1REemwg4NgOjaKeA" name="MonthBasedTime">
      <units xsi:type="measure:DurationUnit" xmi:id="_yX3RgB2GEemwg4NgOjaKeA" name="month" unitType="month"/>
      <units xsi:type="measure:DurationUnit" xmi:id="_zDfocB2GEemwg4NgOjaKeA" name="year" rateDividend="12.0" unitType="year"/>
    </elements>
    */
    public Measure $ = newMeasureBuilder().build();
    public DurationUnit month = newDurationUnitBuilder().build();
    public DurationUnit year = newDurationUnitBuilder().build();

    public void init(Package $package) {
        useMeasure($)
                .withName("MonthBasedTime")
                .withUnits(useDurationUnit(month)
                        .withName("month")
                        .withUnitType(DurationType.MONTH)
                )
                .withUnits(useDurationUnit(year)
                        .withName("year")
                        .withRateDividend(new Double("12.0"))
                        .withUnitType(DurationType.YEAR)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
