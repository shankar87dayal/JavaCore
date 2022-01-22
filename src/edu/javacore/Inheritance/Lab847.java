package edu.javacore.Inheritance;

public class Lab847 {
	public static void main(String[] args) {
		new Ba5(10);
	}
}

class Ab5 {
	Ab5() {
		System.out.println("A->D.Cons.");
	}
}

class Ba5 extends Ab5 {
	Ba5() {
		System.out.println("B-> Dc.");
	}

	Ba5(int a) {
		super();
		System.out.println("B (int)");
	}
}
