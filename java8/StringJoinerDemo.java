package java8;

import java.util.StringJoiner;

public class StringJoinerDemo {
	
	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("-");
		sj.add("abc");
		sj.add("kdf");
		sj.add("edc");
		
		System.out.println(sj);
		
		StringJoiner sj2 = new StringJoiner("-","(",")");
		sj.add("abc");
		sj.add("kdf");
		sj.add("edc");
		
		System.out.println(sj2);
	}

}
