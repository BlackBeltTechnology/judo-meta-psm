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

import hu.blackbelt.epsilon.runtime.execution.ExecutionContext;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.exceptions.ScriptExecutionException;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import org.eclipse.epsilon.common.util.UriUtil;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Collection;

import static hu.blackbelt.epsilon.runtime.execution.ExecutionContext.executionContextBuilder;
import static hu.blackbelt.epsilon.runtime.execution.contexts.EvlExecutionContext.evlExecutionContextBuilder;
import static hu.blackbelt.epsilon.runtime.execution.model.emf.WrappedEmfModelContext.wrappedEmfModelContextBuilder;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonMap;

public class PsmEpsilonValidator {

    public static void validatePsm(Log log,
                                   PsmModel psmModel,
                                   URI scriptRoot) throws ScriptExecutionException, URISyntaxException {
        validatePsm(log, psmModel, scriptRoot, emptyList(), null);
    }

    public static void validatePsm(Log log,
                                   PsmModel psmModel,
                                   URI scriptRoot,
                                   Collection<String> expectedErrors,
                                   Collection<String> expectedWarnings) throws ScriptExecutionException, URISyntaxException {

        ExecutionContext executionContext = executionContextBuilder()
                .log(log)
                .resourceSet(psmModel.getResourceSet())
                .metaModels(emptyList())
                .modelContexts(Arrays.asList(
                        wrappedEmfModelContextBuilder()
                                .log(log)
                                .name("PSM")
                                .validateModel(false)
                                .resource(psmModel.getResource())
                                .build()))
                .injectContexts(singletonMap("psmUtils", new PsmUtils()))
                .build();

        try {
            // run the model / metadata loading
            executionContext.load();

            // Transformation script
            executionContext.executeProgram(
                    evlExecutionContextBuilder()
                            .source(UriUtil.resolve("psm.evl", scriptRoot))
                            .expectedErrors(expectedErrors)
                            .expectedWarnings(expectedWarnings)
                            .build());

        } finally {
            executionContext.commit();
            try {
                executionContext.close();
            } catch (Exception e) {
            }
        }
    }

    public static URI calculatePsmValidationScriptURI() throws URISyntaxException {
        URI psmRoot = PsmModel.class.getProtectionDomain().getCodeSource().getLocation().toURI();
        if (psmRoot.toString().endsWith(".jar")) {
            psmRoot = new URI("jar:" + psmRoot.toString() + "!/validations/");
        } else if (psmRoot.toString().startsWith("jar:bundle:")) {
            // bundle://37.0:0/validations/
            // jar:bundle://37.0:0/!/validations/psm.evl
            psmRoot = new URI(psmRoot.toString().substring(4, psmRoot.toString().indexOf("!")) + "validations/");
        } else {
            psmRoot = new URI(psmRoot.toString() + "/validations/");
        }
        return psmRoot;

    }

}
