package br.tec.abrindoportas.model;

public class ServidorPublico {

  private int matricula;
  private String name;
  private String foto;
  private String orgao;
  private String vinculo;
  private double salario;
  private int idade;
  private int tempoContribuicao;
  private String cargo;
  private String lotacao;
  private String exercicio;
  private String email;
  private String telefone;
  private String celular;
  private String cpf;
  private String naturalidade;

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFoto() {
    return foto;
  }

  public void setFoto(String foto) {
    this.foto = foto;
  }

  public String getOrgao() {
    return orgao;
  }

  public void setOrgao(String orgao) {
    this.orgao = orgao;
  }

  public String getVinculo() {
    return vinculo;
  }

  public void setVinculo(String vinculo) {
    this.vinculo = vinculo;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getTempoContribuicao() {
    return tempoContribuicao;
  }

  public void setTempoContribuicao(int tempoContribuicao) {
    this.tempoContribuicao = tempoContribuicao;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public String getLotacao() {
    return lotacao;
  }

  public void setLotacao(String lotacao) {
    this.lotacao = lotacao;
  }

  public String getExercicio() {
    return exercicio;
  }

  public void setExercicio(String exercicio) {
    this.exercicio = exercicio;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getCelular() {
    return celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNaturalidade() {
    return naturalidade;
  }

  public void setNaturalidade(String naturalidade) {
    this.naturalidade = naturalidade;
  }

  public void imprimeDados(){
    System.out.println(this.matricula);
  }

  public double calcularSalarioHorasExras(int... horasTrabalhadas){
    
    double salarioMensal = 0;
    for(int horasExtras : horasTrabalhadas){
      salarioMensal = salarioMensal + horasExtras * 45;
    }
    return (salario + salarioMensal);
  }
}
