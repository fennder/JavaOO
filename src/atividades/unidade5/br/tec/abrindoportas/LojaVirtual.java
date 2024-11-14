package atividades.unidade5.br.tec.abrindoportas;

import java.nio.file.Paths;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LojaVirtual {

	static Map<Cliente, List<Curso>> pagamentos = new HashMap<>();

	public static void main(String[] args) {

		// Criar os cursos disponíveis no site para venda
		Curso java8 = new Curso(1, "Java 8 para web", 1000, Paths.get("http://abrindoportas.tec.br"));
		Curso oracle12c = new Curso(2, "Oracle 12c", 1500, Paths.get("http://abrindoportas.tec.br/resume"));
		Curso php7 = new Curso(1, "PHP 7", 2000, Paths.get("http://abrindoportas.tec.br/projects"));

		// Cadastrar o Cliente
		Cliente vicente = new Cliente("852.963.458-30", "Vicente Lima Pereira Santos Frasão", "vicente.frasao@gmail.com");
		Cliente edir = new Cliente("896.981.001-30", "Edir Pereira dos Santos", "edir.developer@gmail.com");

		// Criar a lista de uros do cliente
		List<Curso> cursoVicente = new LinkedList<>();

		// Fazer o checkout dos cursos escolhidos
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		while (opcao!=4) {
			System.out.println("Qual curso deseja adquirir:\n [1-Java8],\n [2-Oracle12c],\n [3-PHP7],\n [4-Finalizar Compra]");
			
			opcao = entrada.nextInt();
			if(opcao == 1)
				cursoVicente.add(java8);
		
			else if (opcao == 2)
				cursoVicente.add(oracle12c);
			
			else if (opcao == 3)
				cursoVicente.add(php7);
			
			else 
				opcao = 4;
			
		}
		entrada.close();
		pagamentos.put(vicente, cursoVicente);
		System.out.println(pagamentos);
	

	}

}
