package main.com;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejercicio56 {
	public static void main(String[] args) {
	
		JFrame jframe = new JFrame();
		jframe.setTitle("Border Layout");
		jframe.setBounds(0,0,500,500);
		
		jframe.setLocationRelativeTo(null);
		
		Container container = jframe.getContentPane();
		
		//PARTE 1:
		/*
		GridLayout grid1 = new GridLayout(2,2);
		
		container.setLayout(grid1);
		
		JButton btn1 = new JButton("North");
		JButton btn2 = new JButton("South");
		JButton btn3 = new JButton("East");
		JButton btn4 = new JButton("West");
		
		container.add(btn1);
		container.add(btn2);
		container.add(btn3);
		container.add(btn4);

		btn1.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el NORTE", "BOTON NORTE", JOptionPane.INFORMATION_MESSAGE);
		});
		btn2.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el SUD", "BOTON SUD", JOptionPane.INFORMATION_MESSAGE);
		});
		btn3.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el ESTE", "BOTON ESTE", JOptionPane.INFORMATION_MESSAGE);
		});
		btn4.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el OESTE", "BOTON OESTE", JOptionPane.INFORMATION_MESSAGE);
		});
		
		*/
		
		
		
		//PARTE 2:
		GridLayout grid2 = new GridLayout(3,3);
		
		container.setLayout(grid2);
		
		JButton boton1 = new JButton("Contacts");
		JButton boton2 = new JButton("Message");
		JButton boton3 = new JButton("Call Log");
		JButton boton4 = new JButton("Games");
		JButton boton5 = new JButton("Settings");
		JButton boton6 = new JButton("Applications");
		JButton boton7 = new JButton("Music");
		JButton boton8 = new JButton("Gallery");
		JButton boton9 = new JButton("Organiser");
		

		
		container.add(boton1);
		container.add(boton2);
		container.add(boton3);
		container.add(boton4);
		container.add(boton5);
		container.add(boton6);
		container.add(boton7);
		container.add(boton8);
		container.add(boton9);

		
		boton1.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el Contacts", "CONTACTS", JOptionPane.INFORMATION_MESSAGE);
		});
		boton2.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el Message", "MESSAGE", JOptionPane.INFORMATION_MESSAGE);
		});
		boton3.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el Call Log", "CALL LOG", JOptionPane.INFORMATION_MESSAGE);
		});
		boton4.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el Games", "GAMES", JOptionPane.INFORMATION_MESSAGE);
		});
		boton5.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el Settings", "SETTINGS", JOptionPane.INFORMATION_MESSAGE);
		});
		boton6.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el Applications", "APPLICATIONS", JOptionPane.INFORMATION_MESSAGE);
		});
		boton7.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el Music", "MUSIC", JOptionPane.INFORMATION_MESSAGE);
		});
		boton8.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el Gallery", "GALLERY", JOptionPane.INFORMATION_MESSAGE);
		});
		boton9.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el Organiser", "ORGANISER", JOptionPane.INFORMATION_MESSAGE);
		});

		
		
		jframe.setVisible(true);
	}
}
