package Entidade;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author Loir.Arboni
 */
@XmlRootElement
public class Vacinas implements Serializable {

  private int idVacinas, qtdDoses;
  private String nome, duracao, doenca, obrigatoria, grupo, reacao;

  public Vacinas() {
  }

  public Vacinas(int idVacinas, int qtdDoses, String nome, String duracao, String doenca, String obrigatoria, String grupo, String reacao) {
    this.idVacinas = idVacinas;
    this.qtdDoses = qtdDoses;
    this.nome = nome;
    this.duracao = duracao;
    this.doenca = doenca;
    this.obrigatoria = obrigatoria;
    this.grupo = grupo;
    this.reacao = reacao;
  }

  public int getIdVacinas() {
    return idVacinas;
  }

  public void setIdVacinas(int idVacinas) {
    this.idVacinas = idVacinas;
  }

  public int getQtdDoses() {
    return qtdDoses;
  }

  public void setQtdDoses(int qtdDoses) {
    this.qtdDoses = qtdDoses;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDuracao() {
    return duracao;
  }

  public void setDuracao(String duracao) {
    this.duracao = duracao;
  }

  public String getDoenca() {
    return doenca;
  }

  public void setDoenca(String doenca) {
    this.doenca = doenca;
  }

  public String getObrigatoria() {
    return obrigatoria;
  }

  public void setObrigatoria(String obrigatoria) {
    this.obrigatoria = obrigatoria;
  }

  public String getGrupo() {
    return grupo;
  }

  public void setGrupo(String grupo) {
    this.grupo = grupo;
  }

  public String getReacao() {
    return reacao;
  }

  public void setReacao(String reacao) {
    this.reacao = reacao;
  }

}
