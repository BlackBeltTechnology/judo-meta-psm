package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Density {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit kilogramPerCubicMetre = newUnitBuilder().build();
    public Unit gramPerCubicCentimetre = newUnitBuilder().build();

    public void init(Package $package, Mass $mass, Volume $volume) {
        useDerivedMeasure($)
                .withName("Density")
                .withUnits(useUnit(kilogramPerCubicMetre)
                        .withName("kilogramPerCubicMetre")
                        .withSymbol("kg/m\u00b3")
                )
                .withUnits(useUnit(gramPerCubicCentimetre)
                        .withName("gramPerCubicCentimetre")
                        .withRateDividend(new Double("1000.0"))
                        .withSymbol("g/m\u00b3")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($mass.kilogram)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1)
                        .withUnit($volume.cubicMetre)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
