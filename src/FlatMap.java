import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args) {
		//{ {'a','b'}, {'c','d'}, {'e','f'} } -> flatMap -> {'a','b','c','d','e','f'}
		//Stream + String[] + flatMap
		String[][] data = new String[][]{{"a","b"}, {"a","d"}, {"e","a"}};
		//String[][] to Stream<String[]>
        Stream<String[]> temp = Arrays.stream(data);
        //Stream<String[]> to Stream<String>
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));
        //process
        Stream<String> stream = stringStream.filter(x -> "a".equals(x.toString()));

		stream.forEach(System.out::println);
		
		//-------------------------------------------------------------
		//Stream + Set + flatMap
		Developer dev1 = new Developer();
		dev1.setName("Elain");
		dev1.setSalary(new BigDecimal("1700"));
		dev1.setAge(56);
		dev1.addSkill("CSS");
		dev1.addSkill("JavaScript");
		dev1.addSkill("HTML");
		
		Developer dev2 = new Developer();
		dev2.setName("Lenore");
		dev2.setSalary(new BigDecimal("1600"));
		dev2.setAge(52);
		dev2.addSkill("Java");
		dev2.addSkill("HTML");
		dev2.addSkill("WebSphere");
		dev2.addSkill("CSharp");
		
				//collect all Developer skills
		List<Developer> devList = new ArrayList<>();
		devList.add(dev1);
		devList.add(dev2);
		
		//convert devList to stream<Set<skill>>
		Stream<Set<String>> streamDev = devList.stream().map(o -> o.getSkills());
		
		//covert stream<Set<skill>> to stream<skill>
		Stream<String> streamSkill = streamDev.flatMap(s -> s.stream());
		
		//Covert Stream<String> to List<String>
		List<String> skillList = streamSkill.collect(Collectors.toList());
		
		//println skill list
		System.out.println("List Skills:");
		skillList.forEach(s -> System.out.println(s));
		
		//println skill list - resolve duplicate skill
		System.out.println();
		System.out.println("List Skills - not duplicate:");
		List<String> skillList2 = devList.stream()
				.map(o -> o.getSkills())
				.flatMap(o -> o.stream())
				.distinct()
				.collect(Collectors.toList());
		skillList2.forEach(s -> System.out.println(s));
		
	}

}
