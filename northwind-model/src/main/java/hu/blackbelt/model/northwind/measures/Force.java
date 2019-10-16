package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newDerivedMeasureBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasureDefinitionTermBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newUnitBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useDerivedMeasure;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useUnit;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Force {
    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_mq7mkB1VEemwg4NgOjaKeA" name="Force">
      <units xmi:id="_oibTsB1VEemwg4NgOjaKeA" name="newton" symbol="N"/>
      <terms xmi:id="_nzfl0B8xEemH1tWVVVMmqg" unit="_C8XYsB1SEemwg4NgOjaKeA"/>
      <terms xmi:id="_oRnFMB8xEemH1tWVVVMmqg" unit="_RelkoB1VEemwg4NgOjaKeA"/>
    </elements>
    */
    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit newton = newUnitBuilder().build();

    public void init(Package $package, Mass $mass, Acceleration $acceleration) {
        useDerivedMeasure($)
                .withName("Force")
                .withUnits(useUnit(newton)
                        .withName("newton")
                        .withSymbol("N")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($mass.kilogram)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($acceleration.metrePerSecondSquared)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
