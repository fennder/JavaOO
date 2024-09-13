package atividades.unidade3.genericos;

public class UsoGenerico2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginUser<String, String> iob = new LoginUser<>("Edir Pereira","keysenh@01");
		
		iob.showType();
		iob.showInformation();
		
		Integer[] intArray = {12,1,45,2,63,63,21,25};
		Stats<Number> stats1 = new Stats<>(intArray);
		System.out.println("Average: " + stats1.media());
		
		Double[] doubleArray = {12.1,45.2,63.63,21.25};
		Stats<Number> stats2 = new Stats<>(doubleArray);
		System.out.println("Average: " + stats2.media());
	}

}
