public class Ejercicio16 {
	public static void main(String[] args) {
		
		//PARTE 1:
		int num = (int) (Math.round(Math.random()));
		
		boolean result;
		if (num==0) {
			result = false;
			System.out.println("ROJO");
		}else{
			result = true;
			System.out.println("NEGRO");
		}
		
		System.out.println(result);
		
		
		//PARTE 2:
		double temperatura = 30;
		
		if (temperatura < 10) {
			System.out.println(
					"La temperatura es de " + temperatura +
					"\nEsta temperatura pertenece a la categoría de CLIMAS FRÍOS"
					);
		}else if(temperatura < 20){
			System.out.println(
					"La temperatura es de " + temperatura +
					"\nEsta temperatura pertenece a la categoría de CLIMAS TEMPLADOS"
					);
		}else {
			System.out.println(
					"La temperatura es de " + temperatura +
					"\nEsta temperatura pertenece a la categoría de CLIMAS CÁLIDOS"
					);
		}
	}
}
