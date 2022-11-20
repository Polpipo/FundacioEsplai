package main.com;

public class Ejercicio36 {
	public static void main(String[] args) {
		Tecnico tecnico = new Tecnico();
		System.out.println(tecnico.toString());
		
		Oficial oficial = new Oficial();
		System.out.println(oficial.toString());
		
		Operario operario = new Operario();
		System.out.println(operario.toString());
		
		Directivo directivo = new Directivo();
		System.out.println(directivo.toString());
		
		Empleados empleado = new Empleados();
		System.out.println(empleado.toString());
	}
}


class Empleados{
	protected String nombre;

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String toString() {
		return "Soy empleado";
	}
}

class Directivo extends Empleados{
	public String toString() {
		return "Soy directivo";
	}
}

class Operario extends Empleados{
	public String toString() {
		return "Soy operario";
	}
}

class Oficial extends Operario{
	public String toString() {
		return "Soy operario oficial";
	}
}

class Tecnico extends Operario{
	public String toString() {
		return "Soy operario tecnico";
	}
}

