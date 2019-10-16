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

public class Frequency {
    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_LI-4MB17Eemwg4NgOjaKeA" name="Frequency">
      <units xmi:id="_NGpewB17Eemwg4NgOjaKeA" name="hertz" symbol="Hz"/>
      <units xmi:id="_QHuDEB17Eemwg4NgOjaKeA" name="kilohertz" rateDividend="1000.0" symbol="kHz"/>
      <units xmi:id="_RefBsB17Eemwg4NgOjaKeA" name="megahertz" rateDividend="1000000.0" symbol="Mhz"/>
      <units xmi:id="_TAni0B17Eemwg4NgOjaKeA" name="gigahertz" rateDividend="c" symbol="Ghz"/>
      <terms xmi:id="_VasNEB8yEemH1tWVVVMmqg" exponent="-1" unit="_SlUs8B2GEemwg4NgOjaKeA"/>
    </elements>
    */
    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit hertz = newUnitBuilder().build();
    public Unit kilohertz = newUnitBuilder().build();
    public Unit megahertz = newUnitBuilder().build();
    public Unit gigahertz = newUnitBuilder().build();

    public void init(Package $package, Time $time) {
        useDerivedMeasure($)
                .withName("Frequency")
                .withUnits(useUnit(hertz)
                        .withName("hertz").withSymbol("Hz")
                )
                .withUnits(useUnit(kilohertz)
                        .withName("kilohertz")
                        .withRateDividend(new Double("1000.0"))
                        .withSymbol("kHz")
                )
                .withUnits(useUnit(megahertz)
                        .withName("megahertz")
                        .withRateDividend(new Double("1000000.0"))
                        .withSymbol("MHz")
                )
                .withUnits(useUnit(gigahertz)
                        .withName("gigahertz")
                        .withRateDividend(new Double("1.0E9"))
                        .withSymbol("GHz")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1)
                        .withUnit($time.second)
                )
                .build();
        usePackage($package).withElements($).build();
    }
}
