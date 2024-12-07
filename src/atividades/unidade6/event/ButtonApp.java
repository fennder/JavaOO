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
import javax.swing.UIManager;

public class ButtonApp extends JFrame implements ActionListener, WindowListener{

	public UIManager.LookAndFeelInfo looks[];
	
	public static void main(String[] args) {
		
		ButtonApp frame = new ButtonApp();
		frame.setTitle("Primeira Janela da Aplicação");
		frame.setSize(800,600);
		Container container = frame.getContentPane();
		container.setLayout(new FlowLayout());
		JButton botao = new JButton("Isso é um boão.");
		botao.addActionListener(frame);
		container.add(botao);
		frame.addWindowListener(frame);
		//L%F
		frame.looks = UIManager.getInstalledLookAndFeels();
		try {
			UIManager.setLookAndFeel(frame.looks[3].getClassName());
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(null, e.getActionCommand().toString());
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		JOptionPane.showMessageDialog(null, "Encerrando a aplicação");
		System.exit(0);
		
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
