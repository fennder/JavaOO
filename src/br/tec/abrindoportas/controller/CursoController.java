package br.tec.abrindoportas.controller;

import java.beans.Customizer;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import br.tec.abrindoportas.model.CursoModel;
import br.tec.abrindoportas.model.ServidorPublicoModel;

public class CursoController {

  List<CursoModel> cursos = new LinkedList<>();

  public void adicionarCurso(){

    CursoModel cursoModel = new CursoModel();
    cursoModel.setIdCurso(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Id: ")));
    cursoModel.setName(JOptionPane.showInputDialog(null, "Digite o nome: "));
    cursoModel.setFormaRealizacao(JOptionPane.showInputDialog(null, "Digite o Forma de formalização: "));
    cursoModel.setOfertante(JOptionPane.showInputDialog(null, "Digite o Ofertante: "));
    cursoModel.setValor(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do curso: ")));

    cursos.add(cursoModel);    
  }

  public void listarCursos(){
    for(CursoModel cursoModel : cursos){
      // System.out.println("Todos ====> " + servidorPublico);
      JOptionPane.showMessageDialog(null, cursoModel, "Lista de Cursos", 1);
    }
  }
  public void listarCurso(int idCurso){
    boolean encontrou = false;
    for (CursoModel cursoModel : cursos) {
      if (cursoModel.getIdCurso() == idCurso) {
        // System.out.println("Um ====> " + servidorPublico);
        JOptionPane.showMessageDialog(null, cursoModel);
        encontrou = true;
        break;
      }
      
      if(!encontrou){
        JOptionPane.showMessageDialog(null, "O código informado não existe.");
      }
    }
  }
  
  public void alterarCurso(CursoModel cursoModelUpdate){
    boolean encontrou = false;
    for (CursoModel cursoModel : cursos) {
      if (cursoModel.getIdCurso() == cursoModelUpdate.getIdCurso()) {
        cursos.remove(cursoModel);
        cursos.add(cursoModelUpdate);
        encontrou = true;
      
      }
      if(!encontrou){
        JOptionPane.showMessageDialog(null, "O Id informado não existe.");
      }else{
        JOptionPane.showMessageDialog(null, "A Alteração do Curso com o id " + cursoModelUpdate.getIdCurso() + " foi realizado com sucesso.");
      }
    } 
  }

  public void excluirCurso(int idCurso){
    boolean encontrou = false;
    for (CursoModel cursoModel : cursos) {
      if (cursoModel.getIdCurso() == idCurso) {
        cursos.remove(cursoModel);
        encontrou = true;
        
      }
      if(!encontrou){
        JOptionPane.showMessageDialog(null, "O Id informado não existe para ser deletado.");
      }else{
        JOptionPane.showMessageDialog(null, "A Exclusão do Curso com o Id " + idCurso + " foi realizada com sucesso.");
      }
    }    
  }
  
}
