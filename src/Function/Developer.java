package Function;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Developer {
	String Name;
	BigDecimal Salary;
	int Age;
	Set<String> Skills;
	
	public Developer(){
	}
	
	public Developer(String name, BigDecimal salary, int age){
		this.Name = name;
		this.Salary = salary;
		this.Age = age;
	}
	
	public Developer( BigDecimal salary, int age){
		this.Name = null;
		this.Salary = salary;
		this.Age = age;
	}
	
	//add skill
	public void addSkill(String skill) {
		if (this.Skills == null) {
			this.Skills = new HashSet<>();
		}
		this.Skills.add(skill);
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
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
	public Set<String> getSkills() {
		return Skills;
	}

	public void setSkills(Set<String> skills) {
		this.Skills = skills;
	}
}
