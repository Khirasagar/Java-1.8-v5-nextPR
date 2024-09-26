package in.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorDemo {

	
		public static void main(String[] args) {
			Person p1 = new Person("Jon","USA");
			Person p2 = new Person("Wonka","JAPAN");
			Person p3 = new Person("Keshav","INDIA");  
			Person p4 = new Person("Conk Lee","CHINA");
			Person p5 = new Person("Aishwarya","INDIA");
			List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);

			List<String> names = persons.stream().filter(p->p.country.endsWith("INDIA"))
							.map(p-> p.name)	
							.collect(Collectors.toList()); 
			
			System.out.println(names);

		}
	}
	class Person1{
		String name;
		String country;
		
		public Person1(String name,	String country) {
			this.name = name;
			this.country = country;		
		}
	}

	
