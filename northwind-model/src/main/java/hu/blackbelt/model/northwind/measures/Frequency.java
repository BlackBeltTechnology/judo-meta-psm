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

public class Frequency {

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
