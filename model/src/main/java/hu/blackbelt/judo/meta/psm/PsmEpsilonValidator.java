package hu.blackbelt.judo.meta.psm;

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
        validatePsm(log, psmModel, scriptRoot, emptyList(), emptyList());
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

    public static URI getValidationScriptURI() throws URISyntaxException {
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
