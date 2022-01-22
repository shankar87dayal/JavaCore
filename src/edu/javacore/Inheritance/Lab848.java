package edu.javacore.Inheritance;

public class Lab848 {
	public static void main(String[] args) {
		new Ba6(10);
	}
}

class Ab6 {
	Ab6() {
		System.out.println("A->D.Cons.");
	}
}

class Ba6 extends Ab6 {
	Ba6() {
		System.out.println("B-> Dc.");
	}

	Ba6(int a) {
		super();
		this();
		System.out.println("B (int)");
	}
}
