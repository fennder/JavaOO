package atividades.unidade6.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;

public class JMenuApp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Aplicação");
		frame.setSize(500,400);
		Container container = frame.getContentPane();
		JMenuBar barra = new JMenuBar();
		JMenu m1 = new JMenu("Arquivo");
		JMenuItem m11 = new JMenuItem("Novo");
		JMenuItem m12 = new JMenuItem("Abrir");
		JMenuItem m13 = new JMenuItem("Salvar");
		JMenuItem m14 = new JMenuItem("Sair");
		JMenu m2 = new JMenu("Ajuda");
		JMenuItem m21 = new JMenuItem("Conteúdo");
		JMenuItem m22 = new JMenuItem("Sobre");
		m1.add(m11);
		m1.add(m12);
		m1.add(m13);
		m1.addSeparator();
		m1.add(m14);
		m2.add(m21);
		m2.addSeparator();
		m2.add(m22);
		barra.add(m1);
		barra.add(m2);
		
		frame.setJMenuBar(barra);
		frame.setVisible(true);

	}

}
