package atividades.unidade3.genericos;

public class UsoGenerico {

	public static void main(String[] args) {
		
		ExemplosGenericos<Integer> iob = new ExemplosGenericos<>(88);
		iob.showType();
		
		ExemplosGenericos<String> sob = new ExemplosGenericos<>("Edir");
		sob.showType();
		
//		if(iob.showType().equals(sob.showType())) 
//		{
//			System.out.println("Teste Verdadeiro");
//		}
		
	}

}
