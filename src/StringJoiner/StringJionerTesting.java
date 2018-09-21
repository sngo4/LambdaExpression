package StringJoiner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJionerTesting {

	public static void main(String[] args) {
		StringJoiner java8 = new StringJoiner("--");
		java8.add("Optional");
		java8.add("Stream");
		java8.add("String Jioner");
		
		String result = java8.toString();
		System.out.println(result);
		

		StringJoiner java8New = new StringJoiner("--", "START<<", ">>END");
		java8New.add("Optional");
		java8New.add("Stream");
		java8New.add("String Jioner");
		
		String resultNew = java8New.toString();
		System.out.println(resultNew);
		
		//String.join
		String inputDate = "21";
		String inputMonth = "09";
		String inputYear = "2018";
		
		String resultDDMMYYYY = String.join("/", inputDate, inputMonth, inputYear);
		System.out.println(resultDDMMYYYY);
		
		List<String> skill = Arrays.asList("Java", "HTML", "ANGULAR");
		String s = String.join("->", skill);
		System.out.println(s);
		
		//Collectors.joining
		List<String> skillCol = Arrays.asList("Java", "HTML", "ANGULAR");
		String sCol = skillCol.stream().map(ss -> ss).collect(Collectors.joining(" | "));
		System.out.println(sCol);
		
		
	}

}
