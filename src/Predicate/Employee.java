package Predicate;

import java.math.BigDecimal;

public class Employee {
	String Name;
	BigDecimal Salary;
	int Age;
	
	public Employee(){
	}
	
	public Employee(String name, BigDecimal salary, int age){
		this.Name = name;
		this.Salary = salary;
		this.Age = age;
	}
	
	public Employee( BigDecimal salary, int age){
		this.Name = null;
		this.Salary = salary;
		this.Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public BigDecimal getSalary() {
		return Salary;
	}
	public void setSalary(BigDecimal salary) {
		Salary = salary;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}

}
