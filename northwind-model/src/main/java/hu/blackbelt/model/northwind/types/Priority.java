package hu.blackbelt.model.northwind.types;

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

import hu.blackbelt.judo.meta.psm.namespace.Package;
import hu.blackbelt.judo.meta.psm.type.EnumerationType;

import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.usePackage;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.*;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newEnumerationMemberBuilder;

public class Priority {

    public EnumerationType $ = newEnumerationTypeBuilder().build();

    public void init(Package $package) {
        useEnumerationType($).withName("Priority")
                .withMembers(newEnumerationMemberBuilder().withName("NORMAL").withOrdinal(0).build())
                .withMembers(newEnumerationMemberBuilder().withName("URGENT").withOrdinal(1).build())
                .build();

        usePackage($package).withElements($).build();
    }
}
