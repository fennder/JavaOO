package br.tec.abrindoportas.controller;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import atividades.Avaliacao;
import br.tec.abrindoportas.model.CursoModel;
import br.tec.abrindoportas.model.ServidorPublicoModel;
import br.tec.abrindoportas.service.APICurso;
import br.tec.abrindoportas.service.APIServidorPublico;

public class App implements APIServidorPublico, APICurso {
  Avaliacao [] avaliacao = {Avaliacao.EXCELENTE, Avaliacao.BOM, Avaliacao.REGULAR, Avaliacao.INSATISFATÓTIO};

  List<ServidorPublicoModel> servidorPublicoModels = new LinkedList<>();
  List<CursoModel> cursoModels = new LinkedList<>();

  /*
   * CRUD - Servidores
   */
  @Override
  public void adicionarServidorPublico() {
    ServidorPublicoModel servidorPublico = new ServidorPublicoModel();
    servidorPublico.setMatricula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a matrícula:")));
    servidorPublico.setName(JOptionPane.showInputDialog(null, "Digite o nome:"));
    servidorPublicoModels.add(servidorPublico);
  }

  @Override
  public void listarServidoresPublicos() {
    for (ServidorPublicoModel servidorPublicoModel : servidorPublicoModels) {
      JOptionPane.showMessageDialog(null, servidorPublicoModel, "Lista de Servidores", 1);
    }
  }

  @Override
  public void listarServidorPublico(int matricula) {
    boolean encontrou = false;
    for (ServidorPublicoModel servidorPublico : servidorPublicoModels) {
      if (servidorPublico.getMatricula() == matricula) {
        // System.out.println("Um ====> " + servidorPublico);
        System.out.println(servidorPublico);
        encontrou = true;
        break;
      }
      
      if(!encontrou){
        System.out.println("A matrícula informada não existe.");
      }
    }
  }

  @Override
  public void alterarServidorPublico(ServidorPublicoModel servidorPublicoUpdate) {
    boolean encontrou = false;
    for (ServidorPublicoModel servidorPublico : servidorPublicoModels) {
      if (servidorPublico.getMatricula() == servidorPublicoUpdate.getMatricula()) {
        servidorPublicoModels.remove(servidorPublico);
        servidorPublicoModels.add(servidorPublicoUpdate);
        encontrou = true;
      
      }
      if(!encontrou){
        System.out.println("A matrícula informada não existe.");
      }else{
        System.out.println("A Alteração do Servidor Público com a matrícula " + servidorPublicoUpdate.getMatricula() + " foi realizada com sucesso.");
      }
    }
  }

  @Override
  public void deletarServidorPublico(int matricula) {
    boolean encontrou = false;
    for (ServidorPublicoModel servidorPublico : servidorPublicoModels) {
      if (servidorPublico.getMatricula() == matricula) {
        servidorPublicoModels.remove(servidorPublico);
        encontrou = true;
        
      }
      if(!encontrou){
        System.out.println("funcao deletetarServidorPublico");
        System.out.println("A matrícula informada não existe para ser deletado.");
      }else{
        System.out.println("A Exclusão do Servidor Público com a matrícula " + matricula + " foi realizada com sucesso.");
      }
    }
  }

  @Override
  public void calcularFolhaServidoresPublicos() {
    double folhaSalarial = 0;
    for (ServidorPublicoModel servidorPublico : servidorPublicoModels) {
      folhaSalarial = folhaSalarial + servidorPublico.getSalario();
      JOptionPane.showMessageDialog(null, folhaSalarial, "Folha salarial", 0);
    }
  }

  @Override
  public void adicionarCursoServidorPublico(int matricula, int idCurso) {
    boolean encontrou = false;
    for (ServidorPublicoModel servidorPublico : servidorPublicoModels) {
      if (servidorPublico.getMatricula() == matricula) {
        
        for (CursoModel cursoModel : cursoModels) {
          if (cursoModel.getIdCurso() == idCurso) {
            servidorPublico.setCursos(cursoModel);
            encontrou = true;
            break;
          }
        }
      }
      if(!encontrou){
        System.out.println("A matrícula informada não existe.");
      }else{
        System.out.println("O curso "+idCurso+", foi incluído no Servidor Público com a matrícula " + matricula +" foi realizada com sucesso.");
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
    for (ServidorPublicoModel servidorPublico : servidorPublicoModels) {
      if (servidorPublico.getMatricula() == matricula) {
        JOptionPane.showMessageDialog(null, servidorPublicoModels, "Servidores com cursos", matricula);
        JOptionPane.showMessageDialog(null, cursoModels, "Cursos do Servidor", 1);
      }
    }
  }

  /*
   * CRUD - Cursos
   */
  @Override
  public void adicionarCurso() {
    CursoModel cursoModel = new CursoModel();
    cursoModel.setIdCurso(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o Id: ")));
    cursoModel.setName(JOptionPane.showInputDialog(null, "Digite o nome: "));
    cursoModel.setFormaRealizacao(JOptionPane.showInputDialog(null, "Digite o Forma de formalização: "));
    cursoModel.setOfertante(JOptionPane.showInputDialog(null, "Digite o Ofertante: "));
    cursoModel.setValor(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do curso: ")));

    cursoModels.add(cursoModel); 
  }

  @Override
  public void listarCursos() {
    for(CursoModel cursoModel : cursoModels){
      // System.out.println("Todos ====> " + servidorPublico);
      System.out.println(cursoModel);
    }
  }
  
  @Override
  public void listarCurso(int idCurso) {
    boolean encontrou = false;
    for (CursoModel cursoModel : cursoModels) {
      if (cursoModel.getIdCurso() == idCurso) {
        // System.out.println("Um ====> " + servidorPublico);
        System.out.println(cursoModel);
        encontrou = true;
        break;
      }
      
      if(!encontrou){
        System.out.println("O código informado não existe.");
      }
    }
  }

  @Override
  public void alterarCurso(CursoModel cursoModel) {
    boolean encontrou = false;
    for (CursoModel cursoModelUpdate : cursoModels) {
      if (cursoModel.getIdCurso() == cursoModelUpdate.getIdCurso()) {
        cursoModels.remove(cursoModel);
        cursoModels.add(cursoModelUpdate);
        encontrou = true;
      
      }
      if(!encontrou){
        System.out.println("O Id informado não existe.");
      }else{
        System.out.println("A Alteração do Curso com o id " + cursoModelUpdate.getIdCurso() + " foi realizado com sucesso.");
      }
    } 
  }

  @Override
  public void deletarCurso(int idCurso) {
    boolean encontrou = false;
    for (CursoModel cursoModel : cursoModels) {
      if (cursoModel.getIdCurso() == idCurso) {
        cursoModels.remove(cursoModel);
        encontrou = true;
        
      }
      if(!encontrou){
        System.out.println("O Id informado não existe para ser deletado.");
      }else{
        System.out.println("A Exclusão do Curso com o Id " + idCurso + " foi realizada com sucesso.");
      }
    }  
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
    throw new UnsupportedOperationException("Unimplemented method 'listarServidoresCurso'");
  } 
  
}
