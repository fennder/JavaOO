package br.tec.abrindoportas.model.subclass;

import br.tec.abrindoportas.model.ServidorPublicoModel;

public class ComissionadoModel extends ServidorPublicoModel {
  
  private double comissao;
  private double salarioFixo;
  
  public ComissionadoModel() {
    super();
  }

  public ComissionadoModel(double comissao, double salarioFixo) {
    super();
    this.comissao = comissao;
    this.salarioFixo = salarioFixo;
  }

  public double getComissao() {
    return comissao;
  }

  public void setComissao(double comissao) {
    this.comissao = comissao;
  }

  public double getSalarioFixo() {
    return salarioFixo;
  }

  public void setSalarioFixo(double salarioFixo) {
    this.salarioFixo = salarioFixo;
  }

  @Override
  public String toString() {
    return "ComissionadoModel [comissao=" + comissao + ", salarioFixo=" + salarioFixo + "]";
  }
  
}
