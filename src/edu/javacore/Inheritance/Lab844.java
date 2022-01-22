package edu.javacore.Inheritance;

public class Lab844 {
	public static void main(String[] args) {
		new Ba2();
	}
}

class Ab2 {
	Ab2(int a) {
		System.out.println("A(int) Cons.");
	}
}

class Ba2 extends Ab2 {
	Ba2() {
		super(10);
		System.out.println("B-> Dc.");
	}
}
