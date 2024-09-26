package in.java8.streams;

import java.util.Arrays;
import java.util.List;

public class LimitSkipDistinctDemo {
	public static void main(String[] args) {
		List<String> javacourses = Arrays.asList("java","python","php","c","c++","ruby on rails","django");
		javacourses.stream().limit(4).forEach(c->System.out.println(c));
		
		javacourses.stream().skip(4).forEach(c->System.out.println(c));
		
		List<String> names = Arrays.asList("Omkar","Omkar","Shankar","Shankar","Vyom");
		names.stream().distinct().forEach(name -> System.out.println(name));
		
		
		List<Integer> num = Arrays.asList(1,2,3,4,5,4,1,2,43,3,5,56,65,56,65);
		num.stream().distinct().forEach(n -> System.out.print(n+" "));
		}
}
