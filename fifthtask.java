package taskfive;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class fifthtask {

	
	public static void main(String[] args) {
		
		Stream<String> name = Stream.of("aBc","d","ef");
		
		List<String>uppercaseNames= name
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.println(uppercaseNames);
		
	}
}
