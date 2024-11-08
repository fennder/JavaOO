package atividades.unidade5.lambda;

public class CalculaLambda {
	
	public static void main(String[] args) {
		CalculaLambda objeto = new CalculaLambda();
		IMath somar = (a,b)->a+b;
		IMath subtrair = (a,b)->a-b;
		IMath dividir = (a,b)->a/b;
		IMath multiplicar = (a,b)->a*b;
		IMath exponenciacao = (a,b)->Math.pow(a,b);
		IMath radiciacao = (a,b)->Math.pow(a,1/b);
		
		/********Chamadas da expressões lambdas*******/
		
		System.out.println(objeto.execOperacao(5, 3, somar));
		System.out.println(objeto.execOperacao(5, 1, subtrair));
		System.out.println(objeto.execOperacao(5, 7, multiplicar));
		System.out.println(objeto.execOperacao(5, 2, dividir));
		System.out.println(objeto.execOperacao(4, 9, exponenciacao));
		System.out.println(objeto.execOperacao(5, 4, radiciacao));
		
	}
	
	public double execOperacao(double a, double b, IMath op) {
		return op.operacao(a, b);
	}

}
