package main.com;

import javax.swing.JOptionPane;

public class Ejercicio50 {
	public static void main(String[] args) {
		String numero = JOptionPane.showInputDialog("Introduce un número del 1 al 5");
		
		for (int i = 0; i < 5; i++) {
			switch (numero) {
				case "1": {
					JOptionPane.showMessageDialog(null, "Mensaje sin icono", "Sin icono", JOptionPane.PLAIN_MESSAGE);
					numero = JOptionPane.showInputDialog("Introduce un número del 1 al 5");
					break;
				}
				case "2": {
					JOptionPane.showMessageDialog(null, "Mensaje de error", "Error", JOptionPane.ERROR_MESSAGE);
					numero = JOptionPane.showInputDialog("Introduce un número del 1 al 5");
					break;
				}
				case "3": {
					JOptionPane.showMessageDialog(null, "Mensaje de información", "Información", JOptionPane.INFORMATION_MESSAGE);
					numero = JOptionPane.showInputDialog("Introduce un número del 1 al 5");
					break;
				}
				case "4": {
					JOptionPane.showMessageDialog(null, "Mensaje de warning", "Warning", JOptionPane.WARNING_MESSAGE);
					numero = JOptionPane.showInputDialog("Introduce un número del 1 al 5");
					break;
				}
				case "5": {
					JOptionPane.showMessageDialog(null, "Mensaje de pregunta", "Question", JOptionPane.QUESTION_MESSAGE);
					numero = JOptionPane.showInputDialog("Introduce un número del 1 al 5");
					break;
				}
				default:
					JOptionPane.showMessageDialog(null, "INTRODUCE UN VALOR CORRECTO", "ERROR", JOptionPane.ERROR_MESSAGE);
					numero = JOptionPane.showInputDialog("Introduce un número del 1 al 5");
					break;
			}
		}
	}
}
