package java8;

import java.util.function.Supplier;

public class test {
	
	public static void main(String[] args) {
		Supplier<Doctor> s= Doctor::new;
		System.out.println(s.get().hashCode());	
		System.out.println(s.get());
	}
}

class Doctor{
		public Doctor() {
			System.out.println("THis is doctor constructor...");
		}
}
