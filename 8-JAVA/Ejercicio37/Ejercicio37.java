package main.com;

public class Ejercicio37 {
	public static void main(String[] args) {
		Carnivoro carnivoro = new Carnivoro();
		carnivoro.alimentarse();
		
		Herviboro herviboro = new Herviboro();
		herviboro.alimentarse();
		
		Planta planta = new Planta();
		planta.alimentarse();
		
		/*
		 * LOS SIGUIENTES FALLARÁN AL DECLARARSE YA QUE SON CLASES ABSTRACTAS
		 

		Animal animal = new Animal();
		animal.alimentarse();
		
		SerVivo serVivo = new SerVivo();
		serVivo.alimentarse();
		
		
		*/
	}
}

abstract class SerVivo{
	public void alimentarse() {
		System.out.println("Los seres vivos tienen que alimentarse");
	}
}

class Planta extends SerVivo{
	public void alimentarse() {
		System.out.println("Las plantas se alimentan para sobrevivir");
	}
}

abstract class Animal extends SerVivo{
	public void alimentarse() {
		System.out.println("Los animales se alimentan para sobrevivir");
	}
}

class Herviboro extends Animal{
	public void alimentarse() {
		System.out.println("Los animales herviboros se alimentan de plantas para sobrevivir");
	}
}

class Carnivoro extends Animal{
	public void alimentarse() {
		System.out.println("Los animales carnivoros se alimentan de otros animales para sobrevivir");
	}
}