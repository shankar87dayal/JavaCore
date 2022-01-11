package edu.javacore.This;

public class Lab645 {
	public static void main(String[] args) {
		System.out.println("Main: " + Hello24.b);
	}
}

class Hello24 {
	static int a = 10;
	static {
		System.out.println("SB1: " + a);
		System.out.println("SB1: " + b);
	}
	static int b = 20;
	static {
		System.out.println("SB2: " + a);
		System.out.println("SB2: " + b);
	}
}
