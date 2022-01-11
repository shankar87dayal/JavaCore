package edu.javacore.This;

public class Lab643 {
	public static void main(String[] args) {
		System.out.println("Main: " + Hello22.b);
	}
}

class Hello22 {
	static {
		System.out.println("SB1: " + Hello22.b);
	}
	static int b = 20;
	static {
		System.out.println("SB2: " + b);
	}

}
