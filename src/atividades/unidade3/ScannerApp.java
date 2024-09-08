package atividades.unidade3;

import java.util.Formatter;
import java.util.Scanner;

public class ScannerApp {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Formatter saida = new Formatter(System.out);
		System.out.println("Informe nota 1");
		int nota1 = entrada.nextInt();
		System.out.println("Informe nota 2");
		int nota2 = entrada.nextInt();
		System.out.println("Informe nota 3");
		int nota3 = entrada.nextInt();
		System.out.println("Informe nota 4");
		int nota4 = entrada.nextInt();
		
		float media = (nota1+nota2+nota3+nota4)/4;
		if(media >= 7) {
			saida.format("Aprovado com média %.2f", media);
		}else {
			saida.format("Reprovado com %.2f", media);
		}
		entrada.close();
		saida.close();
		
	}

}
