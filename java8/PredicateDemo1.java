package java8;

import java.util.function.Predicate;

//Declare names in an array which are starting with letter "A" using lamda
public class PredicateDemo1 {
	
	public static void main(String[] args) {
		String[] names = {"Kajol","Deepika","Sunny","Anupama","Anushka"};
		
//		Predicate<String> p = i -> i [0] = "A";
		
		Predicate<String> p = name -> name.charAt(0) == 'D';  
		
		for(String name : names) {
			if(p.test(name)) {
				System.out.println(name);
			}
			
		}
		
		
		
	}

}
