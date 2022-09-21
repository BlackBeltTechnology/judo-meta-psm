package hu.blackbelt.judo.meta.psm;

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

import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel.LoadArguments;
import hu.blackbelt.judo.meta.psm.service.MappedTransferObjectType;
import hu.blackbelt.judo.meta.psm.support.PsmModelResourceSupport;

import hu.blackbelt.model.northwind.Demo;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import com.google.common.collect.ImmutableSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;

abstract class NorthwindTest {

    protected ResourceSet resourceSet;
    protected Model northwind;

    @BeforeEach
    public void setUp() throws Exception {
    	//resourceSet = PsmModelResourceSupport.createPsmResourceSet();

    	/*
        PsmModel psmModel = PsmModel.loadPsmModel(LoadArguments.psmLoadArgumentsBuilder()
                .resourceSet(resourceSet)
                .file(new File("src/test/model/northwind-judopsm.model"))
                .tags(ImmutableSet.of("test"))
                .name("test"));
        */
    	PsmModel psmModel = new Demo().fullDemo();
    	resourceSet = psmModel.getResourceSet();

        northwind = (Model) resourceSet.getResources().get(0).getEObject("/");
    }

    protected EntityType getEntityType(final String name) {
        return (EntityType) northwind.getPackages().stream()
                .filter(p -> "entities".equals(p.getName()))
                .findFirst().get()
                .getElements().stream()
                .filter(e -> name.equals(e.getName()))
                .findFirst().get();
    }
    
    protected MappedTransferObjectType getMappedTransferObjectType(final String name) {
        return (MappedTransferObjectType) northwind.getPackages().stream()
                .filter(p -> "services".equals(p.getName()))
                .findFirst().get()
                .getElements().stream()
                .filter(e -> name.equals(e.getName()))
                .findFirst().get();
    }

}
