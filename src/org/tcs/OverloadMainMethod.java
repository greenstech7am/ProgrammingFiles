package org.tcs;

public class OverloadMainMethod {
	
	
	//JVM -- main(String[]arg) -- public static void
	public static void main(String[] args) {
		System.out.println("Main Method 1");
		main(23);
		main("greens");
		main(43,87);
		
	}
	
	public static void main(int a) {
		System.out.println("Main method 2");
	}
	
	public static void main(String name) {
		System.out.println("Main Method 3");
	}
	
	public static void main(int age, int id) {
		System.out.println("Main method 4");
	}

}
