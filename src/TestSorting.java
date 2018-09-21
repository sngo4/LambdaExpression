import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSorting {

	public static void main(String[] args) {
		List<Developer> DevList = getDevelopers();

		System.out.println("Before Sorting:");
		for (Developer o : DevList) {
			System.out.print("Name: " + o.getName() + ";");
			System.out.print(" Salary: " + o.getSalary() + ";");
			System.out.println(" Age: " + o.Age);
		}
		System.out.println();
		System.out.println("After Sorting:");
		System.out.println("Sorting by Name:");
		Collections.sort(DevList, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		for (Developer o : DevList) {
			System.out.print("Name: " + o.getName() + ";");
			System.out.print(" Salary: " + o.getSalary() + ";");
			System.out.println(" Age: " + o.Age);
		}
		System.out.println("Sorting by Age:");
		Collections.sort(DevList, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		for (Developer o : DevList) {
			System.out.print("Name: " + o.getName() + ";");
			System.out.print(" Salary: " + o.getSalary() + ";");
			System.out.println(" Age: " + o.Age);
		}
		System.out.println("Sorting by Salary:");
		Collections.sort(DevList, new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getSalary().compareTo(o2.getSalary());
			}
		});
		for (Developer o : DevList) {
			System.out.print("Name: " + o.getName() + ";");
			System.out.print(" Salary: " + o.getSalary() + ";");
			System.out.println(" Age: " + o.Age);
		}

		// After Sorting in Java 8:
		System.out.println();
		System.out.println("After Sorting in Java 8:");
		System.out.println("Sorting by Name:");
		DevList.sort(new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		for (Developer o : DevList) {
			System.out.print("Name: " + o.getName() + ";");
			System.out.print(" Salary: " + o.getSalary() + ";");
			System.out.println(" Age: " + o.Age);
		}
		System.out.println("Sorting by Age:");
		DevList.sort(new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getAge() - o2.getAge();
			}
		});
		for (Developer o : DevList) {
			System.out.print("Name: " + o.getName() + ";");
			System.out.print(" Salary: " + o.getSalary() + ";");
			System.out.println(" Age: " + o.Age);
		}
		System.out.println("Sorting by Salary:");
		DevList.sort(new Comparator<Developer>() {
			@Override
			public int compare(Developer o1, Developer o2) {
				return o1.getSalary().compareTo(o2.getSalary());
			}
		});
		for (Developer o : DevList) {
			System.out.print("Name: " + o.getName() + ";");
			System.out.print(" Salary: " + o.getSalary() + ";");
			System.out.println(" Age: " + o.Age);
		}
		// After Sorting in Java 8 and Lambda Expression:
		System.out.println();
		System.out.println("After Sorting in Java 8 and Lambda Expression:");
		System.out.println("Sorting by Name:");
		DevList.sort((Developer o1, Developer o2) -> o1.getName().compareTo(o2.getName()));
		DevList.forEach(o -> {
			System.out.print("Name: " + o.getName() + ";");
			System.out.print(" Salary: " + o.getSalary() + ";");
			System.out.println(" Age: " + o.Age);
		});
		System.out.println("Sorting by Age:");
		DevList.sort((Developer o1, Developer o2) -> o1.getAge() - o2.getAge());
		DevList.forEach(o -> {
			System.out.print("Name: " + o.getName() + ";");
			System.out.print(" Salary: " + o.getSalary() + ";");
			System.out.println(" Age: " + o.Age);
		});
		System.out.println("Sorting by Salary:");
		DevList.sort((Developer o1, Developer o2) -> o1.getSalary().compareTo(o2.getSalary()));
		DevList.forEach(o -> {
			System.out.print("Name: " + o.getName() + ";");
			System.out.print(" Salary: " + o.getSalary() + ";");
			System.out.println(" Age: " + o.Age);
		});
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
