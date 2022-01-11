package edu.javacore.This;

public class Lab646 {
	public static void main(String[] args) {
		System.out.println("Main: " + Hello25.b);
	}
}

class Hello25 {
	static int a = 10;
	static {
		System.out.println("SB1: " + a);
		System.out.println("SB1: " + Hello25.b);
	}
	static int b = 20;
	static {
		System.out.println("SB2: " + a);
		System.out.println("SB2: " + b);
	}
}
