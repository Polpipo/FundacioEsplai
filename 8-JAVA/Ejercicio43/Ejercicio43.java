package main.com;

import java.util.Scanner;
import java.io.InputStream;

public class Ejercicio43 {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		Scanner sc = new Scanner(inputStream);
		
		System.out.print("INTODUCE \"Federico\": ");
		String federico = sc.nextLine();
		System.out.println(federico);
		
		System.out.print("INTODUCE \"GarciaLorca\": ");
		String garciaLorca = sc.nextLine();
		System.out.println(garciaLorca);
		
		Lorca lorca = new Lorca();
		NotAutorized notAutorized = new NotAutorized();
		
		if((federico=="Federico") && (garciaLorca=="GarciaLorca")) {
			lorca.recitarPoema();
		} else {
			notAutorized.noEsperado();
		}
	}
	 
}

class Lorca {
	public void recitarPoema(){
		System.out.println("A las cinco de la tarde.\n"
				+ "\n"
				+ "Eran las cinco en punto de la tarde.\n"
				+ "\n"
				+ "Un niño trajo la blanca sábana\n"
				+ "a las cinco de la tarde.\n"
				+ "\n"
				+ "Una espuerta de cal ya prevenida\n"
				+ "a las cinco de la tarde.");
	}
}

class NotAutorized {
	public void noEsperado() {
		System.out.println("Los parametros introducidos no son los esperados");
	}
}