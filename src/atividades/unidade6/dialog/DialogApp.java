package atividades.unidade6.dialog;

import javax.swing.JOptionPane;

public class DialogApp {

	public static void main(String[] args) {
		int resposta = JOptionPane.showConfirmDialog(null, "Documento modfiado. Salvar as alterações?");
		var resposta1 = JOptionPane.showInputDialog(null, "Digite seu nome", "Cadastro", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "VAlores passados");
		String[] opcoes = {"Voltar", "Repetir", "Avançar"};
		resposta = JOptionPane.showOptionDialog(null, 
				"Você fez 1000 pontos nesta fase.", 
				"Jogo", 
				0, 
				JOptionPane.QUESTION_MESSAGE, 
				null,
				opcoes,
				opcoes[2]);
	}

}
