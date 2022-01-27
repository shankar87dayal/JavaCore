package edu.javacore.polymorphism;

public class Lab938 {
	public static void main(String[] args) {
		B3 bobj = new B3();
		bobj.x = "Hello";
		System.out.println(bobj.x);
	}
}

class A3 {
	int x = 10;
}

class B3 extends A3 {
	String x = "Ravi";
}
