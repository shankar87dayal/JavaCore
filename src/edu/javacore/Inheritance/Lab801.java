package edu.javacore.Inheritance;

public class Lab801 {
	public static void main(String[] args) {
		Hello4 hello = new Hello4();
		hello.m1();
		hello.m2();
	}
}

class Hai4 {
	int a = 99;

	void m1() {
		System.out.println("Hai-> m1: " + a);
	}
}

class Hello4 extends Hai4 {
	int b = 98;

	void m2() {
		System.out.println("Hello3-> m2: " + a);
		System.out.println("Hello3-> m2: " + b);
	}
}
