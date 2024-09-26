package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//print the employee names who are working in Hyderabad Location in DB team
class Employee{
	String name;
	String location;
	String department;
	
	Employee(String name,String location,String department){
		this.name = name;
		this.location = location;
		this.department = department;
	}
}

public class PredicateEmployeeDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee("Ramesh","Hyderabad","DB");
		Employee e2 = new Employee("Kishan","Vizag","DevOps");
		Employee e3 = new Employee("Suriya","Hyderabad","DB");
		Employee e4 = new Employee("Rocky","Sikkim","Network");
		Employee e5 = new Employee("tarun","Hyderabad","DB");
		Employee e6 = new Employee("Ram","Noida","Business");
		
		List<Employee> emp = Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		Predicate <Employee> p1 = e -> e.location.equals("Hyderabad");
		Predicate <Employee> p2 = e -> e.department.equals("DB");	
		Predicate<Employee> p3 = e->e.name.startsWith("R");
		//predicate joininhg
		Predicate <Employee> p = p1.and(p2).and(p3);
		
		
		for(Employee e:emp) {
			if(p.test(e)) {
				System.out.println(e.name);
			}
		}
		
	}
}
