package in.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class ParallelSplitDemo {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sachin","Sehwag","Gambhir");
		Spliterator<String> spliterator = names.stream().spliterator();
		spliterator.forEachRemaining(n->System.out.println(n));
	}

}
