package Function;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ObjToObjFunctionTesting {

	public static void main(String[] args) {
		//Cannot cast from Developer to Employee
//		Developer dev2 = new Developer("John", new BigDecimal("700"), 33);
//		Employee e2 = (Employee)dev2; //Error
		//Before Java 8
		Developer dev2 = new Developer("John", new BigDecimal("700"), 33);
		Employee e2 = new Employee(dev2.Name, dev2.Salary, dev2.Age);
		
		//Java 8
		//Convert Developer to Employee
		Developer dev = new Developer("John", new BigDecimal("700"), 33);
		Function<Developer, Employee> EmpConvertor = d -> new Employee(d.Name, d.Salary, d.Age);
		Employee e = EmpConvertor.apply(dev);
		System.out.println(e.Name);
		System.out.println(e.Salary);
		System.out.println(e.Age);
		//-------------------------------------------------------------------------------
		List<Developer> lstDev = getDevelopers();
		
		//use Stream to convert and Do not use function
		List<Employee> eList = lstDev.stream()//List to Stream
				.map(d -> new Employee(d.Name, d.Salary, d.Age))//map Stream<Developer> to Stream<Employee>
				.collect(Collectors.toList());//Stream to list

		//use Stream to convert and use function
		Function<Developer, Employee> EmpListConvertor = d -> new Employee(d.Name, d.Salary, d.Age);
		List<Employee> eList2 = lstDev.stream()//List to Stream
				.map(EmpListConvertor)//map Stream<Developer> to Stream<Employee>
				.collect(Collectors.toList());//Stream to list

	}
	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("John", new BigDecimal("700"), 33));
		result.add(new Developer("Kate", new BigDecimal("800"), 20));
		result.add(new Developer("Jason", new BigDecimal("1000"), 10));
		result.add(new Developer("Iris", new BigDecimal("1700"), 55));

		return result;

	}
}
