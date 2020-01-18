package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class ThermodynamicTemperature {

    public Measure $ = newMeasureBuilder().build();
    public Unit kelvin = newUnitBuilder().build();

    public void init(Package $package) {
        useMeasure($)
                .withName("ThermodynamicTemperature")
                .withUnits(useUnit(kelvin)
                        .withName("kelvin")
                        .withSymbol("K")
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
