package atividades.unidade3.genericos;

public class UsoGenerico {

	public static void main(String[] args) {
		
		ExemplosGenerics<Integer> iob = new ExemplosGenerics<>(88);
		iob.showType();
		
		ExemplosGenerics<String> sob = new ExemplosGenerics<>("Edir");
		sob.showType();
		
//		if(iob.showType().equals(sob.showType())) 
//		{
//			System.out.println("Teste Verdadeiro");
//		}
		
	}

}
