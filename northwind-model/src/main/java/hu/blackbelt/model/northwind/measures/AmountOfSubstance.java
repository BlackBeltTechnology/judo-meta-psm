package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class AmountOfSubstance {

    public Measure $ = newMeasureBuilder().build();
    public Unit mol = newUnitBuilder().build();

    public void init(Package $package) {
        useMeasure($)
                .withName("AmountOfSubstance")
                .withUnits(useUnit(mol)
                        .withName("mol")
                        .withSymbol("mol")
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
