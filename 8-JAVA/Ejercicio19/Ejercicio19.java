package main.com;
public class Ejercicio19 {
	public static void main(String[] args) {
		
		//PARTE 1:
		
		for(int i=100 ; i > 0; i--) {
			if(i%2 == 0){
				System.out.println(i);
			}
		}
		
		
		//PARTE 2:
		int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
		
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i]%3==0) {
				System.out.println(intArray[i]);
			}
		}
		
		
		int j = 0;
		while (j < intArray.length) {
			if(intArray[j]%3==0) {
				System.out.println(intArray[j]);
			}
			j++;
		}
		
		
		/*
		//PARTE 3:
		saludar();
		
		int saludos = 10;
		
		for(int i = 0; i < saludos; i++) {
			saludar();
		}
		
		
		int j = 0;
		while(j < saludos){
			saludar();
			j++;
		}
		
		int p = 0;
		do{
			saludar();
			p++;
		}while(p < saludos);
		*/
		
		
		//PARTE 4:
		String abecedario = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
		
		String newAbecedario;
		
		for (int i = 0; i < 26; i++) {
			newAbecedario = abecedario.substring(i);
			
			System.out.println(newAbecedario);
		}
		for (int i = 26; i >= 0; i--) {
			newAbecedario = abecedario.substring(i);
			
			System.out.println(newAbecedario);
		}
	
			
	}

	public static void saludar() {
		System.out.println("¡Hola!");
	}
}
