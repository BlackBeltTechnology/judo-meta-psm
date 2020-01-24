package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Frequency {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit hertz = newUnitBuilder().build();
    public Unit kilohertz = newUnitBuilder().build();
    public Unit megahertz = newUnitBuilder().build();
    public Unit gigahertz = newUnitBuilder().build();

    public void init(Package $package, Time $time) {
        useDerivedMeasure($)
                .withName("Frequency")
                .withUnits(useUnit(hertz)
                        .withName("hertz").withSymbol("Hz")
                )
                .withUnits(useUnit(kilohertz)
                        .withName("kilohertz")
                        .withRateDividend(new Double("1000.0"))
                        .withSymbol("kHz")
                )
                .withUnits(useUnit(megahertz)
                        .withName("megahertz")
                        .withRateDividend(new Double("1000000.0"))
                        .withSymbol("MHz")
                )
                .withUnits(useUnit(gigahertz)
                        .withName("gigahertz")
                        .withRateDividend(new Double("1.0E9"))
                        .withSymbol("GHz")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1)
                        .withUnit($time.second)
                )
                .build();
        usePackage($package).withElements($).build();
    }
}
