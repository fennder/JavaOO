package atividades.unidade3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ScannerApp2 {

	public static void main(String[] args) {
		
		try {
			Scanner entrada = new Scanner(new FileReader("/home/fennder/Documents/Workspace/eclipse-workspace/JavaOO/src/file/numeros.txt"));
			double soma = 0;
			String valor;
			while(entrada.hasNext()) {
				valor = entrada.next();
				soma = soma + Double.parseDouble(valor);
			}
			
			entrada.close();
			JOptionPane.showMessageDialog(null, "A soma dos valores é: " + soma);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
