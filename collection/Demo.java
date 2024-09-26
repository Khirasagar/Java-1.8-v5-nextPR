package collection;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		ArrayList <Student> al = new ArrayList<>();
		
		al.add(new Student(1,"Raju", 3));
		al.add(new Student(2,"Smith", 1));
		al.add(new Student(3,"Mike", 4));
		al.add(new Student(4,"Jenkin",2));
		al.add(new Student(5,"Arnold",5));
		
		for (Student s : al) {
			System.out.println(al);
		}
		
		
		
		
		
		
//		Scanner s = new Scanner(System.in);
//		int id = s.nextInt();
//		String name = s.next();
//		
//		al.add(new Student(id,name));
//		 
//		id = s.nextInt();
//		name = s.nextLine();
//		
//		
//		al.add(new Student(1,"Raju"));
//		al.add(new Student(2,"Smith"));
//		al.add(new Student(3,"Mike"));
//		al.add(new Student(4,"Jenkin"));
//		al.add(new Student(5, "Arnold"));
//		
//		ListIterator<Student> li= al.listIterator();
//		
//		while(li.hasNext()) {
//			System.out.println(li.next());
//		}
//		
//		System.out.println("============================");
//		
//		while(li.hasPrevious()) {
//			System.out.println(li.previous());
//		}
//		
//		System.out.println("============================");
//		
//		while(li.hasNext()) {
//			System.out.println(li.next());
//		}
		
	}

}
