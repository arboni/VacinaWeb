/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @author Loir.Arboni
 */
public class Usuarios implements Serializable {
    private int cpf;
    private String nome,apelido,rua,bairro,cidade,estado,nomeMae,portDef,tipoDef,obs,statusImunizacao,infoAdicionais;
    private Date dtNasc;
    private int idade,numRua,cep,foneRes,foneCel;

  public Usuarios(int codigo, String nome, String apelido, String rua, String bairro, String cidade, String estado, String nomeMae, String portDef, String tipoDef, String obs, String statusImunizacao, String infoAdicionais, Date dtNasc, int idade, int numRua, int cep, int foneRes, int foneCel) {
    this.cpf = cpf;
    this.nome = nome;
    this.apelido = apelido;
    this.rua = rua;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
    this.nomeMae = nomeMae;
    this.portDef = portDef;
    this.tipoDef = tipoDef;
    this.obs = obs;
    this.statusImunizacao = statusImunizacao;
    this.infoAdicionais = infoAdicionais;
    this.dtNasc = dtNasc;
    this.idade = idade;
    this.numRua = numRua;
    this.cep = cep;
    this.foneRes = foneRes;
    this.foneCel = foneCel;
  }

  public Usuarios() {
  }

  public int getCpf() {
    return cpf;
  }

  public void setCodigo(int cpf) {
    this.cpf = cpf;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getApelido() {
    return apelido;
  }

  public void setApelido(String apelido) {
    this.apelido = apelido;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public String getNomeMae() {
    return nomeMae;
  }

  public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
  }

  public String getPortDef() {
    return portDef;
  }

  public void setPortDef(String portDef) {
    this.portDef = portDef;
  }

  public String getTipoDef() {
    return tipoDef;
  }

  public void setTipoDef(String tipoDef) {
    this.tipoDef = tipoDef;
  }

  public String getObs() {
    return obs;
  }

  public void setObs(String obs) {
    this.obs = obs;
  }

  public String getStatusImunizacao() {
    return statusImunizacao;
  }

  public void setStatusImunizacao(String statusImunizacao) {
    this.statusImunizacao = statusImunizacao;
  }

  public String getInfoAdicionais() {
    return infoAdicionais;
  }

  public void setInfoAdicionais(String infoAdicionais) {
    this.infoAdicionais = infoAdicionais;
  }

  public Date getDtNasc() {
    return dtNasc;
  }

  public void setDtNasc(Date dtNasc) {
    this.dtNasc = dtNasc;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getNumRua() {
    return numRua;
  }

  public void setNumRua(int numRua) {
    this.numRua = numRua;
  }

  public int getCep() {
    return cep;
  }

  public void setCep(int cep) {
    this.cep = cep;
  }

  public int getFoneRes() {
    return foneRes;
  }

  public void setFoneRes(int foneRes) {
    this.foneRes = foneRes;
  }

  public int getFoneCel() {
    return foneCel;
  }

  public void setFoneCel(int foneCel) {
    this.foneCel = foneCel;
  }
    
    
    
}
