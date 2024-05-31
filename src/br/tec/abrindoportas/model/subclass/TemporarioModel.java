package br.tec.abrindoportas.model.subclass;

import br.tec.abrindoportas.model.ServidorPublicoModel;

public class TemporarioModel extends ServidorPublicoModel{
  
  private static final int VALOR_HORA_EXTRA = 35;
  private String contrato;
  private double salario;

  public TemporarioModel() {
    super();
  }

  public TemporarioModel(String contrato, double salario, int matricula, String name, String cargo, String email) {
    super(matricula, name, cargo, salario, email);
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
  public double calcularSalarioHorasExras(int horasTrabalhadas){
    
    double salarioMensal = 0;
    
      salarioMensal = salarioMensal + horasTrabalhadas * VALOR_HORA_EXTRA;
    
    return (salario + salarioMensal);
  }
}
