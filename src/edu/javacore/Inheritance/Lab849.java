package edu.javacore.Inheritance;

public class Lab849 {
	public static void main(String[] args) {
		new Ba7(10);
	}
}

class Ab7 {
	Ab7() {
		System.out.println("A->D.Cons.");
	}
}

class Ba7 extends Ab7 {
	Ba7() {
		System.out.println("B-> Dc.");
	}

	Ba7(int a) {
		this();
		super();
		System.out.println("B (int)");
	}
}
