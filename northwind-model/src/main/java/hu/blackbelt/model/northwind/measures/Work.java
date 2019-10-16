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

public class Work {
    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_9__osB16Eemwg4NgOjaKeA" name="Work">
      <units xmi:id="_CbRhMB17Eemwg4NgOjaKeA" name="joule" symbol="J"/>
      <units xmi:id="_3ab0gB17Eemwg4NgOjaKeA" name="kilojoule" rateDividend="1000.0" symbol="kJ"/>
      <units xmi:id="_7IsO8B17Eemwg4NgOjaKeA" name="megajoule" rateDividend="1000000.0" symbol="MJ"/>
      <units xmi:id="_hdUngB18Eemwg4NgOjaKeA" name="watthour" rateDividend="3600.0"/>
      <units xmi:id="_lhQXAB18Eemwg4NgOjaKeA" name="kilowatthour" rateDividend="3600000.0" symbol="kWh"/>
      <terms xmi:id="_tFj8YB8xEemH1tWVVVMmqg" unit="_oibTsB1VEemwg4NgOjaKeA"/>
      <terms xmi:id="_3S5TEB8xEemH1tWVVVMmqg" unit="_5oYPYB1SEemwg4NgOjaKeA"/>
    </elements>
    */
    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit joule = newUnitBuilder().build();
    public Unit kilojoule = newUnitBuilder().build();
    public Unit megajoule = newUnitBuilder().build();
    public Unit watthour = newUnitBuilder().build();
    public Unit kilowatthour = newUnitBuilder().build();

    public void init(Package $package, Force $force, Length $length) {

        useDerivedMeasure($)
                .withName("Work")
                .withUnits(useUnit(joule)
                        .withName("joule")
                        .withSymbol("J")
                )
                .withUnits(useUnit(kilojoule)
                        .withName("kilojoule")
                        .withRateDividend(new Double("1000.0"))
                        .withSymbol("KJ")
                )
                .withUnits(useUnit(megajoule)
                        .withName("megajoule")
                        .withRateDividend(new Double("1000000.0"))
                        .withSymbol("MJ")
                )
                .withUnits(useUnit(watthour)
                        .withName("watthour")
                        .withRateDividend(new Double("3600.0"))
                        .withSymbol("Wh")
                )
                .withUnits(useUnit(kilowatthour)
                        .withName("kilowatthour")
                        .withRateDividend(new Double("3600000.0"))
                        .withSymbol("kWh")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($force.newton)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($length.metre)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
