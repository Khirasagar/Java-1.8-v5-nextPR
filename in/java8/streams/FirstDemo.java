package in.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import java8.User;

public class FirstDemo {
	public static void main(String[] args) {
		//Appraoch 1
		Stream <Integer> stream1 = Stream.of(1,2,3,4,5,6,7,8);
		
		//Approach 2
		ArrayList<String> names = new ArrayList<>();
		names.add("Roman Nana");
		names.add("Gibbi");
		Stream<String> stream2 = names.stream();
		System.out.println(stream2);
		
		List<Integer> list = Arrays.asList(43,11,12,4,8,77,34,33);
//		for(Integer i :list) {
//			if(i>20) {
//				System.out.println(i); 
//			}
//		}
	
//		Stream<Integer>stream = list.stream();
//		Stream<Integer> filter = stream.filter(i -> i>20);
//		filter.forEach(i -> System.out.println(i));
		
		list.stream().filter(i -> i> 20).forEach (i -> System.out.println(i));		
	}
}
