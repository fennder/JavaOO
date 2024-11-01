package atividades.unidade4.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApp {

	public static void main(String[] args) {
		
		Deque<String> lista = new ArrayDeque<>();
		lista.add("Vermelho");
		lista.add("Preto");
		lista.add("Branco");
		lista.add("Roxo");
		lista.add("Cinza");
		lista.add("Azul");
		lista.add("Amarelo");
		System.out.println(lista);
		// Métodos
		lista.removeFirst();
		lista.removeLast();
		System.out.println(lista);
		lista.addFirst("Lilás");
		lista.addLast("Rubro");
		System.out.println(lista);
		System.out.println(lista.peekFirst());
		System.out.println(lista.peekLast());

	}

}
