package hu.blackbelt.judo.meta.psm.runtime;

import com.google.common.collect.ImmutableList;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.support.PsmModelResourceSupport;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static hu.blackbelt.judo.meta.psm.support.PsmModelResourceSupport.psmModelResourceSupportBuilder;
import static hu.blackbelt.judo.meta.psm.util.builder.PsmBuilders.*;

class ExecutionContextTest {

    @Test
    @DisplayName("Create Psm model with builder pattern")
    void testPsmReflectiveCreated() throws Exception {


        String createdSourceModelName = "urn:psm.judo-meta-psm";

        PsmModelResourceSupport psmModelSupport = psmModelResourceSupportBuilder().build();
        Resource psmResource = psmModelSupport.getResourceSet().createResource(
                URI.createFileURI(createdSourceModelName));

        // Build model here
    }
}