package br.tec.abrindoportas.model;

public class Curso {
  
  private int idCurso;
  private String name;
  private String formaRealizacao;
  private String ofertante;
  private String valor;
  public Curso() {
    super();
  }
  public Curso(int idCurso, String name, String formaRealizacao, String ofertante, String valor) {
    super();
    this.idCurso = idCurso;
    this.name = name;
    this.formaRealizacao = formaRealizacao;
    this.ofertante = ofertante;
    this.valor = valor;
  }
  public int getIdCurso() {
    return idCurso;
  }
  public void setIdCurso(int idCurso) {
    this.idCurso = idCurso;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getFormaRealizacao() {
    return formaRealizacao;
  }
  public void setFormaRealizacao(String formaRealizacao) {
    this.formaRealizacao = formaRealizacao;
  }
  public String getOfertante() {
    return ofertante;
  }
  public void setOfertante(String ofertante) {
    this.ofertante = ofertante;
  }
  public String getValor() {
    return valor;
  }
  public void setValor(String valor) {
    this.valor = valor;
  }
  @Override
  public String toString() {
    return "Curso [idCurso=" + idCurso + ", name=" + name + ", formaRealizacao=" + formaRealizacao + ", ofertante="
        + ofertante + ", valor=" + valor + "]";
  }
    
}
