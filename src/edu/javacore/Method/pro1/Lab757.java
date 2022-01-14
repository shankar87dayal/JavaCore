package edu.javacore.Method.pro1;

public class Lab757 {
	public static void main(String[] args) {
		Hello12 h = new Hello12();
		h.m1();
	}
}

class Hello12 {
	void m1(int... a) {
		System.out.println("m1(int...)");

	}

	void m1(String... a) {
		System.out.println("m1(String...)");

	}
}
