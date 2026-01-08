package OCA;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q35 {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.of(2014, 06, 20);
		LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
		
		System.out.println("date1 = " + date1);
		System.out.println("date2 = " + date2);
		System.out.println("date3 = " + date3);
				
//		System.out.println(date3);             // prints: 2014-06-20
//		System.out.println(date3.getYear());   // prints: 2014
//		System.out.println(date3.getMonth());  // prints: JUNE
//		System.out.println(date3.getDayOfMonth()); // prints: 20
		
	}
}
