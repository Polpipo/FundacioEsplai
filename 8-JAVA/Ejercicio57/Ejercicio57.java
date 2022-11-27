package main.com;

public class Ejercicio57 {
	public static void main(String[] args) {
		Coche coche1 = new CocheBuilder().setMarca("Seat").setModelo("Ibiza").setCaballos(200).setMotor("Bueno").build();
		System.out.println(coche1.toString());
	}
}



class Coche {
	private String marca;
	private String modelo;
	private int caballos;
	private String motor;
	
	public Coche(String marca, String modelo, int caballos, String motor) {
		this.marca = marca;
		this.modelo = modelo;
		this.caballos = caballos;
		this.motor = motor;
	}
	public Coche(String marca, String modelo, int caballos) {
		this.marca = marca;
		this.modelo = modelo;
		this.caballos = caballos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCaballos() {
		return caballos;
	}

	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}
	
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", caballos=" + caballos + ", motor=" + motor + "]";
	}
}

class CocheBuilder {
	private String marca;
	private String modelo;
	private int caballos;
	private String motor;
	
	public CocheBuilder() {}
	
	public Coche build() {
		return new Coche(marca, modelo, caballos, motor);
	}
	
	public CocheBuilder setMarca(String marca) {
		this.marca = marca;
		return this;
	}
	public CocheBuilder setModelo(String modelo) {
		this.modelo = modelo;
		return this;
	}
	public CocheBuilder setCaballos(int caballos) {
		this.caballos = caballos;
		return this;
	}
	public CocheBuilder setMotor(String motor) {
		this.motor = motor;
		return this;
	}
	
}
