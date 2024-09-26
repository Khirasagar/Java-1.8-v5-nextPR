package java8;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Date;

public class NewDateDemo {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		date = date.plusDays(3);
		System.out.println(date);
		
		date = date.plusMonths(34);
		System.out.println(date);
		
		date = date.plusYears(23);
		System.out.println(date);
		
		date = date.plusWeeks(32);
		System.out.println(date);
		
		
		boolean leapYear = LocalDate.parse("2021-12-22").isLeapYear();
		System.out.println("leap year::"+leapYear);
		
		
		boolean before = LocalDate.parse("2021-12-22").isBefore(LocalDate.parse("2022-12-22"));
		System.out.println("Before date::"+before);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		LocalDateTime DateTime =  LocalDateTime.now();
		System.out.println(DateTime);
		
		Period p = Period.ofDays(5);
		System.out.println(p.getDays());
		
		Period between = Period.between(LocalDate.parse("2000-01-09"), LocalDate.now());
		System.out.println(between);
		
		Duration duration = Duration.between(LocalTime.parse("19:24"), LocalTime.now());
		System.out.println(duration );
		
	}
	
	

}
