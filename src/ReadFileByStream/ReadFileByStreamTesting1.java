package ReadFileByStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFileByStreamTesting1 {

	public static void main(String[] args) {
		String fileName = "D://workspaces//Lambda//LambdaExpression//test//DocumentToRead.txt";

		try (Stream<String> stream = Files.lines(Paths.get(fileName))){
			stream.forEach(System.out::println);
		} catch (IOException  e) {
			e.printStackTrace();
		}
		
		//
		System.out.println("filter data file!!-------------------------------------------");
		List<String> list = new ArrayList<>();
		try (Stream<String> stream2 = Files.lines(Paths.get(fileName))){
			list = stream2.filter(line -> !line.startsWith("10:04:18"))
					.map(String::toUpperCase)
					.collect(Collectors.toList());
		} catch (IOException  e) {
			e.printStackTrace();
		}
		list.forEach(System.out::println);
	}
}
