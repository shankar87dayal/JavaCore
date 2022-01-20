package edu.javacore.Inheritance;

public class Lab823 {
	public static void main(String[] args) {
		new A10();

	}
}

class A10 {
	A10() {
		System.out.println("A->D.c.");
	}
}

class B10 extends A10 {
	B10() {
		System.out.println("B-> D.C.");
	}
}