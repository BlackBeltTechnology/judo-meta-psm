package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Mass {

    public Measure $ = newMeasureBuilder().build();
    public Unit milligram = newUnitBuilder().build();
    public Unit gram = newUnitBuilder().build();
    public Unit dekagram = newUnitBuilder().build();
    public Unit kilogram = newUnitBuilder().build();
    public Unit quintal = newUnitBuilder().build();
    public Unit tonne = newUnitBuilder().build();

    public void init(Package $package) {
        useMeasure($)
                .withName("Mass")
                .withUnits(useUnit(milligram)
                        .withName("milligram")
                        .withRateDividend(new Double("1.0E-6"))
                        .withSymbol("mg")
                )
                .withUnits(useUnit(gram)
                        .withName("gram")
                        .withRateDividend(new Double("0.001"))
                        .withSymbol("g")
                )
                .withUnits(useUnit(dekagram)
                        .withName("dekagram")
                        .withRateDividend(new Double("0.01"))
                        .withSymbol("dkg")
                )
                .withUnits(useUnit(kilogram)
                        .withName("kilogram")
                        .withSymbol("kg"))
                .withUnits(useUnit(quintal)
                        .withName("quintal")
                        .withRateDividend(new Double("100.0"))
                        .withSymbol("q")
                )
                .withUnits(useUnit(tonne)
                        .withName("tonne")
                        .withRateDividend(new Double("1000.0"))
                        .withSymbol("t")
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
