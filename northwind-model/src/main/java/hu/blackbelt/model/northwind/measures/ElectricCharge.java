package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class ElectricCharge {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit coulomb = newUnitBuilder().build();

    public void init(Package $package, ElectricCurrent $electricCurrent, Time $time) {
        useDerivedMeasure($)
                .withName("ElectricCharge")
                .withUnits(useUnit(coulomb)
                        .withName("coulomb")
                        .withSymbol("C")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($electricCurrent.ampere)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($time.second)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
