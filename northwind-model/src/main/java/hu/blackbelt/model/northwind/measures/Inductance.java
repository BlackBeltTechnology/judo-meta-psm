package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Inductance {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit henry = newUnitBuilder().build();

    public void init(Package $package, MagneticFlux $magneticFlux, ElectricCurrent $electricCurrent) {
        useDerivedMeasure($)
                .withName("Inductance")
                .withUnits(useUnit(henry)
                        .withName("henry")
                        .withSymbol("H")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($magneticFlux.weber)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1)
                        .withUnit($electricCurrent.ampere)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
