package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Velocity {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit metrePerSecond = newUnitBuilder().build();
    public Unit kilometrePerHour = newUnitBuilder().build();

    public void init(Package $package, Length $length, Time $time) {
        useDerivedMeasure($)
                .withName("Velocity")
                .withUnits(useUnit(metrePerSecond)
                        .withName("metrePerSecond")
                        .withSymbol("m/s"))
                .withUnits(useUnit(kilometrePerHour)
                        .withName("kilometrePerHour")
                        .withRateDivisor(new Double("3.6")
                        ).withSymbol("km/h"))
                .withTerms(newMeasureDefinitionTermBuilder().withUnit($length.metre))
                .withTerms(newMeasureDefinitionTermBuilder().withExponent(-1).withUnit($time.second))
                .build();

        usePackage($package).withElements($).build();
    }
}
