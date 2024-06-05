package br.tec.abrindoportas.model;

import java.util.LinkedList;
import java.util.List;

public class CursoModel {
  
  private int idCurso;
  private String name;
  private String formaRealizacao;
  private String ofertante;
  private double valor;
  
  public CursoModel() {
    super();
  }
  public CursoModel(int idCurso, String name, String formaRealizacao, String ofertante, double valor) {
    super();
    this.idCurso = idCurso;
    this.name = name;
    this.formaRealizacao = formaRealizacao;
    this.ofertante = ofertante;
    this.valor = valor;
  }

  private List<ServidorPublicoModel> servidorPublicoModels = new LinkedList<ServidorPublicoModel>();

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
  public double getValor() {
    return valor;
  }
  public void setValor(double valor) {
    this.valor = valor;
  }

  public void getServidorPublicoModels() {
    System.out.println(servidorPublicoModels);
  }
  public void setServidorPublicoModels(ServidorPublicoModel servidorPublicoModel) {
    servidorPublicoModels.add(servidorPublicoModel);
  }
  
  @Override
  public String toString() {
    return "Curso [idCurso=" + idCurso + ", name=" + name + ", formaRealizacao=" + formaRealizacao + ", ofertante="
        + ofertante + ", valor=" + valor + "]";
  }
    
}
