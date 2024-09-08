package br.com.abrindoportas.erros;

import java.io.*;

public class TesteLeitura {
  public static void main(String[] args) throws IOException{
    byte []  bytes = new byte[10];
    System.out.println("Digite algo: ");
    // try {
      System.in.read(bytes);
    // } catch (IOException e) {
      // TODO Auto-generated catch block
      // e.printStackTrace();
    // }
    System.out.println("|nEco: " + new String(bytes));
  }
}
