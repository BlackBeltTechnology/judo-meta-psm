package hu.blackbelt.model.northwind.measures;

import hu.blackbelt.judo.meta.psm.measure.Measure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newMeasureBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.newUnitBuilder;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useMeasure;
import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.useUnit;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class AmountOfSubstance {
    /*
    <elements xsi:type="measure:Measure" xmi:id="_X4EHEB81EemH1tWVVVMmqg" name="AmountOfSubstance">
      <units xmi:id="_Zd74sB81EemH1tWVVVMmqg" name="mol" symbol="mol"/>
    </elements>
    */
    public Measure $ = newMeasureBuilder().build();
    public Unit mol = newUnitBuilder().build();

    public void init(Package $package) {
        useMeasure($)
                .withName("AmountOfSubstance")
                .withUnits(useUnit(mol)
                        .withName("mol")
                        .withSymbol("mol")
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
