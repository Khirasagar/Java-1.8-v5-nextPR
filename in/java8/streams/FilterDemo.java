package in.java8.streams;

import java.util.Arrays;
import java.util.List;

public class FilterDemo {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("john","mia","Brooklyn","Cassendra","Sophi","Ava");
		
		names.stream().filter(i -> i .startsWith("A")).forEach(i->System.out.println(i));
	}

}


