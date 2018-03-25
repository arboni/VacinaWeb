package dao;

import Entidade.Vacinas;
import java.util.List;

/**
 *
 * @author Loir_Arboni
 */
public interface VacinasDao {

    public void inserir(Vacinas v);
    public void deletar(Vacinas v);
    public void atualizar();
    public List<Vacinas> listar();
    public Vacinas buscarPorNome(String nome);
    
    
    
}


