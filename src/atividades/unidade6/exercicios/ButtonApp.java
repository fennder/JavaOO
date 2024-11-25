package atividades.unidade6.exercicios;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ButtonApp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Primeira Janela da Aplicação");
		frame.setSize(800,600);
		Container container = frame.getContentPane();
		JTextArea jtarea = new JTextArea("Digite o texto aqui:");
		container.add(jtarea,BorderLayout.NORTH);
		frame.setVisible(true);

	}

}
