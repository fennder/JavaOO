package atividades.unidade4.maps;

import java.util.HashMap;

public class HashMapApp {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mapa = new HashMap<>();
		mapa.put(1, "Edir");
		mapa.put(2, "Gustavo");
		mapa.put(3, "Teste");
		mapa.put(3, "Vicente");
		mapa.put(4, "Hugo");
		System.out.println(mapa);

	}

}
