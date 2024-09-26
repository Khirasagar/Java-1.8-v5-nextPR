package java8;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a id");
		int userId = sc.nextInt();
		
		User u =  new User();
		
//		String username = u.getUsernameById(userId);
	
		/*if(username!=null) {
			String msg = username.toUpperCase()+", Hello";
			System.out.println(msg);*/
		
		Optional<String> username = u.getUsername(userId);
		if(username.isPresent()) {
			String name = username.get();
			System.out.println(name.toUpperCase()+"Hello");
			
		}else {
			System.out.println("No data found!");
		}
		
	}

}
