package Predicate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import Function.Developer;
import java.util.function.*;
import java.util.stream.Collectors;

public class PredicateCollection {

	public static void main(String[] args) {
		List<Developer> DevList = getDevelopers();
				
		//Predicate name = "John"
		Predicate<Developer> namePredicate = s -> s.getName().equals("John");
		
		//Predicate Salary > 1000
		Predicate<Developer> saPredicate = s -> s.getSalary().equals(new BigDecimal("1000"));
		
		//Predicate Age < 300
		Predicate<Developer> agePredicate = s -> s.getAge() < 30;
		
		
		// filter
		List<Developer> DevList1 = DevList.stream().filter(namePredicate).collect(Collectors.toList());
		DevList1.forEach( d -> {
				System.out.println("Name:" + d.getName());			
		}
				);

		//filter Salary > 1000 and Age < 300
		List<Developer> DevList2 = DevList.stream().filter(saPredicate.and(agePredicate)).collect(Collectors.toList());
		DevList2.forEach( d -> {
			System.out.println("Name:" + d.getName());	
			System.out.println("Age:" + d.getAge());
	}
			);

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
