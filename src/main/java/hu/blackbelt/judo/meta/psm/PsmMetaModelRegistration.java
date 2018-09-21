package hu.blackbelt.judo.meta.psm;

import hu.blackbelt.judo.meta.psm.util.PsmResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import java.util.Dictionary;
import java.util.Hashtable;

@Component(immediate = true)
public class PsmMetaModelRegistration {

    ServiceRegistration<Resource.Factory> psmFactoryRegistration;

    @Activate
    public void activate(ComponentContext componentContext) {
        Dictionary<String, Object> params = new Hashtable<>();
        params.put("meta", "psm");
        params.put("version", componentContext.getBundleContext().getBundle().getVersion());

        psmFactoryRegistration = componentContext.getBundleContext()
                .registerService(Resource.Factory.class, new PsmResourceFactoryImpl(), params);
    }

    @Deactivate
    public void deactivate() {
        psmFactoryRegistration.unregister();
    }
}
