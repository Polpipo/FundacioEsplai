package main.com;
public class Ejercicio26 {
	public static void main(String[] args) {
	//PARTE 1:
		
		//a)
		byte numByte = 23;
		short numShort = 2345;
		int numInt = 23456;
		long numLong = 123456L;
		
		//b) No se puede obtener la clase de ninguna de ellas ya que todos son tipos primitivos y no tienen métodos.
		
		//c)
		
			//c.1)
		System.out.println(((Object)numByte).getClass().getName());
		System.out.println(((Object)numShort).getClass().getName());
			
			//c.2)
			Integer numIntWrapped = numInt;
			System.out.println(numIntWrapped.getClass().getName());
			
			Long numLongWrapped = numLong;
			System.out.println(numLongWrapped.getClass().getName());
			
			
	//PARTE 2:
			
		Long variableLong = 12345L;
		System.out.println(variableLong.getClass().getName());
			
			
		var variable = "Hola";
		System.out.println(((Object)variable).getClass().getName());
	}
}
