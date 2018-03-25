package dao;

import Entidade.Usuarios;
import java.util.List;

/**
 *
 * @author Loir.Arboni
 */
public interface UsuariosDao {

    public void inserir(Usuarios c);

    public void deletar(Usuarios c);

    public void atualizar(Usuarios c);

    public List<Usuarios> listar();

   

   

}
