package main.com;

public class Ejercicio35 {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Pol", "Pipo Coll", 123456789, "Hombre", "Cliente");
		cliente.generarCodigo();
		System.out.println(cliente.codigo);
		
		Empleado empleado = new Empleado("Paca", "Valbuena Perez", 987654321, "Mujer", "Programadora");
		empleado.calcularSueldo();
		System.out.println(empleado.sueldo);
	}
}

class Persona{
	protected String nombre;
	protected String apellidos;
	protected int documento;
	protected String genero;
}

class Cliente extends Persona{
	protected String categoria;
	protected int codigo;
	
	public void generarCodigo() {
		this.codigo = (int)Math.round(Math.random()*1000);
	}
	
	public Cliente(String nombre, String apellidos, int documento, String genero, String categoria) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.documento = documento;
		this.genero = genero;
		this.categoria = categoria;
	}
}

class Empleado extends Persona{
	protected String tipoContrato;
	protected int sueldo;
	protected int bonus = (int)Math.round(Math.random()*1000);
	
	public void calcularSueldo() {
		int sueldoBase = 1000;
		sueldo = sueldoBase + bonus;
	}
	
	public Empleado(String nombre, String apellidos, int documento, String genero, String tipoContrato) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.documento = documento;
		this.genero = genero;
		this.tipoContrato = tipoContrato;
	}
}
