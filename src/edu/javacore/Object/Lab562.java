package edu.javacore.Object;

public class Lab562 {
	public static void main(String[] args) {
		System.out.println("Main: " + Hello20.a);
	}
}

class Hello20 {
	static int a;
	static {
		a = 10;
		System.out.println("initialized: " + a);
	}
}