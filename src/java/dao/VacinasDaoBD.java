package dao;

import Entidade.Vacinas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Loir_Arboni
 */
public class VacinasDaoBD implements VacinasDao {

  Vacinas v = new Vacinas();

  @Override
  public void inserir(Vacinas v) {
    try {
      Connection conexao = ConnectionFactory.getConnection();

      String sql = "INSERT INTO vacinaweb\"(idVacinas, qtdDoses, nome, doenca, grupo, obrigadtoria, duracao, reacao) VALUES (?,?,?,?,?,?,?,?)";

      PreparedStatement comando = conexao.prepareStatement(sql);

      comando.setInt(1, v.getIdVacinas());
      comando.setInt(2, v.getQtdDoses());
      comando.setString(3, v.getNome());
      comando.setString(4, v.getDoenca());
      comando.setString(5, v.getGrupo());
      comando.setString(6, v.getObrigatoria());
      comando.setString(7, v.getDuracao());
      comando.setString(8, v.getReacao());

      comando.executeUpdate();

      comando.close();
      conexao.close();

    } catch (SQLException ex) {
      Logger.getLogger(VacinasDaoBD.class.getName()).log(Level.SEVERE, null, ex);
    }

  }

  @Override
  public void deletar(Vacinas v) {

    try {
      Connection conexao = ConnectionFactory.getConnection();

      String sql = "DELETE FROM vacinas\"WHERE nome=?";

      PreparedStatement comando = conexao.prepareStatement(sql);
      comando.setString(1, v.getNome());

      comando.executeUpdate();

      comando.close();
      conexao.close();

    } catch (SQLException ex) {
      Logger.getLogger(VacinasDaoBD.class.getName()).log(Level.SEVERE, null, ex);
    }
  }

  @Override
  public void atualizar() {
    Vacinas v = new Vacinas();
    try {
      Connection conexao = ConnectionFactory.getConnection();

      String sql = "UPDATE idVacinas, qtdDoses, nome, doenca, grupo, obrigadtoria, duracao, reacao from vacinaweb\"SET idVacinas, nome, duracao, doenca, obrigatoria, grupo,qtdDoses,reacao,) VALUES (?,?,?,?,?,?,?,?,) where nome=?";

      PreparedStatement comando = conexao.prepareStatement(sql);

      comando.setInt(1, v.getIdVacinas());
      comando.setString(2, v.getNome());
      comando.setString(3, v.getDuracao());
      comando.setString(4, v.getDoenca());
      comando.setString(5, v.getObrigatoria());
      comando.setString(6, v.getGrupo());
      comando.setInt(7, v.getQtdDoses());
      comando.setString(8, v.getReacao());

      comando.executeUpdate();

      comando.close();
      conexao.close();

    } catch (SQLException ex) {
      Logger.getLogger(VacinasDaoBD.class.getName()).log(Level.SEVERE, null, ex);
    }

  }

  @Override
  public List<Vacinas> listar() {
    try {
      Connection conexao = ConnectionFactory.getConnection();

      String sql = "SELECT * FROM vacinaweb.vacinas;";

      List<Vacinas> listaVacinas = new ArrayList<>();

      PreparedStatement comando = conexao.prepareStatement(sql);
      ResultSet resultado = comando.executeQuery();
      while (resultado.next()) {
        comando.setInt(1, v.getIdVacinas());
        comando.setString(2, v.getNome());
        comando.setString(3, v.getDuracao());
        comando.setString(4, v.getDoenca());
        comando.setString(5, v.getObrigatoria());
        comando.setString(6, v.getGrupo());
        comando.setInt(7, v.getQtdDoses());
        comando.setString(8, v.getReacao());
        Vacinas v = new Vacinas ();
        listaVacinas.add(v);

      }
      
      comando.close();
      conexao.close();

      return listaVacinas;

    } catch (SQLException ex) {
      Logger.getLogger(VacinasDaoBD.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }

  @Override
  public Vacinas buscarPorNome(String nome) {
    try {
      Connection conexao = ConnectionFactory.getConnection();

      //Passo 3 e 4: Comando
      String sql = "SELECT * FROM vacinaweb\" WHERE nome=?";

      Vacinas v = null;

      PreparedStatement comando = conexao.prepareStatement(sql);
      comando.setString(2, nome);

      ResultSet resultado = comando.executeQuery();
      if (resultado.next()) {
        comando.setInt(1, v.getIdVacinas());
        comando.setString(2, v.getNome());
        comando.setString(3, v.getDuracao());
        comando.setString(4, v.getDoenca());
        comando.setString(5, v.getObrigatoria());
        comando.setString(6, v.getGrupo());
        comando.setInt(7, v.getQtdDoses());
        comando.setString(8, v.getReacao());

        v = new Vacinas();
      }

      //Passo 5: fechar conexao
      comando.close();
      conexao.close();

      return v;

    } catch (SQLException ex) {
      Logger.getLogger(VacinasDaoBD.class.getName()).log(Level.SEVERE, null, ex);
    }
    return null;
  }

}
