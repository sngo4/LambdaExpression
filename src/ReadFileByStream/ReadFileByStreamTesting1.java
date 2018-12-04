package ReadFileByStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFileByStreamTesting1 {

	public static void main(String[] args) {
/*		String fileName = "D://batch_input_files//13745cid.csv";


		try (Stream<String> stream = Files.lines(Paths.get(fileName))){
			List<String> agencyInfo = new ArrayList<>();
			agencyInfo = stream.map(String::toUpperCase).collect(Collectors.toList());
			String AgencyName = agencyInfo.get(1);
			AgencyName = AgencyName.split("\"")[1];
			System.out.println(AgencyName);
		} catch (IOException e) {
			e.printStackTrace();
		}


		try (Stream<String> stream = Files.lines(Paths.get(fileName))){
			//stream.forEach(System.out::println);
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
		//list.forEach(System.out::println);*/
		String testDate = dateAsMMDDYYYYtoString("9/3/2018");
		System.out.println(testDate);
	}
	private static String dateAsMMDDYYYYtoString(String dateString) {
    	Date defaultDate=null;
    	String formatedDate = "";
    	SimpleDateFormat formatter = new SimpleDateFormat("M/d/yyyy");
    	try {
    	defaultDate = formatter.parse(dateString);
    	DateFormat formatter2 = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		Date date = formatter2.parse(defaultDate.toString());
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		String month = String.valueOf(cal.get(Calendar.MONTH) + 1);
		String day = String.valueOf(cal.get(Calendar.DATE));
		if (month.length() == 1) month = '0' + month;
		if (day.length() == 1) day = '0' + day;
		formatedDate = cal.get(Calendar.YEAR) + "-" + month + "-" + day ;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        return formatedDate;    	
    } 
}
