package edu.javacore.This;

public class Lab640 {
	public static void main(String[] args) {
		System.out.println("Main: " + Heiii.b);
	}
}

class Heiii {
	static {
		Heiii.b = 10;
	}
	static int b = 90;
}
