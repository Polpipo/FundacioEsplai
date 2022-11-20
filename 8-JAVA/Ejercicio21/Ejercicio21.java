package main.com;
public class Ejercicio21 {
	public static void main(String[] args) {
		//PARTE 1:
		System.out.println(javaOrNull("java"));
		
		//PARTE 2:
		System.out.println(login("admin", 1234));
		
		//PARTE 3:
		System.out.println(parOImpar());
	}
	
	
	public static String javaOrNull(String nombre) {
		if(nombre!="java") {
			return "null";
		}else {
			return "java";
		}
	}
	
	
	public static String login(String usuario, int password) {
		if(usuario=="admin" && password==1234) {
			return "Login true";
		}else {
			return "Login false";
		}
	}
	
	
	public static Boolean parOImpar() {
		long numero = Math.round(Math.random()*10);
		
		if(numero%2==0) {
			return true;
		} else {
			return false;
		}
	}
}
