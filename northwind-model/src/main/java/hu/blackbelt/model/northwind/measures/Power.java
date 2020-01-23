package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Power {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit watt = newUnitBuilder().build();
    public Unit kilowatt = newUnitBuilder().build();
    public Unit megawatt = newUnitBuilder().build();

    public void init(Package $package, Work $work, Time $time) {
        useDerivedMeasure($)
                .withName("Power")
                .withUnits(useUnit(watt)
                        .withName("watt")
                        .withSymbol("W")
                )
                .withUnits(useUnit(kilowatt)
                        .withName("kilowatt")
                        .withRateDividend(new Double("1000.0"))
                        .withSymbol("kW")
                )
                .withUnits(useUnit(megawatt)
                        .withName("megawatt")
                        .withRateDividend(new Double("1000000.0"))
                        .withSymbol("MW")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($work.joule)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1).withUnit($time.second)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}