package java8;

import java.util.function.Consumer;

interface MyInterface{
	public void m1();
}

public class MethodRef {
	
	public static void m2() {
		System.out.println("This is m2 method");
	}
	
	public static void main(String[] args) {
		MethodRef.m2();
		
		MyInterface mi = MethodRef::m2;
		mi.m1();
	}

}
