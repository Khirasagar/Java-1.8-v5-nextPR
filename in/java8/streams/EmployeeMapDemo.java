package in.java8.streams;

import java.util.stream.Stream;

//Task: Print employee name with age whose salary is >= 50000 
class Employee{
	String name;
	int age;
	double salary;
	
	public Employee(String name, int age, double salary) {
		this.name=name;
		this.age = age;
		this.salary =salary;
	}
}

public class EmployeeMapDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee("Ranchod", 25, 45000.00);
		Employee e2 = new Employee("Ravi", 30, 55000.00);
		Employee e3 = new Employee("Sneha", 28, 60000.00);
		Employee e4 = new Employee("Lakshmi", 35, 70000.00);
		Employee e5 = new Employee("Vivek", 22, 40000.00);
		Employee e6 = new Employee("Ajay", 27, 48000.00);
		
		//create a stream of above data
		Stream<Employee> stream = Stream.of(e1,e2,e3,e4,e5,e6);
		
		//approach 1
//		stream.filter(e -> e.salary >= 50000.00)
//		.map(e->e.name+"-"+e.age)
//		.forEach(e->System.out.println(e));
	
		//without map
		stream.filter(e -> e.salary >= 50000.00)
		.forEach(e->System.out.println(e.name+"-"+e.age));

	}

}
