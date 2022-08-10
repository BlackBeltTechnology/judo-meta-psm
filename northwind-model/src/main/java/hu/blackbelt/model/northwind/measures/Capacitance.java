package hu.blackbelt.model.northwind.measures;

/*-
 * #%L
 * Judo :: Psm :: Model
 * %%
 * Copyright (C) 2018 - 2022 BlackBelt Technology
 * %%
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the Eclipse
 * Public License, v. 2.0 are satisfied: GNU General Public License, version 2
 * with the GNU Classpath Exception which is
 * available at https://www.gnu.org/software/classpath/license.html.
 * 
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 * #L%
 */

import hu.blackbelt.judo.meta.psm.measure.DerivedMeasure;
import hu.blackbelt.judo.meta.psm.measure.Unit;
import hu.blackbelt.judo.meta.psm.namespace.Package;

import static hu.blackbelt.judo.meta.psm.measure.util.builder.MeasureBuilders.*;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;

public class Capacitance {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit pikofarad = newUnitBuilder().build();
    public Unit nanofarad = newUnitBuilder().build();
    public Unit microfarad = newUnitBuilder().build();
    public Unit farad = newUnitBuilder().build();

    public void init(Package $package, Work $work, ElectricPotential $electricPotential) {
        useDerivedMeasure($)
                .withName("Capacitance")
                .withUnits(useUnit(pikofarad)
                        .withName("pikofarad")
                        .withRateDividend(new Double("1.0E-12"))
                        .withSymbol("pF")
                )
                .withUnits(useUnit(nanofarad)
                        .withName("nanofarad")
                        .withRateDividend(new Double("1.0E-9"))
                        .withSymbol("nF")
                )
                .withUnits(useUnit(microfarad)
                        .withName("microfarad")
                        .withRateDividend(new Double("1.0E-6"))
                        .withSymbol("\u03bcF")
                )
                .withUnits(useUnit(farad)
                        .withName("farad")
                        .withSymbol("F")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($work.joule)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withExponent(-1)
                        .withUnit($electricPotential.volt)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
