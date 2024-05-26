package br.tec.abrindoportas;

import javax.swing.JOptionPane;

import br.tec.abrindoportas.controller.ServidorPublicoController;
import br.tec.abrindoportas.model.ServidorPublico;

/*
 * Classe principal para Java Orientado a Objetos
 */
public class Principal {

	public static void main(String[] args) {

		ServidorPublicoController spc = new ServidorPublicoController();
		spc.adicionarServidorPublico();
		spc.adicionarServidorPublico();
		spc.listarServidorPublico(1234);
		spc.deletarServidorPublico(5679);
		ServidorPublico servidorPublicoUpdate = new ServidorPublico(5678, "Vicente Santos Frasão", "Analista", null, null, 7500.0, 0, 0, null, null, null, null, null, null, null, null);
		spc.alterarServidorPublico(servidorPublicoUpdate);
		spc.listarServidorPublico();
		spc.calcularFolhaServidoresPublicos();

	}

}
