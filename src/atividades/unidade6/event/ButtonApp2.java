package atividades.unidade6.event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ButtonApp2 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Primeira Janela da Aplicação");
		frame.setSize(800,600);
		Container container = frame.getContentPane();
		container.setLayout(new FlowLayout());
		JButton botao = new JButton("Isso é um boão.");
		botao.addActionListener(e->{
			JOptionPane.showMessageDialog(null, "Encerrando a aplicação");
			System.exit(0);
		});
		
		container.add(botao);
		frame.setVisible(true);

	}

}
