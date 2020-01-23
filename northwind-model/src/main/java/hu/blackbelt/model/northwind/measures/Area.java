package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Area {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit squareMillimetre = newUnitBuilder().build();
    public Unit squareCentimetre = newUnitBuilder().build();
    public Unit squareDecimetre = newUnitBuilder().build();
    public Unit squareMetre = newUnitBuilder().build();
    public Unit hectare = newUnitBuilder().build();
    public Unit squareKilometre = newUnitBuilder().build();

    public void init(Package $package, Length $length) {
        useDerivedMeasure($)
                .withName("Area")
                .withUnits(useUnit(squareMillimetre)
                        .withName("squareMillimetre")
                        .withRateDividend(new Double("1.0E-6"))
                        .withSymbol("mm\u00b2")
                )
                .withUnits(useUnit(squareCentimetre)
                        .withName("squareCentimetre")
                        .withRateDividend(new Double("1.0E-4"))
                        .withSymbol("cm\u00b2")
                )
                .withUnits(useUnit(squareDecimetre)
                        .withName("squareDecimetre")
                        .withRateDividend(new Double("0.01"))
                        .withSymbol("dm\u00b2")
                )
                .withUnits(useUnit(squareMetre)
                        .withName("squareMetre")
                        .withSymbol("m\u00b2")
                )
                .withUnits(useUnit(hectare)
                        .withName("hectare")
                        .withRateDividend(new Double("10000.0"))
                        .withSymbol("ha")
                )
                .withUnits(useUnit(squareKilometre)
                        .withName("squareKilometre")
                        .withRateDividend(new Double("1000000.0"))
                        .withSymbol("km\u00b2")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(2)
                        .withUnit($length.metre)
                )
                .build();
        usePackage($package).withElements($).build();
    }
}
