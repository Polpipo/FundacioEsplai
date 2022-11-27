package main.com;

import java.awt.Color;

import javax.swing.JFrame;

public class Ejercicio53 {
	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		jframe.setTitle("Fundació Esplai");
		jframe.setSize(800,600);
		jframe.setVisible(true);
		jframe.setLocationRelativeTo(null);
		jframe.getContentPane().setBackground(new Color(5,65,90));
		jframe.setResizable(false);
	}
}
