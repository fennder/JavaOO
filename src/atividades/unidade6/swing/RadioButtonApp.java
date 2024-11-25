package atividades.unidade6.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButtonApp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Aplicação");
		frame.setSize(500,400);
		Container container = frame.getContentPane();
		container.setLayout(new FlowLayout());
		ButtonGroup btg = new ButtonGroup();
		JRadioButton jrb = new JRadioButton("Pequeno", true);
		btg.add(jrb);
		container.add(jrb);
		jrb = new JRadioButton("Médio");
		btg.add(jrb);
		container.add(jrb);
		jrb = new JRadioButton("Grande");
		btg.add(jrb);
		container.add(jrb);
		frame.setVisible(true);
		
		
	}

}
