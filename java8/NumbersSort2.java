package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Approach1 without lambda
public class NumbersSort2 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		
		al.add(5);
		al.add(4);
		al.add(1);
		al.add(7);
		al.add(8);
		al.add(3);
		al.add(2);
		System.out.println("Before Sort: " + al);
		
//		Collections.sort(al, new NumberComparator());
		
//		Collections.sort(al,(i,j)->i.compareTo(j));
		String i = 10>20? "hi":"Hello";
		Collections.sort(al, (k, j) -> ( k > j) ? - 1 : 1);
		
		System.out.println("After Sort: "+al );
		
	}

}