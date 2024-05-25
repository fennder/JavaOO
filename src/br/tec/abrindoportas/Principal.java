package br.tec.abrindoportas;

import javax.swing.JOptionPane;

import br.tec.abrindoportas.model.ServidorPublico;

/*
 * Classe principal para Java Orientado a Objetos
 */
public class Principal {

	public static void main(String[] args) {

		ServidorPublico p1 = new ServidorPublico();
		p1.setName(JOptionPane.showInputDialog(null, "Digite o nome:"));
		p1.setMatricula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a matrícula:")));
		p1.setCargo(JOptionPane.showInputDialog(null, "Digite o cargo:"));
		p1.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário:")));
		System.out.println(p1.calcularSalarioHorasExras(10, 20, 0, 15));
				
	}

}
