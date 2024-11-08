package atividades.unidade5.lambda;

import java.util.function.BiFunction;
import java.util.function.Predicate;


public class VarLambda {

	public static void main(String[] args) {
		
		exemplo01();

	}
	
	public static void exemplo01() {
		BiFunction<@Nonnull String, @Nullable String, String> concatenar = (s1, s2)->{
			
			if(s2 == null) {
				return s1;
			}else {
				return s1 + s2;
			}
		};
		String resultado1 = concatenar.apply("Olá, ", null);
		String resultado2 = concatenar.apply("Resultado ", "11");
		
		System.out.println(resultado1);
		System.out.println(resultado1);
		
		Predicate<Integer> maiorQueDez = (var x) -> x > 10;
		
		System.out.println(maiorQueDez.test(5));
		System.out.println(maiorQueDez.test(15));
	}

}
