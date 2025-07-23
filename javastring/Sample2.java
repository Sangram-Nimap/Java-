package javastring;

public class Sample2 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "World";
		System.out.println(s1.concat(s2));
		System.out.println(s1);
		// string are immutable in java 
		s1 = s1.concat(s2);
		System.out.println(s1);
	}

}
