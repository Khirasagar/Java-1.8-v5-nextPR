package in.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapCcDemo {
	public static void main(String[] args) {
		List<String> java  = Arrays.asList("Core Java","Advanced Java","Angular","SpringBoot");
		
		List<String> ui = Arrays.asList("html","css","Javascript","Next");
		
		List<List<String>> courses = Arrays.asList(java,ui);
		
		courses.stream().forEach(c->System.out.println(c));
		System.out.println("------------");
		
		
		Stream<String> flatMap = courses.stream().flatMap(s->s.stream());
		flatMap.forEach(c->System.out.println(c));
	}

}
