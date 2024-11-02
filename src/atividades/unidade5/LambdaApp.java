package atividades.unidade5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LambdaApp {

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5,6,7,8);
		
		/*for (Integer integer : integers) {
			integer = integer + 10;
			System.out.println(integer);

		}*/
		
		integers.forEach(x->
		{
			x = x + 10;
			System.out.println(x);
			
		});

	}

}
