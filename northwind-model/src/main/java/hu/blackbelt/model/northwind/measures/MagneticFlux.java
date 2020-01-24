package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class MagneticFlux {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit weber = newUnitBuilder().build();

    public void init(Package $package, ElectricPotential $electricPotential, Time $time) {
        useDerivedMeasure($)
                .withName("MagneticFlux")
                .withUnits(useUnit(weber)
                        .withName("weber")
                        .withSymbol("Wb")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($electricPotential.volt)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($time.second)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
