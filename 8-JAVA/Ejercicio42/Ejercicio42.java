package main.com;

import java.io.InputStream;
import java.util.Scanner;

public class Ejercicio42 {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		/*
		//PARTE 1:
		try (Scanner sc = new Scanner(inputStream)) {
			System.out.print("Introduce tu edad: ");
			int edad = sc.nextInt();
			System.out.println("Tienes " + edad + " años");
			
			System.out.print("¿Cuantos años tenía la reina de inglaterra? ");
			long reina = sc.nextLong();
			System.out.println("La reina de inglaterra tenía " + reina + " años");
			
			System.out.print("¿Cuanto dinero tienes ahorrado? ");
			short dinero = sc.nextShort();
			System.out.println("Tienes " + dinero + "€ ahorrados");
			
			System.out.print("¿Cual es tu nota media de guardería? ");
			double nota = sc.nextDouble();
			System.out.println("Tienes una media de " + nota + " en la guardería. Enhorabuena");
			
			System.out.print("¿Cuantos padres tienes? ");
			byte padres = sc.nextByte();
			System.out.println("Tienes " + padres + " padres");
			
			System.out.print("¿Tienes perro? ");
			boolean perro = sc.nextBoolean();
			System.out.println(perro);
			
			System.out.print("Introduce una frase motivadora: ");
			String frase = sc.nextLine();
			System.out.println("Tu frase es: \"" + frase + "\"");
		}catch(Exception e) {
			System.err.println(e);
		}
		*/
		
		//PARTE 2:
		
		try {
			System.out.println(dividirZero());
		}catch (Exception e) {
			System.err.println(e);
		}
		
		try {
			System.out.println(StringVacia(null));
			
		}catch (Exception e) {
			System.err.println(e);
		}
		
		
	}
	
	public static int dividirZero () {
		return 5/0;
	}
	
	public static int StringVacia(String txt) throws NullPointerException {
		return txt.length();
	}
	
}
