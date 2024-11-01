package atividades.unidade4.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListApp {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("Vermelho");
		lista.add("Preto");
		lista.add("Branco");
		lista.add("Roxo");
		lista.add("Cinza");
		lista.add("Azul");
		lista.add("Amarelo");
		Collections.sort(lista);
		System.out.println(lista);

	}

}
