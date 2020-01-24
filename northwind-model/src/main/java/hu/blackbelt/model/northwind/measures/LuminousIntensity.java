package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class LuminousIntensity {

    public Measure $ = newMeasureBuilder().build();
    public Unit candela = newUnitBuilder().build();

    public void init(Package $package) {
        useMeasure($)
                .withName("LuminousIntensity")
                .withUnits(useUnit(candela)
                        .withName("candela")
                        .withSymbol("cd")
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
