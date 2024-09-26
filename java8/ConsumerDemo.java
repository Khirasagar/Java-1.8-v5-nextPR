package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer <String> c = (name)->System.out.println(name+"Hello World");
		
		c.accept("Romero");
		c.accept("Panzero");
		c.accept("Wheelie");
		
		List<Integer> numbers = Arrays.asList(10,20,30,40);
		
		
		numbers.forEach(i->System.out.println(i));
	}

}
