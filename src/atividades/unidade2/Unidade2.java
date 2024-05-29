package atividades.unidade2;

import java.util.Scanner;

public class Unidade2 {
  Scanner read = new Scanner(System.in);

  public void numeroparimpar(){
    
    System.out.println("Digite o número para comparar: ");
		int numero = read.nextInt();

    if (numero%2 == 0){
      System.out.println("O número " + numero + " é par");
    }else{
      System.out.println("O número " + numero + " é impar");
    }
    read.close();
  }

  public void alunosAprovados(){
    
    double n1, n2, media, mediaTurma=0;
    int numeroAlunos,numeroAlunosAprovados=0, numeroAlunosReprovados=0;

    System.out.println("Digite o número de alunos: ");
		numeroAlunos = read.nextInt();
    
    for (int i = 0; i < numeroAlunos; i++) {
      System.out.println("Digite a Primeira nota do aluno: " + (i+1));
      n1 = read.nextDouble();
      System.out.println("Digite a Segunda nota do aluno: " + (i+1));
      n2 = read.nextDouble();

      media = (n1+n2)/2;

      if (media >= 6) {
        numeroAlunosAprovados++;
      }else{
        numeroAlunosReprovados++;
      }
      mediaTurma = mediaTurma + media;
      System.out.println(mediaTurma);
      
    }
    mediaTurma = mediaTurma/numeroAlunos;
    System.out.println("Número de alunos aprovados " + numeroAlunosAprovados);
    System.out.println("Número de alunos reprovados " + numeroAlunosReprovados);
    System.out.println("Média da Turma " + mediaTurma);
  }

  public void numeroE(){
    double ex = 0, x;

    Scanner read = new Scanner(System.in);
    System.out.println("Digite o valor de X: ");

    x = read.nextDouble();

    for (int i = 1; i <= 3; i++) {
      ex = ex + (Math.pow(x, i))/fatorial(i);
    }
    System.out.println("O valor de e(" + x + ") é = " + ex);
    read.close();
  }

  public static int fatorial(int i){
    int resultado = 1;
    for (int j = 1; j <= i; j++) {
      resultado *= j;
    }
    return resultado;
  }

  public static double fatorialModificado(int i){
    return(switch(i){
      case 0,1 -> 1;
      default ->{
        double fatorial = i * fatorialModificado(i-1);
        yield fatorial;
      }
    });
  }
  
  public void cartucho(){
    final double VALOR_CARTUCHO = 50.0;
    int quantidade;
    double valorVenda = 0;

    System.out.println("Digite a quantidade de cartuchos que deseja: ");
    quantidade = read.nextInt();

    if (quantidade <= 500) {
      valorVenda = quantidade * VALOR_CARTUCHO * 0.95;
    }else if (quantidade <= 1000) {
      valorVenda = quantidade * VALOR_CARTUCHO * 0.93;
    }else if (quantidade <= 1500) {
      valorVenda = quantidade * VALOR_CARTUCHO * 0.91;
    }else{
      valorVenda = quantidade * VALOR_CARTUCHO * 0.9;
    }
    System.out.println("Valor da venda é: " + valorVenda);
    read.close();

  }

  public void testeString(){
    String s1 = "Edir Pereira dos Santos";
    String s2 = "Edir Pereira dos Santos"; 
    String s3 = "Edir Pereira dos Santos";

    String s4 = new String("Edir Pereira dos Santos");
    String s5 = new String("Edir Pereira dos Santos");

    System.out.println(s1 == s2);
    System.out.println(s1 == s4);
    System.out.println(s1.equals(s4));

    System.out.println(s1.length());
    System.out.println(s3.charAt(5));
    
    System.out.println(s1.substring(4));
    System.out.println(s1.substring(4,10));

    System.out.println(s1.equalsIgnoreCase(s5));
    System.out.println(s1.startsWith(s5));
    System.out.println(s1.endsWith(s5));

    System.out.println(s4.contains("dos"));
  }
}
