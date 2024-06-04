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
    
  }

  public void listarServidoresPublicos(){
    
  }

  public void listarServidorPublico(int matricula){
    
  }

  public void alterarServidorPublico(ServidorPublicoModel servidorPublicoUpdate){
     
  }

  public void deletarServidorPublico(int matricula){
        
  }

  public void calcularFolhaServidoresPublicos(){
    
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
