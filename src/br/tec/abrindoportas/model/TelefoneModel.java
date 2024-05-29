package br.tec.abrindoportas.model;

public class TelefoneModel {

  private String tipo;
  private String numero;

  public TelefoneModel() {
    super();
  }

  public TelefoneModel(String tipo, String numero) {
    super();
    this.tipo = tipo;
    this.numero = numero;
  }

  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public String getNumero() {
    return numero;
  }
  public void setNumero(String numero) {
    this.numero = numero;
  }
  @Override
  public String toString() {
    return "TelefoneModel [tipo=" + tipo + ", numero=" + numero + "]";
  }

}
