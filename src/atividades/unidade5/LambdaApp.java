package atividades.unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp {

	int somatoria;
	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		LambdaApp app = new LambdaApp();
		int numero = 10;
		/*for (Integer integer : integers) {
			integer = integer + 10;
			System.out.println(integer);

		}*/
		
		integers.forEach((Integer x)->System.out.println(x));
		
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

}
