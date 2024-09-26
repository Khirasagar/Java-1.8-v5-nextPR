package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate; 
//Q.Take a list of persons and print persons whose age is >= 18
class Person{
	String name ;
	int age;
	Person (String name, int age){
		this.name = name;
		this.age = age;
		
	}
}
public class PredicatePersonsDemo {
		public static void main(String[] args) {
			Person p1 = new Person("Subas",17);
			Person p2 = new Person("Prabhas",18);
			Person p3 = new Person("Pulkit",19);			
			Person p4 = new Person("Karan",29);

			List<Person> persons = Arrays.asList(p1,p2,p3,p4);
			
			 Predicate<Person> predicate = p -> p.age>=18;
			 
			 for(Person person: persons) {
				 if(predicate.test(person)) {
					 System.out.println(person.name);
				 }
			 }	 
		}

}
