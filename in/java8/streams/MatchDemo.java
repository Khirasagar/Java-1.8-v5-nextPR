package in.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MatchDemo {
	public static void main(String[] args) {
		Person p1 = new Person("Jon","USA");
		Person p2 = new Person("Wonka","JAPAN");
		Person p3 = new Person("Keshav","INDIA");  
		Person p4 = new Person("Conk Lee","CHINA");
		Person p5 = new Person("Aishwarya","INDIA");

		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
//		boolean status = persons.stream().anyMatch(p->p.country.equals("INDIA"));
//		System.out.println("Any Indian Available? :: "+status);
//		
//		boolean status2 = persons.stream().anyMatch(p->p.country.equals("CANADA"));
//		System.out.println("Any Canadian Available? :: "+status2);
//		
//		boolean status3 = persons.stream().allMatch(p->p.country.equals("INDIA"));
//		System.out.println("All Indian Available? :: "+status3);
//		
//		boolean status4 = persons.stream().noneMatch(p->p.country.equals("MEXICO"));
//		System.out.println("No persons from MEXICO Available? :: "+status4);
//		
		///////
		System.out.println("--------");
		List<Person> indians = persons.stream().filter(p->p.equals("INDIA")).collect(Collectors.toList());
		
		indians.forEach(i->System.out.println(i));
		
		
		
	}
}
class Person{
	String name;
	String country;
	
	public Person(String name,	String country) {
		this.name = name;
		this.country = country;		
	}
}
