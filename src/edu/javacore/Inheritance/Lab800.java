package edu.javacore.Inheritance;

public class Lab800 {
	public static void main(String[] args) {
		Hello3 hello = new Hello3();
		hello.m1();
		hello.m2();
	}
}

class Hai3 {
	int a = 99;

	void m1() {
		System.out.println("Hai-> m1: " + a);
		System.out.println("Hai-> m2: " + b);
	}
}

class Hello3 extends Hai3 {
	int b = 98;

	void m2() {
		System.out.println("Hello3-> m1: " + a);
		System.out.println("Hello3-> m2: " + b);
	}
}