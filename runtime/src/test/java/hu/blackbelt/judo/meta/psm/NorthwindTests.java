package hu.blackbelt.judo.meta.psm;

import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.runtime.PsmModelLoader;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.junit.After;
import org.junit.Before;

import java.io.File;

abstract class NorthwindTests {

    protected ResourceSet resourceSet;
    protected Model northwind;

    @Before
    public void setUp() throws Exception {
        resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new EcoreResourceFactoryImpl());

        PsmModelLoader.loadPsmModel(resourceSet,
                URI.createURI(new File(srcDir(), "test/models/northwind-judopsm.model").getAbsolutePath()),
                "test",
                "1.0.0");

        northwind = (Model) resourceSet.getResources().get(0).getEObject("/");
    }

    @After
    public void tearDown() {
        resourceSet = null;
        northwind = null;
    }

    protected EntityType getEntityType(final String name) {
        return (EntityType) northwind.getPackages().stream()
                .filter(p -> "entities".equals(p.getName()))
                .findFirst().get()
                .getElements().stream()
                .filter(e -> name.equals(e.getName()))
                .findFirst().get();
    }

    private File srcDir() {
        final String relPath = getClass().getProtectionDomain().getCodeSource().getLocation().getFile();
        final File targetDir = new File(relPath + "../../src");
        if (!targetDir.exists()) {
            targetDir.mkdir();
        }
        return targetDir;
    }
}
