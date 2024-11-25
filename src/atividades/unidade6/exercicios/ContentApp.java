package atividades.unidade6.exercicios;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ContentApp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Primeira Janela da Aplicação");
		frame.setSize(800,600);
		Container container = frame.getContentPane();
		container.setLayout( new FlowLayout(1));
		JTextField jtxtfield = new JTextField("Digite Aqui: ");
		container.add(jtxtfield,BorderLayout.NORTH);
		JPasswordField jpfield = new JPasswordField();
		container.add(jpfield,BorderLayout.SOUTH);
		container.add(new JButton("Salvar"));
		JTextArea jtarea = new JTextArea("Digite o texto aqui:");
		container.add(jtarea,BorderLayout.CENTER);
//		container.setLayout(new GridLayout(2,1));
//		container.add(new JLabel("Isto é um rótulo!"));
		frame.setVisible(true);

	}

}
