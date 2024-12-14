package atividades.unidade4.collection;


import java.util.LinkedList;


public class LinkedListApp {
/*
 * 
 */
	public static void main(String[] args) {
		
		LinkedList<String> lista = new LinkedList<>();
		lista.add("Vermelho");
		lista.add("Preto");
		lista.add("Branco");
		lista.add("Roxo");
		lista.add("Cinza");
		lista.add("Azul");
		lista.add("Amarelo");
		
		// Métodos
		lista.removeFirst();
		lista.removeLast();
		System.out.println(lista);

	}

}
