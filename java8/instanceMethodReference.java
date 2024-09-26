package java8;

public class instanceMethodReference {
	public void m1() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		instanceMethodReference im = new instanceMethodReference();
		Runnable r = im::m1;
		Thread t= new Thread(r);
		
		t.start();
		
	}

}
