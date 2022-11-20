package main.com;
public class Ejercicio25 {
	public static void main(String[] args) {
		
		int datoMax = 6;
		int datoMin = 1;
		
		int randomDato = (int)(Math.random()*(datoMax-datoMin))+datoMin;

		switch(randomDato) {
			case 1: {
				datoByte();
				break;	
			}
			case 2: {
				datoShort();
				break;	
			}
			case 3: {
				datoInteger();
				break;	
			}
			case 4: {
				datoLong();
				break;	
			}
			case 5: {
				datoFloat();
				break;	
			}
			case 6: {
				datoDouble();
				break;	
			}
		}
	
		rangos();
	}
	
	public static void datoByte() {
		System.out.println("El tipo de datos: " + Byte.TYPE);
		System.out.println("Está formado por: " + Byte.BYTES + " Bytes");
		System.out.println("Está formado por: " + Byte.SIZE + " Bits");
		System.out.println("Su Rango va del: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
		System.out.println();
	}
	public static void datoShort() {
		System.out.println("El tipo de datos: " + Short.TYPE);
		System.out.println("Está formado por: " + Short.BYTES + " Bytes");
		System.out.println("Está formado por: " + Short.SIZE + " Bits");
		System.out.println("Su Rango va del: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
		System.out.println();
	}
	public static void datoInteger() {
		System.out.println("El tipo de datos: " + Integer.TYPE);
		System.out.println("Está formado por: " + Integer.BYTES + " Bytes");
		System.out.println("Está formado por: " + Integer.SIZE + " Bits");
		System.out.println("Su Rango va del: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
		System.out.println();
	}
	public static void datoLong() {
		System.out.println("El tipo de datos: " + Long.TYPE);
		System.out.println("Está formado por: " + Long.BYTES + " Bytes");
		System.out.println("Está formado por: " + Long.SIZE + " Bits");
		System.out.println("Su Rango va del: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);
		System.out.println();
	}
	public static void datoFloat() {
		System.out.println("El tipo de datos: " + Float.TYPE);
		System.out.println("Está formado por: " + Float.BYTES + " Bytes");
		System.out.println("Está formado por: " + Float.SIZE + " Bits");
		System.out.println("Su Rango va del: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
		System.out.println();
	}
	public static void datoDouble() {
		System.out.println("El tipo de datos: " + Double.TYPE);
		System.out.println("Está formado por: " + Double.BYTES + " Bytes");
		System.out.println("Está formado por: " + Double.SIZE + " Bits");
		System.out.println("Su Rango va del: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);
		System.out.println();
	}
	
	
	public static void rangos() {
		System.out.println("Rango byte desde: " + Byte.MIN_VALUE + "			hasta: " + Byte.MAX_VALUE);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Rango short desde: " + Short.MIN_VALUE + "		hasta: " + Short.MAX_VALUE);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Rango int desde: " + Integer.MIN_VALUE + "		hasta: " + Integer.MAX_VALUE);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Rango long desde: " + Long.MIN_VALUE + "	hasta: " + Long.MAX_VALUE);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Rango float desde: " + Float.MIN_VALUE + "		hasta: " + Float.MAX_VALUE);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Rango double desde: " + Double.MIN_VALUE + "		hasta: " + Double.MAX_VALUE);
		System.out.println("-------------------------------------------------------------------------------");

	}
	
	
	
	
}

