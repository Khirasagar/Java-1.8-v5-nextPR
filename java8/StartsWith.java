package java8;

import java.util.function.Predicate;

public class StartsWith {
	public static void main(String[] args) {
		String [] names = {"Anuska","Kirti","Tammanah","Rhea","Muskan"};
		
		Predicate <String> p= name->name.charAt(0)=='M';
		
		for(String name : names) {
			if(p.test(name)) {
				System.out.println(name);
			}
		}
	}
}
