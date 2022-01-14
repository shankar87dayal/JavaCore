package edu.javacore.Method.pro1;

public class Lab747 {
	public static void main(String[] args) {
		Hai1 hai = new Hai1();
		hai.a = 99;
		Hello2 hello = new Hello2();
		System.out.println("Main Begin: " + hai.a);
		hello.m1(hai);
		System.out.println("Main ends: " + hai.a);
	}
}

class Hello2 {
	void m1(Hai1 hai) {
		System.out.println("m1 Begin: " + hai.a);
		hai = new Hai1();
		hai.a = hai.a + 10;
		System.out.println("m1 ends: " + hai.a);
	}
}

class Hai1 {
	int a;
}
