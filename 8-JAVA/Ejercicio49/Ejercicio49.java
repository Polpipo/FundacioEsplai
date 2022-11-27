package main.com;
import javax.swing.JOptionPane;

public class Ejercicio49 {
	public static void main(String[] args) {
		
		String nombre = (String)JOptionPane.showInputDialog("Introduce tu nombre:");
		
		while(nombre == null || nombre.length() == 0) {
			JOptionPane.showMessageDialog(null, "Rellena correctamente el mensaje anterior", "Error", JOptionPane.WARNING_MESSAGE);
			nombre = (String)JOptionPane.showInputDialog("Introduce tu nombre:");
		}
		
		JOptionPane.showMessageDialog(null, "Tu nombre es: " + nombre, "Tu nombre", JOptionPane.INFORMATION_MESSAGE);
	}
}
