import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MelhoriasStream {

	public static void main(String[] args) {
		
		exemplo01();
		exemplo02();
		exemplo03();
		exemple04();

	}

	private static void exemplo01() {
		
		List<Integer> list = Stream.of(1,2,3,4,5,6,7,8).takeWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.println(list);
		
	}
	
	private static void exemplo02() {
		
		List<Integer> list = Stream.of(2,2,3,4,5,6,7,8,9).dropWhile(i -> (i % 2 == 0)).collect(Collectors.toList());
		System.out.println(list);
		
	}
	
	private static void exemplo03() {
		
		String nome = "Alice";
		Stream<String> stream = Stream.ofNullable(nome);
		stream.forEach(System.out::println);
		
		nome = null;
		stream = Stream.ofNullable(nome);
		stream.forEach(System.out::println);
	}
	
	private static void exemple04() {
		
		Stream.iterate(1, i -> i <= 10, i -> i*3).forEach(System.out::println);
		
	}

}
