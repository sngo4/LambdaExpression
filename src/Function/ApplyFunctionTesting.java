package Function;

import java.util.function.Function;

public class ApplyFunctionTesting {

	public static void main(String[] args) {
		// Convert String to Integer
		Function<String, Integer> IntConvertor = s -> Integer.parseInt(s);
		System.out.println(IntConvertor.apply("12"));
		// Convert Integer to String
		Function<Integer, String> StringConvertor = i -> "This is String: " +String.valueOf(i);
		System.out.println(StringConvertor.apply(12));

	}

}
