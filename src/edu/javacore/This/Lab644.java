package edu.javacore.This;

public class Lab644 {
	public static void main(String[] args) {
		System.out.println("Main: " + Hello23.b);
	}
}

class Hello23 {
	static {
		System.out.println("SB1: " + Hello23.b);
	}
	static int b = 20;
	static {
		System.out.println("SB2: " +Hello23.b);
	}
}
