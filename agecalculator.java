package taskfive;

import java.time.LocalDate;
import java.time.Period;

public class agecalculator {
	
	public static void main(String[] args) {

		String name = "rajesh";
		
		LocalDate birthdate = LocalDate.of(1984,10, 29);
		LocalDate currentDate = LocalDate.now();
		Period age =Period.between(birthdate, currentDate);
	
		System.out.println(name +"'s age is:"+age.getYears()+"years,"+age.getMonths()+"Month,"+age.getDays()+"Days");
		
	
	}
	
	
		
}
