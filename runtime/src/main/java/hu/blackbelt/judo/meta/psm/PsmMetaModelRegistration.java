package hu.blackbelt.judo.meta.psm;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import java.util.Dictionary;
import java.util.Hashtable;

import static hu.blackbelt.judo.meta.psm.PsmModelLoader.registerPsmMetamodel;

@Component(immediate = true, service = PsmMetaModel.class)
public class PsmMetaModelRegistration implements PsmMetaModel {

    ServiceRegistration<Resource.Factory> psmFactoryRegistration;
    Resource.Factory factory = PsmModelLoader.getFactory();

    @Activate
    public void activate(ComponentContext componentContext) {
        Dictionary<String, Object> params = new Hashtable<>();
        params.put("meta", "psm");
        params.put("version", componentContext.getBundleContext().getBundle().getVersion());
        params.put("bundle", componentContext.getBundleContext().getBundle());

        psmFactoryRegistration = componentContext.getBundleContext()
                .registerService(Resource.Factory.class, factory, params);
    }

    @Deactivate
    public void deactivate() {
        psmFactoryRegistration.unregister();
    }

    @Override
    public Resource.Factory getPsmFactory() {
        return factory;
    }

    @Override
    public void registerPsmMetamodelPackages(ResourceSet resourceSet) {
        registerPsmMetamodel(resourceSet);
    }
}
