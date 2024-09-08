package br.com.abrindoportas.erros;

import java.util.Scanner;

public class Calculadora {
  public static void dividir(int n1, int n2) throws ArithmeticException{
    System.out.println(n1/n2);
  }

  public static void main(String[] args) throws DivisaoZeroException{
    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite o 1º número: ");
    int n1 = leitura.nextInt();
    System.out.println("Digite o 2º número: ");
    int n2 = leitura.nextInt();

    System.out.print("O valor da divisão de " + n1 + " por " + n2 + " é: ");
    try {
      
      dividir(n1, n2);

    } catch (ArithmeticException e) {

      throw new DivisaoZeroException(); //System.out.println("Erro dvisão por zero.");

    }
  }
}
