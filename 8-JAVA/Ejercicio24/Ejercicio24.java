package main.com;
public class Ejercicio24 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			
			   for (int j = 0; j < 10 - i; j++) {
				   System.out.print(" ");
			   };
			   
			   for (int k = 0; k < (2 * i + 1); k++) {
				   System.out.print("\033[48;2;27;159;17;92m*\033[0m");
			   };
			   
			   System.out.println();
		};
		
		for (int i = 0; i < 2; i++) {
			System.out.println("        \033[48;2;13;13;13;30m*****\033[0m");
		}
	}
}
