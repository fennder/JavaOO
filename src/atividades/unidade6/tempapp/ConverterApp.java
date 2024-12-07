package atividades.unidade6.tempapp;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConverterApp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Celcius Converter");
		frame.setSize(500,400);
		Container container = frame.getContentPane();
		//container.setLayout(new GridLayout(2,2));
		container.setLayout(new FlowLayout());
		container.add(new JTextField("O"));
		container.add(new JLabel("Celcius"));
		container.add(new JButton("Converter"));
		container.add(new JLabel("32 Fahrenheit"));
		frame.setVisible(true);

	}

}
