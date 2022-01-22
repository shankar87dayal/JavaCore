package edu.javacore.Inheritance;

public class Lab846 {
	public static void main(String[] args) {
		new Ba4(10);
	}
}

class Ab4 {
	Ab4() {
		System.out.println("A->D.Cons.");
	}
}

class Ba4 extends Ab4 {
	Ba4() {
		System.out.println("B-> Dc.");
	}

	Ba4(int a) {
		this();
		System.out.println("B (int)");
	}
}
