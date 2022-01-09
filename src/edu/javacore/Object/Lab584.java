package edu.javacore.Object;

public class Lab584 {
	public static void main(String[] args) {
		System.out.println("Main: " + Hello43.a);
	}
}

class Hello43 {
	static int a;
	static {
		final int b = 20;
		System.out.println(a);
		System.out.println(b);
	}
}
