package main.com;

public class Ejercicio33 {
	public static void main(String[] args) {
		Tarjeta visa = new Tarjeta ("VISA", 1234567890, "09/22", "Pol Pipo");
		
		//ACTIVAR O ANULAR:
		visa.anular();
		System.out.println(visa.getActivarAnular());
		visa.activar();
		System.out.println(visa.getActivarAnular());
		
		//SALDO + PAGAR:
		visa.getSaldo();
		visa.pagar(200);
		visa.getSaldo();
		visa.pagar(500);
		visa.getSaldo();
		visa.ingresar(800);
		visa.getSaldo();
		visa.pagar(1200);
		visa.getSaldo();
		
		visa.anular();
		visa.pagar(200);
		visa.activar();
		visa.pagar(200);
		
	}
}

class Tarjeta{
	private String entidad;
	private int numero;
	private String fechaCad;
	private String titular;
	private boolean activarAnular = true;
	private int saldo = 1000;
	
	public String getEntidad() {
		return entidad;
	}
	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getFechaCad() {
		return fechaCad;
	}
	public void setFechaCad(String fechaCad) {
		this.fechaCad = fechaCad;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public void getSaldo() {
		System.out.println("Tu saldo actual es: " + saldo);
	}
	public void activar() {
		this.activarAnular = true;
	}
	public void anular() {
		this.activarAnular = false;
	}
	public boolean getActivarAnular() {
		return activarAnular;
	}
	public void pagar(int pago) {
		if(activarAnular == true) {
			if(saldo>=pago) {
				saldo = saldo - pago;
				System.out.println("Pago realizado correctamente");
				System.out.println("Importe pagado: " + pago);
			}else {
				System.out.println("¡SALDO INSUFICIENTE, INGRESA MÁS DINERO O GASTA MENOS!");
			}		
		}else {
			System.out.println("Tartgeta anulada, consulta con nuestro servicio al cliente");
		}
	}
	public void ingresar(int ingreso) {
		saldo = saldo + ingreso;
		System.out.println("Has ingresado " + ingreso);
	}
	
	
	public Tarjeta(String entidad, int numero, String fechaCad, String titular) {
		this.entidad = entidad;
		this.numero = numero;
		this.fechaCad = fechaCad;
		this.titular = titular;
		
		System.out.println("Tarjeta creada correctamente");
	}
	
	
}