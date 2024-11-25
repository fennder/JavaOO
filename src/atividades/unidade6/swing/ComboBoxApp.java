package atividades.unidade6.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxApp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Aplicação");
		frame.setSize(500,400);
		Container container = frame.getContentPane();
		container.setLayout( new FlowLayout());
		String[] paises = {"Brasil","EUA","Portugal","Argentina","Chile","Bolivia","Uruguai"};
		JComboBox<String> combo = new JComboBox<>(paises);
		container.add(combo);
		frame.setVisible(true);

	}

}
