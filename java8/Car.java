package java8;

interface Vehicle{
	public void start();
	public default void clean() {
		System.out.println("Cleaning completed...");
	}
}


public class Car implements Vehicle {
	
	@Override
	public void clean() {
		System.out.println("my clean method");
	}
	@Override
	public void start() {
		System.out.println("car started...");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.clean();
		c.start();
		
		
	}
	//Lambda's Expression
	public void m1() {
		System.out.println("Hi...");
	}
	
	
	

}
