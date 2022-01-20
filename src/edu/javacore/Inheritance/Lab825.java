package edu.javacore.Inheritance;

public class Lab825 {
	public static void main(String[] args) {
		new C11();

	}
}

class A12 {
	A12() {
		System.out.println("A->D.c.");
	}
}

class B12 extends A12 {
	B12() {
		System.out.println("B-> D.C.");
	}
}

class C11 extends B12 {
	C11() {
		System.out.println("C-> D.C.");
	}
}
