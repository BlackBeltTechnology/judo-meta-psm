package hu.blackbelt.judo.meta.psm.validation;

/*-
 * #%L
 * Judo :: Psm :: Model
 * %%
 * Copyright (C) 2018 - 2024 BlackBelt Technology
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

import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.zeta.common.ModelProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Model provider for PSM validation that provides access to all model elements.
 */
public class PsmModelProvider implements ModelProvider {

    private final PsmModel psmModel;

    public PsmModelProvider(PsmModel psmModel) {
        this.psmModel = psmModel;
    }

    @Override
    public <T extends EObject> Collection<T> getAllContents(ResourceSet resourceSet, Class<T> type) {
        Collection<T> result = new ArrayList<>();
        resourceSet.getAllContents().forEachRemaining(obj -> {
            if (type.isInstance(obj)) {
                result.add(type.cast(obj));
            }
        });
        return result;
    }

    public PsmModel getPsmModel() {
        return psmModel;
    }

    public ResourceSet getResourceSet() {
        return psmModel.getResourceSet();
    }
}
