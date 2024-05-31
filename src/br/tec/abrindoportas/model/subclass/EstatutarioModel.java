package br.tec.abrindoportas.model.subclass;

import br.tec.abrindoportas.model.ServidorPublicoModel;

public class EstatutarioModel extends ServidorPublicoModel{

  private int tempoServico;
  private double salarioBase;

  public EstatutarioModel(){
    super();
  }

  public EstatutarioModel(int tempoServico, double salarioBase, int matricula, String name, String cargo, double salario,
  String email) {
    super(matricula, name, cargo, salario, email);
    this.tempoServico = tempoServico;
    this.salarioBase = salarioBase;
  }

  public int getTempoServico() {
    return tempoServico;
  }

  public void setTempoServico(int tempoServico) {
    this.tempoServico = tempoServico;
  }

  public double getSalarioBase() {
    return salarioBase;
  }

  public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
  }

  @Override
  public String toString() {
    return "EstatutarioModel [tempoServico=" + tempoServico + ", salarioBase=" + salarioBase + "]";
  }
  
}
