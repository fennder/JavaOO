package br.com.abrindoportas.erros;

public class TesteErro {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		
		int i=0;
		String frases[] = {"Um", "Dois", "Três"};
		while (i<4) {
			//try {
				System.out.println(frases[i]);
			//}catch (ArrayIndexOutOfBoundsException e){
				System.out.println("Erro ao acessar o vetor.");
			//}
			
			i++;
			
		}
		
	}

}
