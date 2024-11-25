package atividades.unidade6.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;

public class ScrollBarApp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Aplicação");
		frame.setSize(500,400);
		Container container = frame.getContentPane();
		JScrollBar sbar = new JScrollBar(JScrollBar.HORIZONTAL);
		JScrollBar sbar1 = new JScrollBar(JScrollBar.VERTICAL);
		container.add(sbar,BorderLayout.NORTH);
		container.add(sbar1,BorderLayout.EAST);
		frame.setVisible(true);

	}

}
