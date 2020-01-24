package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class ElectricPotential {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit volt = newUnitBuilder().build();
    public Unit kilovolt = newUnitBuilder().build();

    public void init(Package $package, Work $work, ElectricCharge $electricCharge) {
        useDerivedMeasure($).withName("ElectricPotential")
                .withUnits(useUnit(volt)
                        .withName("volt")
                        .withSymbol("V")
                )
                .withUnits(useUnit(kilovolt)
                        .withName("kilovolt")
                        .withRateDividend(new Double("1000.0"))
                        .withSymbol("kV")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($work.joule)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1)
                        .withUnit($electricCharge.coulomb)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
