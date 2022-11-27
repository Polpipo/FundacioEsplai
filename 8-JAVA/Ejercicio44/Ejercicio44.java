package Ejercicio44;

public class Ejercicio44 {
	public static void main(String[] args) {
		Developer backDeveloper = new Developer("BackEndDeveloper");
		Developer frontDeveloper = new Developer("FrontEndDeveloper");
		Developer fullDeveloper = new Developer("FullStackDeveloper");
		
		String rolBack = backDeveloper.getRolTecnico();
		if(rolBack.equals(Profesiones.BackEndDeveloper.toString())) {
			System.out.println("Desarrollador Back End: Viva el Back");
		}
		
		String rolFull = fullDeveloper.getRolTecnico();
		if(rolFull.equals(Profesiones.FullStackDeveloper.toString())) {
			System.out.println("Desarrollador Full Stack: Viva el Back");
			System.out.println("Desarrollador Full Stack: JS es una 💩 es mejor utilizar TypeScript");
		}
		
		String rolFront = frontDeveloper.getRolTecnico();
		if(rolFront.equals(Profesiones.FrontEndDeveloper.toString())) {
			System.out.println("Desarrollador Front End: JS es una 💩 es mejor utilizar TypeScript");
		}
	}
}



class Developer{
	private String nombre;
	private String apellidos;
	private int edad;
	private int dni;
	private String rolTecnico;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getRolTecnico() {
		return rolTecnico;
	}
	public void setRolTecnico(String rolTecnico) {
		this.rolTecnico = rolTecnico;
	}
	
	public Developer(String nombre, String apellidos, int edad, int dni, String rolTecnico) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
		this.rolTecnico = rolTecnico;
	}
	
	public Developer(String rolTecnico) {
		this.rolTecnico = rolTecnico;
	}
}