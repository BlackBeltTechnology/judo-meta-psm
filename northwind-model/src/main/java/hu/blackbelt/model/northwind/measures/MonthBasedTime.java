package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DurationType;
import hu.blackbelt.judo.meta.psm.measure.DurationUnit;
import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class MonthBasedTime {

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
