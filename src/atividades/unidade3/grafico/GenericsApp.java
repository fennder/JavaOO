package atividades.unidade3.grafico;

import java.util.ArrayList;
import java.util.List;

public class GenericsApp {
	public static void main(String[] args) {
		
		List<Shape> lista = new ArrayList<>();
		lista.add(new Circle());
		lista.add(new Rectangle());
		
		List<?> ls = lista;
		System.out.println(ls);
	}

}
