package taskfive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class nonemptystring {

	public static void main(String[] args) {
		
		List<String> strings = Arrays.asList("abc","","bc","efg","abcd","","jkl");
		List<String> nonemptystring= strings.stream()
		.filter(s -> !s.isEmpty())
		.collect(Collectors.toList());
		
		System.out.println("Non-Empty Strings");
		System.out.println(nonemptystring);
		
		
		
	}
	
}
