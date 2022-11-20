package main.com;
public class Ejercicio23 {
	public static void main(String[] args) {
		
		//FORMATO DE TEXTO:
		int randomF = randomFormato();
		int randomColor = randomColor();
		int randomBg = randomBackground();
        
        System.out.println("\033[" + randomF + ";" + randomColor + ";" + randomBg + "mTEXTO DE PRUEBA\033[0m");
        
        
	}
	
	public static int randomFormato() {
		int formatoMax = 9;
		int formatoMin = 1;
		
		int randomFormato = (int)(Math.random()*(formatoMax-formatoMin))+formatoMin;

		switch(randomFormato) {
		case 5,6,8: {
			randomFormato = randomFormato-4;
			break;
		}	
		}
		return randomFormato;
	}
	
	public static int randomColor() {
		int colorMax = 39;
		int colorMin = 30;
		
		int randomColor = (int)(Math.random()*(colorMax-colorMin))+colorMin;
		
		return randomColor;
	}
	
	public static int randomBackground() {
		int bgMax = 49;
		int bgMin = 40;
		
		int randomBackground = (int)(Math.random()*(bgMax-bgMin))+bgMin;
		
		return randomBackground;
	}
}

