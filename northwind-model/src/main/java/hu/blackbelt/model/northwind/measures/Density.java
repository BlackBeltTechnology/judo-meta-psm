package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newDerivedMeasureBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasureDefinitionTermBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newUnitBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useDerivedMeasure;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useUnit;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Density {
    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_khxagB19Eemwg4NgOjaKeA" name="Density">
      <units xmi:id="_lgklEB19Eemwg4NgOjaKeA" name="kilogramPerCubicMetre" symbol="kg/m&#xb3;"/>
      <units xmi:id="_rOuasB19Eemwg4NgOjaKeA" name="gramPerCubicCentimetre" rateDividend="1000.0" symbol="g/cm&#xb3;"/>
      <terms xmi:id="_rlYGkB8yEemH1tWVVVMmqg" unit="_C8XYsB1SEemwg4NgOjaKeA"/>
      <terms xmi:id="_r53v4B8yEemH1tWVVVMmqg" exponent="-1" unit="_2zAIQB1TEemwg4NgOjaKeA"/>
    </elements>
    */
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
