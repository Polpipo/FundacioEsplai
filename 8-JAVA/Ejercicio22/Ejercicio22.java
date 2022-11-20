package main.com;
public class Ejercicio22 {
	public static void main(String[] args) {
		
		//UCRAINA:
		titulos("UCRAINA");
		espacio();
		int c = 0;
		for (int i = 0; i < 8; i++) {
			if(c<4) {
				System.out.println("\033[48;2;0;92;187m				\033[0m");
			} else {
				System.out.println("\033[48;2;255;214;0m				\033[0m");
			}
			
			c++;
		}
		
		espacio();
		espacio();
	
		//GRECIA:
		titulos("GRECIA");
		espacio();
		
		for (int i = 0; i < 9; i++) {
			switch (i) {
			case 0,4: {
				System.out.print("\033[48;2;9;94;175m   \033");
				System.out.print("\033[48;2;254;255;254m  \033");
				System.out.println("\033[48;2;9;94;175m   			\033");
				break;
			}
			case 1,3: {
				System.out.print("\033[48;2;9;94;175m   \033");
				System.out.print("\033[48;2;254;255;254m  \033");
				System.out.print("\033[48;2;9;94;175m   \033");
				System.out.println("\033[48;2;254;255;254m				\033");
				break;
			}
			case 2: {
				System.out.print("\033[48;2;254;255;254m        \033");
				System.out.println("\033[48;2;9;94;175m				\033");
				break;
			}
			case 5,7: {
				System.out.println("\033[48;2;254;255;254m					\033");
				break;
			}
			case 6,8: {
				System.out.println("\033[48;2;9;94;175m   				\033[0m");
				break;
			}
			
			default:
				
			}
		}
		
		espacio();
		espacio();
		
		//FRANCIA:
		titulos("FRANCIA");
		espacio();
		
		for (int i = 0; i < 6; i++) {
			System.out.print("\033[48;2;4;28;152m		\033[0m");
			System.out.print("\033[48;2;255;255;255m		\033[0m");
			System.out.println("\033[48;2;231;46;52m		\033[0m");
		}
		
		espacio();
		espacio();
		
		//ESPAÑA:
		titulos("ESPAÑA");
		espacio();

		for (int i = 0; i < 7; i++) {
			switch (i) {
			case 0,1,5,6: {
				System.out.println("\033[48;2;173;21;24m				\033[0m");
				break;
			}
			case 2,3,4: {
				System.out.println("\033[48;2;250;189;5m				\033[0m");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + i);
			}
			
		}
		
		espacio();
		espacio();
		
		//CATALUNYA:
		titulos("CATALUNYA");
		espacio();
		
		for (int i = 0; i < 9; i++) {
			if(i%2==0) {
				System.out.println("\033[48;2;250;222;4m				\033[0m");
			} else {
				System.out.println("\033[48;2;218;21;25m				\033[0m");
			}
		}
		
		espacio();
		espacio();
		
		//ALEMANIA:
		titulos("ALEMANIA");
		espacio();
		
		int a = 0;
		for (int i = 0; i < 9; i++) {
			if(a<3) {
				System.out.println("\033[48;2;0;0;0m				\033[0m");
			} else if (a<6){
				System.out.println("\033[48;2;229;37;28m				\033[0m");
			} else {
				System.out.println("\033[48;2;251;204;0m				\033[0m");
			}
			
			a++;
		}
		
		

		
	

		
		
		
	
		
		
		
		
	}
	
	public static void titulos(String nombre) {
		System.out.println("\033[1;4m" + nombre + "\033[0m");
	}
	public static void espacio() {
		System.out.println();
	}
	
}
