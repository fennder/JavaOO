package atividades.unidade5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LambdaApp {

	int somatoria;
	public static void main(String[] args) {
		
		example();
		example01();
		example02();
		example03();
		example04();
		example05();
		example06();
		example07();
		example08();
		example09();

	}
	
	public static void example() {
		List<Integer> integers = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		LambdaApp app = new LambdaApp();
		int numero = 10;
		/*for (Integer integer : integers) {
			integer = integer + 10;
			System.out.println(integer);

		}*/
		
		//integers.forEach((Integer x)->System.out.println(x));
		
		integers.forEach((Integer x)->
		{
			int y = x/2;
			System.out.println(y);
			x = x + numero;
			app.somatoria = app.somatoria + x;
			System.out.println(x);
			
		});
		System.out.println(app.somatoria);
	}

	public static void example01() {
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		integers.forEach(x -> System.out.println(x));
	}
	
	public static void example02() {
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		integers.forEach(x->{
			x = x + 10;
			System.out.println(x);
		});
	}
	
	public static void example03() {
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		integers.forEach(System.out::println);
	}
	
	public static void example04() {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		
		List<Integer> quadrados = numeros.stream()
				.map(numero -> numero * numero)
				.collect(Collectors.toList());
		
		System.out.println(quadrados);
	}
	
	public static void example05()
	{
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> numerosPares = numeros.stream()
				.filter(numero -> numero % 2 == 0)
				.collect(Collectors.toList());
		
		System.out.println(numerosPares);
	}
	
	public static void example06()
	{
		List<Integer> numeros = Arrays.asList(1,2,3,4,5);
		
		int sum = numeros.stream().reduce(0, (a,b) -> a + b);
		
		System.out.println("Soma: " + sum);
	}
	
	public static void example07()
	{
		List<Integer> numeros = Arrays.asList(4,3,5,1,2);
		
		List<Integer> sortedNumbers = numeros.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(sortedNumbers);
	}
	
	public static void example08()
	{
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
		
		Long totalCount = numeros.stream().count();
		
		System.out.println("Total de números: " + totalCount);
	}
	
	public static void example09()
	{
		IntStream numeros = IntStream.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
		
		int sum = numeros.sum();
		
		System.out.println("Soma dos números: " + sum);
	}
}
