package main.com;
public class Ejercicio27 {
	public static void main(String[] args) {
		//PARTE 1:
		double numDouble = 1234567.89;
		System.out.println(numDouble);
		float numFloat = (float) numDouble;
		System.out.println(numFloat);
		long numLong = (long) numDouble;
		System.out.println(numLong);
		int numInt = (int) numDouble;
		System.out.println(numInt);
		short numShort = (short) numDouble;
		System.out.println(numShort);
		byte numByte = (byte) numDouble;
		System.out.println(numByte);
		
		
		System.out.println();
		
		//PARTE 2: 
		byte numBytes = 123;
		System.out.println(numBytes);
		short numShorts = numBytes;
		System.out.println(numShorts);
		int numInts = numBytes;
		System.out.println(numInts);
		long numLongs = numBytes;
		System.out.println(numLongs);
		float numFloats = numBytes;
		System.out.println(numFloats);
		double numDoubles = numBytes;
		System.out.println(numDoubles);
		
		System.out.println();
		
		//PARTE 3:
		byte num3 = 100;
		short num4 = (short) (((short)num3) * 2);
		System.out.println(num4);
		
	}
}
