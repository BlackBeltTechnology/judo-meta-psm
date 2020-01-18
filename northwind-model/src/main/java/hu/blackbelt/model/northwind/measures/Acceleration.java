package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Acceleration {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit metrePerSecondSquared = newUnitBuilder().build();

    public void init(Package $package, Velocity $velocity, Time $time) {
        useDerivedMeasure($)
                .withName("Acceleration")
                .withUnits(useUnit(metrePerSecondSquared)
                        .withName("metrePerSecondSquared")
                        .withSymbol("m/s\u00b2"))
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($velocity.metrePerSecond))
                .withTerms(newMeasureDefinitionTermBuilder().withExponent(-1)
                        .withUnit($time.second))
                .build();

        usePackage($package).withElements($).build();
    }
}
