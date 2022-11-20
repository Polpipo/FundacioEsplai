public class Ejercicio15 {
	public static void main(String[] args) {
		
		//PARTE 1:
		int num1 = 2;
		
		if (num1%2==1) {
			System.out.println("El número es impar");
		}else {
			System.out.println("El número es par");
		}
		
		//PARTE 2:
		int num2 = (int) (Math.round(Math.random()));
		
		if (num2==0) {
			System.out.println("Blanco");
		}else {
			System.out.println("Negro");
		}
		
	}
}
