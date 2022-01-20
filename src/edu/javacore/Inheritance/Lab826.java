package edu.javacore.Inheritance;

public class Lab826 {
	public static void main(String[] args) {
		new C12();

	}
}

class A13 {
	A13() {
		System.out.println("A->D.c.");
	}
	static {
		System.out.println("A-> S.B");
	}
	{
		System.out.println("A->I.B");
	}
}

class B13 extends A13 {
	B13() {
		System.out.println("B-> D.C.");
	}
	static {
		System.out.println("B-> S.B");
	}
	{
		System.out.println("B->I.B");
	}
}

class C12 extends B13 {
	C12() {
		System.out.println("C-> D.C.");
	}
	static {
		System.out.println("C-> S.B");
	}
	{
		System.out.println("C->I.B");
	}
}
