package problem15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpData {

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<Employee>();
		
		emps.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		emps.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0)); 
		emps.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		emps.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		emps.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		emps.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0)); 
		emps.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		emps.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		emps.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0)); 
		emps.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		emps.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		emps.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0)); 
		emps.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		emps.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		emps.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		emps.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));
		
		//Q.1)How many males and females employees are there in the org
//		Map<String, Long> map1 = emps.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//		System.out.println(map1);
		
		
//		Q.2) Print all the names of department in the organisation
//		emps.stream().map(e->e.department).distinct().forEach(name->System.out.println(name));
//		//or by using method reference
//		emps.stream().map(Employee::getDepartment).distinct().forEach(name->System.out.println(name));

//		Q3)What is the average age of male and female employees in the org
//		Map<String, Double> map2 = emps.stream()
//		.collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
//		System.out.println(map2);
		
		//Q4) Get the details of highest paid employee in the org?
//		Optional<Employee> optional = emps.stream()
//		.collect(Collectors.maxBy(Comparator.comparingDouble (Employee::getSalary)));
//		if(optional.isPresent()) {
//			Employee employee = optional.get(Employee);
//			System.out.println(employee);
//		}
		
		
//		Q5.get the names all the employees whos have joined after 2015
//		emps.stream()
//		.filter(e->e.yearOfJoining>2015)
//		.map(e->e.name).forEach(name->System.out.println(name));
//		
		
//		Q6) Count the number of employees in each department
//		Map<String, Long> map3 = emps.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
//		System.out.println(map3);
//		OR
//		Map<String, Long> mapx = emps.stream().collect(Collectors.groupingBy(e->e.department, Collectors.counting()));
//		System.out.println(mapx);
		
//		Q7.)Whats the average salary in each department?
//		Map<String, Double> map4 = emps.stream()
//				.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
//				System.out.println(map4);
		
//		Q8.)Get the details of youngest male employee in the development dept
//		Optional<Employee> optional = emps.stream()
//		.filter(e ->e.getGender().equals("Male") && e.getDepartment().equals("Development"))
//		.collect(Collectors.minBy(Comparator.comparingDouble (Employee::getAge)));
		
//		OR
//		Optional<Employee> optional = emps.stream()
//				.filter(e ->e.getGender().equals("Male") && e.getDepartment().equals("Development"))
//				.min(Comparator.comparingDouble (Employee::getAge));
				
		
//		if(optional.isPresent()) {
//			System.out.println(optional.get());
//			
//		}
		
		//Q9.Find the most experienced person in the org
//		Optional<Employee> optional = emps.stream()
//		.collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearOfJoining)));
//		if(optional.isPresent()) {
//			System.out.println(optional.get());
//		}
		
//		Q10.How many males and female employees are there in the sales team
		
//		Map<String, Long> map5 = emps.stream()
//		.filter(e->e.getDepartment().equals("Sales"))
//		.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//		
//		System.out.println(map5);
		
		//to find the employee who is having highest salary
//		Optional<Employee> optional = emps.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary  )));
//		
//		if(optional.isPresent()) {
//			System.out.println(optional.get());
//		}
//		
		
		
		//find the second highest or third highest salary from the org
		//sort employees salary based on decending order and then skip the first record
//		Optional<Employee> findFirst = emps.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
//				.skip(1).findFirst();
//		System.out.println(findFirst.get());
		
//		or
		List<Employee> collect = emps.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
		System.out.println(collect.get(2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

class Employee {
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

}
