package main.com;
import java.util.ArrayList;

public class Ejercicio29 {
	public static void main(String[] args) {
		ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		// Añadiendo peliculas al arrayList
		listaAlumnos.add(new Alumno("Pol", "Pipó", "2º Bachillerato", 2000));
		listaAlumnos.add(new Alumno("Laia", "Gonzalez", "4º ESO", 2006));
		listaAlumnos.add(new Alumno("David", "Sanchez", "4º Carrera", 1992));

		System.out.printf("%20s%20s%20s%20s%n", "Nombre ", "Apellido", "Curso", "Año");
		System.out.println("\t---------------------------------------------------------------------------------");
		for (Alumno alumno : listaAlumnos) {
			System.out.printf("%20s%20s%20s%20s%n", alumno.nombre, alumno.apellido, alumno.curso, alumno.año);
		}

		System.out.println();
		System.out.println();
		
		System.out.printf("%-20s%-20s%-20s%-20s%n", "Nombre ", "Apellido", "Curso", "Año");
		System.out.println("------------------------------------------------------------------------");
		for (Alumno alumno : listaAlumnos) {
			System.out.printf("%-20s%-20s%-20s%-20s%n", alumno.nombre, alumno.apellido, alumno.curso, alumno.año);
		}
	}

	public static class Alumno {
		String nombre = "";
		String apellido = "";
		String curso = "";
		Integer año;

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getCurso() {
			return curso;
		}

		public void setCurso(String curso) {
			this.curso = curso;
		}
		
		public Integer getAnyo() {
			return año;
		}

		public void setAnyo(Integer año) {
			this.año = año;
		}

		public Alumno(String nombre, String apellido, String curso, Integer año) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
			this.curso = curso;
			this.año = año;
		}
	}
}
