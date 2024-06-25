package Part1.Q5;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class CalendarDemo {
	public static void main(String[] args) {
		//create GregorianCalendar instance for the current date
		GregorianCalendar calendar = new GregorianCalendar();

		//current year, month, and day
		int year = calendar.get(Calendar.YEAR);
		// Note: Months are zero-based in Calendar class (January is 0)
	    int month = calendar.get(Calendar.MONTH) + 1;
	    int day = calendar.get(Calendar.DAY_OF_MONTH);

		//current date
		System.out.println("Current Date:");
		System.out.println("Year: " + year);
		System.out.println("Month: " + month);
		System.out.println("Day: " + day);
	}
}
