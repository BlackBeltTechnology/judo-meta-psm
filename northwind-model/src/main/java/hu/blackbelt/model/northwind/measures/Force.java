package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Force {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit newton = newUnitBuilder().build();

    public void init(Package $package, Mass $mass, Acceleration $acceleration) {
        useDerivedMeasure($)
                .withName("Force")
                .withUnits(useUnit(newton)
                        .withName("newton")
                        .withSymbol("N")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($mass.kilogram)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($acceleration.metrePerSecondSquared)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
