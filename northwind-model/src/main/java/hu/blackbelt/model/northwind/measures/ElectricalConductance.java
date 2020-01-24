package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class ElectricalConductance {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit siemens = newUnitBuilder().build();

    public void init(Package $package, ElectricalResistance $electricalResistance) {
        useDerivedMeasure($)
                .withName("ElectricalConductance")
                .withUnits(useUnit(siemens)
                        .withName("siemens")
                        .withSymbol("S")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1)
                        .withUnit($electricalResistance.ohm))
                .build();

        usePackage($package).withElements($).build();
    }
}
