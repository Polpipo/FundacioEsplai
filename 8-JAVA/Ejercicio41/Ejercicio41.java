package main.com;

import java.util.Scanner;
import java.io.InputStream;

public class Ejercicio41 {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		Scanner sc = new Scanner(inputStream);
		
		System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Introduce tu primer apellido: ");
		String apellido1 = sc.nextLine();
		
		System.out.print("Introduce tu segundo apellido: ");
		String apellido2 = sc.nextLine();
		
		System.out.println("Tu nombre completo es " + nombre + " " + apellido1 + " " + apellido2);
	}
}
