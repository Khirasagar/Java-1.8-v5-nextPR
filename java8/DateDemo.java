package java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		
		System.out.println(d);
		
		//converting date to string
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		String format = sdf.format(d);
		System.out.println(format);
		
		//converting string to date
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/mm/yyyy");
		String format1 = sdf.format(d);
		System.out.println(format1);
		
		
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
		Date parsedDate = sdf3.parse("2022-12-20") ;
		System.out.println(parsedDate);
				
		
		
		
		SimpleDateFormat pk = new SimpleDateFormat("dd/mm/yyyy");
		String rfv = pk.format(d);
		System.out.println(rfv);
		
		System.out.println("===============");
		SimpleDateFormat ok = new SimpleDateFormat("yyyy-MM-dd");
		Date rgv = ok.parse("2021-02-02");
		System.out.println(rgv);
	}

}
