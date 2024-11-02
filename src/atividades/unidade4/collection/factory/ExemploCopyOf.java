package atividades.unidade4.collection.factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploCopyOf {
	
public static void main(String[] args) {
		
		List<String> listaOriginal = new ArrayList<>();
		listaOriginal.add("Uva");
		listaOriginal.add("Maçã");
		listaOriginal.add("Banana");
		listaOriginal.add("Manga");
		listaOriginal.add("Abacate");
		
		List<String> listaImutavel = List.copyOf(listaOriginal);

		try {
			listaOriginal.add("Laranja");
			//listaImutavel.add("Melão");
		} catch (UnsupportedOperationException e) {
			System.out.println("Não é possível modificar a lista imutável.");
		}
		System.out.println("Lista Original: " + listaOriginal);
		System.out.println("Lista Imutável: " + listaImutavel);
	}

}
