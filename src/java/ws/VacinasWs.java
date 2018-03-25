package ws;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;
import Entidade.Vacinas;
import dao.VacinasDaoBD;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PathParam;
import dao.VacinasDao;

/**
 *
 * @author Loir_Arboni
 */
@Path("vacinas")
public class VacinasWs {

    @Context
    private UriInfo context;

    public VacinasWs() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Vacinas> getEquipamento() {
        VacinasDao dao = new VacinasDaoBD();
        return dao.listar();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void inserir(Vacinas v) {
        System.out.println("Executado com sucesso!");
        VacinasDao dao = new VacinasDaoBD();
        dao.inserir(v);

    }

    @PUT
    @Path("/{UPDATE}")
    public void atualizar(@PathParam("nome") String nome) {
        VacinasDaoBD dao = new VacinasDaoBD();
        dao.atualizar();
        
    }

    @DELETE
    @Path("{nome}")
    public Vacinas removerEquip(@PathParam("nome") String nome) {
        VacinasDaoBD vac = new VacinasDaoBD();
        Vacinas v = vac.buscarPorNome(nome);
        vac.deletar(v);
        return v;

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{buscaTag}")
    public Vacinas buscarPorTag(@PathParam("nome") String nome) {
        VacinasDaoBD dao = new VacinasDaoBD();
        return dao.buscarPorNome(nome);
    }

}
