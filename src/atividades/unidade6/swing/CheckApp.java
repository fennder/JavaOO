package atividades.unidade6.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckApp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Aplicação");
		frame.setSize(400,500);
		Container container = frame.getContentPane();
		container.setLayout(new FlowLayout());
		container.add(new JCheckBox("1- Sim"));
		container.add(new JCheckBox("2- Não"));
		frame.setVisible(true);

	}

}
