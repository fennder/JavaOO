package atividades.graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;

public class Graficos extends JApplet{

	private static final long serialVersionUID = 1L;
	
//	protected void init() {
//		System.out.println("Inicializando...");
//	}
	
	@Override
	public void paint(Graphics g) {
		this.setBackground(Color.GREEN);
		//g.drawRect(0,0,150,150);
		g.setColor(Color.CYAN);
		this.setSize(400, 300);
		g.setFont(new Font("Times New Roman", Font.BOLD, 30));
		g.drawString("Version JVM" + System.getProperty("java.version"), 20, 20);
		g.drawString("Versão S.O" + System.getProperty("os.name"), 50, 50);
	}
	
	public static void main(String[] args) {
		
	}

}
