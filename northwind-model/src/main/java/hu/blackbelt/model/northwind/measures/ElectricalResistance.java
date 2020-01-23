package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class ElectricalResistance {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit ohm = newUnitBuilder().build();
    public Unit microohm = newUnitBuilder().build();
    public Unit milliohm = newUnitBuilder().build();

    public void init(Package $package, ElectricPotential $electricPotential, ElectricCurrent $electricCurrent) {
        useDerivedMeasure($)
                .withName("ElectricalResistance")
                .withUnits(useUnit(microohm)
                        .withName("microohm")
                        .withRateDividend(new Double("1.0E-6"))
                        .withSymbol("\u03bc\u03a9")
                )
                .withUnits(useUnit(milliohm)
                        .withName("milliohm")
                        .withRateDividend(new Double("0.01"))
                        .withSymbol("m\u03a9")
                )
                .withUnits(useUnit(ohm)
                        .withName("ohm")
                        .withSymbol("\u03a9")
                )
                .withTerms(newMeasureDefinitionTermBuilder().withUnit($electricPotential.volt))
                .withTerms(newMeasureDefinitionTermBuilder().withExponent(-1).withUnit($electricCurrent.ampere))
                .build();

        usePackage($package).withElements($).build();
    }
}
