package dao;

import Entidade.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Loir.Arboni
 */
public class UsuariosDaoBD implements UsuariosDao {

    @Override
    public void inserir(Usuarios u) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void deletar(Usuarios u) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void atualizar(Usuarios u) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List<Usuarios> listar() {
        try {
            Connection conexao = ConnectionFactory.getConnection();

            String sql = "SELECT nome FROM vacinaweb.vacinas;";

            List<Usuarios> listaU = new ArrayList<>();

            PreparedStatement comando = conexao.prepareStatement(sql);
            ResultSet resultado = comando.executeQuery();
            while (resultado.next()) {
                int cpf = resultado.getInt("cpf");
                String nome = resultado.getString("nome");
                String apelido = resultado.getString("apelido");
                String rua = resultado.getString("rua");
                String bairro = resultado.getString("bairro");
                String cidade = resultado.getString("cidade");
                String estado =  resultado.getString("estado");
                String nomeMae = resultado.getString("nomeMae");
                String portDef = resultado.getString("portDef");
                String tipoDef = resultado.getString("tipoDef");
                String obs = resultado.getString("obs");
                String statusImunizacao = resultado.getString("statusImunizacao");
                String infoAdicionais = resultado.getString("infoAdicionais");
                Date dtNasc = resultado.getDate("dtNasc");
                int idade = resultado.getInt("idade");
                int numRua = resultado.getInt("numRua");
                int cep = resultado.getInt("cep");
                int foneRes = resultado.getInt("foneRes");
                int foneCel = resultado.getInt("foneCel");

                Usuarios u = new Usuarios( cpf, nome,apelido,rua,bairro,cidade,estado,nomeMae,portDef,tipoDef,obs,statusImunizacao,infoAdicionais,dtNasc,idade,numRua,cep,foneRes,foneCel);
                listaU.add(u);

            }
            comando.close();
            conexao.close();
            System.out.println("nome "+listaU.get(1).getNome());

            return listaU;

        } catch (SQLException ex) {
            Logger.getLogger(UsuariosDaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    
    
}
