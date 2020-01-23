package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Volume {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();

    public Unit cubicMillimetre = newUnitBuilder().build();
    public Unit cubicCentimetre = newUnitBuilder().build();
    public Unit cubicDecimetre = newUnitBuilder().build();
    public Unit cubicMetre = newUnitBuilder().build();
    public Unit millilitre = newUnitBuilder().build();
    public Unit centilitre = newUnitBuilder().build();
    public Unit decilitre = newUnitBuilder().build();
    public Unit litre = newUnitBuilder().build();
    public Unit hectolitre = newUnitBuilder().build();

    public void init(Package $package, Length $length) {
        useDerivedMeasure($)
                .withName("Volume")
                .withUnits(useUnit(cubicMillimetre)
                        .withName("cubicMillimetre")
                        .withRateDividend(new Double("1.0E-9"))
                        .withSymbol("mm\u00b3")
                )
                .withUnits(useUnit(cubicCentimetre)
                        .withName("cubicCentimetre")
                        .withRateDividend(new Double("1.0E-6"))
                        .withSymbol("cm\u00b3")
                )
                .withUnits(useUnit(cubicDecimetre)
                        .withName("cubicDecimetre")
                        .withRateDividend(new Double("0.001"))
                        .withSymbol("dm\u00b3")
                )
                .withUnits(useUnit(cubicMetre)
                        .withName("cubicMetre")
                        .withSymbol("m\u00b3")
                )
                .withUnits(useUnit(millilitre)
                        .withName("millilitre")
                        .withRateDividend(new Double("1.0E-6"))
                        .withSymbol("ml"))
                .withUnits(useUnit(centilitre)
                        .withName("centilitre")
                        .withRateDividend(new Double("1.0E-5"))
                        .withSymbol("cl")
                )
                .withUnits(useUnit(decilitre)
                        .withName("decilitre")
                        .withRateDividend(new Double("1.0E-4"))
                        .withSymbol("dl")
                )
                .withUnits(useUnit(litre)
                        .withName("litre")
                        .withRateDividend(new Double("0.001"))
                        .withSymbol("l")
                )
                .withUnits(useUnit(hectolitre)
                        .withName("hectolitre")
                        .withRateDividend(new Double("0.1"))
                        .withSymbol("hl")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(3)
                        .withUnit($length.metre)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
