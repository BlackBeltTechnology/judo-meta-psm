package hu.blackbelt.judo.meta.psm.generator.maven.plugin;

/*-
 * #%L
 * Judo :: PSM :: Model :: Generator :: Maven :: Plugin
 * %%
 * Copyright (C) 2018 - 2023 BlackBelt Technology
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

import hu.blackbelt.judo.meta.psm.generator.engine.PsmGenerator;
import hu.blackbelt.judo.meta.psm.generator.engine.PsmGeneratorParameter;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.ResolutionScope;


@Mojo(name = "resetChecksum",
        defaultPhase = LifecyclePhase.CLEAN,
        requiresDependencyResolution = ResolutionScope.COMPILE,
        threadSafe = true)
public class PsmProjectResetChecksumMojo extends AbstractPsmProjectMojo {


    @Override
    public void performExecutionOnPsmParameters(PsmGeneratorParameter.PsmGeneratorParameterBuilder parameter) throws Exception {
        PsmGenerator.resetChecksumsInDirectory(parameter);
    }

}
