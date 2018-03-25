package ws;

import Entidade.Vacinas;
import Entidade.Usuarios;
import dao.VacinasDaoBD;
import dao.UsuariosDao;
import dao.UsuariosDaoBD;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import dao.VacinasDao;

/**
 *
 * @author Loir_Arboni
 */
@Path("Usuario")
public class UsuariosWs {

    @Context
    private UriInfo context;

    public UsuariosWs() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuarios> getUsuario() {
        UsuariosDao dao = new UsuariosDaoBD();
        return dao.listar();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void inserir(Usuarios u) {
        System.out.println("Executado com sucesso!");
        UsuariosDao dao = new UsuariosDaoBD();
        dao.inserir(u);

    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void atualizar(Usuarios u) {
        System.out.println("Executado com sucesso!");
        UsuariosDao dao = new UsuariosDaoBD();
        dao.atualizar(u);
    }
}
