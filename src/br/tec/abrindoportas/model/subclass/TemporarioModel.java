package br.tec.abrindoportas.model.subclass;

import br.tec.abrindoportas.model.ServidorPublicoModel;

public class TemporarioModel extends ServidorPublicoModel{
  
  private String contrato;
  private double salario;

  public TemporarioModel() {
    super();
  }

  public TemporarioModel(String contrato, double salario, int matricula, String name, String email) {
    super(matricula, name, salario, email);
    this.contrato = contrato;
    this.salario = salario;
  }

  public String getContrato() {
    return contrato;
  }

  public void setContrato(String contrato) {
    this.contrato = contrato;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  @Override
  public String toString() {
    return "TemporarioModel [contrato=" + contrato + ", salario=" + salario + "]";
  }
  
}
