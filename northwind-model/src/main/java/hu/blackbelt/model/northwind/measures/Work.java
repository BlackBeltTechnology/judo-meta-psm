package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Work {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit joule = newUnitBuilder().build();
    public Unit kilojoule = newUnitBuilder().build();
    public Unit megajoule = newUnitBuilder().build();
    public Unit watthour = newUnitBuilder().build();
    public Unit kilowatthour = newUnitBuilder().build();

    public void init(Package $package, Force $force, Length $length) {

        useDerivedMeasure($)
                .withName("Work")
                .withUnits(useUnit(joule)
                        .withName("joule")
                        .withSymbol("J")
                )
                .withUnits(useUnit(kilojoule)
                        .withName("kilojoule")
                        .withRateDividend(new Double("1000.0"))
                        .withSymbol("KJ")
                )
                .withUnits(useUnit(megajoule)
                        .withName("megajoule")
                        .withRateDividend(new Double("1000000.0"))
                        .withSymbol("MJ")
                )
                .withUnits(useUnit(watthour)
                        .withName("watthour")
                        .withRateDividend(new Double("3600.0"))
                        .withSymbol("Wh")
                )
                .withUnits(useUnit(kilowatthour)
                        .withName("kilowatthour")
                        .withRateDividend(new Double("3600000.0"))
                        .withSymbol("kWh")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($force.newton)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($length.metre)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
