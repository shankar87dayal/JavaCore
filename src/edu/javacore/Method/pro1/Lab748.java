package edu.javacore.Method.pro1;

public class Lab748 {
	public static void main(String[] args) {
		Hai2 hai = new Hai2();
		hai.a = 99;
		Hello3 hello = new Hello3();
		System.out.println("Main Begin: " + hai.a);
		hello.m1(hai.a);
		System.out.println("Main ends: " + hai.a);
	}
}

class Hello3 {
	void m1(int a) {
		System.out.println("m1 Begin: " + a);
		 a = a + 10;
		System.out.println("m1 ends: " + a);
	}
}

class Hai2 {
	int a;
}
