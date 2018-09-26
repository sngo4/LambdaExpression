package Function;

import java.util.function.Function;

public class AndThenCompose {

	public static void main(String[] args) {
		Function<Integer, Integer> times2 = n -> n * 2;
		Function<Integer, Integer> squared = n -> n * n;

		Function<Integer, Integer> andThenVar = times2.andThen(squared);
		System.out.println("Using andThen: " + andThenVar.apply(5)); // 100

		Function<Integer, Integer> composeVar = times2.compose(squared);
		System.out.println("Using compose: " + composeVar.apply(5)); // 50

	}

}
