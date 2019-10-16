package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasureBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newUnitBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useMeasure;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useUnit;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class ThermodynamicTemperature {
    /*
    <elements xsi:type="measure:Measure" xmi:id="_K9bcoB81EemH1tWVVVMmqg" name="ThermodynamicTemperature">
      <units xmi:id="_NFjmwB81EemH1tWVVVMmqg" name="kelvin" symbol="K"/>
    </elements>
    */
    public Measure $ = newMeasureBuilder().build();
    public Unit kelvin = newUnitBuilder().build();

    public void init(Package $package) {
        useMeasure($)
                .withName("ThermodynamicTemperature")
                .withUnits(useUnit(kelvin)
                        .withName("kelvin")
                        .withSymbol("K")
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
