package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Momentum {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit kilogramMetrePerSecond = newUnitBuilder().build();

    public void init(Package $package, Mass $mass, Velocity $velocity) {
        useDerivedMeasure($)
                .withName("Momentum")
                .withUnits(useUnit(kilogramMetrePerSecond)
                        .withName("kilogramMetrePerSecond")
                        .withSymbol("kg*m/s")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($mass.kilogram))
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($velocity.metrePerSecond))
                .build();

        usePackage($package).withElements($).build();
    }
}
