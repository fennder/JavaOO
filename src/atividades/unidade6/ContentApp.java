package atividades.unidade6;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ContentApp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Primeira Janela da Aplicação");
		frame.setSize(800,600);
		Container container = frame.getContentPane();
		container.setLayout(new GridLayout(2,1));
		container.add(new JLabel("Isto é um rótulo!"));
		frame.setVisible(true);

	}

}
