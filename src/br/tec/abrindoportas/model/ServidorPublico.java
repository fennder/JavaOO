package br.tec.abrindoportas.model;

import br.tec.abrindoportas.controller.Avaliacao;

public class ServidorPublico {

  private final int VALOR_HORA_EXTRA = 45;
  private static int totalServidores;
  private Avaliacao avaliacao;

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

  public ServidorPublico() {
    super();
  }

  public ServidorPublico(int matricula, String name, String foto, String orgao, String vinculo, double salario,
      int idade, int tempoContribuicao, String cargo, String lotacao, String exercicio, String email, String telefone,
      String celular, String cpf, String naturalidade) {
    this.matricula = matricula;
    this.name = name;
    this.foto = foto;
    this.orgao = orgao;
    this.vinculo = vinculo;
    this.salario = salario;
    this.idade = idade;
    this.tempoContribuicao = tempoContribuicao;
    this.cargo = cargo;
    this.lotacao = lotacao;
    this.exercicio = exercicio;
    this.email = email;
    this.telefone = telefone;
    this.celular = celular;
    this.cpf = cpf;
    this.naturalidade = naturalidade;
  }



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

  
  public Avaliacao getAvaliacao() {
    return avaliacao;
  }

  public void setAvaliacao(Avaliacao avaliacao) {
    this.avaliacao = avaliacao;
  }

  public double calcularSalarioHorasExras(int... horasTrabalhadas){
    
    double salarioMensal = 0;
    for(int horasExtras : horasTrabalhadas){
      salarioMensal = salarioMensal + horasExtras * VALOR_HORA_EXTRA;
    }
    return (salario + salarioMensal);
  }

  public static int getTotalServidores() {
    return ++totalServidores;
  }

  public int tamanhoNome(){
    return this.name.length();
    // return this.name.substring(0, name.indexOf(" ")).length();
  }

  public void mostrarPreNome(){
    System.out.println(this.name.substring(0, name.indexOf(" ")));
  }
  public void mostrarSobreNome(){
    System.out.println(this.name.substring(name.indexOf(" ")+1));
  }

  @Override
  public String toString() {
    return "ServidorPublico [VALOR_HORA_EXTRA=" + VALOR_HORA_EXTRA + ", avaliacao=" + avaliacao + ", matricula="
        + matricula + ", name=" + name + ", foto=" + foto + ", orgao=" + orgao + ", vinculo=" + vinculo + ", salario="
        + salario + ", idade=" + idade + ", tempoContribuicao=" + tempoContribuicao + ", cargo=" + cargo + ", lotacao="
        + lotacao + ", exercicio=" + exercicio + ", email=" + email + ", telefone=" + telefone + ", celular=" + celular
        + ", cpf=" + cpf + ", naturalidade=" + naturalidade + "]";
  }

}
