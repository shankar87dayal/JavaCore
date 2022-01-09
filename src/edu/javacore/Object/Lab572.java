package edu.javacore.Object;

public class Lab572 {
	public static void main(String[] args) {
		System.out.println("\n Main: " + Hello30.a);
	}
}

class Hello30 {
	static int a;
	static {
		System.out.println("Sib1");
	}
	static {
		System.out.println("Sib2");
	}
}