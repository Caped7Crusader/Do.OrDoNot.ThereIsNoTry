package ThoughtWorks;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Optimized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate startDate = LocalDate.of(2023, 4, 1);
		LocalDate endDate = LocalDate.of(2023, 6, 1);
		
		long numberOfDays = ChronoUnit.DAYS.between(startDate, endDate);
		long numberOfWeekends = numberOfDays / 7;
		
		System.out.println(numberOfWeekends);
	}

}
