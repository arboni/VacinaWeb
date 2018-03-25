package ws;

import Entidade.Usuarios;
import dao.UsuariosDaoBD;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import dao.UsuariosDao;

/**
 *
 * @author Loir_Arboni
 */
@Path("CcWs")
public class CcWs {
   

    @Context
    private UriInfo context;

    public CcWs() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuarios> getCc() {
        UsuariosDao dao = new UsuariosDaoBD();
        System.out.println("Teste");
        return dao.listar();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void inserir(Usuarios c) {
        System.out.println("Executado com sucesso!");
        UsuariosDao dao = new UsuariosDaoBD();
        dao.inserir(c);

    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void atualizar(Usuarios c) {
        System.out.println("Executado com sucesso!");
        UsuariosDao dao = new UsuariosDaoBD();
        dao.atualizar(c);
    }
}
