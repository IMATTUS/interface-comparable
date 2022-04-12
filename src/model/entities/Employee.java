package model.entities;

public class Employee implements Comparable<Employee> {
//	XXX para uma classe poder ser usada no Collection.sort ela precisa implementar o 
//	Comparable<T> onde <T> é o tipo, no caso <T> é a própria classe.
//	essa interface exige que o compareTo seja implementado, o compareTo retorna negativo, zero ou positivo, onde
//	Negativo: se o objeto é menor que o objeto sendo comparado (sempre do mesmo tipo)
//	Zero    : se os objetos são iguais   
//	Positivo: se o objeto é maior
//	lembrando que ser maior, menor ou igual é do ponto de vista do que está sendo comparado, como o nome por exemplo
	private String name;
	private Double salary;
	public Employee(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee other) {
		
		//XXX to sort in a descending order
//		return -name.compareTo(other.getName());
		return name.compareTo(other.getName());
	}
	
	
}
