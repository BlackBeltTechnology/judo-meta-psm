package hu.blackbelt.judo.meta.psm;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

public interface PsmMetaModel {

    Resource.Factory getFactory();

    void registerPsmMetamodel(ResourceSet resourceSet);
}
