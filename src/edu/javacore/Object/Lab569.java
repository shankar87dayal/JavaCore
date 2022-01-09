package edu.javacore.Object;

public class Lab569 {
	public static void main(String[] args) {
		System.out.println("main: " + Hello27.h);
	}
}

class Hello27 {
	static int a;
	int b;
	static {
		a = 10;
		b = 20;
		System.out.println("static Block");
	}
}