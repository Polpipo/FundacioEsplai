package ejercicio38;

public class ejercicio38 {
	public static void main(String[] args) {
		Profesor profesor = new Profesor();
		profesor.setNombre("David");
		profesor.setSalario(10000);
		System.out.println("El profesor se llama " + profesor.getNombre() + " y cobra unos " + profesor.getSalario() + "€ al mes");
		
		Alumno alumno = new Alumno();
		alumno.setNombre("Pol");
		alumno.setCurso("programación");
		System.out.println("El alumno se llama " + alumno.getNombre() + " y estudia " + alumno.getCurso());
	}
}

class Profesor implements IPersona{
	private String nombre;
	private int salario;

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getNombre() {
		return nombre;
		
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	public int getSalario() {
		return salario;
	}
}

class Alumno implements IPersona{
	private String nombre;
	private String curso;

	
	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}

	@Override
	public String getNombre() {
		return nombre;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getCurso() {
		return curso;
	}
}

