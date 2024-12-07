package atividades.unidade6.event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JTFApp extends JFrame implements ActionListener{

	public static void main(String[] args) {
		
		JTFApp frame = new JTFApp();
		frame.setTitle("Primeira Aplicação");
		frame.setSize(350,250);
		Container container = frame.getContentPane();
		JTextField jtf = new JTextField("Digite Aqui");
		jtf.addActionListener(frame);
		container.add(jtf,BorderLayout.NORTH);
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(null, e.getActionCommand().toString());
		
	}

}
