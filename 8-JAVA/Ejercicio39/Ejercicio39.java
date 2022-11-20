package main.com;

public class Ejercicio39 {
	public static void main(String[] args) {
		Cars honda = new Honda("Honda", 100);
		honda.getSpeed();
		
		Cars jeep = new Jeep("Jeep", 500);
		jeep.getSpeed();
		
		Cars bmw = new BMW("BMW", 800);
		bmw.getSpeed();
	}
}

class Cars{
	protected String company;
	protected int speed;
	
	public void getSpeed() {
		System.out.println(company + " car's speed is " + speed + "Km/hr");
	}
	
	public Cars(String company, int speed) {
		this.company = company;
		this.speed = speed;
	}
}

class Honda extends Cars{
	public Honda(String company, int speed) {
		super(company, speed);
		// TODO Auto-generated constructor stub
	}
}


class Jeep extends Cars{

	public Jeep(String company, int speed) {
		super(company, speed);
		// TODO Auto-generated constructor stub
	}
}

class BMW extends Cars{

	public BMW(String company, int speed) {
		super(company, speed);
		// TODO Auto-generated constructor stub
	}
	
}