package hu.blackbelt.judo.meta.psm;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;
import org.osgi.framework.Version;
import org.osgi.framework.VersionRange;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class PsmModelLoaderTest {

    @Test
    void loadPsmModel() throws IOException {
        PsmModel psmModel = PsmModelLoader.loadPsmModel(
                URI.createURI(new File(srcDir(), "test/models/test.model").getAbsolutePath()),
                "test",
                "1.0.0");

        for (Iterator<EObject> i = psmModel.getResource().getAllContents(); i.hasNext(); ) {
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