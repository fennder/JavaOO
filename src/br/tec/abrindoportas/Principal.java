package br.tec.abrindoportas;

import javax.swing.JOptionPane;

import atividades.Unidade2;
import br.tec.abrindoportas.controller.Avaliacao;
import br.tec.abrindoportas.model.ServidorPublico;

/*
 * Classe principal para Java Orientado a Objetos
 */
public class Principal {

	public static void main(String[] args) {
		Avaliacao [] avaliacao = {Avaliacao.EXCELENTE, Avaliacao.BOM, Avaliacao.REGULAR, Avaliacao.INSATISFATÓTIO};
		Unidade2 unidade2 = new Unidade2();
		//unidade2.numeroE();
		// unidade2.testeString();
		
		ServidorPublico p1 = new ServidorPublico();
		for (int i = 0; i < 1; i++) {
			p1.setName(JOptionPane.showInputDialog(null, "Digite o nome:"));
			p1.setMatricula(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a matrícula:")));
			p1.setCargo(JOptionPane.showInputDialog(null, "Digite o cargo:"));
			p1.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o salário:")));
			System.out.println(p1.calcularSalarioHorasExras(10, 20, 0, 15));
			System.out.println(p1.getTotalServidores());
			System.out.println(p1.tamanhoNome());
			p1.mostrarPreNome();
			p1.mostrarSobreNome();
			// p1.setAvaliacao(JOptionPane.showInputDialog(null, "Selecione uma avaliação", "Avaliação", JOptionPane.INFORMATION_MESSAGE, null, avaliacao, avaliacao[3]));
			p1.setAvaliacao(Avaliacao.EXCELENTE);
			System.out.println(p1.getAvaliacao());
		}

	}

}
