package edu.javacore.Inheritance;

public class Lab824 {
	public static void main(String[] args) {
		new B11();

	}
}

class A11 {
	A11() {
		System.out.println("A->D.c.");
	}
}

class B11 extends A11 {
	B11() {
		System.out.println("B-> D.C.");
	}
}
