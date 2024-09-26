package in.java8.streams;

import java.util.Arrays;
import java.util.List;

public class MapDemo1 {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("india","usa","uk","japan","korea","cannada");
		
		// legacy logic
		for(String name : names) {
			System.out.println(name.toUpperCase());
			
		}
		System.out.println("--------------------------");
		
		
		
		
		//java 1.8 version logic
		names.stream().map(Name -> Name.toUpperCase()).forEach(n->System.out.println(n));
		System.out.println("--------------------------");
		
		names.stream().map(Name -> Name.length()).forEach(n->System.out.println(n));


		
	}

}
