package edu.javacore.Method.pro1;

public class Lab745 {
	public static void main(String[] args) {
		int a = 99;
		Hello h = new Hello();
		System.out.println("Main Begin: " + a);
		h.m1(a);
		System.out.println("Main ends: " + a);
	}
}

class Hello {
	void m1(int a) {
		System.out.println("m1 Begin: " + a);
		a = a + 10;
		System.out.println("m1 ends: " + a);
	}
}