package atividades.unidade5;

public class Calculador {

	public static void main(String[] args) {
		IMatematica objeto = new IMatematica() {
			
			@Override
			public int subtrair(int a, int b) {
				
				return (a-b);
			}
			
			@Override
			public int somar(int a, int b) {
				
				return (a+b);
			}
			
			@Override
			public int multiplicar(int a, int b) {
				
				return (a*b);
			}
			
			@Override
			public int dividir(int a, int b) {
				
				return (a/b);
			}

			@Override
			public double exponenciacao(double a, double b) {
				
				return Math.pow(a,b);
			}

			@Override
			public double radiciacao(double a, double b) {
				// TODO Auto-generated method stub
				return Math.pow(a,1/b);
			}
		};
		System.out.println(objeto.getClass());
		System.out.println("Executando o método soma       	= " + objeto.somar(5, 5));
		System.out.println("Executando o método subtrair    = " + objeto.subtrair(5, 5));
		System.out.println("Executando o método dividir     = " + objeto.dividir(5, 5));
		System.out.println("Executando o método multiplicar = " + objeto.multiplicar(5, 5));
		System.out.println("Executando o método exponênciação = " + objeto.exponenciacao(5, 5));
		System.out.println("Executando o método radiciação = " + objeto.radiciacao(5, 5));

	}

}
