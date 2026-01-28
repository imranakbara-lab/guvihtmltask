package taskfive;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class studentgift {
	
	public static void main(String [] args) {
		
		List<String> STUDENTS= Arrays.asList("arun","Anitha","ajay","bala","divya","Asha","karthik","Manoj","amala","Ravi" );
		
		List<String> specialgiftstudent = STUDENTS.stream()
				.filter(name->name.toUpperCase(). startsWith("A"))
				.collect(Collectors.toList());
		System.out.println("Stedunt Elgiable for Special Gift");
		System.out.println(specialgiftstudent);
		
		
	}

}
