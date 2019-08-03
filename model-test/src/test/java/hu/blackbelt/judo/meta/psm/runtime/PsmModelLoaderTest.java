package hu.blackbelt.judo.meta.psm.runtime;

import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.support.PsmModelResourceSupport;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Optional;

import static hu.blackbelt.judo.meta.psm.runtime.PsmModel.LoadArguments.psmLoadArgumentsBuilder;

public class PsmModelLoaderTest {

    static Logger log = LoggerFactory.getLogger(PsmModelLoaderTest.class);
	
    @Test
    @DisplayName("Load Psm Model")
    void loadPsmModel() throws IOException {
        ResourceSet psmResourceSet = PsmModelResourceSupport.createPsmResourceSet();

        PsmModel psmModel = PsmModel.loadPsmModel(psmLoadArgumentsBuilder()
                .resourceSet(psmResourceSet)
                .uri(URI.createFileURI(new File("src/test/model/test.psm").getAbsolutePath()))
                .name("test"));

        for (Iterator<EObject> i = psmModel.getResourceSet().getResource(psmModel.getUri(), false).getAllContents(); i.hasNext(); ) {
            log.info(i.next().toString());
        }
    }
}