package ws;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Loir_Arboni
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

     
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(ws.CcWs.class);
        resources.add(ws.UsuariosWs.class);
        resources.add(ws.VacinasWs.class);
    }
    
}
