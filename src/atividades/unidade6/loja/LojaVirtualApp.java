package atividades.unidade6.loja;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class LojaVirtualApp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Loja Virtual");
		frame.setSize(500,400);
		Container container = frame.getContentPane();
		JMenuBar barra = new JMenuBar();
		JMenu m1 = new JMenu("Clientes");
		JMenuItem m11 = new JMenuItem("Novo");
		JMenuItem m12 = new JMenuItem("Consultar");
		JMenuItem m13 = new JMenuItem("Alterar");
		JMenuItem m14 = new JMenuItem("Excluir");		
		m1.add(m11);
		m1.add(m12);
		m1.add(m13);
		m1.add(m14);
		JMenu m2 = new JMenu("Cursos");
		JMenuItem m21 = new JMenuItem("Novo");
		JMenuItem m22 = new JMenuItem("Consultar");
		JMenuItem m23 = new JMenuItem("Alterar");
		JMenuItem m24 = new JMenuItem("Excluir");
		m2.add(m21);
		m2.add(m22);
		m2.add(m23);
		m2.add(m24);
		
		barra.add(m1);
		barra.add(m2);
		
		frame.setJMenuBar(barra);
		frame.setVisible(true);

	}

}
