package hu.blackbelt.model.northwind.types.measured;

import hu.blackbelt.judo.meta.psm.measure.MeasuredType;
import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.model.northwind.measures.MonthBasedTime;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasuredTypeBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useMeasuredType;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class TimeStoredInMonths {

    public MeasuredType $ = newMeasuredTypeBuilder().build();

    public void init(Package $package, MonthBasedTime $moMonthBasedTime) {
        useMeasuredType($)
                .withName("TimeStoredInMonths").withPrecision(9).withStoreUnit($moMonthBasedTime.month).build();

        usePackage($package).withElements($).build();
    }

}
