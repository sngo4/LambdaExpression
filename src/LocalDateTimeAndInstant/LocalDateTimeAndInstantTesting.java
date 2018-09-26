package LocalDateTimeAndInstant;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;

public class LocalDateTimeAndInstantTesting {

	public static void main(String[] args) {
		Instant instant = Instant.now();
		LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
		
		 System.out.println("Instant : " + instant);
		 System.out.println("LocalDateTime : " + localDateTime);
		 
		// Hard code a date time
	        LocalDateTime dateTime = LocalDateTime.of(2018, Month.AUGUST, 18, 6, 17, 10);

	        System.out.println("LocalDateTime : " + dateTime);

	        // Convert LocalDateTime to Instant, UTC+0
	        Instant instant2 = dateTime.toInstant(ZoneOffset.UTC);

	        System.out.println("Instant : " + instant2);


	}

}
