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

public class Pressure {
    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_4TREgB18Eemwg4NgOjaKeA" name="Pressure">
      <units xmi:id="_8oFIoB18Eemwg4NgOjaKeA" name="pascal" symbol="Pa"/>
      <units xmi:id="__unbwB18Eemwg4NgOjaKeA" name="hectopascal" rateDividend="100.0" symbol="hPa"/>
      <terms xmi:id="_ZaOkwB8yEemH1tWVVVMmqg" unit="_oibTsB1VEemwg4NgOjaKeA"/>
      <terms xmi:id="_cHZVoB8yEemH1tWVVVMmqg" exponent="-1" unit="_eD5KMB1TEemwg4NgOjaKeA"/>
    </elements>
    */
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
