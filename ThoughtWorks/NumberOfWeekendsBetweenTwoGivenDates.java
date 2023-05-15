package ThoughtWorks;
import java.time.DayOfWeek;
import java.time.LocalDate;


public class NumberOfWeekendsBetweenTwoGivenDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate startDate = LocalDate.of(2023, 4, 1);
		LocalDate endDate = LocalDate.of(2023, 6, 1);

		long numWeekends = getNumWeekends(startDate, endDate);
		
		System.out.println("Number of weekends between " + startDate + " and " + endDate + ": " + numWeekends);
	}
	
	public static long getNumWeekends(LocalDate startDate, LocalDate endDate) {
		long numWeekends = 0;
		
		while(!startDate.isAfter(endDate)) {
			if(startDate.getDayOfWeek() == DayOfWeek.SATURDAY || startDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
				numWeekends++;
			}
			startDate = startDate.plusDays(1);
		}
		return numWeekends;
	}

}
