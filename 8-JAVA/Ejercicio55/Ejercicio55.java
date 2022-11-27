package main.com;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejercicio55 {
	public static void main(String[] args) {
	
		JFrame jframe = new JFrame();
		jframe.setTitle("Flow Layout");
		jframe.setBounds(0,0,500,500);
		jframe.setLocationRelativeTo(null);
		
		
		JButton btn1 = new JButton("Btn 1");
		JButton btn2 = new JButton("Btn 2");
		JButton btn3 = new JButton("Btn 3");
		JButton btn4 = new JButton("Btn 4");
		JButton btn5 = new JButton("Btn 5");
		JButton btn6 = new JButton("Btn 6");
		JButton btn7 = new JButton("Btn 7");
		JButton btn8 = new JButton("Btn 8");
		
		/*
		 //FLOW LEFT:
		
		Container container1 = jframe.getContentPane();
	
		FlowLayout flowleft = new FlowLayout(FlowLayout.LEFT);
		
		container1.setLayout(flowleft);
		
		container1.add(btn1);
		container1.add(btn2);
		container1.add(btn3);
		container1.add(btn4);
		container1.add(btn5);
		container1.add(btn6);
		container1.add(btn7);
		container1.add(btn8);
		 
		 */
		
		
		/*
		 //FLOW RIGHT:
		Container container2 = jframe.getContentPane();
		 
		FlowLayout flowright = new FlowLayout(FlowLayout.RIGHT);
		 
		container2.setLayout(flowright);
		 
		container2.add(btn1);
		container2.add(btn2);
		container2.add(btn3);
		container2.add(btn4);
		container2.add(btn5);
		container2.add(btn6);
		container2.add(btn7);
		container2.add(btn8);
		
		  */
		
		
		
		 //FLOW CENTER:
		Container container3 = jframe.getContentPane();
		 
		FlowLayout flowcenter = new FlowLayout(FlowLayout.CENTER);
		 
		container3.setLayout(flowcenter);
		 
		container3.add(btn1);
		container3.add(btn2);
		container3.add(btn3);
		container3.add(btn4);
		container3.add(btn5);
		container3.add(btn6);
		container3.add(btn7);
		container3.add(btn8);
		

		container3.setLayout(flowcenter);
		


		btn1.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el boton 1", "BOTON 1", JOptionPane.INFORMATION_MESSAGE);
		});
		btn2.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el boton 2", "BOTON 2", JOptionPane.INFORMATION_MESSAGE);
		});
		btn3.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el boton 3", "BOTON 3", JOptionPane.INFORMATION_MESSAGE);
		});
		btn4.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el boton 4", "BOTON 4", JOptionPane.INFORMATION_MESSAGE);
		});
		btn5.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el boton 5", "BOTON 5", JOptionPane.INFORMATION_MESSAGE);
		});
		btn6.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el boton 6", "BOTON 6", JOptionPane.INFORMATION_MESSAGE);
		});
		btn7.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el boton 7", "BOTON 7", JOptionPane.INFORMATION_MESSAGE);
		});
		btn8.addActionListener(e -> {
			JOptionPane.showMessageDialog(null, "Has dado click en el boton 8", "BOTON 8", JOptionPane.INFORMATION_MESSAGE);
		});
		
		
		jframe.setVisible(true);
	}
}
