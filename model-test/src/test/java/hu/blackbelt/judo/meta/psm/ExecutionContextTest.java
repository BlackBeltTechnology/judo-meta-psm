package hu.blackbelt.judo.meta.psm;

import com.google.common.collect.ImmutableList;
import hu.blackbelt.epsilon.runtime.execution.ExecutionContext;
import hu.blackbelt.epsilon.runtime.execution.api.Log;
import hu.blackbelt.epsilon.runtime.execution.impl.Slf4jLog;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.type.Primitive;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.*;
import org.junit.jupiter.api.Test;
import hu.blackbelt.judo.meta.psm.support.PsmModelResourceSupport;

import java.io.File;
import static hu.blackbelt.epsilon.runtime.execution.ExecutionContext.executionContextBuilder;
import static hu.blackbelt.epsilon.runtime.execution.contexts.EvlExecutionContext.evlExecutionContextBuilder;
import static hu.blackbelt.epsilon.runtime.execution.model.emf.WrappedEmfModelContext.wrappedEmfModelContextBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newAttributeBuilder;
import static hu.blackbelt.judo.meta.psm.data.util.builder.DataBuilders.newEntityTypeBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newModelBuilder;
import static hu.blackbelt.judo.meta.psm.namespace.util.builder.NamespaceBuilders.newPackageBuilder;
import static hu.blackbelt.judo.meta.psm.type.util.builder.TypeBuilders.newStringTypeBuilder;

class ExecutionContextTest {

    @Test
    void testReflectiveCreated() throws Exception {


        String createdSourceModelName = "urn:psm.judo-meta-psm";

        ResourceSet executionResourceSet = PsmModelResourceSupport.createPsmResourceSet();
        Resource psmResource = executionResourceSet.createResource(
                URI.createURI(createdSourceModelName));

        Log log = new Slf4jLog();

        Primitive stringType = newStringTypeBuilder()
                .withName("String")
                .withMaxLength(20)
                .build();

        Model model = newModelBuilder()
                .withName("model")
                .withPackages(
                        newPackageBuilder()
                                .withName("test")
                                .withElements(ImmutableList.of(
                                        newEntityTypeBuilder()
                                                .withName("entity1")
                                                .withAttributes(newAttributeBuilder()
                                                        .withName("attt1")
                                                        .withDataType(stringType)
                                                        .build()
                                                )
                                        .build()
                                ))
                        .build()
                )
                .build();

        psmResource.getContents().add(model);

        // Executrion context
        ExecutionContext executionContext = executionContextBuilder()
                .log(log)
                .resourceSet(executionResourceSet)
                .metaModels(ImmutableList.of())
                .modelContexts(ImmutableList.of(
                        wrappedEmfModelContextBuilder()
                                .log(log)
                                .name("JUDOPSM")
                                .resource(psmResource)
                                .build()))
                .sourceDirectory(scriptDir())
                .build();

        // run the model / metadata loading
        executionContext.load();

        // Transformation script
        executionContext.executeProgram(
                evlExecutionContextBuilder()
                        .source("epsilon/validations/judopsm.evl")
                        .build());



        executionContext.commit();
        executionContext.close();

    }

    public File scriptDir(){
        String relPath = getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
        File targetDir = new File(relPath+"../../../model/src/main");
        return targetDir;
    }

}