package atividades.unidade4.collection;

import java.util.HashSet;

public class HashSetApp {
	public static void main(String[] args) {
		HashSet<String> lista = new HashSet<>();
		lista.add("Vermelho");
		lista.add("Verde");
		lista.add("Verde");
		lista.add("Amarelo");
		lista.add("Azul");
		lista.add("Roxo");
		lista.add("Laranja");
		lista.add("Preto");
		lista.add("Preto");
		System.out.println(lista);
	}

}
