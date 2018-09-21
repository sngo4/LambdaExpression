import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsFilter {

	public static void main(String[] args) {
		List<Developer> DevList = getDevelopers();
		BigDecimal salaryBase = new BigDecimal(1000);
		//we do not like Developer < 25 years old
		List<Developer> filterResult = DevList.stream()// list to Stream
				.filter(o -> o.getAge() > 25)//filter
				.collect(Collectors.toList());//Stream to list
		System.out.println("Developer > 25 years old");
		filterResult.forEach(o -> {
			System.out.print("Name: " + o.getName() + ";");
			System.out.print(" Salary: " + o.getSalary() + ";");
			System.out.println(" Age: " + o.Age);
		});
		
		//we wanna Developer < 25 years old and Salary > 1000
		List<Developer> filterResult2 = DevList.stream()// list to Stream
				.filter(o -> (!(o.getAge() > 25)//filter > 25
						&&(o.getSalary().compareTo(salaryBase) > 0)//filter salary > 1000
							)
						)
				.collect(Collectors.toList());//Stream to list
		System.out.println();
		System.out.println("Developer < 25 years old and Salary > 1000:");
		filterResult2.forEach(o -> {
			System.out.print("Name: " + o.getName() + ";");
			System.out.print(" Salary: " + o.getSalary() + ";");
			System.out.println(" Age: " + o.Age);
		});
		//Show Developer name only:  Developer  Salary < 1000
		System.out.println("Developer name: Developer Salary < 1000:");
		List<String> filterResult3 = DevList.stream()// list to Stream
				.filter(o -> (o.getSalary().compareTo(salaryBase) < 0)//filter salary < 1000
						)
				.map(o -> o.getName())//List<Developer> to List<String>
				.collect(Collectors.toList());//Stream to list
		filterResult3.forEach(o -> System.out.println("Name: " + o + ";"));
		
		//count by age
		 Map<Integer, Long> counting = DevList.stream().collect(
				 Collectors.groupingBy(Developer::getAge, Collectors.counting())
				 );
		System.out.println(counting);
		//Sum Salary groupingBy Age
		Map<Integer, BigDecimal> SumByAge = DevList.stream().collect(
				 Collectors.groupingBy(Developer::getAge, Collectors.reducing(
			                BigDecimal.ZERO,
			                Developer::getSalary,
			                BigDecimal::add))
				 );
		System.out.println(SumByAge);
		
		// Filter null
		System.out.println("Filter null:");
		List<String> filterResult4 = DevList.stream()// list to Stream
				.filter(o -> o.getName()!=null)//filter null
				.map(o -> o.getName())//List<Developer> to List<String>
				.collect(Collectors.toList());//Stream to list
		filterResult4.forEach(o -> System.out.println("Name: " + o + ";"));
		
		//Stream and StreamSupplier
		//1 stream only use 1 time. If you want to reuse you should be use StreamSupplier
		 String[] array = {"a", "b", "c", "d", "e"};
//	     Stream<String> stream = Arrays.stream(array);
//	     
//	     stream.forEach(s -> System.out.println("test: " + s));
////		//reuse stream and we got a exception 
////	     long countB = stream.filter(s -> "b".equals(s)).count();
////	     System.out.println("countB:" + countB);
	     
	     Supplier<Stream<String>> streamSupplier = () -> Stream.of(array);

	        //get new stream
	        streamSupplier.get().forEach(x -> System.out.println(x));

	        //get another new stream
	        long count = streamSupplier.get().filter(x -> "b".equals(x)).count();
	        System.out.println(count);
	        
	        //
	}

	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("John", new BigDecimal("700"), 33));
		result.add(new Developer("Kate", new BigDecimal("1800"), 20));
		result.add(new Developer("Jason", new BigDecimal("1000"), 10));
		result.add(new Developer("Iris", new BigDecimal("1700"), 55));
		
		result.add(new Developer("Linda", new BigDecimal("700"), 33));
		result.add(new Developer("Debbie", new BigDecimal("200"), 20));
		result.add(new Developer("Sarah", new BigDecimal("1200"), 10));
		result.add(new Developer("Phen", new BigDecimal("100"), 55));
		
		result.add(new Developer("Lenore", new BigDecimal("700"), 33));
		result.add(new Developer("Ngo", new BigDecimal("200"), 20));
		result.add(new Developer("Sang", new BigDecimal("1200"), 10));
		result.add(new Developer(new BigDecimal("100"), 55));

		return result;

	}
}
