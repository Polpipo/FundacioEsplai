public class Ejercicio17 {
	public static void main(String[] args) {
		// PARTE A:
		int num1 = 11;
		
		switch (num1) {
		case 0: {
			System.out.println("Cero");
			break;
		}
		case 1: {
			System.out.println("Uno");
			break;
		}
		case 2: {
			System.out.println("Dos");
			break;
		}
		case 3: {
			System.out.println("Tres");
			break;
		}
		case 4: {
			System.out.println("Cuatro");
			break;
		}
		case 5: {
			System.out.println("Cinco");
			break;
		}
		case 6: {
			System.out.println("Seis");
			break;
		}
		case 7: {
			System.out.println("Siete");
			break;
		}
		case 8: {
			System.out.println("Ocho");
			break;
		}
		case 9: {
			System.out.println("Nueve");
			break;
		}
		case 10: {
			System.out.println("Diez");
			break;
		}
		
		default:
			System.out.println("Unexpected value: " + num1);
		}
		
		
		// PARTE B:
		String positivo = "¡Es positivo!";
		String negativo = "¡Es negativo!";
		String cero = "¡Es cero, na de ná!";
		
		int num2 = -2;
		
		String verificacion = num2 > 0 ? positivo: num2 < 0 ? negativo : cero;
		
		System.out.println(verificacion);
		
	}
}
