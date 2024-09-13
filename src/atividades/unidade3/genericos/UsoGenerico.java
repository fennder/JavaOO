package atividades.unidade3.genericos;

public class UsoGenerico {

	public static void main(String[] args) {
		
		ExemplosGenerics<Integer> iob = new ExemplosGenerics<>(88);
		iob.showType();
		iob.showInformation();
		
		ExemplosGenerics<String> sob = new ExemplosGenerics<>("Edir Pereira");
		sob.showType();
		sob.showInformation();
		
//		if(iob.showType().equals(sob.showType())) 
//		{
//			System.out.println("Teste Verdadeiro");
//		}
		
	}

}
