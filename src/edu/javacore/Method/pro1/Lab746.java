package edu.javacore.Method.pro1;

public class Lab746 {
	public static void main(String[] args) {
		Hai hai = new Hai();
		hai.a = 99;
		Hello1 hello = new Hello1();
		System.out.println("Main Begin: " + hai.a);
		hello.m1(hai);
		System.out.println("Main ends: " + hai.a);
	}
}

class Hello1 {
	void m1(Hai hai) {
		System.out.println("m1 Begin: " + hai.a);
		hai.a = hai.a + 10;
		System.out.println("m1 ends: " + hai.a);
	}
}

class Hai {
	int a;
}

