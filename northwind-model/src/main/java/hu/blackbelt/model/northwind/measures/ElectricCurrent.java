package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class ElectricCurrent {

    public Measure $ = newMeasureBuilder().build();
    public Unit milliampere = newUnitBuilder().build();
    public Unit ampere = newUnitBuilder().build();

    public void init(Package $package) {
        useMeasure($)
                .withName("ElectricCurrent")
                .withUnits(useUnit(milliampere)
                        .withName("milliampere")
                        .withRateDividend(new Double("0.001"))
                        .withSymbol("mA")
                )
                .withUnits(useUnit(ampere)
                        .withName("ampere")
                        .withSymbol("A")
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
