package atividades.unidade5.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApp {

	static List<String> funcionarios;

	public static void filtrar(String letra) {

		//Filtra todos os funcionarios cujos nomes
		//iniciam com a letra "a"
		funcionarios.stream().filter((s)-> s.startsWith(letra)).forEach(System.out::println);

	}

	public static void ordenar(String letra) {

		//Filtra todos os funcionarios cujos nomes
		//iniciam com a letra "a" e ordenar
		funcionarios.stream().sorted().filter((s)-> s.startsWith(letra)).forEach(System.out::println);

	}

	public static void contar(String letra) {
		

		//Filtra todos os funcionarios cujos nomes
		//iniciam com a letra "a" e ordenar
		long contador = funcionarios.stream().sorted().filter((s)-> s.startsWith(letra)).count();

		System.out.println(contador);
	}



	public static void main(String[] args) {

		//Listagem de funcionarios
		funcionarios = new ArrayList<>();
		funcionarios.add("Vicente");
		funcionarios.add("Karla");
		funcionarios.add("Edir");
		funcionarios.add("Abner");
		funcionarios.add("Bruno");
		funcionarios.add("Acacio");
		funcionarios.add("Alteredo");

		//criação de um stream de funcionarios para
		//manipulação dos seus objetos
		Stream<String> stream = funcionarios.stream();
		
		filtrar("A");
		ordenar("A");
		contar("A");

	}

}
