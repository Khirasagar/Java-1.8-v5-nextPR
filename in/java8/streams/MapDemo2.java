package in.java8.streams;

import java.util.Arrays;
import java.util.List;

//write a program to print the length of the number whose names are starting with A
public class MapDemo2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Ashok","Ambayati","Tilak","Temater","Chomu");
		
		names.stream().
		filter(name->name.startsWith("A"))
		.map(name->name + "-" +name.length())
		.forEach(name->System.out.println(name));
	}
}
