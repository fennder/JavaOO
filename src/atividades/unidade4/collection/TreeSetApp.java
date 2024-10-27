package atividades.unidade4.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {

	public static void main(String[] args) {
		Set<String> lista = new TreeSet<>();
		lista.add("Vermelho");
		lista.add("Verde");
		lista.add("Verde");
		lista.add("Amarelo");
		lista.add("Azul");
		lista.add("Azul");
		lista.add("Roxo");
		lista.add("Laranja");
		lista.add("Laranja");
		lista.add("Preto");
		lista.add("Preto");
		System.out.println(lista);

	}

}
