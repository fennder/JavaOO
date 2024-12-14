package atividades.unidade4.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetApp {
	/*
	 * 
	 */
	public static void main(String[] args) {
		LinkedHashSet<String> lista = new LinkedHashSet<>();
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
