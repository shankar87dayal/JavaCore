package edu.javacore.Object;

public class Lab583 {
	public static void main(String[] args) {
		System.out.println("Main: " + Hello42.a);
	}
}

class Hello42 {
	static int a;
	static {
		static int b;
		System.out.println(a);
		System.out.println(b);
	}
}