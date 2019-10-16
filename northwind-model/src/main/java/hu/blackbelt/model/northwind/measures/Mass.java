package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasureBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newUnitBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useMeasure;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useUnit;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Mass {
    /*
    <elements xsi:type="measure:Measure" xmi:id="_oNT8IB1REemwg4NgOjaKeA" name="Mass">
      <units xmi:id="_2IFN4B1REemwg4NgOjaKeA" name="milligram" rateDividend="1.0E-6" symbol="mg"/>
      <units xmi:id="__1ZnwB1REemwg4NgOjaKeA" name="gram" rateDividend="0.001" symbol="g"/>
      <units xmi:id="_BY6o8B1SEemwg4NgOjaKeA" name="dekagram" rateDividend="0.01" symbol="dkg"/>
      <units xmi:id="_C8XYsB1SEemwg4NgOjaKeA" name="kilogram" symbol="kg"/>
      <units xmi:id="_EqUvUB1SEemwg4NgOjaKeA" name="quintal" rateDividend="100.0" symbol="q"/>
      <units xmi:id="_HM9EIB1SEemwg4NgOjaKeA" name="tonne" rateDividend="1000.0" symbol="t"/>
    </elements>
     */
    public Measure $ = newMeasureBuilder().build();
    public Unit milligram = newUnitBuilder().build();
    public Unit gram = newUnitBuilder().build();
    public Unit dekagram = newUnitBuilder().build();
    public Unit kilogram = newUnitBuilder().build();
    public Unit quintal = newUnitBuilder().build();
    public Unit tonne = newUnitBuilder().build();

    public void init(Package $package) {
        useMeasure($)
                .withName("Mass")
                .withUnits(useUnit(milligram)
                        .withName("milligram")
                        .withRateDividend(new Double("1.0E-6"))
                        .withSymbol("mg")
                )
                .withUnits(useUnit(gram)
                        .withName("gram")
                        .withRateDividend(new Double("0.001"))
                        .withSymbol("g")
                )
                .withUnits(useUnit(dekagram)
                        .withName("dekagram")
                        .withRateDividend(new Double("0.01"))
                        .withSymbol("dkg")
                )
                .withUnits(useUnit(kilogram)
                        .withName("kilogram")
                        .withSymbol("kg"))
                .withUnits(useUnit(quintal)
                        .withName("quintal")
                        .withRateDividend(new Double("100.0"))
                        .withSymbol("q")
                )
                .withUnits(useUnit(tonne)
                        .withName("tonne")
                        .withRateDividend(new Double("1000.0"))
                        .withSymbol("t")
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
