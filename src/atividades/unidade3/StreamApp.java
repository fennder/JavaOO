package atividades.unidade3;

import java.io.FileInputStream;

public class StreamApp {
	
	public static void byteStream() throws Exception {
		FileInputStream entrada = new FileInputStream("/home/fennder/Documents/Workspace/eclipse-workspace/JavaOO/src/file/dados.txt");
		int contador = 0;
		while((entrada.read()) != -1 ) {
			contador++;
		}
		System.out.println("Número de caracteres é: " + contador);
		entrada.close();
	}
	
	public static void caracterStream(char letra) throws Exception {
		FileInputStream entrada = new FileInputStream("/home/fennder/Documents/Workspace/eclipse-workspace/JavaOO/src/file/dados.txt");
		int contador = 0;
		int c;
		while((c = entrada.read()) != -1 ) {
			if (c == letra) {
				contador++;
			}
			
		}
		System.out.println("Quantidade do caracteres informado: " + contador);
		entrada.close();
	}

	public static void main(String[] args) {
		
		try {
			//byteStream();
			System.out.println("Informar letra para ser encontrada");
			char letra = (char)System.in.read();
			caracterStream(letra);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
