package atividades.unidade4.collection.factory;

import java.util.List;

public class NovasFuncionalidadesJava21 {

	public static void main(String[] args) {
		
		List<String> list = List.of("Maçã", "Banana", "Uva");
		
		//Antes do Java 21
		var primeiroElemento = list.iterator().next();
		System.out.println(primeiroElemento);
		
		var ultimoElemento = list.get(list.size()-1);
		System.out.println(ultimoElemento);
		
		//Com Java 21
		var primeiroElemento1 = list.getFirst();
		System.out.println(primeiroElemento1);
		
		var ultimoElemento1 = list.getLast();
		System.out.println(ultimoElemento1);
		
		System.out.println(list);
		
		System.out.println(list.reversed());
	}

}
