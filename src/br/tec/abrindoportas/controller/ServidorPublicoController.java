package br.tec.abrindoportas.controller;

import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import br.tec.abrindoportas.model.ServidorPublico;

public class ServidorPublicoController {
  Avaliacao [] avaliacao = {Avaliacao.EXCELENTE, Avaliacao.BOM, Avaliacao.REGULAR, Avaliacao.INSATISFATÓTIO};

  List<ServidorPublico> servidores = new LinkedList<>();

  //Métodos CRUD SERVIDOR PUBLICO
  public void adicionarServidorPublico(){
    ServidorPublico servidorPublico = new ServidorPublico();
    servidorPublico.setMatricula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a matrícula:")));
    servidorPublico.setName(JOptionPane.showInputDialog(null, "Digite o nome:"));
    servidorPublico.setCargo(JOptionPane.showInputDialog(null, "Digite o cargo:"));
    servidorPublico.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário:")));

    servidores.add(servidorPublico);
  }

  public void listarServidorPublico(){
    for(ServidorPublico servidorPublico : servidores){
      // System.out.println("Todos ====> " + servidorPublico);
      JOptionPane.showMessageDialog(null, servidorPublico, "Lista de Servidores", 1);
    }
  }

  public void listarServidorPublico(int matricula){
    boolean encontrou = false;
    for (ServidorPublico servidorPublico : servidores) {
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

  public void alterarServidorPublico(ServidorPublico servidorPublicoUpdate){
    boolean encontrou = false;
    for (ServidorPublico servidorPublico : servidores) {
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
    for (ServidorPublico servidorPublico : servidores) {
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
    for (ServidorPublico servidorPublico : servidores) {
      folhaSalarial = folhaSalarial + servidorPublico.getSalario();
      JOptionPane.showMessageDialog(null, folhaSalarial, "Folha salarial", 0);
    }
  }

}
