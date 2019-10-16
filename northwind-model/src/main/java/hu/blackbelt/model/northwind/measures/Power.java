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

public class Power {

    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_JySLAB17Eemwg4NgOjaKeA" name="Power">
      <units xmi:id="_aIb6EB17Eemwg4NgOjaKeA" name="watt" symbol="W"/>
      <units xmi:id="_DGLC4B18Eemwg4NgOjaKeA" name="kilowatt" rateDividend="1000.0" symbol="kW"/>
      <units xmi:id="_D6JdgB18Eemwg4NgOjaKeA" name="megawatt" rateDividend="1000000.0" symbol="MW"/>
      <terms xmi:id="_DfGKMB8yEemH1tWVVVMmqg" unit="_CbRhMB17Eemwg4NgOjaKeA"/>
      <terms xmi:id="_OngpEB8yEemH1tWVVVMmqg" exponent="-1" unit="_SlUs8B2GEemwg4NgOjaKeA"/>
    </elements>
    */
    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit watt = newUnitBuilder().build();
    public Unit kilowatt = newUnitBuilder().build();
    public Unit megawatt = newUnitBuilder().build();

    public void init(Package $package, Work $work, Time $time) {
        useDerivedMeasure($)
                .withName("Power")
                .withUnits(useUnit(watt)
                        .withName("watt")
                        .withSymbol("W")
                )
                .withUnits(useUnit(kilowatt)
                        .withName("kilowatt")
                        .withRateDividend(new Double("1000.0"))
                        .withSymbol("kW")
                )
                .withUnits(useUnit(megawatt)
                        .withName("megawatt")
                        .withRateDividend(new Double("1000000.0"))
                        .withSymbol("MW")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($work.joule)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1).withUnit($time.second)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}