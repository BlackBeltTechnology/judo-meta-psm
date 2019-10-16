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

public class Momentum {
    /*
    <elements xsi:type="measure:DerivedMeasure" xmi:id="_ZFoOgB1VEemwg4NgOjaKeA" name="Momentum">
      <units xmi:id="_GFfI8B1WEemwg4NgOjaKeA" name="kilogramMetrePerSecond" symbol="kg*m/s"/>
      <terms xmi:id="_XBiEgB8xEemH1tWVVVMmqg" unit="_C8XYsB1SEemwg4NgOjaKeA"/>
      <terms xmi:id="_XWqnAB8xEemH1tWVVVMmqg" unit="_0T0TkB1UEemwg4NgOjaKeA"/>
    </elements>
    */
    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit kilogramMetrePerSecond = newUnitBuilder().build();

    public void init(Package $package, Mass $mass, Velocity $velocity) {
        useDerivedMeasure($)
                .withName("Momentum")
                .withUnits(useUnit(kilogramMetrePerSecond)
                        .withName("kilogramMetrePerSecond")
                        .withSymbol("kg*m/s")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($mass.kilogram))
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($velocity.metrePerSecond))
                .build();

        usePackage($package).withElements($).build();
    }
}
