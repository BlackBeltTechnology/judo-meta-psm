package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Pressure {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit pascal = newUnitBuilder().build();
    public Unit hectopascal = newUnitBuilder().build();

    public void init(Package $package, Force $force, Area $area) {
        useDerivedMeasure($)
                .withName("Pressure")
                .withUnits(useUnit(pascal)
                        .withName("pascal")
                        .withSymbol("Pa")
                )
                .withUnits(useUnit(hectopascal)
                        .withName("hectopascal")
                        .withRateDividend(new Double("100.0"))
                        .withSymbol("hPa")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($force.newton)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1)
                        .withUnit($area.squareMetre)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
