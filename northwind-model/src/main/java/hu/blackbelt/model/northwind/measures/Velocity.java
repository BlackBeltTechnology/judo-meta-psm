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

public class Velocity {

    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_xiATQB1UEemwg4NgOjaKeA" name="Velocity">
      <units xmi:id="_zR6KoB1UEemwg4NgOjaKeA" name="kilometrePerHour" rateDivisor="3.6" symbol="km/h"/>
      <units xmi:id="_0T0TkB1UEemwg4NgOjaKeA" name="metrePerSecond" symbol="m/s"/>
      <terms xmi:id="_FNbJsB8xEemH1tWVVVMmqg" unit="_5oYPYB1SEemwg4NgOjaKeA"/>
      <terms xmi:id="_FhD3YB8xEemH1tWVVVMmqg" exponent="-1" unit="_SlUs8B2GEemwg4NgOjaKeA"/>
    </elements>
    */

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit metrePerSecond = newUnitBuilder().build();
    public Unit kilometrePerHour = newUnitBuilder().build();

    public void init(Package $package, Length $length, Time $time) {
        useDerivedMeasure($)
                .withName("Velocity")
                .withUnits(useUnit(metrePerSecond)
                        .withName("metrePerSecond")
                        .withSymbol("m/s"))
                .withUnits(useUnit(kilometrePerHour)
                        .withName("kilometrePerHour")
                        .withRateDivisor(new Double("3.6")
                        ).withSymbol("km/h"))
                .withTerms(newMeasureDefinitionTermBuilder().withUnit($length.metre))
                .withTerms(newMeasureDefinitionTermBuilder().withExponent(-1).withUnit($time.second))
                .build();

        usePackage($package).withElements($).build();
    }
}
