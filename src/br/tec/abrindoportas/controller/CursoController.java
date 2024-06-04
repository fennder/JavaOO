package br.tec.abrindoportas.controller;

import java.beans.Customizer;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import br.tec.abrindoportas.model.CursoModel;
import br.tec.abrindoportas.service.APICurso;

public class CursoController implements APICurso{

  List<CursoModel> cursos = new LinkedList<>();

  public void adicionarCurso(){

       
  }

  public void listarCursos(){
   
  }
  public void listarCurso(int idCurso){
    
  }
  
  public void alterarCurso(CursoModel cursoModelUpdate){
   
  }

  @Override
  public void deletarCurso(int idCurso) {
      
  }

  @Override
  public void calcularFolhaServidoresPublicos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'calcularFolhaServidoresPublicos'");
  }

  @Override
  public void adicionarServidorCurso(int idCurso, int matricula) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'adicionarServidorCurso'");
  }

  @Override
  public void deletarServidorCurso(int idCurso, int matricula) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deletarServidorCurso'");
  }

  @Override
  public void listarServidoresCurso(int idCurso) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarServidoreCurso'");
  }
  
}
