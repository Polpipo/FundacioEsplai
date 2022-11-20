package main.com;

public class Ejercicio31 {
	public static void main(String[] args) {
		
		//Ejercicio 1:
		technologies1();
		System.out.println();
		
		//Ejercicio 2:
		technologies2();
		System.out.println();
		
	
		//Ejercicio 3:
        System.out.println(num1);
        fibonacci();
        System.out.println();
         
        
        //Ejercicio 4:
        superCali();
        System.out.println(reverse);
        System.out.println();
	}
	
	
	
	
	static int arr1=0, arr2=0;
	static String[] technologies = {"Markdown", "Regexp", "HTML", "CSS", "JS", "SQL", "Java"};
	
	//Ejercicio 1:
	public static void technologies1() {
		if(arr1<technologies.length) {
			System.out.println(technologies[arr1]);
			arr1++;
			technologies1();
		}
	}
	
	//Ejercicio 2:
	public static void technologies2() {
		if(arr2!=3) {
			System.out.println(technologies[arr2]);
			arr2++;
			technologies2();
		}	
	}
	
	//Ejercicio 3:
	static int num1 = 0, num2 = 1, suma = 1;
	static int numeroFinal = 170;
	
	public static void fibonacci() {
		if(suma < numeroFinal) {
    		System.out.println(suma);
            
            suma = num1 + num2;
            
            num1 = num2;
            
            num2 = suma;
            
            fibonacci();
    	}
	}
	
	//Ejercicio 4:
	static String cali = "supercalifragilisticoespialidoso";
	static StringBuilder reverse = new StringBuilder();
	static int l = cali.length()-1;
	
	public static void superCali() {
		if(l>=0) {
			reverse.append(cali.charAt(l));
			l--;
			superCali();
		}
	}
}

