package br.tec.abrindoportas.model;

import java.util.LinkedList;
import java.util.List;

import atividades.Avaliacao;

public class ServidorPublicoModel {

   private Avaliacao avaliacao;

  protected int matricula;
  protected String name;
  private double salario;
  private String email;

  // REuso - Associação
  private List<CursoModel> cursos = new LinkedList<CursoModel>();

  //Reuso - Agregação
  private List<DependenteModel> dependentes = new LinkedList<DependenteModel>();

  //REuso - Composição
  private List<TelefoneModel> telefones = new LinkedList<TelefoneModel>();

  public ServidorPublicoModel() {
    super();
  }

  public ServidorPublicoModel(int matricula, String name, double salario,
      String email) {
    this.matricula = matricula;
    this.name = name;
    this.salario = salario;
    this.email = email;
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

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
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

  
  // public double calcularSalarioHorasExras(int... horasTrabalhadas){
    
  //   double salarioMensal = 0;
  //   for(int horasExtras : horasTrabalhadas){
  //     salarioMensal = salarioMensal + horasExtras * VALOR_HORA_EXTRA;
  //   }
  //   return (salario + salarioMensal);
  // }

  // public static int getTotalServidores() {
  //   return ++totalServidores;
  // }

  public void getCursos() {
    for (CursoModel cursoModel : cursos) 
      System.out.println(cursos);
  }

  public void setCursos(CursoModel curso) {
    this.cursos.add(curso);
  }

  public List<DependenteModel> getDependentes() {
    return dependentes;
  }

  public void setDependentes(DependenteModel dependente) {
    this.dependentes.add(dependente);
  }

  public void getTelefones() {
    for (TelefoneModel telefoneModel : telefones) {
      System.out.println(telefones);
    }
  }

  public void setTelefones(TelefoneModel telefone) {
    this.telefones.add(telefone);
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
    return "ServidorPublico [avaliacao=" + avaliacao + ", matricula=" + matricula 
    + ", name=" + name + ", salario=" + salario + ", email=" + email 
    + "]";
  }

}
