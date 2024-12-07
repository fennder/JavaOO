package atividades.unidade6.event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JTFApp2 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("Primeira Aplicação");
		frame.setSize(350,250);
		Container container = frame.getContentPane();
		JTextField jtf = new JTextField("Digite Aqui");
		jtf.addActionListener(e->{
			JOptionPane.showMessageDialog(null, e.getActionCommand().toString());
		});
		
		container.add(jtf,BorderLayout.NORTH);
		frame.setVisible(true);

	}

}
