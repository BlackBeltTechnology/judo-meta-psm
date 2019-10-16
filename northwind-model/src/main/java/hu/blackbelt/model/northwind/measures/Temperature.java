package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasureBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newUnitBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useMeasure;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useUnit;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Temperature {
    /*
    <elements xsi:type="measure:Measure" xmi:id="_x2bLcB1REemwg4NgOjaKeA" name="Temperature">
      <units xmi:id="_-9i9QB1SEemwg4NgOjaKeA" name="celsius" symbol="&#xb0;C"/>
    </elements>
    */
    public Measure $ = newMeasureBuilder().build();
    public Unit celsius = newUnitBuilder().build();

    public void init(Package $package) {
        useMeasure($)
                .withName("Temperature")
                .withUnits(useUnit(celsius)
                        .withName("celsius")
                        .withSymbol("\u00b0C")
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
