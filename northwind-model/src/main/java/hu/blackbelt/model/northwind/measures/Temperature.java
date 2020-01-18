package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Temperature {

    public Measure $ = newMeasureBuilder().build();
    public Unit celsius = newUnitBuilder().build();

    public void init(Package $package) {
        useMeasure($)
                .withName("Temperature")
                .withUnits(useUnit(celsius)
                        .withName("celsius")
                        .withSymbol("\u00b0C")
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
