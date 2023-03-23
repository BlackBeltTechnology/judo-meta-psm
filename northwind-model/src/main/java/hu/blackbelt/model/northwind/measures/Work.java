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

public class Work {

    public DerivedMeasure $ = newDerivedMeasureBuilder().build();
    public Unit joule = newUnitBuilder().build();
    public Unit kilojoule = newUnitBuilder().build();
    public Unit megajoule = newUnitBuilder().build();
    public Unit watthour = newUnitBuilder().build();
    public Unit kilowatthour = newUnitBuilder().build();

    public void init(Package $package, Force $force, Length $length) {

        useDerivedMeasure($)
                .withName("Work")
                .withUnits(useUnit(joule)
                        .withName("joule")
                        .withSymbol("J")
                )
                .withUnits(useUnit(kilojoule)
                        .withName("kilojoule")
                        .withRateDividend(new Double("1000.0"))
                        .withSymbol("KJ")
                )
                .withUnits(useUnit(megajoule)
                        .withName("megajoule")
                        .withRateDividend(new Double("1000000.0"))
                        .withSymbol("MJ")
                )
                .withUnits(useUnit(watthour)
                        .withName("watthour")
                        .withRateDividend(new Double("3600.0"))
                        .withSymbol("Wh")
                )
                .withUnits(useUnit(kilowatthour)
                        .withName("kilowatthour")
                        .withRateDividend(new Double("3600000.0"))
                        .withSymbol("kWh")
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($force.newton)
                )
                .withTerms(newMeasureDefinitionTermBuilder()
                        .withUnit($length.metre)
                )
                .build();

        usePackage($package).withElements($).build();
    }
}
