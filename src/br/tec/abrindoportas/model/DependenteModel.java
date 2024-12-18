package br.tec.abrindoportas.model;

public class DependenteModel {
  
  private String nome;
  private String cpf;
  private String genero;
  private int idade;

  public DependenteModel() {
    super();
  }

  public DependenteModel(String nome, String cpf, String genero, int idade) {
    super();
    this.nome = nome;
    this.cpf = cpf;
    this.genero = genero;
    this.idade = idade;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getCpf() {
    return cpf;
  }
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public String getGenero() {
    return genero;
  }
  public void setGenero(String genero) {
    this.genero = genero;
  }
  public int getIdade() {
    return idade;
  }
  public void setIdade(int idade) {
    this.idade = idade;
  }
  @Override
  public String toString() {
    return "DependenteModel [nome=" + nome + ", cpf=" + cpf + ", genero=" + genero + ", idade=" + idade + "]";
  }

}
