package br.tec.abrindoportas.service;

import br.tec.abrindoportas.model.ServidorPublicoModel;

public interface APIServidorPublico {
  
  public void adicionarServidorPublico();

  public void listarServidorPublico();

  public void listarServidorPublico(int matricula);
  
  public void alterarServidorPublico(ServidorPublicoModel servidorPublicoUpdate);
  
  public void deletarServidorPublico(int matricula);
  
  public void calcularFolhaServidoresPublicos();
  
  public void adicionarCursoServidorPublico(int matricula, int idCurso);
  
  public void deletarCursoServidorPublico(int matricula, int idCurso);
  
  public void listarCursosServidorPublico(int matricula);

}
