package br.tec.abrindoportas.controller;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import atividades.Avaliacao;
import br.tec.abrindoportas.model.CursoModel;
import br.tec.abrindoportas.model.ServidorPublicoModel;
import br.tec.abrindoportas.model.subclass.ComissionadoModel;
import br.tec.abrindoportas.model.subclass.EstatutarioModel;
import br.tec.abrindoportas.model.subclass.TemporarioModel;
import br.tec.abrindoportas.service.APIServidorPublico;

public class ServidorPublicoController implements APIServidorPublico{
  Avaliacao [] avaliacao = {Avaliacao.EXCELENTE, Avaliacao.BOM, Avaliacao.REGULAR, Avaliacao.INSATISFATÓTIO};

  List<ServidorPublicoModel> servidores = new LinkedList<>();

  //Métodos CRUD SERVIDOR PUBLICO
  public void adicionarServidorPublico(){
    ServidorPublicoModel servidorPublico = new ServidorPublicoModel();
    servidorPublico.setMatricula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a matrícula:")));
    servidorPublico.setName(JOptionPane.showInputDialog(null, "Digite o nome:"));
    servidores.add(servidorPublico);
  }

  public void listarServidorPublico(){
    for(ServidorPublicoModel servidorPublico : servidores){
      // System.out.println("Todos ====> " + servidorPublico);
      JOptionPane.showMessageDialog(null, servidorPublico, "Lista de Servidores", 1);
    }
  }

  public void listarServidorPublico(int matricula){
    boolean encontrou = false;
    for (ServidorPublicoModel servidorPublico : servidores) {
      if (servidorPublico.getMatricula() == matricula) {
        // System.out.println("Um ====> " + servidorPublico);
        JOptionPane.showMessageDialog(null, servidorPublico);
        encontrou = true;
        break;
      }
      
      if(!encontrou){
        JOptionPane.showMessageDialog(null, "A matrícula informada não existe.");
      }
    }
  }

  public void alterarServidorPublico(ServidorPublicoModel servidorPublicoUpdate){
    boolean encontrou = false;
    for (ServidorPublicoModel servidorPublico : servidores) {
      if (servidorPublico.getMatricula() == servidorPublicoUpdate.getMatricula()) {
        servidores.remove(servidorPublico);
        servidores.add(servidorPublicoUpdate);
        encontrou = true;
      
      }
      if(!encontrou){
        JOptionPane.showMessageDialog(null, "A matrícula informada não existe.");
      }else{
        JOptionPane.showMessageDialog(null, "A Alteração do Servidor Público com a matrícula " + servidorPublicoUpdate.getMatricula() + " foi realizada com sucesso.");
      }
    } 
  }

  public void deletarServidorPublico(int matricula){
    boolean encontrou = false;
    for (ServidorPublicoModel servidorPublico : servidores) {
      if (servidorPublico.getMatricula() == matricula) {
        servidores.remove(servidorPublico);
        encontrou = true;
        
      }
      if(!encontrou){
        JOptionPane.showMessageDialog(null, "A matrícula informada não existe para ser deletado.");
      }else{
        JOptionPane.showMessageDialog(null, "A Exclusão do Servidor Público com a matrícula " + matricula + " foi realizada com sucesso.");
      }
    }    
  }

  public void calcularFolhaServidoresPublicos(){
    double folhaSalarial = 0;
    for (ServidorPublicoModel servidorPublico : servidores) {
      folhaSalarial = folhaSalarial + servidorPublico.getSalario();
      JOptionPane.showMessageDialog(null, folhaSalarial, "Folha salarial", 0);
    }
  }

  public void verificaTipoServidorPublico(ServidorPublicoModel servidorPublicoModel){
    if (servidorPublicoModel instanceof EstatutarioModel) {
      System.out.println("Estatutatio");
    }else if (servidorPublicoModel instanceof ComissionadoModel) {
      System.out.println("Comissionado");
    }else if (servidorPublicoModel instanceof TemporarioModel){
      System.out.println("Temporário");
    }else{
      System.out.println("Não foi especializado. Permanece como servidor ");
    }
  }

  @Override
  public void adicionarCursoServidorPublico(int matricula, int idCurso) {
    boolean encontrou = false;
    for (ServidorPublicoModel servidorPublico : servidores) {
      if (servidorPublico.getMatricula() == matricula) {
        
        for (CursoModel cursoModel : cursoController.cursos) {
          if (cursoModel.getIdCurso() == idCurso) {
            servidorPublico.setCursos(cursoModel);
            encontrou = true;
            break;
          }
        }
      }
      if(!encontrou){
        JOptionPane.showMessageDialog(null, "A matrícula informada não existe para ser deletado.");
      }else{
        JOptionPane.showMessageDialog(null, "O curso foi incluído no Servidor Público com a matrícula " + matricula + " foi realizada com sucesso.");
      }
    }    
  }

  @Override
  public void deletarCursoServidorPublico(int matricula, int idCurso) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deletarCursoServidorPublico'");
  }

  @Override
  public void listarCursosServidorPublico(int matricula) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarCursosServidorPublico'");
  }

}
