package atividades.unidade5.stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamApp {

	public static void main(String[] args) {
		
		colecaoStream();
		colecaoParallelStream();
		
	}

	private static void colecaoParallelStream() {
		
		List<String> valores = new ArrayList<>();
		int max =1_000_000;
		
		for (int i = 0; i < max; i++) {
			valores.add("Valor => " + i);
		}
		long t0 = System.currentTimeMillis();
		valores.parallelStream().sorted().forEach(System.out::println);
		long t1 = System.currentTimeMillis();
		System.out.println("Tempo consumido '" + ((t1-t0)/60000) + " minutos e " + ((t1-t0)/1000) + "' segundos.");
	}

	private static void colecaoStream() {
		
		List<String> valores = new ArrayList<>();
		int max =100;
		
		for (int i = 0; i < max; i++) {
			valores.add("=>"+i);
		}
		long t0 = System.currentTimeMillis();
		valores.stream().sorted().forEach(System.out::println);
		long t1 = System.currentTimeMillis();
		System.out.println("Tempo consumido " + ((t1-t0)/60000) + " minutos e " + ((t1-t0)/1000) + "' segundos.");
		
	}

}
