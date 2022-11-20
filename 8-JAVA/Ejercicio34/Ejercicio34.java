package main.com;

public class Ejercicio34 {
	public static void main(String[] args) {
		programmer programador = new programmer(1500.23f, 300);
	}
}


class employee{
	protected float salary;

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}

class programmer extends employee{
	private int bonus;

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public programmer(float salary,  int bonus) {
		this.salary = salary;
		this.bonus = bonus;
		
		System.out.println("Programador creado correctamente");
		System.out.println("Salario: " + salary + "€");
		System.out.println("Bonus: " + bonus + "€");
	}
}