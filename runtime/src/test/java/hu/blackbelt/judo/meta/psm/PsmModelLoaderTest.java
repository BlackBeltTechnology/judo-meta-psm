package hu.blackbelt.judo.meta.psm;

import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.runtime.PsmModelLoader;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

@Slf4j
class PsmModelLoaderTest {

    @Test
    void loadPsmModel() throws IOException {
        PsmModel psmModel = PsmModelLoader.loadPsmModel(
                URI.createURI(new File(srcDir(), "test/models/test.model").getAbsolutePath()),
                "test",
                "1.0.0");

        for (Iterator<EObject> i = psmModel.getResourceSet().getResource(psmModel.getUri(), false).getAllContents(); i.hasNext(); ) {
            log.info(i.next().toString());
        }
    }

    public File srcDir(){
        String relPath = getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
        File targetDir = new File(relPath+"../../src");
        if(!targetDir.exists()) {
            targetDir.mkdir();
        }
        return targetDir;
    }


}