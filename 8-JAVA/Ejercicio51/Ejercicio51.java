package main.com;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Ejercicio51 {
	public static void main(String[] args) {
		Object [] animals = {"Perro", "Gato", "Caballo", "Lobo"};
		String animal = (String)JOptionPane.showInputDialog(
				null, "Selecciona un animal", 
				null, JOptionPane.PLAIN_MESSAGE,
				null, animals, "Lobo");
	
		ImageIcon gatoIcon = null;
		try {
			gatoIcon = new ImageIcon(new URL("https://cdn.onemars.net/sites/nutro_es_NkyIN_B9cV/image/gettyimages-175925832_1615921990619.jpeg"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ImageIcon perroIcon = null;
		try {
			perroIcon = new ImageIcon(new URL("https://www.elmueble.com/medio/2022/09/05/perro-cachorro_82dd9cd3_900x900.jpg"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ImageIcon caballoIcon = null;
		try {
			caballoIcon = new ImageIcon(new URL("https://www.zotal.com/wp-content/uploads/2019/08/razascaballos.png"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ImageIcon loboIcon = null;
		try {
			loboIcon = new ImageIcon(new URL("https://t2.ea.ltmcdn.com/es/posts/6/4/5/donde_viven_los_lobos_24546_orig.jpg"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println(animal);
		switch (animal) {
		case "Perro": {
			JOptionPane.showMessageDialog(
					null, "Has seleccionado al perro", 
			        "PERRO", 
			        JOptionPane.INFORMATION_MESSAGE,
			        perroIcon);
			break;
		}
		case "Gato": {
			JOptionPane.showMessageDialog(
					null, "Has seleccionado al gato", 
			        "GATO", 
			        JOptionPane.INFORMATION_MESSAGE,
			        gatoIcon);
			break;
		}
		case "Caballo": {
			JOptionPane.showMessageDialog(
					null, "Has seleccionado al caballo", 
			        "CABALLO", 
			        JOptionPane.INFORMATION_MESSAGE,
			        caballoIcon);
			break;
		}
		case "Lobo": {
			JOptionPane.showMessageDialog(
					null, "Has seleccionado al lobo", 
			        "LOBO", 
			        JOptionPane.INFORMATION_MESSAGE,
			        loboIcon);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + animal);
		}
	}
}
