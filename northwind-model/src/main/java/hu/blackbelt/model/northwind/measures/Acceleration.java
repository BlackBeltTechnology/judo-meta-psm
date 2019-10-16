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

public class Acceleration {
    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_M00kMB1VEemwg4NgOjaKeA" name="Acceleration">
      <units xmi:id="_RelkoB1VEemwg4NgOjaKeA" name="metrePerSecondSquared" symbol="m/s&#xb2;"/>
      <terms xmi:id="_LD3_sB8xEemH1tWVVVMmqg" unit="_0T0TkB1UEemwg4NgOjaKeA"/>
      <terms xmi:id="_Lcc3wB8xEemH1tWVVVMmqg" exponent="-1" unit="_SlUs8B2GEemwg4NgOjaKeA"/>
    </elements>
    */
    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit metrePerSecondSquared = newUnitBuilder().build();

    public void init(Package $package, Velocity $velocity, Time $time) {
        useDerivedMeasure($)
                .withName("Acceleration")
                .withUnits(useUnit(metrePerSecondSquared)
                        .withName("metrePerSecondSquared")
                        .withSymbol("m/s\u00b2"))
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($velocity.metrePerSecond))
                .withTerms(newMeasureDefinitionTermBuilder().withExponent(-1)
                        .withUnit($time.second))
                .build();

        usePackage($package).withElements($).build();
    }
}
