package main.com;
public class Ejercicio20 {
	public static void main(String[] args) {
		// PARTE 1:
		for (int i = 0; i < 3; i++) {
			System.out.println("Interacción con for numero " + (i+1));
		}
		
		int k = 0;
		while(k<3) {
			System.out.println("Interacción con while numero " + (k+1));
			k++;
		}
		
		
		//PARTE 2:
		String iteracion = "Iteración ";
		for (int p = 0; p < 10; p++) {
			if(p==4) {continue;}
			System.out.println(iteracion + (p+1));
		}
		
	}
}
