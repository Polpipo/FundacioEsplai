package main.com;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejercicio54 {
	public static void main(String[] args) {
	
		JFrame jframe = new JFrame();
		jframe.setTitle("Border Layout");
		jframe.setBounds(0,0,500,500);
		
		jframe.setLocationRelativeTo(null);
		
		Container container = jframe.getContentPane();
		BorderLayout border = new BorderLayout();
		
		container.setLayout(border);
		
		JButton btn1 = new JButton("Btn 1");
		JButton btn2 = new JButton("Btn 2");
		JButton btn3 = new JButton("Btn 3");
		JButton btn4 = new JButton("Btn 4");
		JButton btn5 = new JButton("Btn 5");
		
		container.add(btn1, BorderLayout.NORTH);
		container.add(btn2, BorderLayout.EAST);
		container.add(btn3, BorderLayout.CENTER);
		container.add(btn4, BorderLayout.WEST);
		container.add(btn5, BorderLayout.SOUTH);

		btn1.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el boton 1", "BOTON NORTE", JOptionPane.INFORMATION_MESSAGE);
		});
		btn2.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el boton 2", "BOTON ESTE", JOptionPane.INFORMATION_MESSAGE);
		});
		btn3.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el boton 3", "BOTON CENTRO", JOptionPane.INFORMATION_MESSAGE);
		});
		btn4.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el boton 4", "BOTON OESTE", JOptionPane.INFORMATION_MESSAGE);
		});
		btn5.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el boton 5", "BOTON SUD", JOptionPane.INFORMATION_MESSAGE);
		});
		
		jframe.setVisible(true);
	}
}
