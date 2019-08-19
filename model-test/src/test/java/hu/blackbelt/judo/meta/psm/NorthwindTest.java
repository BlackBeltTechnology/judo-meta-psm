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

import com.google.common.collect.ImmutableSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;

abstract class NorthwindTest {

    protected ResourceSet resourceSet;
    protected Model northwind;

    @BeforeEach
    public void setUp() throws Exception {
    	resourceSet = PsmModelResourceSupport.createPsmResourceSet();

        PsmModel psmModel = PsmModel.loadPsmModel(LoadArguments.psmLoadArgumentsBuilder()
                .resourceSet(resourceSet)
                .uri(URI.createFileURI(new File("src/test/model/northwind-judopsm.model").getAbsolutePath()))
                .tags(ImmutableSet.of("test"))
                .name("test"));
        
        assertEquals(ImmutableSet.of("test"), psmModel.getTags());
    
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
