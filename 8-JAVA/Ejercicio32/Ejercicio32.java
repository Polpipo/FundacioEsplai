package main.com;

public class Ejercicio32 {
public static void main(String[] args) {
	
	Car audi = new Car();
	audi.setFuel(true);
	audi.setMaxspeed(200);
	System.out.println("Is there more fuel? " + audi.getFuel());
	System.out.println("Which is the max speed? " + audi.getMaxspeed() + "km/h");
	
	Car mini = new Car();
	Car mercedes = new Car(false, 300);
	}
}

class Car {
	//Atributos
	private boolean fuel;
	private int maxSpeed;
	
	//Métodos:
	public Boolean getFuel() {
		return fuel;
	}
	public void setFuel(boolean fuel) {
		this.fuel = fuel;
	}
	public int getMaxspeed() {
		return maxSpeed;
	}
	public void setMaxspeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void drive () {
		System.out.println("Estás conduciendo");
	}
	
	//Constructor:
	public Car() {
		System.out.println("Se ha creado un objeto de Car desde el constructor sin parámetros");
	}
	
	public Car(boolean fuel, int maxSpeed) {
		this.fuel = fuel;
		this.maxSpeed = maxSpeed;
		
		System.out.println("Se ha creado un objeto de Car desde el constructor con parámetros");
		System.out.println("Fuel = " + fuel);
		System.out.println("Max Speed = " + maxSpeed);	
	}
	
}
