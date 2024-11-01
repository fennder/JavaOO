package atividades.unidade4.maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapApp {

	public static void main(String[] args) {
		
		Map<Integer, String> mapa = new LinkedHashMap<>();
		mapa.put(4, "Edir");
		mapa.put(2, "Victor");
		mapa.put(3, "Gustavo");
		mapa.put(3, "Vicente");
		mapa.put(1, "Humberto");
		System.out.println(mapa);
		
		Map<Integer, String> mapa1 = new TreeMap<>();
		mapa1.put(4, "Edir");
		mapa1.put(2, "Victor");
		mapa1.put(3, "Gustavo");
		mapa1.put(3, "Vicente");
		mapa1.put(1, "Humberto");
		System.out.println(mapa1);


	}

}
