package br.tec.abrindoportas.service;

import br.tec.abrindoportas.model.CursoModel;

public interface APICurso {
  
  public void adicionarCurso();

  public void listarCursos();

  public void listarCurso(int idCurso);
  
  public void alterarCurso(CursoModel cursoModel);
  
  public void deletarCurso(int idCurso);
  
  public void calcularFolhaServidoresPublicos();
  
  public void adicionarServidorCurso(int idCurso, int matricula);
  
  public void deletarServidorCurso(int idCurso, int matricula);
  
  public void listarServidoresCurso(int idCurso);
}
