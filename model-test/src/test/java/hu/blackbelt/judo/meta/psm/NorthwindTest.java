package hu.blackbelt.judo.meta.psm;

import hu.blackbelt.judo.meta.psm.data.EntityType;
import hu.blackbelt.judo.meta.psm.namespace.Model;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel;
import hu.blackbelt.judo.meta.psm.runtime.PsmModel.LoadArguments;
import hu.blackbelt.judo.meta.psm.support.PsmModelResourceSupport;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;
import java.util.Optional;

abstract class NorthwindTest {

    protected ResourceSet resourceSet;
    protected Model northwind;

    @BeforeEach
    public void setUp() throws Exception {
    	resourceSet = PsmModelResourceSupport.createPsmResourceSet();

        PsmModel psmModel = PsmModel.loadPsmModel(LoadArguments.psmLoadArgumentsBuilder()
                .resourceSet(resourceSet)
                .uri(URI.createFileURI(new File("src/test/model/northwind-judopsm.model").getAbsolutePath()))
                .name("test"));
    
        northwind = (Model) resourceSet.getResources().get(0).getEObject("/");
    }

    @AfterEach
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

}
