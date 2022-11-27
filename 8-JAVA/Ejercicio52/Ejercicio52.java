package main.com;

import javax.swing.JOptionPane;

public class Ejercicio52 {
	public static void main(String[] args) {
		String[] options = {"Yes! Please.", "No way!", "tercer boton", "cuarto boton"}; 
        JOptionPane.showOptionDialog(
           null,
           "Sure? You want to exit?", 
           "Swing Tester",            
           JOptionPane.YES_NO_OPTION,
           JOptionPane.QUESTION_MESSAGE,
           null,     //no custom icon
           options,  //button titles
           options[0] //default button
        );
	}
}
