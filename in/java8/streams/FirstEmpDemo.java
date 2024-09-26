package in.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstEmpDemo {
	public static void main(String[] args) {
		
		Employees e1 = new Employees(1, "Raghunandan", 70000.00,"India");
		Employees e2 = new Employees(2, "Suresh", 65000.00,"Thailand");
		Employees e3 = new Employees(3, "Geetha", 72000.00,"Oman");
		Employees e4 = new Employees(4, "Vijay", 55000.00,"Mexico");
		Employees e5 = new Employees(5, "Priya", 80000.00,"Andaman");
		Employees e6 = new Employees(6, "Anil", 60000.00,"China");
		Employees e7 = new Employees(7, "Kavita", 75000.00,"Pakistan");
		Employees e8 = new Employees(8, "Rajesh", 58000.00,"Belgium");
		Employees e9 = new Employees(9, "Deepika", 67000.00,"Kazhikistan");
	    Employees e10 = new Employees(10, "Manoj", 69000.00,"Andaman");
		
		List<Employees> list = Arrays.asList(e1,e2,e3,e4,e5,e5,e6,e7,e8,e9,e10); 
		
		Optional<Employees> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
		System.out.println("Max salary :: "+max.get().salary);
		
		Optional<Employees> min = list.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));
		System.out.println("Min salary :: "+min.get().salary);
		
		 Double avgSalary = list.stream().collect(Collectors.averagingDouble( e-> e.salary));
		System.out.println("Avg salary :: "+avgSalary);
		
		Map<String, List<Employees>> data = list.stream().collect(Collectors.groupingBy( e -> e.country ));
		System.out.println(data);
		
		System.out.println("------");
		Stream<Integer> ss = Stream.of(1,2,3,4,5,6);
		ss.forEach(n ->System.out.println(n+"::"+Thread.currentThread()));
		
		System.out.println("------");
		Stream<Integer> ps = Stream.of(1,2,3,4,5,6);
		ps.parallel().forEach(n ->System.out.println(n+"::"+Thread.currentThread()));
	}
}
class Employees{
	
	int id;
	String name;
	double salary;
	String country;
	
	public Employees(int id,	String name,	double salary, String country) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.country = country;
		
	}
	
	
}

