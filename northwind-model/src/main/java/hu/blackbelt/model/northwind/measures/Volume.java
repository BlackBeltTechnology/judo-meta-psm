package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newDerivedMeasureBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasureDefinitionTermBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newUnitBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useDerivedMeasure;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useUnit;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Volume {
    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_vk8mIB1TEemwg4NgOjaKeA" name="Volume">
      <units xmi:id="_wqf48B1TEemwg4NgOjaKeA" name="cubicMillimetre" rateDividend="1.0E-9" symbol="mm&#xb3;"/>
      <units xmi:id="_0vv3EB1TEemwg4NgOjaKeA" name="cubicCentimetre" rateDividend="1.0E-6" symbol="cm&#xb3;"/>
      <units xmi:id="_1outgB1TEemwg4NgOjaKeA" name="cubicDecimetre" rateDividend="0.001" symbol="dm&#xb3;"/>
      <units xmi:id="_2zAIQB1TEemwg4NgOjaKeA" name="cubicMetre" symbol="m&#xb3;"/>
      <units xmi:id="_97AswB1TEemwg4NgOjaKeA" name="millilitre" rateDividend="1.0E-6" symbol="ml"/>
      <units xmi:id="_-4Dj0B1TEemwg4NgOjaKeA" name="centilitre" rateDividend="1.0E-5" symbol="cl"/>
      <units xmi:id="_BJsPQB1UEemwg4NgOjaKeA" name="decilitre" rateDividend="1.0E-4" symbol="dl"/>
      <units xmi:id="_CYY3AB1UEemwg4NgOjaKeA" name="litre" rateDividend="0.001" symbol="l"/>
      <units xmi:id="_HAfDgB1UEemwg4NgOjaKeA" name="hectolitre" rateDividend="0.1" symbol="hl"/>
      <terms xmi:id="_kLbIYB8wEemH1tWVVVMmqg" exponent="3" unit="_5oYPYB1SEemwg4NgOjaKeA"/>
    </elements>
    */

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
